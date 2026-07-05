package com.stripe.android.model.parsers;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ConsumerPaymentDetailsShare;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ConsumerPaymentDetailsShareJsonParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ConsumerPaymentDetailsShare;", "<init>", "()V", "FIELD_PAYMENT_METHOD", "", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsumerPaymentDetailsShareJsonParser implements ModelJsonParser<ConsumerPaymentDetailsShare> {
    public static final int $stable = 0;
    private static final String FIELD_PAYMENT_METHOD = "payment_method";
    public static final ConsumerPaymentDetailsShareJsonParser INSTANCE = new ConsumerPaymentDetailsShareJsonParser();

    private ConsumerPaymentDetailsShareJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerPaymentDetailsShare parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("payment_method");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new ConsumerPaymentDetailsShare(new PaymentMethodJsonParser().parse(jSONObjectOptJSONObject));
    }
}
