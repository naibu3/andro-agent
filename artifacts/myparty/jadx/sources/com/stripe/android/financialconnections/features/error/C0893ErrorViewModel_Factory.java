package com.stripe.android.financialconnections.features.error;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.error.ErrorViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0893ErrorViewModel_Factory {
    private final Provider<NativeAuthFlowCoordinator> coordinatorProvider;
    private final Provider<FinancialConnectionsErrorRepository> errorRepositoryProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NavigationManager> navigationManagerProvider;

    public C0893ErrorViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<GetOrFetchSync> provider2, Provider<FinancialConnectionsErrorRepository> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<NavigationManager> provider5, Provider<Logger> provider6) {
        this.coordinatorProvider = provider;
        this.getOrFetchSyncProvider = provider2;
        this.errorRepositoryProvider = provider3;
        this.eventTrackerProvider = provider4;
        this.navigationManagerProvider = provider5;
        this.loggerProvider = provider6;
    }

    public ErrorViewModel get(ErrorState errorState) {
        return newInstance(errorState, this.coordinatorProvider.get(), this.getOrFetchSyncProvider.get(), this.errorRepositoryProvider.get(), this.eventTrackerProvider.get(), this.navigationManagerProvider.get(), this.loggerProvider.get());
    }

    public static C0893ErrorViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<GetOrFetchSync> provider2, javax.inject.Provider<FinancialConnectionsErrorRepository> provider3, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider4, javax.inject.Provider<NavigationManager> provider5, javax.inject.Provider<Logger> provider6) {
        return new C0893ErrorViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static C0893ErrorViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<GetOrFetchSync> provider2, Provider<FinancialConnectionsErrorRepository> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<NavigationManager> provider5, Provider<Logger> provider6) {
        return new C0893ErrorViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ErrorViewModel newInstance(ErrorState errorState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, GetOrFetchSync getOrFetchSync, FinancialConnectionsErrorRepository financialConnectionsErrorRepository, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NavigationManager navigationManager, Logger logger) {
        return new ErrorViewModel(errorState, nativeAuthFlowCoordinator, getOrFetchSync, financialConnectionsErrorRepository, financialConnectionsAnalyticsTracker, navigationManager, logger);
    }
}
