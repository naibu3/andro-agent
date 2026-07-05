package com.stripe.android.payments.core.authentication;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.ActivityResultLauncherHost;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentNextActionHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH¤@¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Actionable", "Lcom/stripe/android/payments/core/ActivityResultLauncherHost;", "<init>", "()V", "performNextAction", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "actionable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performNextActionOnResumed", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentNextActionHandler<Actionable> implements ActivityResultLauncherHost {
    public static final int $stable = 0;

    /* compiled from: PaymentNextActionHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.PaymentNextActionHandler", f = "PaymentNextActionHandler.kt", i = {0, 0, 0, 0}, l = {35, 36}, m = "performNextAction", n = {"this", "host", "actionable", "requestOptions"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.stripe.android.payments.core.authentication.PaymentNextActionHandler$performNextAction$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PaymentNextActionHandler<Actionable> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaymentNextActionHandler<Actionable> paymentNextActionHandler, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = paymentNextActionHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.performNextAction(null, null, null, this);
        }
    }

    protected abstract Object performNextActionOnResumed(AuthActivityStarterHost authActivityStarterHost, Actionable actionable, ApiRequest.Options options, Continuation<? super Unit> continuation);

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        ActivityResultLauncherHost.DefaultImpls.onLauncherInvalidated(this);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(ActivityResultCaller activityResultCaller, ActivityResultCallback<PaymentFlowResult.Unvalidated> activityResultCallback) {
        ActivityResultLauncherHost.DefaultImpls.onNewActivityResultCaller(this, activityResultCaller, activityResultCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r2.performNextActionOnResumed(r6, r7, r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performNextAction(AuthActivityStarterHost authActivityStarterHost, Actionable actionable, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        PaymentNextActionHandler paymentNextActionHandler;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner lifecycleOwner = authActivityStarterHost.getLifecycleOwner();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = authActivityStarterHost;
            anonymousClass1.L$2 = actionable;
            anonymousClass1.L$3 = options;
            anonymousClass1.label = 1;
            if (PaymentNextActionHandlerKt.awaitResumed(lifecycleOwner, anonymousClass1) != coroutine_suspended) {
                paymentNextActionHandler = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        options = (ApiRequest.Options) anonymousClass1.L$3;
        actionable = (Actionable) anonymousClass1.L$2;
        authActivityStarterHost = (AuthActivityStarterHost) anonymousClass1.L$1;
        paymentNextActionHandler = (PaymentNextActionHandler) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
    }
}
