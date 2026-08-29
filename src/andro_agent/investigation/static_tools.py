from __future__ import annotations

import json
from pathlib import Path
from typing import Any


class StaticInvestigationTools:
    """Bounded, read-only access to artifacts for one completed analysis case."""

    MAX_RESULTS = 200
    MAX_QUERY_LENGTH = 200
    MAX_SEARCH_RESULTS = 50
    MAX_CONTEXT_LINES = 100
    MAX_JSON_BYTES = 16 * 1024 * 1024
    MAX_SOURCE_BYTES = 2 * 1024 * 1024
    MAX_SEARCH_BYTES = 32 * 1024 * 1024
    MAX_SEARCH_FILES = 10_000
    MAX_TEXT_LENGTH = 2_000
    ALLOWED_SOURCE_EXTENSIONS = frozenset({".java", ".kt", ".smali", ".xml"})

    def __init__(self, case_dir: Path) -> None:
        self.case_dir = Path(case_dir)

    def get_findings(
        self,
        source: str | None = None,
        severity: str | None = None,
        category: str | None = None,
        limit: int = 50,
    ) -> dict[str, Any]:
        result = {
            "success": False,
            "error": None,
            "findings": [],
            "count": 0,
            "truncated": False,
        }
        bounded_limit, error = self._limit(limit, self.MAX_RESULTS)
        if error:
            result["error"] = error
            return result

        canonical, canonical_error = self._load_json_list("findings/canonical_findings.json")
        if canonical_error is None:
            findings = [self._finding_view(item) for item in canonical]
        else:
            findings = []
            found_legacy = False
            for legacy_source, relative_path in (
                ("manifest", "findings/manifest_findings.json"),
                ("code", "findings/code_findings.json"),
            ):
                items, load_error = self._load_json_list(relative_path)
                if load_error is not None:
                    continue
                found_legacy = True
                for item in items:
                    legacy = dict(item)
                    legacy["source"] = legacy_source
                    findings.append(self._finding_view(legacy))
            if not found_legacy:
                result["error"] = (
                    "No canonical or legacy finding files were found in the case directory."
                )
                return result

        filtered = [
            finding
            for finding in findings
            if self._matches(finding.get("source"), source)
            and self._matches(finding.get("severity"), severity)
            and self._matches(finding.get("category"), category)
        ]
        selected = filtered[:bounded_limit]
        result.update(
            success=True,
            findings=selected,
            count=len(selected),
            truncated=len(filtered) > bounded_limit,
        )
        return result

    def get_evidence(
        self,
        evidence_ids: list[str] | None = None,
        limit: int = 50,
    ) -> dict[str, Any]:
        result = {
            "success": False,
            "error": None,
            "evidence": [],
            "count": 0,
            "missing_evidence_ids": [],
            "truncated": False,
        }
        bounded_limit, error = self._limit(limit, self.MAX_RESULTS)
        if error:
            result["error"] = error
            return result

        evidence, load_error = self._load_json_list("evidence/evidence.json")
        if load_error:
            result["error"] = load_error
            return result

        requested = None
        if evidence_ids is not None:
            requested = []
            for evidence_id in evidence_ids[: self.MAX_RESULTS]:
                value = str(evidence_id)
                if value not in requested:
                    requested.append(value)
            lookup = {
                str(item.get("evidence_id")): item for item in evidence if item.get("evidence_id")
            }
            selected_raw = [
                lookup[evidence_id] for evidence_id in requested if evidence_id in lookup
            ]
            missing = [evidence_id for evidence_id in requested if evidence_id not in lookup]
        else:
            selected_raw = evidence
            missing = []

        selected = [self._evidence_view(item) for item in selected_raw[:bounded_limit]]
        result.update(
            success=True,
            evidence=selected,
            count=len(selected),
            missing_evidence_ids=missing,
            truncated=(
                len(selected_raw) > bounded_limit
                or (evidence_ids is not None and len(evidence_ids) > self.MAX_RESULTS)
            ),
        )
        return result

    def search_code(
        self,
        query: str,
        top_k: int = 20,
        file_extensions: list[str] | None = None,
    ) -> dict[str, Any]:
        result = {
            "success": False,
            "error": None,
            "matches": [],
            "count": 0,
            "scanned_files": 0,
            "truncated": False,
        }
        query = str(query).strip()
        if not query:
            result["error"] = "query must not be empty."
            return result
        if len(query) > self.MAX_QUERY_LENGTH:
            result["error"] = f"query exceeds the {self.MAX_QUERY_LENGTH} character limit."
            return result
        bounded_top_k, error = self._limit(top_k, self.MAX_SEARCH_RESULTS)
        if error:
            result["error"] = error
            return result

        extensions, extension_error = self._extensions(file_extensions)
        if extension_error:
            result["error"] = extension_error
            return result

        source_root, resolve_error = self._resolve("jadx/sources", require_file=False)
        if resolve_error or source_root is None or not source_root.is_dir():
            result["error"] = "JADX source directory was not found for this case."
            return result

        lowered_query = query.casefold()
        matches: list[dict[str, Any]] = []
        scanned_bytes = 0
        scanned_files = 0
        budget_truncated = False
        extension_priority = {".java": 0, ".kt": 1, ".smali": 2, ".xml": 3}
        candidates = sorted(
            source_root.rglob("*"),
            key=lambda path: (extension_priority.get(path.suffix.lower(), 9), path.as_posix()),
        )
        for path in candidates:
            if scanned_files >= self.MAX_SEARCH_FILES or scanned_bytes >= self.MAX_SEARCH_BYTES:
                budget_truncated = True
                break
            if path.is_symlink() or not path.is_file() or path.suffix.lower() not in extensions:
                continue
            try:
                resolved = path.resolve()
                resolved.relative_to(source_root.resolve())
                size = resolved.stat().st_size
            except (OSError, ValueError):
                continue
            if size > self.MAX_SOURCE_BYTES or scanned_bytes + size > self.MAX_SEARCH_BYTES:
                budget_truncated = True
                continue
            scanned_files += 1
            scanned_bytes += size
            try:
                lines = resolved.read_text(encoding="utf-8", errors="ignore").splitlines()
            except OSError:
                continue
            for line_number, text in enumerate(lines, start=1):
                occurrences = text.casefold().count(lowered_query)
                if not occurrences:
                    continue
                matches.append(
                    {
                        "path": resolved.relative_to(self._case_root()).as_posix(),
                        "line": line_number,
                        "line_text": text.strip()[:500],
                        "score": occurrences,
                    }
                )

        matches.sort(key=lambda item: (-item["score"], item["path"], item["line"]))
        selected = matches[:bounded_top_k]
        result.update(
            success=True,
            matches=selected,
            count=len(selected),
            scanned_files=scanned_files,
            truncated=budget_truncated or len(matches) > bounded_top_k,
        )
        return result

    def open_source_context(
        self,
        artifact_path: str,
        line: int | None = None,
        context_lines: int = 10,
        max_lines: int = 40,
    ) -> dict[str, Any]:
        result = {
            "success": False,
            "error": None,
            "artifact_path": None,
            "start_line": None,
            "end_line": None,
            "lines": [],
            "truncated": False,
        }
        bounded_max, error = self._limit(max_lines, self.MAX_CONTEXT_LINES)
        if error:
            result["error"] = error
            return result
        if not isinstance(context_lines, int) or context_lines < 0:
            result["error"] = "context_lines must be a non-negative integer."
            return result
        context_lines = min(context_lines, self.MAX_CONTEXT_LINES)
        if line is not None and (not isinstance(line, int) or line < 1):
            result["error"] = "line must be a positive integer when provided."
            return result

        path, resolve_error = self._resolve_source(artifact_path)
        if resolve_error or path is None:
            result["error"] = resolve_error
            return result
        try:
            if path.stat().st_size > self.MAX_SOURCE_BYTES:
                result["error"] = f"Source file exceeds the {self.MAX_SOURCE_BYTES} byte limit."
                return result
            all_lines = path.read_text(encoding="utf-8", errors="ignore").splitlines()
        except OSError as exc:
            result["error"] = f"Could not read source file: {exc}"
            return result

        total = len(all_lines)
        if line is None:
            start = 1
            end = min(total, bounded_max)
        else:
            desired_start = max(1, line - context_lines)
            desired_end = min(total, line + context_lines)
            if desired_end - desired_start + 1 > bounded_max:
                before = bounded_max // 2
                start = max(1, line - before)
                end = min(total, start + bounded_max - 1)
                start = max(1, end - bounded_max + 1)
            else:
                start, end = desired_start, desired_end

        numbered = [
            {"line": number, "text": all_lines[number - 1][:500]}
            for number in range(start, end + 1)
        ]
        result.update(
            success=True,
            artifact_path=path.relative_to(self._case_root()).as_posix(),
            start_line=start,
            end_line=end,
            lines=numbered,
            truncated=start > 1 or end < total,
        )
        return result

    def get_manifest_facts(
        self,
        component: str | None = None,
        fact_type: str | None = None,
        limit: int = 100,
    ) -> dict[str, Any]:
        result = {
            "success": False,
            "error": None,
            "facts": [],
            "count": 0,
            "truncated": False,
        }
        bounded_limit, error = self._limit(limit, self.MAX_RESULTS)
        if error:
            result["error"] = error
            return result

        facts, load_error = self._load_json_list("facts/manifest_facts.json")
        if load_error:
            manifest, manifest_error = self._load_json_object("parsed/manifest.json")
            if manifest_error:
                result["error"] = (
                    "Neither manifest facts nor the parsed manifest were found for this case."
                )
                return result
            facts = self._facts_from_manifest(manifest)

        filtered = [
            self._fact_view(item)
            for item in facts
            if self._contains(item.get("key"), component)
            and self._manifest_fact_type_matches(item, fact_type)
        ]
        selected = filtered[:bounded_limit]
        result.update(
            success=True,
            facts=selected,
            count=len(selected),
            truncated=len(filtered) > bounded_limit,
        )
        return result

    @classmethod
    def _manifest_fact_type_matches(cls, item: dict[str, Any], requested: str | None) -> bool:
        if requested and requested.casefold() == "network":
            text = f"{item.get('type', '')} {item.get('key', '')}".casefold()
            return any(value in text for value in ("cleartext", "network_security"))
        return cls._matches(item.get("type"), requested)

    def _case_root(self) -> Path:
        return self.case_dir.resolve()

    def _resolve(
        self, relative_path: str | Path, *, require_file: bool = True
    ) -> tuple[Path | None, str | None]:
        try:
            if self.case_dir.is_symlink() or not self.case_dir.is_dir():
                return None, "Case directory does not exist or is not a regular directory."
            requested = Path(relative_path)
            if ".." in requested.parts:
                return None, "Path traversal is not allowed."
            case_root = self._case_root()
            candidate = requested if requested.is_absolute() else case_root / requested
            resolved = candidate.resolve()
            resolved.relative_to(case_root)
            relative = resolved.relative_to(case_root)
            current = case_root
            for part in relative.parts:
                current = current / part
                if current.is_symlink():
                    return None, "Symlink paths are not allowed."
            if require_file and not resolved.is_file():
                return None, "Requested file was not found in the case directory."
            return resolved, None
        except (OSError, RuntimeError, ValueError):
            return None, "Path is outside the case directory or could not be resolved safely."

    def _resolve_source(self, artifact_path: str) -> tuple[Path | None, str | None]:
        path, error = self._resolve(artifact_path)
        if error or path is None:
            return None, error
        source_root, root_error = self._resolve("jadx/sources", require_file=False)
        if root_error or source_root is None or not source_root.is_dir():
            return None, "JADX source directory was not found for this case."
        try:
            path.relative_to(source_root)
        except ValueError:
            return None, "Source path must be inside jadx/sources."
        if path.suffix.lower() not in self.ALLOWED_SOURCE_EXTENSIONS:
            return None, "Source file extension is not allowed."
        return path, None

    def _load_json_list(self, relative_path: str) -> tuple[list[dict[str, Any]], str | None]:
        value, error = self._load_json(relative_path)
        if error:
            return [], error
        if not isinstance(value, list):
            return [], f"{relative_path} does not contain a JSON list."
        return [item for item in value if isinstance(item, dict)], None

    def _load_json_object(self, relative_path: str) -> tuple[dict[str, Any], str | None]:
        value, error = self._load_json(relative_path)
        if error:
            return {}, error
        if not isinstance(value, dict):
            return {}, f"{relative_path} does not contain a JSON object."
        return value, None

    def _load_json(self, relative_path: str) -> tuple[Any, str | None]:
        path, error = self._resolve(relative_path)
        if error or path is None:
            return None, f"Could not read {relative_path}: {error}"
        try:
            if path.stat().st_size > self.MAX_JSON_BYTES:
                return None, f"{relative_path} exceeds the JSON size limit."
            return json.loads(path.read_text(encoding="utf-8")), None
        except (OSError, UnicodeError, json.JSONDecodeError) as exc:
            return None, f"Could not parse {relative_path}: {exc}"

    @staticmethod
    def _limit(value: int, maximum: int) -> tuple[int, str | None]:
        if not isinstance(value, int) or isinstance(value, bool) or value < 1:
            return 0, "limit must be a positive integer."
        return min(value, maximum), None

    def _extensions(self, values: list[str] | None) -> tuple[set[str], str | None]:
        if values is None:
            return set(self.ALLOWED_SOURCE_EXTENSIONS), None
        normalized = {
            value.lower() if str(value).startswith(".") else f".{str(value).lower()}"
            for value in values
        }
        if not normalized or not normalized <= self.ALLOWED_SOURCE_EXTENSIONS:
            return set(), "file_extensions contains an unsupported extension."
        return normalized, None

    @staticmethod
    def _matches(value: Any, expected: str | None) -> bool:
        return expected is None or str(value or "").casefold() == expected.casefold()

    @staticmethod
    def _contains(value: Any, expected: str | None) -> bool:
        return expected is None or expected.casefold() in str(value or "").casefold()

    def _finding_view(self, finding: dict[str, Any]) -> dict[str, Any]:
        keys = (
            "finding_id",
            "id",
            "rule_id",
            "title",
            "description",
            "severity",
            "confidence",
            "status",
            "category",
            "source",
            "evidence_ids",
            "affected_components",
            "impact",
            "remediation",
        )
        result = {key: self._bounded_value(finding[key]) for key in keys if key in finding}
        result.setdefault("finding_id", finding.get("id") or finding.get("rule_id") or "unknown")
        return result

    def _evidence_view(self, evidence: dict[str, Any]) -> dict[str, Any]:
        keys = (
            "evidence_id",
            "case_id",
            "evidence_type",
            "source_tool",
            "artifact_path",
            "selector",
            "snippet",
            "command",
            "sha256",
            "timestamp",
        )
        result = {key: self._bounded_value(evidence[key]) for key in keys if key in evidence}
        artifact = result.get("artifact_path")
        if isinstance(artifact, str) and Path(artifact).is_absolute():
            path, error = self._resolve(artifact)
            result["artifact_path"] = (
                path.relative_to(self._case_root()).as_posix() if path and not error else None
            )
        metadata = evidence.get("metadata")
        if isinstance(metadata, dict):
            result["metadata"] = self._bounded_value(
                {key: value for key, value in metadata.items() if key != "raw_evidence"}
            )
        return result

    def _fact_view(self, fact: dict[str, Any]) -> dict[str, Any]:
        keys = ("type", "key", "value", "source", "confidence", "metadata")
        return {key: self._bounded_value(fact[key]) for key in keys if key in fact}

    def _bounded_value(self, value: Any, depth: int = 0) -> Any:
        if depth >= 4:
            return "[truncated]"
        if isinstance(value, str):
            return value[: self.MAX_TEXT_LENGTH]
        if isinstance(value, list):
            return [self._bounded_value(item, depth + 1) for item in value[:50]]
        if isinstance(value, dict):
            return {
                str(key)[:100]: self._bounded_value(item, depth + 1)
                for key, item in list(value.items())[:50]
            }
        if value is None or isinstance(value, (bool, int, float)):
            return value
        return str(value)[: self.MAX_TEXT_LENGTH]

    @staticmethod
    def _facts_from_manifest(manifest: dict[str, Any]) -> list[dict[str, Any]]:
        facts: list[dict[str, Any]] = []

        def add(fact_type: str, key: str, value: Any, metadata: dict | None = None) -> None:
            facts.append(
                {
                    "type": fact_type,
                    "key": key,
                    "value": value,
                    "source": "manifest",
                    "confidence": "high",
                    "metadata": metadata or {},
                }
            )

        for key in (
            "package_name",
            "version_code",
            "version_name",
            "min_sdk",
            "target_sdk",
            "compile_sdk_version",
        ):
            if manifest.get(key) is not None:
                add(f"manifest.{key}", key, manifest[key])
        for permission in manifest.get("permissions") or []:
            add("manifest.permission", str(permission), True)
        application = manifest.get("application")
        if isinstance(application, dict):
            for key, value in application.items():
                if key not in {
                    "activities",
                    "services",
                    "receivers",
                    "providers",
                } and not isinstance(value, (dict, list)):
                    add(f"manifest.application.{key}", key, value)
        for component_type, manifest_key in (
            ("activity", "activities"),
            ("activity_alias", "activity_aliases"),
            ("service", "services"),
            ("receiver", "receivers"),
            ("provider", "providers"),
        ):
            components = manifest.get(manifest_key)
            if not isinstance(components, list) and isinstance(application, dict):
                components = application.get(manifest_key)
            for component in components if isinstance(components, list) else []:
                if not isinstance(component, dict):
                    continue
                name = str(component.get("name") or "<unnamed>")
                add(
                    f"manifest.component.{component_type}.present",
                    name,
                    True,
                    {"component_type": component_type},
                )
                for key in ("exported", "permission", "enabled", "authorities"):
                    if component.get(key) is not None:
                        add(
                            f"manifest.component.{component_type}.{key}",
                            name,
                            component[key],
                            {"component_type": component_type},
                        )
        return facts
