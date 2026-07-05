package com.stripe.android.networking;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class StripeApiRepository_Factory implements Factory<StripeApiRepository> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<Context> appContextProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<Set<String>> productUsageTokensProvider;
    private final Provider<Function0<String>> publishableKeyProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public StripeApiRepository_Factory(Provider<Context> provider, Provider<Function0<String>> provider2, Provider<CoroutineContext> provider3, Provider<Set<String>> provider4, Provider<PaymentAnalyticsRequestFactory> provider5, Provider<AnalyticsRequestExecutor> provider6, Provider<Logger> provider7) {
        this.appContextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.workContextProvider = provider3;
        this.productUsageTokensProvider = provider4;
        this.paymentAnalyticsRequestFactoryProvider = provider5;
        this.analyticsRequestExecutorProvider = provider6;
        this.loggerProvider = provider7;
    }

    @Override // javax.inject.Provider
    public StripeApiRepository get() {
        return newInstance(this.appContextProvider.get(), this.publishableKeyProvider.get(), this.workContextProvider.get(), this.productUsageTokensProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.loggerProvider.get());
    }

    public static StripeApiRepository_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<Function0<String>> provider2, javax.inject.Provider<CoroutineContext> provider3, javax.inject.Provider<Set<String>> provider4, javax.inject.Provider<PaymentAnalyticsRequestFactory> provider5, javax.inject.Provider<AnalyticsRequestExecutor> provider6, javax.inject.Provider<Logger> provider7) {
        return new StripeApiRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static StripeApiRepository_Factory create(Provider<Context> provider, Provider<Function0<String>> provider2, Provider<CoroutineContext> provider3, Provider<Set<String>> provider4, Provider<PaymentAnalyticsRequestFactory> provider5, Provider<AnalyticsRequestExecutor> provider6, Provider<Logger> provider7) {
        return new StripeApiRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static StripeApiRepository newInstance(Context context, Function0<String> function0, CoroutineContext coroutineContext, Set<String> set, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, Logger logger) {
        return new StripeApiRepository(context, function0, coroutineContext, set, paymentAnalyticsRequestFactory, analyticsRequestExecutor, logger);
    }
}
