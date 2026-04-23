from __future__ import annotations

from dataclasses import dataclass, field

from andro_agent.tools.android_sdk_tool import AndroidSDKError, AndroidSDKTool


@dataclass
class DynamicSetupResult:
    success: bool
    sdk_root: str | None = None
    avd_name: str | None = None
    system_image: str | None = None
    installed_packages: list[str] = field(default_factory=list)
    warnings: list[str] = field(default_factory=list)
    errors: list[str] = field(default_factory=list)
    details: dict[str, str] = field(default_factory=dict)


def run_dynamic_setup(
    sdk_root: str | None,
    avd_name: str,
    api_level: int,
    system_image: str | None = None,
    device: str = "pixel_6",
    auto_install: bool = False,
    accept_licenses: bool = False,
    force_recreate: bool = False,
) -> DynamicSetupResult:
    try:
        sdk = AndroidSDKTool(sdk_root=sdk_root)
    except AndroidSDKError as exc:
        return DynamicSetupResult(success=False, errors=[str(exc)])

    result = DynamicSetupResult(
        success=False,
        sdk_root=str(sdk.sdk_root),
        avd_name=avd_name,
        system_image=system_image,
        details=sdk.doctor(),
    )

    resolved_system_image = (
        system_image or f"system-images;android-{api_level};google_apis;x86_64"
    )
    result.system_image = resolved_system_image

    required_packages = [
        "platform-tools",
        "emulator",
        f"platforms;android-{api_level}",
        resolved_system_image,
    ]

    if sdk.avd_exists(avd_name) and not force_recreate:
        result.success = True
        result.warnings.append(f"AVD '{avd_name}' already exists. Reusing it.")
        return result

    if not auto_install:
        result.errors.append(
            "AVD does not exist and --auto-install is disabled. "
            "Run setup with --auto-install to install packages and create the AVD."
        )
        return result

    if accept_licenses:
        proc = sdk.accept_licenses()
        if proc.returncode != 0:
            result.warnings.append(
                "License acceptance command returned a non-zero exit code."
            )

    proc = sdk.install_packages(required_packages)
    if proc.returncode != 0:
        result.errors.append(
            f"Failed installing SDK packages:\nSTDOUT:\n{proc.stdout}\nSTDERR:\n{proc.stderr}"
        )
        return result

    result.installed_packages.extend(required_packages)

    proc = sdk.create_avd(
        avd_name=avd_name,
        system_image=resolved_system_image,
        device=device,
        force=force_recreate,
    )
    if proc.returncode != 0:
        result.errors.append(
            f"Failed creating AVD:\nSTDOUT:\n{proc.stdout}\nSTDERR:\n{proc.stderr}"
        )
        return result

    result.success = True
    return result