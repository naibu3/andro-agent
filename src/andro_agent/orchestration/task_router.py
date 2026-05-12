from __future__ import annotations

from collections.abc import Callable

from andro_agent.orchestration.task_models import DynamicTask


class TaskRouter:
    def __init__(self) -> None:
        self._handlers: dict[str, Callable] = {}

    def register(self, task_kind: str, handler: Callable) -> None:
        self._handlers[task_kind] = handler

    def resolve(self, task: DynamicTask) -> Callable:
        if task.kind not in self._handlers:
            raise KeyError(f"No handler registered for task kind: {task.kind}")
        return self._handlers[task.kind]
