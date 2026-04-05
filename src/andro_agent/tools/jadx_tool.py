from __future__ import annotations

import shutil
from pathlib import Path

from andro_agent.models import JadxDecompileInput, JadxDecompileOutput
from andro_agent.tools.base import BaseTool
from andro_agent.utils.subprocess_utils import run_command
from andro_agent.validators import APKValidationError, validate_apk


class JadxDecompileTool(BaseTool):
    name = "jadx_decompile"
    description = "Decompile APK into Java sources and resources using JADX"

    def run(self, input_data: JadxDecompileInput) -> JadxDecompileOutput:
        try:
            apk_path = validate_apk(input_data.apk_path)
        except APKValidationError as exc:
            return JadxDecompileOutput(success=False, errors=[str(exc)])

        if shutil.which("jadx") is None:
            return JadxDecompileOutput(
                success=False,
                errors=["jadx is not installed or not available in PATH"],
            )

        case_dir = input_data.artifacts_dir / input_data.case_id
        jadx_dir = case_dir / "jadx"
        logs_dir = case_dir / "logs"

        jadx_dir.mkdir(parents=True, exist_ok=True)
        logs_dir.mkdir(parents=True, exist_ok=True)

        cmd = [
            "jadx",
            "-d",
            str(jadx_dir),
            "--show-bad-code",
            str(apk_path),
        ]

        returncode, stdout, stderr = run_command(cmd, timeout=600)

        log_path = logs_dir / "jadx_decompile.log"
        log_path.write_text(
            "\n".join(
                [
                    f"COMMAND: {' '.join(cmd)}",
                    f"RETURN_CODE: {returncode}",
                    "",
                    "STDOUT:",
                    stdout,
                    "",
                    "STDERR:",
                    stderr,
                ]
            ),
            encoding="utf-8",
        )

        java_dir = jadx_dir / "sources"
        resources_dir = jadx_dir / "resources"

        has_sources = java_dir.exists() and any(java_dir.rglob("*"))

        if returncode != 0:
            if has_sources:
                return JadxDecompileOutput(
                    success=True,
                    output_dir=jadx_dir,
                    java_dir=java_dir,
                    resources_dir=resources_dir if resources_dir.exists() else None,
                    warnings=[
                        f"jadx finished with non-zero exit code {returncode}",
                        "jadx reported decompilation errors but produced partial output",
                        f"See full log: {log_path}",
                    ],
                )

            stderr_summary = stderr.strip()[:1500] if stderr else "No stderr output"
            return JadxDecompileOutput(
                success=False,
                output_dir=jadx_dir,
                errors=[
                    f"jadx failed with exit code {returncode}",
                    stderr_summary,
                    f"See full log: {log_path}",
                ],
            )

        return JadxDecompileOutput(
            success=True,
            output_dir=jadx_dir,
            java_dir=java_dir if java_dir.exists() else None,
            resources_dir=resources_dir if resources_dir.exists() else None,
        )