package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.BankAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: BankAccountJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/BankAccountJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/BankAccount;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BankAccountJsonParser implements ModelJsonParser<BankAccount> {
    public static final String FIELD_ACCOUNT_HOLDER_NAME = "account_holder_name";
    public static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
    public static final String FIELD_BANK_NAME = "bank_name";
    public static final String FIELD_COUNTRY = "country";
    public static final String FIELD_CURRENCY = "currency";
    public static final String FIELD_FINGERPRINT = "fingerprint";
    public static final String FIELD_ID = "id";
    public static final String FIELD_LAST4 = "last4";
    public static final String FIELD_OBJECT = "object";
    public static final String FIELD_ROUTING_NUMBER = "routing_number";
    public static final String FIELD_STATUS = "status";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public BankAccount parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new BankAccount(StripeJsonUtils.optString(json, "id"), StripeJsonUtils.optString(json, FIELD_ACCOUNT_HOLDER_NAME), BankAccount.Type.INSTANCE.fromCode$payments_model_release(StripeJsonUtils.optString(json, FIELD_ACCOUNT_HOLDER_TYPE)), StripeJsonUtils.optString(json, "bank_name"), StripeJsonUtils.INSTANCE.optCountryCode(json, "country"), StripeJsonUtils.optCurrency(json, "currency"), StripeJsonUtils.optString(json, FIELD_FINGERPRINT), StripeJsonUtils.optString(json, "last4"), StripeJsonUtils.optString(json, FIELD_ROUTING_NUMBER), BankAccount.Status.INSTANCE.fromCode$payments_model_release(StripeJsonUtils.optString(json, "status")));
    }
}
