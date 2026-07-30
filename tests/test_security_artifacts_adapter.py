from __future__ import annotations

import json

import pytest

from andro_agent.domain.adapters.security_artifacts import (
    artifact_id_for,
    canonicalize_artifact,
    infer_artifact_kind,
    infer_mime_type,
    is_downloadable_artifact,
    is_previewable_artifact,
    scan_case_artifacts,
)
from andro_agent.domain.models.security import ArtifactKind
from andro_agent.web.services.result_service import write_artifacts_json_if_possible


def test_artifact_id_generation_is_stable():
    first = artifact_id_for("case-1", "reports/report.md", "report")
    second = artifact_id_for("case-1", "reports/report.md", "report")

    assert first == second
    assert first.startswith("ART-")
    assert len(first) == 16


@pytest.mark.parametrize(
    ("path", "expected"),
    [
        ("AndroidManifest.xml", ArtifactKind.MANIFEST),
        ("jadx/resources/value.json", ArtifactKind.JADX_OUTPUT),
        ("apktool/res/layout.xml", ArtifactKind.APKTOOL_OUTPUT),
        ("src/MainActivity.java", ArtifactKind.SOURCE_FILE),
        ("logs/run.log", ArtifactKind.LOG),
        ("reports/report.md", ArtifactKind.REPORT),
        ("facts/manifest.json", ArtifactKind.JSON),
        ("downloads/results.zip", ArtifactKind.ZIP),
        ("unknown.bin", ArtifactKind.OTHER),
    ],
)
def test_infer_artifact_kind(path, expected):
    assert infer_artifact_kind(path) == expected


@pytest.mark.parametrize(
    ("path", "expected"),
    [
        ("report.md", "text/markdown"),
        ("classes.smali", "text/plain"),
        ("Main.kt", "text/plain"),
        ("Main.java", "text/x-java-source"),
        ("facts.json", "application/json"),
        ("AndroidManifest.xml", "application/xml"),
    ],
)
def test_infer_mime_type(path, expected):
    assert infer_mime_type(path) == expected


def test_previewable_and_downloadable_decisions():
    assert is_previewable_artifact("reports/report.html")
    assert is_downloadable_artifact("reports/report.html")
    assert not is_previewable_artifact("archive.zip")
    assert is_downloadable_artifact("archive.zip")
    assert not is_downloadable_artifact("bundle.zip")
    assert not is_downloadable_artifact("uploaded.apk")
    assert not is_downloadable_artifact("cache/facts.json")


def test_scan_case_artifacts_includes_safe_files_and_skips_unwanted_files(tmp_path):
    case_dir = tmp_path / "case-1"
    safe_paths = [
        case_dir / "AndroidManifest.xml",
        case_dir / "reports" / "report.md",
        case_dir / "jadx" / "sources" / "MainActivity.java",
        case_dir / "logs" / "run.log",
    ]
    for path in safe_paths:
        path.parent.mkdir(parents=True, exist_ok=True)
        path.write_text("content", encoding="utf-8")

    skipped_paths = [
        case_dir / "uploaded.apk",
        case_dir / "downloads" / "bundle.zip",
        case_dir / "cache" / "cached.json",
        case_dir / "tmp" / "temporary.txt",
        case_dir / ".cache" / "hidden.json",
    ]
    for path in skipped_paths:
        path.parent.mkdir(parents=True, exist_ok=True)
        path.write_text("skip", encoding="utf-8")

    artifacts = scan_case_artifacts(case_dir, case_id="case-1")
    paths = {artifact.path for artifact in artifacts}

    assert paths == {
        "AndroidManifest.xml",
        "jadx/sources/MainActivity.java",
        "logs/run.log",
        "reports/report.md",
    }


def test_scan_case_artifacts_skips_symlinks_and_outside_targets(tmp_path):
    case_dir = tmp_path / "case-1"
    case_dir.mkdir()
    outside = tmp_path / "outside.json"
    outside.write_text("{}", encoding="utf-8")
    link = case_dir / "outside.json"

    try:
        link.symlink_to(outside)
    except OSError:
        pytest.skip("Symlinks are unavailable")

    assert scan_case_artifacts(case_dir, case_id="case-1") == []


def test_canonicalize_artifact_rejects_path_outside_case_dir(tmp_path):
    case_dir = tmp_path / "case-1"
    case_dir.mkdir()
    outside = tmp_path / "outside.json"
    outside.write_text("{}", encoding="utf-8")

    with pytest.raises(ValueError, match="outside"):
        canonicalize_artifact(outside, case_id="case-1", case_dir=case_dir)


def test_canonicalize_artifact_includes_size_and_sha256(tmp_path):
    case_dir = tmp_path / "case-1"
    artifact_path = case_dir / "facts.json"
    artifact_path.parent.mkdir()
    artifact_path.write_bytes(b'{"safe": true}')

    artifact = canonicalize_artifact(
        artifact_path,
        case_id="case-1",
        case_dir=case_dir,
    )

    assert artifact.size_bytes == len(b'{"safe": true}')
    assert artifact.sha256 == (
        "b30c057f215a42613a7e415e0936663ec83e882126f16e08775d7dc2ccbacba9"
    )


def test_write_artifacts_json_if_possible_writes_valid_json(tmp_path):
    case_dir = tmp_path / "case-1"
    report_path = case_dir / "reports" / "report.md"
    report_path.parent.mkdir(parents=True)
    report_path.write_text("# Report", encoding="utf-8")

    path = write_artifacts_json_if_possible(case_dir=case_dir, case_id="case-1")

    assert path == case_dir / "artifacts" / "artifacts.json"
    registry = json.loads(path.read_text(encoding="utf-8"))
    assert [artifact["path"] for artifact in registry] == ["reports/report.md"]
    assert registry[0]["artifact_id"].startswith("ART-")

    write_artifacts_json_if_possible(case_dir=case_dir, case_id="case-1")
    registry = json.loads(path.read_text(encoding="utf-8"))
    assert "artifacts/artifacts.json" not in {
        artifact["path"] for artifact in registry
    }


def test_write_artifacts_json_if_possible_rejects_invalid_case_dir(tmp_path):
    assert (
        write_artifacts_json_if_possible(
            case_dir=tmp_path / "missing",
            case_id="case-1",
        )
        is None
    )
