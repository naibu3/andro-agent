package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FetchFinancialConnectionsSession_Factory implements Factory<FetchFinancialConnectionsSession> {
    private final Provider<FetchPaginatedAccountsForSession> fetchPaginatedAccountsForSessionProvider;
    private final Provider<FinancialConnectionsRepository> financialConnectionsRepositoryProvider;

    public FetchFinancialConnectionsSession_Factory(Provider<FetchPaginatedAccountsForSession> provider, Provider<FinancialConnectionsRepository> provider2) {
        this.fetchPaginatedAccountsForSessionProvider = provider;
        this.financialConnectionsRepositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public FetchFinancialConnectionsSession get() {
        return newInstance(this.fetchPaginatedAccountsForSessionProvider.get(), this.financialConnectionsRepositoryProvider.get());
    }

    public static FetchFinancialConnectionsSession_Factory create(javax.inject.Provider<FetchPaginatedAccountsForSession> provider, javax.inject.Provider<FinancialConnectionsRepository> provider2) {
        return new FetchFinancialConnectionsSession_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static FetchFinancialConnectionsSession_Factory create(Provider<FetchPaginatedAccountsForSession> provider, Provider<FinancialConnectionsRepository> provider2) {
        return new FetchFinancialConnectionsSession_Factory(provider, provider2);
    }

    public static FetchFinancialConnectionsSession newInstance(FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession, FinancialConnectionsRepository financialConnectionsRepository) {
        return new FetchFinancialConnectionsSession(fetchPaginatedAccountsForSession, financialConnectionsRepository);
    }
}
