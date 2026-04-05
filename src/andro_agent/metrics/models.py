from __future__ import annotations

from datetime import datetime
from typing import Any

from pydantic import BaseModel, Field


class StepMetric(BaseModel):
    name: str
    started_at: datetime
    finished_at: datetime | None = None
    duration_seconds: float | None = None
    success: bool | None = None
    warnings: list[str] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)


class AgentMetric(BaseModel):
    name: str
    model: str | None = None

    started_at: datetime
    finished_at: datetime | None = None
    duration_seconds: float | None = None
    success: bool | None = None

    input_chars: int | None = None
    output_chars: int | None = None

    input_tokens: int | None = None
    output_tokens: int | None = None
    total_tokens: int | None = None

    warnings: list[str] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)


class RunMetrics(BaseModel):
    case_id: str

    started_at: datetime
    finished_at: datetime | None = None
    duration_seconds: float | None = None

    steps: list[StepMetric] = Field(default_factory=list)
    agents: list[AgentMetric] = Field(default_factory=list)

    summary: dict[str, Any] = Field(default_factory=dict)