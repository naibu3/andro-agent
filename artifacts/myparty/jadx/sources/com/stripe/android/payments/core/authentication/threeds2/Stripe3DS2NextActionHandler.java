package com.stripe.android.payments.core.authentication.threeds2;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionStarter;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3DS2NextActionHandler.kt */
@Singleton
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J&\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0094@¢\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2NextActionHandler;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "config", "Lcom/stripe/android/PaymentAuthConfig;", NamedConstantsKt.ENABLE_LOGGING, "", "publishableKeyProvider", "Lkotlin/Function0;", "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Lcom/stripe/android/PaymentAuthConfig;ZLkotlin/jvm/functions/Function0;Ljava/util/Set;)V", "stripe3ds2CompletionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "getStripe3ds2CompletionLauncher$payments_core_release$annotations", "()V", "getStripe3ds2CompletionLauncher$payments_core_release", "()Landroidx/activity/result/ActivityResultLauncher;", "setStripe3ds2CompletionLauncher$payments_core_release", "(Landroidx/activity/result/ActivityResultLauncher;)V", "stripe3ds2CompletionStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "onNewActivityResultCaller", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "onLauncherInvalidated", "performNextActionOnResumed", "host", "actionable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Stripe3DS2NextActionHandler extends PaymentNextActionHandler<StripeIntent> {
    public static final int $stable = 8;
    private final PaymentAuthConfig config;
    private final boolean enableLogging;
    private final Set<String> productUsage;
    private final Function0<String> publishableKeyProvider;
    private ActivityResultLauncher<Stripe3ds2TransactionContract.Args> stripe3ds2CompletionLauncher;
    private final Function1<AuthActivityStarterHost, Stripe3ds2TransactionStarter> stripe3ds2CompletionStarterFactory;

    public static /* synthetic */ void getStripe3ds2CompletionLauncher$payments_core_release$annotations() {
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public /* bridge */ /* synthetic */ Object performNextActionOnResumed(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performNextActionOnResumed2(authActivityStarterHost, stripeIntent, options, (Continuation<? super Unit>) continuation);
    }

    @Inject
    public Stripe3DS2NextActionHandler(PaymentAuthConfig config, @Named(NamedConstantsKt.ENABLE_LOGGING) boolean z, @Named("publishableKey") Function0<String> publishableKeyProvider, @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsage) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        this.config = config;
        this.enableLogging = z;
        this.publishableKeyProvider = publishableKeyProvider;
        this.productUsage = productUsage;
        this.stripe3ds2CompletionStarterFactory = new Function1() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2NextActionHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Stripe3DS2NextActionHandler.stripe3ds2CompletionStarterFactory$lambda$1(this.f$0, (AuthActivityStarterHost) obj);
            }
        };
    }

    public final ActivityResultLauncher<Stripe3ds2TransactionContract.Args> getStripe3ds2CompletionLauncher$payments_core_release() {
        return this.stripe3ds2CompletionLauncher;
    }

    public final void setStripe3ds2CompletionLauncher$payments_core_release(ActivityResultLauncher<Stripe3ds2TransactionContract.Args> activityResultLauncher) {
        this.stripe3ds2CompletionLauncher = activityResultLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stripe3ds2TransactionStarter stripe3ds2CompletionStarterFactory$lambda$1(Stripe3DS2NextActionHandler stripe3DS2NextActionHandler, AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(host, "host");
        ActivityResultLauncher<Stripe3ds2TransactionContract.Args> activityResultLauncher = stripe3DS2NextActionHandler.stripe3ds2CompletionLauncher;
        if (activityResultLauncher != null) {
            return new Stripe3ds2TransactionStarter.Modern(activityResultLauncher);
        }
        return new Stripe3ds2TransactionStarter.Legacy(host);
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(ActivityResultCaller activityResultCaller, ActivityResultCallback<PaymentFlowResult.Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        this.stripe3ds2CompletionLauncher = activityResultCaller.registerForActivityResult(new Stripe3ds2TransactionContract(), activityResultCallback);
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        ActivityResultLauncher<Stripe3ds2TransactionContract.Args> activityResultLauncher = this.stripe3ds2CompletionLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.stripe3ds2CompletionLauncher = null;
    }

    /* renamed from: performNextActionOnResumed, reason: avoid collision after fix types in other method */
    protected Object performNextActionOnResumed2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        Stripe3ds2TransactionStarter stripe3ds2TransactionStarterInvoke = this.stripe3ds2CompletionStarterFactory.invoke(authActivityStarterHost);
        SdkTransactionId sdkTransactionIdCreate = SdkTransactionId.INSTANCE.create();
        PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config = this.config.getStripe3ds2Config();
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        Intrinsics.checkNotNull(nextActionData, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2");
        stripe3ds2TransactionStarterInvoke.start(new Stripe3ds2TransactionContract.Args(sdkTransactionIdCreate, stripe3ds2Config, stripeIntent, (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData, options, this.enableLogging, authActivityStarterHost.getStatusBarColor(), this.publishableKeyProvider.invoke(), this.productUsage));
        return Unit.INSTANCE;
    }
}
