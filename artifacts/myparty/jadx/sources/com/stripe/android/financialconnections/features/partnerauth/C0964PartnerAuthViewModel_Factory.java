package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.browser.BrowserManager;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.CompleteAuthorizationSession;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults;
import com.stripe.android.financialconnections.domain.PostAuthSessionEvent;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.RepairAuthorizationSession;
import com.stripe.android.financialconnections.domain.RetrieveAuthorizationSession;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0964PartnerAuthViewModel_Factory {
    private final Provider<String> applicationIdProvider;
    private final Provider<BrowserManager> browserManagerProvider;
    private final Provider<CancelAuthorizationSession> cancelAuthorizationSessionProvider;
    private final Provider<CompleteAuthorizationSession> completeAuthorizationSessionProvider;
    private final Provider<PostAuthorizationSession> createAuthorizationSessionProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<HandleError> handleErrorProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<CoreAuthorizationPendingNetworkingRepairRepository> pendingRepairRepositoryProvider;
    private final Provider<PollAuthorizationSessionOAuthResults> pollAuthorizationSessionOAuthResultsProvider;
    private final Provider<PostAuthSessionEvent> postAuthSessionEventProvider;
    private final Provider<PresentSheet> presentSheetProvider;
    private final Provider<RepairAuthorizationSession> repairAuthSessionProvider;
    private final Provider<RetrieveAuthorizationSession> retrieveAuthorizationSessionProvider;
    private final Provider<UriUtils> uriUtilsProvider;

    public C0964PartnerAuthViewModel_Factory(Provider<CompleteAuthorizationSession> provider, Provider<PostAuthorizationSession> provider2, Provider<CancelAuthorizationSession> provider3, Provider<RetrieveAuthorizationSession> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<String> provider6, Provider<UriUtils> provider7, Provider<PostAuthSessionEvent> provider8, Provider<GetOrFetchSync> provider9, Provider<BrowserManager> provider10, Provider<HandleError> provider11, Provider<NavigationManager> provider12, Provider<PollAuthorizationSessionOAuthResults> provider13, Provider<Logger> provider14, Provider<PresentSheet> provider15, Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider16, Provider<RepairAuthorizationSession> provider17, Provider<NativeAuthFlowCoordinator> provider18) {
        this.completeAuthorizationSessionProvider = provider;
        this.createAuthorizationSessionProvider = provider2;
        this.cancelAuthorizationSessionProvider = provider3;
        this.retrieveAuthorizationSessionProvider = provider4;
        this.eventTrackerProvider = provider5;
        this.applicationIdProvider = provider6;
        this.uriUtilsProvider = provider7;
        this.postAuthSessionEventProvider = provider8;
        this.getOrFetchSyncProvider = provider9;
        this.browserManagerProvider = provider10;
        this.handleErrorProvider = provider11;
        this.navigationManagerProvider = provider12;
        this.pollAuthorizationSessionOAuthResultsProvider = provider13;
        this.loggerProvider = provider14;
        this.presentSheetProvider = provider15;
        this.pendingRepairRepositoryProvider = provider16;
        this.repairAuthSessionProvider = provider17;
        this.nativeAuthFlowCoordinatorProvider = provider18;
    }

    public PartnerAuthViewModel get(SharedPartnerAuthState sharedPartnerAuthState) {
        return newInstance(this.completeAuthorizationSessionProvider.get(), this.createAuthorizationSessionProvider.get(), this.cancelAuthorizationSessionProvider.get(), this.retrieveAuthorizationSessionProvider.get(), this.eventTrackerProvider.get(), this.applicationIdProvider.get(), this.uriUtilsProvider.get(), this.postAuthSessionEventProvider.get(), this.getOrFetchSyncProvider.get(), this.browserManagerProvider.get(), this.handleErrorProvider.get(), this.navigationManagerProvider.get(), this.pollAuthorizationSessionOAuthResultsProvider.get(), this.loggerProvider.get(), this.presentSheetProvider.get(), this.pendingRepairRepositoryProvider.get(), this.repairAuthSessionProvider.get(), sharedPartnerAuthState, this.nativeAuthFlowCoordinatorProvider.get());
    }

    public static C0964PartnerAuthViewModel_Factory create(javax.inject.Provider<CompleteAuthorizationSession> provider, javax.inject.Provider<PostAuthorizationSession> provider2, javax.inject.Provider<CancelAuthorizationSession> provider3, javax.inject.Provider<RetrieveAuthorizationSession> provider4, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider5, javax.inject.Provider<String> provider6, javax.inject.Provider<UriUtils> provider7, javax.inject.Provider<PostAuthSessionEvent> provider8, javax.inject.Provider<GetOrFetchSync> provider9, javax.inject.Provider<BrowserManager> provider10, javax.inject.Provider<HandleError> provider11, javax.inject.Provider<NavigationManager> provider12, javax.inject.Provider<PollAuthorizationSessionOAuthResults> provider13, javax.inject.Provider<Logger> provider14, javax.inject.Provider<PresentSheet> provider15, javax.inject.Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider16, javax.inject.Provider<RepairAuthorizationSession> provider17, javax.inject.Provider<NativeAuthFlowCoordinator> provider18) {
        return new C0964PartnerAuthViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13), Providers.asDaggerProvider(provider14), Providers.asDaggerProvider(provider15), Providers.asDaggerProvider(provider16), Providers.asDaggerProvider(provider17), Providers.asDaggerProvider(provider18));
    }

    public static C0964PartnerAuthViewModel_Factory create(Provider<CompleteAuthorizationSession> provider, Provider<PostAuthorizationSession> provider2, Provider<CancelAuthorizationSession> provider3, Provider<RetrieveAuthorizationSession> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<String> provider6, Provider<UriUtils> provider7, Provider<PostAuthSessionEvent> provider8, Provider<GetOrFetchSync> provider9, Provider<BrowserManager> provider10, Provider<HandleError> provider11, Provider<NavigationManager> provider12, Provider<PollAuthorizationSessionOAuthResults> provider13, Provider<Logger> provider14, Provider<PresentSheet> provider15, Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider16, Provider<RepairAuthorizationSession> provider17, Provider<NativeAuthFlowCoordinator> provider18) {
        return new C0964PartnerAuthViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static PartnerAuthViewModel newInstance(CompleteAuthorizationSession completeAuthorizationSession, PostAuthorizationSession postAuthorizationSession, CancelAuthorizationSession cancelAuthorizationSession, RetrieveAuthorizationSession retrieveAuthorizationSession, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, String str, UriUtils uriUtils, PostAuthSessionEvent postAuthSessionEvent, GetOrFetchSync getOrFetchSync, BrowserManager browserManager, HandleError handleError, NavigationManager navigationManager, PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults, Logger logger, PresentSheet presentSheet, CoreAuthorizationPendingNetworkingRepairRepository coreAuthorizationPendingNetworkingRepairRepository, RepairAuthorizationSession repairAuthorizationSession, SharedPartnerAuthState sharedPartnerAuthState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        return new PartnerAuthViewModel(completeAuthorizationSession, postAuthorizationSession, cancelAuthorizationSession, retrieveAuthorizationSession, financialConnectionsAnalyticsTracker, str, uriUtils, postAuthSessionEvent, getOrFetchSync, browserManager, handleError, navigationManager, pollAuthorizationSessionOAuthResults, logger, presentSheet, coreAuthorizationPendingNetworkingRepairRepository, repairAuthorizationSession, sharedPartnerAuthState, nativeAuthFlowCoordinator);
    }
}
