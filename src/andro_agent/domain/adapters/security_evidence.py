from __future__ import annotations

import hashlib
import json
import re
from typing import Any

from andro_agent.domain.models.security import Evidence, EvidenceType


PATH_LINE_PATTERN = re.compile(r"^(?P<path>[^:\s][^:]*\.[A-Za-z0-9_]+):(?P<line>\d+)$")


def evidence_id_for(
    case_id: str,
    source: str,
    finding_id: str,
    index: int,
    raw_evidence: Any,
) -> str:
    payload = {
        "case_id": case_id,
        "source": source,
        "finding_id": finding_id,
        "index": index,
        "raw_evidence": _normalized_raw(raw_evidence),
    }
    digest = hashlib.sha256(
        json.dumps(payload, sort_keys=True, ensure_ascii=False, default=str).encode("utf-8")
    ).hexdigest()
    return f"EVID-{digest[:12].upper()}"


def canonicalize_evidence(
    raw_evidence: Any,
    *,
    case_id: str,
    source: str,
    finding_id: str,
    index: int,
) -> Evidence:
    artifact_path = _artifact_path(raw_evidence)
    selector = _selector(raw_evidence)
    snippet = _snippet(raw_evidence, artifact_path=artifact_path)
    command = _command(raw_evidence)

    return Evidence(
        evidence_id=evidence_id_for(case_id, source, finding_id, index, raw_evidence),
        case_id=case_id,
        evidence_type=_evidence_type(source, artifact_path),
        source_tool=source,
        artifact_path=artifact_path,
        selector=selector,
        snippet=snippet,
        command=command,
        metadata={
            "raw_evidence": raw_evidence,
            "finding_id": finding_id,
            "source": source,
        },
    )


def canonicalize_evidences(
    raw_evidences: list[Any],
    *,
    case_id: str,
    source: str,
    finding_id: str,
) -> list[Evidence]:
    return [
        canonicalize_evidence(
            raw_evidence,
            case_id=case_id,
            source=source,
            finding_id=finding_id,
            index=index,
        )
        for index, raw_evidence in enumerate(raw_evidences)
    ]


def evidence_to_web_dict(evidence: Evidence) -> dict:
    data = evidence.model_dump(mode="json")
    data["evidence_type"] = evidence.evidence_type.value
    return data


def evidences_to_web_dicts(evidences: list[Evidence]) -> list[dict]:
    return [evidence_to_web_dict(evidence) for evidence in evidences]


def attach_evidence_to_finding_dicts(
    findings: list[dict],
    *,
    case_id: str,
    source: str,
) -> tuple[list[dict], list[dict]]:
    updated_findings: list[dict] = []
    evidence_by_id: dict[str, Evidence] = {}

    for finding in findings:
        updated = dict(finding)
        finding_id = str(updated.get("finding_id") or updated.get("id") or updated.get("rule_id") or "")
        raw_evidences = _raw_evidences_from_finding(updated)
        existing_ids = _to_string_list(updated.get("evidence_ids"))
        generated_ids: list[str] = []

        for evidence in canonicalize_evidences(
            raw_evidences,
            case_id=case_id,
            source=str(updated.get("source") or source),
            finding_id=finding_id,
        ):
            evidence_by_id.setdefault(evidence.evidence_id, evidence)
            generated_ids.append(evidence.evidence_id)

        updated["evidence_ids"] = _dedupe(existing_ids + generated_ids)
        updated.setdefault("evidence", raw_evidences)
        updated["evidence_pretty"] = json.dumps(
            updated.get("evidence", []),
            indent=2,
            ensure_ascii=False,
            default=str,
        )
        updated_findings.append(updated)

    return updated_findings, evidences_to_web_dicts(list(evidence_by_id.values()))


def _normalized_raw(raw_evidence: Any) -> Any:
    if isinstance(raw_evidence, dict):
        return {str(key): _normalized_raw(value) for key, value in sorted(raw_evidence.items())}

    if isinstance(raw_evidence, list):
        return [_normalized_raw(value) for value in raw_evidence]

    return raw_evidence


def _artifact_path(raw_evidence: Any) -> str | None:
    if isinstance(raw_evidence, dict):
        for key in ("artifact_path", "relative_path", "path", "file"):
            value = _stringify(raw_evidence.get(key))
            if value:
                return value

    if isinstance(raw_evidence, str):
        match = PATH_LINE_PATTERN.match(raw_evidence.strip())
        if match:
            return match.group("path")

        if _looks_like_path(raw_evidence):
            return raw_evidence.strip()

    return None


def _selector(raw_evidence: Any) -> str | None:
    if isinstance(raw_evidence, dict):
        selector = _stringify(raw_evidence.get("selector") or raw_evidence.get("location"))
        if selector:
            return selector

        line = _stringify(raw_evidence.get("line"))
        if line:
            return f"line:{line}"

    if isinstance(raw_evidence, str):
        match = PATH_LINE_PATTERN.match(raw_evidence.strip())
        if match:
            return f"line:{match.group('line')}"

    return None


def _snippet(raw_evidence: Any, *, artifact_path: str | None) -> str | None:
    if isinstance(raw_evidence, dict):
        for key in ("snippet", "matched_text", "text", "reason"):
            value = _stringify(raw_evidence.get(key))
            if value:
                return value

    if isinstance(raw_evidence, str) and not artifact_path:
        return raw_evidence

    if isinstance(raw_evidence, (int, float, bool)):
        return str(raw_evidence)

    return None


def _command(raw_evidence: Any) -> str | None:
    if not isinstance(raw_evidence, dict):
        return None

    for key in ("command", "adb_command", "frida_command"):
        value = _stringify(raw_evidence.get(key))
        if value:
            return value

    return None


def _evidence_type(source: str, artifact_path: str | None) -> EvidenceType:
    lowered_source = source.lower()
    lowered_path = (artifact_path or "").lower()

    if ".smali" in lowered_path:
        return EvidenceType.SMALI

    if lowered_source == "manifest" or "androidmanifest.xml" in lowered_path:
        return EvidenceType.MANIFEST

    if lowered_source == "code" or lowered_path.endswith((".java", ".kt")):
        return EvidenceType.SOURCE

    if lowered_source == "dynamic":
        return EvidenceType.TOOL_OUTPUT

    return EvidenceType.OTHER


def _raw_evidences_from_finding(finding: dict) -> list[Any]:
    metadata = finding.get("metadata") if isinstance(finding.get("metadata"), dict) else {}

    for value in (metadata.get("legacy_evidence"), finding.get("evidence"), finding.get("evidences")):
        if value:
            return value if isinstance(value, list) else [value]

    return []


def _to_string_list(value: Any) -> list[str]:
    if value is None:
        return []

    if isinstance(value, str):
        return [value]

    if isinstance(value, (list, tuple, set)):
        return [str(item) for item in value if item is not None]

    return [str(value)]


def _dedupe(values: list[str]) -> list[str]:
    result: list[str] = []
    seen: set[str] = set()

    for value in values:
        if value in seen:
            continue
        seen.add(value)
        result.append(value)

    return result


def _looks_like_path(value: str) -> bool:
    stripped = value.strip()
    return "/" in stripped or "\\" in stripped or bool(re.search(r"\.[A-Za-z0-9_]+$", stripped))


def _stringify(value: Any) -> str | None:
    if value is None:
        return None

    if isinstance(value, str):
        stripped = value.strip()
        return stripped or None

    if isinstance(value, (int, float, bool)):
        return str(value)

    return None
