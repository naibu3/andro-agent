from __future__ import annotations

from dataclasses import dataclass
from enum import Enum

from andro_agent.core.llm import is_llm_provider_configured, normalize_llm_provider


class AnalysisProfile(str, Enum):
    NO_LLM = "no-llm"
    FAST = "fast"
    FULL = "full"
    LLM = "llm"


@dataclass(frozen=True)
class AnalysisProfileConfig:
    profile: AnalysisProfile
    use_llm_reasoning: bool
    use_llm_report: bool
    compact_llm_report: bool = False
    require_llm: bool = False

    def validate(self, provider: str | None = None) -> None:
        if self.require_llm and not is_llm_provider_configured(provider):
            selected = normalize_llm_provider(provider)
            raise RuntimeError(
                f"The llm analysis profile requires configuration for provider {selected!r}."
            )


PROFILE_CONFIGS = {
    AnalysisProfile.NO_LLM: AnalysisProfileConfig(
        profile=AnalysisProfile.NO_LLM,
        use_llm_reasoning=False,
        use_llm_report=False,
    ),
    AnalysisProfile.FAST: AnalysisProfileConfig(
        profile=AnalysisProfile.FAST,
        use_llm_reasoning=False,
        use_llm_report=True,
        compact_llm_report=True,
    ),
    AnalysisProfile.FULL: AnalysisProfileConfig(
        profile=AnalysisProfile.FULL,
        use_llm_reasoning=True,
        use_llm_report=True,
    ),
    AnalysisProfile.LLM: AnalysisProfileConfig(
        profile=AnalysisProfile.LLM,
        use_llm_reasoning=True,
        use_llm_report=True,
        require_llm=True,
    ),
}


def get_analysis_profile_config(
    profile: AnalysisProfile | str = AnalysisProfile.FULL,
) -> AnalysisProfileConfig:
    selected = profile if isinstance(profile, AnalysisProfile) else AnalysisProfile(profile)
    return PROFILE_CONFIGS[selected]


def is_static_llm_configured(provider: str | None = None) -> bool:
    return is_llm_provider_configured(provider)
