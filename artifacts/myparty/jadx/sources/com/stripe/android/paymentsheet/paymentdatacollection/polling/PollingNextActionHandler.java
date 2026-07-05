package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.uicore.utils.AnimationConstants;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PollingNextActionHandler.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0094@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingNextActionHandler;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "<init>", "()V", "pollingLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "performNextActionOnResumed", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "actionable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNewActivityResultCaller", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "onLauncherInvalidated", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PollingNextActionHandler extends PaymentNextActionHandler<StripeIntent> {
    public static final int $stable = 8;
    private ActivityResultLauncher<PollingContract.Args> pollingLauncher;

    /* compiled from: PollingNextActionHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Upi.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.Blik.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public /* bridge */ /* synthetic */ Object performNextActionOnResumed(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performNextActionOnResumed2(authActivityStarterHost, stripeIntent, options, (Continuation<? super Unit>) continuation);
    }

    /* renamed from: performNextActionOnResumed, reason: avoid collision after fix types in other method */
    protected Object performNextActionOnResumed2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        PollingContract.Args args;
        PaymentMethod.Type type;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        String str = null;
        PaymentMethod.Type type2 = paymentMethod != null ? paymentMethod.type : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            String clientSecret = stripeIntent.getClientSecret();
            if (clientSecret != null) {
                args = new PollingContract.Args(clientSecret, authActivityStarterHost.getStatusBarColor(), 300, 5, 12, R.string.stripe_upi_polling_message, options.getStripeAccount());
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else if (i == 2) {
            String clientSecret2 = stripeIntent.getClientSecret();
            if (clientSecret2 != null) {
                args = new PollingContract.Args(clientSecret2, authActivityStarterHost.getStatusBarColor(), 60, 5, 12, R.string.stripe_blik_confirm_payment, options.getStripeAccount());
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            PaymentMethod paymentMethod2 = stripeIntent.getPaymentMethod();
            if (paymentMethod2 != null && (type = paymentMethod2.type) != null) {
                str = type.code;
            }
            throw new IllegalStateException(("Received invalid payment method type " + str + " in PollingAuthenticator").toString());
        }
        ActivityOptionsCompat activityOptionsCompatMakeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(authActivityStarterHost.getApplication().getApplicationContext(), AnimationConstants.INSTANCE.getFADE_IN(), AnimationConstants.INSTANCE.getFADE_OUT());
        Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeCustomAnimation, "makeCustomAnimation(...)");
        ActivityResultLauncher<PollingContract.Args> activityResultLauncher = this.pollingLauncher;
        if (activityResultLauncher == null) {
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, authActivityStarterHost.getApplication(), null, 2, null), ErrorReporter.UnexpectedErrorEvent.MISSING_POLLING_AUTHENTICATOR, null, null, 6, null);
        } else {
            activityResultLauncher.launch(args, activityOptionsCompatMakeCustomAnimation);
        }
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(ActivityResultCaller activityResultCaller, ActivityResultCallback<PaymentFlowResult.Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        this.pollingLauncher = activityResultCaller.registerForActivityResult(new PollingContract(), activityResultCallback);
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        ActivityResultLauncher<PollingContract.Args> activityResultLauncher = this.pollingLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.pollingLauncher = null;
    }
}
