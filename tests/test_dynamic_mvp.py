from __future__ import annotations

import json
from pathlib import Path

from andro_agent.core.state import CaseState
from andro_agent.orchestration.decision_engine import DecisionEngine
from andro_agent.orchestration.task_models import DynamicTask, TaskExecutionResult
from andro_agent.pipelines.dynamic_pipeline import DynamicAnalysisPipeline


def test_dynamic_pipeline_persists_controlled_emulator_failure(tmp_path, monkeypatch):
    case_id = "dynamic-failure"
    CaseState(case_id=case_id, apk_path=Path("app.apk")).save(tmp_path)
    pipeline = DynamicAnalysisPipeline(artifacts_dir=tmp_path)
    monkeypatch.setattr(
        pipeline,
        "_run_impl",
        lambda **kwargs: (_ for _ in ()).throw(RuntimeError("emulator unavailable")),
    )

    state = pipeline.run(case_id=case_id, apk_path=Path("app.apk"), avd_name="missing")

    assert state.status == "dynamic_failed"
    assert state.errors == ["emulator unavailable"]
    trace = json.loads((tmp_path / case_id / "dynamic/dynamic_trace.json").read_text())
    assert trace["termination_reason"] == "emulator_unavailable"
    assert (tmp_path / case_id / "dynamic/dynamic_results.json").is_file()
    metrics = json.loads((tmp_path / case_id / "metrics/run_metrics_summary.json").read_text())
    assert metrics["dynamic_ran"] is True
    assert metrics["dynamic_status"] == "dynamic_failed"
    assert metrics["dynamic_termination_reason"] == "emulator_unavailable"


def test_dynamic_agentic_llm_failure_becomes_warning():
    class FailingAgent:
        def decide_followups(self, **kwargs):
            raise RuntimeError("LLM returned an empty response")

    state = CaseState(case_id="agentic", apk_path=Path("app.apk"))
    engine = DecisionEngine(agent=FailingAgent(), enable_agentic_decisions=True)
    task = DynamicTask(task_id="task-1", kind="launch_app", priority="high")
    result = TaskExecutionResult(task_id="task-1", success=True)

    followups = engine.decide_followups(task, result, {"case_state": state})

    assert followups == []
    assert "empty response" in state.warnings[0]
    assert state.tool_history[-1]["success"] is False
