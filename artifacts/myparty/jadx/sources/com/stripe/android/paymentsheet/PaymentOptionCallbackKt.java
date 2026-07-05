package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionCallback.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toResultCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionCallbackKt {
    public static final PaymentOptionResultCallback toResultCallback(final PaymentOptionCallback paymentOptionCallback) {
        Intrinsics.checkNotNullParameter(paymentOptionCallback, "<this>");
        return new PaymentOptionResultCallback() { // from class: com.stripe.android.paymentsheet.PaymentOptionCallbackKt$$ExternalSyntheticLambda0
            @Override // com.stripe.android.paymentsheet.PaymentOptionResultCallback
            public final void onPaymentOptionResult(PaymentOptionResult paymentOptionResult) {
                PaymentOptionCallbackKt.toResultCallback$lambda$0(paymentOptionCallback, paymentOptionResult);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toResultCallback$lambda$0(PaymentOptionCallback paymentOptionCallback, PaymentOptionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        paymentOptionCallback.onPaymentOption(result.getPaymentOption());
    }
}
