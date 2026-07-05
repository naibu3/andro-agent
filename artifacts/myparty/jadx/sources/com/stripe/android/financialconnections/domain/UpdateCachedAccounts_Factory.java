package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class UpdateCachedAccounts_Factory implements Factory<UpdateCachedAccounts> {
    private final Provider<FinancialConnectionsAccountsRepository> repositoryProvider;

    public UpdateCachedAccounts_Factory(Provider<FinancialConnectionsAccountsRepository> provider) {
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public UpdateCachedAccounts get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static UpdateCachedAccounts_Factory create(javax.inject.Provider<FinancialConnectionsAccountsRepository> provider) {
        return new UpdateCachedAccounts_Factory(Providers.asDaggerProvider(provider));
    }

    public static UpdateCachedAccounts_Factory create(Provider<FinancialConnectionsAccountsRepository> provider) {
        return new UpdateCachedAccounts_Factory(provider);
    }

    public static UpdateCachedAccounts newInstance(FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository) {
        return new UpdateCachedAccounts(financialConnectionsAccountsRepository);
    }
}
