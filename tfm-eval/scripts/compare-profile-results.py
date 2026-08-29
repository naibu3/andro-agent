#!/usr/bin/env python3

from __future__ import annotations

import argparse
import json
import re
from collections import Counter
from datetime import UTC, datetime
from pathlib import Path
from typing import Any

DETERMINISTIC_PATHS = {
    "manifest": Path("findings/manifest_findings.json"),
    "code": Path("findings/code_findings.json"),
}
REPORT_PATH = Path("report/static_analysis_report.md")
METRICS_PATH = Path("metrics/run_metrics_summary.json")
CANONICAL_FINDINGS_PATH = Path("findings/canonical_findings.json")
CANONICAL_EVIDENCE_PATH = Path("evidence/evidence.json")
STATIC_INVESTIGATION_TRACE_PATH = Path("analysis/static_investigation_trace.json")
LLM_HYPOTHESES_PATH = Path("analysis/llm_hypotheses.json")
LLM_CANDIDATES_PATH = Path("findings/llm_candidate_findings.json")
REASONING_PATHS = {
    "has_manifest_reasoning": Path("analysis/manifest_reasoning.json"),
    "has_code_reasoning": Path("analysis/code_reasoning.json"),
    "has_fused_reasoning": Path("analysis/static_analysis_reasoning.json"),
}
IDENTIFIER_KEYS = ("rule_id", "finding_id", "id", "title", "name", "issue", "check")
SEVERITY_KEYS = ("severity", "level", "risk")
CATEGORY_KEYS = ("category", "type", "source")


def normalize(value: Any, *, lowercase: bool = False) -> str:
    if value is None or isinstance(value, (dict, list)):
        text = "unknown"
    else:
        text = re.sub(r"\s+", " ", str(value).strip()) or "unknown"
    return text.lower() if lowercase else text


def first_value(finding: dict[str, Any], keys: tuple[str, ...]) -> Any:
    for key in keys:
        value = finding.get(key)
        if value is not None and normalize(value) != "unknown":
            return value
    return None


def finding_signature(source: str, finding: dict[str, Any]) -> str:
    identifier = normalize(first_value(finding, IDENTIFIER_KEYS))
    severity = normalize(first_value(finding, SEVERITY_KEYS), lowercase=True)
    category = normalize(first_value(finding, CATEGORY_KEYS), lowercase=True)
    return f"{source}|{identifier}|{severity}|{category}"


def load_json(path: Path, missing: list[str], invalid: list[str]) -> Any:
    if not path.is_file():
        missing.append(path.as_posix())
        return None
    try:
        return json.loads(path.read_text(encoding="utf-8"))
    except (OSError, UnicodeDecodeError, json.JSONDecodeError):
        invalid.append(path.as_posix())
        return None


def finding_list(value: Any) -> list[dict[str, Any]]:
    if isinstance(value, list):
        return [item for item in value if isinstance(item, dict)]
    if isinstance(value, dict):
        for key in ("findings", "results", "items"):
            items = value.get(key)
            if isinstance(items, list):
                return [item for item in items if isinstance(item, dict)]
    return []


def metric_value(metrics: dict[str, Any], key: str, default: Any = None) -> Any:
    summary = metrics.get("summary")
    if isinstance(summary, dict) and key in summary:
        return summary[key]
    return metrics.get(key, default)


def analyze_case(artifacts_dir: Path, profile: str, case_id: str) -> tuple[dict[str, Any], set[str]]:
    case_dir = artifacts_dir / case_id
    missing: list[str] = []
    invalid: list[str] = []

    metrics_value = load_json(case_dir / METRICS_PATH, missing, invalid)
    metrics = metrics_value if isinstance(metrics_value, dict) else {}
    findings_by_source: dict[str, list[dict[str, Any]]] = {}
    signatures: set[str] = set()
    referenced_text: list[str] = []

    for source, relative_path in DETERMINISTIC_PATHS.items():
        path = case_dir / relative_path
        value = load_json(path, missing, invalid)
        findings = finding_list(value)
        findings_by_source[source] = findings
        signatures.update(finding_signature(source, finding) for finding in findings)
        if path.is_file():
            try:
                referenced_text.append(path.read_text(encoding="utf-8"))
            except (OSError, UnicodeDecodeError):
                pass

    report_path = case_dir / REPORT_PATH
    report = ""
    if report_path.is_file():
        try:
            report = report_path.read_text(encoding="utf-8")
            referenced_text.append(report)
        except (OSError, UnicodeDecodeError):
            invalid.append(report_path.as_posix())
    else:
        missing.append(report_path.as_posix())

    canonical_path = case_dir / CANONICAL_FINDINGS_PATH
    canonical_value = load_json(canonical_path, missing, invalid)
    canonical_findings = finding_list(canonical_value)
    if canonical_path.is_file():
        try:
            referenced_text.append(canonical_path.read_text(encoding="utf-8"))
        except (OSError, UnicodeDecodeError):
            pass

    evidence_path = case_dir / CANONICAL_EVIDENCE_PATH
    evidence_value = load_json(evidence_path, missing, invalid)
    evidence_items = (
        [item for item in evidence_value if isinstance(item, dict)]
        if isinstance(evidence_value, list)
        else []
    )
    if evidence_path.is_file():
        try:
            referenced_text.append(evidence_path.read_text(encoding="utf-8"))
        except (OSError, UnicodeDecodeError):
            pass

    trace_value = load_json(case_dir / STATIC_INVESTIGATION_TRACE_PATH, [], invalid)
    trace = trace_value if isinstance(trace_value, dict) else {}
    hypotheses = finding_list(load_json(case_dir / LLM_HYPOTHESES_PATH, [], invalid))
    llm_candidates = finding_list(load_json(case_dir / LLM_CANDIDATES_PATH, [], invalid))
    trace_tool_calls = trace.get("tool_calls") if isinstance(trace.get("tool_calls"), list) else []
    trace_termination = str(trace.get("termination_reason") or "disabled")

    evidence_files = []
    if case_dir.is_dir():
        evidence_files = sorted(
            path.relative_to(case_dir).as_posix()
            for path in case_dir.rglob("*")
            if path.is_file() and "evidence" in path.relative_to(case_dir).as_posix().lower()
        )

    all_findings = findings_by_source["manifest"] + findings_by_source["code"]
    severities = Counter(
        normalize(first_value(finding, SEVERITY_KEYS), lowercase=True)
        for finding in all_findings
    )
    summary = {
        "profile": profile,
        "case_id": case_id,
        "duration_seconds": metrics.get("duration_seconds"),
        "status": metric_value(metrics, "status", "unknown"),
        "analysis_profile": metric_value(metrics, "analysis_profile", "unknown"),
        "steps": metrics.get("steps", 0),
        "agents": metrics.get("agents", 0),
        "warnings_count": metric_value(metrics, "warnings_count", 0),
        "errors_count": metric_value(metrics, "errors_count", 0),
        "manifest_findings_count": len(findings_by_source["manifest"]),
        "code_findings_count": len(findings_by_source["code"]),
        "total_deterministic_findings": len(all_findings),
        "canonical_findings_count": len(canonical_findings),
        "evidence_items_count": len(evidence_items),
        "findings_with_evidence_ids_count": sum(
            bool(finding.get("evidence_ids")) for finding in canonical_findings
        ),
        "static_investigation_ran": metric_value(
            metrics, "static_investigation_ran", bool(trace) and trace_termination != "disabled"
        ),
        "static_investigation_tool_calls": metric_value(
            metrics, "static_investigation_tool_calls", len(trace_tool_calls)
        ),
        "llm_hypotheses_count": metric_value(
            metrics, "llm_hypotheses_count", len(hypotheses)
        ),
        "llm_candidate_findings_count": metric_value(
            metrics, "llm_candidate_findings_count", len(llm_candidates)
        ),
        "llm_candidate_findings_with_evidence_count": metric_value(
            metrics,
            "llm_candidate_findings_with_evidence_count",
            sum(bool(finding.get("evidence_ids")) for finding in llm_candidates),
        ),
        "static_investigation_termination_reason": metric_value(
            metrics, "static_investigation_termination_reason", trace_termination
        ),
        "severity_distribution": dict(sorted(severities.items())),
        "has_manifest_reasoning": (case_dir / REASONING_PATHS["has_manifest_reasoning"]).is_file(),
        "has_code_reasoning": (case_dir / REASONING_PATHS["has_code_reasoning"]).is_file(),
        "has_fused_reasoning": (case_dir / REASONING_PATHS["has_fused_reasoning"]).is_file(),
        "has_markdown_report": report_path.is_file(),
        "report_line_count": len(report.splitlines()),
        "report_word_count": len(report.split()),
        "evid_references_count": sum(text.count("EVID-") for text in referenced_text),
        "evidence_files_found": evidence_files,
        "missing_files": [str(Path(path).relative_to(case_dir)) for path in missing],
        "invalid_files": [str(Path(path).relative_to(case_dir)) for path in invalid],
    }
    return summary, signatures


def compare_profiles(
    artifacts_dir: Path, cases: list[tuple[str, str]]
) -> dict[str, Any]:
    warnings: list[str] = []
    baseline_profile = "no-llm" if any(profile == "no-llm" for profile, _ in cases) else cases[0][0]
    if baseline_profile != "no-llm":
        warnings.append("no-llm baseline not provided; using first profile as baseline.")

    profiles: list[dict[str, Any]] = []
    signature_sets: dict[str, set[str]] = {}
    for profile, case_id in cases:
        summary, signatures = analyze_case(artifacts_dir, profile, case_id)
        profiles.append(summary)
        signature_sets[profile] = signatures

    baseline = signature_sets[baseline_profile]
    comparisons = []
    for profile, _ in cases:
        current = signature_sets[profile]
        missing = sorted(baseline - current)
        extra = sorted(current - baseline)
        equal = not missing and not extra
        comparisons.append(
            {
                "profile": profile,
                "baseline_profile": baseline_profile,
                "deterministic_sets_equal": equal,
                "missing_from_profile": missing,
                "extra_in_profile": extra,
                "missing_count": len(missing),
                "extra_count": len(extra),
            }
        )
        if profile != baseline_profile and not equal:
            warnings.append(
                "Deterministic findings differ from no-llm baseline; "
                "profile comparison may be invalid."
            )

    evidence_available = [
        profile["evid_references_count"] > 0 or bool(profile["evidence_files_found"])
        for profile in profiles
    ]
    if not any(evidence_available):
        warnings.append(
            "Canonical evidence was not exported for any profile; CLI/report outputs may lack "
            "Finding -> Evidence traceability."
        )
    elif not all(evidence_available):
        warnings.append("Canonical evidence availability differs across profiles.")

    profiles_by_name = {profile["profile"]: profile for profile in profiles}
    no_llm = profiles_by_name.get("no-llm")
    full = profiles_by_name.get("full")
    if no_llm and full and no_llm["report_word_count"] > 1.5 * full["report_word_count"]:
        warnings.append(
            "no-llm report is longer than full report; qualitative report comparison should "
            "inspect content, not only LLM usage."
        )

    return {
        "generated_at": datetime.now(UTC).isoformat(),
        "artifacts_dir": str(artifacts_dir),
        "baseline_profile": baseline_profile,
        "profiles": profiles,
        "severity_distributions": {
            profile["profile"]: profile["severity_distribution"] for profile in profiles
        },
        "comparisons": comparisons,
        "warnings": list(dict.fromkeys(warnings)),
    }


def display_number(value: Any, digits: int = 2) -> str:
    if isinstance(value, (int, float)) and not isinstance(value, bool):
        return f"{value:.{digits}f}"
    return "N/A"


def render_markdown(result: dict[str, Any]) -> str:
    comparisons = {item["profile"]: item for item in result["comparisons"]}
    profiles = result["profiles"]
    lines = [
        "# Profile comparison",
        "",
        "| Profile | Duration | Agents | Manifest | Code | Total | High | Medium | Low | Equal to baseline |",
        "| --- | ---: | ---: | ---: | ---: | ---: | ---: | ---: | ---: | --- |",
    ]
    for profile in profiles:
        severity = profile["severity_distribution"]
        equal = "yes" if comparisons[profile["profile"]]["deterministic_sets_equal"] else "no"
        lines.append(
            f"| {profile['profile']} | {display_number(profile['duration_seconds'])} | "
            f"{profile['agents']} | {profile['manifest_findings_count']} | "
            f"{profile['code_findings_count']} | {profile['total_deterministic_findings']} | "
            f"{severity.get('high', 0)} | {severity.get('medium', 0)} | "
            f"{severity.get('low', 0)} | {equal} |"
        )

    lines.extend(["", "## Deterministic comparability", ""])
    for comparison in result["comparisons"]:
        lines.append(
            f"- `{comparison['profile']}`: equal={str(comparison['deterministic_sets_equal']).lower()}, "
            f"missing={comparison['missing_count']}, extra={comparison['extra_count']}."
        )

    lines.extend(["", "## Timing and agent overhead", ""])
    for profile in profiles:
        lines.append(
            f"- `{profile['profile']}`: {display_number(profile['duration_seconds'])} seconds, "
            f"{profile['agents']} agents, {profile['steps']} steps."
        )

    lines.extend(["", "## Report differences", ""])
    for profile in profiles:
        lines.append(
            f"- `{profile['profile']}`: report={'yes' if profile['has_markdown_report'] else 'no'}, "
            f"{profile['report_line_count']} lines, {profile['report_word_count']} words; "
            f"manifest/code/fused reasoning="
            f"{profile['has_manifest_reasoning']}/{profile['has_code_reasoning']}/"
            f"{profile['has_fused_reasoning']}."
        )
        lines.append(
            f"  Static investigation: ran={profile['static_investigation_ran']}, "
            f"tool calls={profile['static_investigation_tool_calls']}, "
            f"hypotheses={profile['llm_hypotheses_count']}, "
            f"candidates={profile['llm_candidate_findings_count']}, "
            f"termination={profile['static_investigation_termination_reason']}."
        )

    lines.extend(["", "## Evidence availability", ""])
    for profile in profiles:
        evidence = profile["evidence_files_found"]
        files = ", ".join(f"`{path}`" for path in evidence) if evidence else "none"
        lines.append(
            f"- `{profile['profile']}`: {profile['evid_references_count']} EVID references; "
            f"evidence files: {files}; canonical findings: "
            f"{profile['canonical_findings_count']}; evidence items: "
            f"{profile['evidence_items_count']}; findings linked to evidence: "
            f"{profile['findings_with_evidence_ids_count']}."
        )
        if profile["missing_files"]:
            lines.append(f"  Missing files: {', '.join(profile['missing_files'])}.")
        if profile["invalid_files"]:
            lines.append(f"  Invalid files: {', '.join(profile['invalid_files'])}.")

    lines.extend(["", "## Warnings", ""])
    lines.extend(f"- {warning}" for warning in result["warnings"])
    if not result["warnings"]:
        lines.append("- None.")

    lines.extend(["", "## Interpretation notes", ""])
    nonbaseline = [item for item in result["comparisons"] if item["profile"] != result["baseline_profile"]]
    all_equal = all(item["deterministic_sets_equal"] for item in nonbaseline)
    if all_equal:
        lines.append("- LLM profiles did not change deterministic detection.")
        lines.append(
            "- LLM value should be assessed through reasoning, prioritization, and report quality."
        )
    else:
        lines.append(
            "- The profile comparison is not clean; investigate the cause before drawing conclusions."
        )

    full_profile = next((profile for profile in profiles if profile["profile"] == "full"), None)
    if full_profile:
        if full_profile["llm_candidate_findings_count"] > 0:
            lines.append(
                "- LLM static investigation proposed additional candidate findings; manual "
                "validation is required."
            )
        elif full_profile["llm_hypotheses_count"] > 0:
            lines.append(
                "- LLM static investigation produced hypotheses but no evidence-linked "
                "candidate findings."
            )
        else:
            lines.append("- LLM static investigation did not add findings for this APK.")

    by_name = {profile["profile"]: profile for profile in profiles}
    baseline = by_name.get("no-llm")
    if baseline and isinstance(baseline["duration_seconds"], (int, float)) and baseline["duration_seconds"] > 0:
        full = by_name.get("full")
        if full and isinstance(full["duration_seconds"], (int, float)) and full["duration_seconds"] > baseline["duration_seconds"]:
            factor = full["duration_seconds"] / baseline["duration_seconds"]
            lines.append(f"- `full` was {factor:.2f}x slower than `no-llm`.")
        fast = by_name.get("fast")
        if fast and isinstance(fast["duration_seconds"], (int, float)):
            ratio = fast["duration_seconds"] / baseline["duration_seconds"]
            if 0.8 <= ratio <= 1.5:
                lines.append(
                    "- `fast` was close to `no-llm` timing and may be a reasonable compromise "
                    "if qualitative report quality improves."
                )
    return "\n".join(lines) + "\n"


def write_results(result: dict[str, Any], output_dir: Path) -> None:
    output_dir.mkdir(parents=True, exist_ok=True)
    (output_dir / "comparison.json").write_text(
        json.dumps(result, indent=2, ensure_ascii=False) + "\n", encoding="utf-8"
    )
    (output_dir / "comparison.md").write_text(render_markdown(result), encoding="utf-8")


def parse_case(value: str) -> tuple[str, str]:
    profile, separator, case_id = value.partition("=")
    if not separator or not profile.strip() or not case_id.strip():
        raise argparse.ArgumentTypeError("cases must use PROFILE=CASE_ID")
    return profile.strip(), case_id.strip()


def main() -> int:
    parser = argparse.ArgumentParser(description="Compare deterministic findings across profiles.")
    parser.add_argument("--artifacts-dir", type=Path, required=True)
    parser.add_argument("--cases", type=parse_case, nargs="+", required=True, metavar="PROFILE=CASE_ID")
    parser.add_argument("--output-dir", type=Path, required=True)
    args = parser.parse_args()
    profiles = [profile for profile, _ in args.cases]
    if len(profiles) != len(set(profiles)):
        parser.error("each profile may be provided only once")
    result = compare_profiles(args.artifacts_dir, args.cases)
    write_results(result, args.output_dir)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
