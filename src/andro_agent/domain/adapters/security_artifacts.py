from __future__ import annotations

import hashlib
import json
import mimetypes
from pathlib import Path

from andro_agent.domain.models.security import Artifact, ArtifactKind

INCLUDED_SUFFIXES = {
    ".json",
    ".txt",
    ".md",
    ".html",
    ".xml",
    ".log",
    ".java",
    ".kt",
    ".smali",
}
EXCLUDED_DIRS = {
    "__pycache__",
    ".pytest_cache",
    ".venv",
    "venv",
    "env",
    "cache",
    ".cache",
    "tmp",
    "temp",
    "temporary",
    ".tmp",
    ".temp",
    ".bak",
}
EXCLUDED_NAMES = {"bundle.zip"}
EXCLUDED_ENDINGS = (".tmp", ".temp", ".bak")


def artifact_id_for(
    case_id: str,
    relative_path: str,
    kind: str | None = None,
) -> str:
    payload = {
        "case_id": case_id,
        "relative_path": Path(relative_path).as_posix(),
        "kind": kind or "",
    }
    digest = hashlib.sha256(
        json.dumps(payload, sort_keys=True, ensure_ascii=False).encode("utf-8")
    ).hexdigest()
    return f"ART-{digest[:12].upper()}"


def infer_artifact_kind(path: Path | str) -> ArtifactKind:
    target = Path(path)
    lowered_path = target.as_posix().lower()
    suffix = target.suffix.lower()

    if target.name.lower() == "androidmanifest.xml":
        return ArtifactKind.MANIFEST
    if "jadx" in lowered_path:
        return ArtifactKind.JADX_OUTPUT
    if "apktool" in lowered_path:
        return ArtifactKind.APKTOOL_OUTPUT
    if suffix in {".java", ".kt", ".smali"}:
        return ArtifactKind.SOURCE_FILE
    if suffix in {".log", ".txt"}:
        return ArtifactKind.LOG
    if suffix in {".md", ".html"}:
        return ArtifactKind.REPORT
    if suffix == ".json":
        return ArtifactKind.JSON
    if suffix == ".zip":
        return ArtifactKind.ZIP
    return ArtifactKind.OTHER


def infer_mime_type(path: Path | str) -> str | None:
    suffix = Path(path).suffix.lower()
    fallbacks = {
        ".md": "text/markdown",
        ".smali": "text/plain",
        ".kt": "text/plain",
        ".java": "text/x-java-source",
        ".json": "application/json",
        ".xml": "application/xml",
    }
    if suffix in fallbacks:
        return fallbacks[suffix]
    return mimetypes.guess_type(str(path))[0]


def is_previewable_artifact(path: Path | str) -> bool:
    return Path(path).suffix.lower() in INCLUDED_SUFFIXES


def is_downloadable_artifact(path: Path | str) -> bool:
    target = Path(path)
    lowered_name = target.name.lower()
    lowered_parts = {part.lower() for part in target.parts}
    return (
        target.suffix.lower() in INCLUDED_SUFFIXES | {".zip"}
        and target.suffix.lower() != ".apk"
        and lowered_name not in EXCLUDED_NAMES
        and not lowered_name.endswith(EXCLUDED_ENDINGS)
        and not lowered_parts & EXCLUDED_DIRS
    )


def canonicalize_artifact(
    path: Path,
    *,
    case_id: str,
    case_dir: Path,
) -> Artifact:
    case_root = case_dir.resolve()
    resolved_path = path.resolve()

    try:
        relative_path = resolved_path.relative_to(case_root)
    except ValueError as exc:
        raise ValueError("Artifact path is outside the case directory") from exc

    if path.is_symlink() or not resolved_path.is_file():
        raise ValueError("Artifact path must be a regular file")

    kind = infer_artifact_kind(relative_path)
    digest = hashlib.sha256()
    with resolved_path.open("rb") as artifact_file:
        for chunk in iter(lambda: artifact_file.read(1024 * 1024), b""):
            digest.update(chunk)

    relative = relative_path.as_posix()
    return Artifact(
        artifact_id=artifact_id_for(case_id, relative, kind.value),
        case_id=case_id,
        kind=kind,
        name=resolved_path.name,
        path=relative,
        mime_type=infer_mime_type(resolved_path),
        size_bytes=resolved_path.stat().st_size,
        sha256=digest.hexdigest(),
        downloadable=is_downloadable_artifact(relative_path),
        previewable=is_previewable_artifact(relative_path),
        metadata={"relative_path": relative},
    )


def scan_case_artifacts(case_dir: Path, *, case_id: str) -> list[Artifact]:
    if not case_dir.is_dir() or case_dir.is_symlink():
        return []

    case_root = case_dir.resolve()
    artifacts: list[Artifact] = []

    for path in sorted(case_dir.rglob("*")):
        if path.is_symlink() or not path.is_file():
            continue

        try:
            relative = path.relative_to(case_dir)
            path.resolve().relative_to(case_root)
        except ValueError:
            continue

        if relative.as_posix() == "artifacts/artifacts.json":
            continue

        relative_parts = {part.lower() for part in relative.parts}
        lowered_name = path.name.lower()

        if relative_parts & EXCLUDED_DIRS:
            continue
        if path.suffix.lower() == ".apk" or lowered_name in EXCLUDED_NAMES:
            continue
        if lowered_name.endswith(EXCLUDED_ENDINGS):
            continue
        if path.suffix.lower() not in INCLUDED_SUFFIXES:
            continue

        try:
            artifacts.append(
                canonicalize_artifact(path, case_id=case_id, case_dir=case_dir)
            )
        except (OSError, ValueError):
            continue

    return artifacts


def artifact_to_web_dict(artifact: Artifact) -> dict:
    data = artifact.model_dump(mode="json")
    data["kind"] = artifact.kind.value
    return data


def artifacts_to_web_dicts(artifacts: list[Artifact]) -> list[dict]:
    return [artifact_to_web_dict(artifact) for artifact in artifacts]
