package com.stripe.android.financialconnections.ui;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.utils.UriUtils;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class HandleClickableUrl_Factory implements Factory<HandleClickableUrl> {
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<UriUtils> uriUtilsProvider;

    public HandleClickableUrl_Factory(Provider<UriUtils> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<Logger> provider3) {
        this.uriUtilsProvider = provider;
        this.eventTrackerProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public HandleClickableUrl get() {
        return newInstance(this.uriUtilsProvider.get(), this.eventTrackerProvider.get(), this.loggerProvider.get());
    }

    public static HandleClickableUrl_Factory create(javax.inject.Provider<UriUtils> provider, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider2, javax.inject.Provider<Logger> provider3) {
        return new HandleClickableUrl_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static HandleClickableUrl_Factory create(Provider<UriUtils> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<Logger> provider3) {
        return new HandleClickableUrl_Factory(provider, provider2, provider3);
    }

    public static HandleClickableUrl newInstance(UriUtils uriUtils, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, Logger logger) {
        return new HandleClickableUrl(uriUtils, financialConnectionsAnalyticsTracker, logger);
    }
}
