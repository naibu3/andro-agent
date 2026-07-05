package com.stripe.android.customersheet.injection;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory implements Factory<ErrorReporter> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<AnalyticsRequestFactory> analyticsRequestFactoryProvider;

    public CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory(Provider<AnalyticsRequestFactory> provider, Provider<AnalyticsRequestExecutor> provider2) {
        this.analyticsRequestFactoryProvider = provider;
        this.analyticsRequestExecutorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ErrorReporter get() {
        return providesErrorReporter$paymentsheet_release(this.analyticsRequestFactoryProvider.get(), this.analyticsRequestExecutorProvider.get());
    }

    public static CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory create(javax.inject.Provider<AnalyticsRequestFactory> provider, javax.inject.Provider<AnalyticsRequestExecutor> provider2) {
        return new CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory create(Provider<AnalyticsRequestFactory> provider, Provider<AnalyticsRequestExecutor> provider2) {
        return new CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory(provider, provider2);
    }

    public static ErrorReporter providesErrorReporter$paymentsheet_release(AnalyticsRequestFactory analyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor) {
        return (ErrorReporter) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.providesErrorReporter$paymentsheet_release(analyticsRequestFactory, analyticsRequestExecutor));
    }
}
