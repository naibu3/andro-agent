from __future__ import annotations

from dataclasses import dataclass, field
from enum import Enum

STATIC_INVESTIGATION_TOOLS = frozenset(
    {"get_findings", "get_evidence", "search_code", "open_source_context", "get_manifest_facts"}
)


class AgenticMode(str, Enum):
    NONE = "none"
    SINGLE = "single"
    PLANNER_EXECUTOR = "planner-executor"
    MULTI_PHASE = "multi-phase"


class AgenticBudgetPreset(str, Enum):
    CONSERVATIVE = "conservative"
    BALANCED = "balanced"
    DEEP = "deep"


BUDGET_PRESETS = {
    AgenticBudgetPreset.CONSERVATIVE: (3, 10, 5, 25, 5, 8_000),
    AgenticBudgetPreset.BALANCED: (5, 20, 10, 40, 10, 12_000),
    AgenticBudgetPreset.DEEP: (8, 40, 15, 60, 15, 20_000),
}
HARD_MAXIMUMS = (10, 50, 20, 100, 20, 25_000)


@dataclass(frozen=True)
class AgenticRuntimeConfig:
    mode: AgenticMode | str = AgenticMode.NONE
    budget_preset: AgenticBudgetPreset | str = AgenticBudgetPreset.BALANCED
    provider: str | None = None
    model: str | None = None
    enabled_tools: frozenset[str] = field(default_factory=lambda: STATIC_INVESTIGATION_TOOLS)
    max_questions: int | None = None
    max_tool_calls: int | None = None
    max_search_results: int | None = None
    max_context_lines: int | None = None
    max_candidates: int | None = None
    max_output_chars_per_tool: int | None = None

    def __post_init__(self) -> None:
        try:
            mode = self.mode if isinstance(self.mode, AgenticMode) else AgenticMode(self.mode)
        except ValueError as exc:
            raise ValueError(f"Unknown agentic mode: {self.mode}") from exc
        try:
            preset = (
                self.budget_preset
                if isinstance(self.budget_preset, AgenticBudgetPreset)
                else AgenticBudgetPreset(self.budget_preset)
            )
        except ValueError as exc:
            raise ValueError(f"Unknown agentic budget preset: {self.budget_preset}") from exc
        tools = frozenset(self.enabled_tools)
        unknown = tools - STATIC_INVESTIGATION_TOOLS
        if unknown:
            raise ValueError(f"Unsupported static investigation tools: {sorted(unknown)}")

        names = (
            "max_questions",
            "max_tool_calls",
            "max_search_results",
            "max_context_lines",
            "max_candidates",
            "max_output_chars_per_tool",
        )
        defaults = BUDGET_PRESETS[preset]
        for name, default, hard_maximum in zip(names, defaults, HARD_MAXIMUMS, strict=True):
            value = getattr(self, name)
            value = default if value is None else value
            if not isinstance(value, int) or isinstance(value, bool) or value <= 0:
                raise ValueError(f"{name} must be a positive integer")
            if value > hard_maximum:
                raise ValueError(f"{name} exceeds the hard maximum of {hard_maximum}")
            object.__setattr__(self, name, value)

        object.__setattr__(self, "mode", mode)
        object.__setattr__(self, "budget_preset", preset)
        object.__setattr__(self, "enabled_tools", tools)

    @property
    def strategy_runtime(self) -> str:
        if self.mode is AgenticMode.NONE:
            return "none"
        if self.mode is AgenticMode.SINGLE:
            return "single"
        return "single_agent_fallback"
