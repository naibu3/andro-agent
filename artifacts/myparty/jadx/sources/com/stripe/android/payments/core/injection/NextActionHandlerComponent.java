package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import dagger.BindsInstance;
import dagger.Component;
import java.util.Map;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* compiled from: NextActionHandlerComponent.kt */
@Component(modules = {NextActionHandlerModule.class, Stripe3DSNextActionHandlerModule.class, WeChatPayNextActionHandlerModule.class, CoreCommonModule.class, StripeRepositoryModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent;", "", "registry", "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;", "getRegistry", "()Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NextActionHandlerComponent {

    /* compiled from: NextActionHandlerComponent.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0012\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u0012\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\nH'J\u0012\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001c\u0010\f\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH'J\u0018\u0010\u000f\u001a\u00020\u00002\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H'J\u0018\u0010\u0011\u001a\u00020\u00002\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H'J\u0012\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\bH'J\u0012\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\bH'J\b\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;", "", "context", "Landroid/content/Context;", "analyticsRequestFactory", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "threeDs1IntentReturnUrlMap", "", "", "publishableKeyProvider", "Lkotlin/Function0;", NamedConstantsKt.PRODUCT_USAGE, "", NamedConstantsKt.IS_INSTANT_APP, "includePaymentSheetNextActionHandlers", "includePaymentSheetNextHandlers", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        NextActionHandlerComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder enableLogging(@Named(com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING) boolean enableLogging);

        @BindsInstance
        Builder includePaymentSheetNextActionHandlers(@Named(NamedConstantsKt.INCLUDE_PAYMENT_SHEET_NEXT_ACTION_HANDLERS) boolean includePaymentSheetNextHandlers);

        @BindsInstance
        Builder isInstantApp(@Named(NamedConstantsKt.IS_INSTANT_APP) boolean isInstantApp);

        @BindsInstance
        Builder productUsage(@Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsage);

        @BindsInstance
        Builder publishableKeyProvider(@Named("publishableKey") Function0<String> publishableKeyProvider);

        @BindsInstance
        Builder threeDs1IntentReturnUrlMap(Map<String, String> threeDs1IntentReturnUrlMap);

        @BindsInstance
        Builder uiContext(@UIContext CoroutineContext uiContext);

        @BindsInstance
        Builder workContext(@IOContext CoroutineContext workContext);
    }

    DefaultPaymentNextActionHandlerRegistry getRegistry();
}
