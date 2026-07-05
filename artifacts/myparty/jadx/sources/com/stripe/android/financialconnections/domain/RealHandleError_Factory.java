package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealHandleError_Factory implements Factory<RealHandleError> {
    private final Provider<FinancialConnectionsAnalyticsTracker> analyticsTrackerProvider;
    private final Provider<FinancialConnectionsErrorRepository> errorRepositoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;

    public RealHandleError_Factory(Provider<FinancialConnectionsErrorRepository> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<NativeAuthFlowCoordinator> provider3, Provider<Logger> provider4, Provider<NavigationManager> provider5) {
        this.errorRepositoryProvider = provider;
        this.analyticsTrackerProvider = provider2;
        this.nativeAuthFlowCoordinatorProvider = provider3;
        this.loggerProvider = provider4;
        this.navigationManagerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public RealHandleError get() {
        return newInstance(this.errorRepositoryProvider.get(), this.analyticsTrackerProvider.get(), this.nativeAuthFlowCoordinatorProvider.get(), this.loggerProvider.get(), this.navigationManagerProvider.get());
    }

    public static RealHandleError_Factory create(javax.inject.Provider<FinancialConnectionsErrorRepository> provider, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider2, javax.inject.Provider<NativeAuthFlowCoordinator> provider3, javax.inject.Provider<Logger> provider4, javax.inject.Provider<NavigationManager> provider5) {
        return new RealHandleError_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static RealHandleError_Factory create(Provider<FinancialConnectionsErrorRepository> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<NativeAuthFlowCoordinator> provider3, Provider<Logger> provider4, Provider<NavigationManager> provider5) {
        return new RealHandleError_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static RealHandleError newInstance(FinancialConnectionsErrorRepository financialConnectionsErrorRepository, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, Logger logger, NavigationManager navigationManager) {
        return new RealHandleError(financialConnectionsErrorRepository, financialConnectionsAnalyticsTracker, nativeAuthFlowCoordinator, logger, navigationManager);
    }
}
