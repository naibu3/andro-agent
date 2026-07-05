package com.stripe.android.networking;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0, 0, 0}, l = {JfifUtil.MARKER_SOI, JfifUtil.MARKER_EOI}, m = "confirmPaymentIntent-BWLJW6A", n = {"this", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "expandFields"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class StripeApiRepository$confirmPaymentIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$confirmPaymentIntent$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$confirmPaymentIntent$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8020confirmPaymentIntentBWLJW6A = this.this$0.mo8020confirmPaymentIntentBWLJW6A(null, null, null, this);
        return objMo8020confirmPaymentIntentBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8020confirmPaymentIntentBWLJW6A : Result.m9117boximpl(objMo8020confirmPaymentIntentBWLJW6A);
    }
}
