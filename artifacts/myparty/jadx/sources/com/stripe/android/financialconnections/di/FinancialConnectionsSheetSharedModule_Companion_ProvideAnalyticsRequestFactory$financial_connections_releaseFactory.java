package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory implements Factory<AnalyticsRequestFactory> {
    private final Provider<Application> applicationProvider;
    private final Provider<String> publishableKeyProvider;

    public FinancialConnectionsSheetSharedModule_Companion_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory(Provider<Application> provider, Provider<String> provider2) {
        this.applicationProvider = provider;
        this.publishableKeyProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AnalyticsRequestFactory get() {
        return provideAnalyticsRequestFactory$financial_connections_release(this.applicationProvider.get(), this.publishableKeyProvider.get());
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory create(javax.inject.Provider<Application> provider, javax.inject.Provider<String> provider2) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory create(Provider<Application> provider, Provider<String> provider2) {
        return new FinancialConnectionsSheetSharedModule_Companion_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory(provider, provider2);
    }

    public static AnalyticsRequestFactory provideAnalyticsRequestFactory$financial_connections_release(Application application, String str) {
        return (AnalyticsRequestFactory) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetSharedModule.INSTANCE.provideAnalyticsRequestFactory$financial_connections_release(application, str));
    }
}
