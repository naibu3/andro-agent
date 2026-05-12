from __future__ import annotations

import os
import shutil
import socket
import subprocess
import time
from pathlib import Path


class MitmproxyTool:
    def __init__(self, mitmdump_bin: str | None = None) -> None:
        self.mitmdump_bin = self._resolve_mitmdump(mitmdump_bin)
        self.process: subprocess.Popen[str] | None = None
        self.listen_host = "127.0.0.1"
        self.listen_port: int | None = None

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
        flows_path: Path,
        event_log_path: Path,
        listen_host: str = "127.0.0.1",
        listen_port: int | None = None,
    ) -> str:
        if self.process:
            self.stop()

        if listen_port is None:
            listen_port = self._find_free_port(listen_host)

        self.listen_host = listen_host
        self.listen_port = listen_port

        flows_path.parent.mkdir(parents=True, exist_ok=True)
        event_log_path.parent.mkdir(parents=True, exist_ok=True)

        cmd = [
            self.mitmdump_bin,
            "--mode",
            f"regular@{listen_port}",
            "--listen-host",
            listen_host,
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

        if self.process.poll() is not None:
            raise RuntimeError(
                f"mitmdump failed to start. See log: {event_log_path}"
            )

        return f"http://{listen_host}:{listen_port}"

    def stop(self) -> None:
        if not self.process:
            return

        self.process.terminate()
        try:
            self.process.wait(timeout=10)
        except subprocess.TimeoutExpired:
            self.process.kill()
            self.process.wait(timeout=5)
        finally:
            self.process = None

    def _find_free_port(self, listen_host: str) -> int:
        with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as sock:
            sock.bind((listen_host, 0))
            return int(sock.getsockname()[1])