package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.BankFormScreenState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BankFormScreenState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"updateWithMandate", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;", "mandate", "Lcom/stripe/android/core/strings/ResolvableString;", "updateWithLinkedBankAccount", "account", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankFormScreenStateKt {
    public static final BankFormScreenState updateWithMandate(BankFormScreenState bankFormScreenState, ResolvableString resolvableString) {
        Intrinsics.checkNotNullParameter(bankFormScreenState, "<this>");
        return (bankFormScreenState.getLinkedBankAccount() == null || resolvableString == null) ? bankFormScreenState : BankFormScreenState.copy$default(bankFormScreenState, false, null, false, BankFormScreenState.LinkedBankAccount.copy$default(bankFormScreenState.getLinkedBankAccount(), null, null, null, null, null, resolvableString, false, false, 223, null), null, 23, null);
    }

    public static final BankFormScreenState updateWithLinkedBankAccount(BankFormScreenState bankFormScreenState, BankFormScreenState.LinkedBankAccount account) {
        Intrinsics.checkNotNullParameter(bankFormScreenState, "<this>");
        Intrinsics.checkNotNullParameter(account, "account");
        return BankFormScreenState.copy$default(bankFormScreenState, false, null, false, account, null, 3, null);
    }
}
