from __future__ import annotations

import json
import logging

from andro_agent.core.config import settings
from andro_agent.core.state import CaseState

from agno.agent import Agent
from agno.models.openrouter import OpenRouter

logger = logging.getLogger(__name__)


class MarkdownReportAgent:
    def __init__(self, model_id: str | None = None):
        if not settings.openrouter_api_key:
            raise RuntimeError("OPENROUTER_API_KEY not configured")

        self.agent = Agent(
            model=OpenRouter(
                id=model_id or settings.openrouter_model_id,
                api_key=settings.openrouter_api_key,
            ),
            description="Technical security report writer for Android static analysis.",
            instructions=self._build_instructions(),
            markdown=True,
        )

    def _build_instructions(self) -> list[str]:
        return [
            "You receive a static analysis bundle and a prior reasoning JSON.",
            "Write a concise but useful Markdown report in Spanish.",
            "The report must be technical and readable.",
            "Do not invent evidence that is not present in the inputs.",
            "Prefer correlated and higher-confidence issues over isolated weak signals.",
            "Include concrete next steps for manual validation.",
            "Use headings and bullet points only when useful.",
        ]

    def run(self, state: CaseState) -> dict[str, str]:
        logger.info("[%s] Running MarkdownReportAgent", state.case_id)

        if not state.static_analysis_bundle_path or not state.static_analysis_bundle_path.exists():
            raise RuntimeError("Static analysis bundle not available")

        if not state.analysis_path or not state.analysis_path.exists():
            raise RuntimeError("Analysis reasoning JSON not available")

        bundle = json.loads(state.static_analysis_bundle_path.read_text(encoding="utf-8"))
        reasoning = json.loads(state.analysis_path.read_text(encoding="utf-8"))

        prompt = f"""
STATIC ANALYSIS BUNDLE:
{json.dumps(bundle, indent=2, ensure_ascii=False)}

PRIOR REASONING JSON:
{json.dumps(reasoning, indent=2, ensure_ascii=False)}

Write a Markdown report with this structure:

# Static Analysis Report
## Resumen ejecutivo
## Superficie de ataque
## Hallazgos del manifest
## Hallazgos de código
## Riesgos prioritarios
## Posibles candidatos de vulnerabilidad
## Siguientes pasos recomendados
"""

        response = self.agent.run(prompt)
        content = getattr(response, "content", None)
        markdown = content if isinstance(content, str) else str(content)

        return {
            "markdown": markdown
        }