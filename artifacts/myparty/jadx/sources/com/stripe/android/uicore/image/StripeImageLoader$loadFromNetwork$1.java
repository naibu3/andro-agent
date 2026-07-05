package com.stripe.android.uicore.image;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeImageLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader", f = "StripeImageLoader.kt", i = {0, 0}, l = {99}, m = "loadFromNetwork-BWLJW6A", n = {"this", "url"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class StripeImageLoader$loadFromNetwork$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeImageLoader$loadFromNetwork$1(StripeImageLoader stripeImageLoader, Continuation<? super StripeImageLoader$loadFromNetwork$1> continuation) {
        super(continuation);
        this.this$0 = stripeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8884loadFromNetworkBWLJW6A = this.this$0.m8884loadFromNetworkBWLJW6A(null, 0, 0, this);
        return objM8884loadFromNetworkBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8884loadFromNetworkBWLJW6A : Result.m9117boximpl(objM8884loadFromNetworkBWLJW6A);
    }
}
