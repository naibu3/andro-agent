package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.stripe.android.financialconnections.domain.AttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkSignupHandlerForInstantDebits_Factory implements Factory<LinkSignupHandlerForInstantDebits> {
    private final Provider<String> applicationIdProvider;
    private final Provider<AttachConsumerToLinkAccountSession> attachConsumerToLinkAccountSessionProvider;
    private final Provider<FinancialConnectionsConsumerSessionRepository> consumerRepositoryProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<HandleError> handleErrorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<RequestIntegrityToken> requestIntegrityTokenProvider;

    public LinkSignupHandlerForInstantDebits_Factory(Provider<FinancialConnectionsConsumerSessionRepository> provider, Provider<AttachConsumerToLinkAccountSession> provider2, Provider<RequestIntegrityToken> provider3, Provider<GetOrFetchSync> provider4, Provider<NavigationManager> provider5, Provider<String> provider6, Provider<HandleError> provider7) {
        this.consumerRepositoryProvider = provider;
        this.attachConsumerToLinkAccountSessionProvider = provider2;
        this.requestIntegrityTokenProvider = provider3;
        this.getOrFetchSyncProvider = provider4;
        this.navigationManagerProvider = provider5;
        this.applicationIdProvider = provider6;
        this.handleErrorProvider = provider7;
    }

    @Override // javax.inject.Provider
    public LinkSignupHandlerForInstantDebits get() {
        return newInstance(this.consumerRepositoryProvider.get(), this.attachConsumerToLinkAccountSessionProvider.get(), this.requestIntegrityTokenProvider.get(), this.getOrFetchSyncProvider.get(), this.navigationManagerProvider.get(), this.applicationIdProvider.get(), this.handleErrorProvider.get());
    }

    public static LinkSignupHandlerForInstantDebits_Factory create(javax.inject.Provider<FinancialConnectionsConsumerSessionRepository> provider, javax.inject.Provider<AttachConsumerToLinkAccountSession> provider2, javax.inject.Provider<RequestIntegrityToken> provider3, javax.inject.Provider<GetOrFetchSync> provider4, javax.inject.Provider<NavigationManager> provider5, javax.inject.Provider<String> provider6, javax.inject.Provider<HandleError> provider7) {
        return new LinkSignupHandlerForInstantDebits_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static LinkSignupHandlerForInstantDebits_Factory create(Provider<FinancialConnectionsConsumerSessionRepository> provider, Provider<AttachConsumerToLinkAccountSession> provider2, Provider<RequestIntegrityToken> provider3, Provider<GetOrFetchSync> provider4, Provider<NavigationManager> provider5, Provider<String> provider6, Provider<HandleError> provider7) {
        return new LinkSignupHandlerForInstantDebits_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static LinkSignupHandlerForInstantDebits newInstance(FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository, AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession, RequestIntegrityToken requestIntegrityToken, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, String str, HandleError handleError) {
        return new LinkSignupHandlerForInstantDebits(financialConnectionsConsumerSessionRepository, attachConsumerToLinkAccountSession, requestIntegrityToken, getOrFetchSync, navigationManager, str, handleError);
    }
}
