from __future__ import annotations

import json
import re
from typing import Any

from agno.agent import Agent

from andro_agent.core.llm import build_llm_model, get_llm_metadata
from andro_agent.orchestration.task_models import DynamicTask


class AgenticDecisionAgent:
    def __init__(
        self,
        model_client: Any | None = None,
        provider: str | None = None,
        model_id: str | None = None,
    ) -> None:
        self.model_client = model_client
        self.llm_metadata = get_llm_metadata(
            provider=provider,
            model_id=model_id,
        )

        self.agent: Agent | None = None

        if self.model_client is None:
            self.agent = Agent(
                model=build_llm_model(
                    provider=provider,
                    model_id=model_id,
                ),
                description="Android dynamic analysis planning agent.",
                instructions=[
                    "You are an Android dynamic analysis planning agent.",
                    "You do not execute commands.",
                    "You only propose safe follow-up tasks.",
                    "Return valid JSON only.",
                    "Do not include Markdown fences.",
                    "Do not invent unsupported task kinds.",
                    "Prefer few high-value tasks.",
                    "If evidence is insufficient, return an empty followup_tasks list.",
                ],
                expected_output=(
                    'Valid JSON only with this schema: '
                    '{"followup_tasks": ['
                    '{"task_id": str, "kind": str, "priority": str, '
                    '"target": str|null, "context": object}'
                    "]}"
                ),
                markdown=False,
            )

    def decide_followups(
        self,
        current_task: DynamicTask,
        evidence_context: dict[str, Any],
    ) -> list[DynamicTask]:
        prompt = self._build_prompt(current_task, evidence_context)

        if self.model_client is not None:
            raw = self.model_client.complete_json(prompt)
            return self._parse_tasks(raw)

        if self.agent is None:
            return []

        try:
            response = self.agent.run(prompt)
        except Exception:
            return []

        raw = self._extract_response_payload(response)
        parsed = self._parse_json_payload(raw)

        return self._parse_tasks(parsed)

    def _build_prompt(
        self,
        current_task: DynamicTask,
        evidence_context: dict[str, Any],
    ) -> str:
        return f"""
You are an Android dynamic analysis planning agent.

You do not execute commands. You only propose safe follow-up tasks.

Allowed task kinds:
- launch_app
- launch_activity
- open_deeplink
- query_content_provider
- analyze_ui_transition
- analyze_network
- enumerate_provider_paths
- pinning_triage

Current task:
{current_task.model_dump_json(indent=2)}

Evidence context:
{json.dumps(evidence_context, indent=2)}

Return JSON only:
{{
  "followup_tasks": [
    {{
      "task_id": "agent-task-001",
      "kind": "pinning_triage",
      "priority": "high",
      "target": null,
      "context": {{
        "reason": "..."
      }}
    }}
  ]
}}

Rules:
- Do not invent unsupported task kinds.
- Prefer few high-value tasks.
- Do not repeat the same task unless there is new evidence.
- If evidence is insufficient, return an empty list.
""".strip()

    def _extract_response_payload(self, response: Any) -> Any:
        if response is None:
            return {}

        if isinstance(response, dict):
            return response

        if isinstance(response, str):
            return response

        for attr in ("content", "text", "message", "response"):
            value = getattr(response, attr, None)
            if value:
                return value

        return str(response)

    def _parse_json_payload(self, raw: Any) -> dict[str, Any]:
        if isinstance(raw, dict):
            return raw

        if raw is None:
            return {}

        text = str(raw).strip()

        if not text:
            return {}

        try:
            parsed = json.loads(text)
            if isinstance(parsed, dict):
                return parsed
            return {}
        except json.JSONDecodeError:
            pass

        fenced_match = re.search(
            r"```(?:json)?\s*(\{.*?\})\s*```",
            text,
            flags=re.DOTALL,
        )
        if fenced_match:
            try:
                parsed = json.loads(fenced_match.group(1))
                if isinstance(parsed, dict):
                    return parsed
            except json.JSONDecodeError:
                pass

        object_match = re.search(r"\{.*\}", text, flags=re.DOTALL)
        if object_match:
            try:
                parsed = json.loads(object_match.group(0))
                if isinstance(parsed, dict):
                    return parsed
            except json.JSONDecodeError:
                pass

        return {}

    def _parse_tasks(self, raw: dict[str, Any]) -> list[DynamicTask]:
        tasks: list[DynamicTask] = []

        for item in raw.get("followup_tasks", []):
            try:
                tasks.append(DynamicTask(**item))
            except Exception:
                continue

        return tasks