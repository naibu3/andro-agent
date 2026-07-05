package com.stripe.android.customersheet.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class DefaultCustomerSheetEventReporter_Factory implements Factory<DefaultCustomerSheetEventReporter> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<AnalyticsRequestFactory> analyticsRequestFactoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public DefaultCustomerSheetEventReporter_Factory(Provider<AnalyticsRequestExecutor> provider, Provider<AnalyticsRequestFactory> provider2, Provider<CoroutineContext> provider3) {
        this.analyticsRequestExecutorProvider = provider;
        this.analyticsRequestFactoryProvider = provider2;
        this.workContextProvider = provider3;
    }

    @Override // javax.inject.Provider
    public DefaultCustomerSheetEventReporter get() {
        return newInstance(this.analyticsRequestExecutorProvider.get(), this.analyticsRequestFactoryProvider.get(), this.workContextProvider.get());
    }

    public static DefaultCustomerSheetEventReporter_Factory create(javax.inject.Provider<AnalyticsRequestExecutor> provider, javax.inject.Provider<AnalyticsRequestFactory> provider2, javax.inject.Provider<CoroutineContext> provider3) {
        return new DefaultCustomerSheetEventReporter_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static DefaultCustomerSheetEventReporter_Factory create(Provider<AnalyticsRequestExecutor> provider, Provider<AnalyticsRequestFactory> provider2, Provider<CoroutineContext> provider3) {
        return new DefaultCustomerSheetEventReporter_Factory(provider, provider2, provider3);
    }

    public static DefaultCustomerSheetEventReporter newInstance(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, CoroutineContext coroutineContext) {
        return new DefaultCustomerSheetEventReporter(analyticsRequestExecutor, analyticsRequestFactory, coroutineContext);
    }
}
