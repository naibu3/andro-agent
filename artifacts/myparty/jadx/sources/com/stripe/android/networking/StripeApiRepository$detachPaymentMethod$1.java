package com.stripe.android.networking;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.exception.CardException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {775}, m = "detachPaymentMethod-BWLJW6A", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripeApiRepository$detachPaymentMethod$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$detachPaymentMethod$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$detachPaymentMethod$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8033detachPaymentMethodBWLJW6A = this.this$0.mo8033detachPaymentMethodBWLJW6A(null, null, null, this);
        return objMo8033detachPaymentMethodBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8033detachPaymentMethodBWLJW6A : Result.m9117boximpl(objMo8033detachPaymentMethodBWLJW6A);
    }
}
