from __future__ import annotations

from pathlib import Path
import inspect
import json

from andro_agent.core.state import CaseState
from andro_agent.dynamic.planning.plan_from_static import build_dynamic_plan_from_static_bundle
from andro_agent.domain.models.dynamic import (
    DynamicAction,
    DynamicExecutionResult,
    DynamicObservation,
    DynamicPlan,
    DynamicTest,
)
from andro_agent.tools.android.adb_tool import ADBTool
from andro_agent.tools.android.emulator_tool import EmulatorTool
from andro_agent.tools.logcat_tool import LogcatTool
from andro_agent.tools.package_resolver import resolve_package_name
from andro_agent.dynamic.findings.findings_builder import build_dynamic_findings
from andro_agent.dynamic.analyzers.ui_analyzer import analyze_ui_dump
from andro_agent.dynamic.analyzers.ui_diff import compare_ui_dumps
from andro_agent.dynamic.analyzers.network_analyzer import (
    build_network_observations,
    build_network_summary_from_event_log,
)
from andro_agent.tools.network.mitmproxy_tool import MitmproxyTool
from andro_agent.tools.android.android_cert_tool import AndroidCertTool

from andro_agent.orchestration.task_models import DynamicTask, TaskExecutionResult
from andro_agent.orchestration.task_router import TaskRouter
from andro_agent.orchestration.decision_engine import DecisionEngine
from andro_agent.orchestration.dynamic_orchestrator import DynamicOrchestrator


class DynamicAnalysisPipeline:
    def __init__(
        self,
        artifacts_dir: Path = Path("artifacts"),
        sdk_root: str | None = None,
        show_avd: bool = False,
        llm_provider: str | None = None,
        llm_model: str | None = None,
    ) -> None:
        self.artifacts_dir = artifacts_dir
        self.sdk_root = sdk_root
        self.show_avd = show_avd
        self.llm_provider = llm_provider
        self.llm_model = llm_model

        self.emulator = EmulatorTool(sdk_root=sdk_root)
        self.adb = ADBTool(sdk_root=sdk_root)
        self.logcat = LogcatTool(sdk_root=sdk_root)
        self.mitmproxy = MitmproxyTool()
        self.android_cert_tool = AndroidCertTool(sdk_root=sdk_root)

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
    ) -> CaseState:
        effective_llm_provider = llm_provider or self.llm_provider
        effective_llm_model = llm_model or self.llm_model

        if (
            effective_llm_provider != self.llm_provider
            or effective_llm_model != self.llm_model
        ):
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

        http_proxy = self.mitmproxy.start(
            flows_path=mitm_flows_path,
            event_log_path=mitm_event_log_path,
        )

        self.emulator.start(
            avd_name=avd_name,
            no_window=not show_avd,
            wipe_data=False,
            http_proxy=http_proxy,
        )

        mitm_ca_path = self.android_cert_tool.resolve_mitmproxy_ca_path()
        self.android_cert_tool.install_mitmproxy_ca_as_system(mitm_ca_path)

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

            state.status = "dynamic_completed"
            state.save(self.artifacts_dir)
            return state

        finally:
            self.emulator.stop()
            self.mitmproxy.stop()

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
        permission_denied = "permission denial" in stderr_lower or "permission denial" in stdout_lower

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
                permission_denied = "permission denial" in stderr_lower or "permission denial" in stdout_lower

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