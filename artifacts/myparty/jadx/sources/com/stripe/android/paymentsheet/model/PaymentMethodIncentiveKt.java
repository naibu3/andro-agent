package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.LinkConsumerIncentive;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodIncentive.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toPaymentMethodIncentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "Lcom/stripe/android/model/LinkConsumerIncentive;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentMethodIncentiveKt {
    public static final PaymentMethodIncentive toPaymentMethodIncentive(LinkConsumerIncentive linkConsumerIncentive) {
        Intrinsics.checkNotNullParameter(linkConsumerIncentive, "<this>");
        String incentiveDisplayText = linkConsumerIncentive.getIncentiveDisplayText();
        if (incentiveDisplayText != null) {
            return new PaymentMethodIncentive(linkConsumerIncentive.getIncentiveParams().getPaymentMethod(), incentiveDisplayText);
        }
        return null;
    }
}
