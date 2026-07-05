package com.stripe.android;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripePaymentController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {0, 0, 0}, l = {199, 202}, m = "confirmAndAuthenticateAlipay-BWLJW6A", n = {"this", "authenticator", "requestOptions"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class StripePaymentController$confirmAndAuthenticateAlipay$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripePaymentController$confirmAndAuthenticateAlipay$1(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController$confirmAndAuthenticateAlipay$1> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7195confirmAndAuthenticateAlipayBWLJW6A = this.this$0.mo7195confirmAndAuthenticateAlipayBWLJW6A(null, null, null, this);
        return objMo7195confirmAndAuthenticateAlipayBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7195confirmAndAuthenticateAlipayBWLJW6A : Result.m9117boximpl(objMo7195confirmAndAuthenticateAlipayBWLJW6A);
    }
}
