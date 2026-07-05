package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class ConfirmVerification_Factory implements Factory<ConfirmVerification> {
    private final Provider<FinancialConnectionsConsumerSessionRepository> consumerSessionRepositoryProvider;

    public ConfirmVerification_Factory(Provider<FinancialConnectionsConsumerSessionRepository> provider) {
        this.consumerSessionRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ConfirmVerification get() {
        return newInstance(this.consumerSessionRepositoryProvider.get());
    }

    public static ConfirmVerification_Factory create(javax.inject.Provider<FinancialConnectionsConsumerSessionRepository> provider) {
        return new ConfirmVerification_Factory(Providers.asDaggerProvider(provider));
    }

    public static ConfirmVerification_Factory create(Provider<FinancialConnectionsConsumerSessionRepository> provider) {
        return new ConfirmVerification_Factory(provider);
    }

    public static ConfirmVerification newInstance(FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository) {
        return new ConfirmVerification(financialConnectionsConsumerSessionRepository);
    }
}
