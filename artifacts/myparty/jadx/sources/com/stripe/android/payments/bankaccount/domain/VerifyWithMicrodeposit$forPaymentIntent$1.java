package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VerifyWithMicrodeposit.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.bankaccount.domain.VerifyWithMicrodeposit", f = "VerifyWithMicrodeposit.kt", i = {}, l = {23}, m = "forPaymentIntent-yxL6bBk", n = {}, s = {})
/* loaded from: classes6.dex */
final class VerifyWithMicrodeposit$forPaymentIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VerifyWithMicrodeposit this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerifyWithMicrodeposit$forPaymentIntent$1(VerifyWithMicrodeposit verifyWithMicrodeposit, Continuation<? super VerifyWithMicrodeposit$forPaymentIntent$1> continuation) {
        super(continuation);
        this.this$0 = verifyWithMicrodeposit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8167forPaymentIntentyxL6bBk = this.this$0.m8167forPaymentIntentyxL6bBk(null, null, 0, 0, this);
        return objM8167forPaymentIntentyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8167forPaymentIntentyxL6bBk : Result.m9117boximpl(objM8167forPaymentIntentyxL6bBk);
    }
}
