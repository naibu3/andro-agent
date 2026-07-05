package com.stripe.android.financialconnections.lite.network;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FinancialConnectionsLiteRequestExecutor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.lite.network.FinancialConnectionsLiteRequestExecutor", f = "FinancialConnectionsLiteRequestExecutor.kt", i = {0, 0, 0}, l = {42}, m = "executeInternal-0E7RQCE", n = {"this", "request", "decodeResponse"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class FinancialConnectionsLiteRequestExecutor$executeInternal$1<Response> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsLiteRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinancialConnectionsLiteRequestExecutor$executeInternal$1(FinancialConnectionsLiteRequestExecutor financialConnectionsLiteRequestExecutor, Continuation<? super FinancialConnectionsLiteRequestExecutor$executeInternal$1> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsLiteRequestExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7504executeInternal0E7RQCE = this.this$0.m7504executeInternal0E7RQCE(null, null, this);
        return objM7504executeInternal0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7504executeInternal0E7RQCE : Result.m9117boximpl(objM7504executeInternal0E7RQCE);
    }
}
