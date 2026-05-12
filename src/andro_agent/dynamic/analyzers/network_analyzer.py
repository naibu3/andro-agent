from __future__ import annotations

import json
from pathlib import Path
from typing import Any


def build_network_summary_from_event_log(event_log_path: Path) -> dict[str, Any]:
    if not event_log_path.exists():
        return {
            "hosts": [],
            "urls": [],
            "http_cleartext_urls": [],
            "request_count": 0,
        }

    try:
        content = event_log_path.read_text(encoding="utf-8", errors="ignore")
    except Exception:
        return {
            "hosts": [],
            "urls": [],
            "http_cleartext_urls": [],
            "request_count": 0,
        }

    urls: list[str] = []
    hosts: set[str] = set()
    http_cleartext_urls: list[str] = []

    for line in content.splitlines():
        line = line.strip()
        if "http://" in line or "https://" in line:
            parts = line.split()
            for part in parts:
                if part.startswith("http://") or part.startswith("https://"):
                    urls.append(part)
                    if part.startswith("http://"):
                        http_cleartext_urls.append(part)
                    host = _extract_host(part)
                    if host:
                        hosts.add(host)

    return {
        "hosts": sorted(hosts),
        "urls": sorted(set(urls)),
        "http_cleartext_urls": sorted(set(http_cleartext_urls)),
        "request_count": len(urls),
    }


def build_network_observations(
    test_id: str,
    network_summary: dict[str, Any],
    summary_path: Path,
) -> list[dict[str, Any]]:
    observations: list[dict[str, Any]] = []

    request_count = int(network_summary.get("request_count", 0))
    hosts = network_summary.get("hosts", [])
    cleartext_urls = network_summary.get("http_cleartext_urls", [])

    if request_count > 0:
        observations.append(
            {
                "test_id": test_id,
                "signal": "network_requests_observed",
                "success": True,
                "summary": "Network requests were observed during dynamic execution",
                "metadata": {
                    "summary_path": str(summary_path),
                    "request_count": request_count,
                    "hosts": hosts,
                },
            }
        )

    if cleartext_urls:
        observations.append(
            {
                "test_id": test_id,
                "signal": "network_cleartext_http_detected",
                "success": True,
                "summary": "Cleartext HTTP traffic was observed",
                "metadata": {
                    "summary_path": str(summary_path),
                    "http_cleartext_urls": cleartext_urls[:20],
                },
            }
        )

    return observations


def _extract_host(url: str) -> str | None:
    try:
        without_scheme = url.split("://", 1)[1]
        return without_scheme.split("/", 1)[0]
    except Exception:
        return None