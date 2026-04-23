# src/andro_agent/models_dynamic.py
from __future__ import annotations

from pathlib import Path
from typing import Any, Literal

from pydantic import BaseModel, Field


class DynamicAction(BaseModel):
    action: Literal[
        "launch_app",
        "launch_activity",
        "open_deeplink",
        "query_content_provider",
        "dump_ui",
        "take_screenshot",
        "collect_logcat",
    ]
    parameters: dict[str, Any] = Field(default_factory=dict)


class DynamicTest(BaseModel):
    test_id: str
    title: str
    masvs_control_group: str
    category: str
    priority: Literal["low", "medium", "high"] = "medium"
    actions: list[DynamicAction] = Field(default_factory=list)
    expected_signals: list[str] = Field(default_factory=list)


class DynamicPlan(BaseModel):
    case_id: str
    package_name: str | None = None
    device_profile: str = "baseline"
    tests: list[DynamicTest] = Field(default_factory=list)


class DynamicObservation(BaseModel):
    test_id: str
    signal: str
    success: bool
    summary: str
    metadata: dict[str, Any] = Field(default_factory=dict)


class DynamicExecutionResult(BaseModel):
    case_id: str
    package_name: str | None = None
    device_profile: str
    tests_executed: int = 0
    observations: list[DynamicObservation] = Field(default_factory=list)
    artifacts: list[str] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)


class BuildDynamicPlanInput(BaseModel):
    case_id: str
    artifacts_dir: Path = Path("artifacts")
    package_name: str | None = None


class BuildDynamicPlanOutput(BaseModel):
    success: bool
    plan_path: Path | None = None
    plan: DynamicPlan | None = None
    errors: list[str] = Field(default_factory=list)


class ExecuteDynamicPlanInput(BaseModel):
    case_id: str
    plan_path: Path
    apk_path: Path
    artifacts_dir: Path = Path("artifacts")


class ExecuteDynamicPlanOutput(BaseModel):
    success: bool
    results_path: Path | None = None
    result: DynamicExecutionResult | None = None
    errors: list[str] = Field(default_factory=list)