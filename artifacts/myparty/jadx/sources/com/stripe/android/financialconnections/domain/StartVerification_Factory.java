package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class StartVerification_Factory implements Factory<StartVerification> {
    private final Provider<FinancialConnectionsConsumerSessionRepository> consumerSessionRepositoryProvider;

    public StartVerification_Factory(Provider<FinancialConnectionsConsumerSessionRepository> provider) {
        this.consumerSessionRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public StartVerification get() {
        return newInstance(this.consumerSessionRepositoryProvider.get());
    }

    public static StartVerification_Factory create(javax.inject.Provider<FinancialConnectionsConsumerSessionRepository> provider) {
        return new StartVerification_Factory(Providers.asDaggerProvider(provider));
    }

    public static StartVerification_Factory create(Provider<FinancialConnectionsConsumerSessionRepository> provider) {
        return new StartVerification_Factory(provider);
    }

    public static StartVerification newInstance(FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository) {
        return new StartVerification(financialConnectionsConsumerSessionRepository);
    }
}
