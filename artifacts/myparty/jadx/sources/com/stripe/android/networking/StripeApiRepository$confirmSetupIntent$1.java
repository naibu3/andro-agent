package com.stripe.android.networking;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {0, 0, 0}, l = {WalletConstants.ERROR_CODE_UNKNOWN, WalletConstants.ERROR_CODE_ILLEGAL_CALLER}, m = "confirmSetupIntent-BWLJW6A", n = {"this", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "expandFields"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class StripeApiRepository$confirmSetupIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$confirmSetupIntent$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$confirmSetupIntent$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8021confirmSetupIntentBWLJW6A = this.this$0.mo8021confirmSetupIntentBWLJW6A(null, null, null, this);
        return objMo8021confirmSetupIntentBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8021confirmSetupIntentBWLJW6A : Result.m9117boximpl(objMo8021confirmSetupIntentBWLJW6A);
    }
}
