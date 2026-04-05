from pathlib import Path

from andro_agent.models import CodeSearchInput
from andro_agent.tools.code_search import CodeSearchTool


def test_code_search_finds_patterns(tmp_path: Path) -> None:
    src_dir = tmp_path / "sources"
    src_dir.mkdir(parents=True, exist_ok=True)

    java_file = src_dir / "MainActivity.java"
    java_file.write_text(
        """
        public class MainActivity {
            void test() {
                webView.loadUrl("http://example.com");
                db.rawQuery("SELECT * FROM users", null);
            }
        }
        """,
        encoding="utf-8",
    )

    tool = CodeSearchTool()
    result = tool.run(
        CodeSearchInput(
            source_dir=src_dir,
            case_id="test_case",
            artifacts_dir=tmp_path / "artifacts",
        )
    )

    assert result.success is True
    assert result.results_path is not None
    assert result.results_path.exists()
    assert len(result.matches) >= 2

    names = {m.pattern_name for m in result.matches}
    assert "webview_loadUrl" in names
    assert "sql_rawQuery" in names