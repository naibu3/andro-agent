package com.stripe.android.payments;

import androidx.exifinterface.media.ExifInterface;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [S] */
/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002 \u0001*\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", ExifInterface.LATITUDE_SOUTH, "Lcom/stripe/android/StripeIntentResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.PaymentFlowResultProcessor$processResult$2", f = "PaymentFlowResultProcessor.kt", i = {0, 0, 1, 2}, l = {57, 72, 95}, m = "invokeSuspend", n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "requestOptions", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, s = {"L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes6.dex */
final class PaymentFlowResultProcessor$processResult$2<S> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends S>>, Object> {
    final /* synthetic */ PaymentFlowResult.Unvalidated $unvalidatedResult;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentFlowResultProcessor$processResult$2(PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, PaymentFlowResult.Unvalidated unvalidated, Continuation<? super PaymentFlowResultProcessor$processResult$2> continuation) {
        super(2, continuation);
        this.this$0 = paymentFlowResultProcessor;
        this.$unvalidatedResult = unvalidated;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentFlowResultProcessor$processResult$2 paymentFlowResultProcessor$processResult$2 = new PaymentFlowResultProcessor$processResult$2(this.this$0, this.$unvalidatedResult, continuation);
        paymentFlowResultProcessor$processResult$2.L$0 = obj;
        return paymentFlowResultProcessor$processResult$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends S>> continuation) {
        return ((PaymentFlowResultProcessor$processResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM9118constructorimpl;
        Object objM9118constructorimpl2;
        Object objMo8155retrieveStripeIntentBWLJW6A;
        PaymentFlowResult.Validated validated;
        ApiRequest.Options options;
        StripeIntentResult stripeIntentResultCreateStripeIntentResult;
        Object value;
        PaymentFlowResult.Validated validated2;
        PaymentFlowResultProcessor paymentFlowResultProcessor;
        String publishableKey;
        String threeDS2IntentId;
        Object value2;
        PaymentFlowResult.Validated validated3;
        PaymentFlowResultProcessor paymentFlowResultProcessor2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentFlowResult.Unvalidated unvalidated = this.$unvalidatedResult;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(unvalidated.validate$payments_core_release());
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
            if (thM9121exceptionOrNullimpl == null) {
                PaymentFlowResult.Validated validated4 = (PaymentFlowResult.Validated) objM9118constructorimpl2;
                Object obj2 = ((PaymentFlowResultProcessor) this.this$0).publishableKeyProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                ApiRequest.Options options2 = new ApiRequest.Options((String) obj2, validated4.getStripeAccountId(), null, 4, null);
                this.L$0 = validated4;
                this.L$1 = options2;
                this.label = 1;
                objMo8155retrieveStripeIntentBWLJW6A = this.this$0.mo8155retrieveStripeIntentBWLJW6A(validated4.getClientSecret(), options2, PaymentFlowResultProcessor.INSTANCE.getEXPAND_PAYMENT_METHOD(), this);
                if (objMo8155retrieveStripeIntentBWLJW6A != coroutine_suspended) {
                    validated = validated4;
                    options = options2;
                }
                return coroutine_suspended;
            }
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m9117boximpl(Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl)));
        }
        if (i != 1) {
            if (i == 2) {
                paymentFlowResultProcessor2 = (PaymentFlowResultProcessor) this.L$1;
                validated3 = (PaymentFlowResult.Validated) this.L$0;
                ResultKt.throwOnFailure(obj);
                value2 = ((Result) obj).getValue();
                ResultKt.throwOnFailure(value2);
                StripeIntent stripeIntent = (StripeIntent) value2;
                stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor2.createStripeIntentResult(stripeIntent, paymentFlowResultProcessor2.determineFlowOutcome(stripeIntent, validated3.getFlowOutcome$payments_core_release()), paymentFlowResultProcessor2.failureMessageFactory.create(stripeIntent, validated3.getFlowOutcome$payments_core_release()));
                objM9118constructorimpl = Result.m9118constructorimpl(stripeIntentResultCreateStripeIntentResult);
                return Result.m9117boximpl(objM9118constructorimpl);
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentFlowResultProcessor = (PaymentFlowResultProcessor) this.L$1;
            validated2 = (PaymentFlowResult.Validated) this.L$0;
            ResultKt.throwOnFailure(obj);
            value = ((Result) obj).getValue();
            ResultKt.throwOnFailure(value);
            StripeIntent stripeIntent2 = (StripeIntent) value;
            stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(stripeIntent2, validated2.getFlowOutcome$payments_core_release(), paymentFlowResultProcessor.failureMessageFactory.create(stripeIntent2, validated2.getFlowOutcome$payments_core_release()));
            objM9118constructorimpl = Result.m9118constructorimpl(stripeIntentResultCreateStripeIntentResult);
            return Result.m9117boximpl(objM9118constructorimpl);
        }
        options = (ApiRequest.Options) this.L$1;
        validated = (PaymentFlowResult.Validated) this.L$0;
        ResultKt.throwOnFailure(obj);
        objMo8155retrieveStripeIntentBWLJW6A = ((Result) obj).getValue();
        PaymentFlowResultProcessor paymentFlowResultProcessor3 = this.this$0;
        if (!Result.m9125isSuccessimpl(objMo8155retrieveStripeIntentBWLJW6A)) {
            objM9118constructorimpl = Result.m9118constructorimpl(objMo8155retrieveStripeIntentBWLJW6A);
            return Result.m9117boximpl(objM9118constructorimpl);
        }
        Result.Companion companion5 = Result.INSTANCE;
        StripeIntent stripeIntent3 = (StripeIntent) objMo8155retrieveStripeIntentBWLJW6A;
        if (stripeIntent3.getStatus() != StripeIntent.Status.Succeeded && stripeIntent3.getStatus() != StripeIntent.Status.RequiresCapture) {
            if (!paymentFlowResultProcessor3.shouldRefreshIntent(stripeIntent3, validated.getFlowOutcome$payments_core_release())) {
                if (paymentFlowResultProcessor3.shouldCancelIntentSource(stripeIntent3, validated.getCanCancelSource$payments_core_release())) {
                    String sourceId$payments_core_release = validated.getSourceId$payments_core_release();
                    String str = "";
                    if (sourceId$payments_core_release == null) {
                        sourceId$payments_core_release = "";
                    }
                    paymentFlowResultProcessor3.logger.debug("Canceling source '" + sourceId$payments_core_release + "' for '" + stripeIntent3.getClass().getSimpleName() + "'");
                    StripeIntent.NextActionData nextActionData = stripeIntent3.getNextActionData();
                    StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2 = nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS2 ? (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData : null;
                    if (use3DS2 == null || (threeDS2IntentId = use3DS2.getThreeDS2IntentId()) == null) {
                        String id = stripeIntent3.getId();
                        if (id != null) {
                            str = id;
                        }
                    } else {
                        str = threeDS2IntentId;
                    }
                    if (use3DS2 != null && (publishableKey = use3DS2.getPublishableKey()) != null) {
                        options = new ApiRequest.Options(publishableKey, null, null, 6, null);
                    }
                    this.L$0 = validated;
                    this.L$1 = paymentFlowResultProcessor3;
                    this.label = 3;
                    Object objMo8152cancelStripeIntentSourceBWLJW6A = paymentFlowResultProcessor3.mo8152cancelStripeIntentSourceBWLJW6A(str, options, sourceId$payments_core_release, this);
                    if (objMo8152cancelStripeIntentSourceBWLJW6A != coroutine_suspended) {
                        value = objMo8152cancelStripeIntentSourceBWLJW6A;
                        validated2 = validated;
                        paymentFlowResultProcessor = paymentFlowResultProcessor3;
                        ResultKt.throwOnFailure(value);
                        StripeIntent stripeIntent22 = (StripeIntent) value;
                        stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor.createStripeIntentResult(stripeIntent22, validated2.getFlowOutcome$payments_core_release(), paymentFlowResultProcessor.failureMessageFactory.create(stripeIntent22, validated2.getFlowOutcome$payments_core_release()));
                    }
                } else {
                    stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor3.createStripeIntentResult(stripeIntent3, validated.getFlowOutcome$payments_core_release(), paymentFlowResultProcessor3.failureMessageFactory.create(stripeIntent3, validated.getFlowOutcome$payments_core_release()));
                }
            } else {
                String clientSecret = validated.getClientSecret();
                this.L$0 = validated;
                this.L$1 = paymentFlowResultProcessor3;
                this.label = 2;
                Object objM8151refreshStripeIntentUntilTerminalStateBWLJW6A = paymentFlowResultProcessor3.m8151refreshStripeIntentUntilTerminalStateBWLJW6A(stripeIntent3, clientSecret, options, this);
                if (objM8151refreshStripeIntentUntilTerminalStateBWLJW6A != coroutine_suspended) {
                    value2 = objM8151refreshStripeIntentUntilTerminalStateBWLJW6A;
                    validated3 = validated;
                    paymentFlowResultProcessor2 = paymentFlowResultProcessor3;
                    ResultKt.throwOnFailure(value2);
                    StripeIntent stripeIntent4 = (StripeIntent) value2;
                    stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor2.createStripeIntentResult(stripeIntent4, paymentFlowResultProcessor2.determineFlowOutcome(stripeIntent4, validated3.getFlowOutcome$payments_core_release()), paymentFlowResultProcessor2.failureMessageFactory.create(stripeIntent4, validated3.getFlowOutcome$payments_core_release()));
                }
            }
            return coroutine_suspended;
        }
        stripeIntentResultCreateStripeIntentResult = paymentFlowResultProcessor3.createStripeIntentResult(stripeIntent3, 1, paymentFlowResultProcessor3.failureMessageFactory.create(stripeIntent3, validated.getFlowOutcome$payments_core_release()));
        objM9118constructorimpl = Result.m9118constructorimpl(stripeIntentResultCreateStripeIntentResult);
        return Result.m9117boximpl(objM9118constructorimpl);
    }
}
