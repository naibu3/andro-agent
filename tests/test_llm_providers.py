from __future__ import annotations

import pytest

from andro_agent.core import llm


def test_openai_provider_uses_native_responses_model(monkeypatch):
    captured = {}

    def fake_openai_responses(**kwargs):
        captured.update(kwargs)
        return object()

    monkeypatch.setattr(llm, "OpenAIResponses", fake_openai_responses)
    monkeypatch.setattr(llm.settings, "openai_api_key", None)
    monkeypatch.setenv("OPENAI_API_KEY", "openai-test-secret")

    llm.build_llm_model(model_id="gpt-5.5", provider="openai")

    assert captured == {"id": "gpt-5.5", "api_key": "openai-test-secret"}


def test_openai_provider_does_not_use_openrouter_key(monkeypatch):
    monkeypatch.setattr(llm.settings, "openai_api_key", None)
    monkeypatch.setattr(llm.settings, "openrouter_api_key", "openrouter-only-secret")
    monkeypatch.delenv("OPENAI_API_KEY", raising=False)

    with pytest.raises(RuntimeError, match="Set OPENAI_API_KEY"):
        llm.build_llm_model(model_id="gpt-5.5", provider="openai")


def test_openai_provider_rejects_openrouter_style_model_prefix(monkeypatch):
    monkeypatch.setenv("OPENAI_API_KEY", "openai-test-secret")

    with pytest.raises(RuntimeError, match="OpenRouter-style model names"):
        llm.build_llm_model(model_id="openai/gpt-oss-20b", provider="openai")


@pytest.mark.parametrize(
    ("provider", "model", "env_name", "base_url"),
    [
        ("deepseek", "deepseek-v4-flash", "DEEPSEEK_API_KEY", "https://api.deepseek.com"),
        ("kimi", "kimi-k2.5", "MOONSHOT_API_KEY", "https://api.moonshot.ai/v1"),
    ],
)
def test_openai_compatible_native_provider_configuration(
    monkeypatch, provider, model, env_name, base_url
):
    captured = {}

    def fake_openai_chat(**kwargs):
        captured.update(kwargs)
        return object()

    monkeypatch.setattr(llm, "OpenAIChat", fake_openai_chat)
    monkeypatch.setattr(llm.settings, f"{provider}_api_key", None)
    if provider == "kimi":
        monkeypatch.setattr(llm.settings, "moonshot_api_key", None)
        monkeypatch.delenv("KIMI_API_KEY", raising=False)
    monkeypatch.setenv(env_name, f"{provider}-test-secret")

    llm.build_llm_model(model_id=model, provider=provider)

    expected = {
        "id": model,
        "api_key": f"{provider}-test-secret",
        "base_url": base_url,
    }
    if provider == "deepseek":
        expected["role_map"] = {
            "system": "system",
            "user": "user",
            "assistant": "assistant",
            "tool": "tool",
            "model": "assistant",
        }
    assert captured == expected


def test_kimi_accepts_kimi_api_key_fallback(monkeypatch):
    captured = {}
    monkeypatch.setattr(llm, "OpenAIChat", lambda **kwargs: captured.update(kwargs) or object())
    monkeypatch.setattr(llm.settings, "moonshot_api_key", None)
    monkeypatch.setattr(llm.settings, "kimi_api_key", None)
    monkeypatch.delenv("MOONSHOT_API_KEY", raising=False)
    monkeypatch.setenv("KIMI_API_KEY", "kimi-fallback-secret")

    llm.build_llm_model(model_id="kimi-k2.5", provider="kimi")

    assert captured["api_key"] == "kimi-fallback-secret"


@pytest.mark.parametrize(
    ("provider", "model", "setting_names", "env_names", "expected"),
    [
        ("deepseek", "deepseek-v4-flash", ("deepseek_api_key",), ("DEEPSEEK_API_KEY",), "DEEPSEEK_API_KEY"),
        (
            "kimi",
            "kimi-k2.5",
            ("moonshot_api_key", "kimi_api_key"),
            ("MOONSHOT_API_KEY", "KIMI_API_KEY"),
            "MOONSHOT_API_KEY or KIMI_API_KEY",
        ),
    ],
)
def test_native_providers_do_not_use_openrouter_key(
    monkeypatch, provider, model, setting_names, env_names, expected
):
    monkeypatch.setattr(llm.settings, "openrouter_api_key", "openrouter-only-secret")
    for name in setting_names:
        monkeypatch.setattr(llm.settings, name, None)
    for name in env_names:
        monkeypatch.delenv(name, raising=False)

    with pytest.raises(RuntimeError, match=expected):
        llm.build_llm_model(model_id=model, provider=provider)


def test_existing_openrouter_provider_still_routes_to_openrouter(monkeypatch):
    captured = {}

    def fake_openrouter(**kwargs):
        captured.update(kwargs)
        return object()

    monkeypatch.setattr(llm, "OpenRouter", fake_openrouter)
    monkeypatch.setattr(llm.settings, "openrouter_api_key", "router-test-secret")

    llm.build_llm_model(model_id="openrouter/free", provider="openrouter")

    assert captured == {"id": "openrouter/free", "api_key": "router-test-secret"}
