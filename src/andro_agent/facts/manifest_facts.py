from __future__ import annotations

import json
from pathlib import Path

from andro_agent.models import (
    BuildManifestFactsInput,
    BuildManifestFactsOutput,
    Fact,
    ManifestData,
)


def _add_fact(facts: list[Fact], fact_type: str, key: str, value, metadata: dict | None = None) -> None:
    facts.append(
        Fact(
            type=fact_type,
            key=key,
            value=value,
            source="manifest",
            metadata=metadata or {},
        )
    )


def build_manifest_facts(input_data: BuildManifestFactsInput) -> BuildManifestFactsOutput:
    manifest_json_path = input_data.manifest_json_path

    if not manifest_json_path.exists():
        return BuildManifestFactsOutput(
            success=False,
            errors=[f"Manifest JSON not found: {manifest_json_path}"],
        )

    try:
        raw_data = json.loads(manifest_json_path.read_text(encoding="utf-8"))
        manifest = ManifestData.model_validate(raw_data)
    except Exception as exc:
        return BuildManifestFactsOutput(
            success=False,
            errors=[f"Failed to load/validate manifest JSON: {exc}"],
        )

    facts: list[Fact] = []

    # General package / version / sdk
    if manifest.package_name:
        _add_fact(facts, "manifest.package", "package_name", manifest.package_name)

    if manifest.version_code:
        _add_fact(facts, "manifest.version_code", "version_code", manifest.version_code)

    if manifest.version_name:
        _add_fact(facts, "manifest.version_name", "version_name", manifest.version_name)

    if manifest.min_sdk:
        _add_fact(facts, "manifest.min_sdk", "min_sdk", manifest.min_sdk)

    if manifest.target_sdk:
        _add_fact(facts, "manifest.target_sdk", "target_sdk", manifest.target_sdk)

    if manifest.compile_sdk_version:
        _add_fact(
            facts,
            "manifest.compile_sdk_version",
            "compile_sdk_version",
            manifest.compile_sdk_version,
        )

    # Application flags
    app = manifest.application

    if app.debuggable is not None:
        _add_fact(facts, "manifest.application.debuggable", "debuggable", app.debuggable)

    if app.allow_backup is not None:
        _add_fact(facts, "manifest.application.allow_backup", "allow_backup", app.allow_backup)

    if app.uses_cleartext_traffic is not None:
        _add_fact(
            facts,
            "manifest.application.uses_cleartext_traffic",
            "uses_cleartext_traffic",
            app.uses_cleartext_traffic,
        )

    if app.network_security_config is not None:
        _add_fact(
            facts,
            "manifest.application.network_security_config",
            "network_security_config",
            app.network_security_config,
        )

    if app.request_legacy_external_storage is not None:
        _add_fact(
            facts,
            "manifest.application.request_legacy_external_storage",
            "request_legacy_external_storage",
            app.request_legacy_external_storage,
        )

    if app.test_only is not None:
        _add_fact(facts, "manifest.application.test_only", "test_only", app.test_only)

    if app.full_backup_content is not None:
        _add_fact(
            facts,
            "manifest.application.full_backup_content",
            "full_backup_content",
            app.full_backup_content,
        )

    # Permissions
    for permission in manifest.permissions:
        _add_fact(
            facts,
            "manifest.permission",
            permission,
            True,
        )

    # Components helper
    def add_components(component_type: str, components) -> None:
        for component in components:
            component_name = component.name or "<unnamed>"

            _add_fact(
                facts,
                f"manifest.component.{component_type}.present",
                component_name,
                True,
                metadata={"component_type": component_type},
            )

            if component.exported is not None:
                _add_fact(
                    facts,
                    f"manifest.component.{component_type}.exported",
                    component_name,
                    component.exported,
                    metadata={
                        "component_type": component_type,
                        "exported_source": component.exported_source,
                    },
                )

            if component.permission is not None:
                _add_fact(
                    facts,
                    f"manifest.component.{component_type}.permission",
                    component_name,
                    component.permission,
                    metadata={"component_type": component_type},
                )

            if component.enabled is not None:
                _add_fact(
                    facts,
                    f"manifest.component.{component_type}.enabled",
                    component_name,
                    component.enabled,
                    metadata={"component_type": component_type},
                )

            if component.intent_filters:
                _add_fact(
                    facts,
                    f"manifest.component.{component_type}.intent_filters_count",
                    component_name,
                    len(component.intent_filters),
                    metadata={"component_type": component_type},
                )

            if component_type == "provider":
                if component.authorities is not None:
                    _add_fact(
                        facts,
                        "manifest.component.provider.authorities",
                        component_name,
                        component.authorities,
                    )
                if component.read_permission is not None:
                    _add_fact(
                        facts,
                        "manifest.component.provider.read_permission",
                        component_name,
                        component.read_permission,
                    )
                if component.write_permission is not None:
                    _add_fact(
                        facts,
                        "manifest.component.provider.write_permission",
                        component_name,
                        component.write_permission,
                    )
                if component.grant_uri_permissions is not None:
                    _add_fact(
                        facts,
                        "manifest.component.provider.grant_uri_permissions",
                        component_name,
                        component.grant_uri_permissions,
                    )

    add_components("activity", manifest.activities)
    add_components("activity_alias", manifest.activity_aliases)
    add_components("service", manifest.services)
    add_components("receiver", manifest.receivers)
    add_components("provider", manifest.providers)

    facts_dir = input_data.artifacts_dir / input_data.case_id / "facts"
    facts_dir.mkdir(parents=True, exist_ok=True)

    facts_path = facts_dir / "manifest_facts.json"
    facts_path.write_text(
        json.dumps([fact.model_dump() for fact in facts], indent=2, ensure_ascii=False),
        encoding="utf-8",
    )

    return BuildManifestFactsOutput(
        success=True,
        facts_path=facts_path,
        facts=facts,
    )