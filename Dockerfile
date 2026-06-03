FROM python:3.11-slim

WORKDIR /app

ENV PYTHONUNBUFFERED=1 \
    ANDRO_AGENT_DATA_DIR=/app/data \
    ANDRO_AGENT_DB=/app/data/andro_agent.db \
    ANDRO_AGENT_UPLOADS_DIR=/app/data/uploads \
    ANDRO_AGENT_ARTIFACTS_DIR=/app/data/artifacts

RUN apt-get update && apt-get install -y --no-install-recommends \
    default-jre \
    unzip \
    wget \
    git \
    file \
    && rm -rf /var/lib/apt/lists/*

# Pin these versions for reproducibility.
ARG JADX_VERSION=1.5.1
ARG APKTOOL_VERSION=2.9.3

RUN wget -O /tmp/jadx.zip "https://github.com/skylot/jadx/releases/download/v${JADX_VERSION}/jadx-${JADX_VERSION}.zip" \
    && mkdir -p /opt/jadx \
    && unzip /tmp/jadx.zip -d /opt/jadx \
    && ln -s /opt/jadx/bin/jadx /usr/local/bin/jadx \
    && rm /tmp/jadx.zip

RUN wget -O /usr/local/bin/apktool.jar "https://bitbucket.org/iBotPeaches/apktool/downloads/apktool_${APKTOOL_VERSION}.jar" \
    && printf '#!/bin/sh\njava -jar /usr/local/bin/apktool.jar "$@"\n' > /usr/local/bin/apktool \
    && chmod +x /usr/local/bin/apktool

COPY pyproject.toml README.md ./
COPY src ./src

RUN pip install --no-cache-dir -e .

RUN mkdir -p /app/data/uploads /app/data/artifacts

EXPOSE 8000

CMD ["uvicorn", "andro_agent.web.app:app", "--host", "0.0.0.0", "--port", "8000"]
