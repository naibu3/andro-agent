from __future__ import annotations

from pathlib import Path
from typing import Any

from pydantic import BaseModel, Field


class IntentFilterData(BaseModel):
    actions: list[str] = Field(default_factory=list)
    categories: list[str] = Field(default_factory=list)
    data: list[dict[str, str | None]] = Field(default_factory=list)


class ComponentInfo(BaseModel):
    name: str | None = None
    exported: bool | None = None
    exported_source: str | None = None
    permission: str | None = None
    enabled: bool | None = None
    intent_filters: list[IntentFilterData] = Field(default_factory=list)

    # provider-specific
    authorities: str | None = None
    read_permission: str | None = None
    write_permission: str | None = None
    grant_uri_permissions: bool | None = None


class ApplicationInfo(BaseModel):
    debuggable: bool | None = None
    allow_backup: bool | None = None
    uses_cleartext_traffic: bool | None = None
    network_security_config: str | None = None
    request_legacy_external_storage: bool | None = None
    test_only: bool | None = None
    full_backup_content: str | None = None


class ManifestData(BaseModel):
    package_name: str | None = None
    version_code: str | None = None
    version_name: str | None = None
    min_sdk: str | None = None
    target_sdk: str | None = None
    compile_sdk_version: str | None = None
    permissions: list[str] = Field(default_factory=list)
    application: ApplicationInfo = Field(default_factory=ApplicationInfo)
    activities: list[ComponentInfo] = Field(default_factory=list)
    activity_aliases: list[ComponentInfo] = Field(default_factory=list)
    services: list[ComponentInfo] = Field(default_factory=list)
    receivers: list[ComponentInfo] = Field(default_factory=list)
    providers: list[ComponentInfo] = Field(default_factory=list)


class ExtractManifestInput(BaseModel):
    apk_path: Path
    case_id: str
    artifacts_dir: Path = Path("artifacts")


class ExtractManifestOutput(BaseModel):
    success: bool
    package_name: str | None = None
    decoded_manifest_path: Path | None = None
    parsed_json_path: Path | None = None
    decoded_dir: Path | None = None
    data: dict[str, Any] = Field(default_factory=dict)
    errors: list[str] = Field(default_factory=list)
    warnings: list[str] = Field(default_factory=list)


class Fact(BaseModel):
    type: str
    key: str
    value: Any
    source: str = "manifest"
    confidence: str = "high"
    metadata: dict[str, Any] = Field(default_factory=dict)


class BuildManifestFactsInput(BaseModel):
    manifest_json_path: Path
    case_id: str
    artifacts_dir: Path = Path("artifacts")


class BuildManifestFactsOutput(BaseModel):
    success: bool
    facts_path: Path | None = None
    facts: list[Fact] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)
    warnings: list[str] = Field(default_factory=list)

class Finding(BaseModel):
    rule_id: str
    title: str
    description: str
    severity: str
    confidence: str = "high"
    source: str = "rule_engine"
    evidence: list[dict[str, Any]] = Field(default_factory=list)
    metadata: dict[str, Any] = Field(default_factory=dict)


class ApplyManifestRulesInput(BaseModel):
    facts_json_path: Path
    case_id: str
    artifacts_dir: Path = Path("artifacts")


class ApplyManifestRulesOutput(BaseModel):
    success: bool
    findings_path: Path | None = None
    findings: list[Finding] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)
    warnings: list[str] = Field(default_factory=list)

class JadxDecompileInput(BaseModel):
    apk_path: Path
    case_id: str
    artifacts_dir: Path = Path("artifacts")


class JadxDecompileOutput(BaseModel):
    success: bool
    output_dir: Path | None = None
    java_dir: Path | None = None
    resources_dir: Path | None = None
    errors: list[str] = Field(default_factory=list)
    warnings: list[str] = Field(default_factory=list)


class CodeSearchPattern(BaseModel):
    name: str
    pattern: str
    category: str
    description: str


class CodeSearchMatch(BaseModel):
    pattern_name: str
    category: str
    file_path: str
    line_number: int
    line_text: str


class CodeSearchInput(BaseModel):
    source_dir: Path
    case_id: str
    artifacts_dir: Path = Path("artifacts")


class CodeSearchOutput(BaseModel):
    success: bool
    results_path: Path | None = None
    matches: list[CodeSearchMatch] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)
    warnings: list[str] = Field(default_factory=list)

class BuildCodeSearchFactsInput(BaseModel):
    code_search_results_path: Path
    case_id: str
    artifacts_dir: Path = Path("artifacts")


class BuildCodeSearchFactsOutput(BaseModel):
    success: bool
    facts_path: Path | None = None
    facts: list[Fact] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)
    warnings: list[str] = Field(default_factory=list)


class ApplyCodeRulesInput(BaseModel):
    facts_json_path: Path
    case_id: str
    artifacts_dir: Path = Path("artifacts")


class ApplyCodeRulesOutput(BaseModel):
    success: bool
    findings_path: Path | None = None
    findings: list[Finding] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)
    warnings: list[str] = Field(default_factory=list)

class ApplyCorrelationRulesInput(BaseModel):
    case_id: str
    artifacts_dir: Path = Path("artifacts")


class ApplyCorrelationRulesOutput(BaseModel):
    success: bool
    findings_path: Path | None = None
    findings: list[Finding] = Field(default_factory=list)
    errors: list[str] = Field(default_factory=list)
    warnings: list[str] = Field(default_factory=list)