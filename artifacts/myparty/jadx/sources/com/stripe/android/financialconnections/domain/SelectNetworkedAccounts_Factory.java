package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class SelectNetworkedAccounts_Factory implements Factory<SelectNetworkedAccounts> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsAccountsRepository> repositoryProvider;
    private final Provider<SuccessContentRepository> successContentRepositoryProvider;

    public SelectNetworkedAccounts_Factory(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<SuccessContentRepository> provider2, Provider<FinancialConnectionsAccountsRepository> provider3) {
        this.configurationProvider = provider;
        this.successContentRepositoryProvider = provider2;
        this.repositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public SelectNetworkedAccounts get() {
        return newInstance(this.configurationProvider.get(), this.successContentRepositoryProvider.get(), this.repositoryProvider.get());
    }

    public static SelectNetworkedAccounts_Factory create(javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider, javax.inject.Provider<SuccessContentRepository> provider2, javax.inject.Provider<FinancialConnectionsAccountsRepository> provider3) {
        return new SelectNetworkedAccounts_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static SelectNetworkedAccounts_Factory create(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<SuccessContentRepository> provider2, Provider<FinancialConnectionsAccountsRepository> provider3) {
        return new SelectNetworkedAccounts_Factory(provider, provider2, provider3);
    }

    public static SelectNetworkedAccounts newInstance(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, SuccessContentRepository successContentRepository, FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository) {
        return new SelectNetworkedAccounts(financialConnectionsSheetConfiguration, successContentRepository, financialConnectionsAccountsRepository);
    }
}
