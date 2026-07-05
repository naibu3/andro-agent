package com.qonversion.android.sdk.internal.api;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* compiled from: ApiHeadersProvider.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u001c\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\n0\n0\u000fH\u0002J\u0010\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\n0\nH\u0002J\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "", "config", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "sharedPreferencesCache", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "environmentProvider", "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;", "(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)V", "projectKey", "", "getHeaders", "Lokhttp3/Headers;", "specificHeaders", "getHeadersMap", "", "kotlin.jvm.PlatformType", "getLocale", "getPlatform", "getPlatformVersion", "getProjectKey", "getSource", "getSourceVersion", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ApiHeadersProvider {
    public static final String ANDROID_PLATFORM = "android";
    public static final String APP_VERSION = "app-version";
    public static final String AUTHORIZATION = "Authorization";
    public static final String CONTENT_TYPE = "Content-Type";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEBUG_MODE_KEY = "test_";
    public static final String PLATFORM = "Platform";
    public static final String PLATFORM_VERSION = "Platform-Version";
    public static final String PREFS_SOURCE_KEY = "com.qonversion.keys.source";
    public static final String PREFS_SOURCE_VERSION_KEY = "com.qonversion.keys.sourceVersion";
    public static final String SOURCE = "Source";
    public static final String SOURCE_VERSION = "Source-Version";
    public static final String UID = "User-Id";
    public static final String USER_LOCALE = "User-Locale";
    private final InternalConfig config;
    private final EnvironmentProvider environmentProvider;
    private final String projectKey;
    private final SharedPreferencesCache sharedPreferencesCache;

    @Inject
    public ApiHeadersProvider(InternalConfig config, SharedPreferencesCache sharedPreferencesCache, EnvironmentProvider environmentProvider) {
        String projectKey;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sharedPreferencesCache, "sharedPreferencesCache");
        Intrinsics.checkNotNullParameter(environmentProvider, "environmentProvider");
        this.config = config;
        this.sharedPreferencesCache = sharedPreferencesCache;
        this.environmentProvider = environmentProvider;
        if (config.isSandbox()) {
            projectKey = DEBUG_MODE_KEY + config.getPrimaryConfig().getProjectKey();
        } else {
            projectKey = config.getPrimaryConfig().getProjectKey();
        }
        this.projectKey = projectKey;
    }

    private final String getLocale() {
        return Locale.getDefault().getLanguage();
    }

    public final Headers getHeaders(Headers specificHeaders) {
        Intrinsics.checkNotNullParameter(specificHeaders, "specificHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, String> entry : getHeadersMap().entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        Set<String> setNames = specificHeaders.names();
        Intrinsics.checkNotNullExpressionValue(setNames, "names(...)");
        for (String str : setNames) {
            String str2 = specificHeaders.get(str);
            if (str2 != null) {
                builder.add(str, str2);
            }
        }
        Headers headersBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(headersBuild, "build(...)");
        return headersBuild;
    }

    private final Map<String, String> getHeadersMap() {
        return MapsKt.mapOf(TuplesKt.to("Content-Type", "application/json"), TuplesKt.to("Authorization", INSTANCE.getBearer(getProjectKey())), TuplesKt.to(APP_VERSION, this.environmentProvider.getVersionName()), TuplesKt.to(USER_LOCALE, getLocale()), TuplesKt.to(SOURCE, getSource()), TuplesKt.to(SOURCE_VERSION, getSourceVersion()), TuplesKt.to(PLATFORM, getPlatform()), TuplesKt.to(PLATFORM_VERSION, getPlatformVersion()), TuplesKt.to(UID, this.config.getUid()));
    }

    public final String getProjectKey() {
        return this.projectKey;
    }

    public final String getPlatform() {
        return ANDROID_PLATFORM;
    }

    public final String getPlatformVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    public final String getSource() {
        String string = this.sharedPreferencesCache.getString("com.qonversion.keys.source", null);
        return string == null ? ANDROID_PLATFORM : string;
    }

    public final String getSourceVersion() {
        String string = this.sharedPreferencesCache.getString("com.qonversion.keys.sourceVersion", null);
        return string == null ? this.config.getPrimaryConfig().getSdkVersion() : string;
    }

    /* compiled from: ApiHeadersProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider$Companion;", "", "()V", "ANDROID_PLATFORM", "", "APP_VERSION", "AUTHORIZATION", "CONTENT_TYPE", "DEBUG_MODE_KEY", "PLATFORM", "PLATFORM_VERSION", "PREFS_SOURCE_KEY", "PREFS_SOURCE_VERSION_KEY", "SOURCE", "SOURCE_VERSION", "UID", "USER_LOCALE", "getBearer", "projectKey", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getBearer(String projectKey) {
            Intrinsics.checkNotNullParameter(projectKey, "projectKey");
            return "Bearer " + projectKey;
        }
    }
}
