package com.stripe.android.core.networking;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Add missing generic type declarations: [BodyType] */
/* compiled from: DefaultStripeNetworkClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/core/networking/StripeResponse;", "BodyType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.core.networking.DefaultStripeNetworkClient$executeInternal$2", f = "DefaultStripeNetworkClient.kt", i = {}, l = {50, 56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultStripeNetworkClient$executeInternal$2<BodyType> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super StripeResponse<BodyType>>, Object> {
    final /* synthetic */ int $remainingRetries;
    final /* synthetic */ Function0<StripeResponse<BodyType>> $requester;
    final /* synthetic */ Iterable<Integer> $retryResponseCodes;
    int label;
    final /* synthetic */ DefaultStripeNetworkClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultStripeNetworkClient$executeInternal$2(Function0<StripeResponse<BodyType>> function0, Iterable<Integer> iterable, int i, DefaultStripeNetworkClient defaultStripeNetworkClient, Continuation<? super DefaultStripeNetworkClient$executeInternal$2> continuation) {
        super(2, continuation);
        this.$requester = function0;
        this.$retryResponseCodes = iterable;
        this.$remainingRetries = i;
        this.this$0 = defaultStripeNetworkClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultStripeNetworkClient$executeInternal$2(this.$requester, this.$retryResponseCodes, this.$remainingRetries, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super StripeResponse<BodyType>> continuation) {
        return ((DefaultStripeNetworkClient$executeInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeResponse<BodyType> stripeResponseInvoke = this.$requester.invoke();
            if (!CollectionsKt.contains(this.$retryResponseCodes, Boxing.boxInt(stripeResponseInvoke.getCode())) || this.$remainingRetries <= 0) {
                return stripeResponseInvoke;
            }
            this.this$0.logger.info("Request failed with code " + stripeResponseInvoke.getCode() + ". Retrying up to " + this.$remainingRetries + " more time(s).");
            this.label = 1;
            if (DelayKt.m10627delayVtjQ1oo(this.this$0.retryDelaySupplier.mo7235getDelay3nIYWDw(3, this.$remainingRetries), this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (StripeResponse) obj;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 2;
        obj = this.this$0.executeInternal$stripe_core_release(this.$remainingRetries - 1, this.$retryResponseCodes, this.$requester, this);
    }
}
