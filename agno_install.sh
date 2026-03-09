#!/bin/bash

mkdir -p ~/android-agent-mvp
cd ~/android-agent-mvp
mkdir -p src output samples

python3 -m venv .venv
source .venv/bin/activate
python -m pip install --upgrade pip
pip install -U agno python-dotenv pydantic rich openai