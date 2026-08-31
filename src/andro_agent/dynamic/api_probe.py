from __future__ import annotations

import hashlib
import json
import socket
import time
import urllib.error
import urllib.request
from dataclasses import dataclass
from typing import Any, Callable
from urllib.parse import urljoin, urlparse

from andro_agent.dynamic.api_discovery import ApiDiscovery

SAFE_METHODS = frozenset({"GET", "HEAD", "OPTIONS"})
UNSAFE_METHODS = frozenset({"POST", "PUT", "PATCH", "DELETE"})
PROBE_PATHS = ("/openapi.json", "/swagger.json", "/swagger", "/docs", "/api-docs", "/api", "/api/v1", "/v1", "/graphql")
KEPT_HEADERS = frozenset({"content-type", "location", "allow", "strict-transport-security", "content-security-policy", "x-content-type-options", "x-frame-options", "referrer-policy", "access-control-allow-origin", "access-control-allow-credentials", "access-control-allow-methods"})


@dataclass(frozen=True)
class ApiProbeConfig:
    mode: str = "off"
    max_requests: int = 30
    timeout: float = 5.0
    allow_hosts: tuple[str, ...] = ()
    allow_private: bool = False
    body_sample_chars: int = 2048


@dataclass
class ProbeResponse:
    status_code: int
    headers: dict[str, str]
    body: bytes = b""


class _NoRedirect(urllib.request.HTTPRedirectHandler):
    def redirect_request(self, req, fp, code, msg, headers, newurl):  # noqa: ANN001
        return None


class ApiProbe:
    def __init__(self, config: ApiProbeConfig, transport: Callable[[str, str, float], ProbeResponse] | None = None) -> None:
        if config.mode not in {"off", "safe"}:
            raise ValueError(f"Unsupported API probe mode: {config.mode}")
        if config.max_requests <= 0 or config.timeout <= 0:
            raise ValueError("API request limit and timeout must be positive")
        self.config = config
        self._custom_transport = transport is not None
        self.transport = transport or self._request

    def probe(self, discovery: dict[str, Any]) -> dict[str, Any]:
        requests: list[dict] = []
        observations: list[dict] = []
        evidence: list[dict] = []
        findings: list[dict] = []
        errors: list[str] = []
        selected = discovery.get("selected_candidates", []) if isinstance(discovery, dict) else []
        if self.config.mode == "off":
            return self._result(selected, requests, observations, evidence, findings, errors)

        for candidate in selected:
            if len(requests) >= self.config.max_requests:
                break
            host = str(candidate.get("host") or "").lower()
            if self.config.allow_hosts and host not in {value.lower() for value in self.config.allow_hosts}:
                continue
            if not self.config.allow_private and ApiDiscovery._private(host):
                continue
            if not self.config.allow_private and not self._custom_transport and self._resolves_private(host):
                continue
            base = str(candidate["base_url"]).rstrip("/")
            parsed_base = urlparse(base)
            origin = f"{parsed_base.scheme}://{parsed_base.netloc}"
            if candidate.get("scheme") == "http":
                evidence_item = self._evidence(candidate, None, base, "API candidate uses cleartext HTTP")
                evidence.append(evidence_item)
                findings.append(self._finding("API_CLEARTEXT_HTTP", "API endpoint uses cleartext HTTP", "A discovered API candidate uses HTTP instead of HTTPS.", "medium", "high", "network", base, candidate, evidence_item))

            plans: list[tuple[str, str]] = [("HEAD", base), ("OPTIONS", base)]
            plans.extend(("GET", urljoin(origin + "/", path.lstrip("/"))) for path in PROBE_PATHS)
            planned = set(plans)
            for method, url in plans:
                if len(requests) >= self.config.max_requests:
                    break
                request = self._execute(candidate, method, url)
                requests.append(request)
                if request["error"]:
                    errors.append(f"{method} {url}: {request['error']}")
                    continue
                new_observations, new_evidence, new_findings = self._analyze(candidate, request)
                observations.extend(new_observations)
                evidence.extend(new_evidence)
                findings.extend(new_findings)
                if method == "GET" and urlparse(url).path == "/openapi.json" and request["status_code"] == 200:
                    safe_operations, skipped_operations = self._openapi_operations(origin, request["body_sample"])
                    for operation in safe_operations:
                        if operation not in planned:
                            planned.add(operation)
                            plans.append(operation)
                    for skipped_method, skipped_url in skipped_operations:
                        if len(requests) >= self.config.max_requests:
                            break
                        requests.append(self._execute(candidate, skipped_method, skipped_url))
        findings = self._dedupe_findings(findings)
        return self._result(selected, requests, observations, evidence, findings, errors)

    @staticmethod
    def _openapi_operations(origin: str, body: str) -> tuple[list[tuple[str, str]], list[tuple[str, str]]]:
        try:
            document = json.loads(body)
        except (json.JSONDecodeError, TypeError):
            return [], []
        paths = document.get("paths", {}) if isinstance(document, dict) else {}
        if not isinstance(paths, dict):
            return [], []
        safe: list[tuple[str, str]] = []
        skipped: list[tuple[str, str]] = []
        for path, operations in sorted(paths.items())[:20]:
            if not isinstance(path, str) or not path.startswith("/") or not isinstance(operations, dict):
                continue
            url = urljoin(origin + "/", path.lstrip("/"))
            for method in sorted(str(value).upper() for value in operations):
                if method == "GET" and "{" not in path:
                    safe.append((method, url))
                elif method in UNSAFE_METHODS:
                    skipped.append((method, url))
        return safe, skipped

    @staticmethod
    def _resolves_private(host: str) -> bool:
        try:
            addresses = {item[4][0] for item in socket.getaddrinfo(host, None)}
        except OSError:
            return False
        return any(ApiDiscovery._private(address) for address in addresses)

    def _execute(self, candidate: dict, method: str, url: str) -> dict:
        request_id = "API-REQ-" + hashlib.sha256(f"{candidate['candidate_id']}:{method}:{url}".encode()).hexdigest()[:12].upper()
        if method not in SAFE_METHODS:
            return self._request_record(request_id, candidate, method, url, skipped=True, skip_reason="mutating_method_skipped")
        if urlparse(url).hostname != candidate.get("host"):
            return self._request_record(request_id, candidate, method, url, skipped=True, skip_reason="cross_host_blocked")
        started = time.monotonic()
        try:
            response = self.transport(method, url, self.config.timeout)
            elapsed = round((time.monotonic() - started) * 1000)
            headers = {str(key).lower(): str(value) for key, value in response.headers.items() if str(key).lower() in KEPT_HEADERS}
            decoded = response.body.decode("utf-8", errors="replace")
            return self._request_record(request_id, candidate, method, url, status=response.status_code,
                                        elapsed=elapsed, headers=headers, body=decoded)
        except Exception as exc:  # noqa: BLE001 - each bounded request is independently recorded
            return self._request_record(request_id, candidate, method, url, elapsed=round((time.monotonic() - started) * 1000), error=str(exc))

    def _request_record(self, request_id: str, candidate: dict, method: str, url: str, *, status: int | None = None,
                        elapsed: int | None = None, headers: dict | None = None, body: str = "", error: str | None = None,
                        skipped: bool = False, skip_reason: str | None = None) -> dict:
        sample = body[: self.config.body_sample_chars]
        headers = headers or {}
        return {"request_id": request_id, "candidate_id": candidate.get("candidate_id"), "method": method,
                "url": url, "status_code": status, "elapsed_ms": elapsed,
                "content_type": headers.get("content-type"), "response_headers": headers,
                "body_sample": sample, "body_truncated": len(body) > len(sample), "error": error,
                "skipped": skipped, "skip_reason": skip_reason}

    def _analyze(self, candidate: dict, request: dict) -> tuple[list[dict], list[dict], list[dict]]:
        observations: list[dict] = []
        evidence: list[dict] = []
        findings: list[dict] = []
        url, method, status = request["url"], request["method"], request["status_code"]
        headers = request["response_headers"]
        path = urlparse(url).path.lower()
        if method == "GET" and status == 200 and path in {"/openapi.json", "/swagger.json", "/swagger", "/docs", "/api-docs"}:
            evidence_item = self._evidence(candidate, request, url, f"GET {path} returned 200 {request.get('content_type') or ''}".strip())
            evidence.append(evidence_item)
            observations.append(self._observation("api_docs_exposed", "low", "medium", candidate, request, evidence_item))
            findings.append(self._finding("API_DOCS_EXPOSED", "API documentation endpoint exposed", "A discovered API host exposes an API documentation endpoint.", "low", "medium", "api_exposure", url, candidate, evidence_item))
        origin = headers.get("access-control-allow-origin")
        credentials = headers.get("access-control-allow-credentials", "").lower() == "true"
        if origin == "*":
            evidence_item = self._evidence(candidate, request, url, f"{method} response allows CORS origin *")
            evidence.append(evidence_item)
            severity = "medium" if credentials else "low"
            observations.append(self._observation("permissive_cors", severity, "medium", candidate, request, evidence_item))
            findings.append(self._finding("API_PERMISSIVE_CORS", "API response permits wildcard CORS", "The API response includes Access-Control-Allow-Origin: *.", severity, "medium", "api_misconfiguration", url, candidate, evidence_item))
        if method == "OPTIONS":
            advertised = {value.strip().upper() for value in headers.get("access-control-allow-methods", headers.get("allow", "")).split(",")}
            unsafe = sorted(advertised & UNSAFE_METHODS)
            if unsafe:
                evidence_item = self._evidence(candidate, request, url, "OPTIONS advertises unsafe methods: " + ", ".join(unsafe))
                evidence.append(evidence_item)
                observations.append(self._observation("unsafe_methods_advertised", "low", "medium", candidate, request, evidence_item, {"methods": unsafe}))
                findings.append(self._finding("API_UNSAFE_METHODS_ADVERTISED", "API advertises potentially unsafe HTTP methods", "An OPTIONS response advertises mutating methods; they were not invoked.", "low", "medium", "api_exposure", url, candidate, evidence_item))
        return observations, evidence, findings

    def _evidence(self, candidate: dict, request: dict | None, url: str, snippet: str) -> dict:
        request_id = request.get("request_id") if request else None
        evidence_id = "EVID-API-" + hashlib.sha256(f"{candidate['candidate_id']}:{request_id}:{snippet}".encode()).hexdigest()[:12].upper()
        return {"evidence_id": evidence_id, "evidence_type": "api", "source_tool": "api_probe",
                "artifact_path": "dynamic/api_requests.json", "url": url,
                "selector": f"{request['method']} {urlparse(url).path or '/'}" if request else url,
                "snippet": snippet, "metadata": {"status_code": request.get("status_code") if request else None,
                "candidate_id": candidate["candidate_id"], "request_id": request_id}}

    @staticmethod
    def _observation(kind: str, severity: str, confidence: str, candidate: dict, request: dict, evidence: dict, details: dict | None = None) -> dict:
        return {"type": kind, "severity_hint": severity, "confidence": confidence,
                "candidate_id": candidate["candidate_id"], "url": request["url"], "method": request["method"],
                "status_code": request["status_code"], "evidence_id": evidence["evidence_id"], "details": details or {}}

    @staticmethod
    def _finding(finding_id: str, title: str, description: str, severity: str, confidence: str, category: str,
                 endpoint: str, candidate: dict, evidence: dict) -> dict:
        return {"finding_id": finding_id, "title": title, "description": description, "severity": severity,
                "confidence": confidence, "status": "dynamic_candidate", "category": category,
                "affected_endpoint": endpoint, "evidence_ids": [evidence["evidence_id"]],
                "remediation": "Review and restrict the exposed API behavior as appropriate for production.",
                "metadata": {"source": "api_probe", "candidate_id": candidate["candidate_id"]}}

    @staticmethod
    def _dedupe_findings(findings: list[dict]) -> list[dict]:
        result, seen = [], set()
        for finding in findings:
            key = (finding["finding_id"], finding["affected_endpoint"])
            if key not in seen:
                seen.add(key)
                result.append(finding)
        return result

    def _result(self, selected: list, requests: list, observations: list, evidence: list, findings: list, errors: list) -> dict:
        return {"requests": {"requests": requests, "requests_count": len(requests),
                             "errors_count": sum(bool(item.get("error")) for item in requests)},
                "observations": {"enabled": self.config.mode != "off", "mode": self.config.mode,
                                 "base_candidates_count": len(selected),
                                 "probed_hosts_count": len({item.get("candidate_id") for item in requests if not item.get("skipped")}),
                                 "requests_count": len(requests), "observations": observations,
                                 "errors": errors, "warnings": []},
                "evidence": evidence, "findings": findings}

    @staticmethod
    def _request(method: str, url: str, timeout: float) -> ProbeResponse:
        opener = urllib.request.build_opener(_NoRedirect)
        request = urllib.request.Request(url, method=method, headers={"User-Agent": "andro-agent-safe-probe/1.0", "Accept": "application/json,text/plain,*/*"})
        try:
            with opener.open(request, timeout=timeout) as response:
                return ProbeResponse(response.status, dict(response.headers.items()), response.read(4097))
        except urllib.error.HTTPError as exc:
            return ProbeResponse(exc.code, dict(exc.headers.items()), exc.read(4097))
