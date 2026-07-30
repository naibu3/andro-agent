from __future__ import annotations

from dataclasses import dataclass
from enum import Enum

from andro_agent.core.config import settings


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

    def validate(self) -> None:
        if self.require_llm and not settings.openrouter_api_key:
            raise RuntimeError(
                "The llm analysis profile requires OPENROUTER_API_KEY configuration."
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


def is_static_llm_configured() -> bool:
    return bool(settings.openrouter_api_key)
