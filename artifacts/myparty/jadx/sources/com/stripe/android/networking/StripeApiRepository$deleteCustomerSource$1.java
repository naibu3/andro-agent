package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {720}, m = "deleteCustomerSource-hUnOzRk", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripeApiRepository$deleteCustomerSource$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$deleteCustomerSource$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$deleteCustomerSource$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8031deleteCustomerSourcehUnOzRk = this.this$0.mo8031deleteCustomerSourcehUnOzRk(null, null, null, null, null, this);
        return objMo8031deleteCustomerSourcehUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8031deleteCustomerSourcehUnOzRk : Result.m9117boximpl(objMo8031deleteCustomerSourcehUnOzRk);
    }
}
