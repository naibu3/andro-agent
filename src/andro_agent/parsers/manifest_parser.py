from __future__ import annotations

import xml.etree.ElementTree as ET

from andro_agent.models import (
    ApplicationInfo,
    ComponentInfo,
    IntentFilterData,
    ManifestData,
)

ANDROID_NS = "{http://schemas.android.com/apk/res/android}"


def get_android_attr(element: ET.Element, attr: str, default=None):
    return element.get(f"{ANDROID_NS}{attr}", default)


def parse_bool(value: str | None) -> bool | None:
    if value is None:
        return None
    return value.lower() == "true"


def parse_intent_filter(intent_filter_el: ET.Element) -> IntentFilterData:
    actions = [
        get_android_attr(action_el, "name")
        for action_el in intent_filter_el.findall("action")
        if get_android_attr(action_el, "name")
    ]
    categories = [
        get_android_attr(cat_el, "name")
        for cat_el in intent_filter_el.findall("category")
        if get_android_attr(cat_el, "name")
    ]

    data_entries: list[dict[str, str | None]] = []
    for data_el in intent_filter_el.findall("data"):
        data_entries.append(
            {
                "scheme": get_android_attr(data_el, "scheme"),
                "host": get_android_attr(data_el, "host"),
                "port": get_android_attr(data_el, "port"),
                "path": get_android_attr(data_el, "path"),
                "pathPrefix": get_android_attr(data_el, "pathPrefix"),
                "pathPattern": get_android_attr(data_el, "pathPattern"),
                "mimeType": get_android_attr(data_el, "mimeType"),
            }
        )

    return IntentFilterData(
        actions=actions,
        categories=categories,
        data=data_entries,
    )


def infer_exported(component_el: ET.Element) -> tuple[bool | None, str | None]:
    explicit = get_android_attr(component_el, "exported")
    if explicit is not None:
        return parse_bool(explicit), "explicit"

    has_intent_filter = component_el.find("intent-filter") is not None
    if has_intent_filter:
        return True, "inferred_from_intent_filter"

    return False, "inferred_default_false"


def parse_component(component_el: ET.Element, is_provider: bool = False) -> ComponentInfo:
    intent_filters = [
        parse_intent_filter(if_el)
        for if_el in component_el.findall("intent-filter")
    ]

    exported, exported_source = infer_exported(component_el)

    component = ComponentInfo(
        name=get_android_attr(component_el, "name"),
        exported=exported,
        exported_source=exported_source,
        permission=get_android_attr(component_el, "permission"),
        enabled=parse_bool(get_android_attr(component_el, "enabled")),
        intent_filters=intent_filters,
    )

    if is_provider:
        component.authorities = get_android_attr(component_el, "authorities")
        component.read_permission = get_android_attr(component_el, "readPermission")
        component.write_permission = get_android_attr(component_el, "writePermission")
        component.grant_uri_permissions = parse_bool(
            get_android_attr(component_el, "grantUriPermissions")
        )

    return component


def parse_manifest(manifest_path: str) -> ManifestData:
    tree = ET.parse(manifest_path)
    root = tree.getroot()

    uses_sdk = root.find("uses-sdk")
    application_el = root.find("application")

    permissions = []
    for perm_el in root.findall("uses-permission"):
        name = get_android_attr(perm_el, "name")
        if name:
            permissions.append(name)

    for perm_el in root.findall("uses-permission-sdk-23"):
        name = get_android_attr(perm_el, "name")
        if name and name not in permissions:
            permissions.append(name)

    app_info = ApplicationInfo()
    activities: list[ComponentInfo] = []
    activity_aliases: list[ComponentInfo] = []
    services: list[ComponentInfo] = []
    receivers: list[ComponentInfo] = []
    providers: list[ComponentInfo] = []

    if application_el is not None:
        app_info = ApplicationInfo(
            debuggable=parse_bool(get_android_attr(application_el, "debuggable")),
            allow_backup=parse_bool(get_android_attr(application_el, "allowBackup")),
            uses_cleartext_traffic=parse_bool(
                get_android_attr(application_el, "usesCleartextTraffic")
            ),
            network_security_config=get_android_attr(application_el, "networkSecurityConfig"),
            request_legacy_external_storage=parse_bool(
                get_android_attr(application_el, "requestLegacyExternalStorage")
            ),
            test_only=parse_bool(get_android_attr(application_el, "testOnly")),
            full_backup_content=get_android_attr(application_el, "fullBackupContent"),
        )

        activities = [
            parse_component(el) for el in application_el.findall("activity")
        ]
        activity_aliases = [
            parse_component(el) for el in application_el.findall("activity-alias")
        ]
        services = [
            parse_component(el) for el in application_el.findall("service")
        ]
        receivers = [
            parse_component(el) for el in application_el.findall("receiver")
        ]
        providers = [
            parse_component(el, is_provider=True)
            for el in application_el.findall("provider")
        ]

    return ManifestData(
        package_name=root.get("package"),
        version_code=get_android_attr(root, "versionCode"),
        version_name=get_android_attr(root, "versionName"),
        min_sdk=get_android_attr(uses_sdk, "minSdkVersion") if uses_sdk is not None else None,
        target_sdk=get_android_attr(uses_sdk, "targetSdkVersion") if uses_sdk is not None else None,
        compile_sdk_version=get_android_attr(root, "compileSdkVersion"),
        permissions=permissions,
        application=app_info,
        activities=activities,
        activity_aliases=activity_aliases,
        services=services,
        receivers=receivers,
        providers=providers,
    )