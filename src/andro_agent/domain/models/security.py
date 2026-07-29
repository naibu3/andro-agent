from __future__ import annotations

from datetime import UTC, datetime
from enum import Enum
from typing import Any

from pydantic import BaseModel, Field, model_validator


def utc_now() -> datetime:
    return datetime.now(UTC)


class Severity(str, Enum):
    INFO = "info"
    LOW = "low"
    MEDIUM = "medium"
    HIGH = "high"
    CRITICAL = "critical"


class Confidence(str, Enum):
    LOW = "low"
    MEDIUM = "medium"
    HIGH = "high"


class FindingStatus(str, Enum):
    STATIC_CANDIDATE = "static_candidate"
    DYNAMIC_CONFIRMED = "dynamic_confirmed"
    REFUTED = "refuted"
    INCONCLUSIVE = "inconclusive"


class EvidenceType(str, Enum):
    MANIFEST = "manifest"
    SOURCE = "source"
    SMALI = "smali"
    STRING = "string"
    CONFIG = "config"
    LOGCAT = "logcat"
    TRAFFIC = "traffic"
    SCREENSHOT = "screenshot"
    ADB = "adb"
    FRIDA = "frida"
    TOOL_OUTPUT = "tool_output"
    REPORT = "report"
    OTHER = "other"


class ArtifactKind(str, Enum):
    APKTOOL_OUTPUT = "apktool_output"
    JADX_OUTPUT = "jadx_output"
    MANIFEST = "manifest"
    SOURCE_FILE = "source_file"
    LOG = "log"
    TRAFFIC = "traffic"
    SCREENSHOT = "screenshot"
    REPORT = "report"
    JSON = "json"
    ZIP = "zip"
    OTHER = "other"


class HypothesisStatus(str, Enum):
    OPEN = "open"
    SELECTED_FOR_VERIFICATION = "selected_for_verification"
    CONFIRMED = "confirmed"
    REFUTED = "refuted"
    INCONCLUSIVE = "inconclusive"


class VerificationStatus(str, Enum):
    CONFIRMED = "confirmed"
    REFUTED = "refuted"
    INCONCLUSIVE = "inconclusive"
    ERROR = "error"


class Evidence(BaseModel):
    evidence_id: str
    case_id: str
    evidence_type: EvidenceType
    source_tool: str
    artifact_path: str | None = None
    selector: str | None = None
    snippet: str | None = None
    command: str | None = None
    sha256: str | None = None
    timestamp: datetime = Field(default_factory=utc_now)
    metadata: dict[str, Any] = Field(default_factory=dict)


class Artifact(BaseModel):
    artifact_id: str
    case_id: str
    kind: ArtifactKind
    name: str
    path: str
    mime_type: str | None = None
    size_bytes: int | None = None
    sha256: str | None = None
    created_at: datetime = Field(default_factory=utc_now)
    downloadable: bool = True
    previewable: bool = False
    metadata: dict[str, Any] = Field(default_factory=dict)


class Finding(BaseModel):
    finding_id: str
    case_id: str
    title: str
    description: str
    severity: Severity
    confidence: Confidence
    status: FindingStatus
    category: str = ""
    masvs_refs: list[str] = Field(default_factory=list)
    cwe_refs: list[str] = Field(default_factory=list)
    affected_components: list[str] = Field(default_factory=list)
    evidence_ids: list[str] = Field(default_factory=list)
    impact: str = ""
    reproduction_steps: list[str] = Field(default_factory=list)
    remediation: str = ""
    references: list[str] = Field(default_factory=list)
    metadata: dict[str, Any] = Field(default_factory=dict)

    @model_validator(mode="after")
    def validate_finding(self) -> Finding:
        if self.status == FindingStatus.DYNAMIC_CONFIRMED and not self.evidence_ids:
            raise ValueError("dynamic_confirmed findings require at least one evidence_id")

        if (
            self.severity in {Severity.HIGH, Severity.CRITICAL}
            and self.confidence == Confidence.LOW
            and self.status != FindingStatus.INCONCLUSIVE
        ):
            raise ValueError("high or critical findings cannot have low confidence")

        return self


class Hypothesis(BaseModel):
    hypothesis_id: str
    case_id: str
    title: str
    rationale: str
    related_evidence_ids: list[str] = Field(default_factory=list)
    proposed_dynamic_checks: list[str] = Field(default_factory=list)
    confidence: Confidence
    status: HypothesisStatus
    metadata: dict[str, Any] = Field(default_factory=dict)


class VerificationResult(BaseModel):
    verification_id: str
    case_id: str
    hypothesis_id: str
    status: VerificationStatus
    evidence_ids: list[str] = Field(default_factory=list)
    steps_executed: list[str] = Field(default_factory=list)
    notes: str = ""
    metadata: dict[str, Any] = Field(default_factory=dict)

    @model_validator(mode="after")
    def validate_verification_result(self) -> VerificationResult:
        if self.status == VerificationStatus.CONFIRMED and not self.evidence_ids:
            raise ValueError("confirmed verification results require at least one evidence_id")

        return self
