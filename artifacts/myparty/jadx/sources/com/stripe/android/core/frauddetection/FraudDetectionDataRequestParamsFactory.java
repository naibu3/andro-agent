package com.stripe.android.core.frauddetection;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.stripe.android.core.utils.ContextUtils;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FraudDetectionDataRequestParamsFactory.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B+\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0010H\u0002J\u001e\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;", "", "displayMetrics", "Landroid/util/DisplayMetrics;", "packageName", "", "versionName", "timeZone", "<init>", "(Landroid/util/DisplayMetrics;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "screen", "androidVersionString", "createParams", "", "fraudDetectionData", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "createParams$stripe_core_release", "createFirstMap", "createSecondMap", "createValueMap", "value", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FraudDetectionDataRequestParamsFactory {
    private static final Companion Companion = new Companion(null);
    private final String androidVersionString;
    private final DisplayMetrics displayMetrics;
    private final String packageName;
    private final String screen;
    private final String timeZone;
    private final String versionName;

    public FraudDetectionDataRequestParamsFactory(DisplayMetrics displayMetrics, String packageName, String str, String timeZone) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        this.displayMetrics = displayMetrics;
        this.packageName = packageName;
        this.versionName = str;
        this.timeZone = timeZone;
        this.screen = displayMetrics.widthPixels + "w_" + displayMetrics.heightPixels + "h_" + displayMetrics.densityDpi + "dpi";
        this.androidVersionString = "Android " + Build.VERSION.RELEASE + " " + Build.VERSION.CODENAME + " " + Build.VERSION.SDK_INT;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FraudDetectionDataRequestParamsFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        String packageName = context.getPackageName();
        packageName = packageName == null ? "" : packageName;
        PackageInfo packageInfo = ContextUtils.INSTANCE.getPackageInfo(context);
        this(displayMetrics, packageName, packageInfo != null ? packageInfo.versionName : null, Companion.createTimezone());
    }

    public final /* synthetic */ Map createParams$stripe_core_release(FraudDetectionData fraudDetectionData) {
        return MapsKt.mapOf(TuplesKt.to("v2", 1), TuplesKt.to("tag", "21.22.2"), TuplesKt.to("src", "android-sdk"), TuplesKt.to("a", createFirstMap()), TuplesKt.to("b", createSecondMap(fraudDetectionData)));
    }

    private final Map<String, Object> createFirstMap() {
        String string = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return MapsKt.mapOf(TuplesKt.to("c", createValueMap(string)), TuplesKt.to("d", createValueMap(this.androidVersionString)), TuplesKt.to("f", createValueMap(this.screen)), TuplesKt.to("g", createValueMap(this.timeZone)));
    }

    private final Map<String, Object> createSecondMap(FraudDetectionData fraudDetectionData) {
        Pair[] pairArr = new Pair[9];
        String muid = fraudDetectionData != null ? fraudDetectionData.getMuid() : null;
        if (muid == null) {
            muid = "";
        }
        pairArr[0] = TuplesKt.to("d", muid);
        String sid = fraudDetectionData != null ? fraudDetectionData.getSid() : null;
        pairArr[1] = TuplesKt.to(JWKParameterNames.RSA_EXPONENT, sid != null ? sid : "");
        pairArr[2] = TuplesKt.to(JWKParameterNames.OCT_KEY_VALUE, this.packageName);
        pairArr[3] = TuplesKt.to("o", Build.VERSION.RELEASE);
        pairArr[4] = TuplesKt.to("p", Integer.valueOf(Build.VERSION.SDK_INT));
        pairArr[5] = TuplesKt.to(JWKParameterNames.RSA_SECOND_PRIME_FACTOR, Build.MANUFACTURER);
        pairArr[6] = TuplesKt.to(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, Build.BRAND);
        pairArr[7] = TuplesKt.to("s", Build.MODEL);
        pairArr[8] = TuplesKt.to(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, Build.TAGS);
        Map mapMapOf = MapsKt.mapOf(pairArr);
        String str = this.versionName;
        Map mapMapOf2 = str != null ? MapsKt.mapOf(TuplesKt.to("l", str)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapMapOf, mapMapOf2);
    }

    private final Map<String, Object> createValueMap(String value) {
        return MapsKt.mapOf(TuplesKt.to("v", value));
    }

    /* compiled from: FraudDetectionDataRequestParamsFactory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory$Companion;", "", "<init>", "()V", "createTimezone", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createTimezone() {
            int iConvert = (int) TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS);
            if (iConvert % 60 == 0) {
                return String.valueOf(iConvert / 60);
            }
            String string = new BigDecimal(iConvert).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }
}
