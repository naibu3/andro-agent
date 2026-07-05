package com.stripe.android.model;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmStripeIntentParams.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\" \u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"paymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "getPaymentMethodCode", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;)Ljava/lang/String;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmStripeIntentParamsKt {
    public static final String getPaymentMethodCode(ConfirmStripeIntentParams confirmStripeIntentParams) {
        Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "<this>");
        if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
            return ((ConfirmPaymentIntentParams) confirmStripeIntentParams).getPaymentMethodCode$payments_core_release();
        }
        if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((ConfirmSetupIntentParams) confirmStripeIntentParams).getPaymentMethodCode$payments_core_release();
    }
}
