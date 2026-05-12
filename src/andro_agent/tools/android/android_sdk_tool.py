from __future__ import annotations

import os
import shutil
import subprocess
from pathlib import Path


class AndroidSDKError(RuntimeError):
    pass


class AndroidSDKTool:
    def __init__(self, sdk_root: str | None = None) -> None:
        self.sdk_root = self._resolve_sdk_root(sdk_root)
        self.sdkmanager = self._resolve_sdkmanager()
        self.avdmanager = self._resolve_avdmanager()
        self.adb = self._resolve_adb()
        self.emulator = self._resolve_emulator()

    def _resolve_sdk_root(self, sdk_root: str | None) -> Path:
        candidates: list[Path] = []

        if sdk_root:
            candidates.append(Path(sdk_root).expanduser())

        env_home = os.environ.get("ANDROID_HOME")
        if env_home:
            candidates.append(Path(env_home).expanduser())

        env_root = os.environ.get("ANDROID_SDK_ROOT")
        if env_root:
            candidates.append(Path(env_root).expanduser())

        candidates.extend(
            [
                Path.home() / "Android" / "Sdk",
                Path.home() / "Library" / "Android" / "sdk",
                Path("/opt/android-sdk"),
                Path("/opt/android-sdk-linux"),
            ]
        )

        for candidate in candidates:
            if candidate.exists():
                return candidate

        raise AndroidSDKError(
            "No Android SDK root found. Set ANDROID_HOME or pass --sdk-root."
        )

    def _resolve_sdkmanager(self) -> Path:
        candidates = [
            self.sdk_root / "cmdline-tools" / "latest" / "bin" / "sdkmanager",
            self.sdk_root / "cmdline-tools" / "bin" / "sdkmanager",
        ]

        which_value = shutil.which("sdkmanager")
        if which_value:
            candidates.append(Path(which_value))

        for candidate in candidates:
            if candidate.exists():
                return candidate

        raise AndroidSDKError(
            f"Could not find sdkmanager under SDK root: {self.sdk_root}"
        )

    def _resolve_avdmanager(self) -> Path:
        candidates = [
            self.sdk_root / "cmdline-tools" / "latest" / "bin" / "avdmanager",
            self.sdk_root / "cmdline-tools" / "bin" / "avdmanager",
        ]

        which_value = shutil.which("avdmanager")
        if which_value:
            candidates.append(Path(which_value))

        for candidate in candidates:
            if candidate.exists():
                return candidate

        raise AndroidSDKError(
            f"Could not find avdmanager under SDK root: {self.sdk_root}"
        )

    def _resolve_adb(self) -> Path:
        candidates = [self.sdk_root / "platform-tools" / "adb"]

        which_value = shutil.which("adb")
        if which_value:
            candidates.append(Path(which_value))

        for candidate in candidates:
            if candidate.exists():
                return candidate

        raise AndroidSDKError(
            f"Could not find adb under SDK root: {self.sdk_root}"
        )

    def _resolve_emulator(self) -> Path:
        candidates = [self.sdk_root / "emulator" / "emulator"]

        which_value = shutil.which("emulator")
        if which_value:
            candidates.append(Path(which_value))

        for candidate in candidates:
            if candidate.exists():
                return candidate

        raise AndroidSDKError(
            f"Could not find emulator under SDK root: {self.sdk_root}"
        )

    def run(self, cmd: list[str], timeout: int = 300) -> subprocess.CompletedProcess[str]:
        env = os.environ.copy()
        env["ANDROID_HOME"] = str(self.sdk_root)
        env["ANDROID_SDK_ROOT"] = str(self.sdk_root)

        return subprocess.run(
            cmd,
            check=False,
            capture_output=True,
            text=True,
            timeout=timeout,
            env=env,
        )

    def accept_licenses(self) -> subprocess.CompletedProcess[str]:
        return self.run([str(self.sdkmanager), f"--sdk_root={self.sdk_root}", "--licenses"], timeout=600)

    def install_packages(self, packages: list[str]) -> subprocess.CompletedProcess[str]:
        cmd = [str(self.sdkmanager), f"--sdk_root={self.sdk_root}", *packages]
        return self.run(cmd, timeout=1800)

    def list_avds(self) -> list[str]:
        proc = self.run([str(self.emulator), "-list-avds"], timeout=30)
        if proc.returncode != 0:
            return []
        return [line.strip() for line in proc.stdout.splitlines() if line.strip()]

    def avd_exists(self, avd_name: str) -> bool:
        return avd_name in self.list_avds()

    def create_avd(
        self,
        avd_name: str,
        system_image: str,
        device: str = "pixel_6",
        force: bool = False,
    ) -> subprocess.CompletedProcess[str]:
        cmd = [
            str(self.avdmanager),
            "create",
            "avd",
            "-n",
            avd_name,
            "-k",
            system_image,
            "-d",
            device,
        ]
        if force:
            cmd.append("-f")

        env = os.environ.copy()
        env["ANDROID_HOME"] = str(self.sdk_root)
        env["ANDROID_SDK_ROOT"] = str(self.sdk_root)

        return subprocess.run(
            cmd,
            input="no\n",
            check=False,
            capture_output=True,
            text=True,
            timeout=300,
            env=env,
        )

    def doctor(self) -> dict[str, str]:
        return {
            "sdk_root": str(self.sdk_root),
            "sdkmanager": str(self.sdkmanager),
            "avdmanager": str(self.avdmanager),
            "adb": str(self.adb),
            "emulator": str(self.emulator),
        }