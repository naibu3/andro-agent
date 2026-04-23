from __future__ import annotations

from typing import Any


def build_composite_dynamic_findings(
    observations: list[dict[str, Any]],
    dynamic_artifacts: list[str],
) -> list[dict[str, Any]]:
    findings: list[dict[str, Any]] = []

    by_test: dict[str, list[dict[str, Any]]] = {}
    for obs in observations:
        test_id = str(obs.get("test_id", "unknown"))
        by_test.setdefault(test_id, []).append(obs)

    for test_id, test_observations in by_test.items():
        signals = {
            str(obs.get("signal")): bool(obs.get("success", False))
            for obs in test_observations
        }

        evidence_items = _filter_evidence_for_test(test_id, dynamic_artifacts)

        activity_reached = signals.get("activity_launch_attempted", False)
        deeplink_reached = signals.get("deeplink_launch_attempted", False)
        ui_target_visible = signals.get("ui_package_matches_target", False)
        ui_sensitive = signals.get("ui_sensitive_keyword_detected", False)
        crash_detected = signals.get("crash_detected_in_logcat", False)
        ui_changed = signals.get("ui_changed_after_action", False)
        ui_text_diff = signals.get("ui_text_diff_detected", False)

        if activity_reached and ui_target_visible and ui_sensitive:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.exported_activity_sensitive_screen",
                    "title": "Exported activity reached a potentially sensitive screen",
                    "severity": "high",
                    "confidence": "high",
                    "category": "dynamic.composite.activity_ui",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": (
                        "An exported activity was launched successfully and the resulting UI "
                        "belongs to the target package with sensitive keywords present."
                    ),
                    "rationale": (
                        "This combination strongly suggests that an externally reachable activity "
                        "can navigate to a security-relevant or privileged screen."
                    ),
                    "evidence": evidence_items,
                    "raw_observations": test_observations,
                }
            )

        if deeplink_reached and ui_target_visible and ui_sensitive:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.deeplink_sensitive_screen",
                    "title": "Deep link reached a potentially sensitive screen",
                    "severity": "high",
                    "confidence": "high",
                    "category": "dynamic.composite.deeplink_ui",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": (
                        "A deep link was launched successfully and the resulting UI "
                        "belongs to the target package with sensitive keywords present."
                    ),
                    "rationale": (
                        "This combination suggests that the deep link can reach a sensitive "
                        "screen and should be reviewed for missing authorization checks."
                    ),
                    "evidence": evidence_items,
                    "raw_observations": test_observations,
                }
            )

        if (activity_reached or deeplink_reached) and crash_detected:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.reachable_path_crashed",
                    "title": "Reachable path triggered a crash during dynamic execution",
                    "severity": "high",
                    "confidence": "medium",
                    "category": "dynamic.composite.crash",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": (
                        "A dynamically reachable path was executed and crash indicators "
                        "were detected in logcat."
                    ),
                    "rationale": (
                        "This suggests that externally reachable functionality may be unstable "
                        "or vulnerable to malformed input, with potential denial-of-service impact."
                    ),
                    "evidence": evidence_items,
                    "raw_observations": test_observations,
                }
            )

        if activity_reached and ui_target_visible and ui_sensitive and (ui_changed or ui_text_diff):
            findings.append(
                {
                    "id": f"dynamic.{test_id}.exported_activity_sensitive_screen",
                    "title": "Exported activity reached a potentially sensitive screen",
                    "severity": "high",
                    "confidence": "high",
                    "category": "dynamic.composite.activity_ui",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": (
                        "An exported activity was launched successfully and the UI changed to a "
                        "target-package screen with sensitive keywords present."
                    ),
                    "rationale": (
                        "This strongly suggests that an externally reachable activity can navigate "
                        "to a security-relevant or privileged screen."
                    ),
                    "evidence": evidence_items,
                    "raw_observations": test_observations,
                }
            )

        if deeplink_reached and ui_target_visible and ui_sensitive and (ui_changed or ui_text_diff):
            findings.append(
                {
                    "id": f"dynamic.{test_id}.deeplink_sensitive_screen",
                    "title": "Deep link reached a potentially sensitive screen",
                    "severity": "high",
                    "confidence": "high",
                    "category": "dynamic.composite.deeplink_ui",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": (
                        "A deep link was launched successfully and the UI changed to a target-package "
                        "screen with sensitive keywords present."
                    ),
                    "rationale": (
                        "This suggests that the deep link can reach a sensitive screen and should "
                        "be reviewed for missing authorization checks."
                    ),
                    "evidence": evidence_items,
                    "raw_observations": test_observations,
                }
            )

    return _dedupe_findings(findings)


def _filter_evidence_for_test(
    test_id: str,
    artifacts: list[str],
) -> list[dict[str, str]]:
    return [
        {
            "id": f"{test_id}-evidence-{i:03d}",
            "category": "artifact",
            "subtype": "dynamic_artifact",
            "kind": "artifact",
            "value": artifact,
            "source": "dynamic_pipeline",
        }
        for i, artifact in enumerate(artifacts, start=1)
        if f"/{test_id}/" in artifact
    ]


def _dedupe_findings(findings: list[dict[str, Any]]) -> list[dict[str, Any]]:
    seen: set[str] = set()
    result: list[dict[str, Any]] = []

    for finding in findings:
        finding_id = str(finding.get("id", ""))
        if not finding_id or finding_id in seen:
            continue
        seen.add(finding_id)
        result.append(finding)

    return result