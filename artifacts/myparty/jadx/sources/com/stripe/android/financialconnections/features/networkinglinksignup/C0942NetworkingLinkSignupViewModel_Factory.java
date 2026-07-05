package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0942NetworkingLinkSignupViewModel_Factory {
    private final Provider<ElementsSessionContext> elementsSessionContextProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<HandleError> handleErrorProvider;
    private final Provider<LinkSignupHandler> linkSignupHandlerProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<LookupAccount> lookupAccountProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<PresentSheet> presentSheetProvider;
    private final Provider<UriUtils> uriUtilsProvider;

    public C0942NetworkingLinkSignupViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<LookupAccount> provider2, Provider<UriUtils> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<GetOrFetchSync> provider5, Provider<NavigationManager> provider6, Provider<Logger> provider7, Provider<PresentSheet> provider8, Provider<LinkSignupHandler> provider9, Provider<ElementsSessionContext> provider10, Provider<HandleError> provider11) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.lookupAccountProvider = provider2;
        this.uriUtilsProvider = provider3;
        this.eventTrackerProvider = provider4;
        this.getOrFetchSyncProvider = provider5;
        this.navigationManagerProvider = provider6;
        this.loggerProvider = provider7;
        this.presentSheetProvider = provider8;
        this.linkSignupHandlerProvider = provider9;
        this.elementsSessionContextProvider = provider10;
        this.handleErrorProvider = provider11;
    }

    public NetworkingLinkSignupViewModel get(NetworkingLinkSignupState networkingLinkSignupState) {
        return newInstance(networkingLinkSignupState, this.nativeAuthFlowCoordinatorProvider.get(), this.lookupAccountProvider.get(), this.uriUtilsProvider.get(), this.eventTrackerProvider.get(), this.getOrFetchSyncProvider.get(), this.navigationManagerProvider.get(), this.loggerProvider.get(), this.presentSheetProvider.get(), this.linkSignupHandlerProvider.get(), this.elementsSessionContextProvider.get(), this.handleErrorProvider.get());
    }

    public static C0942NetworkingLinkSignupViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<LookupAccount> provider2, javax.inject.Provider<UriUtils> provider3, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider4, javax.inject.Provider<GetOrFetchSync> provider5, javax.inject.Provider<NavigationManager> provider6, javax.inject.Provider<Logger> provider7, javax.inject.Provider<PresentSheet> provider8, javax.inject.Provider<LinkSignupHandler> provider9, javax.inject.Provider<ElementsSessionContext> provider10, javax.inject.Provider<HandleError> provider11) {
        return new C0942NetworkingLinkSignupViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11));
    }

    public static C0942NetworkingLinkSignupViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<LookupAccount> provider2, Provider<UriUtils> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<GetOrFetchSync> provider5, Provider<NavigationManager> provider6, Provider<Logger> provider7, Provider<PresentSheet> provider8, Provider<LinkSignupHandler> provider9, Provider<ElementsSessionContext> provider10, Provider<HandleError> provider11) {
        return new C0942NetworkingLinkSignupViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static NetworkingLinkSignupViewModel newInstance(NetworkingLinkSignupState networkingLinkSignupState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, LookupAccount lookupAccount, UriUtils uriUtils, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, Logger logger, PresentSheet presentSheet, LinkSignupHandler linkSignupHandler, ElementsSessionContext elementsSessionContext, HandleError handleError) {
        return new NetworkingLinkSignupViewModel(networkingLinkSignupState, nativeAuthFlowCoordinator, lookupAccount, uriUtils, financialConnectionsAnalyticsTracker, getOrFetchSync, navigationManager, logger, presentSheet, linkSignupHandler, elementsSessionContext, handleError);
    }
}
