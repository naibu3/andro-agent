from __future__ import annotations

import json
import re
from pathlib import Path

import pytest

from andro_agent.agentic import AgenticRuntimeConfig
from andro_agent.agents.static_investigation_agent import (
    StaticInvestigationAgent,
    StaticInvestigationBudget,
)
from andro_agent.core.state import CaseState
from andro_agent.pipelines.static_pipeline import StaticAnalysisPipeline


class FakeModelClient:
    def __init__(self, responses: list[object]) -> None:
        self.responses = list(responses)
        self.prompts: list[str] = []

    def complete_json(self, prompt: str) -> object:
        self.prompts.append(prompt)
        return self.responses.pop(0)


def write_json(path: Path, value: object) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(value), encoding="utf-8")


def investigation_case(tmp_path: Path) -> Path:
    case_dir = tmp_path / "artifacts" / "case-full"
    write_json(
        case_dir / "findings" / "canonical_findings.json",
        [
            {
                "finding_id": "DET-1",
                "rule_id": "DET-1",
                "title": "Existing issue",
                "description": "Already detected",
                "severity": "high",
                "category": "code",
                "source": "code",
                "evidence_ids": ["EVID-1"],
            }
        ],
    )
    write_json(
        case_dir / "evidence" / "evidence.json",
        [
            {
                "evidence_id": "EVID-1",
                "case_id": "case-full",
                "evidence_type": "source",
                "source_tool": "code",
                "artifact_path": "jadx/sources/Main.java",
                "selector": "line:2",
                "snippet": "dangerousCall();",
            }
        ],
    )
    write_json(
        case_dir / "facts" / "manifest_facts.json",
        [{"type": "manifest.application.debuggable", "key": "debuggable", "value": True}],
    )
    source = case_dir / "jadx" / "sources" / "Main.java"
    source.parent.mkdir(parents=True)
    source.write_text("class Main {\n  dangerousCall();\n}\n", encoding="utf-8")
    return case_dir


def final_response() -> dict:
    return {
        "hypotheses": [
            {
                "title": "Open question",
                "rationale": "More context is required.",
                "related_evidence_ids": ["EVID-1"],
                "suggested_next_steps": ["Inspect callers"],
                "confidence": "medium",
                "status": "open",
            }
        ],
        "candidates": [
            {
                "title": "New issue",
                "description": "A distinct evidence-linked issue.",
                "severity": "medium",
                "confidence": "high",
                "category": "code",
                "affected_components": ["Main"],
                "evidence_ids": ["EVID-1"],
                "impact": "Impact",
                "remediation": "Fix it",
                "why_not_already_detected": "Requires contextual interpretation.",
                "related_deterministic_findings": ["DET-1"],
                "tool_trace_refs": [2],
            },
            {
                "title": "Unsupported issue",
                "description": "No evidence.",
                "severity": "high",
                "confidence": "low",
                "category": "code",
                "evidence_ids": [],
            },
            {
                "title": "Existing issue",
                "description": "Duplicate baseline issue.",
                "severity": "high",
                "confidence": "high",
                "category": "code",
                "evidence_ids": ["EVID-1"],
            },
        ],
    }


@pytest.mark.parametrize(
    ("raw", "expected"),
    [
        ('{"value": 1}', {"value": 1}),
        ('[1, {"value": 2}]', [1, {"value": 2}]),
        ('```json\n{"value": 3}\n```', {"value": 3}),
        ("```\n[4, 5]\n```", [4, 5]),
        (
            'Model response follows: {"value": {"nested": true}} Thanks.',
            {"value": {"nested": True}},
        ),
        ('Prefix ["value", {"nested": [1, 2]}] suffix', ["value", {"nested": [1, 2]}]),
        ('[draft] Final answer: {"value": 6}', {"value": 6}),
    ],
)
def test_json_extraction_handles_common_model_wrappers(raw: str, expected: object) -> None:
    assert StaticInvestigationAgent._parse_json(raw) == expected


def test_agent_writes_trace_hypotheses_and_only_valid_new_candidates(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    model = FakeModelClient(
        [
            {
                "questions": [
                    {
                        "question": "Is the call dangerous in context?",
                        "tool_calls": [
                            {"tool": "search_code", "arguments": {"query": "dangerousCall"}},
                            {
                                "tool": "open_source_context",
                                "arguments": {
                                    "artifact_path": "jadx/sources/Main.java",
                                    "line": 2,
                                },
                            },
                        ],
                    }
                ]
            },
            final_response(),
        ]
    )

    result = StaticInvestigationAgent(
        case_dir=case_dir,
        profile="full",
        model_client=model,
    ).run()

    assert result["trace"]["termination_reason"] == "completed"
    assert len(result["trace"]["tool_calls"]) == 5
    assert len(result["candidates"]) == 1
    candidate = result["candidates"][0]
    assert candidate["title"] == "New issue"
    assert candidate["evidence_ids"] == ["EVID-1"]
    assert re.fullmatch(r"LLM-FIND-[0-9A-F]{12}", candidate["finding_id"])
    assert len(result["hypotheses"]) == 3
    assert all(
        re.fullmatch(r"LLM-HYP-[0-9A-F]{12}", item["hypothesis_id"])
        for item in result["hypotheses"]
    )
    assert (case_dir / "analysis" / "static_investigation_trace.json").is_file()
    assert (case_dir / "analysis" / "llm_hypotheses.json").is_file()
    assert (case_dir / "findings" / "llm_candidate_findings.json").is_file()
    assert len(model.prompts) == 2
    assert "full decompiled" not in model.prompts[0].lower()


def test_tool_calls_are_limited_by_budget(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    calls = [
        {"tool": "search_code", "arguments": {"query": f"query-{index}"}} for index in range(10)
    ]
    model = FakeModelClient(
        [
            {"questions": [{"question": "Many searches", "tool_calls": calls}]},
            {"hypotheses": [], "candidates": []},
        ]
    )

    result = StaticInvestigationAgent(
        case_dir=case_dir,
        profile="full",
        model_client=model,
        budget=StaticInvestigationBudget(max_tool_calls=3),
    ).run()

    assert len(result["trace"]["tool_calls"]) == 3
    assert result["trace"]["termination_reason"] == "budget_exhausted"
    assert result["trace"]["budget"]["max_tool_calls"] == 3


def test_structured_plan_drives_selective_tools_and_compact_synthesis(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    evidence_path = case_dir / "evidence" / "evidence.json"
    evidence = json.loads(evidence_path.read_text())
    evidence.append({"evidence_id": "EVID-UNUSED", "snippet": "MUST_NOT_REACH_FINAL_PROMPT"})
    write_json(evidence_path, evidence)
    model = FakeModelClient(
        [
            {
                "questions": [
                    {
                        "question_id": "Q1",
                        "title": "Can an exported provider expose data?",
                        "rationale": "Check provider permissions and query construction.",
                        "target_category": "components",
                        "related_finding_ids": ["DET-1"],
                        "planned_searches": ["dangerousCall"],
                        "needed_evidence_ids": ["EVID-1"],
                    }
                ]
            },
            {"hypotheses": [], "candidate_findings": []},
        ]
    )

    result = StaticInvestigationAgent(case_dir=case_dir, profile="full", model_client=model).run()

    calls = result["trace"]["tool_calls"]
    assert [call["tool"] for call in calls] == [
        "get_findings",
        "get_evidence",
        "open_source_context",
        "get_manifest_facts",
        "search_code",
        "open_source_context",
    ]
    assert calls[1]["input_summary"]["evidence_ids"] == ["EVID-1"]
    assert calls[1]["input_summary"]["limit"] != 200
    assert result["trace"]["phases"] == [
        "context_building",
        "question_planning",
        "tool_execution",
        "final_synthesis",
        "validation",
        "output_writing",
    ]
    assert "TOOL OBSERVATIONS" in model.prompts[1]
    assert '"tool": "open_source_context"' in model.prompts[1]
    assert "MUST_NOT_REACH_FINAL_PROMPT" not in model.prompts[1]


def test_old_natural_language_searches_become_concrete_bounded_tool_plans(
    tmp_path: Path,
) -> None:
    case_dir = investigation_case(tmp_path)
    canonical = case_dir / "findings" / "canonical_findings.json"
    before = canonical.read_bytes()
    natural_runtime = (
        "Review input validation logic preceding Runtime.exec calls in sources/Main.java"
    )
    natural_manifest = "Verify if android.permission declarations exist for exported activities"
    natural_http = "Get code context for all cleartext URL findings and review secure transport"
    model = FakeModelClient(
        [
            {
                "questions": [
                    {
                        "question_id": "Q1",
                        "title": "Verify Runtime.exec input sanitization",
                        "rationale": "Check command construction.",
                        "target_category": "command_execution",
                        "needed_evidence_ids": ["EVID-1"],
                        "planned_searches": [natural_runtime],
                    },
                    {
                        "question_id": "Q2",
                        "title": "Confirm exported activities have permissions",
                        "rationale": "Manifest declaration review.",
                        "target_category": "components",
                        "planned_searches": [natural_manifest],
                    },
                    {
                        "question_id": "Q3",
                        "title": "Determine whether hardcoded HTTP URLs use secure transport",
                        "rationale": "Review cleartext configuration.",
                        "target_category": "network",
                        "planned_searches": [natural_http],
                    },
                ]
            },
            {"hypotheses": [], "candidate_findings": []},
        ]
    )

    result = StaticInvestigationAgent(case_dir=case_dir, profile="full", model_client=model).run()

    trace = result["trace"]
    search_calls = [call for call in trace["tool_calls"] if call["tool"] == "search_code"]
    queries = [call["query"] for call in search_calls]
    assert natural_runtime not in queries
    assert natural_manifest not in queries
    assert natural_http not in queries
    assert "Runtime.getRuntime().exec" in queries
    assert ".exec(" in queries
    assert "http://" in queries
    assert "usesCleartextTraffic" in queries
    assert all(len(query) <= 80 for query in queries)
    assert any(call["tool"] == "get_manifest_facts" for call in trace["tool_calls"])
    assert any(
        call["tool"] == "get_manifest_facts" and call["input_summary"].get("fact_type") == "network"
        for call in trace["tool_calls"]
    )
    assert trace["questions"][0]["context_openings_from_evidence"] == 1
    skipped = [
        item
        for question in trace["questions"]
        for item in question["skipped_natural_language_searches"]
    ]
    assert skipped
    assert all(item["skipped_search_reason"] == "query_not_concrete" for item in skipped)
    assert natural_runtime not in model.prompts[1]
    assert natural_manifest not in model.prompts[1]
    assert natural_http not in model.prompts[1]
    assert canonical.read_bytes() == before


def test_structured_tool_plan_routes_manifest_and_opens_search_context(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    model = FakeModelClient(
        [
            {
                "questions": [
                    {
                        "question_id": "Q1",
                        "title": "Inspect exported DownloadInvoiceService",
                        "rationale": "Confirm service permissions.",
                        "target_category": "components",
                        "needed_evidence_ids": ["EVID-1"],
                        "tool_plan": [
                            {"tool": "get_evidence", "evidence_ids": ["EVID-1"]},
                            {"tool": "open_source_context", "from_evidence_id": "EVID-1"},
                            {"tool": "search_code", "query": "dangerousCall"},
                            {
                                "tool": "get_manifest_facts",
                                "component": "DownloadInvoiceService",
                            },
                            {"tool": "unknown_tool", "query": "ignored"},
                        ],
                    }
                ]
            },
            {"hypotheses": [], "candidate_findings": []},
        ]
    )

    trace = StaticInvestigationAgent(case_dir=case_dir, profile="full", model_client=model).run()[
        "trace"
    ]

    search = next(call for call in trace["tool_calls"] if call["tool"] == "search_code")
    assert search["query"] == "dangerousCall"
    assert search["matches_count"] == 1
    assert search["opened_context_count"] == 1
    assert search["skipped_context_reason"] is None
    manifest = next(call for call in trace["tool_calls"] if call["tool"] == "get_manifest_facts")
    assert manifest["input_summary"]["component"] == "DownloadInvoiceService"
    assert all(call["tool"] != "unknown_tool" for call in trace["tool_calls"])


def test_invalid_question_plan_uses_deterministic_fallback(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    model = FakeModelClient(
        ["not json", "still not json", {"hypotheses": [], "candidate_findings": []}]
    )

    result = StaticInvestigationAgent(case_dir=case_dir, profile="full", model_client=model).run()

    assert result["trace"]["termination_reason"] == "completed"
    assert result["trace"]["llm_retries"] == 1
    assert result["trace"]["question_planning_source"] == "fallback"
    assert result["trace"]["question_planning_error"] == "invalid_json"
    assert result["trace"]["repair_attempts"] == [
        {
            "phase": "question_planning",
            "reason": "invalid_json",
            "success": False,
        }
    ]
    assert result["trace"]["questions"][0]["question_id"] == "Q1"
    assert any(call["tool"] == "get_evidence" for call in result["trace"]["tool_calls"])


def test_raw_phase_files_and_question_planning_repair_success(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    repaired_plan = {
        "questions": [
            {
                "question_id": "Q1",
                "title": "Inspect dangerousCall",
                "needed_evidence_ids": ["EVID-1"],
                "tool_plan": [{"tool": "search_code", "query": "dangerousCall"}],
            }
        ]
    }
    model = FakeModelClient(
        [
            "I could not format this response",
            repaired_plan,
            'Result:\n```json\n{"hypotheses": [], "candidate_findings": []}\n```',
        ]
    )

    result = StaticInvestigationAgent(case_dir=case_dir, profile="full", model_client=model).run()

    trace = result["trace"]
    assert trace["termination_reason"] == "completed"
    assert trace["question_planning_source"] == "llm"
    assert trace["question_planning_error"] == "invalid_json"
    assert trace["llm_retries"] == 1
    assert trace["repair_attempts"][0]["success"] is True
    assert (
        case_dir / "analysis/static_investigation_question_planning_raw.txt"
    ).read_text() == "I could not format this response"
    assert (
        json.loads(
            (
                case_dir / "analysis/static_investigation_question_planning_repair_raw.txt"
            ).read_text()
        )
        == repaired_plan
    )
    assert (case_dir / "analysis/static_investigation_final_synthesis_raw.txt").is_file()


def test_final_synthesis_invalid_json_repair_success_completes(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    model = FakeModelClient(
        [
            {"questions": []},
            "not valid json",
            {"hypotheses": [], "candidate_findings": []},
        ]
    )

    trace = StaticInvestigationAgent(case_dir=case_dir, profile="full", model_client=model).run()[
        "trace"
    ]

    assert trace["termination_reason"] == "completed"
    assert trace["final_synthesis_error"] == "invalid_json"
    assert trace["llm_retries"] == 1
    assert trace["repair_attempts"][-1] == {
        "phase": "final_synthesis",
        "reason": "invalid_json",
        "success": True,
    }
    assert (
        case_dir / "analysis/static_investigation_final_synthesis_raw.txt"
    ).read_text() == "not valid json"
    assert (case_dir / "analysis/static_investigation_final_synthesis_repair_raw.txt").is_file()


def test_empty_final_synthesis_is_safe_and_preserves_deterministic_findings(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    canonical = case_dir / "findings" / "canonical_findings.json"
    before = canonical.read_bytes()
    model = FakeModelClient([{"questions": []}, "", "not json"])

    result = StaticInvestigationAgent(case_dir=case_dir, profile="full", model_client=model).run()

    assert result["trace"]["termination_reason"] == "invalid_json"
    assert result["trace"]["failed_phase"] == "final_synthesis"
    assert result["hypotheses"] == []
    assert result["candidates"] == []
    assert result["trace"]["final_synthesis_error"] == "empty_response"
    assert result["trace"]["repair_attempts"][-1]["success"] is False
    assert (
        case_dir / "analysis/static_investigation_final_synthesis_raw.txt"
    ).read_text() == "[empty response]"
    assert canonical.read_bytes() == before


def test_empty_final_synthesis_repair_still_terminates_as_invalid_json(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    model = FakeModelClient([{"questions": []}, "", ""])

    result = StaticInvestigationAgent(case_dir=case_dir, profile="full", model_client=model).run()

    assert result["trace"]["termination_reason"] == "invalid_json"
    assert result["trace"]["failed_phase"] == "final_synthesis"
    assert result["trace"]["repair_attempts"][-1] == {
        "phase": "final_synthesis",
        "reason": "empty_response",
        "success": False,
    }
    assert result["hypotheses"] == []
    assert result["candidates"] == []


def test_trace_records_requested_mode_fallback_provider_model_and_budget(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    model = FakeModelClient([{"questions": []}, {"hypotheses": [], "candidate_findings": []}])
    config = AgenticRuntimeConfig(
        mode="multi-phase", budget_preset="conservative", provider="ollama", model="local-model"
    )

    trace = StaticInvestigationAgent(
        case_dir=case_dir, profile="full", model_client=model, runtime_config=config
    ).run()["trace"]

    assert trace["agentic_mode"] == "multi-phase"
    assert trace["requested_agentic_mode"] == "multi-phase"
    assert trace["agentic_strategy_runtime"] == "single_agent_fallback"
    assert trace["agentic_budget"] == "conservative"
    assert trace["llm_provider"] == "ollama"
    assert trace["llm_model"] == "local-model"
    assert trace["budget"]["max_questions"] == 3
    assert trace["budget"]["max_tool_calls"] == 10


def test_missing_llm_configuration_writes_disabled_outputs(tmp_path: Path, monkeypatch) -> None:
    case_dir = investigation_case(tmp_path)
    agent = StaticInvestigationAgent(case_dir=case_dir, profile="full")
    monkeypatch.setattr(
        agent,
        "_ensure_model",
        lambda: (_ for _ in ()).throw(RuntimeError("LLM not configured")),
    )

    result = agent.run()

    assert result["trace"]["termination_reason"] == "disabled"
    assert json.loads((case_dir / "analysis" / "llm_hypotheses.json").read_text()) == []
    assert json.loads((case_dir / "findings" / "llm_candidate_findings.json").read_text()) == []


def test_metrics_and_report_include_static_investigation_results(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    state = CaseState(
        case_id="case-full",
        apk_path=Path("app.apk"),
        analysis_profile="full",
        static_investigation_trace_path=case_dir / "analysis" / "static_investigation_trace.json",
        llm_hypotheses_path=case_dir / "analysis" / "llm_hypotheses.json",
        llm_candidate_findings_path=case_dir / "findings" / "llm_candidate_findings.json",
        static_report_path=case_dir / "report" / "static_analysis_report.md",
    )
    write_json(
        state.static_investigation_trace_path,
        {"termination_reason": "completed", "tool_calls": [{"tool": "get_findings"}]},
    )
    write_json(state.llm_hypotheses_path, [{"hypothesis_id": "LLM-HYP-1"}])
    candidate = final_response()["candidates"][0]
    candidate["metadata"] = {"why_not_already_detected": candidate.pop("why_not_already_detected")}
    write_json(state.llm_candidate_findings_path, [candidate])
    state.static_report_path.parent.mkdir(parents=True)
    state.static_report_path.write_text("# Report\n", encoding="utf-8")

    metrics = StaticAnalysisPipeline._static_investigation_metrics(state)
    StaticAnalysisPipeline._append_static_investigation_report(state)

    assert metrics == {
        "agentic_mode": "none",
        "agentic_strategy_runtime": "none",
        "agentic_budget": "balanced",
        "llm_provider": None,
        "llm_model": None,
        "enabled_tools": [],
        "max_questions": 0,
        "max_tool_calls": 0,
        "static_investigation_ran": True,
        "static_investigation_tool_calls": 1,
        "static_investigation_max_tool_calls": 0,
        "llm_hypotheses_count": 1,
        "llm_candidate_findings_count": 1,
        "llm_candidate_findings_with_evidence_count": 1,
        "static_investigation_termination_reason": "completed",
        "static_investigation_failed_phase": None,
    }
    report = state.static_report_path.read_text(encoding="utf-8")
    assert "## LLM static investigation candidates" in report
    assert "should be manually reviewed" in report
    assert "`EVID-1`" in report


def test_metrics_include_static_investigation_failed_phase(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    state = CaseState(
        case_id="case-full",
        apk_path=Path("app.apk"),
        analysis_profile="full",
        static_investigation_trace_path=case_dir / "analysis" / "static_investigation_trace.json",
        llm_hypotheses_path=case_dir / "analysis" / "llm_hypotheses.json",
        llm_candidate_findings_path=case_dir / "findings" / "llm_candidate_findings.json",
    )
    write_json(
        state.static_investigation_trace_path,
        {
            "static_investigation_ran": True,
            "termination_reason": "invalid_json",
            "failed_phase": "final_synthesis",
            "tool_calls": [{}, {}, {}],
        },
    )
    write_json(state.llm_hypotheses_path, [])
    write_json(state.llm_candidate_findings_path, [])

    metrics = StaticAnalysisPipeline._static_investigation_metrics(state)

    assert metrics["static_investigation_ran"] is True
    assert metrics["static_investigation_termination_reason"] == "invalid_json"
    assert metrics["static_investigation_failed_phase"] == "final_synthesis"
    assert metrics["static_investigation_tool_calls"] == 3
    assert metrics["llm_hypotheses_count"] == 0
    assert metrics["llm_candidate_findings_count"] == 0


def test_deep_budget_tool_call_limit_is_explicit_in_metrics(tmp_path: Path) -> None:
    case_dir = investigation_case(tmp_path)
    state = CaseState(
        case_id="case-full",
        apk_path=Path("app.apk"),
        analysis_profile="full",
        agentic_max_tool_calls=40,
        static_investigation_trace_path=case_dir / "analysis" / "static_investigation_trace.json",
        llm_hypotheses_path=case_dir / "analysis" / "llm_hypotheses.json",
        llm_candidate_findings_path=case_dir / "findings" / "llm_candidate_findings.json",
    )
    write_json(
        state.static_investigation_trace_path,
        {
            "termination_reason": "completed",
            "budget": {"max_tool_calls": 40},
            "tool_calls": [{}] * 23,
        },
    )
    write_json(state.llm_hypotheses_path, [])
    write_json(state.llm_candidate_findings_path, [])

    metrics = StaticAnalysisPipeline._static_investigation_metrics(state)

    assert metrics["static_investigation_tool_calls"] == 23
    assert metrics["static_investigation_max_tool_calls"] == 40
    assert metrics["static_investigation_tool_calls"] <= metrics[
        "static_investigation_max_tool_calls"
    ]
