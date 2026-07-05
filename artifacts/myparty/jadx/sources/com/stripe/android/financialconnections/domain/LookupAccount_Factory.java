package com.stripe.android.financialconnections.domain;

import android.app.Application;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LookupAccount_Factory implements Factory<LookupAccount> {
    private final Provider<Application> applicationProvider;
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsConsumerSessionRepository> consumerSessionRepositoryProvider;
    private final Provider<RequestIntegrityToken> requestIntegrityTokenProvider;

    public LookupAccount_Factory(Provider<Application> provider, Provider<RequestIntegrityToken> provider2, Provider<FinancialConnectionsConsumerSessionRepository> provider3, Provider<FinancialConnectionsSheetConfiguration> provider4) {
        this.applicationProvider = provider;
        this.requestIntegrityTokenProvider = provider2;
        this.consumerSessionRepositoryProvider = provider3;
        this.configurationProvider = provider4;
    }

    @Override // javax.inject.Provider
    public LookupAccount get() {
        return newInstance(this.applicationProvider.get(), this.requestIntegrityTokenProvider.get(), this.consumerSessionRepositoryProvider.get(), this.configurationProvider.get());
    }

    public static LookupAccount_Factory create(javax.inject.Provider<Application> provider, javax.inject.Provider<RequestIntegrityToken> provider2, javax.inject.Provider<FinancialConnectionsConsumerSessionRepository> provider3, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider4) {
        return new LookupAccount_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static LookupAccount_Factory create(Provider<Application> provider, Provider<RequestIntegrityToken> provider2, Provider<FinancialConnectionsConsumerSessionRepository> provider3, Provider<FinancialConnectionsSheetConfiguration> provider4) {
        return new LookupAccount_Factory(provider, provider2, provider3, provider4);
    }

    public static LookupAccount newInstance(Application application, RequestIntegrityToken requestIntegrityToken, FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        return new LookupAccount(application, requestIntegrityToken, financialConnectionsConsumerSessionRepository, financialConnectionsSheetConfiguration);
    }
}
