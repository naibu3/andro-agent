from __future__ import annotations

import json
from collections import defaultdict
from pathlib import Path

from andro_agent.models import (
    ApplyCodeRulesInput,
    ApplyCodeRulesOutput,
    Fact,
    Finding,
)


def _load_facts(facts_json_path: Path) -> list[Fact]:
    raw = json.loads(facts_json_path.read_text(encoding="utf-8"))
    return [Fact.model_validate(item) for item in raw]


def _group_by_type(facts: list[Fact]) -> dict[str, list[Fact]]:
    grouped: dict[str, list[Fact]] = defaultdict(list)
    for fact in facts:
        grouped[fact.type].append(fact)
    return dict(grouped)


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
            evidence=evidence,
            metadata=metadata or {},
            source="code_rule_engine",
        )
    )


def apply_code_rules(input_data: ApplyCodeRulesInput) -> ApplyCodeRulesOutput:
    path = input_data.facts_json_path

    if not path.exists():
        return ApplyCodeRulesOutput(
            success=False,
            errors=[f"Code facts JSON not found: {path}"],
        )

    try:
        facts = _load_facts(path)
    except Exception as exc:
        return ApplyCodeRulesOutput(
            success=False,
            errors=[f"Failed to load code facts JSON: {exc}"],
        )

    grouped = _group_by_type(facts)
    findings: list[Finding] = []

    for fact in grouped.get("code.pattern.webview_loadUrl", []):
        _add_finding(
            findings,
            rule_id="CODE_WEBVIEW_LOADURL",
            title="WebView loadUrl usage detected",
            description=f"Potential WebView URL loading sink found in {fact.key}. Review input origin and sanitization.",
            severity="medium",
            evidence=[fact.model_dump()],
        )

    for fact in grouped.get("code.pattern.webview_addJavascriptInterface", []):
        _add_finding(
            findings,
            rule_id="CODE_WEBVIEW_JS_BRIDGE",
            title="WebView JavaScript interface usage detected",
            description=f"JavaScript bridge usage found in {fact.key}. Review exposure to untrusted content.",
            severity="high",
            evidence=[fact.model_dump()],
        )

    for fact in grouped.get("code.pattern.sql_rawQuery", []):
        _add_finding(
            findings,
            rule_id="CODE_SQL_RAWQUERY",
            title="rawQuery usage detected",
            description=f"rawQuery found in {fact.key}. Review possible SQL injection or unsafe query construction.",
            severity="medium",
            evidence=[fact.model_dump()],
        )

    for fact in grouped.get("code.pattern.sql_execSQL", []):
        _add_finding(
            findings,
            rule_id="CODE_SQL_EXECSQL",
            title="execSQL usage detected",
            description=f"execSQL found in {fact.key}. Review unsafe SQL execution paths.",
            severity="medium",
            evidence=[fact.model_dump()],
        )

    for fact in grouped.get("code.pattern.hardcoded_http", []):
        _add_finding(
            findings,
            rule_id="CODE_HARDCODED_HTTP",
            title="Hardcoded HTTP URL detected",
            description=f"Cleartext HTTP URL found in {fact.key}. Review transport security and endpoint exposure.",
            severity="medium",
            evidence=[fact.model_dump()],
        )

    for fact in grouped.get("code.pattern.runtime_exec", []):
        _add_finding(
            findings,
            rule_id="CODE_RUNTIME_EXEC",
            title="Runtime command execution usage detected",
            description=f"Runtime.getRuntime().exec found in {fact.key}. Review for command execution risk.",
            severity="high",
            evidence=[fact.model_dump()],
        )

    for fact in grouped.get("code.pattern.sharedprefs_write", []):
        _add_finding(
            findings,
            rule_id="CODE_SHAREDPREFERENCES_USAGE",
            title="SharedPreferences usage detected",
            description=f"SharedPreferences access found in {fact.key}. Review storage of sensitive data.",
            severity="low",
            evidence=[fact.model_dump()],
        )

    for fact in grouped.get("code.pattern.file_output_stream", []):
        _add_finding(
            findings,
            rule_id="CODE_FILE_OUTPUT_STREAM",
            title="FileOutputStream usage detected",
            description=f"FileOutputStream usage found in {fact.key}. Review file output location and sensitivity.",
            severity="low",
            evidence=[fact.model_dump()],
        )

    for fact in grouped.get("code.pattern.base64_decode", []):
        _add_finding(
            findings,
            rule_id="CODE_BASE64_DECODE",
            title="Base64 decode usage detected",
            description=f"Base64 decoding found in {fact.key}. Review for encoded secrets, payloads, or obfuscation.",
            severity="low",
            evidence=[fact.model_dump()],
        )

    for fact in grouped.get("code.pattern.cipher_instance", []):
        _add_finding(
            findings,
            rule_id="CODE_CIPHER_USAGE",
            title="Cryptographic API usage detected",
            description=f"Cipher.getInstance found in {fact.key}. Review algorithm choice, mode, and key handling.",
            severity="low",
            evidence=[fact.model_dump()],
        )

    findings_dir = input_data.artifacts_dir / input_data.case_id / "findings"
    findings_dir.mkdir(parents=True, exist_ok=True)

    findings_path = findings_dir / "code_findings.json"
    findings_path.write_text(
        json.dumps([finding.model_dump() for finding in findings], indent=2, ensure_ascii=False),
        encoding="utf-8",
    )

    return ApplyCodeRulesOutput(
        success=True,
        findings_path=findings_path,
        findings=findings,
    )