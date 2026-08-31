from __future__ import annotations

import hashlib
import ipaddress
import json
import re
from dataclasses import dataclass
from pathlib import Path
from typing import Any
from urllib.parse import urlparse

URL_RE = re.compile(r"https?://[^\s\"'<>\\)]+", re.IGNORECASE)
RETROFIT_RE = re.compile(r"baseUrl\s*\(\s*[\"'](https?://[^\"']+)", re.IGNORECASE)
HOST_RE = re.compile(r"\b(?:api|gateway|backend)\.[a-z0-9.-]+\.[a-z]{2,}\b", re.IGNORECASE)
API_PATHS = ("/api", "/v1", "/v2", "/graphql", "/rest", "/oauth", "/token", "/login", "/users")
TRACKING_MARKERS = ("analytics", "doubleclick", "adservice", "tracking", "firebase", "crashlytics", "cdn")
FRAMEWORK_SCHEMA_HOSTS = ("schemas.android.com",)
NON_BACKEND_SCHEMA_HOSTS = (
    "w3.org",
    "xmlpull.org",
    "json-schema.org",
    "schema.org",
    "maven.apache.org",
    "gradle.org",
)
INFRASTRUCTURE_HOSTS = (
    "android.googleapis.com",
    "storage.googleapis.com",
    "dl.google.com",
    "gstatic.com",
    "googleusercontent.com",
    "githubusercontent.com",
)
DOCUMENTATION_SOCIAL_HOSTS = (
    "github.com",
    "twitter.com",
    "x.com",
    "facebook.com",
    "linkedin.com",
)
INFRASTRUCTURE_PATH_MARKERS = ("/checkin", "/update", "/download", "/storage", "/captions")
LOW_VALUE_SKIP_REASONS = {
    "framework_schema_url",
    "non_backend_schema_url",
    "third_party_infrastructure_url",
    "non_backend_documentation_url",
    "malformed_or_unsupported_url",
}
SOURCE_SUFFIXES = {".java", ".kt", ".xml", ".json", ".txt", ".smali"}


@dataclass(frozen=True)
class ApiDiscoveryConfig:
    mode: str = "off"
    manual_base_url: str | None = None
    max_hosts: int = 5
    allow_hosts: tuple[str, ...] = ()
    allow_private: bool = False
    max_files: int = 1500
    max_bytes_per_file: int = 256_000


class ApiDiscovery:
    def __init__(self, case_dir: Path, config: ApiDiscoveryConfig) -> None:
        if config.mode not in {"off", "static", "dynamic", "auto"}:
            raise ValueError(f"Unsupported API discovery mode: {config.mode}")
        if config.max_hosts <= 0:
            raise ValueError("api_max_hosts must be positive")
        self.case_dir = Path(case_dir)
        self.config = config

    def discover(self) -> dict[str, Any]:
        if self.config.mode == "off" and not self.config.manual_base_url:
            return self._result([], [], [], [])
        raw: list[dict[str, Any]] = []
        errors: list[str] = []
        warnings: list[str] = []
        if self.config.manual_base_url:
            raw.append(self._raw(self.config.manual_base_url, "manual", "manual_override", "manual_override", None, None))
        if self.config.mode in {"static", "auto"}:
            static_files = self._static_files()
            if not static_files:
                warnings.append("Static API discovery requested but no static artifacts were found.")
            raw.extend(self._scan(static_files, dynamic=False, errors=errors))
        if self.config.mode in {"dynamic", "auto"}:
            raw.extend(self._scan(self._dynamic_files(), dynamic=True, errors=errors))

        candidates: list[dict[str, Any]] = []
        skipped: list[dict[str, Any]] = []
        by_key: dict[tuple[str, str, int | None, str], dict[str, Any]] = {}
        for item in raw:
            normalized, reason = self._normalize(item)
            if normalized is None:
                skipped.append({"base_url": item["url"], "reason": reason})
                continue
            key = (normalized["scheme"], normalized["host"], normalized["port"], normalized["path_prefix"])
            existing = by_key.get(key)
            if existing:
                existing["source_types"] = sorted(set(existing["source_types"] + normalized["source_types"]))
                existing["sources"].extend(normalized["sources"])
                if self._score(normalized) > self._score(existing):
                    existing["confidence"] = normalized["confidence"]
                    existing["reason"] = normalized["reason"]
                continue
            by_key[key] = normalized
            candidates.append(normalized)

        candidates.sort(key=lambda value: (-self._score(value), value["base_url"]))
        if candidates and all(
            candidate.get("skip_reason") == "third_party_tracking_domain"
            for candidate in candidates
        ):
            candidates[0]["skip_reason"] = None
        selected_count = 0
        for candidate in candidates:
            if candidate["skip_reason"]:
                skipped.append({"base_url": candidate["base_url"], "reason": candidate["skip_reason"]})
                continue
            if selected_count >= self.config.max_hosts:
                candidate["skip_reason"] = "max_hosts_exceeded"
                skipped.append({"base_url": candidate["base_url"], "reason": "max_hosts_exceeded"})
                continue
            candidate["selected"] = True
            selected_count += 1
        if not selected_count:
            skip_reasons = {item.get("reason") for item in skipped}
            schema_skip_reasons = {"framework_schema_url", "non_backend_schema_url"}
            if skip_reasons and skip_reasons <= schema_skip_reasons:
                warnings.append("Only framework/schema URLs were discovered; no backend API candidates selected.")
            elif skip_reasons and skip_reasons <= LOW_VALUE_SKIP_REASONS:
                warnings.append(
                    "Only infrastructure/documentation or malformed URLs were discovered; "
                    "no backend API candidates selected."
                )
        return self._result(candidates, skipped, errors, warnings)

    def _result(
        self,
        candidates: list[dict],
        skipped: list[dict],
        errors: list[str],
        warnings: list[str],
    ) -> dict:
        selected = [item for item in candidates if item.get("selected")]
        return {
            "enabled": self.config.mode != "off" or bool(self.config.manual_base_url),
            "mode": self.config.mode,
            "manual_base_url": self.config.manual_base_url,
            "candidates_count": len(candidates),
            "selected_candidates_count": len(selected),
            "candidates": candidates,
            "selected_candidates": selected,
            "skipped_candidates": skipped,
            "errors": errors,
            "warnings": warnings,
        }

    def _static_files(self) -> list[Path]:
        roots = [
            self.case_dir / "jadx/sources", self.case_dir / "jadx/resources",
            self.case_dir / "parsed/manifest.json", self.case_dir / "raw/AndroidManifest.xml",
            self.case_dir / "code_search/code_search_results.json", self.case_dir / "facts/code_facts.json",
            self.case_dir / "bundle/static_bundle.json", self.case_dir / "static/static_bundle.json",
        ]
        return self._files(roots)

    def _dynamic_files(self) -> list[Path]:
        roots = [self.case_dir / "dynamic"]
        return [path for path in self._files(roots) if not path.name.startswith("api_")]

    def _files(self, roots: list[Path]) -> list[Path]:
        files: list[Path] = []
        for root in roots:
            if root.is_file() and root.suffix.lower() in SOURCE_SUFFIXES:
                files.append(root)
            elif root.is_dir():
                for path in sorted(root.rglob("*")):
                    if path.is_file() and not path.is_symlink() and path.suffix.lower() in SOURCE_SUFFIXES:
                        files.append(path)
                        if len(files) >= self.config.max_files:
                            return files
        return files

    def _scan(self, files: list[Path], *, dynamic: bool, errors: list[str]) -> list[dict]:
        found: list[dict] = []
        for path in files:
            try:
                text = path.read_text(encoding="utf-8", errors="ignore")[: self.config.max_bytes_per_file]
            except OSError as exc:
                errors.append(f"{path}: {exc}")
                continue
            source = "logcat" if dynamic else ("resource" if "resources" in path.parts or path.suffix == ".xml" else "code")
            for match in RETROFIT_RE.finditer(text):
                found.append(self._raw(match.group(1), source, "retrofit", "Retrofit baseUrl literal", path, text, match.start()))
            for match in URL_RE.finditer(text):
                reason = "URL literal with API-looking path" if any(value in match.group(0).lower() for value in API_PATHS) else "URL literal"
                found.append(self._raw(match.group(0), source, "logcat" if dynamic else "url_literal", reason, path, text, match.start()))
            for match in HOST_RE.finditer(text):
                found.append(self._raw("https://" + match.group(0), source, "host_literal", "API-looking host name", path, text, match.start()))
        return found

    def _raw(self, url: str, source: str, source_type: str, reason: str, path: Path | None, text: str | None, offset: int = 0) -> dict:
        line = text.count("\n", 0, offset) + 1 if text is not None else None
        snippet = text[max(0, offset - 80): offset + 200].strip() if text is not None else url
        return {"url": url.rstrip(".,;"), "source": source, "source_type": source_type, "reason": reason,
                "artifact_path": str(path.relative_to(self.case_dir)) if path else None,
                "selector": f"line:{line}" if line else None, "snippet": snippet[:500]}

    def _normalize(self, raw: dict) -> tuple[dict | None, str | None]:
        value = raw["url"]
        parsed = urlparse(value if "://" in value else "https://" + value)
        if parsed.scheme not in {"http", "https"} or not parsed.hostname:
            return None, "malformed_or_unsupported_url"
        host = parsed.hostname.lower().rstrip(".")
        source_type = raw["source_type"]
        if not self._valid_host(host, source_type):
            return None, "malformed_or_unsupported_url"
        if self.config.allow_hosts and host not in {item.lower() for item in self.config.allow_hosts}:
            return None, "host_not_allowlisted"
        if not self.config.allow_private and self._private(host):
            return None, "private_or_local_host"
        path = parsed.path.rstrip("/")
        path_prefix = path if path and path != "/" else ""
        try:
            port = parsed.port
        except ValueError:
            return None, "malformed_or_unsupported_url"
        authority = host + (f":{port}" if port else "")
        base_url = f"{parsed.scheme}://{authority}{path_prefix}"
        confidence = "high" if source_type in {"retrofit", "manual_override"} else "medium" if any(token in path.lower() for token in API_PATHS) or source_type == "host_literal" else "low"
        tracking = any(marker in host for marker in TRACKING_MARKERS)
        skip_reason = None if source_type == "manual_override" else self._non_backend_skip_reason(
            host, path, source_type
        )
        if skip_reason is None and tracking and source_type != "manual_override":
            skip_reason = "third_party_tracking_domain"
        third_party = tracking or skip_reason in {
            "third_party_infrastructure_url",
            "non_backend_documentation_url",
        }
        digest = hashlib.sha256(base_url.encode()).hexdigest()[:12].upper()
        return ({"candidate_id": f"API-CAND-{digest}", "scheme": parsed.scheme, "host": host,
                 "port": port, "base_url": base_url, "path_prefix": path_prefix or None,
                 "confidence": confidence, "source_types": [source_type],
                 "sources": [{"type": raw["source"], "artifact_path": raw["artifact_path"],
                              "selector": raw["selector"], "snippet": raw["snippet"]}],
                 "reason": raw["reason"], "third_party": third_party, "selected": False,
                 "skip_reason": skip_reason}, None)

    @staticmethod
    def _schema_skip_reason(host: str) -> str | None:
        if any(host == domain or host.endswith(f".{domain}") for domain in FRAMEWORK_SCHEMA_HOSTS):
            return "framework_schema_url"
        if any(host == domain or host.endswith(f".{domain}") for domain in NON_BACKEND_SCHEMA_HOSTS):
            return "non_backend_schema_url"
        return None

    @classmethod
    def _non_backend_skip_reason(cls, host: str, path: str, source_type: str) -> str | None:
        schema_reason = cls._schema_skip_reason(host)
        if schema_reason:
            return schema_reason
        if any(host == domain or host.endswith(f".{domain}") for domain in INFRASTRUCTURE_HOSTS):
            return "third_party_infrastructure_url"
        if host.endswith(".googleapis.com") and any(
            marker in path.lower() for marker in INFRASTRUCTURE_PATH_MARKERS
        ):
            return "third_party_infrastructure_url"
        if any(host == domain or host.endswith(f".{domain}") for domain in DOCUMENTATION_SOCIAL_HOSTS):
            if source_type == "retrofit" and any(marker in path.lower() for marker in API_PATHS):
                return None
            return "non_backend_documentation_url"
        return None

    @staticmethod
    def _valid_host(host: str, source_type: str) -> bool:
        if len(host) > 253 or ".." in host:
            return False
        labels = host.split(".")
        if len(labels) < 2 or any(
            not label
            or len(label) > 63
            or not re.fullmatch(r"[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", label)
            for label in labels
        ):
            return False
        if source_type == "host_literal" and (
            not labels[-1].isalpha() or not 2 <= len(labels[-1]) <= 24
        ):
            return False
        return True

    @staticmethod
    def _private(host: str) -> bool:
        if host in {"localhost", "10.0.2.2"} or host.endswith(".local"):
            return True
        try:
            address = ipaddress.ip_address(host)
        except ValueError:
            return False
        return address.is_private or address.is_loopback or address.is_link_local or address.is_reserved

    @staticmethod
    def _score(candidate: dict) -> int:
        confidence = {"high": 300, "medium": 200, "low": 100}[candidate["confidence"]]
        return confidence + (20 if candidate["scheme"] == "https" else 0) + (20 if "retrofit" in candidate["source_types"] else 0) - (200 if candidate["third_party"] else 0)
