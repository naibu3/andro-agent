package com.stripe.android.financialconnections.features.attachpayment;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.IsNetworkingRelinkSession;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0874AttachPaymentViewModel_Factory {
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetCachedAccounts> getCachedAccountsProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<IsNetworkingRelinkSession> isNetworkingRelinkSessionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<PollAttachPaymentAccount> pollAttachPaymentAccountProvider;
    private final Provider<SuccessContentRepository> successContentRepositoryProvider;

    public C0874AttachPaymentViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<SuccessContentRepository> provider2, Provider<PollAttachPaymentAccount> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<GetCachedAccounts> provider5, Provider<NavigationManager> provider6, Provider<GetOrFetchSync> provider7, Provider<Logger> provider8, Provider<IsNetworkingRelinkSession> provider9) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.successContentRepositoryProvider = provider2;
        this.pollAttachPaymentAccountProvider = provider3;
        this.eventTrackerProvider = provider4;
        this.getCachedAccountsProvider = provider5;
        this.navigationManagerProvider = provider6;
        this.getOrFetchSyncProvider = provider7;
        this.loggerProvider = provider8;
        this.isNetworkingRelinkSessionProvider = provider9;
    }

    public AttachPaymentViewModel get(AttachPaymentState attachPaymentState) {
        return newInstance(attachPaymentState, this.nativeAuthFlowCoordinatorProvider.get(), this.successContentRepositoryProvider.get(), this.pollAttachPaymentAccountProvider.get(), this.eventTrackerProvider.get(), this.getCachedAccountsProvider.get(), this.navigationManagerProvider.get(), this.getOrFetchSyncProvider.get(), this.loggerProvider.get(), this.isNetworkingRelinkSessionProvider.get());
    }

    public static C0874AttachPaymentViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<SuccessContentRepository> provider2, javax.inject.Provider<PollAttachPaymentAccount> provider3, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider4, javax.inject.Provider<GetCachedAccounts> provider5, javax.inject.Provider<NavigationManager> provider6, javax.inject.Provider<GetOrFetchSync> provider7, javax.inject.Provider<Logger> provider8, javax.inject.Provider<IsNetworkingRelinkSession> provider9) {
        return new C0874AttachPaymentViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9));
    }

    public static C0874AttachPaymentViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<SuccessContentRepository> provider2, Provider<PollAttachPaymentAccount> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<GetCachedAccounts> provider5, Provider<NavigationManager> provider6, Provider<GetOrFetchSync> provider7, Provider<Logger> provider8, Provider<IsNetworkingRelinkSession> provider9) {
        return new C0874AttachPaymentViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static AttachPaymentViewModel newInstance(AttachPaymentState attachPaymentState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, SuccessContentRepository successContentRepository, PollAttachPaymentAccount pollAttachPaymentAccount, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, GetCachedAccounts getCachedAccounts, NavigationManager navigationManager, GetOrFetchSync getOrFetchSync, Logger logger, IsNetworkingRelinkSession isNetworkingRelinkSession) {
        return new AttachPaymentViewModel(attachPaymentState, nativeAuthFlowCoordinator, successContentRepository, pollAttachPaymentAccount, financialConnectionsAnalyticsTracker, getCachedAccounts, navigationManager, getOrFetchSync, logger, isNetworkingRelinkSession);
    }
}
