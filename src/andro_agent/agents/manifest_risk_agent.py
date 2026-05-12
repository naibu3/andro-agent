from __future__ import annotations

import json
import logging
import re
from typing import Any

from andro_agent.core.config import settings
from andro_agent.core.state import CaseState

logger = logging.getLogger(__name__)


class ManifestRiskAgent:
    def __init__(self, model_id: str | None = None):
        if not settings.openrouter_api_key:
            raise RuntimeError("OPENROUTER_API_KEY not configured")

        self.model_id = model_id or settings.openrouter_model_id

        from agno.agent import Agent
        from agno.models.openrouter import OpenRouter

        self.agent = Agent(
            model=OpenRouter(
                id=self.model_id,
                api_key=settings.openrouter_api_key,
            ),
            description="Android manifest security analyst.",
            instructions=self._build_instructions(),
            expected_output=(
                'Valid JSON only with this schema: '
                '{"summary": str, "attack_surface": [str], "top_risks": [str], '
                '"abuse_hypotheses": [str], "recommended_next_steps": [str]}'
            ),
            markdown=False,
        )

    def _build_instructions(self) -> list[str]:
        return [
            "You analyze only Android manifest-related evidence.",
            "Focus on exported components, permissions, insecure flags, and attack surface.",
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
                "attack_surface": [],
                "top_risks": [],
                "abuse_hypotheses": [],
                "recommended_next_steps": [],
                "raw_response": str(content),
            }

        text = content.strip()
        if not text:
            return {
                "summary": "Empty response from model.",
                "attack_surface": [],
                "top_risks": [],
                "abuse_hypotheses": [],
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
            "attack_surface": [],
            "top_risks": [],
            "abuse_hypotheses": [],
            "recommended_next_steps": [],
            "raw_response": text,
        }

    def build_prompt(self, state: CaseState) -> str:
        if not state.static_analysis_bundle_path or not state.static_analysis_bundle_path.exists():
            raise RuntimeError("Static analysis bundle not available")

        bundle = json.loads(state.static_analysis_bundle_path.read_text(encoding="utf-8"))

        manifest_view = {
            "case_id": bundle.get("case_id"),
            "apk_path": bundle.get("apk_path"),
            "manifest": bundle.get("manifest"),
            "manifest_facts": bundle.get("manifest_facts", []),
            "manifest_findings": bundle.get("manifest_findings", []),
            "summary": {
                "exported_components": bundle.get("summary", {}).get("exported_components", 0),
                "dangerous_permissions": bundle.get("summary", {}).get("dangerous_permissions", 0),
                "manifest_findings": bundle.get("summary", {}).get("manifest_findings", 0),
            },
        }

        return f"""
MANIFEST ANALYSIS VIEW:
{json.dumps(manifest_view, indent=2, ensure_ascii=False)}
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