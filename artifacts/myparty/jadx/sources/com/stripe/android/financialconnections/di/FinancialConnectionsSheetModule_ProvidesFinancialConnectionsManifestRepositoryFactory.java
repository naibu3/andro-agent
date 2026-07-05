package com.stripe.android.financialconnections.di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory implements Factory<FinancialConnectionsManifestRepository> {
    private final Provider<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Provider<Locale> localeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<ProvideApiRequestOptions> provideApiRequestOptionsProvider;
    private final Provider<FinancialConnectionsRequestExecutor> requestExecutorProvider;

    public FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ApiRequest.Factory> provider2, Provider<ProvideApiRequestOptions> provider3, Provider<Locale> provider4, Provider<Logger> provider5) {
        this.requestExecutorProvider = provider;
        this.apiRequestFactoryProvider = provider2;
        this.provideApiRequestOptionsProvider = provider3;
        this.localeProvider = provider4;
        this.loggerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsManifestRepository get() {
        return providesFinancialConnectionsManifestRepository(this.requestExecutorProvider.get(), this.apiRequestFactoryProvider.get(), this.provideApiRequestOptionsProvider.get(), this.localeProvider.get(), this.loggerProvider.get());
    }

    public static FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory create(javax.inject.Provider<FinancialConnectionsRequestExecutor> provider, javax.inject.Provider<ApiRequest.Factory> provider2, javax.inject.Provider<ProvideApiRequestOptions> provider3, javax.inject.Provider<Locale> provider4, javax.inject.Provider<Logger> provider5) {
        return new FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory create(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ApiRequest.Factory> provider2, Provider<ProvideApiRequestOptions> provider3, Provider<Locale> provider4, Provider<Logger> provider5) {
        return new FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static FinancialConnectionsManifestRepository providesFinancialConnectionsManifestRepository(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ApiRequest.Factory factory, ProvideApiRequestOptions provideApiRequestOptions, Locale locale, Logger logger) {
        return (FinancialConnectionsManifestRepository) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetModule.INSTANCE.providesFinancialConnectionsManifestRepository(financialConnectionsRequestExecutor, factory, provideApiRequestOptions, locale, logger));
    }
}
