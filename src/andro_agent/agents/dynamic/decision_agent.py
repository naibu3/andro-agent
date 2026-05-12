from __future__ import annotations

import json
from typing import Any

from andro_agent.orchestration.task_models import DynamicTask


class AgenticDecisionAgent:
    def __init__(self, model_client: Any | None = None) -> None:
        self.model_client = model_client

    def decide_followups(
        self,
        current_task: DynamicTask,
        evidence_context: dict[str, Any],
    ) -> list[DynamicTask]:
        if self.model_client is None:
            return []

        prompt = self._build_prompt(current_task, evidence_context)
        raw = self.model_client.complete_json(prompt)

        return self._parse_tasks(raw)

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

    def _parse_tasks(self, raw: dict[str, Any]) -> list[DynamicTask]:
        tasks: list[DynamicTask] = []

        for item in raw.get("followup_tasks", []):
            try:
                tasks.append(DynamicTask(**item))
            except Exception:
                continue

        return tasks