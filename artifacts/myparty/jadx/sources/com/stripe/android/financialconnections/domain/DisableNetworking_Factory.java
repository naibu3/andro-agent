package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DisableNetworking_Factory implements Factory<DisableNetworking> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public DisableNetworking_Factory(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<FinancialConnectionsManifestRepository> provider2) {
        this.configurationProvider = provider;
        this.repositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public DisableNetworking get() {
        return newInstance(this.configurationProvider.get(), this.repositoryProvider.get());
    }

    public static DisableNetworking_Factory create(javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider, javax.inject.Provider<FinancialConnectionsManifestRepository> provider2) {
        return new DisableNetworking_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static DisableNetworking_Factory create(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<FinancialConnectionsManifestRepository> provider2) {
        return new DisableNetworking_Factory(provider, provider2);
    }

    public static DisableNetworking newInstance(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, FinancialConnectionsManifestRepository financialConnectionsManifestRepository) {
        return new DisableNetworking(financialConnectionsSheetConfiguration, financialConnectionsManifestRepository);
    }
}
