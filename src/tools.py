from pathlib import Path
import shutil
import subprocess
import xml.etree.ElementTree as ET
import json
import re

BASE_DIR = Path(__file__).resolve().parent.parent
OUTPUT_DIR = BASE_DIR / "output"
JADX_OUT = OUTPUT_DIR / "jadx"
APKTOOL_OUT = OUTPUT_DIR / "apktool"

ANDROID_NS = "{http://schemas.android.com/apk/res/android}"


def run_jadx(apk_path: str) -> str:
    apk = Path(apk_path).resolve()

    if not apk.exists():
        return f"Error: APK no encontrado: {apk}"

    if JADX_OUT.exists():
        shutil.rmtree(JADX_OUT)
    JADX_OUT.mkdir(parents=True, exist_ok=True)

    result = subprocess.run(
        ["jadx", "-d", str(JADX_OUT), str(apk)],
        capture_output=True,
        text=True,
    )

    if result.returncode != 0:
        return f"jadx falló:\n{result.stderr}"

    return f"jadx completado. Salida: {JADX_OUT}"


def run_apktool(apk_path: str) -> str:
    apk = Path(apk_path).resolve()

    if not apk.exists():
        return f"Error: APK no encontrado: {apk}"

    if APKTOOL_OUT.exists():
        shutil.rmtree(APKTOOL_OUT)

    result = subprocess.run(
        ["apktool", "d", "-f", str(apk), "-o", str(APKTOOL_OUT)],
        capture_output=True,
        text=True,
    )

    if result.returncode != 0:
        return f"apktool falló:\n{result.stderr}"

    return f"apktool completado. Salida: {APKTOOL_OUT}"


def _manifest_path() -> Path:
    return APKTOOL_OUT / "AndroidManifest.xml"


def _safe_attr(elem, attr_name: str):
    return elem.attrib.get(f"{ANDROID_NS}{attr_name}")


def _normalize_component_name(package_name: str, component_name: str | None) -> str | None:
    if not component_name:
        return None
    if component_name.startswith("."):
        return f"{package_name}{component_name}"
    if "." not in component_name:
        return f"{package_name}.{component_name}"
    return component_name


def _parse_manifest_tree():
    manifest = _manifest_path()
    if not manifest.exists():
        raise FileNotFoundError(f"No existe AndroidManifest.xml en {manifest}")
    return ET.parse(manifest).getroot()


def read_manifest() -> str:
    manifest = _manifest_path()
    if not manifest.exists():
        return f"Error: no existe AndroidManifest.xml en {manifest}"

    try:
        return manifest.read_text(encoding="utf-8", errors="ignore")[:20000]
    except Exception as e:
        return f"Error leyendo manifest: {e}"


def manifest_summary() -> str:
    try:
        root = _parse_manifest_tree()
    except Exception as e:
        return f"Error parseando manifest: {e}"

    package_name = root.attrib.get("package", "")
    version_code = _safe_attr(root, "versionCode")
    version_name = _safe_attr(root, "versionName")

    uses_permissions = []
    for perm in root.findall("uses-permission"):
        name = _safe_attr(perm, "name")
        if name:
            uses_permissions.append(name)

    application = root.find("application")
    app_flags = {
        "debuggable": None,
        "allowBackup": None,
        "usesCleartextTraffic": None,
        "networkSecurityConfig": None,
        "requestLegacyExternalStorage": None,
    }

    components = {
        "activities": [],
        "services": [],
        "receivers": [],
        "providers": [],
    }

    if application is not None:
        app_flags["debuggable"] = _safe_attr(application, "debuggable")
        app_flags["allowBackup"] = _safe_attr(application, "allowBackup")
        app_flags["usesCleartextTraffic"] = _safe_attr(application, "usesCleartextTraffic")
        app_flags["networkSecurityConfig"] = _safe_attr(application, "networkSecurityConfig")
        app_flags["requestLegacyExternalStorage"] = _safe_attr(application, "requestLegacyExternalStorage")

        for tag, bucket in [
            ("activity", "activities"),
            ("activity-alias", "activities"),
            ("service", "services"),
            ("receiver", "receivers"),
            ("provider", "providers"),
        ]:
            for elem in application.findall(tag):
                name = _normalize_component_name(package_name, _safe_attr(elem, "name"))
                exported = _safe_attr(elem, "exported")
                permission = _safe_attr(elem, "permission")
                authorities = _safe_attr(elem, "authorities")

                intent_filters = []
                for ifilt in elem.findall("intent-filter"):
                    actions = []
                    categories = []
                    data_entries = []

                    for action in ifilt.findall("action"):
                        action_name = _safe_attr(action, "name")
                        if action_name:
                            actions.append(action_name)

                    for category in ifilt.findall("category"):
                        category_name = _safe_attr(category, "name")
                        if category_name:
                            categories.append(category_name)

                    for data in ifilt.findall("data"):
                        data_entries.append({
                            "scheme": _safe_attr(data, "scheme"),
                            "host": _safe_attr(data, "host"),
                            "port": _safe_attr(data, "port"),
                            "path": _safe_attr(data, "path"),
                            "pathPrefix": _safe_attr(data, "pathPrefix"),
                            "pathPattern": _safe_attr(data, "pathPattern"),
                            "mimeType": _safe_attr(data, "mimeType"),
                        })

                    intent_filters.append({
                        "actions": actions,
                        "categories": categories,
                        "data": data_entries,
                    })

                components[bucket].append({
                    "name": name,
                    "exported": exported,
                    "permission": permission,
                    "authorities": authorities,
                    "intent_filters": intent_filters,
                })

    summary = {
        "package": package_name,
        "version_code": version_code,
        "version_name": version_name,
        "permissions": sorted(set(uses_permissions)),
        "app_flags": app_flags,
        "components": components,
    }

    return json.dumps(summary, indent=2, ensure_ascii=False)


def exported_components() -> str:
    try:
        data = json.loads(manifest_summary())
    except Exception as e:
        return f"Error obteniendo exported components: {e}"

    results = []

    for comp_type, items in data.get("components", {}).items():
        for item in items:
            if item.get("exported") == "true":
                results.append({
                    "type": comp_type,
                    "name": item.get("name"),
                    "permission": item.get("permission"),
                    "authorities": item.get("authorities"),
                    "intent_filters": item.get("intent_filters", []),
                })

    return json.dumps(results, indent=2, ensure_ascii=False)


def permissions_summary() -> str:
    dangerous_like = {
        "android.permission.READ_EXTERNAL_STORAGE",
        "android.permission.WRITE_EXTERNAL_STORAGE",
        "android.permission.READ_MEDIA_IMAGES",
        "android.permission.READ_MEDIA_VIDEO",
        "android.permission.READ_MEDIA_AUDIO",
        "android.permission.CAMERA",
        "android.permission.RECORD_AUDIO",
        "android.permission.ACCESS_FINE_LOCATION",
        "android.permission.ACCESS_COARSE_LOCATION",
        "android.permission.READ_CONTACTS",
        "android.permission.WRITE_CONTACTS",
        "android.permission.READ_SMS",
        "android.permission.SEND_SMS",
        "android.permission.RECEIVE_SMS",
        "android.permission.CALL_PHONE",
        "android.permission.READ_PHONE_STATE",
        "android.permission.POST_NOTIFICATIONS",
        "android.permission.QUERY_ALL_PACKAGES",
        "android.permission.REQUEST_INSTALL_PACKAGES",
        "android.permission.SYSTEM_ALERT_WINDOW",
        "android.permission.MANAGE_EXTERNAL_STORAGE",
    }

    try:
        data = json.loads(manifest_summary())
    except Exception as e:
        return f"Error obteniendo permisos: {e}"

    permissions = data.get("permissions", [])
    interesting = [p for p in permissions if p in dangerous_like or "SIGNATURE" in p.upper()]

    result = {
        "all_permissions": permissions,
        "interesting_permissions": interesting,
    }

    return json.dumps(result, indent=2, ensure_ascii=False)


def list_output_files() -> str:
    if not OUTPUT_DIR.exists():
        return f"Error: no existe el directorio output: {OUTPUT_DIR}"

    files = []
    for p in OUTPUT_DIR.rglob("*"):
        if p.is_file():
            files.append(str(p.relative_to(OUTPUT_DIR)))

    if not files:
        return "No hay archivos en output"

    return "\n".join(sorted(files)[:500])


def find_source_for_component(component_name: str) -> str:
    if not component_name:
        return "Error: component_name vacío"

    if not JADX_OUT.exists():
        return "Error: no existe output/jadx"

    simple_name = component_name.split(".")[-1]
    package_path = "/".join(component_name.split("."))

    candidates = []

    for ext in ("*.java", "*.kt", "*.smali", "*.xml"):
        for p in JADX_OUT.rglob(ext):
            p_str = str(p)
            if package_path in p_str or simple_name in p.name:
                candidates.append(str(p))

    for p in APKTOOL_OUT.rglob("*.smali"):
        p_str = str(p)
        if package_path in p_str or simple_name in p.name:
            candidates.append(str(p))

    unique_candidates = sorted(set(candidates))
    if not unique_candidates:
        return f"No se encontraron fuentes para: {component_name}"

    return "\n".join(unique_candidates[:50])


def read_source_file(file_path: str, max_chars: int = 12000) -> str:
    path = Path(file_path).resolve()

    if not path.exists():
        return f"Error: no existe el archivo {path}"

    try:
        return path.read_text(encoding="utf-8", errors="ignore")[:max_chars]
    except Exception as e:
        return f"Error leyendo archivo: {e}"


def search_code(term: str, max_results: int = 50) -> str:
    if not term:
        return "Error: term vacío"

    search_roots = []
    if JADX_OUT.exists():
        search_roots.append(JADX_OUT)
    if APKTOOL_OUT.exists():
        search_roots.append(APKTOOL_OUT)

    results = []

    for root in search_roots:
        for path in root.rglob("*"):
            if not path.is_file():
                continue
            if path.suffix.lower() not in {".java", ".kt", ".smali", ".xml", ".txt", ".json", ".properties"}:
                continue

            try:
                content = path.read_text(encoding="utf-8", errors="ignore")
            except Exception:
                continue

            if term.lower() in content.lower():
                results.append(str(path))

            if len(results) >= max_results:
                return "\n".join(results)

    if not results:
        return f"No se encontraron coincidencias para: {term}"

    return "\n".join(results)


def find_pattern_files(patterns: list[str], exts: set[str] | None = None, max_results: int = 100) -> list[str]:
    if exts is None:
        exts = {".java", ".kt", ".smali", ".xml", ".txt", ".json", ".properties"}

    roots = []
    if JADX_OUT.exists():
        roots.append(JADX_OUT)
    if APKTOOL_OUT.exists():
        roots.append(APKTOOL_OUT)

    results = []

    for root in roots:
        for path in root.rglob("*"):
            if not path.is_file():
                continue
            if path.suffix.lower() not in exts:
                continue

            try:
                content = path.read_text(encoding="utf-8", errors="ignore")
            except Exception:
                continue

            content_lower = content.lower()
            if any(p.lower() in content_lower for p in patterns):
                results.append(str(path))

            if len(results) >= max_results:
                return sorted(set(results))

    return sorted(set(results))


def find_webview_candidates() -> str:
    patterns = [
        "WebView",
        "setJavaScriptEnabled",
        "addJavascriptInterface",
        "loadUrl(",
        "evaluateJavascript(",
        "setAllowFileAccess",
        "setAllowUniversalAccessFromFileURLs",
        "shouldOverrideUrlLoading",
    ]
    files = find_pattern_files(patterns)
    return json.dumps({
        "category": "webview",
        "patterns": patterns,
        "candidate_files": files[:50],
    }, indent=2, ensure_ascii=False)


def find_secret_candidates() -> str:
    patterns = [
        "api_key",
        "apikey",
        "secret",
        "token",
        "bearer ",
        "authorization",
        "client_secret",
        "password",
        "-----BEGIN",
    ]
    files = find_pattern_files(patterns)
    return json.dumps({
        "category": "secrets",
        "patterns": patterns,
        "candidate_files": files[:50],
    }, indent=2, ensure_ascii=False)


def find_network_candidates() -> str:
    patterns = [
        "networkSecurityConfig",
        "usesCleartextTraffic",
        "X509TrustManager",
        "HostnameVerifier",
        "SSLSocketFactory",
        "TrustManager",
        "checkServerTrusted",
        "checkClientTrusted",
        "OkHttpClient",
        "retrofit",
    ]
    files = find_pattern_files(patterns)
    return json.dumps({
        "category": "network",
        "patterns": patterns,
        "candidate_files": files[:50],
    }, indent=2, ensure_ascii=False)


def find_deeplink_candidates() -> str:
    try:
        data = json.loads(exported_components())
    except Exception as e:
        return json.dumps({"error": str(e)}, indent=2, ensure_ascii=False)

    candidates = []
    for item in data:
        for ifilt in item.get("intent_filters", []):
            cats = ifilt.get("categories", [])
            if "android.intent.category.BROWSABLE" in cats:
                candidates.append(item)

    return json.dumps({
        "category": "deeplinks",
        "candidate_components": candidates,
    }, indent=2, ensure_ascii=False)


def build_initial_evidence() -> str:
    try:
        manifest_data = json.loads(manifest_summary())
    except Exception as e:
        return json.dumps({"error": f"manifest_summary falló: {e}"}, indent=2, ensure_ascii=False)

    try:
        perms_data = json.loads(permissions_summary())
    except Exception:
        perms_data = {}

    try:
        exported_data = json.loads(exported_components())
    except Exception:
        exported_data = []

    try:
        webview_data = json.loads(find_webview_candidates())
    except Exception:
        webview_data = {}

    try:
        secrets_data = json.loads(find_secret_candidates())
    except Exception:
        secrets_data = {}

    try:
        network_data = json.loads(find_network_candidates())
    except Exception:
        network_data = {}

    try:
        deeplink_data = json.loads(find_deeplink_candidates())
    except Exception:
        deeplink_data = {}

    app_flags = manifest_data.get("app_flags", {})
    suspicions = []

    if app_flags.get("debuggable") == "true":
        suspicions.append("App debuggable activada")
    if app_flags.get("allowBackup") == "true":
        suspicions.append("allowBackup=true")
    if app_flags.get("usesCleartextTraffic") == "true":
        suspicions.append("usesCleartextTraffic=true")
    if app_flags.get("networkSecurityConfig"):
        suspicions.append("Uso de networkSecurityConfig")

    if exported_data:
        suspicions.append("Componentes exportados detectados")

    if deeplink_data.get("candidate_components"):
        suspicions.append("Deep links browsable detectados")

    if webview_data.get("candidate_files"):
        suspicions.append("Uso de WebView detectado en código")

    if secrets_data.get("candidate_files"):
        suspicions.append("Posibles secretos hardcodeados")

    if network_data.get("candidate_files"):
        suspicions.append("Código de red/TLS interesante detectado")

    evidence = {
        "manifest": manifest_data,
        "permissions": perms_data,
        "exported_components": exported_data[:20],
        "webview_candidates": webview_data.get("candidate_files", [])[:20],
        "secret_candidates": secrets_data.get("candidate_files", [])[:20],
        "network_candidates": network_data.get("candidate_files", [])[:20],
        "deeplink_candidates": deeplink_data.get("candidate_components", [])[:10],
        "initial_suspicions": suspicions,
    }

    return json.dumps(evidence, indent=2, ensure_ascii=False)