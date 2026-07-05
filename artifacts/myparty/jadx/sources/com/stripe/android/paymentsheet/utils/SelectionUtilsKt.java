package com.stripe.android.paymentsheet.utils;

import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectionUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"canSave", "", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "getSetAsDefaultPaymentMethodFromPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/Boolean;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionUtilsKt {
    public static final boolean canSave(PaymentSelection.New r3, PaymentElementLoader.InitializationMode initializationMode) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
        boolean z = r3.getCustomerRequestedSave() == PaymentSelection.CustomerRequestedSave.RequestReuse;
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.PaymentIntent) {
            return z;
        }
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.SetupIntent) {
            return true;
        }
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.DeferredIntent) {
            return ((PaymentElementLoader.InitializationMode.DeferredIntent) initializationMode).getIntentConfiguration().getMode().getSetupFutureUse() != null || z;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Boolean getSetAsDefaultPaymentMethodFromPaymentSelection(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.New.Card) {
            PaymentMethodExtraParams paymentMethodExtraParams = ((PaymentSelection.New.Card) paymentSelection).getPaymentMethodExtraParams();
            PaymentMethodExtraParams.Card card = paymentMethodExtraParams instanceof PaymentMethodExtraParams.Card ? (PaymentMethodExtraParams.Card) paymentMethodExtraParams : null;
            if (card != null) {
                return card.getSetAsDefault();
            }
            return null;
        }
        if (paymentSelection instanceof PaymentSelection.New.USBankAccount) {
            PaymentMethodExtraParams paymentMethodExtraParams2 = ((PaymentSelection.New.USBankAccount) paymentSelection).getPaymentMethodExtraParams();
            PaymentMethodExtraParams.USBankAccount uSBankAccount = paymentMethodExtraParams2 instanceof PaymentMethodExtraParams.USBankAccount ? (PaymentMethodExtraParams.USBankAccount) paymentMethodExtraParams2 : null;
            if (uSBankAccount != null) {
                return uSBankAccount.getSetAsDefault();
            }
        }
        return null;
    }
}
