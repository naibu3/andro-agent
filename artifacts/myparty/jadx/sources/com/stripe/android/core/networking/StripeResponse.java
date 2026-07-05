package com.stripe.android.core.networking;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.networking.RequestId;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StripeResponse.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001'B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001c\u001a\u00020\bH\u0016J\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\bJ\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u001b\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007HÆ\u0003JF\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010&\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/stripe/android/core/networking/StripeResponse;", "ResponseBody", "", "code", "", "body", "headers", "", "", "", "<init>", "(ILjava/lang/Object;Ljava/util/Map;)V", "getCode", "()I", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getHeaders", "()Ljava/util/Map;", "isOk", "", "()Z", "isError", "isRateLimited", "requestId", "Lcom/stripe/android/core/networking/RequestId;", "getRequestId", "()Lcom/stripe/android/core/networking/RequestId;", InAppPurchaseConstants.METHOD_TO_STRING, "getHeaderValue", SDKConstants.PARAM_KEY, "component1", "component2", "component3", "copy", "(ILjava/lang/Object;Ljava/util/Map;)Lcom/stripe/android/core/networking/StripeResponse;", "equals", "other", "hashCode", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StripeResponse<ResponseBody> {
    public static final String HEADER_REQUEST_ID = "Request-Id";
    private final ResponseBody body;
    private final int code;
    private final Map<String, List<String>> headers;
    private final boolean isError;
    private final boolean isOk;
    private final boolean isRateLimited;
    private final RequestId requestId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StripeResponse copy$default(StripeResponse stripeResponse, int i, Object obj, Map map, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = stripeResponse.code;
        }
        if ((i2 & 2) != 0) {
            obj = stripeResponse.body;
        }
        if ((i2 & 4) != 0) {
            map = stripeResponse.headers;
        }
        return stripeResponse.copy(i, obj, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final ResponseBody component2() {
        return this.body;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final StripeResponse<ResponseBody> copy(int code, ResponseBody body, Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new StripeResponse<>(code, body, headers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeResponse)) {
            return false;
        }
        StripeResponse stripeResponse = (StripeResponse) other;
        return this.code == stripeResponse.code && Intrinsics.areEqual(this.body, stripeResponse.body) && Intrinsics.areEqual(this.headers, stripeResponse.headers);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        ResponseBody responsebody = this.body;
        return ((iHashCode + (responsebody == null ? 0 : responsebody.hashCode())) * 31) + this.headers.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StripeResponse(int i, ResponseBody responsebody, Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.code = i;
        this.body = responsebody;
        this.headers = headers;
        this.isOk = i == 200;
        this.isError = i < 200 || i >= 300;
        this.isRateLimited = i == 429;
        RequestId.Companion companion = RequestId.INSTANCE;
        List<String> headerValue = getHeaderValue(HEADER_REQUEST_ID);
        this.requestId = companion.fromString(headerValue != null ? (String) CollectionsKt.firstOrNull((List) headerValue) : null);
    }

    public final int getCode() {
        return this.code;
    }

    public final ResponseBody getBody() {
        return this.body;
    }

    public /* synthetic */ StripeResponse(int i, Object obj, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, (i2 & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    /* renamed from: isOk, reason: from getter */
    public final boolean getIsOk() {
        return this.isOk;
    }

    /* renamed from: isError, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: isRateLimited, reason: from getter */
    public final boolean getIsRateLimited() {
        return this.isRateLimited;
    }

    public final RequestId getRequestId() {
        return this.requestId;
    }

    public String toString() {
        return "Request-Id: " + this.requestId + ", Status Code: " + this.code;
    }

    public final List<String> getHeaderValue(String key) {
        Object next;
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<T> it = this.headers.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.equals((String) ((Map.Entry) next).getKey(), key, true)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (List) entry.getValue();
        }
        return null;
    }
}
