package com.stripe.android.financialconnections.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {}, l = {296}, m = "updateAvailableIncentives-BWLJW6A", n = {}, s = {})
/* loaded from: classes5.dex */
final class FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsConsumerSessionRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1(FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl, Continuation<? super FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsConsumerSessionRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7548updateAvailableIncentivesBWLJW6A = this.this$0.mo7548updateAvailableIncentivesBWLJW6A(null, null, null, this);
        return objMo7548updateAvailableIncentivesBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7548updateAvailableIncentivesBWLJW6A : Result.m9117boximpl(objMo7548updateAvailableIncentivesBWLJW6A);
    }
}
