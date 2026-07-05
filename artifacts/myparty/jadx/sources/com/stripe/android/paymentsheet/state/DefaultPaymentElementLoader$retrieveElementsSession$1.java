package com.stripe.android.paymentsheet.state;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentElementLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {}, l = {291}, m = "retrieveElementsSession-hUnOzRk", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultPaymentElementLoader$retrieveElementsSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultPaymentElementLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaymentElementLoader$retrieveElementsSession$1(DefaultPaymentElementLoader defaultPaymentElementLoader, Continuation<? super DefaultPaymentElementLoader$retrieveElementsSession$1> continuation) {
        super(continuation);
        this.this$0 = defaultPaymentElementLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8424retrieveElementsSessionhUnOzRk = this.this$0.m8424retrieveElementsSessionhUnOzRk(null, null, null, null, null, this);
        return objM8424retrieveElementsSessionhUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8424retrieveElementsSessionhUnOzRk : Result.m9117boximpl(objM8424retrieveElementsSessionhUnOzRk);
    }
}
