from __future__ import annotations

import os
import shutil
import subprocess
import tempfile
from pathlib import Path

from andro_agent.tools.android.android_sdk_tool import AndroidSDKTool


class AndroidCertTool:
    def __init__(self, sdk_root: str | None = None) -> None:
        sdk = AndroidSDKTool(sdk_root=sdk_root)
        self.adb_bin = str(sdk.adb)

    def install_mitmproxy_ca_as_system(
        self,
        cert_pem_path: Path,
    ) -> None:
        if not cert_pem_path.exists():
            raise FileNotFoundError(f"mitmproxy CA not found: {cert_pem_path}")

        hashed_name = self._hash_old_subject(cert_pem_path)
        target_name = f"{hashed_name}.0"

        with tempfile.TemporaryDirectory() as tmpdir:
            tmpdir_path = Path(tmpdir)
            hashed_cert_path = tmpdir_path / target_name
            shutil.copy(cert_pem_path, hashed_cert_path)

            self._run_adb(["root"], check=False)
            self._run_adb(["wait-for-device"])
            self._run_adb(["remount"], check=False)

            remote_tmp = f"/data/local/tmp/{target_name}"
            self._run_adb(["push", str(hashed_cert_path), remote_tmp])

            # Intenta montar system rw y copiar al trust store clásico.
            # En algunos AVDs puede requerir ajustes adicionales según imagen.
            self._run_adb(["shell", "mount", "-o", "rw,remount", "/system"], check=False)
            self._run_adb(
                ["shell", "cp", remote_tmp, f"/system/etc/security/cacerts/{target_name}"],
                check=False,
            )
            self._run_adb(
                ["shell", "chmod", "644", f"/system/etc/security/cacerts/{target_name}"],
                check=False,
            )
            self._run_adb(
                ["shell", "chown", "root:root", f"/system/etc/security/cacerts/{target_name}"],
                check=False,
            )

            self._run_adb(["reboot"], check=False)
            self._run_adb(["wait-for-device"])
            self._wait_for_boot_completed()
            self._wait_for_package_service()

    def _wait_for_boot_completed(self, timeout: int = 180) -> None:
        import time

        start = time.time()
        while time.time() - start < timeout:
            proc = self._run_adb(
                ["shell", "getprop", "sys.boot_completed"],
                check=False,
            )
            if proc.stdout.strip() == "1":
                return
            time.sleep(3)

        raise TimeoutError("Android did not finish booting after reboot")

    def _wait_for_package_service(self, timeout: int = 120) -> None:
        import time

        start = time.time()
        while time.time() - start < timeout:
            proc = self._run_adb(
                ["shell", "cmd", "package", "list", "packages"],
                check=False,
            )
            if proc.returncode == 0 and "package:" in proc.stdout:
                time.sleep(5)
                return
            time.sleep(3)

        raise TimeoutError("Android package service did not become available after reboot")

    def _hash_old_subject(self, cert_pem_path: Path) -> str:
        proc = subprocess.run(
            ["openssl", "x509", "-inform", "PEM", "-subject_hash_old", "-in", str(cert_pem_path)],
            check=False,
            capture_output=True,
            text=True,
            timeout=30,
        )
        if proc.returncode != 0:
            raise RuntimeError(f"openssl failed hashing certificate: {proc.stderr}")
        return proc.stdout.splitlines()[0].strip()

    def _run_adb(self, args: list[str], check: bool = True) -> subprocess.CompletedProcess[str]:
        proc = subprocess.run(
            [self.adb_bin, *args],
            check=False,
            capture_output=True,
            text=True,
            timeout=120,
        )
        if check and proc.returncode != 0:
            raise RuntimeError(f"adb {' '.join(args)} failed:\nSTDOUT:\n{proc.stdout}\nSTDERR:\n{proc.stderr}")
        return proc
    
    def resolve_mitmproxy_ca_path(self) -> Path:
        candidates = [
            Path.home() / ".mitmproxy" / "mitmproxy-ca-cert.pem",
            Path.home() / ".config" / "mitmproxy" / "mitmproxy-ca-cert.pem",
        ]
        for candidate in candidates:
            if candidate.exists():
                return candidate
        raise FileNotFoundError("Could not find mitmproxy CA certificate")