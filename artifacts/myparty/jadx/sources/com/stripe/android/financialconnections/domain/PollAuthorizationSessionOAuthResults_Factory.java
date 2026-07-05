package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class PollAuthorizationSessionOAuthResults_Factory implements Factory<PollAuthorizationSessionOAuthResults> {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsRepository> repositoryProvider;

    public PollAuthorizationSessionOAuthResults_Factory(Provider<FinancialConnectionsRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2) {
        this.repositoryProvider = provider;
        this.configurationProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PollAuthorizationSessionOAuthResults get() {
        return newInstance(this.repositoryProvider.get(), this.configurationProvider.get());
    }

    public static PollAuthorizationSessionOAuthResults_Factory create(javax.inject.Provider<FinancialConnectionsRepository> provider, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider2) {
        return new PollAuthorizationSessionOAuthResults_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static PollAuthorizationSessionOAuthResults_Factory create(Provider<FinancialConnectionsRepository> provider, Provider<FinancialConnectionsSheetConfiguration> provider2) {
        return new PollAuthorizationSessionOAuthResults_Factory(provider, provider2);
    }

    public static PollAuthorizationSessionOAuthResults newInstance(FinancialConnectionsRepository financialConnectionsRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return new PollAuthorizationSessionOAuthResults(financialConnectionsRepository, financialConnectionsSheetConfiguration);
    }
}
