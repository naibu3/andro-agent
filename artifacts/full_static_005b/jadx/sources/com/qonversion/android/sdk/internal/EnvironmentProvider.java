package com.qonversion.android.sdk.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.device.Os;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnvironmentProvider.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0003J\u0012\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00060\u0006H\u0002J\u0010\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\u00060\u0006H\u0002J\u0006\u0010\u000f\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/qonversion/android/sdk/internal/EnvironmentProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCarrier", "", "getCountry", "kotlin.jvm.PlatformType", "getDeviceId", "getInfo", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "idfa", "getLocale", "getTimeZone", "getVersionName", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class EnvironmentProvider {
    private static final String UNKNOWN = "UNKNOWN";
    private final Context context;

    public EnvironmentProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ Environment getInfo$default(EnvironmentProvider environmentProvider, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return environmentProvider.getInfo(str);
    }

    public final Environment getInfo(String idfa) {
        String versionName = getVersionName();
        String carrier = getCarrier();
        String deviceId = getDeviceId();
        String locale = getLocale();
        Intrinsics.checkNotNullExpressionValue(locale, "getLocale(...)");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String name = new Os(null, null, 3, null).getName();
        String version = new Os(null, null, 3, null).getVersion();
        String timeZone = getTimeZone();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
        String country = getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return new Environment(versionName, carrier, deviceId, locale, MANUFACTURER, MODEL, name, version, timeZone, ApiHeadersProvider.ANDROID_PLATFORM, country, idfa);
    }

    public final String getVersionName() {
        PackageInfo packageInfo;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            } else {
                packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            }
            String str = packageInfo.versionName;
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Throwable unused) {
            return UNKNOWN;
        }
    }

    private final String getDeviceId() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String getCarrier() {
        Object systemService = this.context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        Intrinsics.checkNotNullExpressionValue(networkOperatorName, "getNetworkOperatorName(...)");
        return networkOperatorName;
    }

    private final String getLocale() {
        return Locale.getDefault().getLanguage();
    }

    private final String getCountry() {
        return Locale.getDefault().getCountry();
    }

    private final String getTimeZone() {
        return TimeZone.getDefault().getID();
    }
}
