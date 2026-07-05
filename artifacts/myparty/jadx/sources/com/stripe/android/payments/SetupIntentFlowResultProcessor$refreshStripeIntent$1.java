package com.stripe.android.payments;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.SetupIntentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", i = {}, l = {382}, m = "refreshStripeIntent-BWLJW6A", n = {}, s = {})
/* loaded from: classes6.dex */
final class SetupIntentFlowResultProcessor$refreshStripeIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SetupIntentFlowResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetupIntentFlowResultProcessor$refreshStripeIntent$1(SetupIntentFlowResultProcessor setupIntentFlowResultProcessor, Continuation<? super SetupIntentFlowResultProcessor$refreshStripeIntent$1> continuation) {
        super(continuation);
        this.this$0 = setupIntentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8154refreshStripeIntentBWLJW6A = this.this$0.mo8154refreshStripeIntentBWLJW6A(null, null, null, this);
        return objMo8154refreshStripeIntentBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8154refreshStripeIntentBWLJW6A : Result.m9117boximpl(objMo8154refreshStripeIntentBWLJW6A);
    }
}
