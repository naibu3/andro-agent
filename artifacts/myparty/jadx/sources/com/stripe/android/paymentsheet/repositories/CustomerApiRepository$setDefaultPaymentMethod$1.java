package com.stripe.android.paymentsheet.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomerApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {}, l = {178}, m = "setDefaultPaymentMethod-0E7RQCE", n = {}, s = {})
/* loaded from: classes6.dex */
final class CustomerApiRepository$setDefaultPaymentMethod$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerApiRepository$setDefaultPaymentMethod$1(CustomerApiRepository customerApiRepository, Continuation<? super CustomerApiRepository$setDefaultPaymentMethod$1> continuation) {
        super(continuation);
        this.this$0 = customerApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8418setDefaultPaymentMethod0E7RQCE = this.this$0.mo8418setDefaultPaymentMethod0E7RQCE(null, null, this);
        return objMo8418setDefaultPaymentMethod0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8418setDefaultPaymentMethod0E7RQCE : Result.m9117boximpl(objMo8418setDefaultPaymentMethod0E7RQCE);
    }
}
