from __future__ import annotations

from pathlib import Path

from andro_agent.parsers.manifest_parser import parse_manifest


def test_parse_manifest_basic(tmp_path: Path) -> None:
    manifest = tmp_path / "AndroidManifest.xml"
    manifest.write_text(
        """<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.app"
    android:versionCode="1"
    android:versionName="1.0">
    <uses-sdk android:minSdkVersion="21" android:targetSdkVersion="33" />
    <uses-permission android:name="android.permission.INTERNET" />
    <application
        android:debuggable="true"
        android:allowBackup="false">
        <activity android:name=".MainActivity" android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
""",
        encoding="utf-8",
    )

    parsed = parse_manifest(str(manifest))

    assert parsed.package_name == "com.example.app"
    assert parsed.version_code == "1"
    assert parsed.version_name == "1.0"
    assert parsed.min_sdk == "21"
    assert parsed.target_sdk == "33"
    assert "android.permission.INTERNET" in parsed.permissions
    assert parsed.application.debuggable is True
    assert parsed.application.allow_backup is False
    assert len(parsed.activities) == 1
    assert parsed.activities[0].name == ".MainActivity"
    assert parsed.activities[0].exported is True