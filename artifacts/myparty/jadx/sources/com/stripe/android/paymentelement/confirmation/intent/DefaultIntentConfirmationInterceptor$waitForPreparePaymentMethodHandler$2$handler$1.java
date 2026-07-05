package com.stripe.android.paymentelement.confirmation.intent;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: IntentConfirmationInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1", f = "IntentConfirmationInterceptor.kt", i = {}, l = {FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PreparePaymentMethodHandler>, Object> {
    final /* synthetic */ DefaultIntentConfirmationInterceptor $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor, Continuation<? super DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1> continuation) {
        super(2, continuation);
        this.$this_run = defaultIntentConfirmationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1(this.$this_run, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PreparePaymentMethodHandler> continuation) {
        return ((DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0028 -> B:13:0x002b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PreparePaymentMethodHandler preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler = null;
            if (preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler == null) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler = this.$this_run.retrievePreparePaymentMethodHandler();
            if (preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler == null) {
                this.label = 1;
                if (DelayKt.delay(5L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler = this.$this_run.retrievePreparePaymentMethodHandler();
                if (preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler == null) {
                    return preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler;
                }
            }
        }
    }
}
