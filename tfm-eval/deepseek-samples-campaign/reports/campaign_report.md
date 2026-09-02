# Native DeepSeek samples campaign

## Overall status: Partially OK

The campaign contains 4 APKs and 17 run rows.

## DeepSeek status

- Native provider model: `deepseek-chat`.
- Preflight connectivity and agentic execution succeeded.
- Investigation termination reasons: {'budget_exhausted': 4}.
- Model fallback used by 0 cases.

## APK inventory

Total: 4; MASTG: 3; BB: 1.
- Wolt Partner.apk — `bb-001-acce5bc80c53`
- AndroGoat.apk — `mastg-001-3e6f6b538b82`
- BugBazaar_v1.2.1.apk — `mastg-002-c307c7856b27`
- InsecureBankv2.apk — `mastg-003-b18af2a0e44d`

## Static no-LLM results

Completed: 4/4; findings range: 63–669.
- Wolt Partner.apk: findings=669, evidence=669.
- AndroGoat.apk: findings=63, evidence=63.
- BugBazaar_v1.2.1.apk: findings=357, evidence=357.
- InsecureBankv2.apk: findings=112, evidence=112.

## DeepSeek full agentic results

- Wolt Partner.apk: status=completed, termination=budget_exhausted, tools=20, hypotheses=5, candidates=7, evidence-backed=7; top: WebView bridge in bu0/d.java may expose sensitive app functions to JavaScript, OAuthActivity exported without permission may allow intent-based parameter tampering, WebView JavaScript interface in bu0/d.java may be reachable by untrusted content leading to method exposure, Exported OAuthActivity without permission may allow intent injection into OAuth flow.
- AndroGoat.apk: status=completed, termination=budget_exhausted, tools=20, hypotheses=2, candidates=2, evidence-backed=2; top: OS Command Injection via ping command in InputValidationsOSCMDInjectionMain2Activity, Insecure SQL injection in InsecureStorageSQLiteActivity INSERT query, OS Command Injection via ping command, SQL Injection in InsecureStorageSQLiteActivity INSERT statement.
- BugBazaar_v1.2.1.apk: status=completed, termination=budget_exhausted, tools=20, hypotheses=1, candidates=2, evidence-backed=2; top: Deeplink activity processes arbitrary intents and may lead to client-side injection, WebView JavaScript interface exposed with unsafe settings in TermsAndConditionsActivity, Razorpay WebView JavaScript bridge exposed to potentially untrusted content.
- InsecureBankv2.apk: status=completed, termination=budget_exhausted, tools=20, hypotheses=4, candidates=7, evidence-backed=7; top: Exported activities enable unauthorized invocation of sensitive banking operations, Exported provider exposes sensitive user statements to other apps, Exported PostLogin activity can be launched by any app, Exported DoTransfer activity enables unauthorized fund transfers.

## Dynamic results

Install successes: 4/8; launch successes: 4/8; observations range: 0–749.
- `deepseek-campaign-bb-001-acce5bc80c53-dynamic`: install_failed.
- `deepseek-campaign-mastg-003-b18af2a0e44d-dynamic`: install_failed.
- `deepseek-campaign-bb-001-acce5bc80c53-dynamic-api-auto`: install_failed.
- `deepseek-campaign-mastg-003-b18af2a0e44d-dynamic-api-auto`: install_failed.

## API auto-discovery

- Wolt Partner.apk: candidates=1, selected=1; selected: https://api.trace.spankind; skipped: none.
- AndroGoat.apk: candidates=2, selected=0; selected: none; skipped: http://schemas.android.com/apk/res-auto (framework_schema_url), http://schemas.android.com/apk/res/android (framework_schema_url).
- BugBazaar_v1.2.1.apk: candidates=4, selected=2; selected: https://issuetracker.google.com/issues/new, https://www.example.com; skipped: http://schemas.android.com/apk/res/android (framework_schema_url), https://storage.googleapis.com/captions/captions_i18n_v0_20210623_manifest.json (third_party_infrastructure_url).
- InsecureBankv2.apk: candidates=75, selected=5; selected: https://api.api.apioptions, https://api.api.client, https://api.api.zza; skipped: https://api.GoogleApiClient.OnConnectionFailedListener (malformed_or_unsupported_url), http://hostname/? (malformed_or_unsupported_url), https://api.GoogleApiClient.OnConnectionFailedListener (malformed_or_unsupported_url).

Real API probing was off for every auto-discovery case.

## Local API probing control

Requests: 14/20; actually sent methods: {'HEAD': 1, 'OPTIONS': 1, 'GET': 10}; skipped mutating methods: 2; findings=2; evidence=2.

## Safety

- No DEEPSEEK_API_KEY leakage detected.
- No mutating request was sent.
- No real discovered API was probed.
- JSON artifacts parsed successfully.

## Limitations

- Emulator availability may prevent install, launch, and runtime observations.
- API extraction may include framework, schema, infrastructure, or documentation candidates.
- Generated artifacts are untracked; no commit was created.
