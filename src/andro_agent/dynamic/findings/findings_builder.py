from __future__ import annotations

from typing import Any

from andro_agent.dynamic.findings.composite_findings import build_composite_dynamic_findings

def build_dynamic_findings(
    observations: list[dict[str, Any]],
    dynamic_artifacts: list[str],
) -> list[dict[str, Any]]:
    findings: list[dict[str, Any]] = []

    for obs in observations:
        signal = obs.get("signal")
        success = obs.get("success", False)
        test_id = obs.get("test_id", "unknown")
        summary = obs.get("summary", "")
        metadata = obs.get("metadata", {})

        evidence_items = _filter_evidence_for_test(test_id, dynamic_artifacts)

        if signal == "activity_launch_attempted" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.exported_activity_accessible",
                    "title": "Exported activity dynamically reachable",
                    "severity": "medium",
                    "confidence": "medium",
                    "category": "dynamic.exported_activity",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": summary,
                    "rationale": (
                        "The exported activity was launched successfully during dynamic execution. "
                        "This confirms reachable attack surface and may indicate missing authorization "
                        "or trust-boundary validation depending on the activity purpose."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "deeplink_launch_attempted" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.deeplink_reachable",
                    "title": "Deep link dynamically reachable",
                    "severity": "medium",
                    "confidence": "medium",
                    "category": "dynamic.deep_link",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": summary,
                    "rationale": (
                        "The deep link was launched successfully during dynamic execution. "
                        "This confirms externally reachable navigation surface that should be "
                        "reviewed for authorization and input validation."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "content_provider_rows_detected" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.provider_rows_exposed",
                    "title": "Content provider returned data dynamically",
                    "severity": "high",
                    "confidence": "high",
                    "category": "dynamic.content_provider",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": summary,
                    "rationale": (
                        "The content provider returned rows during dynamic execution, which strongly "
                        "suggests externally reachable data exposure or insufficient access control."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "content_provider_permission_denied" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.provider_protected",
                    "title": "Content provider blocked unauthorized access",
                    "severity": "info",
                    "confidence": "high",
                    "category": "dynamic.content_provider",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": summary,
                    "rationale": (
                        "The content provider denied the external query attempt, which is evidence "
                        "of access control enforcement."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "content_provider_query_attempted":
            stderr = str(metadata.get("stderr", ""))
            if "Unknown URI" in stderr or "unknown uri" in stderr.lower():
                findings.append(
                    {
                        "id": f"dynamic.{test_id}.provider_unknown_uri",
                        "title": "Content provider authority reachable but URI path unresolved",
                        "severity": "low",
                        "confidence": "medium",
                        "category": "dynamic.content_provider",
                        "masvs_control_group": "MASVS-PLATFORM",
                        "summary": summary,
                        "rationale": (
                            "The provider authority responded to the query attempt, but the URI path "
                            "was not valid. This suggests the authority exists and may require more "
                            "specific paths for enumeration."
                        ),
                        "evidence": evidence_items,
                        "raw_observation": obs,
                    }
                )

        elif signal == "crash_detected_in_logcat" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.crash_detected",
                    "title": "Potential crash detected during dynamic execution",
                    "severity": "high",
                    "confidence": "medium",
                    "category": "dynamic.crash",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": summary,
                    "rationale": (
                        "Logcat shows crash indicators triggered during dynamic execution. "
                        "This may indicate insufficient input validation, unsafe assumptions, "
                        "or denial-of-service potential."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "ui_package_matches_target" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.ui_target_package_visible",
                    "title": "Target package UI reached during dynamic execution",
                    "severity": "info",
                    "confidence": "high",
                    "category": "dynamic.ui",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": summary,
                    "rationale": (
                        "The UI dump shows elements belonging to the target package, "
                        "which increases confidence that the intended screen was reached."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "ui_sensitive_keyword_detected" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.ui_sensitive_keywords",
                    "title": "Potentially sensitive UI content detected",
                    "severity": "medium",
                    "confidence": "medium",
                    "category": "dynamic.ui",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": summary,
                    "rationale": (
                        "Sensitive or security-relevant keywords were found in the UI dump. "
                        "This may indicate that the executed path reached a privileged or "
                        "security-relevant screen."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "ui_changed_after_action" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.ui_changed_after_action",
                    "title": "UI changed after dynamic action",
                    "severity": "info",
                    "confidence": "high",
                    "category": "dynamic.ui_transition",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": summary,
                    "rationale": (
                        "The UI state changed after the dynamic action, which increases confidence "
                        "that the tested path caused a real navigation or screen transition."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "ui_text_diff_detected" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.ui_new_text_detected",
                    "title": "New UI text appeared after action",
                    "severity": "info",
                    "confidence": "medium",
                    "category": "dynamic.ui_transition",
                    "masvs_control_group": "MASVS-PLATFORM",
                    "summary": summary,
                    "rationale": (
                        "The set of visible texts changed after the dynamic action, which suggests "
                        "that a new view or state was reached."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "network_requests_observed" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.network_requests_observed",
                    "title": "Network traffic observed during dynamic execution",
                    "severity": "info",
                    "confidence": "high",
                    "category": "dynamic.network",
                    "masvs_control_group": "MASVS-NETWORK",
                    "summary": summary,
                    "rationale": (
                        "The application generated network traffic during dynamic execution. "
                        "This provides visibility into external communication paths for further review."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

        elif signal == "network_cleartext_http_detected" and success:
            findings.append(
                {
                    "id": f"dynamic.{test_id}.cleartext_http_detected",
                    "title": "Cleartext HTTP traffic detected",
                    "severity": "high",
                    "confidence": "high",
                    "category": "dynamic.network",
                    "masvs_control_group": "MASVS-NETWORK",
                    "summary": summary,
                    "rationale": (
                        "Cleartext HTTP traffic was observed during dynamic execution, which may expose "
                        "sensitive data to interception and indicates weak transport protection."
                    ),
                    "evidence": evidence_items,
                    "raw_observation": obs,
                }
            )

    composite_findings = build_composite_dynamic_findings(
        observations=observations,
        dynamic_artifacts=dynamic_artifacts,
    )

    findings.extend(composite_findings)

    return _dedupe_findings(findings)


def _dedupe_findings(findings: list[dict[str, Any]]) -> list[dict[str, Any]]:
    seen: set[str] = set()
    result: list[dict[str, Any]] = []

    for finding in findings:
        finding_id = finding.get("id")
        if not finding_id or finding_id in seen:
            continue
        seen.add(finding_id)
        result.append(finding)

    return result

def _filter_evidence_for_test(test_id, artifacts):
    return [
        {
            "id": f"{test_id}-evidence-{i}",
            "category": "artifact",
            "subtype": "dynamic_artifact",
            "kind": "artifact",
            "value": artifact,
            "source": "dynamic_pipeline",
        }
        for i, artifact in enumerate(artifacts)
        if f"/{test_id}/" in artifact
    ]