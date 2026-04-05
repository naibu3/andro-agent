from __future__ import annotations

import json
from pathlib import Path

from andro_agent.facts.code_search_facts import build_code_search_facts
from andro_agent.models import BuildCodeSearchFactsInput


def test_build_code_search_facts(tmp_path: Path) -> None:
    results = tmp_path / "code_search_results.json"
    results.write_text(
        json.dumps(
            [
                {
                    "pattern_name": "webview_loadUrl",
                    "category": "webview",
                    "file_path": "MainActivity.java",
                    "line_number": 10,
                    "line_text": 'webView.loadUrl("http://example.com");',
                }
            ]
        ),
        encoding="utf-8",
    )

    result = build_code_search_facts(
        BuildCodeSearchFactsInput(
            code_search_results_path=results,
            case_id="test_case",
            artifacts_dir=tmp_path / "artifacts",
        )
    )

    assert result.success is True
    assert result.facts_path is not None
    assert result.facts_path.exists()
    assert len(result.facts) >= 2