from __future__ import annotations

import json
from collections import defaultdict
from pathlib import Path

from andro_agent.models import (
    ApplyManifestRulesInput,
    ApplyManifestRulesOutput,
    Fact,
    Finding,
)


def _load_facts(facts_json_path: Path) -> list[Fact]:
    raw = json.loads(facts_json_path.read_text(encoding="utf-8"))
    return [Fact.model_validate(item) for item in raw]


def _group_facts_by_type(facts: list[Fact]) -> dict[str, list[Fact]]:
    grouped: dict[str, list[Fact]] = defaultdict(list)
    for fact in facts:
        grouped[fact.type].append(fact)
    return dict(grouped)


def _add_finding(
    findings: list[Finding],
    rule_id: str,
    title: str,
    description: str,
    severity: str,
    evidence: list[dict],
    metadata: dict | None = None,
) -> None:
    findings.append(
        Finding(
            rule_id=rule_id,
            title=title,
            description=description,
            severity=severity,
            evidence=evidence,
            metadata=metadata or {},
        )
    )


def apply_manifest_rules(input_data: ApplyManifestRulesInput) -> ApplyManifestRulesOutput:
    facts_json_path = input_data.facts_json_path

    if not facts_json_path.exists():
        return ApplyManifestRulesOutput(
            success=False,
            errors=[f"Facts JSON not found: {facts_json_path}"],
        )

    try:
        facts = _load_facts(facts_json_path)
    except Exception as exc:
        return ApplyManifestRulesOutput(
            success=False,
            errors=[f"Failed to load facts JSON: {exc}"],
        )

    grouped = _group_facts_by_type(facts)
    findings: list[Finding] = []

    # Rule: debuggable enabled
    for fact in grouped.get("manifest.application.debuggable", []):
        if fact.value is True:
            _add_finding(
                findings,
                rule_id="MANIFEST_DEBUGGABLE_ENABLED",
                title="Application is debuggable",
                description="The application has android:debuggable enabled, which may ease runtime analysis and abuse in non-production contexts.",
                severity="medium",
                evidence=[fact.model_dump()],
            )

    # Rule: allowBackup enabled
    for fact in grouped.get("manifest.application.allow_backup", []):
        if fact.value is True:
            _add_finding(
                findings,
                rule_id="MANIFEST_ALLOW_BACKUP_ENABLED",
                title="Application allows backups",
                description="The application has android:allowBackup enabled, which may expose app data to backup/restore abuse depending on platform and deployment context.",
                severity="medium",
                evidence=[fact.model_dump()],
            )

    # Rule: cleartext traffic enabled
    for fact in grouped.get("manifest.application.uses_cleartext_traffic", []):
        if fact.value is True:
            _add_finding(
                findings,
                rule_id="MANIFEST_CLEARTEXT_TRAFFIC_ENABLED",
                title="Application allows cleartext traffic",
                description="The application has android:usesCleartextTraffic enabled, which may allow unencrypted network communications.",
                severity="medium",
                evidence=[fact.model_dump()],
            )

    component_types = ["activity", "activity_alias", "service", "receiver", "provider"]

    for component_type in component_types:
        exported_facts = grouped.get(f"manifest.component.{component_type}.exported", [])
        permission_facts = grouped.get(f"manifest.component.{component_type}.permission", [])

        permissions_by_component = {fact.key: fact for fact in permission_facts}

        for fact in exported_facts:
            if fact.value is True:
                _add_finding(
                    findings,
                    rule_id=f"MANIFEST_EXPORTED_{component_type.upper()}",
                    title=f"Exported {component_type} detected",
                    description=f"The {component_type} '{fact.key}' is exported and may be reachable by external applications.",
                    severity="medium",
                    evidence=[fact.model_dump()],
                    metadata={"component_type": component_type, "component_name": fact.key},
                )

                if fact.key not in permissions_by_component:
                    _add_finding(
                        findings,
                        rule_id=f"MANIFEST_EXPORTED_{component_type.upper()}_NO_PERMISSION",
                        title=f"Exported {component_type} without permission",
                        description=f"The exported {component_type} '{fact.key}' does not declare a protecting permission.",
                        severity="high",
                        evidence=[fact.model_dump()],
                        metadata={"component_type": component_type, "component_name": fact.key},
                    )

    # Provider-specific rules
    provider_grant_uri = grouped.get(
        "manifest.component.provider.grant_uri_permissions", []
    )
    for fact in provider_grant_uri:
        if fact.value is True:
            _add_finding(
                findings,
                rule_id="MANIFEST_PROVIDER_GRANT_URI_PERMISSIONS",
                title="Provider grants URI permissions",
                description=f"The provider '{fact.key}' has grantUriPermissions enabled.",
                severity="medium",
                evidence=[fact.model_dump()],
                metadata={"component_type": "provider", "component_name": fact.key},
            )

    findings_dir = input_data.artifacts_dir / input_data.case_id / "findings"
    findings_dir.mkdir(parents=True, exist_ok=True)

    findings_path = findings_dir / "manifest_findings.json"
    findings_path.write_text(
        json.dumps([finding.model_dump() for finding in findings], indent=2, ensure_ascii=False),
        encoding="utf-8",
    )

    return ApplyManifestRulesOutput(
        success=True,
        findings_path=findings_path,
        findings=findings,
    )