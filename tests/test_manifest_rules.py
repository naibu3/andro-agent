from __future__ import annotations

import json
from pathlib import Path

from andro_agent.models import Fact
from andro_agent.rules.manifest_rules import apply_manifest_rules
from andro_agent.models import ApplyManifestRulesInput


def test_apply_manifest_rules(tmp_path: Path) -> None:
    facts_json = tmp_path / "manifest_facts.json"
    facts = [
        Fact(
            type="manifest.application.debuggable",
            key="debuggable",
            value=True,
        ),
        Fact(
            type="manifest.application.allow_backup",
            key="allow_backup",
            value=True,
        ),
        Fact(
            type="manifest.application.uses_cleartext_traffic",
            key="uses_cleartext_traffic",
            value=True,
        ),
        Fact(
            type="manifest.component.activity.exported",
            key=".MainActivity",
            value=True,
            metadata={"component_type": "activity", "exported_source": "explicit"},
        ),
    ]

    facts_json.write_text(
        json.dumps([fact.model_dump() for fact in facts], indent=2),
        encoding="utf-8",
    )

    result = apply_manifest_rules(
        ApplyManifestRulesInput(
            facts_json_path=facts_json,
            case_id="test_case",
            artifacts_dir=tmp_path / "artifacts",
        )
    )

    assert result.success is True
    assert result.findings_path is not None
    assert result.findings_path.exists()
    assert len(result.findings) >= 4

    rule_ids = {finding.rule_id for finding in result.findings}
    assert "MANIFEST_DEBUGGABLE_ENABLED" in rule_ids
    assert "MANIFEST_ALLOW_BACKUP_ENABLED" in rule_ids
    assert "MANIFEST_CLEARTEXT_TRAFFIC_ENABLED" in rule_ids
    assert "MANIFEST_EXPORTED_ACTIVITY" in rule_ids
    assert "MANIFEST_EXPORTED_ACTIVITY_NO_PERMISSION" in rule_ids