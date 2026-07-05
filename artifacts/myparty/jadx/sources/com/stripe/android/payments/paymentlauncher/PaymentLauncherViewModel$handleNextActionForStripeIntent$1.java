package com.stripe.android.payments.paymentlauncher;

import com.facebook.imageutils.JfifUtil;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$handleNextActionForStripeIntent$1", f = "PaymentLauncherViewModel.kt", i = {0}, l = {JfifUtil.MARKER_RST7, 228, 235}, m = "invokeSuspend", n = {"analyticsParams"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class PaymentLauncherViewModel$handleNextActionForStripeIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ AuthActivityStarterHost $host;
    Object L$0;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentLauncherViewModel$handleNextActionForStripeIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, String str, AuthActivityStarterHost authActivityStarterHost, Continuation<? super PaymentLauncherViewModel$handleNextActionForStripeIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$clientSecret = str;
        this.$host = authActivityStarterHost;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentLauncherViewModel$handleNextActionForStripeIntent$1(this.this$0, this.$clientSecret, this.$host, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$handleNextActionForStripeIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        if (r1.performNextAction(r7, r14, (com.stripe.android.core.networking.ApiRequest.Options) r3, r13) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r14, r2, r13) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map mapLogHandleNextActionStarted;
        Object objM8070retrieveStripeIntentBWLJW6A$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.savedStateHandle.set(PaymentLauncherViewModel.KEY_HAS_STARTED, Boxing.boxBoolean(true));
            this.this$0.savedStateHandle.set("confirm_action_requested", Boxing.boxBoolean(false));
            mapLogHandleNextActionStarted = this.this$0.logHandleNextActionStarted(this.$clientSecret);
            StripeRepository stripeRepository = this.this$0.stripeApiRepository;
            String str = this.$clientSecret;
            Object obj2 = this.this$0.apiRequestOptionsProvider.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            this.L$0 = mapLogHandleNextActionStarted;
            this.label = 1;
            objM8070retrieveStripeIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8070retrieveStripeIntentBWLJW6A$default(stripeRepository, str, (ApiRequest.Options) obj2, null, this, 4, null);
            if (objM8070retrieveStripeIntentBWLJW6A$default != coroutine_suspended) {
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
        mapLogHandleNextActionStarted = (Map) this.L$0;
        ResultKt.throwOnFailure(obj);
        objM8070retrieveStripeIntentBWLJW6A$default = ((Result) obj).getValue();
        String str2 = this.$clientSecret;
        PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
        AuthActivityStarterHost authActivityStarterHost = this.$host;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8070retrieveStripeIntentBWLJW6A$default);
        if (thM9121exceptionOrNullimpl != null) {
            CoroutineContext coroutineContext = paymentLauncherViewModel.uiContext;
            PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1 paymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1 = new PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1(paymentLauncherViewModel, thM9121exceptionOrNullimpl, mapLogHandleNextActionStarted, null);
            this.L$0 = null;
            this.label = 3;
        } else {
            PaymentIntent paymentIntentWithUnredactedClientSecret$payments_core_release = (StripeIntent) objM8070retrieveStripeIntentBWLJW6A$default;
            if (paymentIntentWithUnredactedClientSecret$payments_core_release instanceof PaymentIntent) {
                PaymentIntent paymentIntent = (PaymentIntent) paymentIntentWithUnredactedClientSecret$payments_core_release;
                if (paymentIntent.isRedacted$payments_core_release()) {
                    paymentIntentWithUnredactedClientSecret$payments_core_release = paymentIntent.withUnredactedClientSecret$payments_core_release(str2);
                }
            }
            PaymentNextActionHandler nextActionHandler = paymentLauncherViewModel.nextActionHandlerRegistry.getNextActionHandler(paymentIntentWithUnredactedClientSecret$payments_core_release);
            Object obj3 = paymentLauncherViewModel.apiRequestOptionsProvider.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            this.L$0 = null;
            this.label = 2;
        }
    }
}
