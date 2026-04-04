from __future__ import annotations

import json
import shutil
from pathlib import Path

from andro_agent.models import ExtractManifestInput, ExtractManifestOutput
from andro_agent.parsers.manifest_parser import parse_manifest
from andro_agent.tools.base import BaseTool
from andro_agent.utils.subprocess_utils import run_command
from andro_agent.validators import APKValidationError, validate_apk


class ExtractManifestTool(BaseTool):
    name = "extract_manifest"
    description = "Decode and parse AndroidManifest.xml from an APK using apktool"

    def run(self, input_data: ExtractManifestInput) -> ExtractManifestOutput:
        errors: list[str] = []
        warnings: list[str] = []

        try:
            apk_path = validate_apk(input_data.apk_path)
        except APKValidationError as exc:
            return ExtractManifestOutput(success=False, errors=[str(exc)])

        if shutil.which("apktool") is None:
            return ExtractManifestOutput(
                success=False,
                errors=["apktool is not installed or not available in PATH"],
            )

        case_dir = input_data.artifacts_dir / input_data.case_id
        raw_dir = case_dir / "raw"
        parsed_dir = case_dir / "parsed"
        logs_dir = case_dir / "logs"
        decoded_dir = case_dir / "apktool_decoded"

        for directory in (raw_dir, parsed_dir, logs_dir, decoded_dir):
            directory.mkdir(parents=True, exist_ok=True)

        cmd = [
            "apktool",
            "d",
            str(apk_path),
            "-o",
            str(decoded_dir),
            "-f",
        ]

        returncode, stdout, stderr = run_command(cmd, timeout=180)

        log_path = logs_dir / "extract_manifest.log"
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

        if returncode != 0:
            return ExtractManifestOutput(
                success=False,
                decoded_dir=decoded_dir,
                errors=[f"apktool failed with exit code {returncode}"],
                warnings=warnings,
            )

        decoded_manifest_path = decoded_dir / "AndroidManifest.xml"

        if not decoded_manifest_path.exists():
            return ExtractManifestOutput(
                success=False,
                decoded_dir=decoded_dir,
                errors=["Decoded AndroidManifest.xml not found after apktool execution"],
            )

        raw_manifest_copy = raw_dir / "AndroidManifest.xml"
        raw_manifest_copy.write_text(decoded_manifest_path.read_text(encoding="utf-8"), encoding="utf-8")

        try:
            manifest_data = parse_manifest(str(decoded_manifest_path))
        except Exception as exc:
            return ExtractManifestOutput(
                success=False,
                decoded_manifest_path=raw_manifest_copy,
                decoded_dir=decoded_dir,
                errors=[f"Failed to parse decoded AndroidManifest.xml: {exc}"],
            )

        parsed_json_path = parsed_dir / "manifest.json"
        parsed_json_path.write_text(
            json.dumps(manifest_data.model_dump(), indent=2, ensure_ascii=False),
            encoding="utf-8",
        )

        return ExtractManifestOutput(
            success=True,
            package_name=manifest_data.package_name,
            decoded_manifest_path=raw_manifest_copy,
            parsed_json_path=parsed_json_path,
            decoded_dir=decoded_dir,
            data=manifest_data.model_dump(),
            warnings=warnings,
            errors=errors,
        )