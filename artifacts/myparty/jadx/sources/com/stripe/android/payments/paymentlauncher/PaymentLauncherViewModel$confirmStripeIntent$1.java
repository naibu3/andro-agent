package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.StripeIntent;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1", f = "PaymentLauncherViewModel.kt", i = {0, 0}, l = {128, 138, 145, 153}, m = "invokeSuspend", n = {"analyticsParams", "returnUrl"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class PaymentLauncherViewModel$confirmStripeIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmStripeIntentParams $confirmStripeIntentParams;
    final /* synthetic */ AuthActivityStarterHost $host;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentLauncherViewModel$confirmStripeIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, ConfirmStripeIntentParams confirmStripeIntentParams, AuthActivityStarterHost authActivityStarterHost, Continuation<? super PaymentLauncherViewModel$confirmStripeIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$confirmStripeIntentParams = confirmStripeIntentParams;
        this.$host = authActivityStarterHost;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentLauncherViewModel$confirmStripeIntent$1(this.this$0, this.$confirmStripeIntentParams, this.$host, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$confirmStripeIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r2, r11) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        if (r1.performNextAction(r8, r12, (com.stripe.android.core.networking.ApiRequest.Options) r2, r11) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r12, r1, r11) == r0) goto L49;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String returnUrl;
        Map map;
        Object value;
        String id;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.savedStateHandle.set(PaymentLauncherViewModel.KEY_HAS_STARTED, Boxing.boxBoolean(true));
            this.this$0.savedStateHandle.set("confirm_action_requested", Boxing.boxBoolean(true));
            Map mapLogConfirmStarted = this.this$0.logConfirmStarted(this.$confirmStripeIntentParams);
            this.this$0.logReturnUrl(this.$confirmStripeIntentParams.getReturnUrl());
            if (this.this$0.isInstantApp) {
                returnUrl = this.$confirmStripeIntentParams.getReturnUrl();
            } else {
                returnUrl = this.$confirmStripeIntentParams.getReturnUrl();
                String str = returnUrl;
                if (str == null || StringsKt.isBlank(str)) {
                    returnUrl = null;
                }
                if (returnUrl == null) {
                    returnUrl = this.this$0.defaultReturnUrl.getValue();
                }
            }
            this.L$0 = mapLogConfirmStarted;
            this.L$1 = returnUrl;
            this.label = 1;
            Object objM8204confirmIntent0E7RQCE = this.this$0.m8204confirmIntent0E7RQCE(this.$confirmStripeIntentParams, returnUrl, this);
            if (objM8204confirmIntent0E7RQCE != coroutine_suspended) {
                map = mapLogConfirmStarted;
                value = objM8204confirmIntent0E7RQCE;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        returnUrl = (String) this.L$1;
        map = (Map) this.L$0;
        ResultKt.throwOnFailure(obj);
        value = ((Result) obj).getValue();
        PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
        AuthActivityStarterHost authActivityStarterHost = this.$host;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
        if (thM9121exceptionOrNullimpl != null) {
            CoroutineContext coroutineContext = paymentLauncherViewModel.uiContext;
            PaymentLauncherViewModel$confirmStripeIntent$1$2$1 paymentLauncherViewModel$confirmStripeIntent$1$2$1 = new PaymentLauncherViewModel$confirmStripeIntent$1$2$1(paymentLauncherViewModel, thM9121exceptionOrNullimpl, map, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
        } else {
            StripeIntent stripeIntent = (StripeIntent) value;
            StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
            if (nextActionData != null && (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS1) && (id = stripeIntent.getId()) != null) {
                Map map2 = paymentLauncherViewModel.threeDs1IntentReturnUrlMap;
                if (returnUrl == null) {
                    returnUrl = "";
                }
                map2.put(id, returnUrl);
            }
            if (!stripeIntent.requiresAction()) {
                CoroutineContext coroutineContext2 = paymentLauncherViewModel.uiContext;
                PaymentLauncherViewModel$confirmStripeIntent$1$1$2 paymentLauncherViewModel$confirmStripeIntent$1$1$2 = new PaymentLauncherViewModel$confirmStripeIntent$1$1$2(paymentLauncherViewModel, stripeIntent, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            } else {
                PaymentNextActionHandler nextActionHandler = paymentLauncherViewModel.nextActionHandlerRegistry.getNextActionHandler(stripeIntent);
                Object obj2 = paymentLauncherViewModel.apiRequestOptionsProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
        }
    }
}
