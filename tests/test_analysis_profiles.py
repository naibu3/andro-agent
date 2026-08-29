from __future__ import annotations

from pathlib import Path

import pytest
from typer.testing import CliRunner

from andro_agent.agentic import AgenticBudgetPreset, AgenticMode, AgenticRuntimeConfig
from andro_agent.app import cli
from andro_agent.core.analysis_profiles import (
    AnalysisProfile,
    get_analysis_profile_config,
)
from andro_agent.core.state import CaseState
from andro_agent.pipelines.static_pipeline import StaticAnalysisPipeline

runner = CliRunner()


@pytest.mark.parametrize("profile", ["no-llm", "fast", "full", "llm"])
def test_cli_profile_parser_accepts_supported_profiles(monkeypatch, profile):
    selected = []

    class FakePipeline:
        def __init__(self, *, artifacts_dir, profile, **kwargs):
            selected.append(profile)

        def run(self, *, apk_path, case_id):
            return CaseState(
                case_id=case_id,
                apk_path=apk_path,
                analysis_profile=profile,
                status="completed",
            )

    monkeypatch.setattr(cli, "StaticAnalysisPipeline", FakePipeline)

    result = runner.invoke(
        cli.app,
        ["run", "app.apk", "--case-id", "case-1", "--profile", profile],
    )

    assert result.exit_code == 0
    assert selected == [AnalysisProfile(profile)]


def test_cli_profile_parser_rejects_invalid_profile():
    result = runner.invoke(
        cli.app,
        ["run", "app.apk", "--case-id", "case-1", "--profile", "invalid"],
    )

    assert result.exit_code == 2
    assert "Invalid value" in result.output


def test_cli_profile_defaults_to_full(monkeypatch):
    selected = []

    class FakePipeline:
        def __init__(self, *, artifacts_dir, profile, **kwargs):
            selected.append(profile)

        def run(self, *, apk_path, case_id):
            return CaseState(
                case_id=case_id,
                apk_path=apk_path,
                analysis_profile=AnalysisProfile.FULL.value,
                status="completed",
            )

    monkeypatch.setattr(cli, "StaticAnalysisPipeline", FakePipeline)

    result = runner.invoke(cli.app, ["run", "app.apk", "--case-id", "case-1"])

    assert result.exit_code == 0
    assert selected == [AnalysisProfile.FULL]


def test_invalid_internal_profile_is_rejected():
    with pytest.raises(ValueError):
        get_analysis_profile_config("invalid")


def test_agentic_runtime_defaults_and_budget_presets():
    default = AgenticRuntimeConfig()
    assert default.mode is AgenticMode.NONE
    assert default.budget_preset is AgenticBudgetPreset.BALANCED
    assert (default.max_questions, default.max_tool_calls, default.max_context_lines) == (5, 20, 40)

    deep = AgenticRuntimeConfig(budget_preset="deep")
    assert (deep.max_questions, deep.max_tool_calls, deep.max_candidates) == (8, 40, 15)


@pytest.mark.parametrize(
    ("kwargs", "message"),
    [
        ({"mode": "invented"}, "Unknown agentic mode"),
        ({"budget_preset": "unlimited"}, "Unknown agentic budget"),
        ({"enabled_tools": frozenset({"shell"})}, "Unsupported static investigation tools"),
    ],
)
def test_invalid_agentic_runtime_values_are_rejected(kwargs, message):
    with pytest.raises(ValueError, match=message):
        AgenticRuntimeConfig(**kwargs)


def test_profile_defaults_and_no_llm_override_agentic_mode(tmp_path):
    assert (
        StaticAnalysisPipeline(artifacts_dir=tmp_path, profile="fast").agentic_config.mode
        is AgenticMode.NONE
    )
    assert (
        StaticAnalysisPipeline(artifacts_dir=tmp_path, profile="full").agentic_config.mode
        is AgenticMode.SINGLE
    )
    forced = StaticAnalysisPipeline(
        artifacts_dir=tmp_path, profile="no-llm", agentic_mode="multi-phase"
    )
    assert forced.agentic_config.mode is AgenticMode.NONE


def test_explicit_none_skips_static_investigation(tmp_path, monkeypatch):
    pipeline = StaticAnalysisPipeline(artifacts_dir=tmp_path, profile="full", agentic_mode="none")
    llm_steps = []
    monkeypatch.setattr(pipeline, "_run_step", lambda tracker, name, func, state: None)
    monkeypatch.setattr(
        pipeline,
        "_run_optional_agent_step",
        lambda tracker, name, func, state: llm_steps.append(name),
    )

    state = pipeline.run(Path("app.apk"), "case-no-agentic")

    assert "static_investigation_agent" not in llm_steps
    assert state.static_investigation_trace_path is None


def test_cli_passes_agentic_and_model_options(monkeypatch):
    selected = {}

    class FakePipeline:
        def __init__(self, **kwargs):
            selected.update(kwargs)

        def run(self, *, apk_path, case_id):
            return CaseState(case_id=case_id, apk_path=apk_path, status="completed")

    monkeypatch.setattr(cli, "StaticAnalysisPipeline", FakePipeline)
    result = runner.invoke(
        cli.app,
        [
            "run",
            "app.apk",
            "--case-id",
            "case-agentic",
            "--agentic-mode",
            "multi-phase",
            "--agentic-budget",
            "deep",
            "--llm-provider",
            "ollama",
            "--llm-model",
            "model-x",
        ],
    )

    assert result.exit_code == 0
    assert selected["agentic_mode"] is AgenticMode.MULTI_PHASE
    assert selected["agentic_budget"] is AgenticBudgetPreset.DEEP
    assert selected["llm_provider"] == "ollama"
    assert selected["llm_model"] == "model-x"


def test_no_llm_profile_skips_all_llm_steps(tmp_path, monkeypatch):
    pipeline = StaticAnalysisPipeline(
        artifacts_dir=tmp_path,
        profile=AnalysisProfile.NO_LLM,
    )
    deterministic_steps = []
    llm_steps = []
    monkeypatch.setattr(
        pipeline,
        "_run_step",
        lambda tracker, name, func, state: deterministic_steps.append(name),
    )
    monkeypatch.setattr(
        pipeline,
        "_run_optional_agent_step",
        lambda tracker, name, func, state: llm_steps.append(name),
    )

    state = pipeline.run(Path("app.apk"), "case-no-llm")

    assert state.status == "completed"
    assert state.analysis_profile == "no-llm"
    assert "deterministic_report" in deterministic_steps
    assert llm_steps == []
    assert state.static_investigation_trace_path is None


def test_full_profile_preserves_existing_llm_steps(tmp_path, monkeypatch):
    pipeline = StaticAnalysisPipeline(
        artifacts_dir=tmp_path,
        profile=AnalysisProfile.FULL,
    )
    llm_steps = []
    monkeypatch.setattr(
        pipeline,
        "_run_step",
        lambda tracker, name, func, state: None,
    )
    monkeypatch.setattr(
        pipeline,
        "_run_optional_agent_step",
        lambda tracker, name, func, state: llm_steps.append(name),
    )

    state = pipeline.run(Path("app.apk"), "case-full")

    assert state.status == "completed"
    assert state.analysis_profile == "full"
    assert llm_steps == [
        "manifest_risk_agent",
        "code_risk_agent",
        "risk_fusion_agent",
        "markdown_report_agent",
        "static_investigation_agent",
    ]


def test_fast_profile_uses_only_compact_llm_report_when_configured(tmp_path, monkeypatch):
    pipeline = StaticAnalysisPipeline(artifacts_dir=tmp_path, profile="fast")
    deterministic_steps = []
    llm_steps = []
    monkeypatch.setattr(
        "andro_agent.pipelines.static_pipeline.is_static_llm_configured",
        lambda: True,
    )
    monkeypatch.setattr(
        pipeline,
        "_run_step",
        lambda tracker, name, func, state: deterministic_steps.append(name),
    )
    monkeypatch.setattr(
        pipeline,
        "_run_optional_agent_step",
        lambda tracker, name, func, state: llm_steps.append(name),
    )

    state = pipeline.run(Path("app.apk"), "case-fast-llm")

    assert state.status == "completed"
    assert "deterministic_report" in deterministic_steps
    assert llm_steps == ["compact_markdown_report_agent"]
    assert state.static_investigation_trace_path is None


def test_selected_profile_is_saved_in_case_state(tmp_path, monkeypatch):
    pipeline = StaticAnalysisPipeline(artifacts_dir=tmp_path, profile="fast")
    monkeypatch.setattr(
        pipeline,
        "_run_step",
        lambda tracker, name, func, state: None,
    )

    pipeline.run(Path("app.apk"), "case-fast")
    saved = CaseState.load("case-fast", tmp_path)

    assert saved.analysis_profile == "fast"


def test_deterministic_report_includes_profile(tmp_path):
    pipeline = StaticAnalysisPipeline(artifacts_dir=tmp_path, profile="no-llm")
    state = CaseState(
        case_id="case-report",
        apk_path=Path("app.apk"),
        analysis_profile="no-llm",
    )

    pipeline._step_deterministic_report(state)

    report = state.static_report_path.read_text(encoding="utf-8")
    assert "Analysis profile: `no-llm`" in report
