package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealAttachConsumerToLinkAccountSession_Factory implements Factory<RealAttachConsumerToLinkAccountSession> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsConsumerSessionRepository> consumerRepositoryProvider;

    public RealAttachConsumerToLinkAccountSession_Factory(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<FinancialConnectionsConsumerSessionRepository> provider2) {
        this.configurationProvider = provider;
        this.consumerRepositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RealAttachConsumerToLinkAccountSession get() {
        return newInstance(this.configurationProvider.get(), this.consumerRepositoryProvider.get());
    }

    public static RealAttachConsumerToLinkAccountSession_Factory create(javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider, javax.inject.Provider<FinancialConnectionsConsumerSessionRepository> provider2) {
        return new RealAttachConsumerToLinkAccountSession_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static RealAttachConsumerToLinkAccountSession_Factory create(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<FinancialConnectionsConsumerSessionRepository> provider2) {
        return new RealAttachConsumerToLinkAccountSession_Factory(provider, provider2);
    }

    public static RealAttachConsumerToLinkAccountSession newInstance(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository) {
        return new RealAttachConsumerToLinkAccountSession(financialConnectionsSheetConfiguration, financialConnectionsConsumerSessionRepository);
    }
}
