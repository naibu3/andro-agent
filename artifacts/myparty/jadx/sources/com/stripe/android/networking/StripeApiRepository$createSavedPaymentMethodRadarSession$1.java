package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0, 0, 0}, l = {1128, 1138}, m = "createSavedPaymentMethodRadarSession-0E7RQCE", n = {"this", "paymentMethodId", "requestOptions"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class StripeApiRepository$createSavedPaymentMethodRadarSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$createSavedPaymentMethodRadarSession$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$createSavedPaymentMethodRadarSession$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8027createSavedPaymentMethodRadarSession0E7RQCE = this.this$0.mo8027createSavedPaymentMethodRadarSession0E7RQCE(null, null, this);
        return objMo8027createSavedPaymentMethodRadarSession0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8027createSavedPaymentMethodRadarSession0E7RQCE : Result.m9117boximpl(objMo8027createSavedPaymentMethodRadarSession0E7RQCE);
    }
}
