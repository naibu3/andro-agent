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
    assert metrics["dynamic_install_attempted"] is False
    assert metrics["dynamic_launch_attempted"] is False
    assert metrics["dynamic_errors_count"] == 1
    assert metrics["api_discovery_enabled"] is False
    assert metrics["api_probe_enabled"] is False
    assert (tmp_path / case_id / "dynamic/runtime_observations.json").is_file()
    assert not (tmp_path / case_id / "dynamic/api_discovery.json").exists()
    assert not (tmp_path / case_id / "dynamic/api_requests.json").exists()


def test_dynamic_install_failure_has_stable_failed_result(tmp_path, monkeypatch):
    case_id = "install-failure"
    CaseState(case_id=case_id, apk_path=Path("app.apk")).save(tmp_path)
    pipeline = DynamicAnalysisPipeline(artifacts_dir=tmp_path)
    monkeypatch.setattr(
        pipeline,
        "_run_impl",
        lambda **kwargs: (_ for _ in ()).throw(RuntimeError("install_apk failed: denied")),
    )

    state = pipeline.run(case_id=case_id, apk_path=Path("app.apk"), avd_name="test")
    result = json.loads(state.dynamic_results_path.read_text())

    assert state.status == "dynamic_failed"
    assert result["status"] == "failed"
    assert result["install"]["attempted"] is True
    assert result["install"]["success"] is False
    assert "install_apk failed" in result["install"]["error"]


def test_dynamic_launch_failure_has_useful_error(tmp_path, monkeypatch):
    case_id = "launch-failure"
    CaseState(case_id=case_id, apk_path=Path("app.apk")).save(tmp_path)
    pipeline = DynamicAnalysisPipeline(artifacts_dir=tmp_path)
    monkeypatch.setattr(
        pipeline,
        "_run_impl",
        lambda **kwargs: (_ for _ in ()).throw(RuntimeError("launch activity failed")),
    )

    state = pipeline.run(case_id=case_id, apk_path=Path("app.apk"), avd_name="test")
    result = json.loads(state.dynamic_results_path.read_text())

    assert result["launch"]["attempted"] is True
    assert result["launch"]["success"] is False
    assert result["launch"]["error"] == "launch activity failed"


def test_successful_launch_without_resolved_activity_adds_warning(tmp_path):
    case_id = "launch-without-activity"
    dynamic_dir = tmp_path / case_id / "dynamic"
    dynamic_dir.mkdir(parents=True)
    results_path = dynamic_dir / "existing_results.json"
    results_path.write_text(
        json.dumps(
            {
                "observations": [
                    {
                        "signal": "app_launch_attempted",
                        "success": True,
                        "metadata": {},
                    }
                ]
            }
        )
    )
    state = CaseState(
        case_id=case_id,
        apk_path=Path("app.apk"),
        status="dynamic_completed",
        dynamic_results_path=results_path,
    )
    pipeline = DynamicAnalysisPipeline(artifacts_dir=tmp_path)

    result = pipeline._write_runtime_summary(
        case_id=case_id,
        state=state,
        dynamic_dir=dynamic_dir,
        termination_reason="completed",
    )

    assert result["launch"]["success"] is True
    assert result["launch"]["activity"] is None
    assert result["warnings"] == [
        "Launch succeeded but launch activity could not be resolved."
    ]


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
