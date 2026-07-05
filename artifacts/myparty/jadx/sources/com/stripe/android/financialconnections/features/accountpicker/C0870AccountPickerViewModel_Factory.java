package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0870AccountPickerViewModel_Factory {
    private final Provider<ConsumerSessionProvider> consumerSessionProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<HandleClickableUrl> handleClickableUrlProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<PollAuthorizationSessionAccounts> pollAuthorizationSessionAccountsProvider;
    private final Provider<PresentSheet> presentSheetProvider;
    private final Provider<SaveAccountToLink> saveAccountToLinkProvider;
    private final Provider<SelectAccounts> selectAccountsProvider;

    public C0870AccountPickerViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<ConsumerSessionProvider> provider3, Provider<SaveAccountToLink> provider4, Provider<SelectAccounts> provider5, Provider<GetOrFetchSync> provider6, Provider<NavigationManager> provider7, Provider<HandleClickableUrl> provider8, Provider<Logger> provider9, Provider<PollAuthorizationSessionAccounts> provider10, Provider<PresentSheet> provider11) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.eventTrackerProvider = provider2;
        this.consumerSessionProvider = provider3;
        this.saveAccountToLinkProvider = provider4;
        this.selectAccountsProvider = provider5;
        this.getOrFetchSyncProvider = provider6;
        this.navigationManagerProvider = provider7;
        this.handleClickableUrlProvider = provider8;
        this.loggerProvider = provider9;
        this.pollAuthorizationSessionAccountsProvider = provider10;
        this.presentSheetProvider = provider11;
    }

    public AccountPickerViewModel get(AccountPickerState accountPickerState) {
        return newInstance(accountPickerState, this.nativeAuthFlowCoordinatorProvider.get(), this.eventTrackerProvider.get(), this.consumerSessionProvider.get(), this.saveAccountToLinkProvider.get(), this.selectAccountsProvider.get(), this.getOrFetchSyncProvider.get(), this.navigationManagerProvider.get(), this.handleClickableUrlProvider.get(), this.loggerProvider.get(), this.pollAuthorizationSessionAccountsProvider.get(), this.presentSheetProvider.get());
    }

    public static C0870AccountPickerViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider2, javax.inject.Provider<ConsumerSessionProvider> provider3, javax.inject.Provider<SaveAccountToLink> provider4, javax.inject.Provider<SelectAccounts> provider5, javax.inject.Provider<GetOrFetchSync> provider6, javax.inject.Provider<NavigationManager> provider7, javax.inject.Provider<HandleClickableUrl> provider8, javax.inject.Provider<Logger> provider9, javax.inject.Provider<PollAuthorizationSessionAccounts> provider10, javax.inject.Provider<PresentSheet> provider11) {
        return new C0870AccountPickerViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11));
    }

    public static C0870AccountPickerViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<ConsumerSessionProvider> provider3, Provider<SaveAccountToLink> provider4, Provider<SelectAccounts> provider5, Provider<GetOrFetchSync> provider6, Provider<NavigationManager> provider7, Provider<HandleClickableUrl> provider8, Provider<Logger> provider9, Provider<PollAuthorizationSessionAccounts> provider10, Provider<PresentSheet> provider11) {
        return new C0870AccountPickerViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static AccountPickerViewModel newInstance(AccountPickerState accountPickerState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, ConsumerSessionProvider consumerSessionProvider, SaveAccountToLink saveAccountToLink, SelectAccounts selectAccounts, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, HandleClickableUrl handleClickableUrl, Logger logger, PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts, PresentSheet presentSheet) {
        return new AccountPickerViewModel(accountPickerState, nativeAuthFlowCoordinator, financialConnectionsAnalyticsTracker, consumerSessionProvider, saveAccountToLink, selectAccounts, getOrFetchSync, navigationManager, handleClickableUrl, logger, pollAuthorizationSessionAccounts, presentSheet);
    }
}
