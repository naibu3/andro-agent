package com.stripe.android.financialconnections.features.reset;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.LinkMoreAccounts;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.reset.ResetViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0966ResetViewModel_Factory {
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<LinkMoreAccounts> linkMoreAccountsProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;

    public C0966ResetViewModel_Factory(Provider<LinkMoreAccounts> provider, Provider<NativeAuthFlowCoordinator> provider2, Provider<FinancialConnectionsAnalyticsTracker> provider3, Provider<NavigationManager> provider4, Provider<Logger> provider5) {
        this.linkMoreAccountsProvider = provider;
        this.nativeAuthFlowCoordinatorProvider = provider2;
        this.eventTrackerProvider = provider3;
        this.navigationManagerProvider = provider4;
        this.loggerProvider = provider5;
    }

    public ResetViewModel get(ResetState resetState) {
        return newInstance(resetState, this.linkMoreAccountsProvider.get(), this.nativeAuthFlowCoordinatorProvider.get(), this.eventTrackerProvider.get(), this.navigationManagerProvider.get(), this.loggerProvider.get());
    }

    public static C0966ResetViewModel_Factory create(javax.inject.Provider<LinkMoreAccounts> provider, javax.inject.Provider<NativeAuthFlowCoordinator> provider2, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider3, javax.inject.Provider<NavigationManager> provider4, javax.inject.Provider<Logger> provider5) {
        return new C0966ResetViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static C0966ResetViewModel_Factory create(Provider<LinkMoreAccounts> provider, Provider<NativeAuthFlowCoordinator> provider2, Provider<FinancialConnectionsAnalyticsTracker> provider3, Provider<NavigationManager> provider4, Provider<Logger> provider5) {
        return new C0966ResetViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ResetViewModel newInstance(ResetState resetState, LinkMoreAccounts linkMoreAccounts, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NavigationManager navigationManager, Logger logger) {
        return new ResetViewModel(resetState, linkMoreAccounts, nativeAuthFlowCoordinator, financialConnectionsAnalyticsTracker, navigationManager, logger);
    }
}
