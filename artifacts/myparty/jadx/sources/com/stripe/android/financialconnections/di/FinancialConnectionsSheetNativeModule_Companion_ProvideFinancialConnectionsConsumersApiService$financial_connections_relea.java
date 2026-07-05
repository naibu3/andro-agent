package com.stripe.android.financialconnections.di;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeModule_Companion_ProvideFinancialConnectionsConsumersApiService$financial_connections_releaseFactory implements Factory<FinancialConnectionsConsumersApiService> {
    private final Provider<ApiRequest.Options> apiOptionsProvider;
    private final Provider<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Provider<FinancialConnectionsRequestExecutor> requestExecutorProvider;

    public FinancialConnectionsSheetNativeModule_Companion_ProvideFinancialConnectionsConsumersApiService$financial_connections_releaseFactory(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ApiRequest.Options> provider2, Provider<ApiRequest.Factory> provider3) {
        this.requestExecutorProvider = provider;
        this.apiOptionsProvider = provider2;
        this.apiRequestFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsConsumersApiService get() {
        return provideFinancialConnectionsConsumersApiService$financial_connections_release(this.requestExecutorProvider.get(), this.apiOptionsProvider.get(), this.apiRequestFactoryProvider.get());
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvideFinancialConnectionsConsumersApiService$financial_connections_releaseFactory create(javax.inject.Provider<FinancialConnectionsRequestExecutor> provider, javax.inject.Provider<ApiRequest.Options> provider2, javax.inject.Provider<ApiRequest.Factory> provider3) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvideFinancialConnectionsConsumersApiService$financial_connections_releaseFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvideFinancialConnectionsConsumersApiService$financial_connections_releaseFactory create(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ApiRequest.Options> provider2, Provider<ApiRequest.Factory> provider3) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvideFinancialConnectionsConsumersApiService$financial_connections_releaseFactory(provider, provider2, provider3);
    }

    public static FinancialConnectionsConsumersApiService provideFinancialConnectionsConsumersApiService$financial_connections_release(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ApiRequest.Options options, ApiRequest.Factory factory) {
        return (FinancialConnectionsConsumersApiService) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetNativeModule.INSTANCE.provideFinancialConnectionsConsumersApiService$financial_connections_release(financialConnectionsRequestExecutor, options, factory));
    }
}
