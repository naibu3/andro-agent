package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.verticalmode.BankFormInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: USBankAccountFormArguments.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class USBankAccountFormArguments$Companion$create$2 extends FunctionReferenceImpl implements Function1<PaymentSelection.New.USBankAccount, Unit> {
    USBankAccountFormArguments$Companion$create$2(Object obj) {
        super(1, obj, BankFormInteractor.class, "handleLinkedBankAccountChanged", "handleLinkedBankAccountChanged(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentSelection.New.USBankAccount uSBankAccount) {
        invoke2(uSBankAccount);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentSelection.New.USBankAccount uSBankAccount) {
        ((BankFormInteractor) this.receiver).handleLinkedBankAccountChanged(uSBankAccount);
    }
}
