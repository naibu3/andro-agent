from __future__ import annotations

from typing import Any, Literal

from pydantic import BaseModel, Field


TaskKind = Literal[
    "launch_app",
    "launch_activity",
    "open_deeplink",
    "query_content_provider",
    "analyze_ui_transition",
    "analyze_network",
    "enumerate_provider_paths",
    "pinning_triage",
]


class DynamicTask(BaseModel):
    task_id: str
    kind: TaskKind
    priority: Literal["low", "medium", "high"] = "medium"
    target: str | None = None
    context: dict[str, Any] = Field(default_factory=dict)
    status: Literal["pending", "running", "done", "failed", "skipped"] = "pending"
    attempts: int = 0


class TaskExecutionResult(BaseModel):
    task_id: str
    success: bool
    observations: list[dict[str, Any]] = Field(default_factory=list)
    artifacts: list[str] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)
    metadata: dict[str, Any] = Field(default_factory=dict)
