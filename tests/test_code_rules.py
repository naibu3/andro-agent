from __future__ import annotations

import json
from pathlib import Path

from andro_agent.models import ApplyCodeRulesInput, Fact
from andro_agent.rules.code_rules import apply_code_rules


def test_apply_code_rules(tmp_path: Path) -> None:
    facts_json = tmp_path / "code_facts.json"
    facts = [
        Fact(
            type="code.pattern.webview_loadUrl",
            key="MainActivity.java",
            value=True,
            source="code_search",
            metadata={"line_number": 10, "line_text": "webView.loadUrl(...)"},
        ),
        Fact(
            type="code.pattern.sql_rawQuery",
            key="DB.java",
            value=True,
            source="code_search",
            metadata={"line_number": 22, "line_text": "db.rawQuery(...)"},
        ),
    ]

    facts_json.write_text(
        json.dumps([fact.model_dump() for fact in facts], indent=2),
        encoding="utf-8",
    )

    result = apply_code_rules(
        ApplyCodeRulesInput(
            facts_json_path=facts_json,
            case_id="test_case",
            artifacts_dir=tmp_path / "artifacts",
        )
    )

    assert result.success is True
    assert result.findings_path is not None
    assert result.findings_path.exists()

    rule_ids = {finding.rule_id for finding in result.findings}
    assert "CODE_WEBVIEW_LOADURL" in rule_ids
    assert "CODE_SQL_RAWQUERY" in rule_ids