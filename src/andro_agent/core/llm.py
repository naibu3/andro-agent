from __future__ import annotations

from typing import Any

from agno.models.ollama import Ollama
from agno.models.openrouter import OpenRouter

from andro_agent.core.config import settings


SUPPORTED_LLM_PROVIDERS = {"openrouter", "ollama"}


def normalize_llm_provider(provider: str | None = None) -> str:
    selected = (provider or settings.llm_provider or "openrouter").strip().lower()

    if selected not in SUPPORTED_LLM_PROVIDERS:
        raise RuntimeError(
            f"Unsupported LLM provider: {selected!r}. "
            f"Supported providers: {', '.join(sorted(SUPPORTED_LLM_PROVIDERS))}"
        )

    return selected


def resolve_llm_model_id(
    model_id: str | None = None,
    provider: str | None = None,
) -> str:
    selected_provider = normalize_llm_provider(provider)

    if selected_provider == "openrouter":
        return model_id or settings.openrouter_model_id

    if selected_provider == "ollama":
        return model_id or settings.ollama_model_id

    raise RuntimeError(f"Unhandled LLM provider: {selected_provider!r}")


def build_llm_model(
    model_id: str | None = None,
    provider: str | None = None,
) -> Any:
    selected_provider = normalize_llm_provider(provider)
    selected_model_id = resolve_llm_model_id(
        model_id=model_id,
        provider=selected_provider,
    )

    if selected_provider == "openrouter":
        if not settings.openrouter_api_key:
            raise RuntimeError(
                "OPENROUTER_API_KEY not configured. "
                "Set it in .env or use LLM_PROVIDER=ollama."
            )

        return OpenRouter(
            id=selected_model_id,
            api_key=settings.openrouter_api_key,
        )

    if selected_provider == "ollama":
        return Ollama(
            id=selected_model_id,
            host=settings.ollama_host,
            timeout=settings.ollama_timeout,
            format="json",
            options={
                "temperature": settings.ollama_temperature,
            },
        )

    raise RuntimeError(f"Unhandled LLM provider: {selected_provider!r}")


def get_llm_metadata(
    model_id: str | None = None,
    provider: str | None = None,
) -> dict[str, str]:
    selected_provider = normalize_llm_provider(provider)
    selected_model_id = resolve_llm_model_id(
        model_id=model_id,
        provider=selected_provider,
    )

    return {
        "provider": selected_provider,
        "model": selected_model_id,
    }