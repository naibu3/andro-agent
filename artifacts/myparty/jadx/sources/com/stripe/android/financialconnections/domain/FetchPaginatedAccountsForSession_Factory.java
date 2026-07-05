package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FetchPaginatedAccountsForSession_Factory implements Factory<FetchPaginatedAccountsForSession> {
    private final Provider<FinancialConnectionsRepository> financialConnectionsRepositoryProvider;

    public FetchPaginatedAccountsForSession_Factory(Provider<FinancialConnectionsRepository> provider) {
        this.financialConnectionsRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public FetchPaginatedAccountsForSession get() {
        return newInstance(this.financialConnectionsRepositoryProvider.get());
    }

    public static FetchPaginatedAccountsForSession_Factory create(javax.inject.Provider<FinancialConnectionsRepository> provider) {
        return new FetchPaginatedAccountsForSession_Factory(Providers.asDaggerProvider(provider));
    }

    public static FetchPaginatedAccountsForSession_Factory create(Provider<FinancialConnectionsRepository> provider) {
        return new FetchPaginatedAccountsForSession_Factory(provider);
    }

    public static FetchPaginatedAccountsForSession newInstance(FinancialConnectionsRepository financialConnectionsRepository) {
        return new FetchPaginatedAccountsForSession(financialConnectionsRepository);
    }
}
