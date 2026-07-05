package com.stripe.android.financialconnections.lite.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FinancialConnectionsLiteRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepositoryImpl", f = "FinancialConnectionsLiteRepository.kt", i = {}, l = {34}, m = "synchronize-0E7RQCE", n = {}, s = {})
/* loaded from: classes5.dex */
final class FinancialConnectionsLiteRepositoryImpl$synchronize$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsLiteRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinancialConnectionsLiteRepositoryImpl$synchronize$1(FinancialConnectionsLiteRepositoryImpl financialConnectionsLiteRepositoryImpl, Continuation<? super FinancialConnectionsLiteRepositoryImpl$synchronize$1> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsLiteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7507synchronize0E7RQCE = this.this$0.mo7507synchronize0E7RQCE(null, null, this);
        return objMo7507synchronize0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7507synchronize0E7RQCE : Result.m9117boximpl(objMo7507synchronize0E7RQCE);
    }
}
