package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PaymentSheetViewModel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class PaymentSheetViewModel$walletsState$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    PaymentSheetViewModel$walletsState$1$1(Object obj) {
        super(0, obj, PaymentSheetViewModel.class, "checkoutWithGooglePay", "checkoutWithGooglePay()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PaymentSheetViewModel) this.receiver).checkoutWithGooglePay();
    }
}
