package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetCompose.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class PaymentSheetComposeKt$internalRememberPaymentSheet$onResult$2$1 extends FunctionReferenceImpl implements Function1<PaymentSheetResult, Unit> {
    PaymentSheetComposeKt$internalRememberPaymentSheet$onResult$2$1(Object obj) {
        super(1, obj, PaymentSheetResultCallback.class, "onPaymentSheetResult", "onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentSheetResult paymentSheetResult) {
        invoke2(paymentSheetResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentSheetResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PaymentSheetResultCallback) this.receiver).onPaymentSheetResult(p0);
    }
}
