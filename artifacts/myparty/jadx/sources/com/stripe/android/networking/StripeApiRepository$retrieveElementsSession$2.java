package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1675}, m = "retrieveElementsSession-BWLJW6A", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripeApiRepository$retrieveElementsSession$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$retrieveElementsSession$2(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$retrieveElementsSession$2> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8011retrieveElementsSessionBWLJW6A = this.this$0.m8011retrieveElementsSessionBWLJW6A(null, null, null, this);
        return objM8011retrieveElementsSessionBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8011retrieveElementsSessionBWLJW6A : Result.m9117boximpl(objM8011retrieveElementsSessionBWLJW6A);
    }
}
