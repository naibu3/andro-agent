package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class CustomerApiRepository_Factory implements Factory<CustomerApiRepository> {
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<PaymentConfiguration> lazyPaymentConfigProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Set<String>> productUsageTokensProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public CustomerApiRepository_Factory(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<Logger> provider3, Provider<ErrorReporter> provider4, Provider<CoroutineContext> provider5, Provider<Set<String>> provider6) {
        this.stripeRepositoryProvider = provider;
        this.lazyPaymentConfigProvider = provider2;
        this.loggerProvider = provider3;
        this.errorReporterProvider = provider4;
        this.workContextProvider = provider5;
        this.productUsageTokensProvider = provider6;
    }

    @Override // javax.inject.Provider
    public CustomerApiRepository get() {
        return newInstance(this.stripeRepositoryProvider.get(), this.lazyPaymentConfigProvider, this.loggerProvider.get(), this.errorReporterProvider.get(), this.workContextProvider.get(), this.productUsageTokensProvider.get());
    }

    public static CustomerApiRepository_Factory create(javax.inject.Provider<StripeRepository> provider, javax.inject.Provider<PaymentConfiguration> provider2, javax.inject.Provider<Logger> provider3, javax.inject.Provider<ErrorReporter> provider4, javax.inject.Provider<CoroutineContext> provider5, javax.inject.Provider<Set<String>> provider6) {
        return new CustomerApiRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static CustomerApiRepository_Factory create(Provider<StripeRepository> provider, Provider<PaymentConfiguration> provider2, Provider<Logger> provider3, Provider<ErrorReporter> provider4, Provider<CoroutineContext> provider5, Provider<Set<String>> provider6) {
        return new CustomerApiRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static CustomerApiRepository newInstance(StripeRepository stripeRepository, javax.inject.Provider<PaymentConfiguration> provider, Logger logger, ErrorReporter errorReporter, CoroutineContext coroutineContext, Set<String> set) {
        return new CustomerApiRepository(stripeRepository, provider, logger, errorReporter, coroutineContext, set);
    }
}
