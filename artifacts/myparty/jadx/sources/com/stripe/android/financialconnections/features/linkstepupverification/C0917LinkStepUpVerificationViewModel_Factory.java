package com.stripe.android.financialconnections.features.linkstepupverification;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.MarkLinkStepUpVerified;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.SelectNetworkedAccounts;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0917LinkStepUpVerificationViewModel_Factory {
    private final Provider<ConfirmVerification> confirmVerificationProvider;
    private final Provider<ConsumerSessionProvider> consumerSessionProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetCachedAccounts> getCachedAccountsProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MarkLinkStepUpVerified> markLinkStepUpVerifiedProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<SelectNetworkedAccounts> selectNetworkedAccountsProvider;
    private final Provider<StartVerification> startVerificationProvider;

    public C0917LinkStepUpVerificationViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<GetOrFetchSync> provider3, Provider<StartVerification> provider4, Provider<ConsumerSessionProvider> provider5, Provider<ConfirmVerification> provider6, Provider<SelectNetworkedAccounts> provider7, Provider<GetCachedAccounts> provider8, Provider<MarkLinkStepUpVerified> provider9, Provider<NavigationManager> provider10, Provider<Logger> provider11) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.eventTrackerProvider = provider2;
        this.getOrFetchSyncProvider = provider3;
        this.startVerificationProvider = provider4;
        this.consumerSessionProvider = provider5;
        this.confirmVerificationProvider = provider6;
        this.selectNetworkedAccountsProvider = provider7;
        this.getCachedAccountsProvider = provider8;
        this.markLinkStepUpVerifiedProvider = provider9;
        this.navigationManagerProvider = provider10;
        this.loggerProvider = provider11;
    }

    public LinkStepUpVerificationViewModel get(LinkStepUpVerificationState linkStepUpVerificationState) {
        return newInstance(linkStepUpVerificationState, this.nativeAuthFlowCoordinatorProvider.get(), this.eventTrackerProvider.get(), this.getOrFetchSyncProvider.get(), this.startVerificationProvider.get(), this.consumerSessionProvider.get(), this.confirmVerificationProvider.get(), this.selectNetworkedAccountsProvider.get(), this.getCachedAccountsProvider.get(), this.markLinkStepUpVerifiedProvider.get(), this.navigationManagerProvider.get(), this.loggerProvider.get());
    }

    public static C0917LinkStepUpVerificationViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider2, javax.inject.Provider<GetOrFetchSync> provider3, javax.inject.Provider<StartVerification> provider4, javax.inject.Provider<ConsumerSessionProvider> provider5, javax.inject.Provider<ConfirmVerification> provider6, javax.inject.Provider<SelectNetworkedAccounts> provider7, javax.inject.Provider<GetCachedAccounts> provider8, javax.inject.Provider<MarkLinkStepUpVerified> provider9, javax.inject.Provider<NavigationManager> provider10, javax.inject.Provider<Logger> provider11) {
        return new C0917LinkStepUpVerificationViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11));
    }

    public static C0917LinkStepUpVerificationViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<GetOrFetchSync> provider3, Provider<StartVerification> provider4, Provider<ConsumerSessionProvider> provider5, Provider<ConfirmVerification> provider6, Provider<SelectNetworkedAccounts> provider7, Provider<GetCachedAccounts> provider8, Provider<MarkLinkStepUpVerified> provider9, Provider<NavigationManager> provider10, Provider<Logger> provider11) {
        return new C0917LinkStepUpVerificationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static LinkStepUpVerificationViewModel newInstance(LinkStepUpVerificationState linkStepUpVerificationState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, GetOrFetchSync getOrFetchSync, StartVerification startVerification, ConsumerSessionProvider consumerSessionProvider, ConfirmVerification confirmVerification, SelectNetworkedAccounts selectNetworkedAccounts, GetCachedAccounts getCachedAccounts, MarkLinkStepUpVerified markLinkStepUpVerified, NavigationManager navigationManager, Logger logger) {
        return new LinkStepUpVerificationViewModel(linkStepUpVerificationState, nativeAuthFlowCoordinator, financialConnectionsAnalyticsTracker, getOrFetchSync, startVerification, consumerSessionProvider, confirmVerification, selectNetworkedAccounts, getCachedAccounts, markLinkStepUpVerified, navigationManager, logger);
    }
}
