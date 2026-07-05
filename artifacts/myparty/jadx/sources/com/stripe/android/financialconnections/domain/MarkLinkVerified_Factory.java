package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class MarkLinkVerified_Factory implements Factory<MarkLinkVerified> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public MarkLinkVerified_Factory(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<FinancialConnectionsManifestRepository> provider2) {
        this.configurationProvider = provider;
        this.repositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public MarkLinkVerified get() {
        return newInstance(this.configurationProvider.get(), this.repositoryProvider.get());
    }

    public static MarkLinkVerified_Factory create(javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider, javax.inject.Provider<FinancialConnectionsManifestRepository> provider2) {
        return new MarkLinkVerified_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static MarkLinkVerified_Factory create(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<FinancialConnectionsManifestRepository> provider2) {
        return new MarkLinkVerified_Factory(provider, provider2);
    }

    public static MarkLinkVerified newInstance(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, FinancialConnectionsManifestRepository financialConnectionsManifestRepository) {
        return new MarkLinkVerified(financialConnectionsSheetConfiguration, financialConnectionsManifestRepository);
    }
}
