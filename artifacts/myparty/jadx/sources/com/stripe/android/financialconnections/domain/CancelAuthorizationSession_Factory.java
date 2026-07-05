package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CancelAuthorizationSession_Factory implements Factory<CancelAuthorizationSession> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<NativeAuthFlowCoordinator> coordinatorProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public CancelAuthorizationSession_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsManifestRepository> provider2, Provider<FinancialConnectionsSheetConfiguration> provider3) {
        this.coordinatorProvider = provider;
        this.repositoryProvider = provider2;
        this.configurationProvider = provider3;
    }

    @Override // javax.inject.Provider
    public CancelAuthorizationSession get() {
        return newInstance(this.coordinatorProvider.get(), this.repositoryProvider.get(), this.configurationProvider.get());
    }

    public static CancelAuthorizationSession_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<FinancialConnectionsManifestRepository> provider2, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider3) {
        return new CancelAuthorizationSession_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static CancelAuthorizationSession_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsManifestRepository> provider2, Provider<FinancialConnectionsSheetConfiguration> provider3) {
        return new CancelAuthorizationSession_Factory(provider, provider2, provider3);
    }

    public static CancelAuthorizationSession newInstance(NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return new CancelAuthorizationSession(nativeAuthFlowCoordinator, financialConnectionsManifestRepository, financialConnectionsSheetConfiguration);
    }
}
