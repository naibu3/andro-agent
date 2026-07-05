package com.stripe.android.financialconnections.di;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsAccountsRepositoryFactory implements Factory<FinancialConnectionsAccountsRepository> {
    private final Provider<ApiRequest.Factory> apiRequestFactoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<ProvideApiRequestOptions> provideApiRequestOptionsProvider;
    private final Provider<FinancialConnectionsRequestExecutor> requestExecutorProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsAccountsRepositoryFactory(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ProvideApiRequestOptions> provider2, Provider<ApiRequest.Factory> provider3, Provider<Logger> provider4, Provider<SavedStateHandle> provider5) {
        this.requestExecutorProvider = provider;
        this.provideApiRequestOptionsProvider = provider2;
        this.apiRequestFactoryProvider = provider3;
        this.loggerProvider = provider4;
        this.savedStateHandleProvider = provider5;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsAccountsRepository get() {
        return providesFinancialConnectionsAccountsRepository(this.requestExecutorProvider.get(), this.provideApiRequestOptionsProvider.get(), this.apiRequestFactoryProvider.get(), this.loggerProvider.get(), this.savedStateHandleProvider.get());
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsAccountsRepositoryFactory create(javax.inject.Provider<FinancialConnectionsRequestExecutor> provider, javax.inject.Provider<ProvideApiRequestOptions> provider2, javax.inject.Provider<ApiRequest.Factory> provider3, javax.inject.Provider<Logger> provider4, javax.inject.Provider<SavedStateHandle> provider5) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsAccountsRepositoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsAccountsRepositoryFactory create(Provider<FinancialConnectionsRequestExecutor> provider, Provider<ProvideApiRequestOptions> provider2, Provider<ApiRequest.Factory> provider3, Provider<Logger> provider4, Provider<SavedStateHandle> provider5) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsAccountsRepositoryFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static FinancialConnectionsAccountsRepository providesFinancialConnectionsAccountsRepository(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory factory, Logger logger, SavedStateHandle savedStateHandle) {
        return (FinancialConnectionsAccountsRepository) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetNativeModule.INSTANCE.providesFinancialConnectionsAccountsRepository(financialConnectionsRequestExecutor, provideApiRequestOptions, factory, logger, savedStateHandle));
    }
}
