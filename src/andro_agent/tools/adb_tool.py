from __future__ import annotations

import subprocess
from pathlib import Path

from andro_agent.tools.android_sdk_tool import AndroidSDKTool


class ADBTool:
    def __init__(self, sdk_root: str | None = None) -> None:
        sdk = AndroidSDKTool(sdk_root=sdk_root)
        self.sdk_root = sdk.sdk_root
        self.adb_bin = str(sdk.adb)

    def install_apk(self, apk_path: Path) -> subprocess.CompletedProcess[str]:
        return subprocess.run(
            [self.adb_bin, "install", "-r", str(apk_path)],
            check=False,
            capture_output=True,
            text=True,
            timeout=180,
        )

    def launch_app(self, package_name: str) -> subprocess.CompletedProcess[str]:
        return subprocess.run(
            [
                self.adb_bin,
                "shell",
                "monkey",
                "-p",
                package_name,
                "-c",
                "android.intent.category.LAUNCHER",
                "1",
            ],
            check=False,
            capture_output=True,
            text=True,
            timeout=30,
        )

    def launch_activity(self, component: str) -> subprocess.CompletedProcess[str]:
        return subprocess.run(
            [self.adb_bin, "shell", "am", "start", "-n", component],
            check=False,
            capture_output=True,
            text=True,
            timeout=30,
        )

    def open_deeplink(self, url: str) -> subprocess.CompletedProcess[str]:
        return subprocess.run(
            [
                self.adb_bin,
                "shell",
                "am",
                "start",
                "-a",
                "android.intent.action.VIEW",
                "-d",
                url,
            ],
            check=False,
            capture_output=True,
            text=True,
            timeout=30,
        )

    def query_content_provider(self, uri: str) -> subprocess.CompletedProcess[str]:
        return subprocess.run(
            [self.adb_bin, "shell", "content", "query", "--uri", uri],
            check=False,
            capture_output=True,
            text=True,
            timeout=30,
        )

    def screenshot(self, output_path: Path) -> None:
        remote = "/sdcard/__andro_agent_screen.png"
        subprocess.run(
            [self.adb_bin, "shell", "screencap", "-p", remote],
            check=False,
            capture_output=True,
            text=True,
        )
        subprocess.run(
            [self.adb_bin, "pull", remote, str(output_path)],
            check=False,
            capture_output=True,
            text=True,
        )

    def dump_ui(self, output_path: Path) -> None:
        remote = "/sdcard/__andro_agent_ui.xml"
        subprocess.run(
            [self.adb_bin, "shell", "uiautomator", "dump", remote],
            check=False,
            capture_output=True,
            text=True,
        )
        subprocess.run(
            [self.adb_bin, "pull", remote, str(output_path)],
            check=False,
            capture_output=True,
            text=True,
        )