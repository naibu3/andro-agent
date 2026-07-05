package com.stripe.android.core.networking;

import android.os.Build;
import android.system.Os;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.hermes.intl.Constants;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: RequestHeadersFactory.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001b2\u00020\u0001:\u0006\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005J\u0016\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0015H\u0004R\u0012\u0010\b\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\n\u0082\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory;", "", "<init>", "()V", "create", "", "", "createPostHeader", "userAgent", "getUserAgent", "()Ljava/lang/String;", "extraHeaders", "getExtraHeaders", "()Ljava/util/Map;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "xStripeUserAgent", "getXStripeUserAgent", "defaultXStripeUserAgentMap", "", "BaseApiHeadersFactory", "Api", "FileUpload", "FraudDetection", "Analytics", "Companion", "Lcom/stripe/android/core/networking/RequestHeadersFactory$Analytics;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class RequestHeadersFactory {
    private static final String CHARSET;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KOTLIN = "kotlin";
    public static final String LANG = "lang";
    public static final String MODEL = "model";
    public static final String TYPE = "type";
    public static final String UNDETERMINED_LANGUAGE = "und";
    private Map<String, String> postHeaders;

    public /* synthetic */ RequestHeadersFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract Map<String, String> getExtraHeaders();

    protected abstract String getUserAgent();

    protected abstract String getXStripeUserAgent();

    private RequestHeadersFactory() {
        this.postHeaders = MapsKt.emptyMap();
    }

    public final Map<String, String> create() {
        return MapsKt.plus(getExtraHeaders(), MapsKt.mapOf(TuplesKt.to(NetworkConstantsKt.HEADER_USER_AGENT, getUserAgent()), TuplesKt.to(NetworkConstantsKt.HEADER_ACCEPT_CHARSET, CHARSET), TuplesKt.to(NetworkConstantsKt.HEADER_X_STRIPE_USER_AGENT, getXStripeUserAgent())));
    }

    public final Map<String, String> createPostHeader() {
        return getPostHeaders();
    }

    protected Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    protected void setPostHeaders(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.postHeaders = map;
    }

    protected final Map<String, String> defaultXStripeUserAgentMap() {
        return MapsKt.mutableMapOf(TuplesKt.to(LANG, KOTLIN), TuplesKt.to(AnalyticsFields.BINDINGS_VERSION, "21.22.2"), TuplesKt.to(AnalyticsFields.OS_VERSION, String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("type", Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL), TuplesKt.to("model", Build.MODEL));
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "optionsProvider", "Lkotlin/Function0;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", "stripeClientUserAgentHeaderFactory", "Lcom/stripe/android/core/networking/StripeClientUserAgentHeaderFactory;", "languageTag", "getLanguageTag", "()Ljava/lang/String;", "userAgent", "getUserAgent", "xStripeUserAgent", "getXStripeUserAgent", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class BaseApiHeadersFactory extends RequestHeadersFactory {
        private final String apiVersion;
        private final AppInfo appInfo;
        private final Locale locale;
        private final Function0<ApiRequest.Options> optionsProvider;
        private final String sdkVersion;
        private final StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory;

        public /* synthetic */ BaseApiHeadersFactory(Function0 function0, AppInfo appInfo, Locale locale, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i & 2) != 0 ? null : appInfo, (i & 4) != 0 ? Locale.getDefault() : locale, (i & 8) != 0 ? ApiVersion.INSTANCE.get().getCode() : str, (i & 16) != 0 ? "AndroidBindings/21.22.2" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BaseApiHeadersFactory(Function0<ApiRequest.Options> optionsProvider, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion) {
            super(null);
            Intrinsics.checkNotNullParameter(optionsProvider, "optionsProvider");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            this.optionsProvider = optionsProvider;
            this.appInfo = appInfo;
            this.locale = locale;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
            this.stripeClientUserAgentHeaderFactory = new StripeClientUserAgentHeaderFactory(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        }

        private final String getLanguageTag() {
            String languageTag = this.locale.toLanguageTag();
            Intrinsics.checkNotNull(languageTag);
            if (StringsKt.isBlank(languageTag) || Intrinsics.areEqual(languageTag, RequestHeadersFactory.UNDETERMINED_LANGUAGE)) {
                return null;
            }
            return languageTag;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getUserAgent() {
            String[] strArr = new String[2];
            strArr[0] = RequestHeadersFactory.INSTANCE.getUserAgent(this.sdkVersion);
            AppInfo appInfo = this.appInfo;
            strArr[1] = appInfo != null ? appInfo.toUserAgent$stripe_core_release() : null;
            return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), " ", null, null, 0, null, null, 62, null);
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getXStripeUserAgent() {
            Map<String, String> mapDefaultXStripeUserAgentMap = defaultXStripeUserAgentMap();
            AppInfo appInfo = this.appInfo;
            if (appInfo != null) {
                mapDefaultXStripeUserAgentMap.putAll(appInfo.toParamMap$stripe_core_release());
            }
            ArrayList arrayList = new ArrayList(mapDefaultXStripeUserAgentMap.size());
            for (Map.Entry<String, String> entry : mapDefaultXStripeUserAgentMap.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            return "{" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getExtraHeaders() {
            Map mapEmptyMap;
            ApiRequest.Options optionsInvoke = this.optionsProvider.invoke();
            Map mapPlus = MapsKt.plus(MapsKt.mapOf(TuplesKt.to(NetworkConstantsKt.HEADER_ACCEPT, "application/json"), TuplesKt.to(NetworkConstantsKt.HEADER_STRIPE_VERSION, this.apiVersion), TuplesKt.to(NetworkConstantsKt.HEADER_AUTHORIZATION, "Bearer " + optionsInvoke.getApiKey())), this.stripeClientUserAgentHeaderFactory.create(this.appInfo));
            if (optionsInvoke.getApiKeyIsUserKey()) {
                mapEmptyMap = MapsKt.mapOf(TuplesKt.to(NetworkConstantsKt.HEADER_STRIPE_LIVEMODE, String.valueOf(true ^ Intrinsics.areEqual(Os.getenv(NetworkConstantsKt.HEADER_STRIPE_LIVEMODE), Constants.CASEFIRST_FALSE))));
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Map mapPlus2 = MapsKt.plus(mapPlus, mapEmptyMap);
            String stripeAccount = optionsInvoke.getStripeAccount();
            Map mapMapOf = stripeAccount != null ? MapsKt.mapOf(TuplesKt.to(NetworkConstantsKt.HEADER_STRIPE_ACCOUNT, stripeAccount)) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf);
            String idempotencyKey = optionsInvoke.getIdempotencyKey();
            Map mapMapOf2 = idempotencyKey != null ? MapsKt.mapOf(TuplesKt.to(NetworkConstantsKt.HEADER_IDEMPOTENCY_KEY, idempotencyKey)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            Map mapPlus4 = MapsKt.plus(mapPlus3, mapMapOf2);
            String languageTag = getLanguageTag();
            Map mapMapOf3 = languageTag != null ? MapsKt.mapOf(TuplesKt.to(NetworkConstantsKt.HEADER_ACCEPT_LANGUAGE, languageTag)) : null;
            if (mapMapOf3 == null) {
                mapMapOf3 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapPlus4, mapMapOf3);
        }
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eX\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "<init>", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", "postHeaders", "", "getPostHeaders", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api extends BaseApiHeadersFactory {
        private Map<String, String> postHeaders;

        /* JADX INFO: Access modifiers changed from: private */
        public static final ApiRequest.Options _init_$lambda$0(ApiRequest.Options options) {
            return options;
        }

        public /* synthetic */ Api(ApiRequest.Options options, AppInfo appInfo, Locale locale, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(options, (i & 2) != 0 ? null : appInfo, (i & 4) != 0 ? Locale.getDefault() : locale, (i & 8) != 0 ? ApiVersion.INSTANCE.get().getCode() : str, (i & 16) != 0 ? "AndroidBindings/21.22.2" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(final ApiRequest.Options options, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion) {
            super(new Function0() { // from class: com.stripe.android.core.networking.RequestHeadersFactory$Api$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RequestHeadersFactory.Api._init_$lambda$0(options);
                }
            }, appInfo, locale, apiVersion, sdkVersion);
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            this.postHeaders = MapsKt.mapOf(TuplesKt.to("Content-Type", StripeRequest.MimeType.Form.getCode() + "; charset=" + RequestHeadersFactory.INSTANCE.getCHARSET()));
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected void setPostHeaders(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.postHeaders = map;
        }
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fX\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$FileUpload;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "boundary", "<init>", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "postHeaders", "", "getPostHeaders", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FileUpload extends BaseApiHeadersFactory {
        private Map<String, String> postHeaders;

        /* JADX INFO: Access modifiers changed from: private */
        public static final ApiRequest.Options _init_$lambda$0(ApiRequest.Options options) {
            return options;
        }

        public /* synthetic */ FileUpload(ApiRequest.Options options, AppInfo appInfo, Locale locale, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(options, (i & 2) != 0 ? null : appInfo, (i & 4) != 0 ? Locale.getDefault() : locale, (i & 8) != 0 ? ApiVersion.INSTANCE.get().getCode() : str, (i & 16) != 0 ? "AndroidBindings/21.22.2" : str2, str3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileUpload(final ApiRequest.Options options, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion, String boundary) {
            super(new Function0() { // from class: com.stripe.android.core.networking.RequestHeadersFactory$FileUpload$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RequestHeadersFactory.FileUpload._init_$lambda$0(options);
                }
            }, appInfo, locale, apiVersion, sdkVersion);
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.postHeaders = MapsKt.mapOf(TuplesKt.to("Content-Type", StripeRequest.MimeType.MultipartForm.getCode() + "; boundary=" + boundary));
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected void setPostHeaders(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.postHeaders = map;
        }
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\r\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "guid", "", "<init>", "(Ljava/lang/String;)V", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "userAgent", "getUserAgent", "()Ljava/lang/String;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "xStripeUserAgent", "getXStripeUserAgent", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FraudDetection extends RequestHeadersFactory {
        public static final String HEADER_COOKIE = "Cookie";
        private final Map<String, String> extraHeaders;
        private Map<String, String> postHeaders;
        private final String userAgent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FraudDetection(String guid) {
            super(null);
            Intrinsics.checkNotNullParameter(guid, "guid");
            this.extraHeaders = MapsKt.mapOf(TuplesKt.to(HEADER_COOKIE, "m=" + guid));
            this.userAgent = RequestHeadersFactory.INSTANCE.getUserAgent("AndroidBindings/21.22.2");
            this.postHeaders = MapsKt.mapOf(TuplesKt.to("Content-Type", StripeRequest.MimeType.Json.getCode() + "; charset=" + RequestHeadersFactory.INSTANCE.getCHARSET()));
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getExtraHeaders() {
            return this.extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getUserAgent() {
            return this.userAgent;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected void setPostHeaders(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.postHeaders = map;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getXStripeUserAgent() {
            Map<String, String> mapDefaultXStripeUserAgentMap = defaultXStripeUserAgentMap();
            ArrayList arrayList = new ArrayList(mapDefaultXStripeUserAgentMap.size());
            for (Map.Entry<String, String> entry : mapDefaultXStripeUserAgentMap.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            return "{" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$Analytics;", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "<init>", "()V", "userAgent", "", "getUserAgent", "()Ljava/lang/String;", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "xStripeUserAgent", "getXStripeUserAgent", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics extends RequestHeadersFactory {
        public static final Analytics INSTANCE = new Analytics();
        private static final String userAgent = RequestHeadersFactory.INSTANCE.getUserAgent("AndroidBindings/21.22.2");
        private static final Map<String, String> extraHeaders = MapsKt.emptyMap();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -334358835;
        }

        public String toString() {
            return "Analytics";
        }

        private Analytics() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getUserAgent() {
            return userAgent;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getExtraHeaders() {
            return extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getXStripeUserAgent() {
            Map<String, String> mapDefaultXStripeUserAgentMap = defaultXStripeUserAgentMap();
            ArrayList arrayList = new ArrayList(mapDefaultXStripeUserAgentMap.size());
            for (Map.Entry<String, String> entry : mapDefaultXStripeUserAgentMap.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            return "{" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    /* compiled from: RequestHeadersFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$Companion;", "", "<init>", "()V", "getUserAgent", "", "sdkVersion", "CHARSET", "getCHARSET", "()Ljava/lang/String;", "UNDETERMINED_LANGUAGE", "LANG", "KOTLIN", "TYPE", "MODEL", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ String getUserAgent$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "AndroidBindings/21.22.2";
            }
            return companion.getUserAgent(str);
        }

        public final String getUserAgent(String sdkVersion) {
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            return "Stripe/v1 " + sdkVersion;
        }

        public final String getCHARSET() {
            return RequestHeadersFactory.CHARSET;
        }
    }

    static {
        String strName = Charsets.UTF_8.name();
        Intrinsics.checkNotNullExpressionValue(strName, "name(...)");
        CHARSET = strName;
    }
}
