package com.stripe.android.paymentsheet.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomerApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {0, 0, 0, 0, 2, 2, 2, 2}, l = {238, 254, 297, 304}, m = "detachPaymentMethodAndDuplicates-BWLJW6A", n = {"$this$detachPaymentMethodAndDuplicates_u2dBWLJW6A", "customerInfo", "paymentMethodId", "$this$detachPaymentMethodAndDuplicates_BWLJW6A_u24lambda_u2411", "$this$detachPaymentMethodAndDuplicates_u2dBWLJW6A", "customerInfo", "paymentMethodId", "failureResults"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
final class CustomerApiRepository$detachPaymentMethodAndDuplicates$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerApiRepository$detachPaymentMethodAndDuplicates$1(CustomerApiRepository customerApiRepository, Continuation<? super CustomerApiRepository$detachPaymentMethodAndDuplicates$1> continuation) {
        super(continuation);
        this.this$0 = customerApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8414detachPaymentMethodAndDuplicatesBWLJW6A = this.this$0.m8414detachPaymentMethodAndDuplicatesBWLJW6A(null, null, null, this);
        return objM8414detachPaymentMethodAndDuplicatesBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8414detachPaymentMethodAndDuplicatesBWLJW6A : Result.m9117boximpl(objM8414detachPaymentMethodAndDuplicatesBWLJW6A);
    }
}
