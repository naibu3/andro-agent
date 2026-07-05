package com.stripe.android.financialconnections.di;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsInstitutionsRepositoryFactory implements Factory<FinancialConnectionsInstitutionsRepository> {
    private final Provider<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Provider<ProvideApiRequestOptions> provideApiRequestOptionsProvider;
    private final Provider<FinancialConnectionsRequestExecutor> requestExecutorProvider;

    public FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsInstitutionsRepositoryFactory(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ProvideApiRequestOptions> provider2, Provider<ApiRequest.Factory> provider3) {
        this.requestExecutorProvider = provider;
        this.provideApiRequestOptionsProvider = provider2;
        this.apiRequestFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsInstitutionsRepository get() {
        return providesFinancialConnectionsInstitutionsRepository(this.requestExecutorProvider.get(), this.provideApiRequestOptionsProvider.get(), this.apiRequestFactoryProvider.get());
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsInstitutionsRepositoryFactory create(javax.inject.Provider<FinancialConnectionsRequestExecutor> provider, javax.inject.Provider<ProvideApiRequestOptions> provider2, javax.inject.Provider<ApiRequest.Factory> provider3) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsInstitutionsRepositoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsInstitutionsRepositoryFactory create(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ProvideApiRequestOptions> provider2, Provider<ApiRequest.Factory> provider3) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsInstitutionsRepositoryFactory(provider, provider2, provider3);
    }

    public static FinancialConnectionsInstitutionsRepository providesFinancialConnectionsInstitutionsRepository(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory factory) {
        return (FinancialConnectionsInstitutionsRepository) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetNativeModule.INSTANCE.providesFinancialConnectionsInstitutionsRepository(financialConnectionsRequestExecutor, provideApiRequestOptions, factory));
    }
}
