from __future__ import annotations

import json
import logging
import re
from collections import Counter, defaultdict
from pathlib import Path
from typing import Any

from andro_agent.core.llm import build_llm_model, get_llm_metadata
from andro_agent.core.state import CaseState

logger = logging.getLogger(__name__)


class CodeRiskAgent:
    def __init__(self, model_id: str | None = None, provider: str | None = None):
        metadata = get_llm_metadata(model_id=model_id, provider=provider)
        self.model_id = metadata["model"]

        from agno.agent import Agent

        self.agent = Agent(
            model=build_llm_model(model_id=self.model_id, provider=metadata["provider"]),
            description="Android code security analyst.",
            instructions=self._build_instructions(),
            expected_output=(
                'Valid JSON only with this schema: '
                '{"summary": str, "top_risks": [str], "vulnerability_hypotheses": [str], '
                '"priority_files": [str], "recommended_next_steps": [str]}'
            ),
            markdown=False,
        )

    def _build_instructions(self) -> list[str]:
        return [
            "You analyze only Android code-related evidence.",
            "Focus on code patterns, code findings, risky APIs, and likely vulnerability candidates.",
            "Prioritize concrete files and code areas when possible.",
            "Do not invent evidence not present in the input.",
            "Return concise JSON only.",
            "Do not use markdown fences.",
            "Use at most 5 items per list.",
        ]

    def _parse_response_content(self, content: Any) -> dict[str, Any]:
        if isinstance(content, dict):
            return content
        if not isinstance(content, str):
            return {
                "summary": "Unexpected non-text response from model.",
                "top_risks": [],
                "vulnerability_hypotheses": [],
                "priority_files": [],
                "recommended_next_steps": [],
                "raw_response": str(content),
            }

        text = content.strip()
        if not text:
            return {
                "summary": "Empty response from model.",
                "top_risks": [],
                "vulnerability_hypotheses": [],
                "priority_files": [],
                "recommended_next_steps": [],
                "raw_response": text,
            }

        try:
            return json.loads(text)
        except json.JSONDecodeError:
            pass

        fenced = re.sub(
            r"^```(?:json)?\s*|\s*```$",
            "",
            text,
            flags=re.IGNORECASE | re.DOTALL,
        ).strip()
        try:
            return json.loads(fenced)
        except json.JSONDecodeError:
            pass

        match = re.search(r"\{.*\}", text, flags=re.DOTALL)
        if match:
            try:
                return json.loads(match.group(0))
            except json.JSONDecodeError:
                pass

        return {
            "summary": "Model response could not be parsed as JSON.",
            "top_risks": [],
            "vulnerability_hypotheses": [],
            "priority_files": [],
            "recommended_next_steps": [],
            "raw_response": text,
        }

    def _build_code_view(self, bundle: dict[str, Any]) -> dict[str, Any]:
        matches = bundle.get("code_search_results", [])
        code_findings = bundle.get("code_findings", [])

        by_category = Counter()
        by_pattern = Counter()
        by_file = Counter()
        examples_by_category: dict[str, list[dict[str, Any]]] = defaultdict(list)

        for match in matches:
            category = match.get("category", "unknown")
            pattern_name = match.get("pattern_name", "unknown")
            file_path = match.get("file_path", "unknown")

            by_category[category] += 1
            by_pattern[pattern_name] += 1
            by_file[file_path] += 1

            if len(examples_by_category[category]) < 10:
                examples_by_category[category].append(
                    {
                        "pattern_name": pattern_name,
                        "file_path": file_path,
                        "line_number": match.get("line_number"),
                        "line_text": match.get("line_text"),
                    }
                )

        top_files = [
            {"file_path": file_path, "matches": count}
            for file_path, count in by_file.most_common(15)
        ]

        return {
            "summary": {
                "code_matches": len(matches),
                "code_findings": len(code_findings),
                "by_category": dict(by_category),
                "by_pattern": dict(by_pattern),
            },
            "top_files": top_files,
            "examples_by_category": dict(examples_by_category),
            "code_findings": code_findings[:50],
        }

    def build_prompt(self, state: CaseState) -> str:
        if not state.static_analysis_bundle_path or not state.static_analysis_bundle_path.exists():
            raise RuntimeError("Static analysis bundle not available")

        bundle = json.loads(state.static_analysis_bundle_path.read_text(encoding="utf-8"))
        code_view = self._build_code_view(bundle)

        return f"""
CODE ANALYSIS VIEW:
{json.dumps(code_view, indent=2, ensure_ascii=False)}
"""

    def run_with_prompt(self, prompt: str) -> dict[str, Any]:
        response = self.agent.run(prompt)
        content = getattr(response, "content", None)
        usage = getattr(response, "usage", None)

        if usage and not isinstance(usage, dict):
            usage = {
                "prompt_tokens": getattr(usage, "prompt_tokens", None),
                "completion_tokens": getattr(usage, "completion_tokens", None),
                "total_tokens": getattr(usage, "total_tokens", None),
            }

        parsed = self._parse_response_content(content)
        raw = content if isinstance(content, str) else str(content)

        return {"parsed": parsed, "raw": raw, "usage": usage}

    def run(self, state: CaseState) -> dict[str, Any]:
        prompt = self.build_prompt(state)
        return self.run_with_prompt(prompt)
