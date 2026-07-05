package com.stripe.android.payments;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2", f = "PaymentFlowResultProcessor.kt", i = {}, l = {233, 235, 241}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ StripeIntent $originalIntent;
    final /* synthetic */ Ref.IntRef $remainingRetries;
    final /* synthetic */ ApiRequest.Options $requestOptions;
    final /* synthetic */ Ref.ObjectRef<Result<T>> $stripeIntentResult;
    Object L$0;
    int label;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2(PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, Ref.ObjectRef<Result<T>> objectRef, Ref.IntRef intRef, int i, StripeIntent stripeIntent, String str, ApiRequest.Options options, Continuation<? super PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2> continuation) {
        super(2, continuation);
        this.this$0 = paymentFlowResultProcessor;
        this.$stripeIntentResult = objectRef;
        this.$remainingRetries = intRef;
        this.$maxRetries = i;
        this.$originalIntent = stripeIntent;
        this.$clientSecret = str;
        this.$requestOptions = options;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2(this.this$0, this.$stripeIntentResult, this.$remainingRetries, this.$maxRetries, this.$originalIntent, this.$clientSecret, this.$requestOptions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r10 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r10 == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:28:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009e -> B:28:0x00a1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.shouldRetry(this.$stripeIntentResult.element)) {
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            objectRef = this.$stripeIntentResult;
            if (!this.this$0.shouldCallRefreshIntent(this.$originalIntent)) {
            }
            if (!this.this$0.shouldRetry(this.$stripeIntentResult.element)) {
            }
            return Unit.INSTANCE;
        }
        if (i != 2 && i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef = (Ref.ObjectRef) this.L$0;
        ResultKt.throwOnFailure(obj);
        T value = ((Result) obj).getValue();
        objectRef.element = value;
        this.$remainingRetries.element--;
        if (!this.this$0.shouldRetry(this.$stripeIntentResult.element) && this.$remainingRetries.element > 1) {
            this.L$0 = null;
            this.label = 1;
            if (DelayKt.m10627delayVtjQ1oo(((PaymentFlowResultProcessor) this.this$0).retryDelaySupplier.mo7235getDelay3nIYWDw(this.$maxRetries, this.$remainingRetries.element), this) != coroutine_suspended) {
                objectRef = this.$stripeIntentResult;
                if (!this.this$0.shouldCallRefreshIntent(this.$originalIntent)) {
                    this.L$0 = objectRef;
                    this.label = 2;
                    Object objMo8154refreshStripeIntentBWLJW6A = this.this$0.mo8154refreshStripeIntentBWLJW6A(this.$clientSecret, this.$requestOptions, PaymentFlowResultProcessor.INSTANCE.getEXPAND_PAYMENT_METHOD(), this);
                    value = objMo8154refreshStripeIntentBWLJW6A;
                } else {
                    this.L$0 = objectRef;
                    this.label = 3;
                    Object objMo8155retrieveStripeIntentBWLJW6A = this.this$0.mo8155retrieveStripeIntentBWLJW6A(this.$clientSecret, this.$requestOptions, PaymentFlowResultProcessor.INSTANCE.getEXPAND_PAYMENT_METHOD(), this);
                    value = objMo8155retrieveStripeIntentBWLJW6A;
                }
                if (!this.this$0.shouldRetry(this.$stripeIntentResult.element)) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
