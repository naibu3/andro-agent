package com.stripe.android.financialconnections.utils;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class UriUtils_Factory implements Factory<UriUtils> {
    private final Provider<Logger> loggerProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> trackerProvider;

    public UriUtils_Factory(Provider<Logger> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2) {
        this.loggerProvider = provider;
        this.trackerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public UriUtils get() {
        return newInstance(this.loggerProvider.get(), this.trackerProvider.get());
    }

    public static UriUtils_Factory create(javax.inject.Provider<Logger> provider, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider2) {
        return new UriUtils_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static UriUtils_Factory create(Provider<Logger> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2) {
        return new UriUtils_Factory(provider, provider2);
    }

    public static UriUtils newInstance(Logger logger, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker) {
        return new UriUtils(logger, financialConnectionsAnalyticsTracker);
    }
}
