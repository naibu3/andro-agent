from __future__ import annotations

import json
import os
import shutil
import subprocess
import time
from pathlib import Path


class MitmproxyTool:
    def __init__(self, mitmdump_bin: str | None = None) -> None:
        self.mitmdump_bin = self._resolve_mitmdump(mitmdump_bin)
        self.process: subprocess.Popen[str] | None = None

    def _resolve_mitmdump(self, mitmdump_bin: str | None) -> str:
        candidates: list[str] = []

        if mitmdump_bin:
            candidates.append(mitmdump_bin)

        env_value = os.environ.get("MITMDUMP_PATH")
        if env_value:
            candidates.append(env_value)

        which_value = shutil.which("mitmdump")
        if which_value:
            candidates.append(which_value)

        for candidate in candidates:
            if candidate and Path(candidate).exists():
                return candidate

        raise FileNotFoundError(
            "Could not find mitmdump. Install mitmproxy or set MITMDUMP_PATH."
        )

    def start(
        self,
        listen_host: str,
        listen_port: int,
        flows_path: Path,
        event_log_path: Path,
    ) -> None:
        flows_path.parent.mkdir(parents=True, exist_ok=True)
        event_log_path.parent.mkdir(parents=True, exist_ok=True)

        cmd = [
            self.mitmdump_bin,
            "--mode",
            "regular",
            "--listen-host",
            listen_host,
            "--listen-port",
            str(listen_port),
            "--set",
            f"save_stream_file={flows_path}",
            "--set",
            "termlog_verbosity=info",
        ]

        log_handle = event_log_path.open("w", encoding="utf-8")
        self.process = subprocess.Popen(
            cmd,
            stdout=log_handle,
            stderr=subprocess.STDOUT,
            text=True,
        )
        time.sleep(2)

    def stop(self) -> None:
        if not self.process:
            return

        self.process.terminate()
        try:
            self.process.wait(timeout=10)
        except subprocess.TimeoutExpired:
            self.process.kill()
            self.process.wait(timeout=5)

    def export_flows_json(self, flows_path: Path, output_json_path: Path) -> subprocess.CompletedProcess[str]:
        cmd = [
            self.mitmdump_bin,
            "-nr",
            str(flows_path),
            "--set",
            "termlog_verbosity=error",
            "-w",
            str(output_json_path),
        ]
        return subprocess.run(
            cmd,
            check=False,
            capture_output=True,
            text=True,
            timeout=120,
        )