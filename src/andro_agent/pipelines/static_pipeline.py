from __future__ import annotations

import json
import logging
from dataclasses import replace
from pathlib import Path
from typing import Any

from andro_agent.agentic import AgenticBudgetPreset, AgenticMode, AgenticRuntimeConfig
from andro_agent.agents.analysis_agent import AnalysisAgent
from andro_agent.agents.code_risk_agent import CodeRiskAgent
from andro_agent.agents.manifest_risk_agent import ManifestRiskAgent
from andro_agent.agents.markdown_report_agent import MarkdownReportAgent
from andro_agent.agents.risk_fusion_agent import RiskFusionAgent
from andro_agent.agents.static_investigation_agent import StaticInvestigationAgent
from andro_agent.bundle.static_bundle import build_static_analysis_bundle
from andro_agent.core.analysis_profiles import (
    AnalysisProfile,
    get_analysis_profile_config,
    is_static_llm_configured,
)
from andro_agent.core.state import CaseState
from andro_agent.facts.code_search_facts import build_code_search_facts
from andro_agent.facts.manifest_facts import build_manifest_facts
from andro_agent.metrics import MetricsTracker
from andro_agent.models import (
    ApplyCodeRulesInput,
    ApplyManifestRulesInput,
    BuildCodeSearchFactsInput,
    BuildManifestFactsInput,
    CodeSearchInput,
    ExtractManifestInput,
    JadxDecompileInput,
)
from andro_agent.rules.code_rules import apply_code_rules
from andro_agent.rules.manifest_rules import apply_manifest_rules
from andro_agent.tools.code_search import CodeSearchTool
from andro_agent.tools.extract_manifest import ExtractManifestTool
from andro_agent.tools.reverse.jadx_tool import JadxDecompileTool
from andro_agent.validators.apk import validate_apk
from andro_agent.web.services.result_service import export_canonical_findings_and_evidence

logger = logging.getLogger(__name__)


class StaticAnalysisPipeline:
    def __init__(
        self,
        artifacts_dir: Path = Path("artifacts"),
        profile: AnalysisProfile | str = AnalysisProfile.FULL,
        agentic_mode: AgenticMode | str | None = None,
        agentic_budget: AgenticBudgetPreset | str = AgenticBudgetPreset.BALANCED,
        llm_provider: str | None = None,
        llm_model: str | None = None,
        agentic_config: AgenticRuntimeConfig | None = None,
    ) -> None:
        self.artifacts_dir = artifacts_dir
        self.profile_config = get_analysis_profile_config(profile)
        default_mode = (
            AgenticMode.SINGLE
            if self.profile_config.profile in {AnalysisProfile.FULL, AnalysisProfile.LLM}
            else AgenticMode.NONE
        )
        config = agentic_config or AgenticRuntimeConfig(
            mode=agentic_mode or default_mode,
            budget_preset=agentic_budget,
            provider=llm_provider,
            model=llm_model,
        )
        if (
            self.profile_config.profile is AnalysisProfile.NO_LLM
            and config.mode is not AgenticMode.NONE
        ):
            config = replace(config, mode=AgenticMode.NONE)
        self.agentic_config = config

    def _run_step(self, tracker: MetricsTracker, name: str, func, state: CaseState) -> None:
        tracker.start_step(name)
        try:
            func(state)
            tracker.end_step(success=True)
        except Exception as exc:
            tracker.end_step(success=False, errors=[str(exc)])
            raise

    def run(self, apk_path: Path, case_id: str) -> CaseState:
        state = CaseState(
            case_id=case_id,
            apk_path=apk_path,
            analysis_profile=self.profile_config.profile.value,
            agentic_mode=self.agentic_config.mode.value,
            agentic_strategy_runtime=self.agentic_config.strategy_runtime,
            agentic_budget=self.agentic_config.budget_preset.value,
            agentic_enabled_tools=sorted(self.agentic_config.enabled_tools),
            agentic_max_questions=self.agentic_config.max_questions,
            agentic_max_tool_calls=self.agentic_config.max_tool_calls,
            llm_provider=self.agentic_config.provider,
            llm_model=self.agentic_config.model,
        )
        tracker = MetricsTracker(case_id, self.artifacts_dir)

        try:
            self.profile_config.validate(self.agentic_config.provider)
            self._run_step(tracker, "validate", self._step_validate, state)
            self._run_step(tracker, "extract_manifest", self._step_extract_manifest, state)
            self._run_step(tracker, "build_manifest_facts", self._step_build_facts, state)
            self._run_step(tracker, "apply_manifest_rules", self._step_apply_rules, state)
            self._run_step(tracker, "jadx_decompile", self._step_jadx_decompile, state)
            self._run_step(tracker, "code_search", self._step_code_search, state)
            self._run_step(tracker, "build_code_facts", self._step_build_code_facts, state)
            self._run_step(tracker, "apply_code_rules", self._step_apply_code_rules, state)
            self._run_step(tracker, "build_static_bundle", self._step_build_static_bundle, state)

            if self.profile_config.use_llm_reasoning:
                self._run_optional_agent_step(
                    tracker, "manifest_risk_agent", self._step_manifest_risk_agent, state
                )
                self._run_optional_agent_step(
                    tracker, "code_risk_agent", self._step_code_risk_agent, state
                )
                self._run_optional_agent_step(
                    tracker, "risk_fusion_agent", self._step_risk_fusion_agent, state
                )

            if self.profile_config.compact_llm_report:
                self._run_step(
                    tracker,
                    "deterministic_report",
                    self._step_deterministic_report,
                    state,
                )
                if is_static_llm_configured(self.agentic_config.provider):
                    self._run_optional_agent_step(
                        tracker,
                        "compact_markdown_report_agent",
                        self._step_compact_markdown_report_agent,
                        state,
                    )
            elif self.profile_config.use_llm_report:
                self._run_optional_agent_step(
                    tracker, "markdown_report_agent", self._step_markdown_report_agent, state
                )
                if state.static_report_path is None:
                    self._run_step(
                        tracker,
                        "deterministic_report_fallback",
                        self._step_deterministic_report,
                        state,
                    )
            else:
                self._run_step(
                    tracker,
                    "deterministic_report",
                    self._step_deterministic_report,
                    state,
                )

            canonical_path, evidence_path = export_canonical_findings_and_evidence(
                state=state.model_dump(mode="json"),
                output_dir=self.artifacts_dir / state.case_id,
            )
            state.correlated_findings_path = canonical_path
            state.evidence_registry_path = evidence_path

            if self.agentic_config.mode is not AgenticMode.NONE:
                self._run_optional_agent_step(
                    tracker,
                    "static_investigation_agent",
                    self._step_static_investigation_agent,
                    state,
                )
                self._append_static_investigation_report(state)

            state.status = "completed"
            state.current_step = "completed"

        except Exception as exc:
            state.errors.append(str(exc))
            state.status = "failed"

        finally:
            if (
                self.agentic_config.mode is not AgenticMode.NONE
                and state.static_investigation_trace_path is None
                and any("configuration" in error.lower() for error in state.errors)
            ):
                self._write_disabled_static_investigation(state, state.errors[-1])
            investigation_metrics = self._static_investigation_metrics(state)
            tracker.set_summary(
                {
                    "status": state.status,
                    "analysis_profile": state.analysis_profile,
                    "warnings_count": len(state.warnings),
                    "errors_count": len(state.errors),
                    "tool_history_count": len(state.tool_history),
                    "has_manifest_reasoning": state.manifest_reasoning_path is not None,
                    "has_code_reasoning": state.code_reasoning_path is not None,
                    "has_fused_reasoning": state.analysis_path is not None,
                    "has_markdown_report": state.static_report_path is not None,
                    "manifest_findings_count": len(self._load_findings(state.findings_path)),
                    "code_findings_count": len(self._load_findings(state.code_findings_path)),
                    "canonical_findings_count": len(
                        self._load_findings(state.correlated_findings_path)
                    ),
                    "evidence_items_count": len(self._load_findings(state.evidence_registry_path)),
                    "dynamic_ran": False,
                    "dynamic_status": None,
                    "dynamic_observations_count": 0,
                    "dynamic_agentic_ran": False,
                    "dynamic_agentic_decisions_count": 0,
                    "dynamic_termination_reason": None,
                    **investigation_metrics,
                }
            )
            tracker.finalize()
            state.save(self.artifacts_dir)

        return state

    def _run_optional_agent_step(
        self,
        tracker: MetricsTracker,
        name: str,
        func,
        state: CaseState,
    ) -> None:
        try:
            tracker.start_step(name)
            func(state, tracker)
            tracker.end_step(success=True)
        except Exception as exc:
            tracker.end_step(success=False, errors=[str(exc)])
            logger.exception("[%s] %s failed", state.case_id, name)
            state.warnings.append(f"{name} failed: {exc}")

    # -------------------------
    # Steps
    # -------------------------

    def _step_validate(self, state: CaseState) -> None:
        state.current_step = "validate_apk"
        validate_apk(state.apk_path)

    def _step_extract_manifest(self, state: CaseState) -> None:
        state.current_step = "extract_manifest"

        logger = logging.getLogger(__name__)

        logger.info(f"[{state.case_id}] Step: extract_manifest")

        tool = ExtractManifestTool()
        result = tool.run(
            ExtractManifestInput(
                apk_path=state.apk_path,
                case_id=state.case_id,
                artifacts_dir=self.artifacts_dir,
            )
        )

        state.tool_history.append(
            {
                "tool": "extract_manifest",
                "success": result.success,
                "errors": result.errors,
            }
        )

        if not result.success:
            raise RuntimeError("extract_manifest failed")

        state.manifest_json_path = result.parsed_json_path

    def _step_build_facts(self, state: CaseState) -> None:
        state.current_step = "build_manifest_facts"

        result = build_manifest_facts(
            BuildManifestFactsInput(
                manifest_json_path=state.manifest_json_path,
                case_id=state.case_id,
                artifacts_dir=self.artifacts_dir,
            )
        )

        if not result.success:
            raise RuntimeError("build_manifest_facts failed")

        state.facts_path = result.facts_path

    def _step_apply_rules(self, state: CaseState) -> None:
        state.current_step = "apply_manifest_rules"

        result = apply_manifest_rules(
            ApplyManifestRulesInput(
                facts_json_path=state.facts_path,
                case_id=state.case_id,
                artifacts_dir=self.artifacts_dir,
            )
        )

        if not result.success:
            raise RuntimeError("apply_manifest_rules failed")

        state.findings_path = result.findings_path

    def _step_analysis_agent(self, state: CaseState, tracker: MetricsTracker) -> None:
        state.current_step = "analysis_agent"
        logger.info("[%s] Step: analysis_agent", state.case_id)

        agent = AnalysisAgent()

        # si el agente construye internamente el prompt, lo ideal es que te lo devuelva
        input_text = ""
        model_name = getattr(agent, "model_id", None)

        tracker.start_agent(
            name="analysis_agent",
            model=model_name,
            input_text=input_text,
        )

        try:
            result = agent.run(state)

            raw_text = result.get("raw", "")
            usage = result.get("usage")  # opcional, si lo consigues extraer del proveedor

            analysis_dir = self.artifacts_dir / state.case_id / "analysis"
            analysis_dir.mkdir(parents=True, exist_ok=True)

            raw_path = analysis_dir / "static_analysis_reasoning_raw.txt"
            raw_path.write_text(raw_text, encoding="utf-8")

            output_path = analysis_dir / "static_analysis_reasoning.json"
            output_path.write_text(
                json.dumps(result["parsed"], indent=2, ensure_ascii=False),
                encoding="utf-8",
            )

            state.analysis_path = output_path
            state.analysis_raw_path = raw_path

            state.tool_history.append(
                {
                    "agent": "analysis_agent",
                    "success": True,
                    "output": str(output_path),
                    "raw_output": str(raw_path),
                }
            )

            tracker.end_agent(
                output_text=raw_text,
                success=True,
                usage=usage,
            )

        except Exception as exc:
            tracker.end_agent(
                output_text="",
                success=False,
                errors=[str(exc)],
            )
            raise

    def _step_jadx_decompile(self, state: CaseState) -> None:
        state.current_step = "jadx_decompile"
        logger.info("[%s] Step: jadx_decompile", state.case_id)

        tool = JadxDecompileTool()
        result = tool.run(
            JadxDecompileInput(
                apk_path=state.apk_path,
                case_id=state.case_id,
                artifacts_dir=self.artifacts_dir,
            )
        )

        state.tool_history.append(
            {
                "tool": "jadx_decompile",
                "success": result.success,
                "errors": result.errors,
            }
        )

        if not result.success:
            state.tool_history.append(
                {
                    "tool": "jadx_decompile",
                    "success": result.success,
                    "errors": result.errors,
                    "warnings": result.warnings,
                }
            )

            state.warnings.extend(result.warnings)
            raise RuntimeError("jadx_decompile failed")

        state.jadx_output_dir = result.output_dir

    def _step_code_search(self, state: CaseState) -> None:
        state.current_step = "code_search"
        logger.info("[%s] Step: code_search", state.case_id)

        if not state.jadx_output_dir:
            raise RuntimeError("jadx output directory not available")

        source_dir = state.jadx_output_dir / "sources"
        tool = CodeSearchTool()
        result = tool.run(
            CodeSearchInput(
                source_dir=source_dir,
                case_id=state.case_id,
                artifacts_dir=self.artifacts_dir,
            )
        )

        state.tool_history.append(
            {
                "tool": "code_search",
                "success": result.success,
                "errors": result.errors,
                "matches_count": len(result.matches),
            }
        )

        if not result.success:
            raise RuntimeError("code_search failed")

        state.code_search_results_path = result.results_path

    def _step_build_code_facts(self, state: CaseState) -> None:
        state.current_step = "build_code_search_facts"
        logger.info("[%s] Step: build_code_search_facts", state.case_id)

        if not state.code_search_results_path:
            raise RuntimeError("code search results not available")

        result = build_code_search_facts(
            BuildCodeSearchFactsInput(
                code_search_results_path=state.code_search_results_path,
                case_id=state.case_id,
                artifacts_dir=self.artifacts_dir,
            )
        )

        if not result.success:
            raise RuntimeError("build_code_search_facts failed")

        state.code_facts_path = result.facts_path

    def _step_apply_code_rules(self, state: CaseState) -> None:
        state.current_step = "apply_code_rules"
        logger.info("[%s] Step: apply_code_rules", state.case_id)

        if not state.code_facts_path:
            raise RuntimeError("code facts not available")

        result = apply_code_rules(
            ApplyCodeRulesInput(
                facts_json_path=state.code_facts_path,
                case_id=state.case_id,
                artifacts_dir=self.artifacts_dir,
            )
        )

        if not result.success:
            raise RuntimeError("apply_code_rules failed")

        state.code_findings_path = result.findings_path

    def _step_build_static_bundle(self, state: CaseState) -> None:
        state.current_step = "build_static_bundle"
        logger.info("[%s] Step: build_static_bundle", state.case_id)

        bundle_path = build_static_analysis_bundle(state, self.artifacts_dir)

        state.static_analysis_bundle_path = bundle_path

    def _step_deterministic_report(self, state: CaseState) -> None:
        state.current_step = "deterministic_report"
        manifest_findings = self._load_findings(state.findings_path)
        code_findings = self._load_findings(state.code_findings_path)
        findings = manifest_findings + code_findings
        severity_counts: dict[str, int] = {}

        for finding in findings:
            severity = str(finding.get("severity") or "info").lower()
            severity_counts[severity] = severity_counts.get(severity, 0) + 1

        lines = [
            "# Static Analysis Report",
            "",
            "## Analysis summary",
            "",
            f"- Case ID: `{state.case_id}`",
            f"- Analysis profile: `{state.analysis_profile}`",
            f"- Total deterministic findings: **{len(findings)}**",
            f"- Critical: **{severity_counts.get('critical', 0)}**",
            f"- High: **{severity_counts.get('high', 0)}**",
            f"- Medium: **{severity_counts.get('medium', 0)}**",
            f"- Low: **{severity_counts.get('low', 0)}**",
            "",
            "## Methodology",
            "",
            "Manifest and code findings were produced by deterministic extraction and rules.",
            "",
            "## Findings",
            "",
        ]

        if findings:
            for finding in findings:
                title = finding.get("title") or finding.get("rule_id") or "Finding"
                severity = str(finding.get("severity") or "info").upper()
                description = finding.get("description") or finding.get("summary") or ""
                lines.extend([f"### [{severity}] {title}", "", str(description), ""])
        else:
            lines.append("No deterministic findings were identified.")

        report_dir = self.artifacts_dir / state.case_id / "report"
        report_dir.mkdir(parents=True, exist_ok=True)
        report_path = report_dir / "static_analysis_report.md"
        report_path.write_text("\n".join(lines).strip() + "\n", encoding="utf-8")
        state.static_report_path = report_path

    @staticmethod
    def _load_findings(path: Path | None) -> list[dict]:
        if not path or not path.exists():
            return []

        try:
            data = json.loads(path.read_text(encoding="utf-8"))
        except (OSError, json.JSONDecodeError):
            return []

        if isinstance(data, dict):
            data = data.get("findings", [])
        if not isinstance(data, list):
            return []
        return [item for item in data if isinstance(item, dict)]

    def _step_markdown_report_agent(self, state: CaseState, tracker: MetricsTracker) -> None:
        state.current_step = "markdown_report_agent"
        logger.info("[%s] Step: markdown_report_agent", state.case_id)

        agent = MarkdownReportAgent(
            model_id=state.llm_model,
            provider=state.llm_provider,
        )
        prompt = agent.build_prompt(state)

        tracker.start_agent(
            name="markdown_report_agent",
            model=agent.model_id,
            input_text=prompt,
        )

        try:
            result = agent.run_with_prompt(prompt)

            report_dir = self.artifacts_dir / state.case_id / "report"
            report_dir.mkdir(parents=True, exist_ok=True)

            report_path = report_dir / "static_analysis_report.md"
            report_text = (
                f"{result['markdown'].rstrip()}\n\n"
                "## Analysis metadata\n\n"
                f"- Profile: `{state.analysis_profile}`\n"
            )
            report_path.write_text(report_text, encoding="utf-8")

            state.static_report_path = report_path

            state.tool_history.append(
                {
                    "agent": "markdown_report_agent",
                    "success": True,
                    "output": str(report_path),
                }
            )

            tracker.end_agent(
                output_text=result["markdown"],
                success=True,
                usage=result.get("usage"),
            )

        except Exception as exc:
            tracker.end_agent(output_text="", success=False, errors=[str(exc)])
            raise

    def _step_compact_markdown_report_agent(
        self,
        state: CaseState,
        tracker: MetricsTracker,
    ) -> None:
        state.current_step = "compact_markdown_report_agent"
        if not state.static_report_path or not state.static_report_path.exists():
            raise RuntimeError("Deterministic report not available")

        agent = MarkdownReportAgent(
            model_id=state.llm_model,
            provider=state.llm_provider,
        )
        deterministic_report = state.static_report_path.read_text(encoding="utf-8")
        prompt = (
            "Summarize this deterministic Android security report concisely. "
            "Preserve finding counts and do not add unsupported claims.\n\n"
            f"{deterministic_report[:12000]}"
        )
        tracker.start_agent(
            name="compact_markdown_report_agent",
            model=agent.model_id,
            input_text=prompt,
        )

        try:
            result = agent.run_with_prompt(prompt)
            report_text = (
                f"{result['markdown'].rstrip()}\n\n"
                "## Analysis metadata\n\n"
                f"- Profile: `{state.analysis_profile}`\n"
            )
            state.static_report_path.write_text(report_text, encoding="utf-8")
            tracker.end_agent(
                output_text=result["markdown"],
                success=True,
                usage=result.get("usage"),
            )
        except Exception as exc:
            tracker.end_agent(output_text="", success=False, errors=[str(exc)])
            raise

    def _step_static_investigation_agent(
        self,
        state: CaseState,
        tracker: MetricsTracker,
    ) -> None:
        state.current_step = "static_investigation_agent"
        agent = StaticInvestigationAgent(
            case_dir=self.artifacts_dir / state.case_id,
            profile=state.analysis_profile,
            runtime_config=self.agentic_config,
        )
        tracker.start_agent(
            name="static_investigation_agent",
            model=agent.model_id,
            input_text="bounded static investigation",
        )
        try:
            result = agent.run()
            paths = result["paths"]
            state.static_investigation_trace_path = paths["trace"]
            state.llm_hypotheses_path = paths["hypotheses"]
            state.llm_candidate_findings_path = paths["candidates"]
            trace = result["trace"]
            state.llm_provider = trace.get("llm_provider") or state.llm_provider
            state.llm_model = trace.get("llm_model") or state.llm_model
            state.tool_history.append(
                {
                    "agent": "static_investigation_agent",
                    "success": trace["termination_reason"] == "completed",
                    "termination_reason": trace["termination_reason"],
                    "tool_calls": len(trace["tool_calls"]),
                    "output": str(paths["trace"]),
                }
            )
            if trace["termination_reason"] in {"llm_error", "tool_error"}:
                state.warnings.append(
                    "static_investigation_agent ended with "
                    f"{trace['termination_reason']}: {'; '.join(trace['errors'])}"
                )
            elif trace["termination_reason"] == "disabled":
                state.warnings.append(
                    "static_investigation_agent disabled: "
                    + ("; ".join(trace["errors"]) or "LLM configuration unavailable")
                )
            tracker.end_agent(
                output_text=json.dumps(
                    {
                        "termination_reason": trace["termination_reason"],
                        "hypotheses": len(result["hypotheses"]),
                        "candidates": len(result["candidates"]),
                    }
                ),
                success=trace["termination_reason"] not in {"llm_error", "tool_error"},
                usage=result.get("usage"),
            )
        except Exception as exc:
            tracker.end_agent(output_text="", success=False, errors=[str(exc)])
            raise

    def _write_disabled_static_investigation(self, state: CaseState, reason: str) -> None:
        result = StaticInvestigationAgent(
            case_dir=self.artifacts_dir / state.case_id,
            profile=state.analysis_profile,
            runtime_config=self.agentic_config,
        ).write_disabled_outputs(reason)
        state.static_investigation_trace_path = result["paths"]["trace"]
        state.llm_hypotheses_path = result["paths"]["hypotheses"]
        state.llm_candidate_findings_path = result["paths"]["candidates"]

    @staticmethod
    def _static_investigation_metrics(state: CaseState) -> dict[str, Any]:
        trace = {}
        if state.static_investigation_trace_path and state.static_investigation_trace_path.exists():
            try:
                trace = json.loads(
                    state.static_investigation_trace_path.read_text(encoding="utf-8")
                )
            except (OSError, json.JSONDecodeError):
                trace = {}
        hypotheses = StaticAnalysisPipeline._load_findings(state.llm_hypotheses_path)
        candidates = StaticAnalysisPipeline._load_findings(state.llm_candidate_findings_path)
        termination = trace.get("termination_reason") or "disabled"
        return {
            "agentic_mode": trace.get("agentic_mode", state.agentic_mode),
            "agentic_strategy_runtime": trace.get(
                "agentic_strategy_runtime", state.agentic_strategy_runtime
            ),
            "agentic_budget": trace.get("agentic_budget", state.agentic_budget),
            "llm_provider": trace.get("llm_provider", state.llm_provider),
            "llm_model": trace.get("llm_model", state.llm_model),
            "enabled_tools": trace.get("enabled_tools", state.agentic_enabled_tools),
            "max_questions": trace.get("budget", {}).get(
                "max_questions", state.agentic_max_questions
            ),
            "max_tool_calls": trace.get("budget", {}).get(
                "max_tool_calls", state.agentic_max_tool_calls
            ),
            "static_investigation_ran": termination != "disabled",
            "static_investigation_tool_calls": len(trace.get("tool_calls", [])),
            "static_investigation_max_tool_calls": trace.get("budget", {}).get(
                "max_tool_calls", state.agentic_max_tool_calls
            ),
            "llm_hypotheses_count": len(hypotheses),
            "llm_candidate_findings_count": len(candidates),
            "llm_candidate_findings_with_evidence_count": sum(
                bool(candidate.get("evidence_ids")) for candidate in candidates
            ),
            "static_investigation_termination_reason": termination,
            "static_investigation_failed_phase": trace.get("failed_phase"),
        }

    @staticmethod
    def _append_static_investigation_report(state: CaseState) -> None:
        if not state.static_report_path or not state.static_report_path.exists():
            return
        candidates = StaticAnalysisPipeline._load_findings(state.llm_candidate_findings_path)
        hypotheses = StaticAnalysisPipeline._load_findings(state.llm_hypotheses_path)
        if not candidates and not hypotheses:
            return

        lines: list[str] = []
        if candidates:
            lines.extend(
                [
                    "## LLM static investigation candidates",
                    "",
                    (
                        "These candidates were proposed by the static investigation agent and "
                        "should be manually reviewed. They are kept separate from deterministic "
                        "findings."
                    ),
                    "",
                ]
            )
            for candidate in candidates:
                metadata = (
                    candidate.get("metadata") if isinstance(candidate.get("metadata"), dict) else {}
                )
                evidence_ids = (
                    ", ".join(f"`{value}`" for value in candidate.get("evidence_ids", [])) or "none"
                )
                lines.extend(
                    [
                        (
                            f"### [{str(candidate.get('severity') or 'unknown').upper()}] "
                            f"{candidate.get('title') or 'Untitled candidate'}"
                        ),
                        "",
                        f"- Confidence: `{candidate.get('confidence') or 'unknown'}`",
                        f"- Evidence IDs: {evidence_ids}",
                        "",
                        str(candidate.get("description") or ""),
                        "",
                        "Why it may not have been detected by deterministic rules: "
                        + str(metadata.get("why_not_already_detected") or "Not provided."),
                        "",
                        "Remediation: " + str(candidate.get("remediation") or "Not provided."),
                        "",
                    ]
                )
        elif hypotheses:
            lines.extend(
                [
                    "## LLM investigation hypotheses",
                    "",
                    "These are investigation hypotheses, not confirmed or candidate findings.",
                    "",
                ]
            )
            for hypothesis in hypotheses:
                lines.extend(
                    [
                        f"### {hypothesis.get('title') or 'Untitled hypothesis'}",
                        "",
                        str(hypothesis.get("rationale") or ""),
                        "",
                    ]
                )
        current = state.static_report_path.read_text(encoding="utf-8").rstrip()
        state.static_report_path.write_text(
            current + "\n\n" + "\n".join(lines).rstrip() + "\n", encoding="utf-8"
        )

    def _step_manifest_risk_agent(self, state: CaseState, tracker: MetricsTracker) -> None:
        state.current_step = "manifest_risk_agent"
        logger.info("[%s] Step: manifest_risk_agent", state.case_id)

        agent = ManifestRiskAgent(model_id=state.llm_model, provider=state.llm_provider)
        prompt = agent.build_prompt(state)

        tracker.start_agent(
            name="manifest_risk_agent",
            model=agent.model_id,
            input_text=prompt,
        )

        try:
            result = agent.run_with_prompt(prompt)

            analysis_dir = self.artifacts_dir / state.case_id / "analysis"
            analysis_dir.mkdir(parents=True, exist_ok=True)

            raw_path = analysis_dir / "manifest_reasoning_raw.txt"
            raw_path.write_text(result["raw"], encoding="utf-8")

            output_path = analysis_dir / "manifest_reasoning.json"
            output_path.write_text(
                json.dumps(result["parsed"], indent=2, ensure_ascii=False),
                encoding="utf-8",
            )

            state.manifest_reasoning_path = output_path
            state.manifest_reasoning_raw_path = raw_path

            state.tool_history.append(
                {
                    "agent": "manifest_risk_agent",
                    "success": True,
                    "output": str(output_path),
                    "raw_output": str(raw_path),
                }
            )

            tracker.end_agent(
                output_text=result["raw"],
                success=True,
                usage=result.get("usage"),
            )

        except Exception as exc:
            tracker.end_agent(output_text="", success=False, errors=[str(exc)])
            raise

    def _step_code_risk_agent(self, state: CaseState, tracker: MetricsTracker) -> None:
        state.current_step = "code_risk_agent"
        logger.info("[%s] Step: code_risk_agent", state.case_id)

        agent = CodeRiskAgent(model_id=state.llm_model, provider=state.llm_provider)
        prompt = agent.build_prompt(state)

        tracker.start_agent(
            name="code_risk_agent",
            model=agent.model_id,
            input_text=prompt,
        )

        try:
            result = agent.run_with_prompt(prompt)

            analysis_dir = self.artifacts_dir / state.case_id / "analysis"
            analysis_dir.mkdir(parents=True, exist_ok=True)

            raw_path = analysis_dir / "code_reasoning_raw.txt"
            raw_path.write_text(result["raw"], encoding="utf-8")

            output_path = analysis_dir / "code_reasoning.json"
            output_path.write_text(
                json.dumps(result["parsed"], indent=2, ensure_ascii=False),
                encoding="utf-8",
            )

            state.code_reasoning_path = output_path
            state.code_reasoning_raw_path = raw_path

            state.tool_history.append(
                {
                    "agent": "code_risk_agent",
                    "success": True,
                    "output": str(output_path),
                    "raw_output": str(raw_path),
                }
            )

            tracker.end_agent(
                output_text=result["raw"],
                success=True,
                usage=result.get("usage"),
            )

        except Exception as exc:
            tracker.end_agent(output_text="", success=False, errors=[str(exc)])
            raise

    def _step_risk_fusion_agent(self, state: CaseState, tracker: MetricsTracker) -> None:
        state.current_step = "risk_fusion_agent"
        logger.info("[%s] Step: risk_fusion_agent", state.case_id)

        agent = RiskFusionAgent(model_id=state.llm_model, provider=state.llm_provider)
        prompt = agent.build_prompt(state)

        tracker.start_agent(
            name="risk_fusion_agent",
            model=agent.model_id,
            input_text=prompt,
        )

        try:
            result = agent.run_with_prompt(prompt)

            analysis_dir = self.artifacts_dir / state.case_id / "analysis"
            analysis_dir.mkdir(parents=True, exist_ok=True)

            raw_path = analysis_dir / "static_analysis_reasoning_raw.txt"
            raw_path.write_text(result["raw"], encoding="utf-8")

            output_path = analysis_dir / "static_analysis_reasoning.json"
            output_path.write_text(
                json.dumps(result["parsed"], indent=2, ensure_ascii=False),
                encoding="utf-8",
            )

            state.analysis_path = output_path
            state.analysis_raw_path = raw_path

            state.tool_history.append(
                {
                    "agent": "risk_fusion_agent",
                    "success": True,
                    "output": str(output_path),
                    "raw_output": str(raw_path),
                }
            )

            tracker.end_agent(
                output_text=result["raw"],
                success=True,
                usage=result.get("usage"),
            )

        except Exception as exc:
            tracker.end_agent(output_text="", success=False, errors=[str(exc)])
            raise
