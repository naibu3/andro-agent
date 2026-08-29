from __future__ import annotations

import hashlib
import json
import re
from pathlib import Path
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
    case_dir: Path | None = None,
) -> Evidence:
    artifact_path = _relative_artifact_path(_artifact_path(raw_evidence), case_dir)
    selector = _selector(raw_evidence)
    snippet = _snippet(raw_evidence, artifact_path=artifact_path)
    command = _command(raw_evidence)
    legacy_type = _dict_string(raw_evidence, "type")
    metadata = {
        "raw_evidence": raw_evidence,
        "finding_id": finding_id,
        "source": source,
    }
    if legacy_type:
        metadata["legacy_type"] = legacy_type
    legacy_source = _dict_string(raw_evidence, "source")
    if legacy_source and legacy_source != source:
        metadata["legacy_source"] = legacy_source
    legacy_confidence = _dict_string(raw_evidence, "confidence")
    if legacy_confidence:
        metadata["legacy_confidence"] = legacy_confidence

    return Evidence(
        evidence_id=evidence_id_for(case_id, source, finding_id, index, raw_evidence),
        case_id=case_id,
        evidence_type=_evidence_type(source, artifact_path, legacy_type),
        source_tool=source,
        artifact_path=artifact_path,
        selector=selector,
        snippet=snippet,
        command=command,
        metadata=metadata,
    )


def canonicalize_evidences(
    raw_evidences: list[Any],
    *,
    case_id: str,
    source: str,
    finding_id: str,
    case_dir: Path | None = None,
) -> list[Evidence]:
    return [
        canonicalize_evidence(
            raw_evidence,
            case_id=case_id,
            source=source,
            finding_id=finding_id,
            index=index,
            case_dir=case_dir,
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
    case_dir: Path | None = None,
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
            case_dir=case_dir,
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

        key = _stringify(raw_evidence.get("key"))
        if key and _looks_like_path(key):
            return key

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

        key = _stringify(raw_evidence.get("key"))
        if key and not _looks_like_path(key):
            return key

        metadata = raw_evidence.get("metadata")
        metadata = metadata if isinstance(metadata, dict) else {}
        line = _stringify(raw_evidence.get("line") or metadata.get("line_number"))
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

        metadata = raw_evidence.get("metadata")
        metadata = metadata if isinstance(metadata, dict) else {}
        line_text = _stringify(metadata.get("line_text"))
        if line_text:
            return line_text

        key = _stringify(raw_evidence.get("key"))
        value = _stringify(raw_evidence.get("value"))
        if key and value:
            return f"{key}={value}"

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


def _evidence_type(
    source: str, artifact_path: str | None, legacy_type: str | None = None
) -> EvidenceType:
    lowered_source = source.lower()
    lowered_path = (artifact_path or "").lower()
    lowered_type = (legacy_type or "").lower()

    if ".smali" in lowered_path:
        return EvidenceType.SMALI

    if (
        lowered_source == "manifest"
        or "manifest" in lowered_type
        or "androidmanifest.xml" in lowered_path
    ):
        return EvidenceType.MANIFEST

    if (
        lowered_source == "code"
        or "code" in lowered_type
        or "pattern" in lowered_type
        or lowered_path.endswith((".java", ".kt"))
    ):
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


def _relative_artifact_path(artifact_path: str | None, case_dir: Path | None) -> str | None:
    if not artifact_path or case_dir is None:
        return artifact_path

    path = Path(artifact_path)
    try:
        if path.is_absolute():
            return path.resolve().relative_to(case_dir.resolve()).as_posix()

        resolved = (Path.cwd() / path).resolve()
        try:
            return resolved.relative_to(case_dir.resolve()).as_posix()
        except ValueError:
            pass

        parts = path.parts
        if case_dir.name in parts:
            case_index = parts.index(case_dir.name)
            relative = Path(*parts[case_index + 1 :])
            if relative.parts:
                return relative.as_posix()
    except (OSError, ValueError):
        pass

    return artifact_path


def _dict_string(raw_evidence: Any, key: str) -> str | None:
    if not isinstance(raw_evidence, dict):
        return None
    return _stringify(raw_evidence.get(key))


def _stringify(value: Any) -> str | None:
    if value is None:
        return None

    if isinstance(value, str):
        stripped = value.strip()
        return stripped or None

    if isinstance(value, (int, float, bool)):
        return str(value)

    return None
