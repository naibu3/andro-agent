from __future__ import annotations

import json
from pathlib import Path
from typing import Any

from andro_agent.models_dynamic import DynamicAction, DynamicPlan, DynamicTest
from andro_agent.dynamic.provider_paths import build_provider_candidate_uris_from_bundle

def build_dynamic_plan_from_static_bundle(
    case_id: str,
    bundle_path: Path,
    package_name: str,
) -> DynamicPlan:
    if not bundle_path.exists():
        return _fallback_plan(case_id=case_id, package_name=package_name)

    try:
        bundle = json.loads(bundle_path.read_text(encoding="utf-8"))
    except Exception:
        return _fallback_plan(case_id=case_id, package_name=package_name)

    manifest = bundle.get("manifest") or {}
    tests: list[DynamicTest] = []

    tests.append(
        DynamicTest(
            test_id="dyn-001",
            title="Launch main app entrypoint",
            masvs_control_group="MASVS-PLATFORM",
            category="app_launch",
            priority="high",
            actions=[DynamicAction(action="launch_app", parameters={})],
            expected_signals=["app_launch_attempted"],
        )
    )

    tests.extend(_build_exported_activity_tests(manifest, package_name))
    tests.extend(_build_deeplink_tests(manifest))
    provider_candidates = build_provider_candidate_uris_from_bundle(bundle_path)
    tests.extend(_build_provider_tests(manifest, provider_candidates))

    return DynamicPlan(
        case_id=case_id,
        package_name=package_name,
        device_profile="baseline",
        tests=_dedupe_tests(tests),
    )


def _fallback_plan(case_id: str, package_name: str) -> DynamicPlan:
    return DynamicPlan(
        case_id=case_id,
        package_name=package_name,
        device_profile="baseline",
        tests=[
            DynamicTest(
                test_id="dyn-001",
                title="Launch main app entrypoint",
                masvs_control_group="MASVS-PLATFORM",
                category="app_launch",
                priority="high",
                actions=[DynamicAction(action="launch_app", parameters={})],
                expected_signals=["app_launch_attempted"],
            )
        ],
    )


def _build_exported_activity_tests(
    manifest: dict[str, Any],
    package_name: str,
) -> list[DynamicTest]:
    tests: list[DynamicTest] = []
    activities = manifest.get("activities") or []

    idx = 100
    for activity in activities:
        if not activity.get("exported", False):
            continue

        component_name = _normalize_component_name(
            package_name=package_name,
            component_name=activity.get("name"),
        )
        if not component_name:
            continue

        idx += 1
        tests.append(
            DynamicTest(
                test_id=f"dyn-{idx}",
                title=f"Launch exported activity {component_name}",
                masvs_control_group="MASVS-PLATFORM",
                category="exported_activity",
                priority="high",
                actions=[
                    DynamicAction(
                        action="launch_activity",
                        parameters={"component": component_name},
                    )
                ],
                expected_signals=["activity_launch_attempted"],
            )
        )

    return tests


def _build_deeplink_tests(manifest: dict[str, Any]) -> list[DynamicTest]:
    tests: list[DynamicTest] = []
    activities = manifest.get("activities") or []

    idx = 200
    for activity in activities:
        intent_filters = activity.get("intent_filters") or []
        for intent_filter in intent_filters:
            actions = intent_filter.get("actions") or []
            data_entries = intent_filter.get("data") or []

            if "android.intent.action.VIEW" not in actions:
                continue

            for data_entry in data_entries:
                url = _build_deeplink_url(data_entry)
                if not url:
                    continue

                idx += 1
                tests.append(
                    DynamicTest(
                        test_id=f"dyn-{idx}",
                        title=f"Open deep link {url}",
                        masvs_control_group="MASVS-PLATFORM",
                        category="deep_link",
                        priority="high",
                        actions=[
                            DynamicAction(
                                action="open_deeplink",
                                parameters={"url": url},
                            )
                        ],
                        expected_signals=["deeplink_launch_attempted"],
                    )
                )

    return tests

def _build_provider_tests(
    manifest: dict[str, Any],
    provider_candidates: dict[str, list[str]],
) -> list[DynamicTest]:
    tests: list[DynamicTest] = []
    providers = manifest.get("providers") or []

    idx = 300
    for provider in providers:
        authorities = provider.get("authorities")
        exported = provider.get("exported", False)

        if not authorities:
            continue

        if not exported and provider.get("read_permission") and provider.get("write_permission"):
            continue

        for authority in str(authorities).split(";"):
            authority = authority.strip()
            if not authority:
                continue

            candidate_uris = provider_candidates.get(authority, [f"content://{authority}"])

            for uri in candidate_uris[:12]:
                idx += 1
                tests.append(
                    DynamicTest(
                        test_id=f"dyn-{idx}",
                        title=f"Query content provider {uri}",
                        masvs_control_group="MASVS-PLATFORM",
                        category="content_provider",
                        priority="high",
                        actions=[
                            DynamicAction(
                                action="query_content_provider",
                                parameters={"uri": uri},
                            )
                        ],
                        expected_signals=[
                            "content_provider_query_attempted",
                            "content_provider_rows_detected",
                            "content_provider_permission_denied",
                        ],
                    )
                )

    return tests

def _normalize_component_name(package_name: str, component_name: str | None) -> str | None:
    if not component_name:
        return None

    component_name = component_name.strip()
    if component_name.startswith("."):
        return f"{package_name}/{component_name}"
    if "/" in component_name:
        return component_name
    return f"{package_name}/{component_name}"


def _build_deeplink_url(data_entry: dict[str, Any]) -> str | None:
    scheme = data_entry.get("scheme")
    host = data_entry.get("host")
    path = data_entry.get("path") or data_entry.get("pathPrefix") or data_entry.get("pathPattern")

    if not scheme:
        return None

    url = f"{scheme}://"
    if host:
        url += str(host)
    if path:
        if not str(path).startswith("/"):
            url += "/"
        url += str(path)

    return url


def _dedupe_tests(tests: list[DynamicTest]) -> list[DynamicTest]:
    seen: set[tuple[str, str]] = set()
    result: list[DynamicTest] = []

    for test in tests:
        signature = (
            test.category,
            json.dumps([action.model_dump() for action in test.actions], sort_keys=True),
        )
        if signature in seen:
            continue
        seen.add(signature)
        result.append(test)

    renumbered: list[DynamicTest] = []
    for i, test in enumerate(result, start=1):
        test.test_id = f"dyn-{i:03d}"
        renumbered.append(test)

    return renumbered