package com.stripe.android;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripePaymentController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {}, l = {244}, m = "confirmSetupIntent-0E7RQCE", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripePaymentController$confirmSetupIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripePaymentController$confirmSetupIntent$1(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController$confirmSetupIntent$1> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7208confirmSetupIntent0E7RQCE = this.this$0.m7208confirmSetupIntent0E7RQCE(null, null, this);
        return objM7208confirmSetupIntent0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7208confirmSetupIntent0E7RQCE : Result.m9117boximpl(objM7208confirmSetupIntent0E7RQCE);
    }
}
