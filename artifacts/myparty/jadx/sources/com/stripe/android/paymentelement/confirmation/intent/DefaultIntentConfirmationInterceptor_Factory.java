package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DefaultIntentConfirmationInterceptor_Factory implements Factory<DefaultIntentConfirmationInterceptor> {
    private final Provider<Boolean> allowsManualConfirmationProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<CreateIntentCallback> intentCreationCallbackProvider;
    private final Provider<PreparePaymentMethodHandler> preparePaymentMethodHandlerProvider;
    private final Provider<Function0<String>> publishableKeyProvider;
    private final Provider<Function0<String>> stripeAccountIdProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public DefaultIntentConfirmationInterceptor_Factory(Provider<StripeRepository> provider, Provider<ErrorReporter> provider2, Provider<CreateIntentCallback> provider3, Provider<PreparePaymentMethodHandler> provider4, Provider<Boolean> provider5, Provider<Function0<String>> provider6, Provider<Function0<String>> provider7) {
        this.stripeRepositoryProvider = provider;
        this.errorReporterProvider = provider2;
        this.intentCreationCallbackProvider = provider3;
        this.preparePaymentMethodHandlerProvider = provider4;
        this.allowsManualConfirmationProvider = provider5;
        this.publishableKeyProvider = provider6;
        this.stripeAccountIdProvider = provider7;
    }

    @Override // javax.inject.Provider
    public DefaultIntentConfirmationInterceptor get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.errorReporterProvider.get(), this.intentCreationCallbackProvider, this.preparePaymentMethodHandlerProvider, this.allowsManualConfirmationProvider.get().booleanValue(), this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get());
    }

    public static DefaultIntentConfirmationInterceptor_Factory create(javax.inject.Provider<StripeRepository> provider, javax.inject.Provider<ErrorReporter> provider2, javax.inject.Provider<CreateIntentCallback> provider3, javax.inject.Provider<PreparePaymentMethodHandler> provider4, javax.inject.Provider<Boolean> provider5, javax.inject.Provider<Function0<String>> provider6, javax.inject.Provider<Function0<String>> provider7) {
        return new DefaultIntentConfirmationInterceptor_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static DefaultIntentConfirmationInterceptor_Factory create(Provider<StripeRepository> provider, Provider<ErrorReporter> provider2, Provider<CreateIntentCallback> provider3, Provider<PreparePaymentMethodHandler> provider4, Provider<Boolean> provider5, Provider<Function0<String>> provider6, Provider<Function0<String>> provider7) {
        return new DefaultIntentConfirmationInterceptor_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static DefaultIntentConfirmationInterceptor newInstance(StripeRepository stripeRepository, ErrorReporter errorReporter, javax.inject.Provider<CreateIntentCallback> provider, javax.inject.Provider<PreparePaymentMethodHandler> provider2, boolean z, Function0<String> function0, Function0<String> function02) {
        return new DefaultIntentConfirmationInterceptor(stripeRepository, errorReporter, provider, provider2, z, function0, function02);
    }
}
