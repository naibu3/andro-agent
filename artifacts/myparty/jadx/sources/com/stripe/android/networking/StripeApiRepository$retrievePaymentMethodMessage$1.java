package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {1465}, m = "retrievePaymentMethodMessage-eH_QyT8", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripeApiRepository$retrievePaymentMethodMessage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$retrievePaymentMethodMessage$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$retrievePaymentMethodMessage$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8050retrievePaymentMethodMessageeH_QyT8 = this.this$0.mo8050retrievePaymentMethodMessageeH_QyT8(null, 0, null, null, null, null, null, this);
        return objMo8050retrievePaymentMethodMessageeH_QyT8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8050retrievePaymentMethodMessageeH_QyT8 : Result.m9117boximpl(objMo8050retrievePaymentMethodMessageeH_QyT8);
    }
}
