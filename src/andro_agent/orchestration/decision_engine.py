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
        llm_provider: str | None = None,
        llm_model: str | None = None,
    ) -> None:
        self.enable_agentic_decisions = enable_agentic_decisions
        self.llm_provider = llm_provider
        self.llm_model = llm_model

        if agent is not None:
            self.agent = agent
        elif llm_provider is not None or llm_model is not None:
            self.agent = AgenticDecisionAgent(
                provider=llm_provider,
                model_id=llm_model,
            )
        else:
            self.agent = None

    def configure_llm(
        self,
        llm_provider: str | None = None,
        llm_model: str | None = None,
    ) -> None:
        """
        Configure or rebuild the agentic decision agent.

        This is useful when the pipeline is created before the CLI options
        are known, or when run(...) receives provider/model overrides.
        """
        self.llm_provider = llm_provider
        self.llm_model = llm_model

        if llm_provider is not None or llm_model is not None:
            self.agent = AgenticDecisionAgent(
                provider=llm_provider,
                model_id=llm_model,
            )

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
            try:
                agent_tasks = self.agent.decide_followups(
                    current_task=task,
                    evidence_context=context,
                )
                validated = validate_agent_tasks(agent_tasks)
                followups.extend(validated)
                self._record_agentic_decision(state, task, len(validated), None)
            except Exception as exc:  # noqa: BLE001 - dynamic MVP must preserve the basic run
                self._record_agentic_decision(state, task, 0, str(exc))

        return followups

    @staticmethod
    def _record_agentic_decision(
        state: Any, task: DynamicTask, followups: int, error: str | None
    ) -> None:
        if not isinstance(state, dict):
            return
        case_state = state.get("case_state")
        if case_state is None:
            return
        case_state.tool_history.append(
            {
                "tool": "dynamic.agentic_decision",
                "task_id": task.task_id,
                "followups": followups,
                "success": error is None,
                "error": error,
            }
        )
        if error:
            case_state.warnings.append(f"Dynamic agentic decision failed: {error}")

    def _deterministic_followups(
        self,
        task: DynamicTask,
        result: TaskExecutionResult,
        state: Any,
    ) -> list[DynamicTask]:
        # De momento conserva esto simple.
        return []
