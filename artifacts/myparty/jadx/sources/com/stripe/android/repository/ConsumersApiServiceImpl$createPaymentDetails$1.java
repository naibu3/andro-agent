package com.stripe.android.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConsumersApiService.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.repository.ConsumersApiServiceImpl", f = "ConsumersApiService.kt", i = {}, l = {331}, m = "createPaymentDetails-yxL6bBk", n = {}, s = {})
/* loaded from: classes6.dex */
final class ConsumersApiServiceImpl$createPaymentDetails$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConsumersApiServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConsumersApiServiceImpl$createPaymentDetails$1(ConsumersApiServiceImpl consumersApiServiceImpl, Continuation<? super ConsumersApiServiceImpl$createPaymentDetails$1> continuation) {
        super(continuation);
        this.this$0 = consumersApiServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8599createPaymentDetailsyxL6bBk = this.this$0.mo8599createPaymentDetailsyxL6bBk(null, null, null, null, this);
        return objMo8599createPaymentDetailsyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8599createPaymentDetailsyxL6bBk : Result.m9117boximpl(objMo8599createPaymentDetailsyxL6bBk);
    }
}
