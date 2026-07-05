package com.stripe.android.payments;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.PaymentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", i = {}, l = {47}, m = "processResult-gIAlu-s", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentFlowResultProcessor$processResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentFlowResultProcessor$processResult$1(PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, Continuation<? super PaymentFlowResultProcessor$processResult$1> continuation) {
        super(continuation);
        this.this$0 = paymentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8153processResultgIAlus = this.this$0.m8153processResultgIAlus(null, this);
        return objM8153processResultgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8153processResultgIAlus : Result.m9117boximpl(objM8153processResultgIAlus);
    }
}
