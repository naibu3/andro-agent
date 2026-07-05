package com.stripe.android.financialconnections.features.exit;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.exit.ExitViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0896ExitViewModel_Factory {
    private final Provider<NativeAuthFlowCoordinator> coordinatorProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;

    public C0896ExitViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<GetOrFetchSync> provider2, Provider<NativeAuthFlowCoordinator> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<NavigationManager> provider5, Provider<Logger> provider6) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.getOrFetchSyncProvider = provider2;
        this.coordinatorProvider = provider3;
        this.eventTrackerProvider = provider4;
        this.navigationManagerProvider = provider5;
        this.loggerProvider = provider6;
    }

    public ExitViewModel get(ExitState exitState) {
        return newInstance(exitState, this.nativeAuthFlowCoordinatorProvider.get(), this.getOrFetchSyncProvider.get(), this.coordinatorProvider.get(), this.eventTrackerProvider.get(), this.navigationManagerProvider.get(), this.loggerProvider.get());
    }

    public static C0896ExitViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<GetOrFetchSync> provider2, javax.inject.Provider<NativeAuthFlowCoordinator> provider3, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider4, javax.inject.Provider<NavigationManager> provider5, javax.inject.Provider<Logger> provider6) {
        return new C0896ExitViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static C0896ExitViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<GetOrFetchSync> provider2, Provider<NativeAuthFlowCoordinator> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<NavigationManager> provider5, Provider<Logger> provider6) {
        return new C0896ExitViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ExitViewModel newInstance(ExitState exitState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, GetOrFetchSync getOrFetchSync, NativeAuthFlowCoordinator nativeAuthFlowCoordinator2, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NavigationManager navigationManager, Logger logger) {
        return new ExitViewModel(exitState, nativeAuthFlowCoordinator, getOrFetchSync, nativeAuthFlowCoordinator2, financialConnectionsAnalyticsTracker, navigationManager, logger);
    }
}
