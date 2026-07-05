package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class GetOrFetchSync_Factory implements Factory<GetOrFetchSync> {
    private final Provider<String> applicationIdProvider;
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public GetOrFetchSync_Factory(Provider<FinancialConnectionsManifestRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2, Provider<String> provider3) {
        this.repositoryProvider = provider;
        this.configurationProvider = provider2;
        this.applicationIdProvider = provider3;
    }

    @Override // javax.inject.Provider
    public GetOrFetchSync get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get(), this.applicationIdProvider.get());
    }

    public static GetOrFetchSync_Factory create(javax.inject.Provider<FinancialConnectionsManifestRepository> provider, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider2, javax.inject.Provider<String> provider3) {
        return new GetOrFetchSync_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static GetOrFetchSync_Factory create(Provider<FinancialConnectionsManifestRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2, Provider<String> provider3) {
        return new GetOrFetchSync_Factory(provider, provider2, provider3);
    }

    public static GetOrFetchSync newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, String str) {
        return new GetOrFetchSync(financialConnectionsManifestRepository, financialConnectionsSheetConfiguration, str);
    }
}
