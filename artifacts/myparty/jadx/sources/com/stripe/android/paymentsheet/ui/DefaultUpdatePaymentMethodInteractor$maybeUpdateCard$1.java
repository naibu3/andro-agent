package com.stripe.android.paymentsheet.ui;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UpdatePaymentMethodInteractor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor", f = "UpdatePaymentMethodInteractor.kt", i = {0}, l = {299}, m = "maybeUpdateCard-CmtIpJM", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultUpdatePaymentMethodInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1(DefaultUpdatePaymentMethodInteractor defaultUpdatePaymentMethodInteractor, Continuation<? super DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1> continuation) {
        super(continuation);
        this.this$0 = defaultUpdatePaymentMethodInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8458maybeUpdateCardCmtIpJM(this);
    }
}
