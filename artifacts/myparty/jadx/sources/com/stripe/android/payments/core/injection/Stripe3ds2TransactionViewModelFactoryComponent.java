package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.RetryDelayModule;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import dagger.BindsInstance;
import dagger.Component;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Stripe3ds2TransactionViewModelFactoryComponent.kt */
@Component(modules = {StripeRepositoryModule.class, Stripe3ds2TransactionModule.class, CoroutineContextModule.class, CoreCommonModule.class, RetryDelayModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelFactoryComponent;", "", "subcomponentBuilder", "Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;", "getSubcomponentBuilder", "()Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Stripe3ds2TransactionViewModelFactoryComponent {

    /* compiled from: Stripe3ds2TransactionViewModelFactoryComponent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0006\u001a\u00020\u00002\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0018\u0010\t\u001a\u00020\u00002\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH'J\u0012\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\u0005H'J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelFactoryComponent$Builder;", "", "context", "Landroid/content/Context;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "publishableKeyProvider", "Lkotlin/Function0;", "", NamedConstantsKt.PRODUCT_USAGE, "", NamedConstantsKt.IS_INSTANT_APP, InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelFactoryComponent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        Stripe3ds2TransactionViewModelFactoryComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder enableLogging(@Named(com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING) boolean enableLogging);

        @BindsInstance
        Builder isInstantApp(@Named(NamedConstantsKt.IS_INSTANT_APP) boolean isInstantApp);

        @BindsInstance
        Builder productUsage(@Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsage);

        @BindsInstance
        Builder publishableKeyProvider(@Named("publishableKey") Function0<String> publishableKeyProvider);
    }

    Stripe3ds2TransactionViewModelSubcomponent.Builder getSubcomponentBuilder();
}
