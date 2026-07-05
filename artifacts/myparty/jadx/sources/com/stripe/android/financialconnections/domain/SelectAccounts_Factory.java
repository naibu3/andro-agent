package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class SelectAccounts_Factory implements Factory<SelectAccounts> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsAccountsRepository> repositoryProvider;

    public SelectAccounts_Factory(Provider<FinancialConnectionsAccountsRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2) {
        this.repositoryProvider = provider;
        this.configurationProvider = provider2;
    }

    @Override // javax.inject.Provider
    public SelectAccounts get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get());
    }

    public static SelectAccounts_Factory create(javax.inject.Provider<FinancialConnectionsAccountsRepository> provider, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider2) {
        return new SelectAccounts_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static SelectAccounts_Factory create(Provider<FinancialConnectionsAccountsRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2) {
        return new SelectAccounts_Factory(provider, provider2);
    }

    public static SelectAccounts newInstance(FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return new SelectAccounts(financialConnectionsAccountsRepository, financialConnectionsSheetConfiguration);
    }
}
