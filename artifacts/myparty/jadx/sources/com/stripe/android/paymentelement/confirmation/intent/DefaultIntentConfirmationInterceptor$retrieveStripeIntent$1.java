package com.stripe.android.paymentelement.confirmation.intent;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IntentConfirmationInterceptor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {}, l = {573}, m = "retrieveStripeIntent-gIAlu-s", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultIntentConfirmationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor, Continuation<? super DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1> continuation) {
        super(continuation);
        this.this$0 = defaultIntentConfirmationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8080retrieveStripeIntentgIAlus = this.this$0.m8080retrieveStripeIntentgIAlus(null, this);
        return objM8080retrieveStripeIntentgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8080retrieveStripeIntentgIAlus : Result.m9117boximpl(objM8080retrieveStripeIntentgIAlus);
    }
}
