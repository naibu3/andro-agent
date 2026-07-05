package com.stripe.android.core.networking;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.core.networking.StripeRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: AnalyticsRequest.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B-\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J3\u0010\u001e\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0016HÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", NativeProtocol.WEB_DIALOG_PARAMS, "", "", "headers", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getParams", "()Ljava/util/Map;", "getHeaders", SearchIntents.EXTRA_QUERY, "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AnalyticsRequest extends StripeRequest {
    public static final String HOST = "https://q.stripe.com";
    private final Map<String, String> headers;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Map<String, ?> params;
    private final String query;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsRequest copy$default(AnalyticsRequest analyticsRequest, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = analyticsRequest.params;
        }
        if ((i & 2) != 0) {
            map2 = analyticsRequest.headers;
        }
        return analyticsRequest.copy(map, map2);
    }

    public final Map<String, ?> component1() {
        return this.params;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final AnalyticsRequest copy(Map<String, ?> params, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new AnalyticsRequest(params, headers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsRequest)) {
            return false;
        }
        AnalyticsRequest analyticsRequest = (AnalyticsRequest) other;
        return Intrinsics.areEqual(this.params, analyticsRequest.params) && Intrinsics.areEqual(this.headers, analyticsRequest.headers);
    }

    public int hashCode() {
        return (this.params.hashCode() * 31) + this.headers.hashCode();
    }

    public String toString() {
        return "AnalyticsRequest(params=" + this.params + ", headers=" + this.headers + ")";
    }

    public final Map<String, ?> getParams() {
        return this.params;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyticsRequest(Map<String, ?> params, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.params = params;
        this.headers = headers;
        String strCreateFromParamsWithEmptyValues = QueryStringFactory.INSTANCE.createFromParamsWithEmptyValues(params);
        this.query = strCreateFromParamsWithEmptyValues;
        this.method = StripeRequest.Method.GET;
        this.mimeType = StripeRequest.MimeType.Form;
        this.retryResponseCodes = new IntRange(NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS, NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS);
        String[] strArr = new String[2];
        strArr[0] = HOST;
        strArr[1] = strCreateFromParamsWithEmptyValues.length() <= 0 ? null : strCreateFromParamsWithEmptyValues;
        this.url = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), "?", null, null, 0, null, null, 62, null);
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
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
        return this.url;
    }
}
