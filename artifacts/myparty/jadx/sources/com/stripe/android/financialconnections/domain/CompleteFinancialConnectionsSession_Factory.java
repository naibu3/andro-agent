package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CompleteFinancialConnectionsSession_Factory implements Factory<CompleteFinancialConnectionsSession> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FetchPaginatedAccountsForSession> fetchPaginatedAccountsForSessionProvider;
    private final Provider<FinancialConnectionsRepository> repositoryProvider;

    public CompleteFinancialConnectionsSession_Factory(Provider<FinancialConnectionsRepository> provider, Provider<FetchPaginatedAccountsForSession> provider2, Provider<FinancialConnectionsSheetConfiguration> provider3) {
        this.repositoryProvider = provider;
        this.fetchPaginatedAccountsForSessionProvider = provider2;
        this.configurationProvider = provider3;
    }

    @Override // javax.inject.Provider
    public CompleteFinancialConnectionsSession get() {
        return newInstance(this.repositoryProvider.get(), this.fetchPaginatedAccountsForSessionProvider.get(), this.configurationProvider.get());
    }

    public static CompleteFinancialConnectionsSession_Factory create(javax.inject.Provider<FinancialConnectionsRepository> provider, javax.inject.Provider<FetchPaginatedAccountsForSession> provider2, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider3) {
        return new CompleteFinancialConnectionsSession_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static CompleteFinancialConnectionsSession_Factory create(Provider<FinancialConnectionsRepository> provider, Provider<FetchPaginatedAccountsForSession> provider2, Provider<FinancialConnectionsSheetConfiguration> provider3) {
        return new CompleteFinancialConnectionsSession_Factory(provider, provider2, provider3);
    }

    public static CompleteFinancialConnectionsSession newInstance(FinancialConnectionsRepository financialConnectionsRepository, FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return new CompleteFinancialConnectionsSession(financialConnectionsRepository, fetchPaginatedAccountsForSession, financialConnectionsSheetConfiguration);
    }
}
