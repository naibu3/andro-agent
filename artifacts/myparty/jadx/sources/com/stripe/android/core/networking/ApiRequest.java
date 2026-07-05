package com.stripe.android.core.networking;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: ApiRequest.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0003GHIBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u0015\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010>\u001a\u00020\u0005HÂ\u0003J\t\u0010?\u001a\u00020\u0005HÂ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003Jl\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÀ\u0001¢\u0006\u0002\bBJ\u0013\u0010C\u001a\u00020\u000f2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020)HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0015R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0017R(\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u00103¨\u0006J"}, d2 = {"Lcom/stripe/android/core/networking/ApiRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "baseUrl", "", NativeProtocol.WEB_DIALOG_PARAMS, "", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "apiVersion", "sdkVersion", "shouldCache", "", "<init>", "(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)V", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "getBaseUrl", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "getOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "getShouldCache", "()Z", SearchIntents.EXTRA_QUERY, "postBodyBytes", "", "getPostBodyBytes", "()[B", "headersFactory", "Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "getUrl", "headers", "getHeaders", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "writePostBody", "", "outputStream", "Ljava/io/OutputStream;", InAppPurchaseConstants.METHOD_TO_STRING, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copy$stripe_core_release", "equals", "other", "", "hashCode", "Options", "Factory", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ApiRequest extends StripeRequest {
    public static final String API_HOST = "https://api.stripe.com";
    private final String apiVersion;
    private final AppInfo appInfo;
    private final String baseUrl;
    private final Map<String, String> headers;
    private final RequestHeadersFactory.Api headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Options options;
    private final Map<String, ?> params;
    private Map<String, String> postHeaders;
    private final String query;
    private final Iterable<Integer> retryResponseCodes;
    private final String sdkVersion;
    private final boolean shouldCache;

    /* renamed from: component5, reason: from getter */
    private final AppInfo getAppInfo() {
        return this.appInfo;
    }

    /* renamed from: component6, reason: from getter */
    private final String getApiVersion() {
        return this.apiVersion;
    }

    /* renamed from: component7, reason: from getter */
    private final String getSdkVersion() {
        return this.sdkVersion;
    }

    public static /* synthetic */ ApiRequest copy$stripe_core_release$default(ApiRequest apiRequest, StripeRequest.Method method, String str, Map map, Options options, AppInfo appInfo, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            method = apiRequest.method;
        }
        if ((i & 2) != 0) {
            str = apiRequest.baseUrl;
        }
        if ((i & 4) != 0) {
            map = apiRequest.params;
        }
        if ((i & 8) != 0) {
            options = apiRequest.options;
        }
        if ((i & 16) != 0) {
            appInfo = apiRequest.appInfo;
        }
        if ((i & 32) != 0) {
            str2 = apiRequest.apiVersion;
        }
        if ((i & 64) != 0) {
            str3 = apiRequest.sdkVersion;
        }
        if ((i & 128) != 0) {
            z = apiRequest.shouldCache;
        }
        String str4 = str3;
        boolean z2 = z;
        AppInfo appInfo2 = appInfo;
        String str5 = str2;
        return apiRequest.copy$stripe_core_release(method, str, map, options, appInfo2, str5, str4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final StripeRequest.Method getMethod() {
        return this.method;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final Map<String, ?> component3() {
        return this.params;
    }

    /* renamed from: component4, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldCache() {
        return this.shouldCache;
    }

    public final ApiRequest copy$stripe_core_release(StripeRequest.Method method, String baseUrl, Map<String, ?> params, Options options, AppInfo appInfo, String apiVersion, String sdkVersion, boolean shouldCache) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return new ApiRequest(method, baseUrl, params, options, appInfo, apiVersion, sdkVersion, shouldCache);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiRequest)) {
            return false;
        }
        ApiRequest apiRequest = (ApiRequest) other;
        return this.method == apiRequest.method && Intrinsics.areEqual(this.baseUrl, apiRequest.baseUrl) && Intrinsics.areEqual(this.params, apiRequest.params) && Intrinsics.areEqual(this.options, apiRequest.options) && Intrinsics.areEqual(this.appInfo, apiRequest.appInfo) && Intrinsics.areEqual(this.apiVersion, apiRequest.apiVersion) && Intrinsics.areEqual(this.sdkVersion, apiRequest.sdkVersion) && this.shouldCache == apiRequest.shouldCache;
    }

    public int hashCode() {
        int iHashCode = ((this.method.hashCode() * 31) + this.baseUrl.hashCode()) * 31;
        Map<String, ?> map = this.params;
        int iHashCode2 = (((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.options.hashCode()) * 31;
        AppInfo appInfo = this.appInfo;
        return ((((((iHashCode2 + (appInfo != null ? appInfo.hashCode() : 0)) * 31) + this.apiVersion.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + Boolean.hashCode(this.shouldCache);
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final Map<String, ?> getParams() {
        return this.params;
    }

    public final Options getOptions() {
        return this.options;
    }

    public /* synthetic */ ApiRequest(StripeRequest.Method method, String str, Map map, Options options, AppInfo appInfo, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, str, (i & 4) != 0 ? null : map, options, (i & 16) != 0 ? null : appInfo, (i & 32) != 0 ? ApiVersion.INSTANCE.get().getCode() : str2, (i & 64) != 0 ? "AndroidBindings/21.22.2" : str3, (i & 128) != 0 ? false : z);
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public boolean getShouldCache() {
        return this.shouldCache;
    }

    public ApiRequest(StripeRequest.Method method, String baseUrl, Map<String, ?> map, Options options, AppInfo appInfo, String apiVersion, String sdkVersion, boolean z) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.method = method;
        this.baseUrl = baseUrl;
        this.params = map;
        this.options = options;
        this.appInfo = appInfo;
        this.apiVersion = apiVersion;
        this.sdkVersion = sdkVersion;
        this.shouldCache = z;
        this.query = QueryStringFactory.INSTANCE.createFromParamsWithEmptyValues(map);
        RequestHeadersFactory.Api api = new RequestHeadersFactory.Api(options, appInfo, null, apiVersion, sdkVersion, 4, null);
        this.headersFactory = api;
        this.mimeType = StripeRequest.MimeType.Form;
        this.retryResponseCodes = NetworkConstantsKt.getDEFAULT_RETRY_CODES();
        this.headers = api.create();
        this.postHeaders = api.createPostHeader();
    }

    private final byte[] getPostBodyBytes() throws InvalidRequestException, UnsupportedEncodingException {
        try {
            byte[] bytes = this.query.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            throw new InvalidRequestException(null, null, 0, "Unable to encode parameters to " + Charsets.UTF_8.name() + ". Please contact support@stripe.com for assistance.", e, 7, null);
        }
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        if (StripeRequest.Method.GET == getMethod() || StripeRequest.Method.DELETE == getMethod()) {
            String[] strArr = new String[2];
            strArr[0] = this.baseUrl;
            String str = this.query;
            if (str.length() <= 0) {
                str = null;
            }
            strArr[1] = str;
            return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), StringsKt.contains$default((CharSequence) this.baseUrl, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?", null, null, 0, null, null, 62, null);
        }
        return this.baseUrl;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        outputStream.write(getPostBodyBytes());
        outputStream.flush();
    }

    public String toString() {
        return getMethod().getCode() + " " + this.baseUrl;
    }

    /* compiled from: ApiRequest.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0017\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006'"}, d2 = {"Lcom/stripe/android/core/networking/ApiRequest$Options;", "Landroid/os/Parcelable;", "apiKey", "", "stripeAccount", "idempotencyKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "publishableKeyProvider", "Lkotlin/Function0;", "stripeAccountIdProvider", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getApiKey", "()Ljava/lang/String;", "getStripeAccount", "getIdempotencyKey", "apiKeyIsUserKey", "", "getApiKeyIsUserKey", "()Z", "apiKeyIsLiveMode", "getApiKeyIsLiveMode", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Options implements Parcelable {
        public static final String UNDEFINED_PUBLISHABLE_KEY = "pk_undefined";
        private final String apiKey;
        private final String idempotencyKey;
        private final String stripeAccount;
        public static final Parcelable.Creator<Options> CREATOR = new Creator();

        /* compiled from: ApiRequest.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Options> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Options(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options[] newArray(int i) {
                return new Options[i];
            }
        }

        public static /* synthetic */ Options copy$default(Options options, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = options.apiKey;
            }
            if ((i & 2) != 0) {
                str2 = options.stripeAccount;
            }
            if ((i & 4) != 0) {
                str3 = options.idempotencyKey;
            }
            return options.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStripeAccount() {
            return this.stripeAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIdempotencyKey() {
            return this.idempotencyKey;
        }

        public final Options copy(String apiKey, String stripeAccount, String idempotencyKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            return new Options(apiKey, stripeAccount, idempotencyKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.areEqual(this.apiKey, options.apiKey) && Intrinsics.areEqual(this.stripeAccount, options.stripeAccount) && Intrinsics.areEqual(this.idempotencyKey, options.idempotencyKey);
        }

        public int hashCode() {
            int iHashCode = this.apiKey.hashCode() * 31;
            String str = this.stripeAccount;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.idempotencyKey;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Options(apiKey=" + this.apiKey + ", stripeAccount=" + this.stripeAccount + ", idempotencyKey=" + this.idempotencyKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.apiKey);
            dest.writeString(this.stripeAccount);
            dest.writeString(this.idempotencyKey);
        }

        public Options(String apiKey, String str, String str2) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            this.apiKey = apiKey;
            this.stripeAccount = str;
            this.idempotencyKey = str2;
            new ApiKeyValidator().requireValid(apiKey);
        }

        public /* synthetic */ Options(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getStripeAccount() {
            return this.stripeAccount;
        }

        public final String getIdempotencyKey() {
            return this.idempotencyKey;
        }

        public final boolean getApiKeyIsUserKey() {
            return StringsKt.startsWith$default(this.apiKey, "uk_", false, 2, (Object) null);
        }

        public final boolean getApiKeyIsLiveMode() {
            return !StringsKt.contains$default((CharSequence) this.apiKey, (CharSequence) "test", false, 2, (Object) null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Inject
        public Options(@Named("publishableKey") Function0<String> publishableKeyProvider, @Named(NamedConstantsKt.STRIPE_ACCOUNT_ID) Function0<String> stripeAccountIdProvider) {
            this(publishableKeyProvider.invoke(), stripeAccountIdProvider.invoke(), null, 4, null);
            Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
            Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        }
    }

    /* compiled from: ApiRequest.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J6\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J,\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/core/networking/ApiRequest$Factory;", "", "appInfo", "Lcom/stripe/android/core/AppInfo;", "apiVersion", "", "sdkVersion", "<init>", "(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;)V", "createGet", "Lcom/stripe/android/core/networking/ApiRequest;", "url", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/stripe/android/core/networking/ApiRequest$Options;", NativeProtocol.WEB_DIALOG_PARAMS, "", "shouldCache", "", "createPost", "createDelete", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory {
        private final String apiVersion;
        private final AppInfo appInfo;
        private final String sdkVersion;

        public Factory() {
            this(null, null, null, 7, null);
        }

        public Factory(AppInfo appInfo, String apiVersion, String sdkVersion) {
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            this.appInfo = appInfo;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
        }

        public /* synthetic */ Factory(AppInfo appInfo, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : appInfo, (i & 2) != 0 ? ApiVersion.INSTANCE.get().getCode() : str, (i & 4) != 0 ? "AndroidBindings/21.22.2" : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createGet$default(Factory factory, String str, Options options, Map map, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return factory.createGet(str, options, map, z);
        }

        public final ApiRequest createGet(String url, Options options, Map<String, ?> params, boolean shouldCache) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(options, "options");
            return new ApiRequest(StripeRequest.Method.GET, url, params, options, this.appInfo, this.apiVersion, this.sdkVersion, shouldCache);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createPost$default(Factory factory, String str, Options options, Map map, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return factory.createPost(str, options, map, z);
        }

        public final ApiRequest createPost(String url, Options options, Map<String, ?> params, boolean shouldCache) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(options, "options");
            return new ApiRequest(StripeRequest.Method.POST, url, params, options, this.appInfo, this.apiVersion, this.sdkVersion, shouldCache);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createDelete$default(Factory factory, String str, Options options, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return factory.createDelete(str, options, map);
        }

        public final ApiRequest createDelete(String url, Options options, Map<String, ?> params) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(options, "options");
            return new ApiRequest(StripeRequest.Method.DELETE, url, params, options, this.appInfo, this.apiVersion, this.sdkVersion, false, 128, null);
        }
    }
}
