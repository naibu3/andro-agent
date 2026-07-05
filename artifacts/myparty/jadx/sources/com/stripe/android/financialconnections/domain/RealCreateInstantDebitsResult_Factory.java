package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealCreateInstantDebitsResult_Factory implements Factory<RealCreateInstantDebitsResult> {
    private final Provider<FinancialConnectionsConsumerSessionRepository> consumerRepositoryProvider;
    private final Provider<ConsumerSessionProvider> consumerSessionProvider;
    private final Provider<ElementsSessionContext> elementsSessionContextProvider;
    private final Provider<FinancialConnectionsRepository> repositoryProvider;

    public RealCreateInstantDebitsResult_Factory(Provider<FinancialConnectionsConsumerSessionRepository> provider, Provider<FinancialConnectionsRepository> provider2, Provider<ConsumerSessionProvider> provider3, Provider<ElementsSessionContext> provider4) {
        this.consumerRepositoryProvider = provider;
        this.repositoryProvider = provider2;
        this.consumerSessionProvider = provider3;
        this.elementsSessionContextProvider = provider4;
    }

    @Override // javax.inject.Provider
    public RealCreateInstantDebitsResult get() {
        return newInstance(this.consumerRepositoryProvider.get(), this.repositoryProvider.get(), this.consumerSessionProvider.get(), this.elementsSessionContextProvider.get());
    }

    public static RealCreateInstantDebitsResult_Factory create(javax.inject.Provider<FinancialConnectionsConsumerSessionRepository> provider, javax.inject.Provider<FinancialConnectionsRepository> provider2, javax.inject.Provider<ConsumerSessionProvider> provider3, javax.inject.Provider<ElementsSessionContext> provider4) {
        return new RealCreateInstantDebitsResult_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static RealCreateInstantDebitsResult_Factory create(Provider<FinancialConnectionsConsumerSessionRepository> provider, Provider<FinancialConnectionsRepository> provider2, Provider<ConsumerSessionProvider> provider3, Provider<ElementsSessionContext> provider4) {
        return new RealCreateInstantDebitsResult_Factory(provider, provider2, provider3, provider4);
    }

    public static RealCreateInstantDebitsResult newInstance(FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository, FinancialConnectionsRepository financialConnectionsRepository, ConsumerSessionProvider consumerSessionProvider, ElementsSessionContext elementsSessionContext) {
        return new RealCreateInstantDebitsResult(financialConnectionsConsumerSessionRepository, financialConnectionsRepository, consumerSessionProvider, elementsSessionContext);
    }
}
