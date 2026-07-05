package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class SaveAccountToLink_Factory implements Factory<SaveAccountToLink> {
    private final Provider<FinancialConnectionsAccountsRepository> accountsRepositoryProvider;
    private final Provider<AttachedPaymentAccountRepository> attachedPaymentAccountRepositoryProvider;
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<IsNetworkingRelinkSession> isNetworkingRelinkSessionProvider;
    private final Provider<Locale> localeProvider;
    private final Provider<FinancialConnectionsManifestRepository> repositoryProvider;
    private final Provider<SuccessContentRepository> successContentRepositoryProvider;

    public SaveAccountToLink_Factory(Provider<Locale> provider, Provider<FinancialConnectionsSheetConfiguration> provider2, Provider<AttachedPaymentAccountRepository> provider3, Provider<SuccessContentRepository> provider4, Provider<FinancialConnectionsManifestRepository> provider5, Provider<FinancialConnectionsAccountsRepository> provider6, Provider<IsNetworkingRelinkSession> provider7) {
        this.localeProvider = provider;
        this.configurationProvider = provider2;
        this.attachedPaymentAccountRepositoryProvider = provider3;
        this.successContentRepositoryProvider = provider4;
        this.repositoryProvider = provider5;
        this.accountsRepositoryProvider = provider6;
        this.isNetworkingRelinkSessionProvider = provider7;
    }

    @Override // javax.inject.Provider
    public SaveAccountToLink get() {
        return newInstance(this.localeProvider.get(), this.configurationProvider.get(), this.attachedPaymentAccountRepositoryProvider.get(), this.successContentRepositoryProvider.get(), this.repositoryProvider.get(), this.accountsRepositoryProvider.get(), this.isNetworkingRelinkSessionProvider.get());
    }

    public static SaveAccountToLink_Factory create(javax.inject.Provider<Locale> provider, javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider2, javax.inject.Provider<AttachedPaymentAccountRepository> provider3, javax.inject.Provider<SuccessContentRepository> provider4, javax.inject.Provider<FinancialConnectionsManifestRepository> provider5, javax.inject.Provider<FinancialConnectionsAccountsRepository> provider6, javax.inject.Provider<IsNetworkingRelinkSession> provider7) {
        return new SaveAccountToLink_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static SaveAccountToLink_Factory create(Provider<Locale> provider, Provider<FinancialConnectionsSheetConfiguration> provider2, Provider<AttachedPaymentAccountRepository> provider3, Provider<SuccessContentRepository> provider4, Provider<FinancialConnectionsManifestRepository> provider5, Provider<FinancialConnectionsAccountsRepository> provider6, Provider<IsNetworkingRelinkSession> provider7) {
        return new SaveAccountToLink_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static SaveAccountToLink newInstance(Locale locale, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, AttachedPaymentAccountRepository attachedPaymentAccountRepository, SuccessContentRepository successContentRepository, FinancialConnectionsManifestRepository financialConnectionsManifestRepository, FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository, IsNetworkingRelinkSession isNetworkingRelinkSession) {
        return new SaveAccountToLink(locale, financialConnectionsSheetConfiguration, attachedPaymentAccountRepository, successContentRepository, financialConnectionsManifestRepository, financialConnectionsAccountsRepository, isNetworkingRelinkSession);
    }
}
