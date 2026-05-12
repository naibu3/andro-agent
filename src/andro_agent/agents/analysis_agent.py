from __future__ import annotations

import json
import logging
import re
from typing import Any

from andro_agent.core.config import settings
from andro_agent.core.state import CaseState

from agno.agent import Agent
from agno.models.openrouter import OpenRouter

logger = logging.getLogger(__name__)


class AnalysisAgent:
    def __init__(self, model_id: str | None = None):
        if not settings.openrouter_api_key:
            raise RuntimeError("OPENROUTER_API_KEY not configured")

        self.agent = Agent(
            model=OpenRouter(
                id=model_id or settings.openrouter_model_id,
                api_key=settings.openrouter_api_key,
            ),
            description="Senior Android application security analyst.",
            instructions=self._build_instructions(),
            expected_output=(
                'Valid JSON only with this schema: '
                '{"summary": str, "top_risks": [str], "correlations": [str], '
                '"vulnerability_candidates": [str], "recommended_next_steps": [str]}'
            ),
            markdown=False,
        )

    def _build_instructions(self) -> list[str]:
        return [
            "You receive a static analysis bundle for an Android APK.",
            "The bundle contains normalized evidence from manifest and code analysis.",
            "Correlate signals across manifest, code patterns, and findings.",
            "Focus on likely security-relevant relationships, not isolated noise.",
            "Identify plausible vulnerability candidates.",
            "Return concise output.",
            "Return valid JSON only.",
            "Do not wrap the JSON in markdown fences.",
            "Do not add explanations before or after the JSON.",
            "Use at most 5 top_risks.",
            "Use at most 5 correlations.",
            "Use at most 5 vulnerability_candidates.",
            "Use at most 5 recommended_next_steps.",
            "Do not use smart quotes.",
        ]

    def _fallback_response(self, raw_text: str, reason: str) -> dict[str, Any]:
        return {
            "summary": reason,
            "top_risks": [],
            "correlations": [],
            "vulnerability_candidates": [],
            "recommended_next_steps": [],
            "raw_response": raw_text,
        }

    def _parse_response_content(self, content: Any) -> dict[str, Any]:
        if isinstance(content, dict):
            return content

        if not isinstance(content, str):
            return self._fallback_response(
                str(content),
                "Unexpected non-text response from model.",
            )

        text = content.strip()
        if not text:
            return self._fallback_response(text, "Empty response from model.")

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
            candidate = match.group(0)
            try:
                return json.loads(candidate)
            except json.JSONDecodeError:
                pass

        return self._fallback_response(text, "Model response could not be parsed as JSON.")

    def build_prompt(self, state: CaseState) -> str:
        if not state.static_analysis_bundle_path or not state.static_analysis_bundle_path.exists():
            raise RuntimeError("Static analysis bundle not available")

        bundle = json.loads(
            state.static_analysis_bundle_path.read_text(encoding="utf-8")
        )

        return f"""
    STATIC ANALYSIS BUNDLE:
    {json.dumps(bundle, indent=2, ensure_ascii=False)}
    """

    def run_with_prompt(self, prompt: str) -> dict[str, Any]:
        response = self.agent.run(prompt)
        content = getattr(response, "content", None)

        parsed = self._parse_response_content(content)
        raw = content if isinstance(content, str) else str(content)

        # intenta sacar usage si existe
        usage = getattr(response, "usage", None)
        if usage and not isinstance(usage, dict):
            usage = {
                "prompt_tokens": getattr(usage, "prompt_tokens", None),
                "completion_tokens": getattr(usage, "completion_tokens", None),
                "total_tokens": getattr(usage, "total_tokens", None),
            }

        return {
            "parsed": parsed,
            "raw": raw,
            "usage": usage,
        }
    
    def run(self, state: CaseState) -> dict[str, Any]:
        prompt = self.build_prompt(state)
        return self.run_with_prompt(prompt)