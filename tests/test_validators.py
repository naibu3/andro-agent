from __future__ import annotations

from pathlib import Path
from zipfile import ZipFile

import pytest

from andro_agent.validators import APKValidationError, validate_apk


def create_fake_apk(path: Path, with_manifest: bool = True) -> None:
    with ZipFile(path, "w") as apk_zip:
        if with_manifest:
            apk_zip.writestr("AndroidManifest.xml", "dummy manifest")
        apk_zip.writestr("classes.dex", "dummy dex")


def test_validate_apk_ok(tmp_path: Path) -> None:
    apk_path = tmp_path / "sample.apk"
    create_fake_apk(apk_path)

    result = validate_apk(apk_path)

    assert result == apk_path.resolve()


def test_validate_apk_missing_file(tmp_path: Path) -> None:
    missing_path = tmp_path / "missing.apk"

    with pytest.raises(APKValidationError, match="APK not found"):
        validate_apk(missing_path)


def test_validate_apk_wrong_extension(tmp_path: Path) -> None:
    bad_file = tmp_path / "sample.txt"
    bad_file.write_text("not an apk")

    with pytest.raises(APKValidationError, match="does not have .apk extension"):
        validate_apk(bad_file)


def test_validate_apk_missing_manifest(tmp_path: Path) -> None:
    apk_path = tmp_path / "sample.apk"
    create_fake_apk(apk_path, with_manifest=False)

    with pytest.raises(APKValidationError, match="AndroidManifest.xml not found"):
        validate_apk(apk_path)