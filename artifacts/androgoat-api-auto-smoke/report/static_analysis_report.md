# Static Analysis Report

## Analysis summary

- Case ID: `androgoat-api-auto-smoke`
- Analysis profile: `no-llm`
- Total deterministic findings: **63**
- Critical: **0**
- High: **7**
- Medium: **23**
- Low: **33**

## Methodology

Manifest and code findings were produced by deterministic extraction and rules.

## Findings

### [MEDIUM] Application is debuggable

The application has android:debuggable enabled, which may ease runtime analysis and abuse in non-production contexts.

### [MEDIUM] Application allows backups

The application has android:allowBackup enabled, which may expose app data to backup/restore abuse depending on platform and deployment context.

### [MEDIUM] Exported activity detected

The activity 'owasp.sat.agoat.SplashActivity' is exported and may be reachable by external applications.

### [HIGH] Exported activity without permission

The exported activity 'owasp.sat.agoat.SplashActivity' does not declare a protecting permission.

### [MEDIUM] Exported activity detected

The activity 'owasp.sat.agoat.AccessControl1ViewActivity' is exported and may be reachable by external applications.

### [HIGH] Exported activity without permission

The exported activity 'owasp.sat.agoat.AccessControl1ViewActivity' does not declare a protecting permission.

### [MEDIUM] Exported service detected

The service 'owasp.sat.agoat.DownloadInvoiceService' is exported and may be reachable by external applications.

### [HIGH] Exported service without permission

The exported service 'owasp.sat.agoat.DownloadInvoiceService' does not declare a protecting permission.

### [MEDIUM] Exported receiver detected

The receiver 'owasp.sat.agoat.ShowDataReceiver' is exported and may be reachable by external applications.

### [HIGH] Exported receiver without permission

The exported receiver 'owasp.sat.agoat.ShowDataReceiver' does not declare a protecting permission.

### [MEDIUM] Exported receiver detected

The receiver 'androidx.profileinstaller.ProfileInstallReceiver' is exported and may be reachable by external applications.

### [MEDIUM] Exported provider detected

The provider 'owasp.sat.agoat.ContentProviderActivity' is exported and may be reachable by external applications.

### [HIGH] Exported provider without permission

The exported provider 'owasp.sat.agoat.ContentProviderActivity' does not declare a protecting permission.

### [MEDIUM] WebView loadUrl usage detected

Potential WebView URL loading sink found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/InputValidationsWebViewURLActivity.java. Review input origin and sanitization.

### [MEDIUM] rawQuery usage detected

rawQuery found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/SQLinjectionActivity.java. Review possible SQL injection or unsafe query construction.

### [MEDIUM] execSQL usage detected

execSQL found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/InsecureStorageSQLiteActivity.java. Review unsafe SQL execution paths.

### [MEDIUM] execSQL usage detected

execSQL found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/InsecureStorageSQLiteActivity.java. Review unsafe SQL execution paths.

### [MEDIUM] execSQL usage detected

execSQL found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/ContentProviderActivity.java. Review unsafe SQL execution paths.

### [MEDIUM] execSQL usage detected

execSQL found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/ContentProviderActivity.java. Review unsafe SQL execution paths.

### [MEDIUM] execSQL usage detected

execSQL found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/ContentProviderActivity.java. Review unsafe SQL execution paths.

### [MEDIUM] execSQL usage detected

execSQL found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/ContentProviderActivity.java. Review unsafe SQL execution paths.

### [MEDIUM] execSQL usage detected

execSQL found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/ContentProviderActivity.java. Review unsafe SQL execution paths.

### [MEDIUM] Hardcoded HTTP URL detected

Cleartext HTTP URL found in artifacts/androgoat-api-auto-smoke/jadx/sources/com/google/android/material/search/SearchBar.java. Review transport security and endpoint exposure.

### [MEDIUM] Hardcoded HTTP URL detected

Cleartext HTTP URL found in artifacts/androgoat-api-auto-smoke/jadx/sources/com/google/android/material/chip/ChipDrawable.java. Review transport security and endpoint exposure.

### [MEDIUM] Hardcoded HTTP URL detected

Cleartext HTTP URL found in artifacts/androgoat-api-auto-smoke/jadx/sources/com/google/android/material/chip/Chip.java. Review transport security and endpoint exposure.

### [MEDIUM] Hardcoded HTTP URL detected

Cleartext HTTP URL found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/core/content/res/TypedArrayUtils.java. Review transport security and endpoint exposure.

### [MEDIUM] Hardcoded HTTP URL detected

Cleartext HTTP URL found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/core/content/pm/ShortcutXmlParser.java. Review transport security and endpoint exposure.

### [MEDIUM] Hardcoded HTTP URL detected

Cleartext HTTP URL found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/TrafficActivity.java. Review transport security and endpoint exposure.

### [HIGH] Runtime command execution usage detected

Runtime.getRuntime().exec found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/RootDetectionActivity.java. Review for command execution risk.

### [HIGH] Runtime command execution usage detected

Runtime.getRuntime().exec found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/InputValidationsOSCMDInjectionMain2Activity.java. Review for command execution risk.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/multidex/MultiDexExtractor.java. Review storage of sensitive data.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/core/app/AppLaunchChecker.java. Review storage of sensitive data.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/core/app/AppLaunchChecker.java. Review storage of sensitive data.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/AccessControlIssue1Activity.java. Review storage of sensitive data.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/AccessControlIssue1Activity.java. Review storage of sensitive data.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/AccessControlIssue1Activity.java. Review storage of sensitive data.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/InsecureStorageSharedPrefs1Activity.java. Review storage of sensitive data.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/InsecureStorageSharedPrefs1Activity.java. Review storage of sensitive data.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/InsecureStorageSharedPrefs1Activity.java. Review storage of sensitive data.

### [LOW] SharedPreferences usage detected

SharedPreferences access found in artifacts/androgoat-api-auto-smoke/jadx/sources/owasp/sat/agoat/InsecureStorageSharedPrefs.java. Review storage of sensitive data.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/okio/Okio__JvmOkioKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/okio/Okio__JvmOkioKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/com/google/android/material/color/ColorResourcesLoaderCreator.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__UtilsKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__FileReadWriteKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__FileReadWriteKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__FileReadWriteKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__FileReadWriteKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__FileReadWriteKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__FileReadWriteKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__FileReadWriteKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__FileReadWriteKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/kotlin/io/FilesKt__FileReadWriteKt.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/multidex/MultiDexExtractor.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/print/PrintHelper.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/profileinstaller/DeviceProfileWriter.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/profileinstaller/ProfileInstaller.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/profileinstaller/ProfileVerifier.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/core/util/AtomicFile.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/core/util/AtomicFile.java. Review file output location and sensitivity.

### [LOW] FileOutputStream usage detected

FileOutputStream usage found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/core/graphics/TypefaceCompatUtil.java. Review file output location and sensitivity.

### [LOW] Base64 decode usage detected

Base64 decoding found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/core/content/res/FontResourcesParserCompat.java. Review for encoded secrets, payloads, or obfuscation.

### [LOW] Cryptographic API usage detected

Cipher.getInstance found in artifacts/androgoat-api-auto-smoke/jadx/sources/androidx/biometric/CryptoObjectUtils.java. Review algorithm choice, mode, and key handling.
