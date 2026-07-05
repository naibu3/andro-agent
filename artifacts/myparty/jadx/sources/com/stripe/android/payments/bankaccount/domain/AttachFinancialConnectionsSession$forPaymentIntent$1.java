package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AttachFinancialConnectionsSession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession", f = "AttachFinancialConnectionsSession.kt", i = {}, l = {30}, m = "forPaymentIntent-yxL6bBk", n = {}, s = {})
/* loaded from: classes6.dex */
final class AttachFinancialConnectionsSession$forPaymentIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AttachFinancialConnectionsSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AttachFinancialConnectionsSession$forPaymentIntent$1(AttachFinancialConnectionsSession attachFinancialConnectionsSession, Continuation<? super AttachFinancialConnectionsSession$forPaymentIntent$1> continuation) {
        super(continuation);
        this.this$0 = attachFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8160forPaymentIntentyxL6bBk = this.this$0.m8160forPaymentIntentyxL6bBk(null, null, null, null, this);
        return objM8160forPaymentIntentyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8160forPaymentIntentyxL6bBk : Result.m9117boximpl(objM8160forPaymentIntentyxL6bBk);
    }
}
