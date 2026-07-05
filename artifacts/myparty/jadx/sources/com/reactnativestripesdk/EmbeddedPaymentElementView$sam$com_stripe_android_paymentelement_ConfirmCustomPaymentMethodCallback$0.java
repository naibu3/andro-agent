package com.reactnativestripesdk;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedPaymentElementView.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class EmbeddedPaymentElementView$sam$com_stripe_android_paymentelement_ConfirmCustomPaymentMethodCallback$0 implements ConfirmCustomPaymentMethodCallback, FunctionAdapter {
    private final /* synthetic */ Function2 function;

    EmbeddedPaymentElementView$sam$com_stripe_android_paymentelement_ConfirmCustomPaymentMethodCallback$0(Function2 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ConfirmCustomPaymentMethodCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback
    public final /* synthetic */ void onConfirmCustomPaymentMethod(PaymentSheet.CustomPaymentMethod customPaymentMethod, PaymentMethod.BillingDetails billingDetails) {
        this.function.invoke(customPaymentMethod, billingDetails);
    }
}
