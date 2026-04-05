from __future__ import annotations

import json
from pathlib import Path

from andro_agent.models import (
    ApplyCorrelationRulesInput,
    ApplyCorrelationRulesOutput,
    Fact,
    Finding,
)


def _load_json(path: Path) -> list[dict]:
    return json.loads(path.read_text(encoding="utf-8"))


def _normalize_component_name(name: str) -> str:
    if not name:
        return ""
    name = name.split(".")[-1]
    return name.lower()


def _normalize_file_name(path: str) -> str:
    name = Path(path).stem
    return name.lower()


def _add_finding(
    findings: list[Finding],
    rule_id: str,
    title: str,
    description: str,
    severity: str,
    evidence: list[dict],
    metadata: dict | None = None,
) -> None:
    findings.append(
        Finding(
            rule_id=rule_id,
            title=title,
            description=description,
            severity=severity,
            confidence="medium",
            source="correlation_engine",
            evidence=evidence,
            metadata=metadata or {},
        )
    )


def apply_manifest_code_correlation(
    input_data: ApplyCorrelationRulesInput,
) -> ApplyCorrelationRulesOutput:
    case_dir = input_data.artifacts_dir / input_data.case_id

    manifest_facts_path = case_dir / "facts" / "manifest_facts.json"
    code_facts_path = case_dir / "facts" / "code_search_facts.json"
    manifest_findings_path = case_dir / "findings" / "manifest_findings.json"
    code_findings_path = case_dir / "findings" / "code_findings.json"

    missing = [
        str(path)
        for path in [
            manifest_facts_path,
            code_facts_path,
            manifest_findings_path,
            code_findings_path,
        ]
        if not path.exists()
    ]
    if missing:
        return ApplyCorrelationRulesOutput(
            success=False,
            errors=[f"Missing required files: {', '.join(missing)}"],
        )

    manifest_facts = [Fact.model_validate(x) for x in _load_json(manifest_facts_path)]
    code_facts = [Fact.model_validate(x) for x in _load_json(code_facts_path)]
    manifest_findings = _load_json(manifest_findings_path)
    code_findings = _load_json(code_findings_path)

    findings: list[Finding] = []

    exported_components: list[Fact] = [
        fact
        for fact in manifest_facts
        if fact.type.startswith("manifest.component.")
        and fact.type.endswith(".exported")
        and fact.value is True
    ]

    code_patterns = [
        fact for fact in code_facts if fact.type.startswith("code.pattern.")
    ]

    # Correlation by component/class name similarity
    for component in exported_components:
        component_name = _normalize_component_name(component.key)

        related_code_patterns = []
        for code_fact in code_patterns:
            file_name = _normalize_file_name(code_fact.key)
            if component_name and component_name in file_name:
                related_code_patterns.append(code_fact)

        if not related_code_patterns:
            continue

        pattern_names = {fact.type for fact in related_code_patterns}

        if "code.pattern.webview_loadUrl" in pattern_names:
            _add_finding(
                findings,
                rule_id="CORRELATED_EXPORTED_COMPONENT_WEBVIEW",
                title="Exported component with WebView URL loading behavior",
                description=(
                    f"The exported component '{component.key}' appears correlated with code "
                    "using WebView.loadUrl(), which may increase reachable attack surface."
                ),
                severity="high",
                evidence=[component.model_dump()] + [f.model_dump() for f in related_code_patterns],
                metadata={"component_name": component.key},
            )

        if "code.pattern.webview_addJavascriptInterface" in pattern_names:
            _add_finding(
                findings,
                rule_id="CORRELATED_EXPORTED_COMPONENT_JS_BRIDGE",
                title="Exported component with JavaScript bridge behavior",
                description=(
                    f"The exported component '{component.key}' appears correlated with code "
                    "using addJavascriptInterface(), which may expose a risky WebView bridge."
                ),
                severity="high",
                evidence=[component.model_dump()] + [f.model_dump() for f in related_code_patterns],
                metadata={"component_name": component.key},
            )

        if (
            "code.pattern.sql_rawQuery" in pattern_names
            or "code.pattern.sql_execSQL" in pattern_names
        ):
            _add_finding(
                findings,
                rule_id="CORRELATED_EXPORTED_COMPONENT_SQL",
                title="Exported component with SQL-related code",
                description=(
                    f"The exported component '{component.key}' appears correlated with SQL query "
                    "usage, which should be reviewed for externally reachable unsafe paths."
                ),
                severity="high",
                evidence=[component.model_dump()] + [f.model_dump() for f in related_code_patterns],
                metadata={"component_name": component.key},
            )

        if (
            "code.pattern.file_output_stream" in pattern_names
            or "code.pattern.sharedprefs_write" in pattern_names
        ):
            _add_finding(
                findings,
                rule_id="CORRELATED_EXPORTED_COMPONENT_STORAGE",
                title="Exported component with storage-related code",
                description=(
                    f"The exported component '{component.key}' appears correlated with local "
                    "storage operations. Review for data leakage or tampering opportunities."
                ),
                severity="medium",
                evidence=[component.model_dump()] + [f.model_dump() for f in related_code_patterns],
                metadata={"component_name": component.key},
            )

    # Global manifest + code correlations
    has_debuggable = any(
        fact.type == "manifest.application.debuggable" and fact.value is True
        for fact in manifest_facts
    )
    has_allow_backup = any(
        fact.type == "manifest.application.allow_backup" and fact.value is True
        for fact in manifest_facts
    )
    has_http = any(fact.type == "code.pattern.hardcoded_http" for fact in code_facts)

    if has_debuggable and has_http:
        evidence = [
            fact.model_dump()
            for fact in manifest_facts + code_facts
            if (
                (fact.type == "manifest.application.debuggable" and fact.value is True)
                or fact.type == "code.pattern.hardcoded_http"
            )
        ]
        _add_finding(
            findings,
            rule_id="CORRELATED_DEBUGGABLE_HTTP",
            title="Debuggable app with hardcoded HTTP endpoints",
            description=(
                "The application is debuggable and also contains hardcoded HTTP URLs, "
                "which may increase exposure during testing or abuse scenarios."
            ),
            severity="medium",
            evidence=evidence,
        )

    if has_allow_backup and any(
        fact.type in {"code.pattern.sharedprefs_write", "code.pattern.file_output_stream"}
        for fact in code_facts
    ):
        evidence = [
            fact.model_dump()
            for fact in manifest_facts + code_facts
            if (
                (fact.type == "manifest.application.allow_backup" and fact.value is True)
                or fact.type in {"code.pattern.sharedprefs_write", "code.pattern.file_output_stream"}
            )
        ]
        _add_finding(
            findings,
            rule_id="CORRELATED_BACKUP_STORAGE",
            title="Backups enabled with local storage usage",
            description=(
                "The application allows backups and uses local storage APIs, which may "
                "increase the risk of sensitive data exposure through backup extraction."
            ),
            severity="medium",
            evidence=evidence,
        )

    findings_dir = case_dir / "findings"
    findings_dir.mkdir(parents=True, exist_ok=True)

    findings_path = findings_dir / "correlated_findings.json"
    findings_path.write_text(
        json.dumps([f.model_dump() for f in findings], indent=2, ensure_ascii=False),
        encoding="utf-8",
    )

    return ApplyCorrelationRulesOutput(
        success=True,
        findings_path=findings_path,
        findings=findings,
    )