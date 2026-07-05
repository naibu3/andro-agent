package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class SelectInstitution_Factory implements Factory<SelectInstitution> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public SelectInstitution_Factory(Provider<FinancialConnectionsManifestRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2) {
        this.repositoryProvider = provider;
        this.configurationProvider = provider2;
    }

    @Override // javax.inject.Provider
    public SelectInstitution get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get());
    }

    public static SelectInstitution_Factory create(javax.inject.Provider<FinancialConnectionsManifestRepository> provider, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider2) {
        return new SelectInstitution_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static SelectInstitution_Factory create(Provider<FinancialConnectionsManifestRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2) {
        return new SelectInstitution_Factory(provider, provider2);
    }

    public static SelectInstitution newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return new SelectInstitution(financialConnectionsManifestRepository, financialConnectionsSheetConfiguration);
    }
}
