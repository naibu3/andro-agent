package com.stripe.android.financialconnections.features.linkaccountpicker;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.FetchNetworkedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.SelectNetworkedAccounts;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0912LinkAccountPickerViewModel_Factory {
    private final Provider<AcceptConsent> acceptConsentProvider;
    private final Provider<ConsumerSessionProvider> consumerSessionProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<FetchNetworkedAccounts> fetchNetworkedAccountsProvider;
    private final Provider<GetOrFetchSync> getSyncProvider;
    private final Provider<HandleClickableUrl> handleClickableUrlProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<PresentSheet> presentSheetProvider;
    private final Provider<SelectNetworkedAccounts> selectNetworkedAccountsProvider;
    private final Provider<UpdateCachedAccounts> updateCachedAccountsProvider;

    public C0912LinkAccountPickerViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<ConsumerSessionProvider> provider3, Provider<HandleClickableUrl> provider4, Provider<FetchNetworkedAccounts> provider5, Provider<SelectNetworkedAccounts> provider6, Provider<UpdateCachedAccounts> provider7, Provider<GetOrFetchSync> provider8, Provider<NavigationManager> provider9, Provider<Logger> provider10, Provider<AcceptConsent> provider11, Provider<PresentSheet> provider12) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.eventTrackerProvider = provider2;
        this.consumerSessionProvider = provider3;
        this.handleClickableUrlProvider = provider4;
        this.fetchNetworkedAccountsProvider = provider5;
        this.selectNetworkedAccountsProvider = provider6;
        this.updateCachedAccountsProvider = provider7;
        this.getSyncProvider = provider8;
        this.navigationManagerProvider = provider9;
        this.loggerProvider = provider10;
        this.acceptConsentProvider = provider11;
        this.presentSheetProvider = provider12;
    }

    public LinkAccountPickerViewModel get(LinkAccountPickerState linkAccountPickerState) {
        return newInstance(linkAccountPickerState, this.nativeAuthFlowCoordinatorProvider.get(), this.eventTrackerProvider.get(), this.consumerSessionProvider.get(), this.handleClickableUrlProvider.get(), this.fetchNetworkedAccountsProvider.get(), this.selectNetworkedAccountsProvider.get(), this.updateCachedAccountsProvider.get(), this.getSyncProvider.get(), this.navigationManagerProvider.get(), this.loggerProvider.get(), this.acceptConsentProvider.get(), this.presentSheetProvider.get());
    }

    public static C0912LinkAccountPickerViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider2, javax.inject.Provider<ConsumerSessionProvider> provider3, javax.inject.Provider<HandleClickableUrl> provider4, javax.inject.Provider<FetchNetworkedAccounts> provider5, javax.inject.Provider<SelectNetworkedAccounts> provider6, javax.inject.Provider<UpdateCachedAccounts> provider7, javax.inject.Provider<GetOrFetchSync> provider8, javax.inject.Provider<NavigationManager> provider9, javax.inject.Provider<Logger> provider10, javax.inject.Provider<AcceptConsent> provider11, javax.inject.Provider<PresentSheet> provider12) {
        return new C0912LinkAccountPickerViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12));
    }

    public static C0912LinkAccountPickerViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<ConsumerSessionProvider> provider3, Provider<HandleClickableUrl> provider4, Provider<FetchNetworkedAccounts> provider5, Provider<SelectNetworkedAccounts> provider6, Provider<UpdateCachedAccounts> provider7, Provider<GetOrFetchSync> provider8, Provider<NavigationManager> provider9, Provider<Logger> provider10, Provider<AcceptConsent> provider11, Provider<PresentSheet> provider12) {
        return new C0912LinkAccountPickerViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static LinkAccountPickerViewModel newInstance(LinkAccountPickerState linkAccountPickerState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, ConsumerSessionProvider consumerSessionProvider, HandleClickableUrl handleClickableUrl, FetchNetworkedAccounts fetchNetworkedAccounts, SelectNetworkedAccounts selectNetworkedAccounts, UpdateCachedAccounts updateCachedAccounts, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, Logger logger, AcceptConsent acceptConsent, PresentSheet presentSheet) {
        return new LinkAccountPickerViewModel(linkAccountPickerState, nativeAuthFlowCoordinator, financialConnectionsAnalyticsTracker, consumerSessionProvider, handleClickableUrl, fetchNetworkedAccounts, selectNetworkedAccounts, updateCachedAccounts, getOrFetchSync, navigationManager, logger, acceptConsent, presentSheet);
    }
}
