package com.stripe.android.customersheet.util;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodKtx.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isUnverifiedUSBankAccount", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodKtxKt {
    public static final boolean isUnverifiedUSBankAccount(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        if (paymentMethod.type != PaymentMethod.Type.USBankAccount) {
            return false;
        }
        PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
        return (uSBankAccount != null ? uSBankAccount.financialConnectionsAccount : null) == null;
    }
}
