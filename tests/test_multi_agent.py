from __future__ import annotations

import json
from pathlib import Path

from typer.testing import CliRunner

from andro_agent.agentic import AgenticMode, AgenticRuntimeConfig
from andro_agent.agents.multi_agent.evidence_review_agent import EvidenceReviewAgent
from andro_agent.agents.multi_agent.events import AgentEventEmitter
from andro_agent.agents.multi_agent.orchestrator import OrchestratorAgent
from andro_agent.agents.multi_agent.schemas import CandidateFinding
from andro_agent.app import cli
from andro_agent.app.cli import app
from andro_agent.core.state import CaseState
from andro_agent.pipelines.static_pipeline import StaticAnalysisPipeline


def write_json(path: Path, value: object) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(value), encoding="utf-8")


def candidate(**overrides) -> CandidateFinding:
    values = {
        "candidate_id": "C-1",
        "title": "Runtime exec command injection",
        "description": "User input reaches Runtime.exec",
        "severity": "high",
        "confidence": "high",
        "category": "code",
        "evidence_ids": ["E-1"],
        "source_agent": "StaticPentestAgent",
        "evidence_sufficiency": "sufficient",
    }
    values.update(overrides)
    return CandidateFinding(**values)


def test_cli_and_config_accept_multi_and_preserve_single() -> None:
    assert AgenticRuntimeConfig(mode="multi").mode is AgenticMode.MULTI
    assert AgenticRuntimeConfig(mode="single").mode is AgenticMode.SINGLE
    result = CliRunner().invoke(
        app, ["run", "missing.apk", "--case-id", "x", "--agentic-mode", "multi"]
    )
    assert "Invalid value for '--agentic-mode'" not in result.output


def test_cli_accepts_agent_trace_modes_and_alias() -> None:
    runner = CliRunner()
    for args in (
        ["--agent-trace", "visible"],
        ["--agent-trace", "hidden"],
        ["--no-agent-trace"],
    ):
        result = runner.invoke(app, ["run", "missing.apk", "--case-id", "x", *args])
        assert "No such option" not in result.output
        assert "Invalid value for '--agent-trace'" not in result.output


def test_multi_agent_cli_result_lists_artifacts_and_hidden_trace_stays_hidden(
    monkeypatch, tmp_path: Path
) -> None:
    case_dir = tmp_path / "multi-output"

    class FakePipeline:
        def __init__(self, **kwargs):
            self.kwargs = kwargs

        def run(self, *, apk_path, case_id):
            return CaseState(
                case_id=case_id,
                apk_path=apk_path,
                analysis_profile="full",
                agentic_mode="multi",
                agent_trace_mode="hidden",
                agent_trace_printed=False,
                agent_events_path=case_dir / "analysis/agent_events.jsonl",
                orchestrator_trace_path=case_dir / "analysis/orchestrator_trace.json",
                multi_agent_plan_path=case_dir / "analysis/multi_agent_plan.json",
                llm_hypotheses_path=case_dir / "analysis/multi_agent_hypotheses.json",
                llm_candidate_findings_path=case_dir
                / "analysis/multi_agent_candidate_findings.json",
                evidence_review_path=case_dir / "analysis/evidence_review.json",
                multi_agent_report_path=case_dir / "report/multi_agent_report.md",
                status="completed",
            )

    monkeypatch.setattr(cli, "StaticAnalysisPipeline", FakePipeline)
    result = CliRunner().invoke(
        cli.app,
        [
            "run",
            "app.apk",
            "--case-id",
            "multi-output",
            "--agentic-mode",
            "multi",
            "--agent-trace",
            "hidden",
        ],
    )

    assert result.exit_code == 0
    for label, filename in (
        ("Agent events", "agent_events.jsonl"),
        ("Orchestrator trace", "orchestrator_trace.json"),
        ("Multi-agent plan", "multi_agent_plan.json"),
        ("Multi-agent hypotheses", "multi_agent_hypotheses.json"),
        ("Multi-agent candidates", "multi_agent_candidate_findings.json"),
        ("Evidence review", "evidence_review.json"),
        ("Multi-agent report", "multi_agent_report.md"),
    ):
        assert label in result.output
        assert filename in result.output
    assert "[orchestrator]" not in result.output


def test_non_multi_cli_result_keeps_legacy_output(monkeypatch) -> None:
    class FakePipeline:
        def __init__(self, **kwargs):
            pass

        def run(self, *, apk_path, case_id):
            return CaseState(
                case_id=case_id,
                apk_path=apk_path,
                analysis_profile="no-llm",
                agentic_mode="none",
                static_report_path=Path("artifacts/case/report/static_analysis.md"),
                status="completed",
            )

    monkeypatch.setattr(cli, "StaticAnalysisPipeline", FakePipeline)
    result = CliRunner().invoke(
        cli.app,
        ["run", "app.apk", "--case-id", "case", "--analysis-profile", "no-llm"],
    )

    assert result.exit_code == 0
    assert "Pipeline result" in result.output
    assert "static_analysis.md" in result.output
    assert "Multi-agent report" not in result.output


def test_no_llm_still_forces_agentic_none(tmp_path: Path) -> None:
    pipeline = StaticAnalysisPipeline(
        artifacts_dir=tmp_path, profile="no-llm", agentic_mode="multi"
    )
    assert pipeline.agentic_config.mode is AgenticMode.NONE


def test_orchestrator_writes_required_no_rag_artifacts(tmp_path: Path) -> None:
    case_dir = tmp_path / "case"
    write_json(
        case_dir / "findings/canonical_findings.json",
        [{"finding_id": "D-1", "category": "code", "evidence_ids": ["E-1"]}],
    )
    write_json(
        case_dir / "evidence/evidence.json",
        [
            {
                "evidence_id": "E-1",
                "evidence_type": "source",
                "snippet": "Runtime.getRuntime().exec(userInput)",
            }
        ],
    )
    raw = {
        "trace": {"termination_reason": "completed", "errors": []},
        "hypotheses": [
            {
                "hypothesis_id": "H-1",
                "title": "Command flow",
                "rationale": "Input may reach exec",
                "related_evidence_ids": ["E-1"],
                "confidence": "medium",
                "status": "open",
            }
        ],
        "candidates": [
            {
                "finding_id": "C-1",
                "title": "Runtime exec command injection",
                "description": "User input reaches Runtime.exec",
                "severity": "high",
                "confidence": "high",
                "category": "code",
                "evidence_ids": ["E-1"],
            }
        ],
    }
    result = OrchestratorAgent(
        case_dir=case_dir, apk_path=Path("app.apk"), budget="balanced", static_runner=lambda: raw
    ).run()
    required = [
        "orchestrator_trace.json",
        "multi_agent_plan.json",
        "minion_static_trace.json",
        "evidence_review.json",
        "multi_agent_candidate_findings.json",
        "multi_agent_hypotheses.json",
    ]
    assert all((case_dir / "analysis" / name).is_file() for name in required)
    assert (case_dir / "report/multi_agent_report.md").is_file()
    trace = json.loads((case_dir / "analysis/orchestrator_trace.json").read_text())
    assert trace["rag_enabled"] is False and trace["knowledge_sources"] == []
    assert result["metrics"]["static_minion_ran"] is True
    event_lines = (case_dir / "analysis/agent_events.jsonl").read_text().splitlines()
    assert event_lines and all(json.loads(line) for line in event_lines)
    assert result["metrics"]["agent_events_count"] == len(event_lines)
    assert result["metrics"]["agent_trace_mode"] == "hidden"


def test_visible_and_hidden_agent_event_output(tmp_path: Path) -> None:
    outputs: list[str] = []
    raw = {
        "trace": {"termination_reason": "completed", "errors": []},
        "hypotheses": [{"hypothesis_id": "H-1", "title": "Review flow"}],
        "candidates": [candidate().model_dump()],
    }
    for name, visible in (("visible", True), ("hidden", False)):
        case_dir = tmp_path / name
        write_json(case_dir / "findings/canonical_findings.json", [])
        write_json(
            case_dir / "evidence/evidence.json",
            [{"evidence_id": "E-1", "evidence_type": "source", "snippet": "Runtime.exec"}],
        )
        result = OrchestratorAgent(
            case_dir=case_dir,
            apk_path=Path("app.apk"),
            budget="balanced",
            static_runner=lambda: raw,
            trace_visible=visible,
            trace_printer=outputs.append,
        ).run()
        assert (case_dir / "analysis/agent_events.jsonl").is_file()
        assert result["metrics"]["agent_trace_printed"] is visible
    rendered = "\n".join(outputs)
    assert "[orchestrator]" in rendered
    assert "[static-agent]" in rendered
    assert "[evidence-review]" in rendered
    assert "[report-agent]" in rendered
    assert "raw prompt" not in rendered.lower()


def test_source_context_trace_prefers_candidate_evidence(tmp_path: Path) -> None:
    case_dir = tmp_path / "context"
    write_json(
        case_dir / "findings/canonical_findings.json",
        [{"finding_id": "EXPORTED", "category": "manifest", "evidence_ids": ["E-MANIFEST"]}],
    )
    write_json(
        case_dir / "evidence/evidence.json",
        [
            {"evidence_id": "E-MANIFEST", "evidence_type": "manifest", "artifact_path": "SplashActivity"},
            {"evidence_id": "E-CODE", "evidence_type": "source", "artifact_path": "jadx/sources/Vulnerable.java", "selector": "line:42", "snippet": "Runtime.exec(userInput)"},
        ],
    )
    output: list[str] = []
    OrchestratorAgent(
        case_dir=case_dir,
        apk_path=Path("app.apk"),
        budget="balanced",
        static_runner=lambda: {
            "trace": {"termination_reason": "completed"},
            "hypotheses": [],
            "candidates": [candidate(evidence_ids=["E-CODE"]).model_dump()],
        },
        trace_visible=True,
        trace_printer=output.append,
    ).run()
    contexts = [line for line in output if "Opened source context" in line]
    assert contexts == [
        "[static-agent] Opened source context: jadx/sources/Vulnerable.java:line:42"
    ]


def test_agent_event_sanitization_removes_credentials(tmp_path: Path) -> None:
    output: list[str] = []
    path = tmp_path / "agent_events.jsonl"
    emitter = AgentEventEmitter(
        case_id="safe", path=path, visible=True, printer=output.append
    )
    emitter.emit(
        "orchestrator",
        "error",
        "Provider failed sk-test-SECRET-123 Authorization: Bearer bearer-SECRET-456",
        Authorization="Bearer bearer-SECRET-456",
        prompt="raw prompt containing sk-test-SECRET-123",
        headers={"Cookie": "session=SECRET"},
    )
    persisted = path.read_text()
    rendered = "\n".join(output)
    for secret in ("sk-test-SECRET-123", "bearer-SECRET-456", "session=SECRET"):
        assert secret not in persisted
        assert secret not in rendered
    assert "raw prompt containing" not in persisted


def test_evidence_review_promotes_concrete_code_candidate() -> None:
    decisions = EvidenceReviewAgent().review(
        [candidate()],
        [
            {
                "evidence_id": "E-1",
                "evidence_type": "source",
                "snippet": "Runtime.exec receives user input",
            }
        ],
        [],
    )
    assert decisions[0].verdict == "promote"


def test_evidence_review_does_not_promote_manifest_only_overclaim() -> None:
    item = candidate(
        title="Exported activity authentication bypass",
        description="Allows unauthorized fund transfer",
    )
    decisions = EvidenceReviewAgent().review(
        [item],
        [
            {
                "evidence_id": "E-1",
                "evidence_type": "manifest",
                "source_tool": "manifest",
                "snippet": "exported=true",
            }
        ],
        [],
    )
    assert decisions[0].verdict == "needs_dynamic_confirmation"


def test_manifest_only_sensitive_component_claim_is_not_accepted_as_duplicate() -> None:
    item = candidate(
        title="Exported provider exposes sensitive PIN data",
        description="Other applications can read stored credentials.",
        category="rule_engine",
    )
    decisions = EvidenceReviewAgent().review(
        [item],
        [{"evidence_id": "E-1", "evidence_type": "manifest", "snippet": "exported=true"}],
        [{"finding_id": "MANIFEST_EXPORTED_PROVIDER", "category": "rule_engine", "evidence_ids": ["E-1"]}],
    )
    assert decisions[0].verdict == "needs_dynamic_confirmation"
    assert decisions[0].evidence_sufficiency == "partial"


def test_code_backed_runtime_exec_and_execsql_dataflows_remain_sufficient() -> None:
    runtime = candidate(
        candidate_id="C-RUNTIME",
        title="Command injection from user-controlled input",
        description="EditText input is concatenated into a command passed to Runtime.exec.",
        evidence_ids=["E-RUNTIME"],
    )
    sql = candidate(
        candidate_id="C-SQL",
        title="SQL injection through user input concatenation",
        description="EditText values are concatenated into qry passed to execSQL.",
        evidence_ids=["E-SQL"],
    )
    evidence = [
        {"evidence_id": "E-RUNTIME", "evidence_type": "source", "snippet": 'String command = "ping " + ip.getText(); Runtime.getRuntime().exec(command);'},
        {"evidence_id": "E-SQL", "evidence_type": "source", "snippet": 'String qry = "INSERT" + username.getText(); db.execSQL(qry);'},
    ]
    findings = [
        {"finding_id": "CODE_RUNTIME_EXEC", "category": "code", "evidence_ids": ["E-RUNTIME"]},
        {"finding_id": "CODE_SQL_EXECSQL", "category": "code", "evidence_ids": ["E-SQL"]},
    ]
    decisions = EvidenceReviewAgent().review([runtime, sql], evidence, findings)
    assert [decision.verdict for decision in decisions] == [
        "duplicate_valid",
        "duplicate_valid",
    ]


def test_evidence_review_rejects_mismatched_and_missing_evidence() -> None:
    decisions = EvidenceReviewAgent().review(
        [candidate()],
        [{"evidence_id": "E-1", "evidence_type": "source", "snippet": "harmless preference read"}],
        [],
    )
    assert decisions[0].verdict == "reject_insufficient_evidence"
    missing = EvidenceReviewAgent().review([candidate(evidence_ids=[])], [], [])
    assert missing[0].verdict == "reject_insufficient_evidence"


def test_provider_error_is_not_classified_as_invalid_json(tmp_path: Path) -> None:
    case_dir = tmp_path / "case"
    write_json(case_dir / "findings/canonical_findings.json", [])
    write_json(case_dir / "evidence/evidence.json", [])
    raw = {
        "trace": {"termination_reason": "llm_error", "errors": ["provider unavailable"]},
        "hypotheses": [],
        "candidates": [],
    }
    result = OrchestratorAgent(
        case_dir=case_dir, apk_path=Path("app.apk"), budget="balanced", static_runner=lambda: raw
    ).run()
    assert result["trace"].termination_reason == "llm_error"


def test_api_probe_off_sends_no_requests_and_secret_is_not_persisted(tmp_path: Path) -> None:
    case_dir = tmp_path / "case"
    write_json(case_dir / "findings/canonical_findings.json", [])
    write_json(case_dir / "evidence/evidence.json", [])
    secret = "deepseek-test-secret"
    raw = {
        "trace": {"termination_reason": "completed", "errors": []},
        "hypotheses": [],
        "candidates": [],
    }
    OrchestratorAgent(
        case_dir=case_dir, apk_path=Path("app.apk"), budget="balanced", static_runner=lambda: raw
    ).run()
    persisted = "".join(
        path.read_text(errors="ignore") for path in case_dir.rglob("*") if path.is_file()
    )
    assert secret not in persisted
    assert not list(case_dir.rglob("api_requests.json"))
    assert "probing off" in (case_dir / "report/multi_agent_report.md").read_text()
