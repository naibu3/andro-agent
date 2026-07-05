package com.qonversion.android.sdk.internal.dto.config;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.BuildConfig;
import com.qonversion.android.sdk.dto.QEnvironment;
import com.qonversion.android.sdk.dto.QLaunchMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrimaryConfig.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006%"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;", "", "projectKey", "", "launchMode", "Lcom/qonversion/android/sdk/dto/QLaunchMode;", "environment", "Lcom/qonversion/android/sdk/dto/QEnvironment;", "proxyUrl", "isKidsMode", "", "sendFbAttribution", "sdkVersion", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;Lcom/qonversion/android/sdk/dto/QEnvironment;Ljava/lang/String;ZZLjava/lang/String;)V", "getEnvironment", "()Lcom/qonversion/android/sdk/dto/QEnvironment;", "()Z", "getLaunchMode", "()Lcom/qonversion/android/sdk/dto/QLaunchMode;", "getProjectKey", "()Ljava/lang/String;", "getProxyUrl", "getSdkVersion", "getSendFbAttribution", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class PrimaryConfig {
    private final QEnvironment environment;
    private final boolean isKidsMode;
    private final QLaunchMode launchMode;
    private final String projectKey;
    private final String proxyUrl;
    private final String sdkVersion;
    private final boolean sendFbAttribution;

    public static /* synthetic */ PrimaryConfig copy$default(PrimaryConfig primaryConfig, String str, QLaunchMode qLaunchMode, QEnvironment qEnvironment, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primaryConfig.projectKey;
        }
        if ((i & 2) != 0) {
            qLaunchMode = primaryConfig.launchMode;
        }
        QLaunchMode qLaunchMode2 = qLaunchMode;
        if ((i & 4) != 0) {
            qEnvironment = primaryConfig.environment;
        }
        QEnvironment qEnvironment2 = qEnvironment;
        if ((i & 8) != 0) {
            str2 = primaryConfig.proxyUrl;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = primaryConfig.isKidsMode;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = primaryConfig.sendFbAttribution;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            str3 = primaryConfig.sdkVersion;
        }
        return primaryConfig.copy(str, qLaunchMode2, qEnvironment2, str4, z3, z4, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProjectKey() {
        return this.projectKey;
    }

    /* renamed from: component2, reason: from getter */
    public final QLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component3, reason: from getter */
    public final QEnvironment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsKidsMode() {
        return this.isKidsMode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSendFbAttribution() {
        return this.sendFbAttribution;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final PrimaryConfig copy(String projectKey, QLaunchMode launchMode, QEnvironment environment, String proxyUrl, boolean isKidsMode, boolean sendFbAttribution, String sdkVersion) {
        Intrinsics.checkNotNullParameter(projectKey, "projectKey");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return new PrimaryConfig(projectKey, launchMode, environment, proxyUrl, isKidsMode, sendFbAttribution, sdkVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryConfig)) {
            return false;
        }
        PrimaryConfig primaryConfig = (PrimaryConfig) other;
        return Intrinsics.areEqual(this.projectKey, primaryConfig.projectKey) && this.launchMode == primaryConfig.launchMode && this.environment == primaryConfig.environment && Intrinsics.areEqual(this.proxyUrl, primaryConfig.proxyUrl) && this.isKidsMode == primaryConfig.isKidsMode && this.sendFbAttribution == primaryConfig.sendFbAttribution && Intrinsics.areEqual(this.sdkVersion, primaryConfig.sdkVersion);
    }

    public int hashCode() {
        int iHashCode = ((((this.projectKey.hashCode() * 31) + this.launchMode.hashCode()) * 31) + this.environment.hashCode()) * 31;
        String str = this.proxyUrl;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isKidsMode)) * 31) + Boolean.hashCode(this.sendFbAttribution)) * 31) + this.sdkVersion.hashCode();
    }

    public String toString() {
        return "PrimaryConfig(projectKey=" + this.projectKey + ", launchMode=" + this.launchMode + ", environment=" + this.environment + ", proxyUrl=" + this.proxyUrl + ", isKidsMode=" + this.isKidsMode + ", sendFbAttribution=" + this.sendFbAttribution + ", sdkVersion=" + this.sdkVersion + ")";
    }

    public PrimaryConfig(String projectKey, QLaunchMode launchMode, QEnvironment environment, String str, boolean z, boolean z2, String sdkVersion) {
        Intrinsics.checkNotNullParameter(projectKey, "projectKey");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.projectKey = projectKey;
        this.launchMode = launchMode;
        this.environment = environment;
        this.proxyUrl = str;
        this.isKidsMode = z;
        this.sendFbAttribution = z2;
        this.sdkVersion = sdkVersion;
    }

    public final String getProjectKey() {
        return this.projectKey;
    }

    public final QLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final QEnvironment getEnvironment() {
        return this.environment;
    }

    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    public final boolean isKidsMode() {
        return this.isKidsMode;
    }

    public final boolean getSendFbAttribution() {
        return this.sendFbAttribution;
    }

    public /* synthetic */ PrimaryConfig(String str, QLaunchMode qLaunchMode, QEnvironment qEnvironment, String str2, boolean z, boolean z2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qLaunchMode, qEnvironment, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? BuildConfig.VERSION_NAME : str3);
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }
}
