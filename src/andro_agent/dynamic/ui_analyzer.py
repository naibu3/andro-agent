from __future__ import annotations

import xml.etree.ElementTree as ET
from pathlib import Path
from typing import Any
from andro_agent.utils.keyword_loader import load_keywords_from_file

DEFAULT_UI_KEYWORDS = [
    "admin",
    "token",
    "password",
    "pin",
    "user",
    "account",
    "settings",
    "debug",
    "access control",
    "login",
    "register",
    "profile",
]

def resolve_ui_keywords() -> list[str]:
    config_path = Path("config/ui_keywords.txt")

    file_keywords = load_keywords_from_file(config_path)

    if file_keywords:
        return file_keywords

    return DEFAULT_UI_KEYWORDS

def analyze_ui_dump(
    test_id: str,
    ui_path: Path,
    package_name: str,
) -> list[dict[str, Any]]:
    observations: list[dict[str, Any]] = []

    if not ui_path.exists():
        return observations

    try:
        content = ui_path.read_text(encoding="utf-8", errors="ignore")
    except Exception:
        return observations

    if not content.strip():
        return observations

    observations.append(
        {
            "test_id": test_id,
            "signal": "ui_dump_available",
            "success": True,
            "summary": "UI dump captured successfully",
            "metadata": {"ui_path": str(ui_path)},
        }
    )

    try:
        root = ET.fromstring(content)
    except Exception:
        observations.append(
            {
                "test_id": test_id,
                "signal": "ui_dump_parse_failed",
                "success": False,
                "summary": "UI dump could not be parsed as XML",
                "metadata": {"ui_path": str(ui_path)},
            }
        )
        return observations

    texts: list[str] = []
    packages: list[str] = []
    resource_ids: list[str] = []
    class_names: list[str] = []

    for node in root.iter():
        text = node.attrib.get("text", "")
        package = node.attrib.get("package", "")
        resource_id = node.attrib.get("resource-id", "")
        class_name = node.attrib.get("class", "")

        if text:
            texts.append(text)
        if package:
            packages.append(package)
        if resource_id:
            resource_ids.append(resource_id)
        if class_name:
            class_names.append(class_name)

    unique_packages = sorted(set(packages))
    unique_texts = sorted(set(t.strip() for t in texts if t.strip()))
    joined_text = " | ".join(unique_texts).lower()

    if unique_texts:
        observations.append(
            {
                "test_id": test_id,
                "signal": "ui_text_detected",
                "success": True,
                "summary": "Visible text detected in UI dump",
                "metadata": {
                    "ui_path": str(ui_path),
                    "texts": unique_texts[:30],
                },
            }
        )

    if package_name in unique_packages:
        observations.append(
            {
                "test_id": test_id,
                "signal": "ui_package_matches_target",
                "success": True,
                "summary": "UI dump contains nodes from target package",
                "metadata": {
                    "ui_path": str(ui_path),
                    "packages": unique_packages,
                },
            }
        )

    keywords = resolve_ui_keywords()

    matched_keywords = [
        keyword for keyword in keywords
        if keyword in joined_text
    ]
    if matched_keywords:
        observations.append(
            {
                "test_id": test_id,
                "signal": "ui_sensitive_keyword_detected",
                "success": True,
                "summary": "Potentially sensitive UI keywords detected",
                "metadata": {
                    "ui_path": str(ui_path),
                    "matched_keywords": matched_keywords,
                    "texts": unique_texts[:30],
                },
            }
        )

    if resource_ids:
        observations.append(
            {
                "test_id": test_id,
                "signal": "ui_resource_ids_detected",
                "success": True,
                "summary": "Resource identifiers detected in UI dump",
                "metadata": {
                    "ui_path": str(ui_path),
                    "resource_ids": resource_ids[:30],
                },
            }
        )

    if class_names:
        observations.append(
            {
                "test_id": test_id,
                "signal": "ui_classes_detected",
                "success": True,
                "summary": "UI classes detected in UI dump",
                "metadata": {
                    "ui_path": str(ui_path),
                    "classes": sorted(set(class_names))[:30],
                },
            }
        )

    return observations