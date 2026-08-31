from __future__ import annotations

from pydantic_settings import BaseSettings, SettingsConfigDict


class Settings(BaseSettings):
    # LLM provider selector: "openrouter", "openai", "deepseek", "kimi", or "ollama".
    llm_provider: str = "openrouter"

    # Cloud provider: OpenRouter.
    openrouter_api_key: str | None = None
    openrouter_model_id: str = "openai/gpt-oss-20b"

    # Native OpenAI provider.
    openai_api_key: str | None = None
    openai_model_id: str = "gpt-5.5"

    # Native OpenAI-compatible providers.
    deepseek_api_key: str | None = None
    deepseek_model_id: str = "deepseek-v4-flash"
    moonshot_api_key: str | None = None
    kimi_api_key: str | None = None
    kimi_model_id: str = "kimi-k2.5"

    # Local provider: Ollama.
    ollama_host: str = "http://127.0.0.1:11434"
    ollama_model_id: str = "qwen2.5-coder:7b"
    ollama_timeout: int = 120
    ollama_temperature: float = 0.1

    model_config = SettingsConfigDict(
        env_file=".env",
        env_file_encoding="utf-8",
        extra="ignore",
    )


settings = Settings()
