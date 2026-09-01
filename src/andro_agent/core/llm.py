from __future__ import annotations

import os
import re
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
        kwargs = {
            "id": selected_model_id,
            "api_key": api_key,
            "base_url": provider_config["base_url"],
        }
        if selected_provider == "deepseek":
            # Agno uses OpenAI's newer `developer` role for instructions, while
            # DeepSeek's chat endpoint currently accepts `system` instead.
            kwargs["role_map"] = {
                "system": "system",
                "user": "user",
                "assistant": "assistant",
                "tool": "tool",
                "model": "assistant",
            }
        return OpenAIChat(**kwargs)

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


def sanitize_provider_text(value: Any) -> str:
    """Return a bounded provider message with credentials removed."""
    text = str(value or "").strip()
    for config in OPENAI_COMPATIBLE_PROVIDERS.values():
        secret = _first_configured_secret(
            settings_names=config["settings_names"], env_names=config["env_names"]
        )
        if secret:
            text = text.replace(secret, "[redacted-api-key]")
    for secret in (settings.openrouter_api_key, settings.openai_api_key, os.getenv("OPENAI_API_KEY")):
        if secret:
            text = text.replace(secret, "[redacted-api-key]")
    text = re.sub(r"(?i)\bBearer\s+\S+", "Bearer [redacted]", text)
    text = re.sub(
        r"(?i)(authorization|api[_ -]?key)(\s*[:=]\s*)[^\s,;}\]]+",
        r"\1\2[redacted]",
        text,
    )
    return " ".join(text.split())[:500]


def provider_error_diagnostic(
    error: Any, *, provider: str | None, model: str | None
) -> dict[str, Any]:
    """Extract a safe, stable diagnostic from an exception or Agno error response."""
    status_code = getattr(error, "status_code", None) or getattr(error, "http_status", None)
    code = getattr(error, "code", None) or getattr(error, "error_code", None)
    message = getattr(error, "message", None) or str(error or "")
    response = getattr(error, "response", None)
    if response is not None:
        status_code = status_code or getattr(response, "status_code", None)
        try:
            payload = response.json()
        except Exception:  # noqa: BLE001 - third-party response shapes vary
            payload = None
        if isinstance(payload, dict):
            detail = payload.get("error", payload)
            if isinstance(detail, dict):
                code = code or detail.get("code") or detail.get("type")
                message = detail.get("message") or message
    safe_message = sanitize_provider_text(message)
    haystack = f"{code or ''} {safe_message}".lower().replace("-", "_")
    if status_code == 401 or any(x in haystack for x in ("authentication", "invalid_api_key", "unauthorized")):
        category = "authentication"
    elif status_code == 402 or any(x in haystack for x in ("insufficient_quota", "insufficient balance", "billing", "quota")):
        category = "quota_billing"
    elif status_code == 429 or "rate_limit" in haystack or "rate limit" in haystack:
        category = "rate_limit"
    elif any(x in haystack for x in ("model_not_found", "unsupported_model", "unsupported model", "invalid_model", "invalid model")):
        category = "model_not_found"
    elif "timeout" in haystack or "timed out" in haystack:
        category = "timeout"
    elif any(x in haystack for x in ("connection", "network", "dns")):
        category = "connection_error"
    elif status_code == 400:
        category = "bad_request"
    else:
        category = "unknown"
    return {
        "provider": normalize_llm_provider(provider),
        "model": model,
        "exception_class": error.__class__.__name__,
        "http_status_code": status_code,
        "provider_error_code": sanitize_provider_text(code) or None,
        "provider_error_message": safe_message or None,
        "category": category,
    }


def format_provider_error(diagnostic: dict[str, Any]) -> str:
    provider = str(diagnostic.get("provider") or "llm")
    name = {"deepseek": "DeepSeek", "openai": "OpenAI", "openrouter": "OpenRouter"}.get(
        provider, provider.title()
    )
    model = diagnostic.get("model")
    category = diagnostic.get("category")
    if category == "authentication":
        env_name = {"DeepSeek": "DEEPSEEK_API_KEY", "OpenAI": "OPENAI_API_KEY"}.get(
            name, f"{provider.upper()}_API_KEY"
        )
        return f"{name} provider error: authentication failed. Check {env_name}."
    if category == "quota_billing":
        return f"{name} provider error: insufficient balance or quota."
    if category == "rate_limit":
        return f"{name} provider error: rate limit exceeded."
    if category == "model_not_found":
        code = diagnostic.get("provider_error_code") or "model_not_found"
        return f"{name} provider error: {code} for model {model}."
    if category == "timeout":
        return f"{name} provider error: request timed out."
    if category == "connection_error":
        return f"{name} provider error: connection failed."
    status = diagnostic.get("http_status_code")
    message = diagnostic.get("provider_error_message") or "unknown provider error"
    prefix = f"HTTP {status}: " if status else ""
    return f"{name} provider error: {prefix}{message}"
