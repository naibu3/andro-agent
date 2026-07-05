package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConsumerSessionLookupJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/ConsumerSessionLookupJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ConsumerSessionLookup;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsumerSessionLookupJsonParser implements ModelJsonParser<ConsumerSessionLookup> {
    private static final Companion Companion = new Companion(null);
    private static final String FIELD_DISPLAYABLE_PAYMENT_DETAILS = "displayable_payment_details";
    private static final String FIELD_ERROR_MESSAGE = "error_message";
    private static final String FIELD_EXISTS = "exists";
    private static final String FIELD_PUBLISHABLE_KEY = "publishable_key";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerSessionLookup parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        boolean zOptBoolean = StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_EXISTS);
        ConsumerSession consumerSession = new ConsumerSessionJsonParser().parse(json);
        String strOptString = StripeJsonUtils.optString(json, "error_message");
        String strOptString2 = StripeJsonUtils.optString(json, "publishable_key");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_DISPLAYABLE_PAYMENT_DETAILS);
        return new ConsumerSessionLookup(zOptBoolean, consumerSession, strOptString, strOptString2, jSONObjectOptJSONObject != null ? DisplayablePaymentDetailsJsonParser.INSTANCE.parse(jSONObjectOptJSONObject) : null);
    }

    /* compiled from: ConsumerSessionLookupJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/ConsumerSessionLookupJsonParser$Companion;", "", "<init>", "()V", "FIELD_EXISTS", "", "FIELD_ERROR_MESSAGE", "FIELD_PUBLISHABLE_KEY", "FIELD_DISPLAYABLE_PAYMENT_DETAILS", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
