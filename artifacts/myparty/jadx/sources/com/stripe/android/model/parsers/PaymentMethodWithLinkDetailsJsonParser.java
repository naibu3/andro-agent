package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PaymentMethodWithLinkDetailsJsonParser.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "isUnsupportedLinkPaymentDetailsType", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodWithLinkDetailsJsonParser implements ModelJsonParser<PaymentMethod> {
    public static final int $stable = 0;
    public static final PaymentMethodWithLinkDetailsJsonParser INSTANCE = new PaymentMethodWithLinkDetailsJsonParser();

    private PaymentMethodWithLinkDetailsJsonParser() {
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public PaymentMethod parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        PaymentMethodJsonParser paymentMethodJsonParser = new PaymentMethodJsonParser();
        JSONObject jSONObject = json.getJSONObject("payment_method");
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        PaymentMethod paymentMethod = paymentMethodJsonParser.parse(jSONObject);
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("link_payment_details");
        boolean zOptBoolean = StripeJsonUtils.INSTANCE.optBoolean(json, "is_link_origin");
        LinkPaymentDetails.BankAccount bankAccount = null;
        if (isUnsupportedLinkPaymentDetailsType(jSONObjectOptJSONObject)) {
            return null;
        }
        ConsumerPaymentDetails.PaymentDetails paymentDetails = jSONObjectOptJSONObject != null ? ConsumerPaymentDetailsJsonParser.INSTANCE.parsePaymentDetails(jSONObjectOptJSONObject) : null;
        if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
            ConsumerPaymentDetails.Card card = (ConsumerPaymentDetails.Card) paymentDetails;
            bankAccount = new LinkPaymentDetails.Card(card.getNickname(), card.getExpiryMonth(), card.getExpiryYear(), card.getLast4(), card.getBrand(), card.getFunding());
        } else if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
            ConsumerPaymentDetails.BankAccount bankAccount2 = (ConsumerPaymentDetails.BankAccount) paymentDetails;
            bankAccount = new LinkPaymentDetails.BankAccount(bankAccount2.getBankName(), bankAccount2.getLast4());
        } else if (!(paymentDetails instanceof ConsumerPaymentDetails.Passthrough) && paymentDetails != null) {
            throw new NoWhenBranchMatchedException();
        }
        LinkPaymentDetails linkPaymentDetails = bankAccount;
        return PaymentMethod.copy$default(paymentMethod, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkPaymentDetails, zOptBoolean && linkPaymentDetails == null, null, 1310719, null);
    }

    private final boolean isUnsupportedLinkPaymentDetailsType(JSONObject json) {
        return (json == null || CollectionsKt.contains(SetsKt.setOf((Object[]) new String[]{"CARD", "BANK_ACCOUNT"}), StripeJsonUtils.optString(json, "type"))) ? false : true;
    }
}
