package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BacsMandateConfirmationForm.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class BacsMandateConfirmationFormKt$BacsMandateConfirmationFormScreen$1$1 extends FunctionReferenceImpl implements Function1<BacsMandateConfirmationViewAction, Unit> {
    BacsMandateConfirmationFormKt$BacsMandateConfirmationFormScreen$1$1(Object obj) {
        super(1, obj, BacsMandateConfirmationViewModel.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BacsMandateConfirmationViewAction bacsMandateConfirmationViewAction) {
        invoke2(bacsMandateConfirmationViewAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BacsMandateConfirmationViewAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BacsMandateConfirmationViewModel) this.receiver).handleViewAction(p0);
    }
}
