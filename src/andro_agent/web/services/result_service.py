from __future__ import annotations

import json
import re
from collections import Counter
from pathlib import Path
from typing import Any


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

    for item in values:
        if not isinstance(item, dict):
            continue

        finding = dict(item)

        finding.setdefault("source", source)
        finding.setdefault("severity", finding.get("level", "info"))
        finding.setdefault("title", finding.get("rule_id", finding.get("id", "Finding")))
        finding.setdefault("description", finding.get("summary", ""))

        finding["severity"] = str(finding.get("severity") or "info").lower()
        finding["source"] = str(finding.get("source") or source)
        finding["category"] = finding.get("category") or infer_category(finding)

        evidence = finding.get("evidence", [])
        finding["evidence"] = normalize_evidence(evidence, state=state)
        finding["description"] = normalize_description(
            str(finding.get("description") or ""),
            state=state,
        )

        if is_noise_finding(finding):
            continue

        finding["evidence_pretty"] = json.dumps(
            finding["evidence"],
            indent=2,
            ensure_ascii=False,
            default=str,
        )

        normalized.append(finding)

    return normalized


def collect_findings_from_state(state: dict[str, Any]) -> list[dict[str, Any]]:
    manifest_findings = normalize_findings(
        read_json_if_exists(state.get("findings_path"), []),
        "manifest",
        state=state,
    )
    code_findings = normalize_findings(
        read_json_if_exists(state.get("code_findings_path"), []),
        "code",
        state=state,
    )
    correlated_findings = normalize_findings(
        read_json_if_exists(state.get("correlated_findings_path"), []),
        "correlation",
        state=state,
    )

    findings = manifest_findings + code_findings + correlated_findings

    return sorted_findings(deduplicate_findings(findings))


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
    if not findings:
        return False

    if not report_md.strip():
        return True

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