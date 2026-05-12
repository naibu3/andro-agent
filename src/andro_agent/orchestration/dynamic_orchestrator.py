from __future__ import annotations

from typing import Any

from andro_agent.orchestration.task_models import DynamicTask, TaskExecutionResult
from andro_agent.orchestration.task_router import TaskRouter
from andro_agent.orchestration.decision_engine import DecisionEngine


class DynamicOrchestrator:
    def __init__(
        self,
        router: TaskRouter,
        decision_engine: DecisionEngine,
    ) -> None:
        self.router = router
        self.decision_engine = decision_engine

    def run(
        self,
        state: Any,
        initial_tasks: list[DynamicTask],
    ) -> tuple[list[dict[str, Any]], list[str], list[str]]:
        pending: list[DynamicTask] = list(sorted(initial_tasks, key=self._priority_key))
        all_observations: list[dict[str, Any]] = []
        all_artifacts: list[str] = []
        all_errors: list[str] = []

        while pending:
            task = pending.pop(0)
            task.status = "running"
            task.attempts += 1

            handler = self.router.resolve(task)
            result: TaskExecutionResult = handler(task, state)

            if result.success:
                task.status = "done"
            else:
                task.status = "failed"

            all_observations.extend(result.observations)
            all_artifacts.extend(result.artifacts)
            all_errors.extend(result.errors)

            followups = self.decision_engine.decide_followups(
                task=task,
                result=result,
                state=state,
            )
            pending.extend(followups)
            pending.sort(key=self._priority_key)

        return all_observations, all_artifacts, all_errors

    @staticmethod
    def _priority_key(task: DynamicTask) -> int:
        order = {"high": 0, "medium": 1, "low": 2}
        return order.get(task.priority, 1)
