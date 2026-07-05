package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RetrieveStripeIntent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent", f = "RetrieveStripeIntent.kt", i = {}, l = {19}, m = "invoke-0E7RQCE", n = {}, s = {})
/* loaded from: classes6.dex */
final class RetrieveStripeIntent$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetrieveStripeIntent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetrieveStripeIntent$invoke$1(RetrieveStripeIntent retrieveStripeIntent, Continuation<? super RetrieveStripeIntent$invoke$1> continuation) {
        super(continuation);
        this.this$0 = retrieveStripeIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8165invoke0E7RQCE = this.this$0.m8165invoke0E7RQCE(null, null, this);
        return objM8165invoke0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8165invoke0E7RQCE : Result.m9117boximpl(objM8165invoke0E7RQCE);
    }
}
