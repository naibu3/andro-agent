#!/bin/bash

mkdir -p ~/android-agent-mvp
cd ~/android-agent-mvp
mkdir -p src output samples

python3 -m venv .venv
source .venv/bin/activate
python -m pip install --upgrade pip
pip install -U agno python-dotenv pydantic rich openai

# nano .env
# OPENROUTER_API_KEY=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
# OPENROUTER_MODEL=openai/gpt-4o-mini