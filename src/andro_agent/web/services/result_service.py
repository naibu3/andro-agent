from __future__ import annotations

import json
import logging
import re
import zipfile
from collections import Counter
from html import escape
from pathlib import Path
from typing import Any

from andro_agent.domain.adapters.security_artifacts import (
    artifacts_to_web_dicts,
    scan_case_artifacts,
)
from andro_agent.domain.adapters.security_evidence import attach_evidence_to_finding_dicts
from andro_agent.domain.adapters.security_findings import (
    canonicalize_finding,
    finding_to_web_dict,
)
from andro_agent.web.services.report_rendering import render_structured_report_markdown


IGNORED_HTTP_PREFIXES = (
    "http://schemas.android.com/",
    "http://www.w3.org/",
    "http://xmlpull.org/",
    "http://java.sun.com/",
    "http://apache.org/",
    "http://www.slf4j.org/",
)

VENDOR_PATH_MARKERS = (
    "/androidx/",
    "/com/google/android/material/",
    "/kotlin/",
    "/kotlinx/",
    "/okio/",
    "/okhttp3/",
    "/retrofit2/",
    "/org/intellij/",
)

SEVERITY_ORDER = {
    "critical": 0,
    "high": 1,
    "medium": 2,
    "low": 3,
    "info": 4,
    "unknown": 5,
}

logger = logging.getLogger(__name__)


def read_json(path: Path) -> Any:
    return json.loads(path.read_text(encoding="utf-8"))


def read_json_if_exists(path: str | Path | None, default: Any) -> Any:
    if not path:
        return default

    target = Path(path)

    if not target.exists():
        return default

    try:
        return read_json(target)
    except json.JSONDecodeError:
        return default


def read_text_if_exists(path: str | Path | None) -> str:
    if not path:
        return ""

    target = Path(path)

    if not target.exists():
        return ""

    return target.read_text(encoding="utf-8")


def load_case_state(artifacts_dir: str | Path, case_id: str) -> dict[str, Any]:
    state_path = Path(artifacts_dir) / case_id / "case_state.json"

    if not state_path.exists():
        return {}

    return read_json_if_exists(state_path, {})


def load_evidence_for_case(state: dict[str, Any]) -> list[dict[str, Any]]:
    case_dir = _safe_case_artifacts_dir(state)

    if not case_dir:
        return []

    evidence_path = case_dir / "evidence" / "evidence.json"

    if not evidence_path.exists():
        return []

    try:
        evidence = read_json(evidence_path)
    except (OSError, UnicodeError, json.JSONDecodeError) as exc:
        logger.warning(
            "Could not parse evidence JSON for case %s: %s",
            state.get("case_id"),
            exc,
        )
        return []

    if not isinstance(evidence, list):
        logger.warning(
            "Evidence JSON for case %s does not contain a list",
            state.get("case_id"),
        )
        return []

    return [item for item in evidence if isinstance(item, dict)]


def evidence_lookup_by_id(
    evidence: list[dict[str, Any]],
) -> dict[str, dict[str, Any]]:
    return {
        str(item["evidence_id"]): item
        for item in evidence
        if item.get("evidence_id")
    }


def attach_evidence_to_web_findings(
    findings: list[dict[str, Any]],
    evidence: list[dict[str, Any]],
) -> list[dict[str, Any]]:
    evidence_by_id = evidence_lookup_by_id(evidence)
    attached: list[dict[str, Any]] = []

    for finding in findings:
        item = dict(finding)
        evidence_ids = item.get("evidence_ids")
        requested_ids = evidence_ids if isinstance(evidence_ids, list) else []
        normalized_ids = [str(evidence_id) for evidence_id in requested_ids]
        item["linked_evidence"] = [
            evidence_by_id[evidence_id]
            for evidence_id in normalized_ids
            if evidence_id in evidence_by_id
        ]
        item["missing_evidence_ids"] = [
            evidence_id
            for evidence_id in normalized_ids
            if evidence_id not in evidence_by_id
        ]
        attached.append(item)

    return attached


def extract_package_name_from_state(state: dict[str, Any]) -> str | None:
    candidates = [
        state.get("package_name"),
    ]

    manifest = read_json_if_exists(state.get("manifest_json_path"), {})
    facts = read_json_if_exists(state.get("facts_path"), {})

    if isinstance(manifest, dict):
        candidates.extend(
            [
                manifest.get("package"),
                manifest.get("package_name"),
                manifest.get("application_id"),
            ]
        )

    if isinstance(facts, dict):
        candidates.extend(
            [
                facts.get("package"),
                facts.get("package_name"),
                facts.get("application_id"),
            ]
        )

        metadata = facts.get("metadata")
        if isinstance(metadata, dict):
            candidates.extend(
                [
                    metadata.get("package"),
                    metadata.get("package_name"),
                    metadata.get("application_id"),
                ]
            )

    for candidate in candidates:
        if isinstance(candidate, str) and candidate.strip():
            return candidate.strip()

    return None


def extract_artifacts(case_dir: Path) -> list[dict[str, str]]:
    if not case_dir.exists():
        return []

    allowed_suffixes = {
        ".json",
        ".txt",
        ".md",
        ".xml",
        ".log",
    }

    artifacts: list[dict[str, str]] = []

    for path in sorted(case_dir.rglob("*")):
        if not path.is_file():
            continue

        if path.suffix.lower() not in allowed_suffixes:
            continue

        relative = path.relative_to(case_dir).as_posix()

        artifacts.append(
            {
                "name": path.name,
                "relative_path": relative,
                "size": str(path.stat().st_size),
                "suffix": path.suffix.lower(),
            }
        )

    return artifacts


def safe_final_artifacts(case_dir: Path) -> list[Path]:
    if not case_dir.exists():
        return []

    case_root = case_dir.resolve()

    allowed_suffixes = {
        ".json",
        ".txt",
        ".md",
        ".xml",
        ".log",
    }
    excluded_dirs = {
        "__pycache__",
        ".pytest_cache",
        ".venv",
        "venv",
        "env",
        ".env",
        "cache",
        ".cache",
        "tmp",
        "temp",
        "temporary",
    }
    excluded_names = {
        "bundle.zip",
        "case_state.json",
    }

    artifacts: list[Path] = []

    for path in sorted(case_dir.rglob("*")):
        if path.is_symlink():
            continue

        if not path.is_file():
            continue

        resolved_path = path.resolve()

        try:
            resolved_path.relative_to(case_root)
        except ValueError:
            continue

        relative = path.relative_to(case_dir)
        parts = set(relative.parts)

        if parts & excluded_dirs:
            continue

        if path.name in excluded_names:
            continue

        if path.name.endswith((".tmp", ".temp", ".bak")):
            continue

        if path.suffix.lower() not in allowed_suffixes:
            continue

        artifacts.append(path)

    return artifacts


def render_report_html(report_md: str) -> str:
    if not report_md:
        return ""

    escaped_report = escape(report_md)

    try:
        import markdown

        return markdown.markdown(
            escaped_report,
            extensions=["tables", "fenced_code", "toc"],
        )
    except Exception:
        return f"<pre>{escaped_report}</pre>"


def final_report_markdown(
    *,
    case: dict[str, Any],
    state: dict[str, Any],
    findings: list[dict[str, Any]],
    evidence: list[dict[str, Any]] | None = None,
) -> str:
    report_md = read_text_if_exists(state.get("static_report_path"))
    structured_findings, structured_evidence = _structured_report_inputs(
        state=state,
        fallback_findings=findings,
        fallback_evidence=evidence,
    )

    if structured_findings and structured_evidence:
        return render_structured_report_markdown(
            case=case,
            state=state,
            findings=structured_findings,
            evidence=structured_evidence,
        )

    if should_use_fallback_report(report_md, findings):
        report_md = build_fallback_report_markdown(
            case=case,
            state=state,
            findings=findings,
        )

    return report_md


def write_final_download_files(
    *,
    case_dir: Path,
    case: dict[str, Any],
    state: dict[str, Any],
    findings: list[dict[str, Any]],
) -> dict[str, Path]:
    downloads_dir = case_dir / "downloads"
    downloads_dir.mkdir(parents=True, exist_ok=True)

    findings_path = downloads_dir / "findings.json"
    report_md_path = downloads_dir / "report.md"
    report_html_path = downloads_dir / "report.html"
    download_findings, evidence = _collect_findings_and_evidence_for_downloads(
        state=state,
        fallback_findings=findings,
    )

    report_md = final_report_markdown(
        case=case,
        state=state,
        findings=download_findings,
        evidence=evidence,
    )
    report_html = render_report_html(report_md)
    evidence_path = write_evidence_json_if_possible(state=state, evidence=evidence)

    findings_path.write_text(
        json.dumps(download_findings, indent=2, ensure_ascii=False, default=str),
        encoding="utf-8",
    )
    report_md_path.write_text(report_md, encoding="utf-8")
    report_html_path.write_text(report_html, encoding="utf-8")
    artifacts_path = write_artifacts_json_if_possible(
        case_dir=case_dir,
        case_id=str(case.get("id") or state.get("case_id") or ""),
    )

    paths = {
        "findings": findings_path,
        "report_md": report_md_path,
        "report_html": report_html_path,
    }

    if evidence_path:
        paths["evidence"] = evidence_path
    if artifacts_path:
        paths["artifacts"] = artifacts_path

    return paths


def build_download_bundle(
    *,
    case_dir: Path,
    case: dict[str, Any],
    state: dict[str, Any],
    findings: list[dict[str, Any]],
) -> Path:
    case_root = case_dir.resolve()
    paths = write_final_download_files(
        case_dir=case_dir,
        case=case,
        state=state,
        findings=findings,
    )
    bundle_path = case_dir / "downloads" / "bundle.zip"

    with zipfile.ZipFile(bundle_path, "w", compression=zipfile.ZIP_DEFLATED) as bundle:
        bundle.write(paths["findings"], "findings.json")
        bundle.write(paths["report_md"], "report.md")
        bundle.write(paths["report_html"], "report.html")

        if paths.get("evidence"):
            bundle.write(paths["evidence"], "evidence/evidence.json")
        if paths.get("artifacts"):
            bundle.write(paths["artifacts"], "artifacts/artifacts.json")

        for artifact_path in safe_final_artifacts(case_dir):
            if artifact_path in paths.values():
                continue

            resolved_artifact = artifact_path.resolve()

            try:
                relative = resolved_artifact.relative_to(case_root).as_posix()
            except ValueError:
                continue

            if relative.startswith("downloads/"):
                continue

            if relative == "evidence/evidence.json":
                continue

            bundle.write(resolved_artifact, f"artifacts/{relative}")

    return bundle_path


def normalize_findings(
    raw: Any,
    source: str,
    *,
    state: dict[str, Any] | None = None,
) -> list[dict[str, Any]]:
    if isinstance(raw, dict):
        values = raw.get("findings", [])
    else:
        values = raw

    if not isinstance(values, list):
        return []

    normalized: list[dict[str, Any]] = []
    case_id = str((state or {}).get("case_id") or "unknown")

    for index, item in enumerate(values):
        if not isinstance(item, dict):
            continue

        finding = dict(item)

        finding.setdefault("source", source)
        finding.setdefault("severity", finding.get("level", "info"))

        if not any(finding.get(key) for key in ("title", "name", "issue", "check")):
            finding["title"] = finding.get("rule_id", finding.get("id", "Finding"))

        if not any(
            finding.get(key) for key in ("description", "details", "message", "rationale")
        ):
            finding["description"] = finding.get("summary", "")

        finding["severity"] = str(finding.get("severity") or "info").lower()
        finding["source"] = str(finding.get("source") or source)
        finding["category"] = finding.get("category") or infer_category(finding)

        evidence = finding.get("evidence", [])
        finding["evidence"] = normalize_evidence(evidence, state=state)
        finding["description"] = normalize_description(
            str(finding.get("description") or ""),
            state=state,
        )

        canonical = canonicalize_finding(finding, case_id=case_id, source=source, index=index)
        web_finding = finding_to_web_dict(canonical)

        if is_noise_finding(web_finding):
            continue

        normalized.append(web_finding)

    return normalized


def normalize_findings_with_evidence(
    raw: Any,
    source: str,
    *,
    state: dict[str, Any] | None = None,
) -> tuple[list[dict[str, Any]], list[dict[str, Any]]]:
    findings = normalize_findings(raw, source, state=state)
    case_id = str((state or {}).get("case_id") or "unknown")
    return attach_evidence_to_finding_dicts(findings, case_id=case_id, source=source)


def collect_findings_from_state(state: dict[str, Any]) -> list[dict[str, Any]]:
    return collect_findings_and_evidence_from_state(state)[0]


def collect_findings_and_evidence_from_state(
    state: dict[str, Any],
) -> tuple[list[dict[str, Any]], list[dict[str, Any]]]:
    manifest_findings, manifest_evidence = normalize_findings_with_evidence(
        read_json_if_exists(state.get("findings_path"), []),
        "manifest",
        state=state,
    )
    code_findings, code_evidence = normalize_findings_with_evidence(
        read_json_if_exists(state.get("code_findings_path"), []),
        "code",
        state=state,
    )
    correlated_findings, correlated_evidence = normalize_findings_with_evidence(
        read_json_if_exists(state.get("correlated_findings_path"), []),
        "correlation",
        state=state,
    )

    findings = manifest_findings + code_findings + correlated_findings
    evidence = manifest_evidence + code_evidence + correlated_evidence

    return sorted_findings(deduplicate_findings(findings)), deduplicate_evidence(evidence)


def _collect_findings_and_evidence_for_downloads(
    *,
    state: dict[str, Any],
    fallback_findings: list[dict[str, Any]],
) -> tuple[list[dict[str, Any]], list[dict[str, Any]]]:
    if not state:
        return fallback_findings, []

    findings, evidence = collect_findings_and_evidence_from_state(state)
    return (findings or fallback_findings), evidence


def _structured_report_inputs(
    *,
    state: dict[str, Any],
    fallback_findings: list[dict[str, Any]],
    fallback_evidence: list[dict[str, Any]] | None,
) -> tuple[list[dict[str, Any]], list[dict[str, Any]]]:
    if fallback_findings and fallback_evidence:
        return fallback_findings, fallback_evidence

    evidence_path = _safe_case_artifacts_dir(state)
    if evidence_path:
        existing_evidence = read_json_if_exists(evidence_path / "evidence" / "evidence.json", [])
        if fallback_findings and isinstance(existing_evidence, list) and existing_evidence:
            return fallback_findings, existing_evidence

    if state:
        findings, evidence = collect_findings_and_evidence_from_state(state)
        if findings and evidence:
            return findings, evidence

    return fallback_findings, fallback_evidence or []


def deduplicate_evidence(evidence: list[dict[str, Any]]) -> list[dict[str, Any]]:
    result: list[dict[str, Any]] = []
    seen: set[str] = set()

    for item in evidence:
        evidence_id = str(item.get("evidence_id") or "")

        if not evidence_id or evidence_id in seen:
            continue

        seen.add(evidence_id)
        result.append(item)

    return result


def write_evidence_json_if_possible(
    *,
    state: dict[str, Any],
    evidence: list[dict[str, Any]],
) -> Path | None:
    if not evidence:
        return None

    case_dir = _safe_case_artifacts_dir(state)

    if not case_dir:
        return None

    try:
        evidence_dir = case_dir / "evidence"
        evidence_dir.mkdir(parents=True, exist_ok=True)
        evidence_path = evidence_dir / "evidence.json"
        evidence_path.write_text(
            json.dumps(evidence, indent=2, ensure_ascii=False, default=str),
            encoding="utf-8",
        )
        return evidence_path
    except OSError as exc:
        logger.warning("Could not write evidence JSON for case %s: %s", state.get("case_id"), exc)
        return None


def write_artifacts_json_if_possible(
    *,
    case_dir: Path,
    case_id: str,
) -> Path | None:
    if not case_id or not case_dir.is_dir() or case_dir.is_symlink():
        return None

    try:
        artifacts = scan_case_artifacts(case_dir, case_id=case_id)
        artifacts_dir = case_dir / "artifacts"
        artifacts_dir.mkdir(parents=True, exist_ok=True)
        artifacts_path = artifacts_dir / "artifacts.json"
        artifacts_path.write_text(
            json.dumps(
                artifacts_to_web_dicts(artifacts),
                indent=2,
                ensure_ascii=False,
                default=str,
            ),
            encoding="utf-8",
        )
        return artifacts_path
    except (OSError, ValueError) as exc:
        logger.warning("Could not write artifact registry for case %s: %s", case_id, exc)
        return None


def _safe_case_artifacts_dir(state: dict[str, Any]) -> Path | None:
    case_id = state.get("case_id")

    if not isinstance(case_id, str) or not case_id.strip():
        return None

    case_dir = infer_case_artifacts_dir(state)

    if not case_dir:
        return None

    if case_dir.name != case_id:
        return None

    return case_dir


def deduplicate_findings(findings: list[dict[str, Any]]) -> list[dict[str, Any]]:
    seen: set[tuple[str, str, str, str]] = set()
    result: list[dict[str, Any]] = []

    for finding in findings:
        evidence = finding.get("evidence")

        evidence_key = ""
        if isinstance(evidence, list) and evidence:
            first = evidence[0]
            if isinstance(first, dict):
                evidence_key = str(
                    first.get("relative_path")
                    or first.get("key")
                    or first.get("line_text")
                    or ""
                )

        key = (
            str(finding.get("title", "")),
            str(finding.get("severity", "")),
            str(finding.get("source", "")),
            evidence_key,
        )

        if key in seen:
            continue

        seen.add(key)
        result.append(finding)

    return result


def sorted_findings(findings: list[dict[str, Any]]) -> list[dict[str, Any]]:
    return sorted(
        findings,
        key=lambda item: (
            SEVERITY_ORDER.get(str(item.get("severity", "unknown")).lower(), 99),
            str(item.get("category") or ""),
            str(item.get("title") or ""),
        ),
    )


def severity_summary(findings: list[dict[str, Any]]) -> dict[str, int]:
    counter = Counter(str(finding.get("severity", "unknown")).lower() for finding in findings)

    return {
        "critical": counter.get("critical", 0),
        "high": counter.get("high", 0),
        "medium": counter.get("medium", 0),
        "low": counter.get("low", 0),
        "info": counter.get("info", 0),
        "total": len(findings),
    }


def category_summary(findings: list[dict[str, Any]]) -> dict[str, int]:
    counter = Counter(str(finding.get("category") or "uncategorized") for finding in findings)
    return dict(counter.most_common())


def normalize_evidence(
    evidence: Any,
    *,
    state: dict[str, Any] | None = None,
) -> Any:
    if isinstance(evidence, list):
        return [normalize_evidence(item, state=state) for item in evidence]

    if isinstance(evidence, dict):
        normalized = {}

        for key, value in evidence.items():
            if isinstance(value, str):
                normalized[key] = normalize_path_or_text(value, state=state)
            else:
                normalized[key] = normalize_evidence(value, state=state)

        raw_key = normalized.get("key")
        if isinstance(raw_key, str):
            normalized["relative_path"] = normalize_path_or_text(raw_key, state=state)

        return normalized

    if isinstance(evidence, str):
        return normalize_path_or_text(evidence, state=state)

    return evidence


def normalize_description(description: str, *, state: dict[str, Any] | None = None) -> str:
    return normalize_path_or_text(description, state=state)


def normalize_path_or_text(value: str, *, state: dict[str, Any] | None = None) -> str:
    if not state:
        return value

    replacements = []

    for key in (
        "jadx_output_dir",
        "apk_path",
        "manifest_json_path",
        "facts_path",
        "findings_path",
        "code_search_results_path",
        "code_facts_path",
        "code_findings_path",
        "static_analysis_bundle_path",
        "static_report_path",
    ):
        raw_path = state.get(key)

        if raw_path:
            path = Path(raw_path)
            replacements.append((str(path), path.name))

    artifacts_root = infer_case_artifacts_dir(state)
    if artifacts_root:
        replacements.append((str(artifacts_root), "."))

    normalized = value

    for absolute, replacement in replacements:
        normalized = normalized.replace(absolute, replacement)

    normalized = normalized.replace("./jadx/", "jadx/")
    normalized = normalized.replace("./", "")

    return normalized


def infer_case_artifacts_dir(state: dict[str, Any]) -> Path | None:
    for key in (
        "static_report_path",
        "static_analysis_bundle_path",
        "code_findings_path",
        "findings_path",
        "manifest_json_path",
    ):
        raw_path = state.get(key)

        if not raw_path:
            continue

        path = Path(raw_path)

        if key == "static_report_path":
            return path.parent.parent

        if key == "static_analysis_bundle_path":
            return path.parent.parent

        if key in {"code_findings_path", "findings_path"}:
            return path.parent.parent

        if key == "manifest_json_path":
            return path.parent.parent

    return None


def infer_category(finding: dict[str, Any]) -> str:
    title = str(finding.get("title") or "").lower()
    description = str(finding.get("description") or "").lower()

    text = f"{title} {description}"

    if "exported" in text:
        return "attack_surface"

    if "webview" in text:
        return "webview"

    if "sql" in text or "rawquery" in text or "execsql" in text:
        return "sql"

    if "runtime" in text or "command" in text or "exec" in text:
        return "command_execution"

    if "sharedpreferences" in text or "fileoutputstream" in text or "storage" in text:
        return "storage"

    if "http" in text or "cleartext" in text or "network" in text:
        return "network"

    if "cipher" in text or "crypto" in text or "base64" in text:
        return "crypto"

    return "uncategorized"


def is_noise_finding(finding: dict[str, Any]) -> bool:
    title = str(finding.get("title") or "").lower()
    category = str(finding.get("category") or "").lower()
    evidence_text = json.dumps(finding.get("evidence", ""), ensure_ascii=False).lower()

    if "hardcoded http" in title or category == "network":
        if any(prefix in evidence_text for prefix in IGNORED_HTTP_PREFIXES):
            return True

    if finding.get("severity") == "low":
        if any(marker in evidence_text for marker in VENDOR_PATH_MARKERS):
            return True

    if "fileoutputstream" in title.lower():
        if any(marker in evidence_text for marker in VENDOR_PATH_MARKERS):
            return True

    if "sharedpreferences" in title.lower():
        if any(marker in evidence_text for marker in VENDOR_PATH_MARKERS):
            return True

    return False


def should_use_fallback_report(report_md: str, findings: list[dict[str, Any]]) -> bool:
    if not report_md.strip():
        return True

    if not findings:
        return False

    lowered = report_md.lower()

    no_risk_markers = (
        "no se identificaron riesgos",
        "no se detectaron vulnerabilidades",
        "no se encontraron correlaciones",
        "no hay evidencias",
        "no proporcionó resultados",
    )

    return any(marker in lowered for marker in no_risk_markers)


def build_fallback_report_markdown(
    *,
    case: dict[str, Any],
    state: dict[str, Any],
    findings: list[dict[str, Any]],
) -> str:
    summary = severity_summary(findings)
    categories = category_summary(findings)
    package_name = case.get("package_name") or extract_package_name_from_state(state) or "N/A"
    analysis_profile = (
        state.get("analysis_profile") or case.get("analysis_profile") or "N/A"
    )

    high_priority = [
        finding
        for finding in findings
        if str(finding.get("severity", "")).lower() in {"critical", "high"}
    ][:10]

    medium_priority = [
        finding
        for finding in findings
        if str(finding.get("severity", "")).lower() == "medium"
    ][:10]

    lines = [
        "# Informe de Análisis Estático",
        "",
        "## Resumen ejecutivo",
        "",
        f"Se analizaron los artefactos estáticos del APK **{case.get('filename', 'N/A')}**.",
        f"Package detectado: `{package_name}`.",
        f"Perfil de análisis: `{analysis_profile}`.",
        "",
        "El análisis identificó findings de seguridad que deben priorizarse según severidad y evidencia.",
        "",
        "## Resumen por severidad",
        "",
        f"- Critical: **{summary['critical']}**",
        f"- High: **{summary['high']}**",
        f"- Medium: **{summary['medium']}**",
        f"- Low: **{summary['low']}**",
        f"- Total: **{summary['total']}**",
        "",
        "## Categorías detectadas",
        "",
    ]

    if categories:
        for category, count in categories.items():
            lines.append(f"- `{category}`: **{count}**")
    else:
        lines.append("- No se detectaron categorías.")

    lines.extend(
        [
            "",
            "## Riesgos prioritarios",
            "",
        ]
    )

    if high_priority:
        for finding in high_priority:
            lines.extend(format_finding_for_report(finding))
    else:
        lines.append("- No se detectaron findings de severidad alta o crítica.")

    lines.extend(
        [
            "",
            "## Findings medios relevantes",
            "",
        ]
    )

    if medium_priority:
        for finding in medium_priority:
            lines.extend(format_finding_for_report(finding))
    else:
        lines.append("- No se detectaron findings de severidad media.")

    lines.extend(
        [
            "",
            "## Siguientes pasos recomendados",
            "",
            "1. Revisar manualmente los findings de severidad alta.",
            "2. Confirmar si los componentes exportados requieren permisos o restricciones adicionales.",
            "3. Validar dinámicamente los componentes exportados mediante intents controlados.",
            "4. Revisar sinks sensibles como `Runtime.exec`, `WebView.loadUrl`, `rawQuery` y `execSQL`.",
            "5. Reducir falsos positivos separando código propio y librerías de terceros.",
            "6. Asociar findings con MASVS/CWE para mejorar la trazabilidad del informe.",
        ]
    )

    return "\n".join(lines)


def format_finding_for_report(finding: dict[str, Any]) -> list[str]:
    title = finding.get("title") or "Finding"
    severity = finding.get("severity") or "unknown"
    category = finding.get("category") or "uncategorized"
    description = finding.get("description") or "Sin descripción."

    evidence_line = extract_evidence_line(finding.get("evidence"))

    lines = [
        f"### {title}",
        "",
        f"- Severidad: **{severity}**",
        f"- Categoría: `{category}`",
        f"- Descripción: {description}",
    ]

    if evidence_line:
        lines.append(f"- Evidencia: `{evidence_line}`")

    lines.append("")

    return lines


def extract_evidence_line(evidence: Any) -> str | None:
    if isinstance(evidence, list) and evidence:
        first = evidence[0]
        if isinstance(first, dict):
            metadata = first.get("metadata")
            if isinstance(metadata, dict):
                line_text = metadata.get("line_text")
                line_number = metadata.get("line_number")
                relative_path = first.get("relative_path") or first.get("key")

                if line_text and relative_path:
                    return f"{relative_path}:{line_number} - {line_text}"

                if relative_path:
                    return str(relative_path)

            return str(first.get("relative_path") or first.get("key") or first.get("type"))

    if isinstance(evidence, dict):
        return str(evidence.get("relative_path") or evidence.get("key") or evidence.get("type"))

    if isinstance(evidence, str):
        return evidence

    return None


def safe_json_pretty(value: Any) -> str:
    return json.dumps(value, indent=2, ensure_ascii=False, default=str)
