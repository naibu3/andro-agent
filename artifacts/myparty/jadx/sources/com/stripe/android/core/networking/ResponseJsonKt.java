package com.stripe.android.core.networking;

import com.stripe.android.core.exception.APIException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ResponseJson.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¨\u0006\u0004"}, d2 = {"responseJson", "Lorg/json/JSONObject;", "Lcom/stripe/android/core/networking/StripeResponse;", "", "stripe-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResponseJsonKt {
    public static final JSONObject responseJson(StripeResponse<String> stripeResponse) throws APIException {
        Intrinsics.checkNotNullParameter(stripeResponse, "<this>");
        String body = stripeResponse.getBody();
        if (body != null) {
            try {
                return new JSONObject(body);
            } catch (JSONException e) {
                int code = stripeResponse.getCode();
                RequestId requestId = stripeResponse.getRequestId();
                List<String> headerValue = stripeResponse.getHeaderValue("Content-Type");
                throw new APIException(null, null, 0, StringsKt.trimIndent("\n                    Exception while parsing response body.\n                      Status code: " + code + "\n                      Request-Id: " + requestId + "\n                      Content-Type: " + (headerValue != null ? (String) CollectionsKt.firstOrNull((List) headerValue) : null) + "\n                      Body: \"" + body + "\"\n                "), e, 7, null);
            }
        }
        return new JSONObject();
    }
}
