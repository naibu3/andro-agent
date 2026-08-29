from __future__ import annotations

import json
from pathlib import Path
from typing import Any

from pydantic import BaseModel, Field


class CaseState(BaseModel):
    case_id: str
    apk_path: Path
    analysis_profile: str = "full"
    agentic_mode: str = "none"
    agentic_strategy_runtime: str = "none"
    agentic_budget: str = "balanced"
    agentic_enabled_tools: list[str] = Field(default_factory=list)
    agentic_max_questions: int = 0
    agentic_max_tool_calls: int = 0
    llm_provider: str | None = None
    llm_model: str | None = None

    # Outputs
    manifest_json_path: Path | None = None
    facts_path: Path | None = None
    findings_path: Path | None = None
    analysis_path: Path | None = None
    analysis_raw_path: Path | None = None
    jadx_output_dir: Path | None = None
    code_search_results_path: Path | None = None
    code_facts_path: Path | None = None
    code_findings_path: Path | None = None
    correlated_findings_path: Path | None = None
    static_analysis_bundle_path: Path | None = None
    static_report_path: Path | None = None
    static_investigation_trace_path: Path | None = None
    llm_hypotheses_path: Path | None = None
    llm_candidate_findings_path: Path | None = None

    evidence_registry_path: Path | None = None
    candidates_path: Path | None = None

    manifest_reasoning_path: Path | None = None
    manifest_reasoning_raw_path: Path | None = None

    code_reasoning_path: Path | None = None
    code_reasoning_raw_path: Path | None = None

    metrics_tracker: Any | None = None

    dynamic_plan_path: Path | None = None
    dynamic_results_path: Path | None = None
    dynamic_report_path: Path | None = None

    device_profile: str | None = None
    package_name: str | None = None

    # Metadata
    status: str = "created"
    current_step: str | None = None

    tool_history: list[dict[str, Any]] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)
    warnings: list[str] = Field(default_factory=list)

    def save(self, base_dir: Path = Path("artifacts")) -> Path:
        case_dir = base_dir / self.case_id
        case_dir.mkdir(parents=True, exist_ok=True)

        path = case_dir / "case_state.json"
        path.write_text(
            json.dumps(self.model_dump(mode="json"), indent=2, ensure_ascii=False),
            encoding="utf-8",
        )
        return path

    @classmethod
    def load(cls, case_id: str, base_dir: Path = Path("artifacts")) -> CaseState:
        path = base_dir / case_id / "case_state.json"
        data = json.loads(path.read_text(encoding="utf-8"))
        return cls.model_validate(data)
