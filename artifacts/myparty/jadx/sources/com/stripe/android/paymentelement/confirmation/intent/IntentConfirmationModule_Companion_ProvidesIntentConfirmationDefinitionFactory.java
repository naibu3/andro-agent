package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory implements Factory<ConfirmationDefinition<?, ?, ?, ?>> {
    private final Provider<IntentConfirmationInterceptor> intentConfirmationInterceptorProvider;
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;
    private final Provider<Integer> statusBarColorProvider;
    private final Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;

    public IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory(Provider<IntentConfirmationInterceptor> provider, Provider<StripePaymentLauncherAssistedFactory> provider2, Provider<Integer> provider3, Provider<PaymentConfiguration> provider4) {
        this.intentConfirmationInterceptorProvider = provider;
        this.stripePaymentLauncherAssistedFactoryProvider = provider2;
        this.statusBarColorProvider = provider3;
        this.paymentConfigurationProvider = provider4;
    }

    @Override // javax.inject.Provider
    public ConfirmationDefinition<?, ?, ?, ?> get() {
        return providesIntentConfirmationDefinition(this.intentConfirmationInterceptorProvider.get(), this.stripePaymentLauncherAssistedFactoryProvider.get(), this.statusBarColorProvider.get(), this.paymentConfigurationProvider);
    }

    public static IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory create(javax.inject.Provider<IntentConfirmationInterceptor> provider, javax.inject.Provider<StripePaymentLauncherAssistedFactory> provider2, javax.inject.Provider<Integer> provider3, javax.inject.Provider<PaymentConfiguration> provider4) {
        return new IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory create(Provider<IntentConfirmationInterceptor> provider, Provider<StripePaymentLauncherAssistedFactory> provider2, Provider<Integer> provider3, Provider<PaymentConfiguration> provider4) {
        return new IntentConfirmationModule_Companion_ProvidesIntentConfirmationDefinitionFactory(provider, provider2, provider3, provider4);
    }

    public static ConfirmationDefinition<?, ?, ?, ?> providesIntentConfirmationDefinition(IntentConfirmationInterceptor intentConfirmationInterceptor, StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory, Integer num, javax.inject.Provider<PaymentConfiguration> provider) {
        return (ConfirmationDefinition) Preconditions.checkNotNullFromProvides(IntentConfirmationModule.INSTANCE.providesIntentConfirmationDefinition(intentConfirmationInterceptor, stripePaymentLauncherAssistedFactory, num, provider));
    }
}
