package com.stripe.android.uicore.image;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeImageLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader", f = "StripeImageLoader.kt", i = {}, l = {50}, m = "load-BWLJW6A", n = {}, s = {})
/* loaded from: classes6.dex */
final class StripeImageLoader$load$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeImageLoader$load$1(StripeImageLoader stripeImageLoader, Continuation<? super StripeImageLoader$load$1> continuation) {
        super(continuation);
        this.this$0 = stripeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8886loadBWLJW6A = this.this$0.m8886loadBWLJW6A(null, 0, 0, this);
        return objM8886loadBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8886loadBWLJW6A : Result.m9117boximpl(objM8886loadBWLJW6A);
    }
}
