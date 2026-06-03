from __future__ import annotations

from pathlib import Path

from fastapi import FastAPI
from fastapi.staticfiles import StaticFiles

from andro_agent.web.db import init_db
from andro_agent.web.routes import api_scans, pages
from andro_agent.web.settings import ensure_runtime_dirs


BASE_DIR = Path(__file__).resolve().parent


def create_app() -> FastAPI:
    ensure_runtime_dirs()
    init_db()

    app = FastAPI(
        title="Andro-Agent Web",
        description="MobSF-style web console for APK analysis with andro-agent.",
        version="0.1.0",
    )

    app.mount("/static", StaticFiles(directory=str(BASE_DIR / "static")), name="static")
    app.include_router(pages.router)
    app.include_router(api_scans.router)

    return app


app = create_app()
