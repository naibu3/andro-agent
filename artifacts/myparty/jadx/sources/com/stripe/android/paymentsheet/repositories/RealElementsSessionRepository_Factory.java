package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class RealElementsSessionRepository_Factory implements Factory<RealElementsSessionRepository> {
    private final Provider<String> appIdProvider;
    private final Provider<PaymentConfiguration> lazyPaymentConfigProvider;
    private final Provider<String> mobileSessionIdProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public RealElementsSessionRepository_Factory(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<CoroutineContext> provider3, Provider<String> provider4, Provider<String> provider5) {
        this.stripeRepositoryProvider = provider;
        this.lazyPaymentConfigProvider = provider2;
        this.workContextProvider = provider3;
        this.mobileSessionIdProvider = provider4;
        this.appIdProvider = provider5;
    }

    @Override // javax.inject.Provider
    public RealElementsSessionRepository get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.lazyPaymentConfigProvider, this.workContextProvider.get(), this.mobileSessionIdProvider, this.appIdProvider.get());
    }

    public static RealElementsSessionRepository_Factory create(javax.inject.Provider<StripeRepository> provider, javax.inject.Provider<PaymentConfiguration> provider2, javax.inject.Provider<CoroutineContext> provider3, javax.inject.Provider<String> provider4, javax.inject.Provider<String> provider5) {
        return new RealElementsSessionRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static RealElementsSessionRepository_Factory create(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<CoroutineContext> provider3, Provider<String> provider4, Provider<String> provider5) {
        return new RealElementsSessionRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static RealElementsSessionRepository newInstance(StripeRepository stripeRepository, javax.inject.Provider<PaymentConfiguration> provider, CoroutineContext coroutineContext, javax.inject.Provider<String> provider2, String str) {
        return new RealElementsSessionRepository(stripeRepository, provider, coroutineContext, provider2, str);
    }
}
