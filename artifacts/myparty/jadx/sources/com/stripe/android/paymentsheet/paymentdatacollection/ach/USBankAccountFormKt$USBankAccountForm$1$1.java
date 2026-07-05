package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: USBankAccountForm.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class USBankAccountFormKt$USBankAccountForm$1$1 extends AdaptedFunctionReference implements Function0<Unit> {
    USBankAccountFormKt$USBankAccountForm$1$1(Object obj) {
        super(0, obj, USBankAccountFormViewModel.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        USBankAccountFormViewModel.reset$default((USBankAccountFormViewModel) this.receiver, null, 1, null);
    }
}
