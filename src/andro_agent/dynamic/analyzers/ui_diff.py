from __future__ import annotations

import xml.etree.ElementTree as ET
from pathlib import Path
from typing import Any


def compare_ui_dumps(
    test_id: str,
    before_ui_path: Path,
    after_ui_path: Path,
) -> list[dict[str, Any]]:
    before = _extract_ui_features(before_ui_path)
    after = _extract_ui_features(after_ui_path)

    observations: list[dict[str, Any]] = []

    if not before or not after:
        return observations

    text_changed = before["texts"] != after["texts"]
    package_changed = before["packages"] != after["packages"]
    resource_changed = before["resource_ids"] != after["resource_ids"]
    class_changed = before["classes"] != after["classes"]

    any_changed = text_changed or package_changed or resource_changed or class_changed

    if any_changed:
        observations.append(
            {
                "test_id": test_id,
                "signal": "ui_changed_after_action",
                "success": True,
                "summary": "UI changed after dynamic action",
                "metadata": {
                    "before_ui": str(before_ui_path),
                    "after_ui": str(after_ui_path),
                    "text_changed": text_changed,
                    "package_changed": package_changed,
                    "resource_changed": resource_changed,
                    "class_changed": class_changed,
                },
            }
        )

    if text_changed:
        new_texts = sorted(after["texts"] - before["texts"])
        observations.append(
            {
                "test_id": test_id,
                "signal": "ui_text_diff_detected",
                "success": True,
                "summary": "New visible text detected after action",
                "metadata": {
                    "before_ui": str(before_ui_path),
                    "after_ui": str(after_ui_path),
                    "new_texts": new_texts[:30],
                },
            }
        )

    return observations


def _extract_ui_features(ui_path: Path) -> dict[str, set[str]] | None:
    if not ui_path.exists():
        return None

    try:
        content = ui_path.read_text(encoding="utf-8", errors="ignore")
        root = ET.fromstring(content)
    except Exception:
        return None

    texts: set[str] = set()
    packages: set[str] = set()
    resource_ids: set[str] = set()
    classes: set[str] = set()

    for node in root.iter():
        text = node.attrib.get("text", "").strip()
        package = node.attrib.get("package", "").strip()
        resource_id = node.attrib.get("resource-id", "").strip()
        class_name = node.attrib.get("class", "").strip()

        if text:
            texts.add(text)
        if package:
            packages.add(package)
        if resource_id:
            resource_ids.add(resource_id)
        if class_name:
            classes.add(class_name)

    return {
        "texts": texts,
        "packages": packages,
        "resource_ids": resource_ids,
        "classes": classes,
    }