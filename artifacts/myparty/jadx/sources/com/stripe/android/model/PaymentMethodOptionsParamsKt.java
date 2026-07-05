package com.stripe.android.model;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodOptionsParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodOptionsParamsKt {
    public static final ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage(PaymentMethodOptionsParams paymentMethodOptionsParams) {
        Intrinsics.checkNotNullParameter(paymentMethodOptionsParams, "<this>");
        if (paymentMethodOptionsParams instanceof PaymentMethodOptionsParams.Blik) {
            return null;
        }
        if (paymentMethodOptionsParams instanceof PaymentMethodOptionsParams.Card) {
            return ((PaymentMethodOptionsParams.Card) paymentMethodOptionsParams).getSetupFutureUsage();
        }
        if (paymentMethodOptionsParams instanceof PaymentMethodOptionsParams.SepaDebit) {
            return ((PaymentMethodOptionsParams.SepaDebit) paymentMethodOptionsParams).getSetupFutureUsage();
        }
        if (paymentMethodOptionsParams instanceof PaymentMethodOptionsParams.Konbini) {
            return null;
        }
        if (paymentMethodOptionsParams instanceof PaymentMethodOptionsParams.Link) {
            return ((PaymentMethodOptionsParams.Link) paymentMethodOptionsParams).getSetupFutureUsage();
        }
        if (paymentMethodOptionsParams instanceof PaymentMethodOptionsParams.USBankAccount) {
            return ((PaymentMethodOptionsParams.USBankAccount) paymentMethodOptionsParams).getSetupFutureUsage();
        }
        if ((paymentMethodOptionsParams instanceof PaymentMethodOptionsParams.WeChatPay) || (paymentMethodOptionsParams instanceof PaymentMethodOptionsParams.WeChatPayH5)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
