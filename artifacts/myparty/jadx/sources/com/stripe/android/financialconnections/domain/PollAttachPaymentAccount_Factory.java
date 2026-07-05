package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class PollAttachPaymentAccount_Factory implements Factory<PollAttachPaymentAccount> {
    private final Provider<AttachedPaymentAccountRepository> attachedPaymentAccountRepositoryProvider;
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<ConsumerSessionProvider> consumerSessionProvider;
    private final Provider<FinancialConnectionsAccountsRepository> repositoryProvider;

    public PollAttachPaymentAccount_Factory(Provider<FinancialConnectionsAccountsRepository> provider, Provider<ConsumerSessionProvider> provider2, Provider<AttachedPaymentAccountRepository> provider3, Provider<FinancialConnectionsSheetConfiguration> provider4) {
        this.repositoryProvider = provider;
        this.consumerSessionProvider = provider2;
        this.attachedPaymentAccountRepositoryProvider = provider3;
        this.configurationProvider = provider4;
    }

    @Override // javax.inject.Provider
    public PollAttachPaymentAccount get() {
        return newInstance(this.repositoryProvider.get(), this.consumerSessionProvider.get(), this.attachedPaymentAccountRepositoryProvider.get(), this.configurationProvider.get());
    }

    public static PollAttachPaymentAccount_Factory create(javax.inject.Provider<FinancialConnectionsAccountsRepository> provider, javax.inject.Provider<ConsumerSessionProvider> provider2, javax.inject.Provider<AttachedPaymentAccountRepository> provider3, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider4) {
        return new PollAttachPaymentAccount_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static PollAttachPaymentAccount_Factory create(Provider<FinancialConnectionsAccountsRepository> provider, Provider<ConsumerSessionProvider> provider2, Provider<AttachedPaymentAccountRepository> provider3, Provider<FinancialConnectionsSheetConfiguration> provider4) {
        return new PollAttachPaymentAccount_Factory(provider, provider2, provider3, provider4);
    }

    public static PollAttachPaymentAccount newInstance(FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository, ConsumerSessionProvider consumerSessionProvider, AttachedPaymentAccountRepository attachedPaymentAccountRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return new PollAttachPaymentAccount(financialConnectionsAccountsRepository, consumerSessionProvider, attachedPaymentAccountRepository, financialConnectionsSheetConfiguration);
    }
}
