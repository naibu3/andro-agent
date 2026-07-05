package com.stripe.android.financialconnections.features.streamlinedconsent;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0969IDConsentContentViewModel_Factory {
    private final Provider<AcceptConsent> acceptConsentProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<HandleClickableUrl> handleClickableUrlProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<PresentSheet> presentSheetProvider;

    public C0969IDConsentContentViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<AcceptConsent> provider2, Provider<GetOrFetchSync> provider3, Provider<NavigationManager> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<HandleClickableUrl> provider6, Provider<PresentSheet> provider7) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.acceptConsentProvider = provider2;
        this.getOrFetchSyncProvider = provider3;
        this.navigationManagerProvider = provider4;
        this.eventTrackerProvider = provider5;
        this.handleClickableUrlProvider = provider6;
        this.presentSheetProvider = provider7;
    }

    public IDConsentContentViewModel get(IDConsentContentState iDConsentContentState) {
        return newInstance(iDConsentContentState, this.nativeAuthFlowCoordinatorProvider.get(), this.acceptConsentProvider.get(), this.getOrFetchSyncProvider.get(), this.navigationManagerProvider.get(), this.eventTrackerProvider.get(), this.handleClickableUrlProvider.get(), this.presentSheetProvider.get());
    }

    public static C0969IDConsentContentViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<AcceptConsent> provider2, javax.inject.Provider<GetOrFetchSync> provider3, javax.inject.Provider<NavigationManager> provider4, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider5, javax.inject.Provider<HandleClickableUrl> provider6, javax.inject.Provider<PresentSheet> provider7) {
        return new C0969IDConsentContentViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static C0969IDConsentContentViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<AcceptConsent> provider2, Provider<GetOrFetchSync> provider3, Provider<NavigationManager> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<HandleClickableUrl> provider6, Provider<PresentSheet> provider7) {
        return new C0969IDConsentContentViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static IDConsentContentViewModel newInstance(IDConsentContentState iDConsentContentState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, AcceptConsent acceptConsent, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, HandleClickableUrl handleClickableUrl, PresentSheet presentSheet) {
        return new IDConsentContentViewModel(iDConsentContentState, nativeAuthFlowCoordinator, acceptConsent, getOrFetchSync, navigationManager, financialConnectionsAnalyticsTracker, handleClickableUrl, presentSheet);
    }
}
