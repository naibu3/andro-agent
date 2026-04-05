from __future__ import annotations

import json
import re
from pathlib import Path

from andro_agent.models import (
    CodeSearchInput,
    CodeSearchMatch,
    CodeSearchOutput,
    CodeSearchPattern,
)
from andro_agent.tools.base import BaseTool


DEFAULT_PATTERNS = [
    CodeSearchPattern(
        name="webview_loadUrl",
        pattern=r"\.loadUrl\s*\(",
        category="webview",
        description="Potential WebView URL loading sink",
    ),
    CodeSearchPattern(
        name="webview_addJavascriptInterface",
        pattern=r"addJavascriptInterface\s*\(",
        category="webview",
        description="Potential JavaScript bridge exposure",
    ),
    CodeSearchPattern(
        name="sql_rawQuery",
        pattern=r"\.rawQuery\s*\(",
        category="sql",
        description="Potential raw SQL query usage",
    ),
    CodeSearchPattern(
        name="sql_execSQL",
        pattern=r"\.execSQL\s*\(",
        category="sql",
        description="Potential raw SQL execution",
    ),
    CodeSearchPattern(
        name="hardcoded_http",
        pattern=r"\"http://[^\"]+\"",
        category="network",
        description="Hardcoded cleartext URL",
    ),
    CodeSearchPattern(
        name="runtime_exec",
        pattern=r"Runtime\.getRuntime\(\)\.exec\s*\(",
        category="command_execution",
        description="Potential command execution sink",
    ),
    CodeSearchPattern(
        name="sharedprefs_write",
        pattern=r"getSharedPreferences\s*\(",
        category="storage",
        description="SharedPreferences access",
    ),
    CodeSearchPattern(
        name="file_output_stream",
        pattern=r"FileOutputStream\s*\(",
        category="storage",
        description="File write usage",
    ),
    CodeSearchPattern(
        name="base64_decode",
        pattern=r"Base64\.decode\s*\(",
        category="encoding",
        description="Potential encoded secrets or payload decoding",
    ),
    CodeSearchPattern(
        name="cipher_instance",
        pattern=r"Cipher\.getInstance\s*\(",
        category="crypto",
        description="Cryptographic primitive usage",
    ),
]

class CodeSearchTool(BaseTool):
    name = "code_search"
    description = "Search decompiled JADX sources for interesting security patterns"

    def __init__(self, patterns: list[CodeSearchPattern] | None = None):
        self.patterns = patterns or DEFAULT_PATTERNS

    def run(self, input_data: CodeSearchInput) -> CodeSearchOutput:
        if not input_data.source_dir.exists():
            return CodeSearchOutput(
                success=False,
                errors=[f"Source directory not found: {input_data.source_dir}"],
            )

        matches: list[CodeSearchMatch] = []

        for file_path in input_data.source_dir.rglob("*"):
            if not file_path.is_file():
                continue
            if file_path.suffix.lower() not in {".java", ".kt", ".xml", ".txt"}:
                continue

            try:
                lines = file_path.read_text(encoding="utf-8", errors="ignore").splitlines()
            except Exception:
                continue

            for idx, line in enumerate(lines, start=1):
                for pattern in self.patterns:
                    if re.search(pattern.pattern, line):
                        matches.append(
                            CodeSearchMatch(
                                pattern_name=pattern.name,
                                category=pattern.category,
                                file_path=str(file_path),
                                line_number=idx,
                                line_text=line.strip()[:500],
                            )
                        )

        results_dir = input_data.artifacts_dir / input_data.case_id / "code_search"
        results_dir.mkdir(parents=True, exist_ok=True)

        results_path = results_dir / "code_search_results.json"
        results_path.write_text(
            json.dumps([m.model_dump() for m in matches], indent=2, ensure_ascii=False),
            encoding="utf-8",
        )

        return CodeSearchOutput(
            success=True,
            results_path=results_path,
            matches=matches,
        )