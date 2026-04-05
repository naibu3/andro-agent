from __future__ import annotations

import json
import logging

from pathlib import Path

from andro_agent.core.state import CaseState
from andro_agent.facts.manifest_facts import build_manifest_facts
from andro_agent.models import (
    ApplyManifestRulesInput,
    BuildManifestFactsInput,
    ExtractManifestInput,
)
from andro_agent.rules.manifest_rules import apply_manifest_rules
from andro_agent.tools.extract_manifest import ExtractManifestTool
from andro_agent.validators import APKValidationError, validate_apk

from andro_agent.agents.analysis_agent import AnalysisAgent

from andro_agent.models import (
    ApplyManifestRulesInput,
    BuildManifestFactsInput,
    CodeSearchInput,
    ExtractManifestInput,
    JadxDecompileInput,
    BuildCodeSearchFactsInput,
    ApplyCodeRulesInput,
)
from andro_agent.tools.code_search import CodeSearchTool
from andro_agent.tools.jadx_tool import JadxDecompileTool

from andro_agent.facts.code_search_facts import build_code_search_facts
from andro_agent.rules.code_rules import apply_code_rules

from andro_agent.bundle.static_bundle import build_static_analysis_bundle

from andro_agent.agents.markdown_report_agent import MarkdownReportAgent

from andro_agent.metrics import MetricsTracker

from andro_agent.agents.manifest_risk_agent import ManifestRiskAgent
from andro_agent.agents.code_risk_agent import CodeRiskAgent
from andro_agent.agents.risk_fusion_agent import RiskFusionAgent
from andro_agent.agents.markdown_report_agent import MarkdownReportAgent
from andro_agent.metrics import MetricsTracker

import logging

logger = logging.getLogger(__name__)

class StaticAnalysisPipeline:

    def __init__(self, artifacts_dir: Path = Path("artifacts")) -> None:
        self.artifacts_dir = artifacts_dir


    def _run_step(self, tracker: MetricsTracker, name: str, func, state: CaseState) -> None:
        tracker.start_step(name)
        try:
            func(state)
            tracker.end_step(success=True)
        except Exception as exc:
            tracker.end_step(success=False, errors=[str(exc)])
            raise


    def run(self, apk_path: Path, case_id: str) -> CaseState:
        state = CaseState(case_id=case_id, apk_path=apk_path)
        tracker = MetricsTracker(case_id, self.artifacts_dir)

        try:
            self._run_step(tracker, "validate", self._step_validate, state)
            self._run_step(tracker, "extract_manifest", self._step_extract_manifest, state)
            self._run_step(tracker, "build_manifest_facts", self._step_build_facts, state)
            self._run_step(tracker, "apply_manifest_rules", self._step_apply_rules, state)
            self._run_step(tracker, "jadx_decompile", self._step_jadx_decompile, state)
            self._run_step(tracker, "code_search", self._step_code_search, state)
            self._run_step(tracker, "build_code_facts", self._step_build_code_facts, state)
            self._run_step(tracker, "apply_code_rules", self._step_apply_code_rules, state)
            self._run_step(tracker, "build_static_bundle", self._step_build_static_bundle, state)

            try:
                tracker.start_step("manifest_risk_agent")
                self._step_manifest_risk_agent(state, tracker)
                tracker.end_step(success=True)
            except Exception as exc:
                tracker.end_step(success=False, errors=[str(exc)])
                logger.exception("[%s] manifest_risk_agent failed", state.case_id)
                state.warnings.append(f"manifest_risk_agent failed: {exc}")

            try:
                tracker.start_step("code_risk_agent")
                self._step_code_risk_agent(state, tracker)
                tracker.end_step(success=True)
            except Exception as exc:
                tracker.end_step(success=False, errors=[str(exc)])
                logger.exception("[%s] code_risk_agent failed", state.case_id)
                state.warnings.append(f"code_risk_agent failed: {exc}")

            try:
                tracker.start_step("risk_fusion_agent")
                self._step_risk_fusion_agent(state, tracker)
                tracker.end_step(success=True)
            except Exception as exc:
                tracker.end_step(success=False, errors=[str(exc)])
                logger.exception("[%s] risk_fusion_agent failed", state.case_id)
                state.warnings.append(f"risk_fusion_agent failed: {exc}")

            try:
                tracker.start_step("markdown_report_agent")
                self._step_markdown_report_agent(state, tracker)
                tracker.end_step(success=True)
            except Exception as exc:
                tracker.end_step(success=False, errors=[str(exc)])
                logger.exception("[%s] markdown_report_agent failed", state.case_id)
                state.warnings.append(f"markdown_report_agent failed: {exc}")

            state.status = "completed"

        except Exception as exc:
            state.errors.append(str(exc))
            state.status = "failed"

        finally:
            tracker.set_summary(
                {
                    "status": state.status,
                    "warnings_count": len(state.warnings),
                    "errors_count": len(state.errors),
                    "tool_history_count": len(state.tool_history),
                    "has_manifest_reasoning": state.manifest_reasoning_path is not None,
                    "has_code_reasoning": state.code_reasoning_path is not None,
                    "has_fused_reasoning": state.analysis_path is not None,
                    "has_markdown_report": state.static_report_path is not None,
                }
            )
            tracker.finalize()
            state.save(self.artifacts_dir)

        return state

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

    def _step_markdown_report_agent(self, state: CaseState, tracker: MetricsTracker) -> None:
        state.current_step = "markdown_report_agent"
        logger.info("[%s] Step: markdown_report_agent", state.case_id)

        agent = MarkdownReportAgent()
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
            report_path.write_text(result["markdown"], encoding="utf-8")

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

    def _step_manifest_risk_agent(self, state: CaseState, tracker: MetricsTracker) -> None:
        state.current_step = "manifest_risk_agent"
        logger.info("[%s] Step: manifest_risk_agent", state.case_id)

        agent = ManifestRiskAgent()
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

        agent = CodeRiskAgent()
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

        agent = RiskFusionAgent()
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