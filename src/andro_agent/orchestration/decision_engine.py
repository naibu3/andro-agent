from __future__ import annotations

from typing import Any

from andro_agent.agents.dynamic.decision_agent import AgenticDecisionAgent
from andro_agent.orchestration.evidence_context import build_evidence_context
from andro_agent.orchestration.task_models import DynamicTask, TaskExecutionResult
from andro_agent.orchestration.task_validator import validate_agent_tasks


class DecisionEngine:
    def __init__(
        self,
        agent: AgenticDecisionAgent | None = None,
        enable_agentic_decisions: bool = False,
    ) -> None:
        self.agent = agent
        self.enable_agentic_decisions = enable_agentic_decisions

    def decide_followups(
        self,
        task: DynamicTask,
        result: TaskExecutionResult,
        state: Any,
    ) -> list[DynamicTask]:
        followups: list[DynamicTask] = []

        followups.extend(self._deterministic_followups(task, result, state))

        if self.enable_agentic_decisions and self.agent:
            context = build_evidence_context(
                task_observations=result.observations,
                recent_findings=[],
            )
            agent_tasks = self.agent.decide_followups(
                current_task=task,
                evidence_context=context,
            )
            followups.extend(validate_agent_tasks(agent_tasks))

        return followups

    def _deterministic_followups(
        self,
        task: DynamicTask,
        result: TaskExecutionResult,
        state: Any,
    ) -> list[DynamicTask]:
        # De momento conserva esto simple.
        return []