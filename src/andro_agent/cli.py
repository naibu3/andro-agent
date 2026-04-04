from __future__ import annotations

from pathlib import Path

import typer
from rich.console import Console
from rich.table import Table

from andro_agent.validators import APKValidationError, validate_apk

app = typer.Typer(
    help="Andro-Agent CLI",
    no_args_is_help=True,
    rich_markup_mode="rich",
)

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
    apk_path: Path = typer.Argument(..., help="Path to the APK file.")
) -> None:
    """
    Minimal inspection command for Phase 0.
    Currently only validates the APK and shows basic metadata.
    """
    try:
        validated_path = validate_apk(apk_path)
    except APKValidationError as exc:
        console.print(f"[red]Inspection error:[/red] {exc}")
        raise typer.Exit(code=1)

    stat = validated_path.stat()

    table = Table(title="APK inspection")
    table.add_column("Field", style="cyan")
    table.add_column("Value", style="white")

    table.add_row("Path", str(validated_path))
    table.add_row("Name", validated_path.name)
    table.add_row("Size (bytes)", str(stat.st_size))
    table.add_row("Suffix", validated_path.suffix)

    console.print("[green]APK inspection completed.[/green]")
    console.print(table)


def main() -> None:
    app()


if __name__ == "__main__":
    main()