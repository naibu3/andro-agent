from __future__ import annotations

import json
import time
from datetime import datetime
from pathlib import Path
from typing import Any

from andro_agent.metrics.models import AgentMetric, RunMetrics, StepMetric


class MetricsTracker:
    def __init__(self, case_id: str, artifacts_dir: Path):
        self.case_id = case_id
        self.artifacts_dir = artifacts_dir

        self._start_time = time.perf_counter()

        self.run_metrics = RunMetrics(
            case_id=case_id,
            started_at=datetime.utcnow(),
        )

        self._current_step: StepMetric | None = None
        self._current_agent: AgentMetric | None = None

    # -----------------------------
    # STEP TRACKING
    # -----------------------------
    def start_step(self, name: str) -> None:
        self._current_step = StepMetric(
            name=name,
            started_at=datetime.utcnow(),
        )
        self._step_start_time = time.perf_counter()

    def end_step(
        self,
        success: bool = True,
        warnings: list[str] | None = None,
        errors: list[str] | None = None,
    ) -> None:
        if not self._current_step:
            return

        duration = time.perf_counter() - self._step_start_time

        self._current_step.finished_at = datetime.utcnow()
        self._current_step.duration_seconds = duration
        self._current_step.success = success

        if warnings:
            self._current_step.warnings.extend(warnings)
        if errors:
            self._current_step.errors.extend(errors)

        self.run_metrics.steps.append(self._current_step)
        self._current_step = None

    # -----------------------------
    # AGENT TRACKING
    # -----------------------------
    def start_agent(self, name: str, model: str | None = None, input_text: str | None = None) -> None:
        self._current_agent = AgentMetric(
            name=name,
            model=model,
            started_at=datetime.utcnow(),
        )

        if input_text:
            self._current_agent.input_chars = len(input_text)

        self._agent_start_time = time.perf_counter()

    def end_agent(
        self,
        output_text: str | None = None,
        success: bool = True,
        usage: dict[str, Any] | None = None,
        warnings: list[str] | None = None,
        errors: list[str] | None = None,
    ) -> None:
        if not self._current_agent:
            return

        duration = time.perf_counter() - self._agent_start_time

        self._current_agent.finished_at = datetime.utcnow()
        self._current_agent.duration_seconds = duration
        self._current_agent.success = success

        if output_text:
            self._current_agent.output_chars = len(output_text)

        # Token usage (si viene del proveedor)
        if usage:
            self._current_agent.input_tokens = usage.get("prompt_tokens")
            self._current_agent.output_tokens = usage.get("completion_tokens")
            self._current_agent.total_tokens = usage.get("total_tokens")

        if warnings:
            self._current_agent.warnings.extend(warnings)
        if errors:
            self._current_agent.errors.extend(errors)

        self.run_metrics.agents.append(self._current_agent)
        self._current_agent = None

    # -----------------------------
    # SUMMARY
    # -----------------------------
    def set_summary(self, summary: dict[str, Any]) -> None:
        self.run_metrics.summary = summary

    # -----------------------------
    # FINALIZE
    # -----------------------------
    def finalize(self) -> None:
        duration = time.perf_counter() - self._start_time

        self.run_metrics.finished_at = datetime.utcnow()
        self.run_metrics.duration_seconds = duration

        self._persist()

    # -----------------------------
    # SAVE
    # -----------------------------
    def _persist(self) -> None:
        metrics_dir = self.artifacts_dir / self.case_id / "metrics"
        metrics_dir.mkdir(parents=True, exist_ok=True)

        full_path = metrics_dir / "run_metrics.json"
        summary_path = metrics_dir / "run_metrics_summary.json"

        full_path.write_text(
            json.dumps(self.run_metrics.model_dump(), indent=2, default=str),
            encoding="utf-8",
        )

        summary = {
            "case_id": self.run_metrics.case_id,
            "duration_seconds": self.run_metrics.duration_seconds,
            "steps": len(self.run_metrics.steps),
            "agents": len(self.run_metrics.agents),
            "summary": self.run_metrics.summary,
        }

        summary_path.write_text(
            json.dumps(summary, indent=2, default=str),
            encoding="utf-8",
        )