from __future__ import annotations

import json

from andro_agent.dynamic.api_discovery import ApiDiscovery, ApiDiscoveryConfig
from andro_agent.dynamic.api_probe import ApiProbe, ApiProbeConfig, ProbeResponse


def write_source(case_dir, relative, text):
    path = case_dir / relative
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(text, encoding="utf-8")
    return path


def selected(discovery):
    return discovery["selected_candidates"]


def test_static_discovery_finds_retrofit_base_url(tmp_path):
    case = tmp_path / "case"
    write_source(case, "jadx/sources/Api.java", 'Retrofit.Builder().baseUrl("https://api.example.com/v1/")')

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    candidate = selected(result)[0]
    assert candidate["host"] == "api.example.com"
    assert candidate["path_prefix"] == "/v1"
    assert candidate["confidence"] == "high"
    assert "retrofit" in candidate["source_types"]


def test_static_discovery_finds_resource_url(tmp_path):
    case = tmp_path / "case"
    write_source(case, "jadx/resources/res/values/strings.xml", '<string name="api">https://gateway.example.com/api/v2</string>')

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    assert selected(result)[0]["host"] == "gateway.example.com"
    assert "resource" in selected(result)[0]["sources"][0]["type"]


def test_ranking_prefers_retrofit_over_random_url(tmp_path):
    case = tmp_path / "case"
    write_source(case, "jadx/sources/Api.java", 'String docs="https://www.example.org/help"; baseUrl("https://api.example.com/v1/");')

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    assert selected(result)[0]["host"] == "api.example.com"
    assert selected(result)[0]["confidence"] == "high"


def test_private_hosts_are_skipped_unless_allowed(tmp_path):
    case = tmp_path / "case"
    write_source(case, "jadx/sources/Api.java", 'baseUrl("http://10.0.2.2:8080/api/")')

    blocked = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()
    allowed = ApiDiscovery(case, ApiDiscoveryConfig(mode="static", allow_private=True)).discover()

    assert blocked["selected_candidates_count"] == 0
    assert blocked["skipped_candidates"][0]["reason"] == "private_or_local_host"
    assert allowed["selected_candidates_count"] == 1


def test_manual_base_url_is_high_confidence(tmp_path):
    result = ApiDiscovery(
        tmp_path, ApiDiscoveryConfig(mode="off", manual_base_url="https://api.example.com/v1")
    ).discover()

    assert selected(result)[0]["confidence"] == "high"
    assert selected(result)[0]["reason"] == "manual_override"


def test_static_discovery_warns_when_no_static_artifacts_exist(tmp_path):
    result = ApiDiscovery(tmp_path / "case", ApiDiscoveryConfig(mode="static")).discover()

    assert result["candidates_count"] == 0
    assert result["warnings"] == [
        "Static API discovery requested but no static artifacts were found."
    ]


def test_android_framework_schema_urls_are_skipped(tmp_path):
    case = tmp_path / "case"
    write_source(
        case,
        "jadx/resources/res/layout/main.xml",
        'xmlns:android="http://schemas.android.com/apk/res/android" '
        'xmlns:app="http://schemas.android.com/apk/res-auto"',
    )

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    assert result["selected_candidates_count"] == 0
    assert {item["skip_reason"] for item in result["candidates"]} == {
        "framework_schema_url"
    }
    assert {item["reason"] for item in result["skipped_candidates"]} == {
        "framework_schema_url"
    }
    assert result["warnings"] == [
        "Only framework/schema URLs were discovered; no backend API candidates selected."
    ]


def test_backend_retrofit_url_remains_selected_with_schema_url(tmp_path):
    case = tmp_path / "case"
    write_source(
        case,
        "jadx/sources/Api.java",
        'String schema="http://schemas.android.com/apk/res/android"; '
        'Retrofit.Builder().baseUrl("https://api.example.com/v1/");',
    )

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    backend = next(
        item for item in selected(result) if item["base_url"] == "https://api.example.com/v1"
    )
    assert backend["confidence"] == "high"
    assert not result["warnings"]


def test_tracking_only_fallback_behavior_is_unchanged(tmp_path):
    case = tmp_path / "case"
    write_source(case, "jadx/sources/Telemetry.java", '"https://analytics.example.com/collect"')

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    assert result["selected_candidates_count"] == 1
    assert selected(result)[0]["host"] == "analytics.example.com"
    assert not result["warnings"]


def test_android_checkin_infrastructure_url_is_not_selected(tmp_path):
    case = tmp_path / "case"
    write_source(case, "jadx/sources/Runtime.txt", '"https://android.googleapis.com/checkin"')

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    assert result["selected_candidates_count"] == 0
    assert result["candidates"][0]["skip_reason"] == "third_party_infrastructure_url"


def test_storage_download_url_is_not_selected(tmp_path):
    case = tmp_path / "case"
    write_source(
        case,
        "jadx/sources/Runtime.txt",
        '"https://storage.googleapis.com/public-assets/app-update.zip"',
    )

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    assert result["selected_candidates_count"] == 0
    assert result["candidates"][0]["skip_reason"] == "third_party_infrastructure_url"


def test_github_documentation_url_is_not_selected(tmp_path):
    case = tmp_path / "case"
    write_source(case, "jadx/sources/About.java", '"https://github.com/example/mobile-app"')

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    assert result["selected_candidates_count"] == 0
    assert result["candidates"][0]["skip_reason"] == "non_backend_documentation_url"


def test_malformed_host_literal_is_skipped(tmp_path):
    case = tmp_path / "case"
    write_source(
        case,
        "jadx/sources/Runtime.txt",
        '"api.init.peoplemoduleinitintentoperation"',
    )

    result = ApiDiscovery(case, ApiDiscoveryConfig(mode="static")).discover()

    assert result["selected_candidates_count"] == 0
    assert result["skipped_candidates"] == [
        {
            "base_url": "https://api.init.peoplemoduleinitintentoperation",
            "reason": "malformed_or_unsupported_url",
        }
    ]


def discovery_for(url="https://api.example.com"):
    return ApiDiscovery(
        __import__("pathlib").Path("."), ApiDiscoveryConfig(mode="off", manual_base_url=url)
    ).discover()


def test_safe_probe_uses_only_safe_methods_and_global_limit():
    calls = []

    def transport(method, url, timeout):
        calls.append((method, url))
        return ProbeResponse(404, {"Content-Type": "text/plain"}, b"")

    result = ApiProbe(ApiProbeConfig(mode="safe", max_requests=4), transport).probe(discovery_for())

    assert len(calls) == 4
    assert {method for method, _ in calls} <= {"GET", "HEAD", "OPTIONS"}
    assert result["requests"]["requests_count"] == 4


def test_cross_host_redirect_is_not_followed():
    calls = []

    def transport(method, url, timeout):
        calls.append(url)
        return ProbeResponse(302, {"Location": "https://other.example.net/secret"}, b"")

    ApiProbe(ApiProbeConfig(mode="safe", max_requests=3), transport).probe(discovery_for())

    assert all("other.example.net" not in url for url in calls)


def test_openapi_response_creates_finding_observation_and_evidence():
    def transport(method, url, timeout):
        if url.endswith("/openapi.json"):
            return ProbeResponse(200, {"Content-Type": "application/json"}, json.dumps({"openapi": "3.0.0"}).encode())
        return ProbeResponse(404, {}, b"")

    result = ApiProbe(ApiProbeConfig(mode="safe"), transport).probe(discovery_for())

    finding = next(item for item in result["findings"] if item["finding_id"] == "API_DOCS_EXPOSED")
    assert finding["status"] == "dynamic_candidate"
    assert finding["evidence_ids"]
    assert any(item["evidence_id"] in finding["evidence_ids"] for item in result["evidence"])


def test_options_unsafe_methods_are_reported_but_not_called():
    calls = []

    def transport(method, url, timeout):
        calls.append(method)
        headers = {"Access-Control-Allow-Methods": "GET, POST, DELETE"} if method == "OPTIONS" else {}
        return ProbeResponse(200, headers, b"")

    result = ApiProbe(ApiProbeConfig(mode="safe", max_requests=3), transport).probe(discovery_for())

    assert "POST" not in calls and "DELETE" not in calls
    assert any(item["finding_id"] == "API_UNSAFE_METHODS_ADVERTISED" for item in result["findings"])


def test_permissive_cors_creates_finding_and_evidence():
    def transport(method, url, timeout):
        return ProbeResponse(200, {"Access-Control-Allow-Origin": "*", "Access-Control-Allow-Credentials": "true"}, b"{}")

    result = ApiProbe(ApiProbeConfig(mode="safe", max_requests=1), transport).probe(discovery_for())

    finding = next(item for item in result["findings"] if item["finding_id"] == "API_PERMISSIVE_CORS")
    assert finding["severity"] == "medium"
    assert finding["evidence_ids"]


def test_openapi_only_calls_get_operations_and_records_mutating_skips():
    calls = []

    def transport(method, url, timeout):
        calls.append((method, url))
        if url.endswith("/openapi.json"):
            body = json.dumps({"openapi": "3.0.0", "paths": {"/health": {"get": {}}, "/users": {"post": {}}}}).encode()
            return ProbeResponse(200, {"Content-Type": "application/json"}, body)
        return ProbeResponse(200, {}, b"{}")

    result = ApiProbe(ApiProbeConfig(mode="safe", max_requests=20), transport).probe(discovery_for())

    assert ("GET", "https://api.example.com/health") in calls
    assert all(method != "POST" for method, _ in calls)
    assert any(item["method"] == "POST" and item["skip_reason"] == "mutating_method_skipped"
               for item in result["requests"]["requests"])
