package com.stripe.android.model.parsers;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.SharePaymentDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SharePaymentDetailsJsonParser.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/parsers/SharePaymentDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SharePaymentDetails;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SharePaymentDetailsJsonParser implements ModelJsonParser<SharePaymentDetails> {
    public static final SharePaymentDetailsJsonParser INSTANCE = new SharePaymentDetailsJsonParser();

    private SharePaymentDetailsJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SharePaymentDetails parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        String string = jSONObjectOptJSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObjectOptJSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new SharePaymentDetails(string, string2);
    }
}
