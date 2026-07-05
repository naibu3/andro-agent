package com.stripe.android.paymentsheet.ui;

import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PaymentSheetScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class PaymentSheetScreenKt$PaymentSheetScreen$8$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    PaymentSheetScreenKt$PaymentSheetScreen$8$1$1(Object obj) {
        super(0, obj, BaseSheetViewModel.class, "handleBackPressed", "handleBackPressed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BaseSheetViewModel) this.receiver).handleBackPressed();
    }
}
