from __future__ import annotations

from andro_agent.orchestration.task_models import DynamicTask


ALLOWED_TASK_KINDS = {
    "launch_app",
    "launch_activity",
    "open_deeplink",
    "query_content_provider",
    "analyze_ui_transition",
    "analyze_network",
    "enumerate_provider_paths",
    "pinning_triage",
}


class TaskValidationError(ValueError):
    pass


def validate_agent_tasks(tasks: list[DynamicTask]) -> list[DynamicTask]:
    valid: list[DynamicTask] = []

    for task in tasks:
        if task.kind not in ALLOWED_TASK_KINDS:
            continue

        if task.attempts > 0:
            task.attempts = 0

        task.status = "pending"
        valid.append(task)

    return valid