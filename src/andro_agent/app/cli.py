from __future__ import annotations

from pathlib import Path

import typer
import uvicorn
from dotenv import load_dotenv
from rich import box
from rich.console import Console
from rich.table import Table

from andro_agent.agentic import AgenticBudgetPreset, AgenticMode
from andro_agent.core.analysis_profiles import AnalysisProfile
from andro_agent.core.state import CaseState
from andro_agent.dynamic.setup import run_dynamic_setup
from andro_agent.facts.code_search_facts import build_code_search_facts
from andro_agent.facts.manifest_facts import build_manifest_facts
from andro_agent.models import (
    ApplyCodeRulesInput,
    ApplyManifestRulesInput,
    BuildCodeSearchFactsInput,
    BuildManifestFactsInput,
    CodeSearchInput,
    ExtractManifestInput,
    JadxDecompileInput,
)
from andro_agent.pipelines.dynamic_pipeline import DynamicAnalysisPipeline
from andro_agent.pipelines.static_pipeline import StaticAnalysisPipeline
from andro_agent.rules.code_rules import apply_code_rules
from andro_agent.rules.manifest_rules import apply_manifest_rules
from andro_agent.tools.code_search import CodeSearchTool
from andro_agent.tools.extract_manifest import ExtractManifestTool
from andro_agent.tools.reverse.jadx_tool import JadxDecompileTool
from andro_agent.utils.logging import setup_logging
from andro_agent.validators.apk import APKValidationError, validate_apk

load_dotenv()

app = typer.Typer(
    help="Andro-Agent CLI",
    no_args_is_help=True,
    rich_markup_mode="rich",
)

manifest_app = typer.Typer(help="Manifest-related commands")
app.add_typer(manifest_app, name="manifest")

facts_app = typer.Typer(help="Facts-related commands")
app.add_typer(facts_app, name="facts")

rules_app = typer.Typer(help="Rules-related commands")
app.add_typer(rules_app, name="rules")

code_app = typer.Typer(help="Code analysis commands")
app.add_typer(code_app, name="code")

dynamic_app = typer.Typer(help="Dynamic analysis commands")
app.add_typer(dynamic_app, name="dynamic")

console = Console()


@app.command("init-dirs")
def init_dirs(
    base_dir: Path = typer.Option(
        Path("."),
        "--base-dir",
        help="Base directory where project folders will be created.",
    ),
) -> None:
    """
    Create the base directories used by the project.
    """
    directories = [
        base_dir / "samples",
        base_dir / "artifacts",
        base_dir / "vm-reports",
        base_dir / "tests",
    ]

    for directory in directories:
        directory.mkdir(parents=True, exist_ok=True)

    console.print("[green]Directories initialized successfully.[/green]")

    table = Table(title="Created / Verified directories")
    table.add_column("Path", style="cyan")

    for directory in directories:
        table.add_row(str(directory))

    console.print(table)


@app.command("validate")
def validate(apk_path: Path = typer.Argument(..., help="Path to the APK file.")) -> None:
    """
    Validate APK input.
    """
    try:
        validated_path = validate_apk(apk_path)
        console.print(f"[green]Valid APK:[/green] {validated_path}")
    except APKValidationError as exc:
        console.print(f"[red]Validation error:[/red] {exc}")
        raise typer.Exit(code=1)


@app.command("inspect")
def inspect(
    apk_path: Path = typer.Argument(..., help="Path to the APK file."),
    case_id: str = typer.Option("default_case", "--case-id", help="Case identifier."),
    artifacts_dir: Path = typer.Option(
        Path("artifacts"),
        "--artifacts-dir",
        help="Base artifacts directory.",
    ),
) -> None:
    """
    Minimal inspection command.
    Validates the APK, extracts/parses AndroidManifest.xml,
    builds normalized manifest facts, and applies deterministic rules.
    """
    try:
        validate_apk(apk_path)
    except APKValidationError as exc:
        console.print(f"[red]Inspection error:[/red] {exc}")
        raise typer.Exit(code=1)

    tool = ExtractManifestTool()
    manifest_result = tool.run(
        ExtractManifestInput(
            apk_path=apk_path,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not manifest_result.success:
        console.print("[red]Inspection failed during manifest extraction.[/red]")
        for error in manifest_result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    facts_result = build_manifest_facts(
        BuildManifestFactsInput(
            manifest_json_path=manifest_result.parsed_json_path,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not facts_result.success:
        console.print("[red]Inspection failed during fact building.[/red]")
        for error in facts_result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    rules_result = apply_manifest_rules(
        ApplyManifestRulesInput(
            facts_json_path=facts_result.facts_path,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not rules_result.success:
        console.print("[red]Inspection failed during rule execution.[/red]")
        for error in rules_result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    table = Table(title="APK inspection", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")

    table.add_row("Path", str(apk_path))
    table.add_row("Package", str(manifest_result.package_name))
    table.add_row("Manifest JSON", str(manifest_result.parsed_json_path))
    table.add_row("Facts JSON", str(facts_result.facts_path))
    table.add_row("Facts count", str(len(facts_result.facts)))
    table.add_row("Findings JSON", str(rules_result.findings_path))
    table.add_row("Findings count", str(len(rules_result.findings)))

    console.print("[green]APK inspection completed.[/green]")
    console.print(table)


@manifest_app.command("extract")
def manifest_extract(
    apk_path: Path = typer.Argument(..., help="Path to the APK file."),
    case_id: str = typer.Option(..., "--case-id", help="Case identifier."),
    artifacts_dir: Path = typer.Option(
        Path("artifacts"),
        "--artifacts-dir",
        help="Base artifacts directory.",
    ),
) -> None:
    """
    Decode and parse AndroidManifest.xml using apktool.
    """
    tool = ExtractManifestTool()
    result = tool.run(
        ExtractManifestInput(
            apk_path=apk_path,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not result.success:
        console.print("[red]Manifest extraction failed.[/red]")
        for error in result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    table = Table(title="Manifest extraction result")
    table.add_column("Field", style="cyan")
    table.add_column("Value")

    table.add_row("Package", str(result.package_name))
    table.add_row("Decoded manifest", str(result.decoded_manifest_path))
    table.add_row("Parsed JSON", str(result.parsed_json_path))
    table.add_row("Decoded dir", str(result.decoded_dir))

    console.print("[green]Manifest extracted successfully.[/green]")
    console.print(table)


@facts_app.command("build-manifest")
def build_manifest_facts_cmd(
    manifest_json_path: Path = typer.Argument(..., help="Path to parsed manifest JSON."),
    case_id: str = typer.Option(..., "--case-id", help="Case identifier."),
    artifacts_dir: Path = typer.Option(
        Path("artifacts"),
        "--artifacts-dir",
        help="Base artifacts directory.",
    ),
) -> None:
    """
    Build normalized facts from a parsed manifest JSON file.
    """
    result = build_manifest_facts(
        BuildManifestFactsInput(
            manifest_json_path=manifest_json_path,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not result.success:
        console.print("[red]Manifest facts build failed.[/red]")
        for error in result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    table = Table(title="Manifest facts result", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")

    table.add_row("Facts file", str(result.facts_path))
    table.add_row("Total facts", str(len(result.facts)))

    console.print("[green]Manifest facts built successfully.[/green]")
    console.print(table)


@rules_app.command("manifest")
def apply_manifest_rules_cmd(
    facts_json_path: Path = typer.Argument(..., help="Path to manifest facts JSON."),
    case_id: str = typer.Option(..., "--case-id", help="Case identifier."),
    artifacts_dir: Path = typer.Option(
        Path("artifacts"),
        "--artifacts-dir",
        help="Base artifacts directory.",
    ),
) -> None:
    """
    Apply deterministic manifest rules over manifest facts.
    """
    result = apply_manifest_rules(
        ApplyManifestRulesInput(
            facts_json_path=facts_json_path,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not result.success:
        console.print("[red]Manifest rules execution failed.[/red]")
        for error in result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    table = Table(title="Manifest rules result", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")

    table.add_row("Findings file", str(result.findings_path))
    table.add_row("Total findings", str(len(result.findings)))

    console.print("[green]Manifest rules applied successfully.[/green]")
    console.print(table)


code_app = typer.Typer(help="Code analysis commands")
app.add_typer(code_app, name="code")


@code_app.command("jadx")
def code_jadx(
    apk_path: Path = typer.Argument(..., help="Path to the APK file."),
    case_id: str = typer.Option(..., "--case-id", help="Case identifier."),
    artifacts_dir: Path = typer.Option(Path("artifacts"), "--artifacts-dir"),
) -> None:
    tool = JadxDecompileTool()
    result = tool.run(
        JadxDecompileInput(
            apk_path=apk_path,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not result.success:
        console.print("[red]JADX decompilation failed.[/red]")
        for error in result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    table = Table(title="JADX result", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")
    table.add_row("Output dir", str(result.output_dir))
    table.add_row("Java dir", str(result.java_dir))
    table.add_row("Resources dir", str(result.resources_dir))
    console.print("[green]JADX completed successfully.[/green]")
    console.print(table)


@code_app.command("search")
def code_search_cmd(
    source_dir: Path = typer.Argument(..., help="Path to JADX sources dir."),
    case_id: str = typer.Option(..., "--case-id", help="Case identifier."),
    artifacts_dir: Path = typer.Option(Path("artifacts"), "--artifacts-dir"),
) -> None:
    tool = CodeSearchTool()
    result = tool.run(
        CodeSearchInput(
            source_dir=source_dir,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not result.success:
        console.print("[red]Code search failed.[/red]")
        for error in result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    table = Table(title="Code search result", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")
    table.add_row("Results path", str(result.results_path))
    table.add_row("Matches", str(len(result.matches)))
    console.print("[green]Code search completed successfully.[/green]")
    console.print(table)


@facts_app.command("build-code-search")
def build_code_search_facts_cmd(
    code_search_results_path: Path = typer.Argument(..., help="Path to code search results JSON."),
    case_id: str = typer.Option(..., "--case-id", help="Case identifier."),
    artifacts_dir: Path = typer.Option(Path("artifacts"), "--artifacts-dir"),
) -> None:
    result = build_code_search_facts(
        BuildCodeSearchFactsInput(
            code_search_results_path=code_search_results_path,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not result.success:
        console.print("[red]Code search facts build failed.[/red]")
        for error in result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    table = Table(title="Code search facts result", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")
    table.add_row("Facts file", str(result.facts_path))
    table.add_row("Total facts", str(len(result.facts)))
    console.print("[green]Code search facts built successfully.[/green]")
    console.print(table)


@rules_app.command("code")
def apply_code_rules_cmd(
    facts_json_path: Path = typer.Argument(..., help="Path to code facts JSON."),
    case_id: str = typer.Option(..., "--case-id", help="Case identifier."),
    artifacts_dir: Path = typer.Option(Path("artifacts"), "--artifacts-dir"),
) -> None:
    result = apply_code_rules(
        ApplyCodeRulesInput(
            facts_json_path=facts_json_path,
            case_id=case_id,
            artifacts_dir=artifacts_dir,
        )
    )

    if not result.success:
        console.print("[red]Code rules execution failed.[/red]")
        for error in result.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    table = Table(title="Code rules result", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")
    table.add_row("Findings file", str(result.findings_path))
    table.add_row("Total findings", str(len(result.findings)))
    console.print("[green]Code rules applied successfully.[/green]")
    console.print(table)


@app.command("run")
def run_analysis(
    apk_path: Path = typer.Argument(..., help="Path to the APK file."),
    case_id: str = typer.Option(..., "--case-id", help="Case identifier."),
    artifacts_dir: Path = typer.Option(
        Path("artifacts"),
        "--artifacts-dir",
        help="Base artifacts directory.",
    ),
    profile: AnalysisProfile = typer.Option(
        AnalysisProfile.FULL,
        "--profile",
        "--analysis-profile",
        help="Analysis profile: no-llm, fast, full, or llm.",
    ),
    agentic_mode: AgenticMode | None = typer.Option(
        None,
        "--agentic-mode",
        help="Static investigation mode: none, single, planner-executor, or multi-phase.",
    ),
    agentic_budget: AgenticBudgetPreset = typer.Option(
        AgenticBudgetPreset.BALANCED,
        "--agentic-budget",
        help="Static investigation budget: conservative, balanced, or deep.",
    ),
    llm_provider: str | None = typer.Option(
        None,
        "--llm-provider",
        help="LLM provider override: openai, deepseek, kimi, openrouter, or ollama.",
    ),
    llm_model: str | None = typer.Option(
        None, "--llm-model", help="LLM model identifier override."
    ),
) -> None:
    """
    Run full static analysis pipeline.
    """
    pipeline = StaticAnalysisPipeline(
        artifacts_dir=artifacts_dir,
        profile=profile,
        agentic_mode=agentic_mode,
        agentic_budget=agentic_budget,
        llm_provider=llm_provider,
        llm_model=llm_model,
    )

    state = pipeline.run(apk_path=apk_path, case_id=case_id)

    if state.status != "completed":
        console.print("[red]Pipeline failed.[/red]")
        for err in state.errors:
            console.print(f"[red]- {err}[/red]")
        raise typer.Exit(code=1)

    table = Table(title="Pipeline result", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")

    table.add_row("Case ID", state.case_id)
    table.add_row("Status", state.status)
    table.add_row("Profile", state.analysis_profile)
    table.add_row("Manifest JSON", str(state.manifest_json_path))
    table.add_row("Facts JSON", str(state.facts_path))
    table.add_row("Findings JSON", str(state.findings_path))
    table.add_row("Analysis", f"artifacts/{state.case_id}/analysis/analysis.json")
    table.add_row("Analysis JSON", str(state.analysis_path))
    table.add_row("Analysis raw", str(state.analysis_raw_path))
    table.add_row("JADX dir", str(state.jadx_output_dir))
    table.add_row("Code search", str(state.code_search_results_path))
    table.add_row("Static bundle", str(state.static_analysis_bundle_path))
    table.add_row("Static bundle", str(state.static_analysis_bundle_path))
    table.add_row("Reasoning JSON", str(state.analysis_path))
    table.add_row("Reasoning raw", str(state.analysis_raw_path))
    table.add_row("Markdown report", str(state.static_report_path))
    table.add_row("Manifest reasoning", str(state.manifest_reasoning_path))
    table.add_row("Code reasoning", str(state.code_reasoning_path))
    table.add_row("Fused reasoning", str(state.analysis_path))
    table.add_row("Markdown report", str(state.static_report_path))

    console.print("[green]Pipeline completed successfully.[/green]")
    console.print(table)


@dynamic_app.command("run")
def dynamic_run(
    case_id: str = typer.Option(..., "--case-id", help="Existing case identifier."),
    apk_path: Path = typer.Argument(..., help="Path to the APK file."),
    package_name: str | None = typer.Option(
        None,
        "--package",
        help="Optional package name override.",
    ),
    avd_name: str = typer.Option("Pixel_6_API_34", "--avd", help="AVD name to boot."),
    artifacts_dir: Path = typer.Option(Path("artifacts"), "--artifacts-dir"),
    show_avd: bool = typer.Option(
        False,
        "--show-avd",
        help="Show the Android Emulator window instead of running headless.",
    ),
    agentic_decisions: bool = typer.Option(
        False,
        "--agentic-decisions",
        help="Allow the dynamic decision agent to propose follow-up tasks.",
    ),
    agentic_mode: AgenticMode = typer.Option(
        AgenticMode.NONE,
        "--agentic-mode",
        help="Dynamic agentic mode: none or single (experimental).",
    ),
    llm_provider: str | None = typer.Option(
        None,
        "--llm-provider",
        help=(
            "LLM provider to use for agentic dynamic decisions: "
            "openai, deepseek, kimi, openrouter, or ollama."
        ),
    ),
    llm_model: str | None = typer.Option(
        None,
        "--llm-model",
        help="Model id to use for agentic dynamic decisions.",
    ),
    api_discovery: str = typer.Option(
        "off", "--api-discovery", help="API discovery mode: off, static, dynamic, or auto."
    ),
    api_probe: str = typer.Option(
        "off", "--api-probe", help="API probing mode: off or safe."
    ),
    api_base_url: str | None = typer.Option(
        None, "--api-base-url", help="Manual API base URL candidate."
    ),
    api_max_hosts: int = typer.Option(5, "--api-max-hosts", min=1),
    api_max_requests: int = typer.Option(30, "--api-max-requests", min=1),
    api_timeout: float = typer.Option(5.0, "--api-timeout", min=0.1),
    api_allow_host: list[str] | None = typer.Option(
        None, "--api-allow-host", help="Allowed API host; repeat for multiple hosts."
    ),
    api_allow_private: bool = typer.Option(
        False, "--api-allow-private", help="Allow private, local, and emulator-only hosts."
    ),
    dynamic_timeout: int = typer.Option(
        180,
        "--dynamic-timeout",
        min=1,
        help="Maximum emulator boot wait in seconds; does not bound total dynamic analysis duration.",
    ),
) -> None:
    if agentic_mode not in {AgenticMode.NONE, AgenticMode.SINGLE}:
        raise typer.BadParameter(
            "Dynamic execution currently supports only agentic modes 'none' and 'single'.",
            param_hint="--agentic-mode",
        )
    dynamic_agentic = agentic_decisions or agentic_mode is AgenticMode.SINGLE
    if api_discovery not in {"off", "static", "dynamic", "auto"}:
        raise typer.BadParameter("Expected off, static, dynamic, or auto.", param_hint="--api-discovery")
    if api_probe not in {"off", "safe"}:
        raise typer.BadParameter("Expected off or safe.", param_hint="--api-probe")

    try:
        validated_apk = validate_apk(apk_path)
    except APKValidationError as exc:
        console.print(f"[red]Validation error:[/red] {exc}")
        raise typer.Exit(code=1)

    case_dir = artifacts_dir / case_id
    case_state_path = case_dir / "case_state.json"

    if case_state_path.exists():
        state = CaseState.load(case_id, base_dir=artifacts_dir)
        state.apk_path = validated_apk
        if package_name:
            state.package_name = package_name
    else:
        state = CaseState(
            case_id=case_id,
            apk_path=validated_apk,
            package_name=package_name,
        )

    state.save(artifacts_dir)

    try:
        pipeline = DynamicAnalysisPipeline(
            artifacts_dir=artifacts_dir,
            llm_provider=llm_provider,
            llm_model=llm_model,
            api_discovery=api_discovery,
            api_probe=api_probe,
            api_base_url=api_base_url,
            api_max_hosts=api_max_hosts,
            api_max_requests=api_max_requests,
            api_timeout=api_timeout,
            api_allow_hosts=tuple(api_allow_host or ()),
            api_allow_private=api_allow_private,
        )
        state = pipeline.run(
            case_id=case_id,
            apk_path=validated_apk,
            avd_name=avd_name,
            package_override=package_name,
            show_avd=show_avd,
            agentic_decisions=dynamic_agentic,
            llm_provider=llm_provider,
            llm_model=llm_model,
            dynamic_timeout=dynamic_timeout,
        )
    except FileNotFoundError as exc:
        console.print(f"[red]Environment error:[/red] {exc}")
        raise typer.Exit(code=1)
    except Exception as exc:
        console.print(f"[red]Dynamic execution error:[/red] {exc}")
        raise typer.Exit(code=1)

    if state.status not in {"dynamic_completed", "dynamic_partial"}:
        console.print("[red]Dynamic analysis failed.[/red]")
        for error in state.errors:
            console.print(f"[red]- {error}[/red]")
        raise typer.Exit(code=1)

    if dynamic_agentic:
        console.print("[yellow]Dynamic agentic decisions are experimental.[/yellow]")
    if state.status == "dynamic_partial":
        console.print("[yellow]Dynamic analysis completed with partial results.[/yellow]")
    else:
        console.print("[green]Dynamic analysis completed.[/green]")
    console.print(f"Resolved package: {state.package_name}")
    console.print(f"Plan: {state.dynamic_plan_path}")
    console.print(f"Results: {state.dynamic_results_path}")


@dynamic_app.command("setup")
def dynamic_setup(
    sdk_root: str | None = typer.Option(
        None,
        "--sdk-root",
        help="Android SDK root. If omitted, uses ANDROID_HOME / ANDROID_SDK_ROOT / common paths.",
    ),
    avd_name: str = typer.Option(
        "Pixel_6_API_34",
        "--avd",
        help="Name of the AVD to create or reuse.",
    ),
    api_level: int = typer.Option(
        34,
        "--api-level",
        help="Android API level for the system image.",
    ),
    system_image: str | None = typer.Option(
        None,
        "--system-image",
        help='Optional full SDK package path, e.g. "system-images;android-34;google_apis;x86_64".',
    ),
    device: str = typer.Option(
        "pixel_6",
        "--device",
        help='AVD device id used by avdmanager, for example "pixel_6".',
    ),
    auto_install: bool = typer.Option(
        False,
        "--auto-install",
        help="Install required SDK packages if missing.",
    ),
    accept_licenses: bool = typer.Option(
        False,
        "--accept-licenses",
        help="Run sdkmanager --licenses before installing.",
    ),
    force_recreate: bool = typer.Option(
        False,
        "--force-recreate",
        help="Recreate the AVD even if it already exists.",
    ),
) -> None:
    """
    Prepare Android dynamic analysis environment: verify SDK, install packages, and create an AVD.
    """
    result = run_dynamic_setup(
        sdk_root=sdk_root,
        avd_name=avd_name,
        api_level=api_level,
        system_image=system_image,
        device=device,
        auto_install=auto_install,
        accept_licenses=accept_licenses,
        force_recreate=force_recreate,
    )

    table = Table(title="Dynamic setup", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")

    table.add_row("Success", str(result.success))
    table.add_row("SDK root", str(result.sdk_root))
    table.add_row("AVD", str(result.avd_name))
    table.add_row("System image", str(result.system_image))

    if result.details:
        table.add_row("sdkmanager", result.details.get("sdkmanager", "-"))
        table.add_row("avdmanager", result.details.get("avdmanager", "-"))
        table.add_row("adb", result.details.get("adb", "-"))
        table.add_row("emulator", result.details.get("emulator", "-"))

    if result.installed_packages:
        table.add_row("Installed packages", "\n".join(result.installed_packages))

    if result.warnings:
        table.add_row("Warnings", "\n".join(result.warnings))

    if result.errors:
        table.add_row("Errors", "\n".join(result.errors))

    console.print(table)

    if not result.success:
        raise typer.Exit(code=1)

    console.print("[green]Dynamic environment is ready.[/green]")


@app.command("web")
def web(
    host: str = typer.Option("127.0.0.1", "--host", help="Bind host."),
    port: int = typer.Option(8000, "--port", help="Bind port."),
    reload: bool = typer.Option(False, "--reload", help="Enable development reload."),
) -> None:
    """Start the web dashboard."""

    uvicorn.run(
        "andro_agent.web.app:app",
        host=host,
        port=port,
        reload=reload,
    )


@app.callback()
def main(
    v: int = typer.Option(
        0,
        "-v",
        count=True,
        help="Increase verbosity (-v, -vv)",
    ),
):
    setup_logging(v)


if __name__ == "__main__":
    app()
