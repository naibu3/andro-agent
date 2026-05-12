from __future__ import annotations

from typing import Any, Literal

from pydantic import BaseModel, Field


class EvidenceItem(BaseModel):
    id: str
    category: str
    subtype: str
    kind: str
    value: Any
    source: str


SeverityLevel = Literal["info", "low", "medium", "high", "critical"]
ConfidenceLevel = Literal["low", "medium", "high"]
