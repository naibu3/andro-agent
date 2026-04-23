from __future__ import annotations

import json
import re
from pathlib import Path
from typing import Any


COMMON_PROVIDER_PATHS = [
    "users",
    "user",
    "items",
    "item",
    "data",
    "records",
    "record",
    "pins",
    "pin",
    "userpins",
    "notes",
    "note",
    "settings",
    "config",
    "profile",
    "profiles",
]


def build_provider_candidate_uris_from_bundle(bundle_path: Path) -> dict[str, list[str]]:
    if not bundle_path.exists():
        return {}

    try:
        bundle = json.loads(bundle_path.read_text(encoding="utf-8"))
    except Exception:
        return {}

    manifest = bundle.get("manifest") or {}
    code_search_results = bundle.get("code_search_results") or {}
    code_facts = bundle.get("code_facts") or []

    authorities = _extract_provider_authorities(manifest)
    tokens = set(COMMON_PROVIDER_PATHS)

    tokens.update(_extract_tokens_from_code_search_results(code_search_results))
    tokens.update(_extract_tokens_from_code_facts(code_facts))
    tokens = {token for token in tokens if _is_reasonable_path_token(token)}

    result: dict[str, list[str]] = {}

    for authority in authorities:
        candidates = [f"content://{authority}"]
        for token in sorted(tokens):
            candidates.append(f"content://{authority}/{token}")
        result[authority] = _dedupe_preserve_order(candidates)

    return result


def _extract_provider_authorities(manifest: dict[str, Any]) -> list[str]:
    providers = manifest.get("providers") or []
    result: list[str] = []

    for provider in providers:
        authorities = provider.get("authorities")
        if not authorities:
            continue

        for authority in str(authorities).split(";"):
            authority = authority.strip()
            if authority:
                result.append(authority)

    return _dedupe_preserve_order(result)


def _extract_tokens_from_code_search_results(code_search_results: Any) -> set[str]:
    tokens: set[str] = set()

    if isinstance(code_search_results, dict):
        values = code_search_results.values()
    elif isinstance(code_search_results, list):
        values = code_search_results
    else:
        values = []

    for value in values:
        text = json.dumps(value, ensure_ascii=False) if not isinstance(value, str) else value
        tokens.update(_extract_providerish_tokens(text))

    return tokens


def _extract_tokens_from_code_facts(code_facts: list[dict[str, Any]]) -> set[str]:
    tokens: set[str] = set()

    for fact in code_facts:
        fact_type = str(fact.get("type", ""))
        value = fact.get("value")
        if "provider" in fact_type.lower() or "content://" in str(value).lower():
            text = json.dumps(fact, ensure_ascii=False)
            tokens.update(_extract_providerish_tokens(text))

    return tokens


def _extract_providerish_tokens(text: str) -> set[str]:
    tokens: set[str] = set()

    # content://authority/path
    for match in re.findall(r"content://[A-Za-z0-9._-]+/([A-Za-z0-9_-]+)", text):
        tokens.add(match.lower())

    # UriMatcher.addURI(..., "users", ...)
    for match in re.findall(r'addURI\s*\([^,]+,\s*"([^"]+)"', text):
        token = match.strip().split("/")[0]
        if token and token != "*":
            tokens.add(token.lower())

    # Strings sueltas útiles
    for match in re.findall(r'"([A-Za-z][A-Za-z0-9_-]{2,30})"', text):
        lowered = match.lower()
        if lowered in COMMON_PROVIDER_PATHS or "pin" in lowered or "user" in lowered:
            tokens.add(lowered)

    return tokens


def _is_reasonable_path_token(token: str) -> bool:
    if not token or len(token) > 40:
        return False
    if "/" in token or ":" in token or "." in token:
        return False
    return re.fullmatch(r"[a-zA-Z0-9_-]+", token) is not None


def _dedupe_preserve_order(values: list[str]) -> list[str]:
    seen: set[str] = set()
    result: list[str] = []

    for value in values:
        if value in seen:
            continue
        seen.add(value)
        result.append(value)

    return result