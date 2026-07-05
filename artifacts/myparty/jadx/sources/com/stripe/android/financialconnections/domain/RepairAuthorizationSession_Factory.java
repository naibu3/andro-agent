package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RepairAuthorizationSession_Factory implements Factory<RepairAuthorizationSession> {
    private final Provider<String> applicationIdProvider;
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public RepairAuthorizationSession_Factory(Provider<FinancialConnectionsManifestRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2, Provider<String> provider3) {
        this.repositoryProvider = provider;
        this.configurationProvider = provider2;
        this.applicationIdProvider = provider3;
    }

    @Override // javax.inject.Provider
    public RepairAuthorizationSession get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get(), this.applicationIdProvider.get());
    }

    public static RepairAuthorizationSession_Factory create(javax.inject.Provider<FinancialConnectionsManifestRepository> provider, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider2, javax.inject.Provider<String> provider3) {
        return new RepairAuthorizationSession_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static RepairAuthorizationSession_Factory create(Provider<FinancialConnectionsManifestRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2, Provider<String> provider3) {
        return new RepairAuthorizationSession_Factory(provider, provider2, provider3);
    }

    public static RepairAuthorizationSession newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, String str) {
        return new RepairAuthorizationSession(financialConnectionsManifestRepository, financialConnectionsSheetConfiguration, str);
    }
}
