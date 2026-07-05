package com.stripe.android.polling;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.polling.IntentStatusPoller;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes6.dex */
public final class DefaultIntentStatusPoller_Factory implements Factory<DefaultIntentStatusPoller> {
    private final Provider<IntentStatusPoller.Config> configProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<PaymentConfiguration> paymentConfigProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;

    public DefaultIntentStatusPoller_Factory(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<IntentStatusPoller.Config> provider3, Provider<CoroutineDispatcher> provider4) {
        this.stripeRepositoryProvider = provider;
        this.paymentConfigProvider = provider2;
        this.configProvider = provider3;
        this.dispatcherProvider = provider4;
    }

    @Override // javax.inject.Provider
    public DefaultIntentStatusPoller get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.paymentConfigProvider, this.configProvider.get(), this.dispatcherProvider.get());
    }

    public static DefaultIntentStatusPoller_Factory create(javax.inject.Provider<StripeRepository> provider, javax.inject.Provider<PaymentConfiguration> provider2, javax.inject.Provider<IntentStatusPoller.Config> provider3, javax.inject.Provider<CoroutineDispatcher> provider4) {
        return new DefaultIntentStatusPoller_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static DefaultIntentStatusPoller_Factory create(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<IntentStatusPoller.Config> provider3, Provider<CoroutineDispatcher> provider4) {
        return new DefaultIntentStatusPoller_Factory(provider, provider2, provider3, provider4);
    }

    public static DefaultIntentStatusPoller newInstance(StripeRepository stripeRepository, javax.inject.Provider<PaymentConfiguration> provider, IntentStatusPoller.Config config, CoroutineDispatcher coroutineDispatcher) {
        return new DefaultIntentStatusPoller(stripeRepository, provider, config, coroutineDispatcher);
    }
}
