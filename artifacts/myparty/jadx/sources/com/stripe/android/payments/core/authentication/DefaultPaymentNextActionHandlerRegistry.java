package com.stripe.android.payments.core.authentication;

import android.content.Context;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.injection.DaggerNextActionHandlerComponent;
import com.stripe.android.payments.core.injection.IntentAuthenticatorMap;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultPaymentNextActionHandlerRegistry.kt */
@Singleton
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 82\u00020\u0001:\u00018B\\\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012/\b\u0001\u0010\u0006\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\t0\bj\u0002`\n\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\u000e¢\u0006\u0002\b\r0\u0007\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010,\u001a\b\u0012\u0004\u0012\u0002H-0\u000b\"\u0004\b\u0000\u0010-2\u0006\u0010.\u001a\u0002H-H\u0016¢\u0006\u0002\u0010/J\u001e\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0016J\b\u00107\u001a\u000201H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u0006\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\t0\bj\u0002`\n\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\u000e¢\u0006\u0002\b\r0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0015\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\t0\bj\u0002`\n\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\u000e¢\u0006\u0002\b\r0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u000b0\u001b8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\"X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'¨\u00069"}, d2 = {"Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "noOpIntentNextActionHandler", "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;", "sourceNextActionHandler", "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;", "paymentNextActionHandlers", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/payments/core/authentication/NextActionHandlerKey;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/stripe/android/payments/core/authentication/NextActionHandler;", "includePaymentSheetNextActionHandlers", "", "applicationContext", "Landroid/content/Context;", "<init>", "(Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;Ljava/util/Map;ZLandroid/content/Context;)V", "paymentSheetNextActionHandlers", "getPaymentSheetNextActionHandlers", "()Ljava/util/Map;", "paymentSheetNextActionHandlers$delegate", "Lkotlin/Lazy;", "allNextActionHandlers", "", "Lcom/stripe/android/core/model/StripeModel;", "getAllNextActionHandlers$payments_core_release$annotations", "()V", "getAllNextActionHandlers$payments_core_release", "()Ljava/util/Set;", "paymentRelayLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "getPaymentRelayLauncher$payments_core_release", "()Landroidx/activity/result/ActivityResultLauncher;", "setPaymentRelayLauncher$payments_core_release", "(Landroidx/activity/result/ActivityResultLauncher;)V", "paymentBrowserAuthLauncher", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "getPaymentBrowserAuthLauncher$payments_core_release", "setPaymentBrowserAuthLauncher$payments_core_release", "getNextActionHandler", "Actionable", "actionable", "(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "onNewActivityResultCaller", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "onLauncherInvalidated", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPaymentNextActionHandlerRegistry implements PaymentNextActionHandlerRegistry {
    private final boolean includePaymentSheetNextActionHandlers;
    private final NoOpIntentNextActionHandler noOpIntentNextActionHandler;
    private ActivityResultLauncher<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher;
    private final Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> paymentNextActionHandlers;
    private ActivityResultLauncher<PaymentRelayStarter.Args> paymentRelayLauncher;

    /* renamed from: paymentSheetNextActionHandlers$delegate, reason: from kotlin metadata */
    private final Lazy paymentSheetNextActionHandlers;
    private final SourceNextActionHandler sourceNextActionHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getAllNextActionHandlers$payments_core_release$annotations() {
    }

    @Inject
    public DefaultPaymentNextActionHandlerRegistry(NoOpIntentNextActionHandler noOpIntentNextActionHandler, SourceNextActionHandler sourceNextActionHandler, @IntentAuthenticatorMap Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> paymentNextActionHandlers, @Named(NamedConstantsKt.INCLUDE_PAYMENT_SHEET_NEXT_ACTION_HANDLERS) boolean z, final Context applicationContext) {
        Intrinsics.checkNotNullParameter(noOpIntentNextActionHandler, "noOpIntentNextActionHandler");
        Intrinsics.checkNotNullParameter(sourceNextActionHandler, "sourceNextActionHandler");
        Intrinsics.checkNotNullParameter(paymentNextActionHandlers, "paymentNextActionHandlers");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.noOpIntentNextActionHandler = noOpIntentNextActionHandler;
        this.sourceNextActionHandler = sourceNextActionHandler;
        this.paymentNextActionHandlers = paymentNextActionHandlers;
        this.includePaymentSheetNextActionHandlers = z;
        this.paymentSheetNextActionHandlers = LazyKt.lazy(new Function0() { // from class: com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultPaymentNextActionHandlerRegistry.paymentSheetNextActionHandlers_delegate$lambda$0(this.f$0, applicationContext);
            }
        });
    }

    private final Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> getPaymentSheetNextActionHandlers() {
        return (Map) this.paymentSheetNextActionHandlers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map paymentSheetNextActionHandlers_delegate$lambda$0(DefaultPaymentNextActionHandlerRegistry defaultPaymentNextActionHandlerRegistry, Context context) {
        return DefaultPaymentNextActionHandlerRegistryKt.paymentSheetNextActionHandlers(defaultPaymentNextActionHandlerRegistry.includePaymentSheetNextActionHandlers, context);
    }

    public final Set<PaymentNextActionHandler<? extends StripeModel>> getAllNextActionHandlers$payments_core_release() {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        setCreateSetBuilder.add(this.noOpIntentNextActionHandler);
        setCreateSetBuilder.add(this.sourceNextActionHandler);
        setCreateSetBuilder.addAll(this.paymentNextActionHandlers.values());
        setCreateSetBuilder.addAll(getPaymentSheetNextActionHandlers().values());
        return SetsKt.build(setCreateSetBuilder);
    }

    public final ActivityResultLauncher<PaymentRelayStarter.Args> getPaymentRelayLauncher$payments_core_release() {
        return this.paymentRelayLauncher;
    }

    public final void setPaymentRelayLauncher$payments_core_release(ActivityResultLauncher<PaymentRelayStarter.Args> activityResultLauncher) {
        this.paymentRelayLauncher = activityResultLauncher;
    }

    public final ActivityResultLauncher<PaymentBrowserAuthContract.Args> getPaymentBrowserAuthLauncher$payments_core_release() {
        return this.paymentBrowserAuthLauncher;
    }

    public final void setPaymentBrowserAuthLauncher$payments_core_release(ActivityResultLauncher<PaymentBrowserAuthContract.Args> activityResultLauncher) {
        this.paymentBrowserAuthLauncher = activityResultLauncher;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry
    public <Actionable> PaymentNextActionHandler<Actionable> getNextActionHandler(Actionable actionable) {
        NoOpIntentNextActionHandler noOpIntentNextActionHandler;
        if (actionable instanceof StripeIntent) {
            StripeIntent stripeIntent = (StripeIntent) actionable;
            if (!stripeIntent.requiresAction()) {
                NoOpIntentNextActionHandler noOpIntentNextActionHandler2 = this.noOpIntentNextActionHandler;
                Intrinsics.checkNotNull(noOpIntentNextActionHandler2, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
                return noOpIntentNextActionHandler2;
            }
            Map mapPlus = MapsKt.plus(this.paymentNextActionHandlers, getPaymentSheetNextActionHandlers());
            StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
            if (nextActionData == null || (noOpIntentNextActionHandler = (PaymentNextActionHandler) mapPlus.get(nextActionData.getClass())) == null) {
                noOpIntentNextActionHandler = this.noOpIntentNextActionHandler;
            }
            Intrinsics.checkNotNull(noOpIntentNextActionHandler, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return noOpIntentNextActionHandler;
        }
        if (actionable instanceof Source) {
            SourceNextActionHandler sourceNextActionHandler = this.sourceNextActionHandler;
            Intrinsics.checkNotNull(sourceNextActionHandler, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return sourceNextActionHandler;
        }
        throw new IllegalStateException(("No suitable PaymentNextActionHandler for " + actionable).toString());
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(ActivityResultCaller activityResultCaller, ActivityResultCallback<PaymentFlowResult.Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        Iterator<T> it = getAllNextActionHandlers$payments_core_release().iterator();
        while (it.hasNext()) {
            ((PaymentNextActionHandler) it.next()).onNewActivityResultCaller(activityResultCaller, activityResultCallback);
        }
        this.paymentRelayLauncher = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.paymentBrowserAuthLauncher = activityResultCaller.registerForActivityResult(new PaymentBrowserAuthContract(), activityResultCallback);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        Iterator<T> it = getAllNextActionHandlers$payments_core_release().iterator();
        while (it.hasNext()) {
            ((PaymentNextActionHandler) it.next()).onLauncherInvalidated();
        }
        ActivityResultLauncher<PaymentRelayStarter.Args> activityResultLauncher = this.paymentRelayLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher<PaymentBrowserAuthContract.Args> activityResultLauncher2 = this.paymentBrowserAuthLauncher;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        this.paymentRelayLauncher = null;
        this.paymentBrowserAuthLauncher = null;
    }

    /* compiled from: DefaultPaymentNextActionHandlerRegistry.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jn\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;", "", "<init>", "()V", "createInstance", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "context", "Landroid/content/Context;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "threeDs1IntentReturnUrlMap", "", "", "publishableKeyProvider", "Lkotlin/Function0;", NamedConstantsKt.PRODUCT_USAGE, "", NamedConstantsKt.IS_INSTANT_APP, "includePaymentSheetNextActionHandlers", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentNextActionHandlerRegistry createInstance(Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean enableLogging, CoroutineContext workContext, CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, Function0<String> publishableKeyProvider, Set<String> productUsage, boolean isInstantApp, boolean includePaymentSheetNextActionHandlers) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            Intrinsics.checkNotNullParameter(uiContext, "uiContext");
            Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
            Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            return DaggerNextActionHandlerComponent.builder().context(context).analyticsRequestFactory(paymentAnalyticsRequestFactory).enableLogging(enableLogging).workContext(workContext).uiContext(uiContext).threeDs1IntentReturnUrlMap(threeDs1IntentReturnUrlMap).publishableKeyProvider(publishableKeyProvider).productUsage(productUsage).isInstantApp(isInstantApp).includePaymentSheetNextActionHandlers(includePaymentSheetNextActionHandlers).build().getRegistry();
        }
    }
}
