from __future__ import annotations

import json
from pathlib import Path

from andro_agent.facts.manifest_facts import build_manifest_facts
from andro_agent.models import BuildManifestFactsInput


def test_build_manifest_facts(tmp_path: Path) -> None:
    manifest_json = tmp_path / "manifest.json"
    manifest_json.write_text(
        json.dumps(
            {
                "package_name": "com.example.app",
                "version_code": "1",
                "version_name": "1.0",
                "min_sdk": "21",
                "target_sdk": "33",
                "compile_sdk_version": None,
                "permissions": [
                    "android.permission.INTERNET",
                    "android.permission.READ_EXTERNAL_STORAGE",
                ],
                "application": {
                    "debuggable": True,
                    "allow_backup": False,
                    "uses_cleartext_traffic": True,
                    "network_security_config": None,
                    "request_legacy_external_storage": None,
                    "test_only": False,
                    "full_backup_content": None,
                },
                "activities": [
                    {
                        "name": ".MainActivity",
                        "exported": True,
                        "exported_source": "explicit",
                        "permission": None,
                        "enabled": True,
                        "intent_filters": [],
                        "authorities": None,
                        "read_permission": None,
                        "write_permission": None,
                        "grant_uri_permissions": None,
                    }
                ],
                "activity_aliases": [],
                "services": [],
                "receivers": [],
                "providers": [],
            }
        ),
        encoding="utf-8",
    )

    result = build_manifest_facts(
        BuildManifestFactsInput(
            manifest_json_path=manifest_json,
            case_id="test_case",
            artifacts_dir=tmp_path / "artifacts",
        )
    )

    assert result.success is True
    assert result.facts_path is not None
    assert result.facts_path.exists()
    assert len(result.facts) > 0

    fact_types = {fact.type for fact in result.facts}
    assert "manifest.package" in fact_types
    assert "manifest.application.debuggable" in fact_types
    assert "manifest.permission" in fact_types
    assert "manifest.component.activity.exported" in fact_types