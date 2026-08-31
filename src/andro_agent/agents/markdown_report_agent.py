from __future__ import annotations

import json
import logging

from andro_agent.core.llm import build_llm_model, get_llm_metadata
from andro_agent.core.state import CaseState

logger = logging.getLogger(__name__)


class MarkdownReportAgent:
    def __init__(self, model_id: str | None = None, provider: str | None = None):
        metadata = get_llm_metadata(model_id=model_id, provider=provider)
        self.model_id = metadata["model"]

        from agno.agent import Agent

        self.agent = Agent(
            model=build_llm_model(model_id=self.model_id, provider=metadata["provider"]),
            description="Technical Android static analysis report writer.",
            instructions=self._build_instructions(),
            markdown=True,
        )

    def _build_instructions(self) -> list[str]:
        return [
            "You receive the final static reasoning JSON of an Android APK analysis.",
            "Write a concise but useful Markdown report in Spanish.",
            "The report must be technical, readable, and evidence-based.",
            "Do not invent evidence that is not present in the input.",
            "Include concrete next steps for manual validation.",
        ]

    def build_prompt(self, state: CaseState) -> str:
        if not state.analysis_path or not state.analysis_path.exists():
            raise RuntimeError("Final reasoning JSON not available")

        reasoning = json.loads(state.analysis_path.read_text(encoding="utf-8"))

        return f"""
FINAL STATIC ANALYSIS REASONING JSON:
{json.dumps(reasoning, indent=2, ensure_ascii=False)}

Write a Markdown report with this structure:

# Static Analysis Report
## Resumen ejecutivo
## Riesgos prioritarios
## Correlaciones relevantes
## Posibles candidatos de vulnerabilidad
## Siguientes pasos recomendados
"""

    def run_with_prompt(self, prompt: str) -> dict[str, str]:
        response = self.agent.run(prompt)
        content = getattr(response, "content", None)
        markdown = content if isinstance(content, str) else str(content)
        usage = getattr(response, "usage", None)

        if usage and not isinstance(usage, dict):
            usage = {
                "prompt_tokens": getattr(usage, "prompt_tokens", None),
                "completion_tokens": getattr(usage, "completion_tokens", None),
                "total_tokens": getattr(usage, "total_tokens", None),
            }

        return {
            "markdown": markdown,
            "usage": usage,
        }

    def run(self, state: CaseState) -> dict[str, str]:
        prompt = self.build_prompt(state)
        return self.run_with_prompt(prompt)
