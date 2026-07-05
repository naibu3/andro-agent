package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.DisplayablePaymentDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DisplayablePaymentDetailsJsonParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/parsers/DisplayablePaymentDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "FIELD_DEFAULT_CARD_BRAND", "", "FIELD_DEFAULT_PAYMENT_TYPE", "FIELD_LAST_4", "FIELD_NUMBER_OF_SAVED_PAYMENT_DETAILS", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DisplayablePaymentDetailsJsonParser implements ModelJsonParser<DisplayablePaymentDetails> {
    private static final String FIELD_DEFAULT_CARD_BRAND = "default_card_brand";
    private static final String FIELD_DEFAULT_PAYMENT_TYPE = "default_payment_type";
    private static final String FIELD_LAST_4 = "last_4";
    private static final String FIELD_NUMBER_OF_SAVED_PAYMENT_DETAILS = "number_of_saved_payment_details";
    public static final DisplayablePaymentDetailsJsonParser INSTANCE = new DisplayablePaymentDetailsJsonParser();

    private DisplayablePaymentDetailsJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public DisplayablePaymentDetails parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new DisplayablePaymentDetails(StripeJsonUtils.optString(json, FIELD_DEFAULT_CARD_BRAND), StripeJsonUtils.optString(json, FIELD_DEFAULT_PAYMENT_TYPE), StripeJsonUtils.optString(json, FIELD_LAST_4), StripeJsonUtils.INSTANCE.optLong(json, FIELD_NUMBER_OF_SAVED_PAYMENT_DETAILS));
    }
}
