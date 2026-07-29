from __future__ import annotations

import hashlib
import json
from typing import Any

from andro_agent.domain.models.security import (
    Confidence,
    Finding,
    FindingStatus,
    Severity,
)


MAPPED_KEYS = {
    "id",
    "finding_id",
    "rule_id",
    "title",
    "name",
    "issue",
    "check",
    "description",
    "details",
    "message",
    "rationale",
    "severity",
    "level",
    "risk",
    "confidence",
    "status",
    "category",
    "type",
    "source",
    "evidence",
    "evidences",
    "evidence_ids",
    "file",
    "path",
    "location",
    "component",
    "components",
    "remediation",
    "recommendation",
    "fix",
    "impact",
    "references",
    "refs",
    "masvs",
    "masvs_refs",
    "cwe",
    "cwe_refs",
    "metadata",
}


def canonicalize_finding(raw: dict, *, case_id: str, source: str, index: int) -> Finding:
    metadata = dict(raw.get("metadata") or {}) if isinstance(raw.get("metadata"), dict) else {}
    metadata["source"] = source
    metadata["raw_finding"] = raw

    legacy_fields = {key: value for key, value in raw.items() if key not in MAPPED_KEYS}
    if legacy_fields:
        metadata["legacy_fields"] = legacy_fields

    finding_id = _first_text(raw, "finding_id", "id", "rule_id") or _generated_id(
        case_id=case_id,
        source=source,
        index=index,
    )
    title = _first_text(raw, "title", "name", "issue", "check") or "Untitled finding"
    description = _first_text(raw, "description", "details", "message", "rationale") or ""
    severity = _normalize_severity(_first_text(raw, "severity", "level", "risk"))
    confidence = _normalize_confidence(raw.get("confidence"))
    status = _normalize_status(raw.get("status"))
    evidence_ids = _to_string_list(raw.get("evidence_ids"))

    if status == FindingStatus.DYNAMIC_CONFIRMED and not evidence_ids:
        metadata["original_status"] = _stringify(raw.get("status")) or status.value
        status = FindingStatus.STATIC_CANDIDATE

    if (
        severity in {Severity.HIGH, Severity.CRITICAL}
        and confidence == Confidence.LOW
        and status != FindingStatus.INCONCLUSIVE
    ):
        metadata["original_confidence"] = Confidence.LOW.value
        confidence = Confidence.MEDIUM

    legacy_evidence = _legacy_evidence(raw)
    if legacy_evidence and not evidence_ids:
        metadata["legacy_evidence"] = legacy_evidence

    return Finding(
        finding_id=finding_id,
        case_id=case_id,
        title=title,
        description=description,
        severity=severity,
        confidence=confidence,
        status=status,
        category=_first_text(raw, "category", "type", "source") or source,
        masvs_refs=_to_string_list(raw.get("masvs_refs", raw.get("masvs"))),
        cwe_refs=_to_string_list(raw.get("cwe_refs", raw.get("cwe"))),
        affected_components=_affected_components(raw),
        evidence_ids=evidence_ids,
        impact=_first_text(raw, "impact") or "",
        reproduction_steps=_to_string_list(raw.get("reproduction_steps")),
        remediation=_first_text(raw, "remediation", "recommendation", "fix") or "",
        references=_to_string_list(raw.get("references", raw.get("refs"))),
        metadata=metadata,
    )


def canonicalize_findings(raw_findings: list[dict], *, case_id: str, source: str) -> list[Finding]:
    return [
        canonicalize_finding(raw, case_id=case_id, source=source, index=index)
        for index, raw in enumerate(raw_findings)
        if isinstance(raw, dict)
    ]


def finding_to_web_dict(finding: Finding) -> dict:
    data = finding.model_dump(mode="json")
    metadata = data.get("metadata") if isinstance(data.get("metadata"), dict) else {}
    raw_finding = metadata.get("raw_finding") if isinstance(metadata.get("raw_finding"), dict) else {}
    legacy_evidence = metadata.get("legacy_evidence")
    evidence = legacy_evidence if legacy_evidence else list(finding.evidence_ids)

    data["id"] = raw_finding.get("id") or finding.finding_id
    data["finding_id"] = finding.finding_id
    data["severity"] = finding.severity.value
    data["confidence"] = finding.confidence.value
    data["status"] = finding.status.value
    data["source"] = metadata.get("source") or raw_finding.get("source") or finding.category
    data["rule_id"] = raw_finding.get("rule_id") or finding.finding_id
    data["evidence"] = evidence
    data["evidence_pretty"] = json.dumps(evidence, indent=2, ensure_ascii=False, default=str)

    return data


def findings_to_web_dicts(findings: list[Finding]) -> list[dict]:
    return [finding_to_web_dict(finding) for finding in findings]


def _generated_id(*, case_id: str, source: str, index: int) -> str:
    digest = hashlib.sha256(f"{case_id}:{source}:{index}".encode("utf-8")).hexdigest()
    return f"FIND-{digest[:12].upper()}"


def _first_text(raw: dict, *keys: str) -> str | None:
    for key in keys:
        value = raw.get(key)
        text = _stringify(value)
        if text:
            return text
    return None


def _stringify(value: Any) -> str | None:
    if value is None:
        return None

    if isinstance(value, str):
        stripped = value.strip()
        return stripped or None

    if isinstance(value, (int, float, bool)):
        return str(value)

    return None


def _to_string_list(value: Any) -> list[str]:
    if value is None:
        return []

    if isinstance(value, str):
        return [item.strip() for item in value.split(",") if item.strip()]

    if isinstance(value, (list, tuple, set)):
        result: list[str] = []
        for item in value:
            text = _stringify(item)
            if text:
                result.append(text)
        return result

    text = _stringify(value)
    return [text] if text else []


def _normalize_severity(value: Any) -> Severity:
    normalized = (_stringify(value) or "").lower().replace("-", "_").replace(" ", "_")

    aliases = {
        "informational": Severity.INFO,
        "info": Severity.INFO,
        "low": Severity.LOW,
        "medium": Severity.MEDIUM,
        "moderate": Severity.MEDIUM,
        "high": Severity.HIGH,
        "critical": Severity.CRITICAL,
        "crit": Severity.CRITICAL,
    }

    return aliases.get(normalized, Severity.INFO)


def _normalize_confidence(value: Any) -> Confidence:
    normalized = (_stringify(value) or "").lower().strip()

    if normalized == Confidence.LOW.value:
        return Confidence.LOW

    if normalized == Confidence.HIGH.value:
        return Confidence.HIGH

    return Confidence.MEDIUM


def _normalize_status(value: Any) -> FindingStatus:
    normalized = (_stringify(value) or "").lower().replace("-", "_").replace(" ", "_")

    if normalized == "dynamic_confirmed":
        return FindingStatus.DYNAMIC_CONFIRMED

    if normalized == "confirmed":
        return FindingStatus.DYNAMIC_CONFIRMED

    if normalized == "refuted":
        return FindingStatus.REFUTED

    if normalized == "inconclusive":
        return FindingStatus.INCONCLUSIVE

    return FindingStatus.STATIC_CANDIDATE


def _legacy_evidence(raw: dict) -> Any:
    for key in ("evidence", "evidences"):
        value = raw.get(key)
        if value:
            return value

    values: list[Any] = []
    for key in ("file", "path", "location", "component", "components"):
        value = raw.get(key)
        if value:
            values.append(value)

    return values


def _affected_components(raw: dict) -> list[str]:
    result: list[str] = []

    for key in ("component", "components", "path", "file", "location"):
        result.extend(_to_string_list(raw.get(key)))

    deduped: list[str] = []
    seen: set[str] = set()

    for item in result:
        if item in seen:
            continue
        seen.add(item)
        deduped.append(item)

    return deduped
