package com.stripe.android.networking;

import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW}, m = "start3ds2Auth-0E7RQCE", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripeApiRepository$start3ds2Auth$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$start3ds2Auth$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$start3ds2Auth$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8058start3ds2Auth0E7RQCE = this.this$0.mo8058start3ds2Auth0E7RQCE(null, null, this);
        return objMo8058start3ds2Auth0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8058start3ds2Auth0E7RQCE : Result.m9117boximpl(objMo8058start3ds2Auth0E7RQCE);
    }
}
