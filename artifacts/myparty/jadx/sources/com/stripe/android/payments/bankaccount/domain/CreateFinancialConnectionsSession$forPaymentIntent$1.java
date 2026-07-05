package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreateFinancialConnectionsSession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession", f = "CreateFinancialConnectionsSession.kt", i = {}, l = {34}, m = "forPaymentIntent-hUnOzRk", n = {}, s = {})
/* loaded from: classes6.dex */
final class CreateFinancialConnectionsSession$forPaymentIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateFinancialConnectionsSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateFinancialConnectionsSession$forPaymentIntent$1(CreateFinancialConnectionsSession createFinancialConnectionsSession, Continuation<? super CreateFinancialConnectionsSession$forPaymentIntent$1> continuation) {
        super(continuation);
        this.this$0 = createFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8163forPaymentIntenthUnOzRk = this.this$0.m8163forPaymentIntenthUnOzRk(null, null, null, null, null, this);
        return objM8163forPaymentIntenthUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8163forPaymentIntenthUnOzRk : Result.m9117boximpl(objM8163forPaymentIntenthUnOzRk);
    }
}
