package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FetchFinancialConnectionsSessionForToken_Factory implements Factory<FetchFinancialConnectionsSessionForToken> {
    private final Provider<FinancialConnectionsRepository> connectionsRepositoryProvider;

    public FetchFinancialConnectionsSessionForToken_Factory(Provider<FinancialConnectionsRepository> provider) {
        this.connectionsRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public FetchFinancialConnectionsSessionForToken get() {
        return newInstance(this.connectionsRepositoryProvider.get());
    }

    public static FetchFinancialConnectionsSessionForToken_Factory create(javax.inject.Provider<FinancialConnectionsRepository> provider) {
        return new FetchFinancialConnectionsSessionForToken_Factory(Providers.asDaggerProvider(provider));
    }

    public static FetchFinancialConnectionsSessionForToken_Factory create(Provider<FinancialConnectionsRepository> provider) {
        return new FetchFinancialConnectionsSessionForToken_Factory(provider);
    }

    public static FetchFinancialConnectionsSessionForToken newInstance(FinancialConnectionsRepository financialConnectionsRepository) {
        return new FetchFinancialConnectionsSessionForToken(financialConnectionsRepository);
    }
}
