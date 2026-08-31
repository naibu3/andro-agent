from __future__ import annotations

import os
from typing import Any

from agno.models.ollama import Ollama
from agno.models.openai import OpenAIChat, OpenAIResponses
from agno.models.openrouter import OpenRouter

from andro_agent.core.config import settings


SUPPORTED_LLM_PROVIDERS = {"deepseek", "kimi", "openai", "openrouter", "ollama"}

OPENAI_COMPATIBLE_PROVIDERS = {
    "deepseek": {
        "base_url": "https://api.deepseek.com",
        "env_names": ("DEEPSEEK_API_KEY",),
        "settings_names": ("deepseek_api_key",),
    },
    "kimi": {
        "base_url": "https://api.moonshot.ai/v1",
        "env_names": ("MOONSHOT_API_KEY", "KIMI_API_KEY"),
        "settings_names": ("moonshot_api_key", "kimi_api_key"),
    },
}


def _first_configured_secret(*, settings_names: tuple[str, ...], env_names: tuple[str, ...]) -> str | None:
    for name in settings_names:
        value = getattr(settings, name, None)
        if value:
            return value
    for name in env_names:
        value = os.getenv(name)
        if value:
            return value
    return None


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

    if selected_provider == "openai":
        selected = model_id or settings.openai_model_id
        if "/" in selected:
            raise RuntimeError(
                "OpenRouter-style model names are not valid for provider=openai. "
                "Use --llm-provider openrouter for openai/... models, or pass a "
                "native OpenAI model name."
            )
        return selected

    if selected_provider == "deepseek":
        return model_id or settings.deepseek_model_id

    if selected_provider == "kimi":
        return model_id or settings.kimi_model_id

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

    if selected_provider == "openai":
        api_key = settings.openai_api_key or os.getenv("OPENAI_API_KEY")
        if not api_key:
            raise RuntimeError("OpenAI API key is not configured. Set OPENAI_API_KEY.")
        return OpenAIResponses(id=selected_model_id, api_key=api_key)

    if selected_provider in OPENAI_COMPATIBLE_PROVIDERS:
        provider_config = OPENAI_COMPATIBLE_PROVIDERS[selected_provider]
        api_key = _first_configured_secret(
            settings_names=provider_config["settings_names"],
            env_names=provider_config["env_names"],
        )
        if not api_key:
            env_hint = " or ".join(provider_config["env_names"])
            raise RuntimeError(
                f"{selected_provider.title()} API key is not configured. Set {env_hint}."
            )
        return OpenAIChat(
            id=selected_model_id,
            api_key=api_key,
            base_url=provider_config["base_url"],
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


def is_llm_provider_configured(provider: str | None = None) -> bool:
    selected_provider = normalize_llm_provider(provider)
    if selected_provider == "openrouter":
        return bool(settings.openrouter_api_key)
    if selected_provider == "openai":
        return bool(settings.openai_api_key or os.getenv("OPENAI_API_KEY"))
    if selected_provider in OPENAI_COMPATIBLE_PROVIDERS:
        provider_config = OPENAI_COMPATIBLE_PROVIDERS[selected_provider]
        return bool(
            _first_configured_secret(
                settings_names=provider_config["settings_names"],
                env_names=provider_config["env_names"],
            )
        )
    return selected_provider == "ollama"


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
