package com.stripe.android.paymentsheet.ui;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: UpdatePaymentMethodUI.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1", f = "UpdatePaymentMethodUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1 extends SuspendLambda implements Function2<PaymentMethod, Continuation<? super Throwable>, Object> {
    int label;

    UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1(Continuation<? super UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaymentMethod paymentMethod, Continuation<? super Throwable> continuation) {
        return ((UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1) create(paymentMethod, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return null;
    }
}
