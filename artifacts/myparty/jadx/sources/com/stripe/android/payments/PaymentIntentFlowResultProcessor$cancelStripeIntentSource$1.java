package com.stripe.android.payments;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.PaymentIntentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", i = {}, l = {329}, m = "cancelStripeIntentSource-BWLJW6A", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentIntentFlowResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1(PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor, Continuation<? super PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1> continuation) {
        super(continuation);
        this.this$0 = paymentIntentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8152cancelStripeIntentSourceBWLJW6A = this.this$0.mo8152cancelStripeIntentSourceBWLJW6A(null, null, null, this);
        return objMo8152cancelStripeIntentSourceBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8152cancelStripeIntentSourceBWLJW6A : Result.m9117boximpl(objMo8152cancelStripeIntentSourceBWLJW6A);
    }
}
