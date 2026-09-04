from __future__ import annotations

import re
from pathlib import Path
from typing import Any

from andro_agent.agents.multi_agent.schemas import CandidateFinding, EvidenceReviewDecision


class EvidenceReviewAgent:
    name = "EvidenceReviewAgent"
    _OVERCLAIM = re.compile(
        r"auth(?:entication)? bypass|unauthori[sz]ed|fund transfer|file exploit|sql injection|sqli",
        re.IGNORECASE,
    )
    _MANIFEST_IMPACT = re.compile(
        r"sensitive|\bpin\b|invoice|download|show data|data exposure|exposes? data|"
        r"read data|write data|data leak|credential|account|payment",
        re.IGNORECASE,
    )
    _DATAFLOW_CLAIM = re.compile(
        r"user[- ]controlled|user input|command injection|sql injection|sqli|concatenat",
        re.IGNORECASE,
    )
    _DATAFLOW_SUPPORT = re.compile(
        r"getText\s*\(|user input|user[- ]controlled|\+\s*\(?\(?Object\)?|concatenat",
        re.IGNORECASE,
    )
    _DATAFLOW_SINK = re.compile(r"Runtime(?:\.getRuntime\(\))?\.exec|execSQL|rawQuery", re.IGNORECASE)

    def __init__(self, case_dir: Path | None = None) -> None:
        self.case_dir = Path(case_dir) if case_dir else None

    def _source_context(self, item: dict[str, Any]) -> str:
        if self.case_dir is None or item.get("evidence_type") != "source":
            return ""
        artifact = item.get("artifact_path")
        selector = str(item.get("selector") or "")
        match = re.fullmatch(r"line:(\d+)", selector)
        if not artifact or not match:
            return ""
        root = self.case_dir.resolve()
        path = (root / str(artifact)).resolve()
        if not path.is_relative_to(root):
            return ""
        try:
            lines = path.read_text(encoding="utf-8", errors="ignore").splitlines()
        except OSError:
            return ""
        line = int(match.group(1)) - 1
        return "\n".join(lines[max(0, line - 20) : line + 6])[:4000]

    def review(
        self,
        candidates: list[CandidateFinding],
        evidence: list[dict[str, Any]],
        findings: list[dict[str, Any]],
    ) -> list[EvidenceReviewDecision]:
        registry = {str(item.get("evidence_id")): item for item in evidence}
        decisions = []
        for candidate in candidates:
            resolved = [registry[eid] for eid in candidate.evidence_ids if eid in registry]
            candidate_evidence = set(candidate.evidence_ids)
            duplicate = next(
                (
                    item
                    for item in findings
                    if candidate_evidence
                    and candidate_evidence == set(item.get("evidence_ids") or [])
                    and (
                        candidate.title.strip().casefold()
                        == str(item.get("title") or "").strip().casefold()
                        or candidate.category.strip().casefold()
                        == str(item.get("category") or "").strip().casefold()
                    )
                ),
                None,
            )
            claim = f"{candidate.title} {candidate.description}"
            manifest_only = bool(resolved) and all(
                "manifest" in str(item.get("evidence_type", "")).lower()
                or "manifest" in str(item.get("source_tool", "")).lower()
                for item in resolved
            )
            if not candidate.evidence_ids or len(resolved) != len(candidate.evidence_ids):
                verdict, sufficiency, reason = (
                    "reject_insufficient_evidence",
                    "insufficient",
                    "One or more evidence IDs could not be resolved.",
                )
            elif manifest_only and (
                self._OVERCLAIM.search(claim) or self._MANIFEST_IMPACT.search(claim)
            ):
                verdict, sufficiency, reason = (
                    "needs_dynamic_confirmation",
                    "partial",
                    "Manifest exported-state evidence does not prove the claimed sensitive behavior or runtime impact.",
                )
            else:
                evidence_text = " ".join(
                    str(value) for item in resolved for value in item.values()
                )
                evidence_text += " " + " ".join(
                    self._source_context(item) for item in resolved
                )
                dataflow_unsupported = bool(
                    self._DATAFLOW_CLAIM.search(claim)
                    and not self._DATAFLOW_SUPPORT.search(evidence_text)
                )
                if dataflow_unsupported and not self._DATAFLOW_SINK.search(evidence_text):
                    verdict, sufficiency, reason = (
                        "reject_insufficient_evidence",
                        "insufficient",
                        "The resolved evidence does not contain the claimed sink or dataflow.",
                    )
                elif dataflow_unsupported:
                    verdict, sufficiency, reason = (
                        "needs_manual_review",
                        "partial",
                        "The cited source shows a sink but does not establish the claimed user-controlled dataflow.",
                    )
                elif duplicate:
                    verdict, sufficiency, reason = (
                        "duplicate_valid",
                        "sufficient",
                        "The candidate is supported but overlaps a deterministic finding with the same evidence.",
                    )
                else:
                    evidence_text = evidence_text.lower()
                    meaningful = {
                        word
                        for word in re.findall(r"[a-zA-Z]{4,}", claim.lower())
                        if word not in {"with", "from", "that", "this", "issue", "vulnerability"}
                    }
                    if meaningful and not any(word in evidence_text for word in meaningful):
                        verdict, sufficiency, reason = (
                            "reject_insufficient_evidence",
                            "insufficient",
                            "The resolved evidence does not support the exact candidate claim.",
                        )
                    elif candidate.needs_dynamic_confirmation:
                        verdict, sufficiency, reason = (
                            "needs_dynamic_confirmation",
                            "partial",
                            "The static evidence is plausible but runtime confirmation is required.",
                        )
                    else:
                        verdict, sufficiency, reason = (
                            "promote",
                            "sufficient",
                            "Resolved case evidence directly supports the candidate.",
                        )
            decisions.append(
                EvidenceReviewDecision(
                    candidate_id=candidate.candidate_id,
                    verdict=verdict,
                    duplicate_of=str(duplicate.get("finding_id")) if duplicate else None,
                    evidence_sufficiency=sufficiency,
                    reason=reason,
                    promoted_to_finding=f"MA-{candidate.candidate_id}"
                    if verdict == "promote"
                    else None,
                )
            )
        return decisions
