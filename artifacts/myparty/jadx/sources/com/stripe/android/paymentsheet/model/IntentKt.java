package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Intent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"currency", "", "Lcom/stripe/android/model/StripeIntent;", "getCurrency", "(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "getAmount", "(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Long;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntentKt {
    public static final String getCurrency(StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        if (stripeIntent instanceof PaymentIntent) {
            return ((PaymentIntent) stripeIntent).getCurrency();
        }
        return null;
    }

    public static final Long getAmount(StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        if (stripeIntent instanceof PaymentIntent) {
            return ((PaymentIntent) stripeIntent).getAmount();
        }
        return null;
    }
}
