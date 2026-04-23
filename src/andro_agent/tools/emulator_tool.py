from __future__ import annotations

import subprocess
import time

from andro_agent.tools.android_sdk_tool import AndroidSDKTool


class EmulatorTool:
    def __init__(self, sdk_root: str | None = None) -> None:
        sdk = AndroidSDKTool(sdk_root=sdk_root)
        self.sdk_root = sdk.sdk_root
        self.emulator_bin = str(sdk.emulator)
        self.adb_bin = str(sdk.adb)

    def start(self, avd_name: str, no_window: bool = True, wipe_data: bool = False) -> None:
        cmd = [self.emulator_bin, "-avd", avd_name]
        if no_window:
            cmd.append("-no-window")
        if wipe_data:
            cmd.append("-wipe-data")

        subprocess.Popen(
            cmd,
            stdout=subprocess.DEVNULL,
            stderr=subprocess.DEVNULL,
        )
        self.wait_for_boot()

    def wait_for_boot(self, timeout: int = 180) -> None:
        start = time.time()
        while time.time() - start < timeout:
            try:
                subprocess.run(
                    [self.adb_bin, "wait-for-device"],
                    check=False,
                    capture_output=True,
                    text=True,
                    timeout=10,
                )
                boot = subprocess.run(
                    [self.adb_bin, "shell", "getprop", "sys.boot_completed"],
                    check=False,
                    capture_output=True,
                    text=True,
                    timeout=10,
                )
                if boot.stdout.strip() == "1":
                    return
            except Exception:
                pass
            time.sleep(3)
        raise TimeoutError("Emulator did not boot in time")

    def stop(self) -> None:
        subprocess.run(
            [self.adb_bin, "emu", "kill"],
            check=False,
            capture_output=True,
            text=True,
        )