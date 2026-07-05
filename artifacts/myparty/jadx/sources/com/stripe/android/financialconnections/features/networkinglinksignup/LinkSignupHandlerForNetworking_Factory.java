package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkSignupHandlerForNetworking_Factory implements Factory<LinkSignupHandlerForNetworking> {
    private final Provider<String> applicationIdProvider;
    private final Provider<FinancialConnectionsConsumerSessionRepository> consumerRepositoryProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetCachedAccounts> getCachedAccountsProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<RequestIntegrityToken> requestIntegrityTokenProvider;
    private final Provider<SaveAccountToLink> saveAccountToLinkProvider;

    public LinkSignupHandlerForNetworking_Factory(Provider<FinancialConnectionsConsumerSessionRepository> provider, Provider<GetOrFetchSync> provider2, Provider<GetCachedAccounts> provider3, Provider<RequestIntegrityToken> provider4, Provider<SaveAccountToLink> provider5, Provider<FinancialConnectionsAnalyticsTracker> provider6, Provider<NavigationManager> provider7, Provider<String> provider8, Provider<Logger> provider9) {
        this.consumerRepositoryProvider = provider;
        this.getOrFetchSyncProvider = provider2;
        this.getCachedAccountsProvider = provider3;
        this.requestIntegrityTokenProvider = provider4;
        this.saveAccountToLinkProvider = provider5;
        this.eventTrackerProvider = provider6;
        this.navigationManagerProvider = provider7;
        this.applicationIdProvider = provider8;
        this.loggerProvider = provider9;
    }

    @Override // javax.inject.Provider
    public LinkSignupHandlerForNetworking get() {
        return newInstance(this.consumerRepositoryProvider.get(), this.getOrFetchSyncProvider.get(), this.getCachedAccountsProvider.get(), this.requestIntegrityTokenProvider.get(), this.saveAccountToLinkProvider.get(), this.eventTrackerProvider.get(), this.navigationManagerProvider.get(), this.applicationIdProvider.get(), this.loggerProvider.get());
    }

    public static LinkSignupHandlerForNetworking_Factory create(javax.inject.Provider<FinancialConnectionsConsumerSessionRepository> provider, javax.inject.Provider<GetOrFetchSync> provider2, javax.inject.Provider<GetCachedAccounts> provider3, javax.inject.Provider<RequestIntegrityToken> provider4, javax.inject.Provider<SaveAccountToLink> provider5, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider6, javax.inject.Provider<NavigationManager> provider7, javax.inject.Provider<String> provider8, javax.inject.Provider<Logger> provider9) {
        return new LinkSignupHandlerForNetworking_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9));
    }

    public static LinkSignupHandlerForNetworking_Factory create(Provider<FinancialConnectionsConsumerSessionRepository> provider, Provider<GetOrFetchSync> provider2, Provider<GetCachedAccounts> provider3, Provider<RequestIntegrityToken> provider4, Provider<SaveAccountToLink> provider5, Provider<FinancialConnectionsAnalyticsTracker> provider6, Provider<NavigationManager> provider7, Provider<String> provider8, Provider<Logger> provider9) {
        return new LinkSignupHandlerForNetworking_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static LinkSignupHandlerForNetworking newInstance(FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository, GetOrFetchSync getOrFetchSync, GetCachedAccounts getCachedAccounts, RequestIntegrityToken requestIntegrityToken, SaveAccountToLink saveAccountToLink, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NavigationManager navigationManager, String str, Logger logger) {
        return new LinkSignupHandlerForNetworking(financialConnectionsConsumerSessionRepository, getOrFetchSync, getCachedAccounts, requestIntegrityToken, saveAccountToLink, financialConnectionsAnalyticsTracker, navigationManager, str, logger);
    }
}
