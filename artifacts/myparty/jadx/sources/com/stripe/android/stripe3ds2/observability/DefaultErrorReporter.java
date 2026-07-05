package com.stripe.android.stripe3ds2.observability;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transaction.Logger;
import expo.modules.notifications.service.NotificationsService;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DefaultErrorReporter.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 /2\u00020\u0001:\u0003-./BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\u0015\u0010#\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u0019H\u0001¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b(J\r\u0010)\u001a\u00020\rH\u0001¢\u0006\u0002\b*J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "context", "Landroid/content/Context;", "config", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "logger", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "sentryConfig", "Lcom/stripe/android/stripe3ds2/observability/SentryConfig;", "environment", "", "localeCountry", "osVersion", "", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/observability/SentryConfig;Ljava/lang/String;Ljava/lang/String;I)V", "reportError", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "", "send", "requestBody", "Lorg/json/JSONObject;", "logResponse", "connection", "Ljavax/net/ssl/HttpsURLConnection;", "responseCode", "getResponseBody", "responseStream", "Ljava/io/InputStream;", "createPostConnection", "openConnection", "createRequestBody", "createRequestBody$3ds2sdk_release", "createRequestContexts", "createRequestContexts$3ds2sdk_release", "createRequestStacktrace", "createRequestStacktrace$3ds2sdk_release", "createSentryAuthHeader", "createSentryAuthHeader$3ds2sdk_release", "onFailure", NotificationsService.EXCEPTION_KEY, "Config", "EmptyConfig", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultErrorReporter implements ErrorReporter {
    private static final String CONTENT_TYPE = "application/json; charset=utf-8";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String HEADER_SENTRY_AUTH = "X-Sentry-Auth";
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final String HOST = "https://errors.stripe.com";
    private static final String HTTP_METHOD = "POST";
    private static final String USER_AGENT = "Android3ds2Sdk 21.22.2";
    private final Config config;
    private final Context context;
    private final String environment;
    private final String localeCountry;
    private final Logger logger;
    private final int osVersion;
    private final SentryConfig sentryConfig;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    private static final String CHARSET = StandardCharsets.UTF_8.name();

    /* compiled from: DefaultErrorReporter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "", "customTags", "", "", "getCustomTags", "()Ljava/util/Map;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Config {
        Map<String, String> getCustomTags();
    }

    private final void logResponse(HttpsURLConnection connection, int responseCode) {
    }

    public DefaultErrorReporter(Context context, Config config, CoroutineContext workContext, Logger logger, SentryConfig sentryConfig, String environment, String localeCountry, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(sentryConfig, "sentryConfig");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(localeCountry, "localeCountry");
        this.context = context;
        this.config = config;
        this.workContext = workContext;
        this.logger = logger;
        this.sentryConfig = sentryConfig;
        this.environment = environment;
        this.localeCountry = localeCountry;
        this.osVersion = i;
    }

    public /* synthetic */ DefaultErrorReporter(Context context, Config config, CoroutineContext coroutineContext, Logger logger, SentryConfig sentryConfig, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? EmptyConfig.INSTANCE : config, (i2 & 4) != 0 ? Dispatchers.getIO() : coroutineContext, (i2 & 8) != 0 ? Logger.Noop.INSTANCE : logger, (i2 & 16) != 0 ? DefaultSentryConfig.INSTANCE : sentryConfig, (i2 & 32) != 0 ? "release" : str, (i2 & 64) != 0 ? Locale.getDefault().getCountry() : str2, (i2 & 128) != 0 ? Build.VERSION.SDK_INT : i);
    }

    /* compiled from: DefaultErrorReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$reportError$1", f = "DefaultErrorReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$reportError$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $t;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Throwable th, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$t = th;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DefaultErrorReporter.this.new AnonymousClass1(this.$t, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DefaultErrorReporter defaultErrorReporter = DefaultErrorReporter.this;
            Throwable th = this.$t;
            try {
                Result.Companion companion = Result.INSTANCE;
                defaultErrorReporter.send(defaultErrorReporter.createRequestBody$3ds2sdk_release(th));
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th2));
            }
            DefaultErrorReporter defaultErrorReporter2 = DefaultErrorReporter.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                defaultErrorReporter2.onFailure(thM9121exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.stripe3ds2.observability.ErrorReporter
    public void reportError(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(t, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void send(JSONObject requestBody) throws IOException {
        HttpsURLConnection httpsURLConnectionCreatePostConnection = createPostConnection();
        OutputStreamWriter outputStream = httpsURLConnectionCreatePostConnection.getOutputStream();
        try {
            OutputStream outputStream2 = outputStream;
            Intrinsics.checkNotNull(outputStream2);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            outputStream = new OutputStreamWriter(outputStream2, UTF_8);
            try {
                OutputStreamWriter outputStreamWriter = outputStream;
                outputStreamWriter.write(requestBody.toString());
                outputStreamWriter.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
                httpsURLConnectionCreatePostConnection.connect();
                logResponse(httpsURLConnectionCreatePostConnection, httpsURLConnectionCreatePostConnection.getResponseCode());
                httpsURLConnectionCreatePostConnection.disconnect();
            } finally {
            }
        } finally {
        }
    }

    private final String getResponseBody(InputStream responseStream) {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultErrorReporter defaultErrorReporter = this;
            Scanner scannerUseDelimiter = new Scanner(responseStream, CHARSET).useDelimiter("\\A");
            objM9118constructorimpl = Result.m9118constructorimpl(scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        String str = (String) (Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
        return str == null ? "" : str;
    }

    private final HttpsURLConnection createPostConnection() throws IOException {
        HttpsURLConnection httpsURLConnectionOpenConnection = openConnection();
        httpsURLConnectionOpenConnection.setRequestMethod("POST");
        httpsURLConnectionOpenConnection.setDoOutput(true);
        for (Map.Entry entry : MapsKt.mapOf(TuplesKt.to("Content-Type", CONTENT_TYPE), TuplesKt.to("User-Agent", USER_AGENT), TuplesKt.to(HEADER_SENTRY_AUTH, createSentryAuthHeader$3ds2sdk_release())).entrySet()) {
            httpsURLConnectionOpenConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return httpsURLConnectionOpenConnection;
    }

    private final HttpsURLConnection openConnection() throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL("https://errors.stripe.com/api/" + this.sentryConfig.getProjectId() + "/store/").openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        return (HttpsURLConnection) uRLConnectionOpenConnection;
    }

    public final /* synthetic */ JSONObject createRequestBody$3ds2sdk_release(Throwable t) throws JSONException {
        Intrinsics.checkNotNullParameter(t, "t");
        JSONObject jSONObjectPut = new JSONObject().put("release", "com.stripe.android.stripe3ds2@21.22.2");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectPut2 = new JSONObject().put("type", t.getClass().getCanonicalName());
        String message = t.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject jSONObjectPut3 = jSONObjectPut.put(NotificationsService.EXCEPTION_KEY, jSONObject.put("values", jSONArray.put(jSONObjectPut2.put("value", message).put("stacktrace", createRequestStacktrace$3ds2sdk_release(t)))));
        JSONObject jSONObjectPut4 = new JSONObject().put("locale", this.localeCountry).put("environment", this.environment).put("android_os_version", this.osVersion);
        for (Map.Entry<String, String> entry : this.config.getCustomTags().entrySet()) {
            jSONObjectPut4.put(entry.getKey(), entry.getValue());
        }
        Unit unit = Unit.INSTANCE;
        JSONObject jSONObjectPut5 = jSONObjectPut3.put("tags", jSONObjectPut4).put("contexts", createRequestContexts$3ds2sdk_release());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut5, "put(...)");
        return jSONObjectPut5;
    }

    public final /* synthetic */ JSONObject createRequestContexts$3ds2sdk_release() throws JSONException {
        Object objM9118constructorimpl;
        ApplicationInfo applicationInfo;
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultErrorReporter defaultErrorReporter = this;
            objM9118constructorimpl = Result.m9118constructorimpl(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = null;
        }
        PackageInfo packageInfo = (PackageInfo) objM9118constructorimpl;
        CharSequence charSequenceLoadLabel = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(this.context.getPackageManager());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectPut = new JSONObject().put("app_identifier", this.context.getPackageName()).put("app_name", charSequenceLoadLabel);
        String str = packageInfo != null ? packageInfo.versionName : null;
        if (str == null) {
            str = "";
        }
        JSONObject jSONObjectPut2 = jSONObject.put(Stripe3ds2AuthParams.FIELD_APP, jSONObjectPut.put(AnalyticsFields.APP_VERSION, str)).put("os", new JSONObject().put("name", "Android").put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, Build.VERSION.RELEASE).put("type", Build.TYPE).put(InAppPurchaseConstants.METHOD_BUILD, Build.DISPLAY));
        JSONObject jSONObjectPut3 = new JSONObject().put("model_id", Build.ID).put("model", Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", Build.TYPE);
        JSONArray jSONArray = new JSONArray();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        for (String str2 : SUPPORTED_ABIS) {
            jSONArray.put(str2);
        }
        Unit unit = Unit.INSTANCE;
        JSONObject jSONObjectPut4 = jSONObjectPut2.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, jSONObjectPut3.put("archs", jSONArray));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut4, "put(...)");
        return jSONObjectPut4;
    }

    public final /* synthetic */ JSONObject createRequestStacktrace$3ds2sdk_release(Throwable t) throws JSONException {
        Intrinsics.checkNotNullParameter(t, "t");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = t.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : ArraysKt.reversed(stackTrace)) {
            jSONArray.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        Unit unit = Unit.INSTANCE;
        JSONObject jSONObjectPut = jSONObject.put("frames", jSONArray);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public final /* synthetic */ String createSentryAuthHeader$3ds2sdk_release() {
        return CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"Sentry", CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("sentry_key", this.sentryConfig.getKey()), TuplesKt.to("sentry_version", this.sentryConfig.getVersion()), TuplesKt.to("sentry_timestamp", this.sentryConfig.getTimestamp()), TuplesKt.to("sentry_client", USER_AGENT), TuplesKt.to("sentry_secret", this.sentryConfig.getSecret())}), ", ", null, null, 0, null, new Function1() { // from class: com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultErrorReporter.createSentryAuthHeader$lambda$15((Pair) obj);
            }
        }, 30, null)}), " ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence createSentryAuthHeader$lambda$15(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return ((String) pair.component1()) + "=" + ((String) pair.component2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailure(Throwable exception) {
        this.logger.error("Failed to send error report.", exception);
    }

    /* compiled from: DefaultErrorReporter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$EmptyConfig;", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "<init>", "()V", "customTags", "", "", "getCustomTags", "()Ljava/util/Map;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmptyConfig implements Config {
        public static final EmptyConfig INSTANCE = new EmptyConfig();
        private static final Map<String, String> customTags = MapsKt.emptyMap();

        private EmptyConfig() {
        }

        @Override // com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config
        public Map<String, String> getCustomTags() {
            return customTags;
        }
    }

    /* compiled from: DefaultErrorReporter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Companion;", "", "<init>", "()V", "HOST", "", "HTTP_METHOD", "HEADER_CONTENT_TYPE", "CONTENT_TYPE", "HEADER_USER_AGENT", "USER_AGENT", "HEADER_SENTRY_AUTH", "CHARSET", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
