package com.stripe.android;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripePaymentController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {0, 0, 0, 1, 1}, l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, 412}, m = "authenticateAlipay-BWLJW6A", n = {"this", "paymentIntent", "requestOptions", "this", "outcome"}, s = {"L$0", "L$1", "L$2", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class StripePaymentController$authenticateAlipay$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripePaymentController$authenticateAlipay$1(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController$authenticateAlipay$1> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7206authenticateAlipayBWLJW6A = this.this$0.m7206authenticateAlipayBWLJW6A(null, null, null, this);
        return objM7206authenticateAlipayBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7206authenticateAlipayBWLJW6A : Result.m9117boximpl(objM7206authenticateAlipayBWLJW6A);
    }
}
