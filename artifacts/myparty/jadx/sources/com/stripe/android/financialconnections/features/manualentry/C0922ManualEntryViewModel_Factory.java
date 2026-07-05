package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0922ManualEntryViewModel_Factory {
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<PollAttachPaymentAccount> pollAttachPaymentAccountProvider;
    private final Provider<SuccessContentRepository> successContentRepositoryProvider;
    private final Provider<UpdateCachedAccounts> updateCachedAccountsProvider;

    public C0922ManualEntryViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<PollAttachPaymentAccount> provider2, Provider<SuccessContentRepository> provider3, Provider<UpdateCachedAccounts> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<GetOrFetchSync> provider6, Provider<NavigationManager> provider7, Provider<Logger> provider8) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.pollAttachPaymentAccountProvider = provider2;
        this.successContentRepositoryProvider = provider3;
        this.updateCachedAccountsProvider = provider4;
        this.eventTrackerProvider = provider5;
        this.getOrFetchSyncProvider = provider6;
        this.navigationManagerProvider = provider7;
        this.loggerProvider = provider8;
    }

    public ManualEntryViewModel get(ManualEntryState manualEntryState) {
        return newInstance(manualEntryState, this.nativeAuthFlowCoordinatorProvider.get(), this.pollAttachPaymentAccountProvider.get(), this.successContentRepositoryProvider.get(), this.updateCachedAccountsProvider.get(), this.eventTrackerProvider.get(), this.getOrFetchSyncProvider.get(), this.navigationManagerProvider.get(), this.loggerProvider.get());
    }

    public static C0922ManualEntryViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<PollAttachPaymentAccount> provider2, javax.inject.Provider<SuccessContentRepository> provider3, javax.inject.Provider<UpdateCachedAccounts> provider4, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider5, javax.inject.Provider<GetOrFetchSync> provider6, javax.inject.Provider<NavigationManager> provider7, javax.inject.Provider<Logger> provider8) {
        return new C0922ManualEntryViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8));
    }

    public static C0922ManualEntryViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<PollAttachPaymentAccount> provider2, Provider<SuccessContentRepository> provider3, Provider<UpdateCachedAccounts> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<GetOrFetchSync> provider6, Provider<NavigationManager> provider7, Provider<Logger> provider8) {
        return new C0922ManualEntryViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static ManualEntryViewModel newInstance(ManualEntryState manualEntryState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, PollAttachPaymentAccount pollAttachPaymentAccount, SuccessContentRepository successContentRepository, UpdateCachedAccounts updateCachedAccounts, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, Logger logger) {
        return new ManualEntryViewModel(manualEntryState, nativeAuthFlowCoordinator, pollAttachPaymentAccount, successContentRepository, updateCachedAccounts, financialConnectionsAnalyticsTracker, getOrFetchSync, navigationManager, logger);
    }
}
