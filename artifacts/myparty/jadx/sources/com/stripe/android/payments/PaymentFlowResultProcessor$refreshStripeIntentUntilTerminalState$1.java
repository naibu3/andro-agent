package com.stripe.android.payments;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.PaymentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2}, l = {214, 220, 227}, m = "refreshStripeIntentUntilTerminalState-BWLJW6A", n = {"this", "originalIntent", "clientSecret", "requestOptions", "remainingRetries", "stripeIntentResult", "maxRetries", "this", "originalIntent", "clientSecret", "requestOptions", "remainingRetries", "stripeIntentResult", "maxRetries", "stripeIntentResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0"})
/* loaded from: classes6.dex */
final class PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1(PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, Continuation<? super PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1> continuation) {
        super(continuation);
        this.this$0 = paymentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8151refreshStripeIntentUntilTerminalStateBWLJW6A = this.this$0.m8151refreshStripeIntentUntilTerminalStateBWLJW6A(null, null, null, this);
        return objM8151refreshStripeIntentUntilTerminalStateBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8151refreshStripeIntentUntilTerminalStateBWLJW6A : Result.m9117boximpl(objM8151refreshStripeIntentUntilTerminalStateBWLJW6A);
    }
}
