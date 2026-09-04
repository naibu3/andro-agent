from __future__ import annotations

import json
from collections.abc import Callable
from pathlib import Path
from typing import Any

from andro_agent.agents.multi_agent.api_pentest_agent import ApiPentestAgent
from andro_agent.agents.multi_agent.dynamic_pentest_agent import DynamicPentestAgent
from andro_agent.agents.multi_agent.evidence_review_agent import EvidenceReviewAgent
from andro_agent.agents.multi_agent.events import AgentEventEmitter
from andro_agent.agents.multi_agent.report_agent import ReportAgent
from andro_agent.agents.multi_agent.schemas import (
    AgentResult,
    AgentTask,
    MultiAgentScanPlan,
    MultiAgentTrace,
)
from andro_agent.agents.multi_agent.static_pentest_agent import StaticPentestAgent

LIMITS = {"conservative": (1, 3), "balanced": (2, 6), "deep": (3, 10)}


class OrchestratorAgent:
    name = "OrchestratorAgent"

    def __init__(
        self,
        *,
        case_dir: Path,
        apk_path: Path,
        budget: str,
        static_runner: Callable[[], dict[str, Any]],
        trace_visible: bool = False,
        trace_printer: Callable[[str], None] | None = None,
        dynamic_requested: bool = False,
        api_requested: bool = False,
        full_scan: bool = False,
        api_probe_mode: str = "off",
    ) -> None:
        self.case_dir = Path(case_dir)
        self.apk_path = Path(apk_path)
        self.budget = budget
        self.static_runner = static_runner
        self.dynamic_requested = dynamic_requested
        self.api_requested = api_requested
        self.full_scan = full_scan
        self.api_probe_mode = api_probe_mode
        self.events = AgentEventEmitter(
            case_id=self.case_dir.name,
            path=self.case_dir / "analysis" / "agent_events.jsonl",
            visible=trace_visible,
            printer=trace_printer,
        )

    @staticmethod
    def _load(path: Path) -> list[dict[str, Any]]:
        try:
            value = json.loads(path.read_text(encoding="utf-8"))
            return value if isinstance(value, list) else []
        except (OSError, json.JSONDecodeError):
            return []

    def create_plan(
        self, findings: list[dict[str, Any]], evidence: list[dict[str, Any]]
    ) -> MultiAgentScanPlan:
        dynamic_available = self.dynamic_requested or any(
            (self.case_dir / "dynamic" / name).exists()
            for name in ("dynamic_results.json", "runtime_observations.json")
        )
        api_available = self.api_requested or any(self.case_dir.rglob("api_discovery.json"))
        planned = ["StaticPentestAgent"]
        if dynamic_available:
            planned.append("DynamicPentestAgent")
        if api_available:
            planned.append("ApiPentestAgent")
        planned.extend(["EvidenceReviewAgent", "ReportAgent"])
        focus = list(
            dict.fromkeys(
                str(item.get("category") or item.get("source") or "static") for item in findings
            )
        )[:8]
        return MultiAgentScanPlan(
            case_id=self.case_dir.name,
            apk_path=str(self.apk_path),
            agentic_budget=self.budget,
            planned_agents=planned,
            focus_areas=focus,
            rationale=f"Review {len(findings)} deterministic findings backed by {len(evidence)} case evidence items.",
            stop_conditions=[
                "budget exhausted",
                "no useful evidence-backed follow-up remains",
                "provider or LLM error",
            ],
        )

    def run(self) -> dict[str, Any]:
        analysis_dir = self.case_dir / "analysis"
        report_dir = self.case_dir / "report"
        analysis_dir.mkdir(parents=True, exist_ok=True)
        report_dir.mkdir(parents=True, exist_ok=True)
        emit = self.events.emit
        scan_label = "full multi-agent scan" if self.full_scan else "multi-agent scan"
        emit("orchestrator", "start", f"Starting {scan_label} for case {self.case_dir.name}")
        emit("orchestrator", "plan", "RAG disabled")
        emit("orchestrator", "plan", f"Budget: {self.budget}")
        findings = self._load(self.case_dir / "findings" / "canonical_findings.json")
        evidence = self._load(self.case_dir / "evidence" / "evidence.json")
        plan = self.create_plan(findings, evidence)
        label_map = {
            "StaticPentestAgent": "static",
            "DynamicPentestAgent": "dynamic",
            "ApiPentestAgent": "api",
            "EvidenceReviewAgent": "evidence-review",
            "ReportAgent": "report",
        }
        labels = [label_map.get(name, name.lower()) for name in plan.planned_agents]
        emit("orchestrator", "plan", "Selected agents: " + ", ".join(labels), count=len(labels))
        self._write(analysis_dir / "multi_agent_plan.json", plan.model_dump(mode="json"))
        focus_ids = [eid for finding in findings[:10] for eid in finding.get("evidence_ids", [])]
        task = AgentTask(
            task_id="TASK-STATIC-1",
            target_agent="StaticPentestAgent",
            objective="Correlate high-signal deterministic findings with bounded source context.",
            input_artifacts=[
                "findings/canonical_findings.json",
                "evidence/evidence.json",
                "facts/manifest_facts.json",
            ],
            focus_findings=[str(item.get("finding_id")) for item in findings[:10]],
            focus_evidence_ids=focus_ids[:30],
            constraints=[
                "case-scoped evidence only",
                "no RAG",
                "no external knowledge bases",
                "no unsupported claims",
            ],
        )
        results: list[AgentResult] = []
        tasks = [task]
        emit("orchestrator", "decision", "Round 1 started: case evidence triage and minion dispatch")
        emit("orchestrator", "tool_call", "Dispatching bounded static review", task_id=task.task_id)
        emit("static-agent", "start", "Reviewing high-signal deterministic findings")
        emit("static-agent", "artifact_read", f"Reviewing {len(findings)} deterministic findings", count=len(findings), artifact="findings/canonical_findings.json")
        emit("static-agent", "plan", "Selected focus areas: " + (", ".join(plan.focus_areas) or "none"), count=len(plan.focus_areas))
        evidence_by_id = {str(item.get("evidence_id")): item for item in evidence}
        for evidence_id in task.focus_evidence_ids[:3]:
            emit("static-agent", "artifact_read", f"Inspecting evidence {evidence_id}", evidence_id=evidence_id, artifact="evidence/evidence.json")
        static_result = StaticPentestAgent(self.static_runner).run(task)
        for hypothesis in static_result.hypotheses:
            emit("static-agent", "decision", f"Hypothesis created: {hypothesis.title}", finding_id=hypothesis.hypothesis_id)
        for candidate in static_result.candidate_findings:
            emit("static-agent", "candidate_created", f"Candidate created: {candidate.title}", candidate_id=candidate.candidate_id)
        candidate_evidence_ids = list(
            dict.fromkeys(
                evidence_id
                for candidate in static_result.candidate_findings
                for evidence_id in candidate.evidence_ids
            )
        )
        for evidence_id in candidate_evidence_ids[:3]:
            item = evidence_by_id.get(evidence_id, {})
            source_path = item.get("artifact_path")
            if item.get("evidence_type") == "source" and source_path:
                selector = item.get("selector")
                location = f"{source_path}:{selector}" if selector else str(source_path)
                emit("static-agent", "artifact_read", f"Opened source context: {location}", evidence_id=evidence_id, artifact=str(source_path), candidate_relevant=True)
        emit("static-agent", "finish", static_result.summary)
        results.append(static_result)
        self._write(
            analysis_dir / "minion_static_trace.json", static_result.model_dump(mode="json")
        )
        dynamic_result = None
        if "DynamicPentestAgent" in plan.planned_agents:
            dynamic_task = AgentTask(
                task_id="TASK-DYNAMIC-1",
                target_agent="DynamicPentestAgent",
                objective="Review existing runtime evidence conservatively.",
            )
            tasks.append(dynamic_task)
            emit("orchestrator", "tool_call", "Dispatching dynamic artifact review", task_id=dynamic_task.task_id)
            emit("dynamic-agent", "start", "Reviewing available dynamic artifacts")
            dynamic_summary = {}
            dynamic_path = self.case_dir / "dynamic/dynamic_results.json"
            try:
                loaded = json.loads(dynamic_path.read_text(encoding="utf-8"))
                dynamic_summary = loaded if isinstance(loaded, dict) else {}
            except (OSError, json.JSONDecodeError):
                pass
            install = dynamic_summary.get("install") or {}
            launch = dynamic_summary.get("launch") or {}
            if install.get("attempted"):
                message = "Dynamic install succeeded" if install.get("success") else "Dynamic install failed: " + str(install.get("error") or "unknown safe failure")
                emit("dynamic-agent", "decision", message)
            if launch.get("attempted"):
                emit("dynamic-agent", "decision", "Launch status: " + ("success" if launch.get("success") else "failed"))
            dynamic_result = DynamicPentestAgent(self.case_dir).run(dynamic_task)
            emit("dynamic-agent", "artifact_read", dynamic_result.summary, count=0 if dynamic_result.status == "unavailable" else 1)
            emit("dynamic-agent", "decision", "Install/launch status: " + dynamic_result.status)
            emit("dynamic-agent", "finish", dynamic_result.summary)
            results.append(dynamic_result)
            self._write(
                analysis_dir / "minion_dynamic_trace.json", dynamic_result.model_dump(mode="json")
            )
        api_result = None
        if "ApiPentestAgent" in plan.planned_agents:
            api_task = AgentTask(
                task_id="TASK-API-1",
                target_agent="ApiPentestAgent",
                objective="Review existing API discovery without sending requests.",
                constraints=[
                    "no real external requests",
                    "probing off unless pre-existing safe artifacts are supplied",
                ],
            )
            tasks.append(api_task)
            emit("orchestrator", "tool_call", "Dispatching API artifact review", task_id=api_task.task_id)
            emit("api-agent", "start", "Reviewing available API artifacts")
            api_discovery = {}
            api_path = self.case_dir / "dynamic/api_discovery.json"
            try:
                loaded = json.loads(api_path.read_text(encoding="utf-8"))
                api_discovery = loaded if isinstance(loaded, dict) else {}
            except (OSError, json.JSONDecodeError):
                pass
            emit("api-agent", "plan", "API discovery mode: " + str(api_discovery.get("mode") or "unavailable"))
            emit(
                "api-agent",
                "plan",
                "Real API probing: " + ("disabled" if self.api_probe_mode == "off" else "safe mode enabled"),
            )
            api_result = ApiPentestAgent(self.case_dir).run(api_task)
            selected_count = int(api_discovery.get("selected_candidates_count") or 0)
            emit("api-agent", "artifact_read", f"Candidates discovered: {int(api_discovery.get('candidates_count') or 0)}", count=int(api_discovery.get("candidates_count") or 0))
            emit("api-agent", "decision", f"Selected backend candidates: {selected_count}", count=selected_count)
            requests_count = 0
            requests_path = self.case_dir / "dynamic/api_requests.json"
            try:
                loaded = json.loads(requests_path.read_text(encoding="utf-8"))
                values = loaded.get("requests", []) if isinstance(loaded, dict) else loaded
                requests_count = len(values) if isinstance(values, list) else 0
            except (OSError, json.JSONDecodeError):
                pass
            emit("api-agent", "decision", f"Probe requests sent: {requests_count}", count=requests_count)
            emit("api-agent", "finish", api_result.summary)
            results.append(api_result)
            self._write(analysis_dir / "minion_api_trace.json", api_result.model_dump(mode="json"))
        candidates = static_result.candidate_findings
        hypotheses = static_result.hypotheses
        emit("evidence-review", "start", f"Reviewing {len(candidates)} candidates", count=len(candidates))
        decisions = EvidenceReviewAgent(self.case_dir).review(candidates, evidence, findings)
        by_candidate = {candidate.candidate_id: candidate for candidate in candidates}
        for decision in decisions:
            candidate = by_candidate.get(decision.candidate_id)
            emit("evidence-review", "artifact_read", f"Checking candidate {decision.candidate_id}", candidate_id=decision.candidate_id)
            emit("evidence-review", "decision", f"Verdict: {decision.verdict} — {decision.reason}", candidate_id=decision.candidate_id, verdict=decision.verdict, finding_id=decision.promoted_to_finding, title=candidate.title if candidate else None)
        emit("evidence-review", "finish", f"Reviewed {len(decisions)} candidates", count=len(decisions))
        tasks.extend(
            [
                AgentTask(
                    task_id="TASK-REVIEW-1",
                    target_agent="EvidenceReviewAgent",
                    objective="Resolve evidence and gate every candidate.",
                ),
                AgentTask(
                    task_id="TASK-REPORT-1",
                    target_agent="ReportAgent",
                    objective="Report deterministic, promoted, duplicate, and rejected results separately.",
                ),
            ]
        )
        termination = (
            static_result.status
            if static_result.status
            in {"llm_error", "provider_error", "invalid_json", "budget_exhausted"}
            else ("no_actionable_findings" if not candidates else "completed")
        )
        _, max_tasks = LIMITS.get(self.budget, LIMITS["balanced"])
        metrics = self._metrics(results, hypotheses, candidates, decisions, termination, max_tasks)
        emit("orchestrator", "decision", "Round 1 finished")
        trace = MultiAgentTrace(
            case_id=self.case_dir.name,
            orchestrator_rounds=[
                {"round": 1, "action": "case evidence triage and minion dispatch"}
            ],
            agent_tasks=tasks[:max_tasks],
            agent_results=results,
            evidence_review=decisions,
            final_decisions={
                "accepted": [d.candidate_id for d in decisions if d.verdict == "promote"],
                "duplicates": [d.candidate_id for d in decisions if d.verdict == "duplicate_valid"],
                "rejected": [
                    d.candidate_id for d in decisions if d.verdict == "reject_insufficient_evidence"
                ],
            },
            termination_reason=termination,
            errors=[error for result in results for error in result.errors],
            metrics=metrics,
        )
        self._write(analysis_dir / "orchestrator_trace.json", trace.model_dump(mode="json"))
        self._write(
            analysis_dir / "evidence_review.json",
            [item.model_dump(mode="json") for item in decisions],
        )
        self._write(
            analysis_dir / "multi_agent_candidate_findings.json",
            [item.model_dump(mode="json") for item in candidates],
        )
        self._write(
            analysis_dir / "multi_agent_hypotheses.json",
            [item.model_dump(mode="json") for item in hypotheses],
        )
        report_path = report_dir / "multi_agent_report.md"
        emit("report-agent", "start", "Writing multi-agent report")
        emit("report-agent", "artifact_read", f"Report path: {report_path}", artifact=str(report_path))
        report = ReportAgent().render(
            deterministic_count=len(findings),
            hypotheses=hypotheses,
            candidates=candidates,
            decisions=decisions,
            dynamic_status=dynamic_result.summary if dynamic_result else "skipped/unavailable",
            api_status=api_result.summary if api_result else "probing off; artifacts unavailable",
        )
        report_path.write_text(report, encoding="utf-8")
        emit("report-agent", "finish", "Multi-agent report written", artifact=str(report_path))
        emit("orchestrator", "finish", f"Finished: {termination}", verdict=termination)
        metrics.update({
            "agent_trace_mode": "visible" if self.events.visible else "hidden",
            "agent_events_count": len(self.events.events),
            "agent_events_path": str(self.events.path),
            "agent_trace_printed": self.events.visible,
        })
        trace.metrics = metrics
        trace.agent_events_summary = {
            "path": str(self.events.path),
            "count": len(self.events.events),
            "agents": sorted({event["agent"] for event in self.events.events}),
            "event_types": sorted({event["event_type"] for event in self.events.events}),
        }
        self._write(analysis_dir / "orchestrator_trace.json", trace.model_dump(mode="json"))
        return {
            "plan": plan,
            "trace": trace,
            "metrics": metrics,
            "paths": {
                "plan": analysis_dir / "multi_agent_plan.json",
                "trace": analysis_dir / "orchestrator_trace.json",
                "review": analysis_dir / "evidence_review.json",
                "report": report_dir / "multi_agent_report.md",
                "events": self.events.path,
            },
        }

    @staticmethod
    def _write(path: Path, value: Any) -> None:
        path.write_text(json.dumps(value, indent=2, ensure_ascii=False), encoding="utf-8")

    @staticmethod
    def _metrics(
        results, hypotheses, candidates, decisions, termination, max_tasks
    ) -> dict[str, Any]:
        verdicts = [d.verdict for d in decisions]
        names = {result.agent_name for result in results}
        task_count = len(results) + 2  # evidence review and report are structured minion tasks
        return {
            "rag_enabled": False,
            "knowledge_sources": [],
            "orchestrator_rounds_count": 1,
            "minion_tasks_count": min(task_count, max_tasks),
            "static_minion_ran": "StaticPentestAgent" in names,
            "dynamic_minion_ran": "DynamicPentestAgent" in names,
            "api_minion_ran": "ApiPentestAgent" in names,
            "report_minion_ran": True,
            "evidence_review_ran": True,
            "multi_agent_hypotheses_count": len(hypotheses),
            "multi_agent_candidates_count": len(candidates),
            "multi_agent_promoted_count": verdicts.count("promote"),
            "multi_agent_duplicate_count": verdicts.count("duplicate_valid"),
            "multi_agent_rejected_count": verdicts.count("reject_insufficient_evidence"),
            "multi_agent_needs_review_count": verdicts.count("needs_manual_review")
            + verdicts.count("needs_dynamic_confirmation")
            + verdicts.count("needs_api_confirmation"),
            "multi_agent_evidence_backed_count": sum(bool(c.evidence_ids) for c in candidates),
            "multi_agent_termination_reason": termination,
            "multi_agent_errors_count": sum(len(result.errors) for result in results),
        }
