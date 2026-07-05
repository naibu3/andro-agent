package com.stripe.android.networking;

import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0}, l = {1735}, m = "fetchStripeModelResult-BWLJW6A", n = {"jsonParser"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class StripeApiRepository$fetchStripeModelResult$1<ModelType extends StripeModel> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$fetchStripeModelResult$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$fetchStripeModelResult$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8007fetchStripeModelResultBWLJW6A = this.this$0.m8007fetchStripeModelResultBWLJW6A(null, null, null, this);
        return objM8007fetchStripeModelResultBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8007fetchStripeModelResultBWLJW6A : Result.m9117boximpl(objM8007fetchStripeModelResultBWLJW6A);
    }
}
