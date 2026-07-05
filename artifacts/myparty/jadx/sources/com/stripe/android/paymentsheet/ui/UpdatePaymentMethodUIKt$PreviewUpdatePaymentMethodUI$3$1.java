package com.stripe.android.paymentsheet.ui;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: UpdatePaymentMethodUI.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "<unused var>", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1", f = "UpdatePaymentMethodUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1 extends SuspendLambda implements Function2<PaymentMethod, Continuation<? super Result<? extends Unit>>, Object> {
    int label;

    UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1(Continuation<? super UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1(continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaymentMethod paymentMethod, Continuation<? super Result<Unit>> continuation) {
        return ((UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1) create(paymentMethod, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaymentMethod paymentMethod, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(paymentMethod, (Continuation<? super Result<Unit>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Result.Companion companion = Result.INSTANCE;
        return Result.m9117boximpl(Result.m9118constructorimpl(Unit.INSTANCE));
    }
}
