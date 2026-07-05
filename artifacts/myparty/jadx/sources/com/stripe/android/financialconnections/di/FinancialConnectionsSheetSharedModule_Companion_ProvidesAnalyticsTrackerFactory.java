package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsTrackerFactory implements Factory<FinancialConnectionsAnalyticsTracker> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<Application> contextProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<Locale> localeProvider;
    private final Provider<AnalyticsRequestV2Executor> requestExecutorProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsTrackerFactory(Provider<Application> provider, Provider<GetOrFetchSync> provider2, Provider<Locale> provider3, Provider<FinancialConnectionsSheetConfiguration> provider4, Provider<AnalyticsRequestV2Executor> provider5) {
        this.contextProvider = provider;
        this.getOrFetchSyncProvider = provider2;
        this.localeProvider = provider3;
        this.configurationProvider = provider4;
        this.requestExecutorProvider = provider5;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsAnalyticsTracker get() {
        return providesAnalyticsTracker(this.contextProvider.get(), this.getOrFetchSyncProvider.get(), this.localeProvider.get(), this.configurationProvider.get(), this.requestExecutorProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsTrackerFactory create(javax.inject.Provider<Application> provider, javax.inject.Provider<GetOrFetchSync> provider2, javax.inject.Provider<Locale> provider3, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider4, javax.inject.Provider<AnalyticsRequestV2Executor> provider5) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsTrackerFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsTrackerFactory create(Provider<Application> provider, Provider<GetOrFetchSync> provider2, Provider<Locale> provider3, Provider<FinancialConnectionsSheetConfiguration> provider4, Provider<AnalyticsRequestV2Executor> provider5) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsTrackerFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static FinancialConnectionsAnalyticsTracker providesAnalyticsTracker(Application application, GetOrFetchSync getOrFetchSync, Locale locale, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, AnalyticsRequestV2Executor analyticsRequestV2Executor) {
        return (FinancialConnectionsAnalyticsTracker) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.providesAnalyticsTracker(application, getOrFetchSync, locale, financialConnectionsSheetConfiguration, analyticsRequestV2Executor));
    }
}
