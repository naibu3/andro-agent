package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import dagger.BindsInstance;
import dagger.Component;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: PaymentLauncherViewModelFactoryComponent.kt */
@Component(modules = {PaymentLauncherModule.class, StripeRepositoryModule.class, CoroutineContextModule.class, CoreCommonModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelFactoryComponent;", "", "viewModelSubcomponentBuilder", "Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelSubcomponent$Builder;", "getViewModelSubcomponentBuilder", "()Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelSubcomponent$Builder;", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentLauncherViewModelFactoryComponent {

    /* compiled from: PaymentLauncherViewModelFactoryComponent.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0006\u001a\u00020\u00002\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u001a\u0010\t\u001a\u00020\u00002\u0010\b\u0001\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H'J\u0018\u0010\n\u001a\u00020\u00002\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH'J\u0012\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0005H'J\b\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelFactoryComponent$Builder;", "", "context", "Landroid/content/Context;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", NamedConstantsKt.PRODUCT_USAGE, "", "includePaymentSheetNextHandlers", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelFactoryComponent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        PaymentLauncherViewModelFactoryComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder enableLogging(@Named(com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING) boolean enableLogging);

        @BindsInstance
        Builder includePaymentSheetNextHandlers(@Named(NamedConstantsKt.INCLUDE_PAYMENT_SHEET_NEXT_ACTION_HANDLERS) boolean includePaymentSheetNextHandlers);

        @BindsInstance
        Builder productUsage(@Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsage);

        @BindsInstance
        Builder publishableKeyProvider(@Named("publishableKey") Function0<String> publishableKeyProvider);

        @BindsInstance
        Builder stripeAccountIdProvider(@Named(com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID) Function0<String> stripeAccountIdProvider);
    }

    PaymentLauncherViewModelSubcomponent.Builder getViewModelSubcomponentBuilder();
}
