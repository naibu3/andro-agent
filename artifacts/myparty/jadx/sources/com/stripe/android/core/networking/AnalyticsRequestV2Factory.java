package com.stripe.android.core.networking;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.provider.Settings;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.utils.ContextUtils;
import com.stripe.android.core.utils.PluginDetector;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AnalyticsRequestV2Factory.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;", "", "context", "Landroid/content/Context;", "clientId", "", "origin", "pluginType", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "appContext", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "createRequest", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "additionalParams", "", "includeSDKParams", "", "sdkParams", "getAppName", "", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnalyticsRequestV2Factory {
    public static final String PARAM_PACKAGE_NAME = "package_name";
    public static final String PARAM_PLATFORM_INFO = "platform_info";
    public static final String PARAM_PLUGIN_TYPE = "plugin_type";
    public static final String PARAM_SDK_PLATFORM = "sdk_platform";
    public static final String PARAM_SDK_VERSION = "sdk_version";
    public static final String PLUGIN_NATIVE = "native";
    private final Context appContext;
    private final String clientId;
    private final String origin;
    private final String pluginType;

    public AnalyticsRequestV2Factory(Context context, String clientId, String origin, String pluginType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(pluginType, "pluginType");
        this.clientId = clientId;
        this.origin = origin;
        this.pluginType = pluginType;
        this.appContext = context.getApplicationContext();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnalyticsRequestV2Factory(Context context, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0 && (str3 = PluginDetector.INSTANCE.getPluginType()) == null) {
            str3 = "native";
        }
        this(context, str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsRequestV2 createRequest$default(AnalyticsRequestV2Factory analyticsRequestV2Factory, String str, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return analyticsRequestV2Factory.createRequest(str, map, z);
    }

    public final AnalyticsRequestV2 createRequest(String eventName, Map<String, ? extends Object> additionalParams, boolean includeSDKParams) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        AnalyticsRequestV2.Companion companion = AnalyticsRequestV2.INSTANCE;
        String str = this.clientId;
        String str2 = this.origin;
        if (includeSDKParams) {
            additionalParams = MapsKt.plus(additionalParams, sdkParams());
        }
        return companion.create(eventName, str, str2, additionalParams);
    }

    private final Map<String, Object> sdkParams() {
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.to(AnalyticsFields.OS_VERSION, Integer.valueOf(Build.VERSION.SDK_INT));
        pairArr[1] = TuplesKt.to(PARAM_SDK_PLATFORM, "android");
        pairArr[2] = TuplesKt.to(PARAM_SDK_VERSION, "21.22.2");
        pairArr[3] = TuplesKt.to(AnalyticsFields.DEVICE_TYPE, Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL);
        pairArr[4] = TuplesKt.to("app_name", getAppName());
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        PackageInfo packageInfo = contextUtils.getPackageInfo(appContext);
        pairArr[5] = TuplesKt.to(AnalyticsFields.APP_VERSION, packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null);
        pairArr[6] = TuplesKt.to(AnalyticsFields.DEVICE_ID, Settings.Secure.getString(this.appContext.getContentResolver(), "android_id"));
        pairArr[7] = TuplesKt.to("plugin_type", this.pluginType);
        pairArr[8] = TuplesKt.to(PARAM_PLATFORM_INFO, MapsKt.mapOf(TuplesKt.to(PARAM_PACKAGE_NAME, this.appContext.getPackageName())));
        return MapsKt.mapOf(pairArr);
    }

    private final CharSequence getAppName() {
        ApplicationInfo applicationInfo;
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        PackageInfo packageInfo = contextUtils.getPackageInfo(appContext);
        CharSequence charSequence = null;
        CharSequence charSequenceLoadLabel = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(this.appContext.getPackageManager());
        if (charSequenceLoadLabel != null && !StringsKt.isBlank(charSequenceLoadLabel)) {
            charSequence = charSequenceLoadLabel;
        }
        if (charSequence != null) {
            return charSequence;
        }
        String packageName = this.appContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }
}
