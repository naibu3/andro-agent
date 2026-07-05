package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Stripe.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.Stripe", f = "Stripe.kt", i = {}, l = {1535}, m = "createTokenOrThrow$payments_core_release", n = {}, s = {})
/* loaded from: classes5.dex */
final class Stripe$createTokenOrThrow$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Stripe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Stripe$createTokenOrThrow$1(Stripe stripe, Continuation<? super Stripe$createTokenOrThrow$1> continuation) {
        super(continuation);
        this.this$0 = stripe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createTokenOrThrow$payments_core_release(null, null, null, this);
    }
}
