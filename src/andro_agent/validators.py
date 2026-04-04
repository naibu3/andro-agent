from __future__ import annotations

from pathlib import Path
from zipfile import BadZipFile, ZipFile


class APKValidationError(Exception):
    """Raised when an APK does not pass validation."""


def validate_apk(apk_path: str | Path) -> Path:
    """
    Validate that the given path points to a readable APK file.

    Checks:
    - file exists
    - is a file
    - has .apk extension
    - is a valid ZIP
    - contains AndroidManifest.xml
    """
    path = Path(apk_path).expanduser().resolve()

    if not path.exists():
        raise APKValidationError(f"APK not found: {path}")

    if not path.is_file():
        raise APKValidationError(f"Path is not a file: {path}")

    if path.suffix.lower() != ".apk":
        raise APKValidationError(f"File does not have .apk extension: {path.name}")

    try:
        with ZipFile(path, "r") as apk_zip:
            names = apk_zip.namelist()
    except BadZipFile as exc:
        raise APKValidationError(f"Invalid APK/ZIP file: {path}") from exc
    except Exception as exc:
        raise APKValidationError(f"Could not read APK: {path}") from exc

    if "AndroidManifest.xml" not in names:
        raise APKValidationError(
            "AndroidManifest.xml not found inside APK. File may be malformed."
        )

    return path