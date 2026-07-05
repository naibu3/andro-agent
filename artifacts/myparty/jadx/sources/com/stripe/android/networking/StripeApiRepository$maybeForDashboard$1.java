package com.stripe.android.networking;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0}, l = {1900}, m = "maybeForDashboard-0E7RQCE", n = {"$this$maybeForDashboard_u2d0E7RQCE"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class StripeApiRepository$maybeForDashboard$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$maybeForDashboard$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$maybeForDashboard$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8009maybeForDashboard0E7RQCE = this.this$0.m8009maybeForDashboard0E7RQCE((ConfirmPaymentIntentParams) null, (ApiRequest.Options) null, (Continuation<? super Result<ConfirmPaymentIntentParams>>) this);
        return objM8009maybeForDashboard0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8009maybeForDashboard0E7RQCE : Result.m9117boximpl(objM8009maybeForDashboard0E7RQCE);
    }
}
