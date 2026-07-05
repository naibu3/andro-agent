package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: USBankAccountFormArguments.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class USBankAccountFormArguments$Companion$create$3 extends FunctionReferenceImpl implements Function1<PrimaryButton.State, Unit> {
    USBankAccountFormArguments$Companion$create$3(Object obj) {
        super(1, obj, BaseSheetViewModel.class, "updatePrimaryButtonState", "updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PrimaryButton.State state) {
        invoke2(state);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PrimaryButton.State p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BaseSheetViewModel) this.receiver).updatePrimaryButtonState(p0);
    }
}
