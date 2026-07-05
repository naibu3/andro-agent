package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class MarkLinkStepUpVerified_Factory implements Factory<MarkLinkStepUpVerified> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public MarkLinkStepUpVerified_Factory(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<FinancialConnectionsManifestRepository> provider2) {
        this.configurationProvider = provider;
        this.repositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public MarkLinkStepUpVerified get() {
        return newInstance(this.configurationProvider.get(), this.repositoryProvider.get());
    }

    public static MarkLinkStepUpVerified_Factory create(javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider, javax.inject.Provider<FinancialConnectionsManifestRepository> provider2) {
        return new MarkLinkStepUpVerified_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static MarkLinkStepUpVerified_Factory create(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<FinancialConnectionsManifestRepository> provider2) {
        return new MarkLinkStepUpVerified_Factory(provider, provider2);
    }

    public static MarkLinkStepUpVerified newInstance(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, FinancialConnectionsManifestRepository financialConnectionsManifestRepository) {
        return new MarkLinkStepUpVerified(financialConnectionsSheetConfiguration, financialConnectionsManifestRepository);
    }
}
