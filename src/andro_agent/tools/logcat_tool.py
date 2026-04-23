from __future__ import annotations

import subprocess
from pathlib import Path

from andro_agent.tools.android_sdk_tool import AndroidSDKTool


class LogcatTool:
    def __init__(self, sdk_root: str | None = None) -> None:
        sdk = AndroidSDKTool(sdk_root=sdk_root)
        self.sdk_root = sdk.sdk_root
        self.adb_bin = str(sdk.adb)

    def clear(self) -> None:
        subprocess.run(
            [self.adb_bin, "logcat", "-c"],
            check=False,
            capture_output=True,
            text=True,
        )

    def dump(self, output_path: Path) -> None:
        result = subprocess.run(
            [self.adb_bin, "logcat", "-d"],
            check=False,
            capture_output=True,
            text=True,
            timeout=30,
        )
        output_path.write_text(result.stdout, encoding="utf-8")