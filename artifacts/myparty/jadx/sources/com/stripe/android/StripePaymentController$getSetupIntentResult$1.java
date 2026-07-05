package com.stripe.android;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripePaymentController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {}, l = {369}, m = "getSetupIntentResult-gIAlu-s", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripePaymentController$getSetupIntentResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripePaymentController$getSetupIntentResult$1(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController$getSetupIntentResult$1> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7199getSetupIntentResultgIAlus = this.this$0.mo7199getSetupIntentResultgIAlus(null, this);
        return objMo7199getSetupIntentResultgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7199getSetupIntentResultgIAlus : Result.m9117boximpl(objMo7199getSetupIntentResultgIAlus);
    }
}
