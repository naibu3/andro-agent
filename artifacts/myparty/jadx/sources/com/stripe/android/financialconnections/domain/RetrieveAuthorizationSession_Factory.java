package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RetrieveAuthorizationSession_Factory implements Factory<RetrieveAuthorizationSession> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<NativeAuthFlowCoordinator> coordinatorProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public RetrieveAuthorizationSession_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsManifestRepository> provider2, Provider<FinancialConnectionsSheetConfiguration> provider3) {
        this.coordinatorProvider = provider;
        this.repositoryProvider = provider2;
        this.configurationProvider = provider3;
    }

    @Override // javax.inject.Provider
    public RetrieveAuthorizationSession get() {
        return newInstance(this.coordinatorProvider.get(), this.repositoryProvider.get(), this.configurationProvider.get());
    }

    public static RetrieveAuthorizationSession_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<FinancialConnectionsManifestRepository> provider2, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider3) {
        return new RetrieveAuthorizationSession_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static RetrieveAuthorizationSession_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsManifestRepository> provider2, Provider<FinancialConnectionsSheetConfiguration> provider3) {
        return new RetrieveAuthorizationSession_Factory(provider, provider2, provider3);
    }

    public static RetrieveAuthorizationSession newInstance(NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return new RetrieveAuthorizationSession(nativeAuthFlowCoordinator, financialConnectionsManifestRepository, financialConnectionsSheetConfiguration);
    }
}
