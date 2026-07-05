package com.stripe.android.paymentsheet.ui;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CardUpdateParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: UpdatePaymentMethodUI.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "<unused var>", "Lcom/stripe/android/paymentsheet/CardUpdateParams;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1", f = "UpdatePaymentMethodUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1 extends SuspendLambda implements Function3<PaymentMethod, CardUpdateParams, Continuation<? super Result<? extends PaymentMethod>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1(Continuation<? super UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Continuation<? super Result<PaymentMethod>> continuation) {
        UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1 updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1 = new UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1(continuation);
        updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1.L$0 = paymentMethod;
        return updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Continuation<? super Result<? extends PaymentMethod>> continuation) {
        return invoke2(paymentMethod, cardUpdateParams, (Continuation<? super Result<PaymentMethod>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaymentMethod paymentMethod = (PaymentMethod) this.L$0;
        Result.Companion companion = Result.INSTANCE;
        return Result.m9117boximpl(Result.m9118constructorimpl(paymentMethod));
    }
}
