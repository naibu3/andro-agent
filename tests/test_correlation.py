from __future__ import annotations

import json
from pathlib import Path

from andro_agent.correlation.manifest_code_correlation import apply_manifest_code_correlation
from andro_agent.models import ApplyCorrelationRulesInput


def test_apply_manifest_code_correlation(tmp_path: Path) -> None:
    case_dir = tmp_path / "artifacts" / "case1"
    (case_dir / "facts").mkdir(parents=True, exist_ok=True)
    (case_dir / "findings").mkdir(parents=True, exist_ok=True)

    manifest_facts = [
        {
            "type": "manifest.component.activity.exported",
            "key": ".WebViewActivity",
            "value": True,
            "source": "manifest",
            "metadata": {"component_type": "activity"},
        },
        {
            "type": "manifest.application.debuggable",
            "key": "debuggable",
            "value": True,
            "source": "manifest",
            "metadata": {},
        },
    ]

    code_facts = [
        {
            "type": "code.pattern.webview_loadUrl",
            "key": "/tmp/WebViewActivity.java",
            "value": True,
            "source": "code_search",
            "metadata": {"line_number": 12, "line_text": "webView.loadUrl(url);"},
        },
        {
            "type": "code.pattern.hardcoded_http",
            "key": "/tmp/Net.java",
            "value": True,
            "source": "code_search",
            "metadata": {"line_number": 8, "line_text": 'String u = "http://a";'},
        },
    ]

    (case_dir / "facts" / "manifest_facts.json").write_text(
        json.dumps(manifest_facts), encoding="utf-8"
    )
    (case_dir / "facts" / "code_search_facts.json").write_text(
        json.dumps(code_facts), encoding="utf-8"
    )
    (case_dir / "findings" / "manifest_findings.json").write_text("[]", encoding="utf-8")
    (case_dir / "findings" / "code_findings.json").write_text("[]", encoding="utf-8")

    result = apply_manifest_code_correlation(
        ApplyCorrelationRulesInput(case_id="case1", artifacts_dir=tmp_path / "artifacts")
    )

    assert result.success is True
    assert result.findings_path is not None
    assert result.findings_path.exists()

    rule_ids = {finding.rule_id for finding in result.findings}
    assert "CORRELATED_EXPORTED_COMPONENT_WEBVIEW" in rule_ids
    assert "CORRELATED_DEBUGGABLE_HTTP" in rule_ids