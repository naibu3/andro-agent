package com.stripe.android.paymentsheet.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomerApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {0, 0}, l = {164}, m = "updatePaymentMethod-BWLJW6A", n = {"this", "paymentMethodId"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class CustomerApiRepository$updatePaymentMethod$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerApiRepository$updatePaymentMethod$1(CustomerApiRepository customerApiRepository, Continuation<? super CustomerApiRepository$updatePaymentMethod$1> continuation) {
        super(continuation);
        this.this$0 = customerApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8419updatePaymentMethodBWLJW6A = this.this$0.mo8419updatePaymentMethodBWLJW6A(null, null, null, this);
        return objMo8419updatePaymentMethodBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8419updatePaymentMethodBWLJW6A : Result.m9117boximpl(objMo8419updatePaymentMethodBWLJW6A);
    }
}
