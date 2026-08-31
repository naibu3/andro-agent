from __future__ import annotations

import inspect
import json
from contextlib import suppress
from pathlib import Path

from andro_agent.core.state import CaseState
from andro_agent.domain.models.dynamic import (
    DynamicAction,
    DynamicExecutionResult,
    DynamicObservation,
    DynamicPlan,
    DynamicTest,
)
from andro_agent.dynamic.analyzers.network_analyzer import (
    build_network_observations,
    build_network_summary_from_event_log,
)
from andro_agent.dynamic.analyzers.ui_analyzer import analyze_ui_dump
from andro_agent.dynamic.analyzers.ui_diff import compare_ui_dumps
from andro_agent.dynamic.api_discovery import ApiDiscovery, ApiDiscoveryConfig
from andro_agent.dynamic.api_probe import ApiProbe, ApiProbeConfig
from andro_agent.dynamic.findings.findings_builder import build_dynamic_findings
from andro_agent.dynamic.planning.plan_from_static import build_dynamic_plan_from_static_bundle
from andro_agent.metrics import MetricsTracker
from andro_agent.orchestration.decision_engine import DecisionEngine
from andro_agent.orchestration.dynamic_orchestrator import DynamicOrchestrator
from andro_agent.orchestration.task_models import DynamicTask, TaskExecutionResult
from andro_agent.orchestration.task_router import TaskRouter
from andro_agent.tools.android.adb_tool import ADBTool
from andro_agent.tools.android.android_cert_tool import AndroidCertTool
from andro_agent.tools.android.emulator_tool import EmulatorTool
from andro_agent.tools.logcat_tool import LogcatTool
from andro_agent.tools.network.mitmproxy_tool import MitmproxyTool
from andro_agent.tools.package_resolver import resolve_package_name


class DynamicAnalysisPipeline:
    def __init__(
        self,
        artifacts_dir: Path = Path("artifacts"),
        sdk_root: str | None = None,
        show_avd: bool = False,
        llm_provider: str | None = None,
        llm_model: str | None = None,
        api_discovery: str = "off",
        api_probe: str = "off",
        api_base_url: str | None = None,
        api_max_hosts: int = 5,
        api_max_requests: int = 30,
        api_timeout: float = 5.0,
        api_allow_hosts: tuple[str, ...] = (),
        api_allow_private: bool = False,
    ) -> None:
        self.artifacts_dir = artifacts_dir
        self.sdk_root = sdk_root
        self.show_avd = show_avd
        self.llm_provider = llm_provider
        self.llm_model = llm_model
        self.api_discovery_config = ApiDiscoveryConfig(
            mode=api_discovery, manual_base_url=api_base_url, max_hosts=api_max_hosts,
            allow_hosts=api_allow_hosts, allow_private=api_allow_private,
        )
        self.api_probe_config = ApiProbeConfig(
            mode=api_probe, max_requests=api_max_requests, timeout=api_timeout,
            allow_hosts=api_allow_hosts, allow_private=api_allow_private,
        )

        self._initialization_error: str | None = None
        try:
            self.emulator = EmulatorTool(sdk_root=sdk_root)
            self.adb = ADBTool(sdk_root=sdk_root)
            self.logcat = LogcatTool(sdk_root=sdk_root)
            self.android_cert_tool = AndroidCertTool(sdk_root=sdk_root)
        except Exception as exc:  # noqa: BLE001 - defer environment failure so run can persist it
            self._initialization_error = str(exc)
            self.emulator = None
            self.adb = None
            self.logcat = None
            self.android_cert_tool = None
        try:
            self.mitmproxy = MitmproxyTool()
        except (FileNotFoundError, RuntimeError):
            self.mitmproxy = None

        self.router = TaskRouter()
        self.decision_engine = self._build_decision_engine(
            llm_provider=llm_provider,
            llm_model=llm_model,
        )
        self.orchestrator = DynamicOrchestrator(
            router=self.router,
            decision_engine=self.decision_engine,
        )

        self.router.register("launch_app", self._handle_launch_app_task)
        self.router.register("launch_activity", self._handle_launch_activity_task)
        self.router.register("open_deeplink", self._handle_open_deeplink_task)
        self.router.register("query_content_provider", self._handle_query_content_provider_task)

        self.router.register("analyze_ui_transition", self._handle_analyze_ui_transition_task)
        self.router.register("analyze_network", self._handle_analyze_network_task)
        self.router.register("enumerate_provider_paths", self._handle_enumerate_provider_paths_task)
        self.router.register("pinning_triage", self._handle_pinning_triage_task)

    def _build_decision_engine(
        self,
        llm_provider: str | None = None,
        llm_model: str | None = None,
    ) -> DecisionEngine:
        init_signature = inspect.signature(DecisionEngine)
        init_params = init_signature.parameters

        kwargs: dict[str, object] = {}

        if llm_provider:
            if "llm_provider" in init_params:
                kwargs["llm_provider"] = llm_provider
            elif "provider" in init_params:
                kwargs["provider"] = llm_provider

        if llm_model:
            if "llm_model" in init_params:
                kwargs["llm_model"] = llm_model
            elif "model_id" in init_params:
                kwargs["model_id"] = llm_model
            elif "model" in init_params:
                kwargs["model"] = llm_model

        try:
            decision_engine = DecisionEngine(**kwargs)
        except TypeError:
            decision_engine = DecisionEngine()

        self._attach_llm_config_to_decision_engine(
            decision_engine=decision_engine,
            llm_provider=llm_provider,
            llm_model=llm_model,
        )

        return decision_engine

    def _attach_llm_config_to_decision_engine(
        self,
        decision_engine: DecisionEngine,
        llm_provider: str | None = None,
        llm_model: str | None = None,
    ) -> None:
        if llm_provider:
            for attr in ("llm_provider", "provider"):
                try:
                    setattr(decision_engine, attr, llm_provider)
                except Exception:
                    pass

        if llm_model:
            for attr in ("llm_model", "model_id", "model"):
                try:
                    setattr(decision_engine, attr, llm_model)
                except Exception:
                    pass

    def _configure_decision_engine(
        self,
        llm_provider: str | None = None,
        llm_model: str | None = None,
        agentic_decisions: bool = False,
    ) -> None:
        if hasattr(self.decision_engine, "configure_llm"):
            try:
                self.decision_engine.configure_llm(
                    llm_provider=llm_provider,
                    llm_model=llm_model,
                )
            except TypeError:
                pass

        self._attach_llm_config_to_decision_engine(
            decision_engine=self.decision_engine,
            llm_provider=llm_provider,
            llm_model=llm_model,
        )

        self.decision_engine.enable_agentic_decisions = agentic_decisions

    def _resolve_task_test_id(self, task: DynamicTask) -> str:
        if isinstance(task.context, dict):
            value = task.context.get("test_id")
            if value:
                return str(value)

        return str(task.task_id)

    def _resolve_action_parameters(self, task: DynamicTask) -> dict:
        if not isinstance(task.context, dict):
            return {}

        value = task.context.get("action_parameters")
        if isinstance(value, dict):
            return value

        return {}

    def run(
        self,
        case_id: str,
        apk_path: Path,
        avd_name: str,
        package_override: str | None = None,
        show_avd: bool = False,
        agentic_decisions: bool = False,
        llm_provider: str | None = None,
        llm_model: str | None = None,
        dynamic_timeout: int = 180,
    ) -> CaseState:
        tracker = MetricsTracker(case_id, self.artifacts_dir)
        tracker.start_step("dynamic_pipeline")
        state: CaseState | None = None
        termination_reason = "completed"
        try:
            state = self._run_impl(
                case_id=case_id,
                apk_path=apk_path,
                avd_name=avd_name,
                package_override=package_override,
                show_avd=show_avd,
                agentic_decisions=agentic_decisions,
                llm_provider=llm_provider,
                llm_model=llm_model,
                dynamic_timeout=dynamic_timeout,
            )
            if state.status == "dynamic_partial":
                termination_reason = "partial"
            tracker.end_step(success=True)
        except Exception as exc:  # noqa: BLE001 - persist a controlled dynamic failure
            termination_reason = self._dynamic_failure_reason(exc)
            tracker.end_step(success=False, errors=[str(exc)])
            if self.emulator is not None:
                with suppress(Exception):
                    self.emulator.stop()
            if self.mitmproxy is not None:
                with suppress(Exception):
                    self.mitmproxy.stop()
            try:
                state = CaseState.load(case_id, base_dir=self.artifacts_dir)
            except (FileNotFoundError, ValueError):
                state = CaseState(case_id=case_id, apk_path=apk_path)
            state.status = "dynamic_failed"
            state.current_step = termination_reason
            state.errors.append(str(exc))

        assert state is not None
        dynamic_dir = self.artifacts_dir / case_id / "dynamic"
        dynamic_dir.mkdir(parents=True, exist_ok=True)
        if state.dynamic_results_path is None:
            failure_results = dynamic_dir / "dynamic_results.json"
            failure_results.write_text(
                json.dumps(
                    {
                        "case_id": case_id,
                        "package_name": state.package_name,
                        "observations": [],
                        "artifacts": [],
                        "errors": list(state.errors),
                    },
                    indent=2,
                    ensure_ascii=False,
                ),
                encoding="utf-8",
            )
            state.dynamic_results_path = failure_results
        runtime_summary = self._write_runtime_summary(
            case_id=case_id, state=state, dynamic_dir=dynamic_dir,
            termination_reason=termination_reason,
        )
        api_summary = self._run_api_stages(state=state, dynamic_dir=dynamic_dir)
        observations_count = self._dynamic_observations_count(state.dynamic_results_path)
        decisions = [
            item for item in state.tool_history if item.get("tool") == "dynamic.agentic_decision"
        ]
        trace = {
            "case_id": case_id,
            "dynamic_ran": True,
            "dynamic_status": state.status,
            "dynamic_agentic_ran": agentic_decisions,
            "experimental": agentic_decisions,
            "llm_provider": llm_provider or self.llm_provider,
            "llm_model": llm_model or self.llm_model,
            "decisions": decisions,
            "observations_count": observations_count,
            "termination_reason": termination_reason,
            "errors": list(state.errors),
            "warnings": list(state.warnings),
        }
        (dynamic_dir / "dynamic_trace.json").write_text(
            json.dumps(trace, indent=2, ensure_ascii=False), encoding="utf-8"
        )
        if agentic_decisions:
            (dynamic_dir / "dynamic_agentic_trace.json").write_text(
                json.dumps(trace, indent=2, ensure_ascii=False), encoding="utf-8"
            )
        tracker.set_summary(
            {
                "status": state.status,
                "analysis_profile": state.analysis_profile,
                "warnings_count": len(state.warnings),
                "errors_count": len(state.errors),
                "llm_provider": llm_provider or self.llm_provider,
                "llm_model": llm_model or self.llm_model,
                "manifest_findings_count": self._json_list_count(state.findings_path),
                "code_findings_count": self._json_list_count(state.code_findings_path),
                "canonical_findings_count": self._json_list_count(state.correlated_findings_path),
                "evidence_items_count": self._json_list_count(state.evidence_registry_path),
                "agentic_mode": "single" if agentic_decisions else "none",
                "agentic_strategy_runtime": "dynamic_decision_loop"
                if agentic_decisions
                else "none",
                "agentic_budget": None,
                "static_investigation_ran": False,
                "static_investigation_tool_calls": 0,
                "llm_hypotheses_count": 0,
                "llm_candidate_findings_count": 0,
                "llm_candidate_findings_with_evidence_count": 0,
                "static_investigation_termination_reason": None,
                "dynamic_ran": True,
                "dynamic_status": state.status,
                "dynamic_observations_count": observations_count,
                "dynamic_agentic_ran": agentic_decisions,
                "dynamic_agentic_decisions_count": len(decisions),
                "dynamic_termination_reason": termination_reason,
                "dynamic_install_attempted": runtime_summary["install"]["attempted"],
                "dynamic_install_success": runtime_summary["install"]["success"],
                "dynamic_launch_attempted": runtime_summary["launch"]["attempted"],
                "dynamic_launch_success": runtime_summary["launch"]["success"],
                "dynamic_errors_count": len(runtime_summary["errors"]),
                "dynamic_warnings_count": len(runtime_summary["warnings"]),
                "api_discovery_enabled": api_summary["discovery"]["enabled"],
                "api_discovery_mode": api_summary["discovery"]["mode"],
                "api_candidates_count": api_summary["discovery"]["candidates_count"],
                "api_selected_candidates_count": api_summary["discovery"]["selected_candidates_count"],
                "api_probe_enabled": api_summary["observations"]["enabled"],
                "api_probe_mode": api_summary["observations"]["mode"],
                "api_probe_requests_count": api_summary["requests"]["requests_count"],
                "api_probe_findings_count": len(api_summary["findings"]),
                "api_probe_errors_count": api_summary["requests"]["errors_count"],
            }
        )
        tracker.finalize()
        state.save(self.artifacts_dir)
        return state

    def _write_runtime_summary(
        self, *, case_id: str, state: CaseState, dynamic_dir: Path, termination_reason: str
    ) -> dict:
        existing: dict = {}
        if state.dynamic_results_path and state.dynamic_results_path.is_file():
            try:
                value = json.loads(state.dynamic_results_path.read_text(encoding="utf-8"))
                existing = value if isinstance(value, dict) else {}
            except (OSError, json.JSONDecodeError):
                existing = {}
        observations = existing.get("observations", [])
        observations = observations if isinstance(observations, list) else []
        install_entry = next(
            (item for item in state.tool_history if item.get("tool") == "adb.install"), None
        )
        install_attempted = install_entry is not None or termination_reason == "install_failed"
        install_success = bool(install_entry and install_entry.get("returncode") == 0)
        launch_observations = [
            item for item in observations
            if item.get("signal") in {"app_launch_attempted", "activity_launch_attempted"}
            or item.get("type") in {"app_launch_attempted", "activity_launch_attempted"}
        ]
        launch_attempted = bool(launch_observations) or termination_reason == "launch_failed"
        launch_success = any(item.get("success") is True for item in launch_observations)
        launch_activity = next(
            (item.get("details", {}).get("component") for item in launch_observations if isinstance(item.get("details"), dict)),
            None,
        )
        if launch_activity is None:
            launch_activity = next(
                (
                    item.get("component")
                    for item in state.tool_history
                    if item.get("tool") == "adb.launch_activity" and item.get("component")
                ),
                None,
            )
        unresolved_launch_warning = "Launch succeeded but launch activity could not be resolved."
        if launch_success and launch_activity is None and unresolved_launch_warning not in state.warnings:
            state.warnings.append(unresolved_launch_warning)
        runtime = {
            "package_name": state.package_name,
            "launch_activity": launch_activity,
            "observations": observations,
            "logcat_hints": [],
            "network_hints": [item for item in observations if "network" in str(item.get("signal", item.get("type", ""))).lower()],
            "ui_hints": [item for item in observations if "ui" in str(item.get("signal", item.get("type", ""))).lower()],
            "errors": list(state.errors), "warnings": list(state.warnings),
        }
        runtime_path = dynamic_dir / "runtime_observations.json"
        runtime_path.write_text(json.dumps(runtime, indent=2, ensure_ascii=False), encoding="utf-8")
        state.runtime_observations_path = runtime_path
        status = "completed" if state.status == "dynamic_completed" else "failed" if not observations else "partial"
        summary = {
            **existing, "case_id": case_id, "status": status, "package_name": state.package_name,
            "install": {"attempted": install_attempted, "success": install_success,
                        "error": next((error for error in state.errors if "install" in error.lower()), None)},
            "launch": {"attempted": launch_attempted, "success": launch_success,
                       "activity": launch_activity,
                       "error": next((error for error in state.errors if "launch" in error.lower() or "activity" in error.lower()), None)},
            "runtime_observations_path": str(runtime_path), "api_discovery_path": None,
            "api_observations_path": None, "api_candidate_findings_path": None,
            "errors": list(state.errors), "warnings": list(state.warnings),
        }
        results_path = dynamic_dir / "dynamic_results.json"
        results_path.write_text(json.dumps(summary, indent=2, ensure_ascii=False), encoding="utf-8")
        state.dynamic_results_path = results_path
        return summary

    def _run_api_stages(self, *, state: CaseState, dynamic_dir: Path) -> dict:
        case_dir = dynamic_dir.parent
        discovery = ApiDiscovery(case_dir, self.api_discovery_config).discover()
        disabled_probe = ApiProbe(self.api_probe_config).probe(discovery)
        if discovery["enabled"]:
            path = dynamic_dir / "api_discovery.json"
            path.write_text(json.dumps(discovery, indent=2, ensure_ascii=False), encoding="utf-8")
            state.api_discovery_path = path
        if self.api_probe_config.mode != "off":
            requests_path = dynamic_dir / "api_requests.json"
            observations_path = dynamic_dir / "api_observations.json"
            findings_path = case_dir / "findings" / "api_candidate_findings.json"
            evidence_path = case_dir / "evidence" / "api_evidence.json"
            findings_path.parent.mkdir(parents=True, exist_ok=True)
            evidence_path.parent.mkdir(parents=True, exist_ok=True)
            for path, value in (
                (requests_path, disabled_probe["requests"]),
                (observations_path, disabled_probe["observations"]),
                (findings_path, disabled_probe["findings"]),
                (evidence_path, disabled_probe["evidence"]),
            ):
                path.write_text(json.dumps(value, indent=2, ensure_ascii=False), encoding="utf-8")
            state.api_requests_path, state.api_observations_path = requests_path, observations_path
            state.api_candidate_findings_path, state.api_evidence_path = findings_path, evidence_path
        if state.dynamic_results_path and state.dynamic_results_path.is_file():
            results = json.loads(state.dynamic_results_path.read_text(encoding="utf-8"))
            results.update({
                "api_discovery_path": str(state.api_discovery_path) if state.api_discovery_path else None,
                "api_observations_path": str(state.api_observations_path) if state.api_observations_path else None,
                "api_candidate_findings_path": str(state.api_candidate_findings_path) if state.api_candidate_findings_path else None,
            })
            state.dynamic_results_path.write_text(json.dumps(results, indent=2, ensure_ascii=False), encoding="utf-8")
        return {"discovery": discovery, **disabled_probe}

    def _run_impl(
        self,
        case_id: str,
        apk_path: Path,
        avd_name: str,
        package_override: str | None = None,
        show_avd: bool = False,
        agentic_decisions: bool = False,
        llm_provider: str | None = None,
        llm_model: str | None = None,
        dynamic_timeout: int = 180,
    ) -> CaseState:
        if self._initialization_error:
            raise RuntimeError(f"Emulator environment unavailable: {self._initialization_error}")
        assert self.emulator is not None
        assert self.adb is not None
        assert self.logcat is not None
        assert self.android_cert_tool is not None
        effective_llm_provider = llm_provider or self.llm_provider
        effective_llm_model = llm_model or self.llm_model

        if effective_llm_provider != self.llm_provider or effective_llm_model != self.llm_model:
            self.llm_provider = effective_llm_provider
            self.llm_model = effective_llm_model
            self.decision_engine = self._build_decision_engine(
                llm_provider=effective_llm_provider,
                llm_model=effective_llm_model,
            )
            self.orchestrator = DynamicOrchestrator(
                router=self.router,
                decision_engine=self.decision_engine,
            )

        self._configure_decision_engine(
            llm_provider=effective_llm_provider,
            llm_model=effective_llm_model,
            agentic_decisions=agentic_decisions,
        )

        state = CaseState.load(case_id, base_dir=self.artifacts_dir)
        state.current_step = "dynamic_pipeline"
        state.device_profile = "baseline"

        package_name = resolve_package_name(
            state=state,
            apk_path=apk_path,
            package_override=package_override,
        )
        state.package_name = package_name

        if agentic_decisions:
            state.tool_history.append(
                {
                    "tool": "dynamic.decision_engine",
                    "agentic_decisions": agentic_decisions,
                    "llm_provider": effective_llm_provider,
                    "llm_model": effective_llm_model,
                }
            )

        case_dir = self.artifacts_dir / case_id
        dynamic_dir = case_dir / "dynamic"
        dynamic_dir.mkdir(parents=True, exist_ok=True)

        plan = self._build_plan(state=state, package_name=package_name)
        plan_path = dynamic_dir / "dynamic_plan.json"
        plan_path.write_text(plan.model_dump_json(indent=2), encoding="utf-8")
        state.dynamic_plan_path = plan_path
        state.save(self.artifacts_dir)

        network_dir = dynamic_dir / "network"
        network_dir.mkdir(parents=True, exist_ok=True)

        mitm_event_log_path = network_dir / "mitmdump.log"
        mitm_flows_path = network_dir / "flows.mitm"

        http_proxy = None
        if self.mitmproxy is not None:
            http_proxy = self.mitmproxy.start(
                flows_path=mitm_flows_path,
                event_log_path=mitm_event_log_path,
            )

        self.emulator.start(
            avd_name=avd_name,
            no_window=not show_avd,
            wipe_data=False,
            http_proxy=http_proxy,
            boot_timeout=dynamic_timeout,
        )

        if self.mitmproxy is not None:
            try:
                mitm_ca_path = self.android_cert_tool.resolve_mitmproxy_ca_path()
                self.android_cert_tool.install_mitmproxy_ca_as_system(mitm_ca_path)
            except (FileNotFoundError, RuntimeError, TimeoutError) as exc:
                state.warnings.append(f"Optional mitmproxy CA setup unavailable: {exc}")

        try:
            install = self.adb.install_apk(apk_path)
            state.tool_history.append(
                {
                    "tool": "adb.install",
                    "returncode": install.returncode,
                    "stdout": install.stdout,
                    "stderr": install.stderr,
                }
            )

            if install.returncode != 0:
                raise RuntimeError(f"install_apk failed: {install.stderr}")

            observations: list[DynamicObservation] = []
            artifacts: list[str] = []
            errors: list[str] = []

            tasks = self._build_tasks_from_plan(plan)

            raw_observations, orchestrator_artifacts, orchestrator_errors = self.orchestrator.run(
                state={
                    "case_id": case_id,
                    "package_name": package_name,
                    "dynamic_dir": str(dynamic_dir),
                    "apk_path": str(apk_path),
                    "pipeline": self,
                    "case_state": state,
                    "llm_provider": effective_llm_provider,
                    "llm_model": effective_llm_model,
                    "agentic_decisions": agentic_decisions,
                },
                initial_tasks=tasks,
            )

            observations = [DynamicObservation(**obs) for obs in raw_observations]
            artifacts.extend(orchestrator_artifacts)
            errors.extend(orchestrator_errors)
            failed_launch = next(
                (
                    observation for observation in raw_observations
                    if observation.get("signal")
                    in {"app_launch_attempted", "activity_launch_attempted"}
                    and observation.get("success") is False
                ),
                None,
            )
            if failed_launch:
                metadata = failed_launch.get("metadata", {})
                detail = metadata.get("stderr") if isinstance(metadata, dict) else None
                errors.append(
                    f"App launch failed: {detail or 'ADB launch command returned an error'}"
                )

            network_summary = build_network_summary_from_event_log(mitm_event_log_path)
            network_summary_path = network_dir / "network_summary.json"
            network_summary_path.write_text(
                json.dumps(network_summary, indent=2),
                encoding="utf-8",
            )

            network_observations = build_network_observations(
                test_id="network-session",
                network_summary=network_summary,
                summary_path=network_summary_path,
            )
            for obs_item in network_observations:
                observations.append(DynamicObservation(**obs_item))

            artifacts.extend(
                [
                    str(mitm_event_log_path),
                    str(mitm_flows_path),
                    str(network_summary_path),
                ]
            )

            result = DynamicExecutionResult(
                case_id=case_id,
                package_name=package_name,
                device_profile="baseline",
                tests_executed=len(plan.tests),
                observations=observations,
                artifacts=artifacts,
                errors=errors,
            )

            results_path = dynamic_dir / "dynamic_results.json"
            results_path.write_text(result.model_dump_json(indent=2), encoding="utf-8")
            state.dynamic_results_path = results_path

            dynamic_findings = build_dynamic_findings(
                observations=[obs.model_dump() for obs in observations],
                dynamic_artifacts=artifacts,
            )

            findings_path = dynamic_dir / "dynamic_findings.json"
            findings_path.write_text(
                json.dumps(dynamic_findings, indent=2),
                encoding="utf-8",
            )

            state.dynamic_results_path = results_path
            state.dynamic_report_path = findings_path

            state.errors.extend(error for error in errors if error not in state.errors)
            state.status = "dynamic_partial" if errors else "dynamic_completed"
            state.save(self.artifacts_dir)
            return state

        finally:
            self.emulator.stop()
            if self.mitmproxy is not None:
                self.mitmproxy.stop()

    @staticmethod
    def _dynamic_failure_reason(exc: Exception) -> str:
        message = str(exc).casefold()
        if "install" in message:
            return "install_failed"
        if "package" in message:
            return "package_resolution_failed"
        if "launch" in message or "activity" in message:
            return "launch_failed"
        if any(value in message for value in ("emulator", "adb", "device", "avd")):
            return "emulator_unavailable"
        return "dynamic_error"

    @staticmethod
    def _dynamic_observations_count(path: Path | None) -> int:
        if not path or not path.is_file():
            return 0
        try:
            value = json.loads(path.read_text(encoding="utf-8"))
        except (OSError, json.JSONDecodeError):
            return 0
        observations = value.get("observations", []) if isinstance(value, dict) else []
        return len(observations) if isinstance(observations, list) else 0

    @staticmethod
    def _json_list_count(path: Path | None) -> int:
        if not path or not path.is_file():
            return 0
        try:
            value = json.loads(path.read_text(encoding="utf-8"))
        except (OSError, json.JSONDecodeError):
            return 0
        return len(value) if isinstance(value, list) else 0

    def _build_plan(self, state: CaseState, package_name: str) -> DynamicPlan:
        bundle_path = state.static_analysis_bundle_path
        if bundle_path and bundle_path.exists():
            return build_dynamic_plan_from_static_bundle(
                case_id=state.case_id,
                bundle_path=bundle_path,
                package_name=package_name,
            )

        return DynamicPlan(
            case_id=state.case_id,
            package_name=package_name,
            device_profile="baseline",
            tests=[
                DynamicTest(
                    test_id="dyn-001",
                    title="Launch main app entrypoint",
                    masvs_control_group="MASVS-PLATFORM",
                    category="app_launch",
                    priority="high",
                    actions=[DynamicAction(action="launch_app", parameters={})],
                    expected_signals=["app_launch_attempted"],
                )
            ],
        )

    def _detect_crash_from_logcat(
        self,
        test_id: str,
        log_path: Path,
    ) -> list[DynamicObservation]:
        observations: list[DynamicObservation] = []

        if not log_path.exists():
            return observations

        try:
            content = log_path.read_text(encoding="utf-8", errors="ignore")
        except Exception:
            return observations

        lower = content.lower()

        crash_markers = [
            "fatal exception",
            "androidruntime",
            "java.lang.runtimeexception",
            "force finishing activity",
            "process owasp.sat.agoat has died",
            "fatal signal",
        ]

        matched_markers = [marker for marker in crash_markers if marker in lower]

        if matched_markers:
            observations.append(
                DynamicObservation(
                    test_id=test_id,
                    signal="crash_detected_in_logcat",
                    success=True,
                    summary="Potential application crash detected in logcat",
                    metadata={
                        "log_path": str(log_path),
                        "matched_markers": matched_markers,
                    },
                )
            )

        return observations

    def _build_tasks_from_plan(self, plan: DynamicPlan) -> list[DynamicTask]:
        tasks: list[DynamicTask] = []

        for test in plan.tests:
            for action in test.actions:
                action_parameters = action.parameters or {}

                tasks.append(
                    DynamicTask(
                        task_id=test.test_id,
                        kind=action.action,
                        priority=test.priority,
                        target=action_parameters.get("component")
                        or action_parameters.get("url")
                        or action_parameters.get("uri"),
                        context={
                            "test_id": test.test_id,
                            "test_title": test.title,
                            "test_category": test.category,
                            "masvs_control_group": test.masvs_control_group,
                            "action_parameters": action_parameters,
                        },
                    )
                )

        return tasks

    def _handle_launch_app_task(
        self,
        task: DynamicTask,
        state_ctx: dict,
    ) -> TaskExecutionResult:
        package_name = state_ctx["package_name"]
        case_state = state_ctx["case_state"]
        dynamic_dir = Path(state_ctx["dynamic_dir"])
        test_id = self._resolve_task_test_id(task)

        test_dir = dynamic_dir / test_id
        test_dir.mkdir(parents=True, exist_ok=True)

        before_ui_path = test_dir / "ui_before.xml"
        after_ui_path = test_dir / "ui.xml"
        log_path = test_dir / "logcat.txt"
        screen_path = test_dir / "screen.png"

        self.adb.dump_ui(before_ui_path)
        self.logcat.clear()

        proc = self.adb.launch_app(package_name)
        case_state.tool_history.append(
            {
                "tool": "adb.launch_app",
                "test_id": test_id,
                "returncode": proc.returncode,
                "stdout": proc.stdout,
                "stderr": proc.stderr,
            }
        )

        observations = [
            {
                "test_id": test_id,
                "signal": "app_launch_attempted",
                "success": proc.returncode == 0,
                "summary": "Main launcher intent executed",
                "metadata": {"stdout": proc.stdout, "stderr": proc.stderr},
            }
        ]

        artifacts = self._collect_post_action_artifacts(
            test_id=test_id,
            log_path=log_path,
            screen_path=screen_path,
            after_ui_path=after_ui_path,
            before_ui_path=before_ui_path,
            package_name=package_name,
            observations=observations,
        )

        return TaskExecutionResult(
            task_id=task.task_id,
            success=proc.returncode == 0,
            observations=observations,
            artifacts=artifacts,
        )

    def _handle_launch_activity_task(
        self,
        task: DynamicTask,
        state_ctx: dict,
    ) -> TaskExecutionResult:
        package_name = state_ctx["package_name"]
        case_state = state_ctx["case_state"]
        dynamic_dir = Path(state_ctx["dynamic_dir"])
        test_id = self._resolve_task_test_id(task)

        action_parameters = self._resolve_action_parameters(task)
        component = str(action_parameters.get("component") or task.target or "")

        test_dir = dynamic_dir / test_id
        test_dir.mkdir(parents=True, exist_ok=True)

        before_ui_path = test_dir / "ui_before.xml"
        after_ui_path = test_dir / "ui.xml"
        log_path = test_dir / "logcat.txt"
        screen_path = test_dir / "screen.png"

        self.adb.dump_ui(before_ui_path)
        self.logcat.clear()

        proc = self.adb.launch_activity(component)
        case_state.tool_history.append(
            {
                "tool": "adb.launch_activity",
                "test_id": test_id,
                "component": component,
                "returncode": proc.returncode,
                "stdout": proc.stdout,
                "stderr": proc.stderr,
            }
        )

        observations = [
            {
                "test_id": test_id,
                "signal": "activity_launch_attempted",
                "success": proc.returncode == 0,
                "summary": f"Activity launch attempted for {component}",
                "metadata": {"stdout": proc.stdout, "stderr": proc.stderr},
            }
        ]

        artifacts = self._collect_post_action_artifacts(
            test_id=test_id,
            log_path=log_path,
            screen_path=screen_path,
            after_ui_path=after_ui_path,
            before_ui_path=before_ui_path,
            package_name=package_name,
            observations=observations,
        )

        return TaskExecutionResult(
            task_id=task.task_id,
            success=proc.returncode == 0,
            observations=observations,
            artifacts=artifacts,
        )

    def _handle_open_deeplink_task(
        self,
        task: DynamicTask,
        state_ctx: dict,
    ) -> TaskExecutionResult:
        package_name = state_ctx["package_name"]
        case_state = state_ctx["case_state"]
        dynamic_dir = Path(state_ctx["dynamic_dir"])
        test_id = self._resolve_task_test_id(task)

        action_parameters = self._resolve_action_parameters(task)
        url = str(action_parameters.get("url") or task.target or "")

        test_dir = dynamic_dir / test_id
        test_dir.mkdir(parents=True, exist_ok=True)

        before_ui_path = test_dir / "ui_before.xml"
        after_ui_path = test_dir / "ui.xml"
        log_path = test_dir / "logcat.txt"
        screen_path = test_dir / "screen.png"

        self.adb.dump_ui(before_ui_path)
        self.logcat.clear()

        proc = self.adb.open_deeplink(url)
        case_state.tool_history.append(
            {
                "tool": "adb.open_deeplink",
                "test_id": test_id,
                "url": url,
                "returncode": proc.returncode,
                "stdout": proc.stdout,
                "stderr": proc.stderr,
            }
        )

        observations = [
            {
                "test_id": test_id,
                "signal": "deeplink_launch_attempted",
                "success": proc.returncode == 0,
                "summary": f"Deep link launch attempted for {url}",
                "metadata": {"stdout": proc.stdout, "stderr": proc.stderr},
            }
        ]

        artifacts = self._collect_post_action_artifacts(
            test_id=test_id,
            log_path=log_path,
            screen_path=screen_path,
            after_ui_path=after_ui_path,
            before_ui_path=before_ui_path,
            package_name=package_name,
            observations=observations,
        )

        return TaskExecutionResult(
            task_id=task.task_id,
            success=proc.returncode == 0,
            observations=observations,
            artifacts=artifacts,
        )

    def _handle_query_content_provider_task(
        self,
        task: DynamicTask,
        state_ctx: dict,
    ) -> TaskExecutionResult:
        package_name = state_ctx["package_name"]
        case_state = state_ctx["case_state"]
        dynamic_dir = Path(state_ctx["dynamic_dir"])
        test_id = self._resolve_task_test_id(task)

        action_parameters = self._resolve_action_parameters(task)
        uri = str(action_parameters.get("uri") or task.target or "")

        test_dir = dynamic_dir / test_id
        test_dir.mkdir(parents=True, exist_ok=True)

        before_ui_path = test_dir / "ui_before.xml"
        after_ui_path = test_dir / "ui.xml"
        log_path = test_dir / "logcat.txt"
        screen_path = test_dir / "screen.png"

        self.adb.dump_ui(before_ui_path)
        self.logcat.clear()

        proc = self.adb.query_content_provider(uri)
        case_state.tool_history.append(
            {
                "tool": "adb.query_content_provider",
                "test_id": test_id,
                "uri": uri,
                "returncode": proc.returncode,
                "stdout": proc.stdout,
                "stderr": proc.stderr,
            }
        )

        stdout_lower = (proc.stdout or "").lower()
        stderr_lower = (proc.stderr or "").lower()
        rows_detected = "row:" in stdout_lower
        permission_denied = (
            "permission denial" in stderr_lower or "permission denial" in stdout_lower
        )

        observations = [
            {
                "test_id": test_id,
                "signal": "content_provider_query_attempted",
                "success": proc.returncode == 0,
                "summary": f"Content provider query attempted for {uri}",
                "metadata": {"stdout": proc.stdout, "stderr": proc.stderr},
            },
            {
                "test_id": test_id,
                "signal": "content_provider_rows_detected",
                "success": rows_detected,
                "summary": f"Content provider returned rows for {uri}",
                "metadata": {"stdout": proc.stdout, "stderr": proc.stderr},
            },
            {
                "test_id": test_id,
                "signal": "content_provider_permission_denied",
                "success": permission_denied,
                "summary": f"Content provider permission denial status for {uri}",
                "metadata": {"stdout": proc.stdout, "stderr": proc.stderr},
            },
        ]

        artifacts = self._collect_post_action_artifacts(
            test_id=test_id,
            log_path=log_path,
            screen_path=screen_path,
            after_ui_path=after_ui_path,
            before_ui_path=before_ui_path,
            package_name=package_name,
            observations=observations,
        )

        return TaskExecutionResult(
            task_id=task.task_id,
            success=proc.returncode == 0,
            observations=observations,
            artifacts=artifacts,
        )

    def _handle_analyze_ui_transition_task(
        self,
        task: DynamicTask,
        state_ctx: dict,
    ) -> TaskExecutionResult:
        dynamic_dir = Path(state_ctx["dynamic_dir"])
        package_name = state_ctx["package_name"]
        test_id = self._resolve_task_test_id(task)

        observations = [
            {
                "test_id": test_id,
                "signal": "agentic_ui_transition_analysis_requested",
                "success": True,
                "summary": "Agent requested UI transition analysis based on collected UI artifacts",
                "metadata": {
                    "task_id": task.task_id,
                    "target": task.target,
                    "package_name": package_name,
                    "context": task.context,
                    "dynamic_dir": str(dynamic_dir),
                },
            }
        ]

        return TaskExecutionResult(
            task_id=task.task_id,
            success=True,
            observations=observations,
            artifacts=[],
        )

    def _handle_analyze_network_task(
        self,
        task: DynamicTask,
        state_ctx: dict,
    ) -> TaskExecutionResult:
        dynamic_dir = Path(state_ctx["dynamic_dir"])
        network_dir = dynamic_dir / "network"
        test_id = self._resolve_task_test_id(task)

        network_summary_path = network_dir / "network_summary.json"
        mitm_event_log_path = network_dir / "mitmdump.log"
        mitm_flows_path = network_dir / "flows.mitm"

        artifacts: list[str] = []

        if network_summary_path.exists():
            artifacts.append(str(network_summary_path))

        if mitm_event_log_path.exists():
            artifacts.append(str(mitm_event_log_path))

        if mitm_flows_path.exists():
            artifacts.append(str(mitm_flows_path))

        observations = [
            {
                "test_id": test_id,
                "signal": "agentic_network_analysis_requested",
                "success": True,
                "summary": "Agent requested network analysis based on mitmproxy artifacts",
                "metadata": {
                    "task_id": task.task_id,
                    "target": task.target,
                    "context": task.context,
                    "network_summary_path": str(network_summary_path),
                    "mitm_event_log_path": str(mitm_event_log_path),
                    "mitm_flows_path": str(mitm_flows_path),
                    "artifacts_found": artifacts,
                },
            }
        ]

        return TaskExecutionResult(
            task_id=task.task_id,
            success=True,
            observations=observations,
            artifacts=artifacts,
        )

    def _handle_enumerate_provider_paths_task(
        self,
        task: DynamicTask,
        state_ctx: dict,
    ) -> TaskExecutionResult:
        package_name = state_ctx["package_name"]
        dynamic_dir = Path(state_ctx["dynamic_dir"])
        test_id = self._resolve_task_test_id(task)

        observations = [
            {
                "test_id": test_id,
                "signal": "agentic_provider_path_enumeration_requested",
                "success": True,
                "summary": "Agent requested content provider path enumeration",
                "metadata": {
                    "task_id": task.task_id,
                    "target": task.target,
                    "package_name": package_name,
                    "dynamic_dir": str(dynamic_dir),
                    "context": task.context,
                },
            }
        ]

        return TaskExecutionResult(
            task_id=task.task_id,
            success=True,
            observations=observations,
            artifacts=[],
        )

    def _handle_pinning_triage_task(
        self,
        task: DynamicTask,
        state_ctx: dict,
    ) -> TaskExecutionResult:
        dynamic_dir = Path(state_ctx["dynamic_dir"])
        network_dir = dynamic_dir / "network"
        test_id = self._resolve_task_test_id(task)

        network_summary_path = network_dir / "network_summary.json"
        mitm_event_log_path = network_dir / "mitmdump.log"
        mitm_flows_path = network_dir / "flows.mitm"

        artifacts: list[str] = []

        if network_summary_path.exists():
            artifacts.append(str(network_summary_path))

        if mitm_event_log_path.exists():
            artifacts.append(str(mitm_event_log_path))

        if mitm_flows_path.exists():
            artifacts.append(str(mitm_flows_path))

        observations = [
            {
                "test_id": test_id,
                "signal": "agentic_pinning_triage_requested",
                "success": True,
                "summary": "Agent requested TLS pinning triage based on network/proxy evidence",
                "metadata": {
                    "task_id": task.task_id,
                    "target": task.target,
                    "context": task.context,
                    "network_summary_path": str(network_summary_path),
                    "mitm_event_log_path": str(mitm_event_log_path),
                    "mitm_flows_path": str(mitm_flows_path),
                    "artifacts_found": artifacts,
                },
            }
        ]

        return TaskExecutionResult(
            task_id=task.task_id,
            success=True,
            observations=observations,
            artifacts=artifacts,
        )

    def _collect_post_action_artifacts(
        self,
        test_id: str,
        log_path: Path,
        screen_path: Path,
        after_ui_path: Path,
        before_ui_path: Path,
        package_name: str,
        observations: list[dict],
    ) -> list[str]:
        self.logcat.dump(log_path)
        self.adb.screenshot(screen_path)
        self.adb.dump_ui(after_ui_path)

        artifacts = [
            str(before_ui_path),
            str(log_path),
            str(screen_path),
            str(after_ui_path),
        ]

        crash_observations = self._detect_crash_from_logcat(
            test_id=test_id,
            log_path=log_path,
        )
        observations.extend([obs.model_dump() for obs in crash_observations])

        ui_observations = analyze_ui_dump(
            test_id=test_id,
            ui_path=after_ui_path,
            package_name=package_name,
        )
        observations.extend(ui_observations)

        ui_diff_observations = compare_ui_dumps(
            test_id=test_id,
            before_ui_path=before_ui_path,
            after_ui_path=after_ui_path,
        )
        observations.extend(ui_diff_observations)

        return artifacts

    def _execute_test(
        self,
        test: DynamicTest,
        package_name: str,
        test_dir: Path,
        state: CaseState,
    ) -> list[DynamicObservation]:
        observations: list[DynamicObservation] = []

        for action in test.actions:
            if action.action == "launch_app":
                proc = self.adb.launch_app(package_name)
                state.tool_history.append(
                    {
                        "tool": "adb.launch_app",
                        "test_id": test.test_id,
                        "returncode": proc.returncode,
                        "stdout": proc.stdout,
                        "stderr": proc.stderr,
                    }
                )
                observations.append(
                    DynamicObservation(
                        test_id=test.test_id,
                        signal="app_launch_attempted",
                        success=proc.returncode == 0,
                        summary="Main launcher intent executed",
                        metadata={"stdout": proc.stdout, "stderr": proc.stderr},
                    )
                )

            elif action.action == "launch_activity":
                component = str((action.parameters or {}).get("component", ""))
                proc = self.adb.launch_activity(component)
                state.tool_history.append(
                    {
                        "tool": "adb.launch_activity",
                        "test_id": test.test_id,
                        "component": component,
                        "returncode": proc.returncode,
                        "stdout": proc.stdout,
                        "stderr": proc.stderr,
                    }
                )
                observations.append(
                    DynamicObservation(
                        test_id=test.test_id,
                        signal="activity_launch_attempted",
                        success=proc.returncode == 0,
                        summary=f"Activity launch attempted for {component}",
                        metadata={"stdout": proc.stdout, "stderr": proc.stderr},
                    )
                )

            elif action.action == "open_deeplink":
                url = str((action.parameters or {}).get("url", ""))
                proc = self.adb.open_deeplink(url)
                state.tool_history.append(
                    {
                        "tool": "adb.open_deeplink",
                        "test_id": test.test_id,
                        "url": url,
                        "returncode": proc.returncode,
                        "stdout": proc.stdout,
                        "stderr": proc.stderr,
                    }
                )
                observations.append(
                    DynamicObservation(
                        test_id=test.test_id,
                        signal="deeplink_launch_attempted",
                        success=proc.returncode == 0,
                        summary=f"Deep link launch attempted for {url}",
                        metadata={"stdout": proc.stdout, "stderr": proc.stderr},
                    )
                )

            elif action.action == "query_content_provider":
                uri = str((action.parameters or {}).get("uri", ""))
                proc = self.adb.query_content_provider(uri)
                state.tool_history.append(
                    {
                        "tool": "adb.query_content_provider",
                        "test_id": test.test_id,
                        "uri": uri,
                        "returncode": proc.returncode,
                        "stdout": proc.stdout,
                        "stderr": proc.stderr,
                    }
                )

                stdout_lower = (proc.stdout or "").lower()
                stderr_lower = (proc.stderr or "").lower()
                success = proc.returncode == 0
                rows_detected = "row:" in stdout_lower
                permission_denied = (
                    "permission denial" in stderr_lower or "permission denial" in stdout_lower
                )

                observations.append(
                    DynamicObservation(
                        test_id=test.test_id,
                        signal="content_provider_query_attempted",
                        success=success,
                        summary=f"Content provider query attempted for {uri}",
                        metadata={"stdout": proc.stdout, "stderr": proc.stderr},
                    )
                )

                observations.append(
                    DynamicObservation(
                        test_id=test.test_id,
                        signal="content_provider_rows_detected",
                        success=rows_detected,
                        summary=f"Content provider returned rows for {uri}",
                        metadata={"stdout": proc.stdout, "stderr": proc.stderr},
                    )
                )

                observations.append(
                    DynamicObservation(
                        test_id=test.test_id,
                        signal="content_provider_permission_denied",
                        success=permission_denied,
                        summary=f"Content provider permission denial status for {uri}",
                        metadata={"stdout": proc.stdout, "stderr": proc.stderr},
                    )
                )

        return observations
