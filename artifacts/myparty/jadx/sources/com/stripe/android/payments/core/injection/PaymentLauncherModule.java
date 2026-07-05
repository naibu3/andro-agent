package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.google.android.instantapps.InstantApps;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry;
import dagger.Module;
import dagger.Provides;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentLauncherModule.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J~\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u000eH\u0007J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;", "", "<init>", "()V", "provideThreeDs1IntentReturnUrlMap", "", "", "provideDefaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "context", "Landroid/content/Context;", "providePaymentNextActionHandlerRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "threeDs1IntentReturnUrlMap", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "publishableKeyProvider", "Lkotlin/Function0;", NamedConstantsKt.PRODUCT_USAGE, "", NamedConstantsKt.IS_INSTANT_APP, "includePaymentSheetNextHandlers", "provideIsInstantApp", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(subcomponents = {PaymentLauncherViewModelSubcomponent.class})
/* loaded from: classes6.dex */
public final class PaymentLauncherModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    public final Map<String, String> provideThreeDs1IntentReturnUrlMap() {
        return new LinkedHashMap();
    }

    @Provides
    @Singleton
    public final DefaultReturnUrl provideDefaultReturnUrl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DefaultReturnUrl.INSTANCE.create(context);
    }

    @Provides
    @Singleton
    public final PaymentNextActionHandlerRegistry providePaymentNextActionHandlerRegistry(Context context, @Named(com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING) boolean enableLogging, @IOContext CoroutineContext workContext, @UIContext CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @Named("publishableKey") Function0<String> publishableKeyProvider, @Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsage, @Named(NamedConstantsKt.IS_INSTANT_APP) boolean isInstantApp, @Named(NamedConstantsKt.INCLUDE_PAYMENT_SHEET_NEXT_ACTION_HANDLERS) boolean includePaymentSheetNextHandlers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        return DefaultPaymentNextActionHandlerRegistry.INSTANCE.createInstance(context, paymentAnalyticsRequestFactory, enableLogging, workContext, uiContext, threeDs1IntentReturnUrlMap, publishableKeyProvider, productUsage, isInstantApp, includePaymentSheetNextHandlers);
    }

    @Provides
    @Named(NamedConstantsKt.IS_INSTANT_APP)
    public final boolean provideIsInstantApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return InstantApps.isInstantApp(context);
    }
}
