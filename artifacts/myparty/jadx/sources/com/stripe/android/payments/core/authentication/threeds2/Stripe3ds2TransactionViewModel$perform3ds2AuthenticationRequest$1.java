package com.stripe.android.payments.core.authentication.threeds2;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", f = "Stripe3ds2TransactionViewModel.kt", i = {}, l = {140}, m = "perform3ds2AuthenticationRequest-yxL6bBk", n = {}, s = {})
/* loaded from: classes6.dex */
final class Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1(Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, Continuation<? super Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1> continuation) {
        super(continuation);
        this.this$0 = stripe3ds2TransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8175perform3ds2AuthenticationRequestyxL6bBk = this.this$0.m8175perform3ds2AuthenticationRequestyxL6bBk(null, null, null, 0, this);
        return objM8175perform3ds2AuthenticationRequestyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8175perform3ds2AuthenticationRequestyxL6bBk : Result.m9117boximpl(objM8175perform3ds2AuthenticationRequestyxL6bBk);
    }
}
