package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.LocaleListCompat;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: DeviceDataFactoryImpl.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\"0!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0097@¢\u0006\u0002\u0010&J\n\u0010'\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\n \u000e*\u0004\u0018\u00010\u00170\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u001d\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;", "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;", "context", "Landroid/content/Context;", "appInfoRepository", "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "defaultUserAgent", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "secureFRPMode", "", "audioManager", "Landroid/media/AudioManager;", "packageManager", "Landroid/content/pm/PackageManager;", "Landroid/content/pm/PackageManager;", "apiVersion", "dateFormat", "Ljava/text/SimpleDateFormat;", "dateTime", "codeName", "osName", "timeZone", "create", "", "", "sdkReferenceNumber", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildCodeName", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceDataFactoryImpl implements DeviceDataFactory {
    private static final int MILLIS_IN_SECOND = 1000;
    private static final int SECONDS_IN_MINUTE = 60;
    private final int apiVersion;
    private final AppInfoRepository appInfoRepository;
    private final AudioManager audioManager;
    private final String codeName;
    private final SimpleDateFormat dateFormat;
    private final String dateTime;
    private final String defaultUserAgent;
    private final DisplayMetrics displayMetrics;
    private final MessageVersionRegistry messageVersionRegistry;
    private final String osName;
    private final PackageManager packageManager;
    private final int secureFRPMode;
    private final TelephonyManager telephonyManager;
    private final int timeZone;

    /* compiled from: DeviceDataFactoryImpl.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl", f = "DeviceDataFactoryImpl.kt", i = {0, 0, 0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "create", n = {"this", "sdkReferenceNumber", "sdkTransactionId"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl$create$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceDataFactoryImpl.this.create(null, null, this);
        }
    }

    public DeviceDataFactoryImpl(Context context, AppInfoRepository appInfoRepository, MessageVersionRegistry messageVersionRegistry) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appInfoRepository, "appInfoRepository");
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        this.appInfoRepository = appInfoRepository;
        this.messageVersionRegistry = messageVersionRegistry;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.displayMetrics = displayMetrics;
        this.defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        this.telephonyManager = (TelephonyManager) systemService;
        this.secureFRPMode = Settings.Secure.getInt(context.getContentResolver(), "secure_frp_mode", 0);
        Object systemService2 = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService2;
        this.packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        this.apiVersion = i;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault());
        this.dateFormat = simpleDateFormat;
        this.dateTime = simpleDateFormat.format(Calendar.getInstance().getTime());
        String strBuildCodeName = buildCodeName();
        strBuildCodeName = strBuildCodeName == null ? "UNKNOWN" : strBuildCodeName;
        this.codeName = strBuildCodeName;
        this.osName = "Android " + strBuildCodeName + " " + Build.VERSION.RELEASE + " API " + i;
        this.timeZone = (TimeZone.getDefault().getRawOffset() / 1000) / 60;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.stripe3ds2.init.DeviceDataFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object create(String str, SdkTransactionId sdkTransactionId, Continuation<? super Map<String, ? extends Object>> continuation) {
        AnonymousClass1 anonymousClass1;
        String str2;
        int i;
        SdkTransactionId sdkTransactionId2;
        Pair[] pairArr;
        String str3;
        Pair[] pairArr2;
        DeviceDataFactoryImpl deviceDataFactoryImpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Pair[] pairArr3 = new Pair[13];
            pairArr3[0] = TuplesKt.to(DeviceParam.PARAM_PLATFORM.getCode(), "Android");
            pairArr3[1] = TuplesKt.to(DeviceParam.PARAM_DEVICE_MODEL.getCode(), Build.MANUFACTURER + "||" + Build.MODEL);
            pairArr3[2] = TuplesKt.to(DeviceParam.PARAM_OS_NAME.getCode(), this.osName);
            pairArr3[3] = TuplesKt.to(DeviceParam.PARAM_OS_VERSION.getCode(), Build.VERSION.RELEASE);
            pairArr3[4] = TuplesKt.to(DeviceParam.PARAM_LOCALE.getCode(), LocaleListCompat.create(Locale.getDefault()).toLanguageTags());
            pairArr3[5] = TuplesKt.to(DeviceParam.PARAM_TIME_ZONE.getCode(), String.valueOf(this.timeZone));
            String code = DeviceParam.PARAM_SCREEN_RESOLUTION.getCode();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str4 = String.format(Locale.ROOT, "%sx%s", Arrays.copyOf(new Object[]{Boxing.boxInt(this.displayMetrics.heightPixels), Boxing.boxInt(this.displayMetrics.widthPixels)}, 2));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            pairArr3[6] = TuplesKt.to(code, str4);
            String code2 = DeviceParam.PARAM_SDK_APP_ID.getCode();
            AppInfoRepository appInfoRepository = this.appInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.L$2 = sdkTransactionId;
            anonymousClass1.L$3 = pairArr3;
            anonymousClass1.L$4 = pairArr3;
            anonymousClass1.L$5 = code2;
            anonymousClass1.I$0 = 7;
            anonymousClass1.label = 1;
            Object obj2 = appInfoRepository.get(anonymousClass1);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            i = 7;
            sdkTransactionId2 = sdkTransactionId;
            pairArr = pairArr3;
            str3 = code2;
            pairArr2 = pairArr;
            obj = obj2;
            deviceDataFactoryImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = anonymousClass1.I$0;
            str3 = (String) anonymousClass1.L$5;
            pairArr = (Pair[]) anonymousClass1.L$4;
            pairArr2 = (Pair[]) anonymousClass1.L$3;
            sdkTransactionId2 = (SdkTransactionId) anonymousClass1.L$2;
            str2 = (String) anonymousClass1.L$1;
            deviceDataFactoryImpl = (DeviceDataFactoryImpl) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        pairArr[i] = TuplesKt.to(str3, ((AppInfo) obj).getSdkAppId());
        pairArr2[8] = TuplesKt.to(DeviceParam.PARAM_SDK_VERSION.getCode(), deviceDataFactoryImpl.messageVersionRegistry.getCurrent());
        pairArr2[9] = TuplesKt.to(DeviceParam.PARAM_SDK_REF_NUMBER.getCode(), str2);
        pairArr2[10] = TuplesKt.to(DeviceParam.PARAM_DATE_TIME.getCode(), deviceDataFactoryImpl.dateTime);
        pairArr2[11] = TuplesKt.to(DeviceParam.PARAM_SDK_TRANS_ID.getCode(), sdkTransactionId2.toString());
        pairArr2[12] = TuplesKt.to(DeviceParam.PARAM_WEB_VIEW_USER_AGENT.getCode(), deviceDataFactoryImpl.defaultUserAgent);
        HashMap mapHashMapOf = MapsKt.hashMapOf(pairArr2);
        if (deviceDataFactoryImpl.apiVersion >= 28) {
            HashMap map = mapHashMapOf;
            map.put(DeviceParam.PARAM_SIM_CARRIER_ID.getCode(), String.valueOf(deviceDataFactoryImpl.telephonyManager.getSimCarrierId()));
            map.put(DeviceParam.PARAM_SIM_CARRIER_ID_NAME.getCode(), String.valueOf(deviceDataFactoryImpl.telephonyManager.getSimCarrierIdName()));
        }
        if (deviceDataFactoryImpl.apiVersion >= 29) {
            HashMap map2 = mapHashMapOf;
            map2.put(DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID.getCode(), String.valueOf(deviceDataFactoryImpl.telephonyManager.getSimSpecificCarrierId()));
            map2.put(DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID_NAME.getCode(), String.valueOf(deviceDataFactoryImpl.telephonyManager.getSimSpecificCarrierIdName()));
            if (deviceDataFactoryImpl.packageManager.hasSystemFeature("android.hardware.telephony.ims")) {
                map2.put(DeviceParam.PARAM_RTT_CALLING_MODE.getCode(), String.valueOf(deviceDataFactoryImpl.telephonyManager.isRttSupported()));
            }
        }
        if (deviceDataFactoryImpl.apiVersion >= 30) {
            HashMap map3 = mapHashMapOf;
            map3.put(DeviceParam.PARAM_SUBSCRIPTION_ID.getCode(), String.valueOf(deviceDataFactoryImpl.telephonyManager.getSubscriptionId()));
            map3.put(DeviceParam.PARAM_SECURE_FRP_MODE.getCode(), deviceDataFactoryImpl.secureFRPMode == 1 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : Constants.CASEFIRST_FALSE);
        }
        if (deviceDataFactoryImpl.apiVersion >= 31) {
            HashMap map4 = mapHashMapOf;
            map4.put(DeviceParam.PARAM_HARDWARE_SKU.getCode(), Build.SKU);
            map4.put(DeviceParam.PARAM_SOC_MANUFACTURER.getCode(), Build.SOC_MANUFACTURER);
            map4.put(DeviceParam.PARAM_SOC_MODEL.getCode(), Build.SOC_MODEL);
        }
        if (deviceDataFactoryImpl.apiVersion >= 33) {
            mapHashMapOf.put(DeviceParam.PARAM_APPLY_RAMPING_RINGER.getCode(), String.valueOf(deviceDataFactoryImpl.audioManager.isRampingRingerEnabled()));
        }
        return mapHashMapOf;
    }

    private final String buildCodeName() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        int i;
        Field[] fields = Build.VERSION_CODES.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        for (Field field : fields) {
            String name = field.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            try {
                i = field.getInt(new Object());
            } catch (IllegalAccessException | IllegalArgumentException | NullPointerException unused) {
                i = -1;
            }
            if (i == Build.VERSION.SDK_INT) {
                return name;
            }
        }
        return null;
    }
}
