package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsRepositoryImpl_Factory implements Factory<FinancialConnectionsRepositoryImpl> {
    private final Provider<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Provider<FraudDetectionDataRepository> fraudDetectionDataRepositoryProvider;
    private final Provider<ProvideApiRequestOptions> provideApiRequestOptionsProvider;
    private final Provider<FinancialConnectionsRequestExecutor> requestExecutorProvider;

    public FinancialConnectionsRepositoryImpl_Factory(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ProvideApiRequestOptions> provider2, Provider<FraudDetectionDataRepository> provider3, Provider<ApiRequest.Factory> provider4) {
        this.requestExecutorProvider = provider;
        this.provideApiRequestOptionsProvider = provider2;
        this.fraudDetectionDataRepositoryProvider = provider3;
        this.apiRequestFactoryProvider = provider4;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsRepositoryImpl get() {
        return newInstance(this.requestExecutorProvider.get(), this.provideApiRequestOptionsProvider.get(), this.fraudDetectionDataRepositoryProvider.get(), this.apiRequestFactoryProvider.get());
    }

    public static FinancialConnectionsRepositoryImpl_Factory create(javax.inject.Provider<FinancialConnectionsRequestExecutor> provider, javax.inject.Provider<ProvideApiRequestOptions> provider2, javax.inject.Provider<FraudDetectionDataRepository> provider3, javax.inject.Provider<ApiRequest.Factory> provider4) {
        return new FinancialConnectionsRepositoryImpl_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static FinancialConnectionsRepositoryImpl_Factory create(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ProvideApiRequestOptions> provider2, Provider<FraudDetectionDataRepository> provider3, Provider<ApiRequest.Factory> provider4) {
        return new FinancialConnectionsRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static FinancialConnectionsRepositoryImpl newInstance(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ProvideApiRequestOptions provideApiRequestOptions, FraudDetectionDataRepository fraudDetectionDataRepository, ApiRequest.Factory factory) {
        return new FinancialConnectionsRepositoryImpl(financialConnectionsRequestExecutor, provideApiRequestOptions, fraudDetectionDataRepository, factory);
    }
}
