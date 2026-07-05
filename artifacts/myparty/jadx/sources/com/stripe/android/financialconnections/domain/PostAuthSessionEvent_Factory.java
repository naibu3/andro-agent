package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class PostAuthSessionEvent_Factory implements Factory<PostAuthSessionEvent> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;

    public PostAuthSessionEvent_Factory(Provider<FinancialConnectionsManifestRepository> provider, Provider<Logger> provider2, Provider<FinancialConnectionsSheetConfiguration> provider3) {
        this.repositoryProvider = provider;
        this.loggerProvider = provider2;
        this.configurationProvider = provider3;
    }

    @Override // javax.inject.Provider
    public PostAuthSessionEvent get() {
        return newInstance(this.repositoryProvider.get(), this.loggerProvider.get(), this.configurationProvider.get());
    }

    public static PostAuthSessionEvent_Factory create(javax.inject.Provider<FinancialConnectionsManifestRepository> provider, javax.inject.Provider<Logger> provider2, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider3) {
        return new PostAuthSessionEvent_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static PostAuthSessionEvent_Factory create(Provider<FinancialConnectionsManifestRepository> provider, Provider<Logger> provider2, Provider<FinancialConnectionsSheetConfiguration> provider3) {
        return new PostAuthSessionEvent_Factory(provider, provider2, provider3);
    }

    public static PostAuthSessionEvent newInstance(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, Logger logger, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return new PostAuthSessionEvent(financialConnectionsManifestRepository, logger, financialConnectionsSheetConfiguration);
    }
}
