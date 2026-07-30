from __future__ import annotations

import json
from collections import Counter
from typing import Any


def render_evidence_reference(evidence: dict) -> str:
    lines = []

    fields = [
        ("Evidence ID", evidence.get("evidence_id")),
        ("Type", evidence.get("evidence_type")),
        ("Source tool", evidence.get("source_tool")),
        ("Artifact path", evidence.get("artifact_path")),
        ("Selector", evidence.get("selector")),
        ("Snippet", evidence.get("snippet")),
        ("Command", evidence.get("command")),
    ]

    for label, value in fields:
        if value:
            lines.append(f"- {label}: `{value}`")

    return "\n".join(lines)


def evidence_lookup_by_id(evidence: list[dict]) -> dict[str, dict]:
    return {
        str(item["evidence_id"]): item
        for item in evidence
        if isinstance(item, dict) and item.get("evidence_id")
    }


def render_finding_markdown(finding: dict, evidence_by_id: dict[str, dict]) -> str:
    severity = str(finding.get("severity") or "info").upper()
    title = finding.get("title") or "Untitled finding"
    lines = [
        f"### [{severity}] {title}",
        "",
        f"- Finding ID: `{finding.get('finding_id') or finding.get('id') or 'N/A'}`",
        f"- Status: `{finding.get('status') or 'N/A'}`",
        f"- Confidence: `{finding.get('confidence') or 'N/A'}`",
        f"- Category: `{finding.get('category') or 'N/A'}`",
    ]

    _append_list_field(lines, "MASVS", finding.get("masvs_refs"))
    _append_list_field(lines, "CWE", finding.get("cwe_refs"))
    _append_list_field(lines, "Affected components", finding.get("affected_components"))

    lines.extend(["", "#### Description", "", finding.get("description") or "N/A"])

    if finding.get("impact"):
        lines.extend(["", "#### Impact", "", str(finding["impact"])])

    lines.extend(["", "#### Evidence", ""])
    evidence_ids = _as_list(finding.get("evidence_ids"))

    if evidence_ids:
        for evidence_id in evidence_ids:
            evidence = evidence_by_id.get(evidence_id)

            if evidence:
                lines.append(render_evidence_reference(evidence))
            else:
                lines.append(f"- Missing evidence: `{evidence_id}`")

            lines.append("")
    elif finding.get("evidence"):
        lines.extend(["Legacy evidence", ""])
        lines.append("```json")
        lines.append(json.dumps(finding.get("evidence"), indent=2, ensure_ascii=False, default=str))
        lines.append("```")

    if finding.get("reproduction_steps"):
        lines.extend(["", "#### Reproduction steps", ""])
        for index, step in enumerate(_as_list(finding.get("reproduction_steps")), start=1):
            lines.append(f"{index}. {step}")

    if finding.get("remediation"):
        lines.extend(["", "#### Remediation", "", str(finding["remediation"])])

    if finding.get("references"):
        lines.extend(["", "#### References", ""])
        for reference in _as_list(finding.get("references")):
            lines.append(f"- {reference}")

    return "\n".join(lines).strip()


def render_structured_report_markdown(
    *,
    case: dict,
    state: dict,
    findings: list[dict],
    evidence: list[dict],
) -> str:
    evidence_by_id = evidence_lookup_by_id(evidence)
    package_name = case.get("package_name") or state.get("package_name") or "N/A"
    analysis_profile = (
        state.get("analysis_profile") or case.get("analysis_profile") or "N/A"
    )
    severity_counts = Counter(str(finding.get("severity") or "info").lower() for finding in findings)

    lines = [
        "# Android Security Analysis Report",
        "",
        "## Executive Summary",
        "",
        f"- Case ID: `{case.get('id') or state.get('case_id') or 'N/A'}`",
        f"- Package name: `{package_name}`",
        f"- APK filename: `{case.get('filename') or 'N/A'}`",
        f"- SHA256: `{case.get('sha256') or 'N/A'}`",
        f"- Analysis profile: `{analysis_profile}`",
        f"- Total findings: **{len(findings)}**",
        f"- Critical: **{severity_counts.get('critical', 0)}**",
        f"- High: **{severity_counts.get('high', 0)}**",
        f"- Medium: **{severity_counts.get('medium', 0)}**",
        f"- Low: **{severity_counts.get('low', 0)}**",
        f"- Info: **{severity_counts.get('info', 0)}**",
        "",
        "## Methodology",
        "",
        (
            "The analysis combines static analysis, manifest analysis, code search, "
            "rule-based checks, LLM-assisted reasoning where available, and "
            "evidence-based reporting."
        ),
        "",
        "## Findings",
        "",
    ]

    if findings:
        for finding in findings:
            lines.append(render_finding_markdown(finding, evidence_by_id))
            lines.append("")
    else:
        lines.append("No findings were identified.")

    return "\n".join(lines).strip() + "\n"


def _append_list_field(lines: list[str], label: str, value: Any) -> None:
    values = _as_list(value)
    if values:
        lines.append(f"- {label}: {', '.join(f'`{item}`' for item in values)}")


def _as_list(value: Any) -> list[str]:
    if value is None:
        return []

    if isinstance(value, str):
        return [value] if value else []

    if isinstance(value, (list, tuple, set)):
        return [str(item) for item in value if item]

    return [str(value)]
