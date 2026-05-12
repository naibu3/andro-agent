from __future__ import annotations

from typing import Any


def build_evidence_context(
    task_observations: list[dict[str, Any]],
    recent_findings: list[dict[str, Any]] | None = None,
) -> dict[str, Any]:
    signals = {}

    for obs in task_observations:
        signal = obs.get("signal")
        if signal:
            signals[signal] = obs.get("success", False)

    return {
        "signals": signals,
        "observations": task_observations[-20:],
        "recent_findings": recent_findings or [],
    }