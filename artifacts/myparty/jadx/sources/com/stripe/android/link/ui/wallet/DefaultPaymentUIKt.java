package com.stripe.android.link.ui.wallet;

import com.stripe.android.link.ui.wallet.DefaultPaymentUI;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultPaymentUI.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toDefaultPaymentUI", "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "enableDefaultValuesInECE", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultPaymentUIKt {
    public static final DefaultPaymentUI toDefaultPaymentUI(DisplayablePaymentDetails displayablePaymentDetails, boolean z) {
        DefaultPaymentUI.PaymentType.BankAccount bankAccount;
        Intrinsics.checkNotNullParameter(displayablePaymentDetails, "<this>");
        if (!z || displayablePaymentDetails.getLast4() == null) {
            return null;
        }
        String defaultPaymentType = displayablePaymentDetails.getDefaultPaymentType();
        if (Intrinsics.areEqual(defaultPaymentType, "CARD")) {
            bankAccount = new DefaultPaymentUI.PaymentType.Card(PaymentMethodsUiExtensionKt.getCardBrandIconForVerticalMode(CardBrand.INSTANCE.fromCode(displayablePaymentDetails.getDefaultCardBrand())));
        } else {
            bankAccount = Intrinsics.areEqual(defaultPaymentType, "BANK_ACCOUNT") ? new DefaultPaymentUI.PaymentType.BankAccount(null) : null;
        }
        if (bankAccount == null) {
            return null;
        }
        String last4 = displayablePaymentDetails.getLast4();
        if (last4 != null) {
            return new DefaultPaymentUI(bankAccount, last4);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
