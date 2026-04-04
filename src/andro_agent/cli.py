from __future__ import annotations

import json
from pathlib import Path

import typer
from rich.console import Console
from rich.table import Table

from andro_agent.models import ExtractManifestInput
from andro_agent.tools.extract_manifest import ExtractManifestTool
from andro_agent.validators import APKValidationError, validate_apk

from rich import box
from andro_agent.facts.manifest_facts import build_manifest_facts
from andro_agent.models import BuildManifestFactsInput, ExtractManifestInput

app = typer.Typer(
    help="Andro-Agent CLI",
    no_args_is_help=True,
    rich_markup_mode="rich",
)

manifest_app = typer.Typer(help="Manifest-related commands")
app.add_typer(manifest_app, name="manifest")

facts_app = typer.Typer(help="Facts-related commands")
app.add_typer(facts_app, name="facts")

console = Console()


@app.command("init-dirs")
def init_dirs(
    base_dir: Path = typer.Option(
        Path("."),
        "--base-dir",
        help="Base directory where project folders will be created.",
    )
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
def validate(
    apk_path: Path = typer.Argument(..., help="Path to the APK file.")
) -> None:
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
    and builds normalized manifest facts.
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

    table = Table(title="APK inspection", box=box.SIMPLE)
    table.add_column("Field", style="cyan")
    table.add_column("Value")

    table.add_row("Path", str(apk_path))
    table.add_row("Package", str(manifest_result.package_name))
    table.add_row("Manifest JSON", str(manifest_result.parsed_json_path))
    table.add_row("Facts JSON", str(facts_result.facts_path))
    table.add_row("Facts count", str(len(facts_result.facts)))

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

def main() -> None:
    app()


if __name__ == "__main__":
    main()