from __future__ import annotations

import json

from andro_agent.models import (
    BuildCodeSearchFactsInput,
    BuildCodeSearchFactsOutput,
    CodeSearchMatch,
    Fact,
)


def _add_fact(facts: list[Fact], fact_type: str, key: str, value, metadata: dict | None = None) -> None:
    facts.append(
        Fact(
            type=fact_type,
            key=key,
            value=value,
            source="code_search",
            metadata=metadata or {},
        )
    )


def build_code_search_facts(input_data: BuildCodeSearchFactsInput) -> BuildCodeSearchFactsOutput:
    path = input_data.code_search_results_path

    if not path.exists():
        return BuildCodeSearchFactsOutput(
            success=False,
            errors=[f"Code search results not found: {path}"],
        )

    try:
        raw = json.loads(path.read_text(encoding="utf-8"))
        matches = [CodeSearchMatch.model_validate(item) for item in raw]
    except Exception as exc:
        return BuildCodeSearchFactsOutput(
            success=False,
            errors=[f"Failed to load code search results: {exc}"],
        )

    facts: list[Fact] = []

    for match in matches:
        file_key = match.file_path

        _add_fact(
            facts,
            fact_type=f"code.pattern.{match.pattern_name}",
            key=file_key,
            value=True,
            metadata={
                "category": match.category,
                "line_number": match.line_number,
                "line_text": match.line_text,
            },
        )

        _add_fact(
            facts,
            fact_type=f"code.category.{match.category}",
            key=file_key,
            value=match.pattern_name,
            metadata={
                "line_number": match.line_number,
                "line_text": match.line_text,
            },
        )

    facts_dir = input_data.artifacts_dir / input_data.case_id / "facts"
    facts_dir.mkdir(parents=True, exist_ok=True)

    facts_path = facts_dir / "code_search_facts.json"
    facts_path.write_text(
        json.dumps([fact.model_dump() for fact in facts], indent=2, ensure_ascii=False),
        encoding="utf-8",
    )

    return BuildCodeSearchFactsOutput(
        success=True,
        facts_path=facts_path,
        facts=facts,
    )