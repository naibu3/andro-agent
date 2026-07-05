package com.stripe.android.payments.paymentlauncher;

import com.facebook.imagepipeline.common.RotationOptions;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$onPaymentFlowResult$1", f = "PaymentLauncherViewModel.kt", i = {}, l = {268, RotationOptions.ROTATE_270, 275}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentLauncherViewModel$onPaymentFlowResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentFlowResult.Unvalidated $paymentFlowResult;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentLauncherViewModel$onPaymentFlowResult$1(PaymentLauncherViewModel paymentLauncherViewModel, PaymentFlowResult.Unvalidated unvalidated, Continuation<? super PaymentLauncherViewModel$onPaymentFlowResult$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$paymentFlowResult = unvalidated;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentLauncherViewModel$onPaymentFlowResult$1(this.this$0, this.$paymentFlowResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$onPaymentFlowResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r2, r4, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r7, r3, r6) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM8153processResultgIAlus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentFlowResultProcessor paymentFlowResultProcessor = this.this$0.isPaymentIntent ? (PaymentFlowResultProcessor) this.this$0.lazyPaymentIntentFlowResultProcessor.get() : (PaymentFlowResultProcessor) this.this$0.lazySetupIntentFlowResultProcessor.get();
            this.label = 1;
            objM8153processResultgIAlus = paymentFlowResultProcessor.m8153processResultgIAlus(this.$paymentFlowResult, this);
            if (objM8153processResultgIAlus != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objM8153processResultgIAlus = ((Result) obj).getValue();
        PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8153processResultgIAlus);
        if (thM9121exceptionOrNullimpl == null) {
            CoroutineContext coroutineContext = paymentLauncherViewModel.uiContext;
            PaymentLauncherViewModel$onPaymentFlowResult$1$1$1 paymentLauncherViewModel$onPaymentFlowResult$1$1$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1$1$1(paymentLauncherViewModel, (StripeIntentResult) objM8153processResultgIAlus, null);
            this.label = 2;
        } else {
            CoroutineContext coroutineContext2 = paymentLauncherViewModel.uiContext;
            PaymentLauncherViewModel$onPaymentFlowResult$1$2$1 paymentLauncherViewModel$onPaymentFlowResult$1$2$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1$2$1(paymentLauncherViewModel, thM9121exceptionOrNullimpl, null);
            this.label = 3;
        }
    }
}
