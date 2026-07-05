package com.stripe.android.financialconnections.features.success;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.success.SuccessViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0973SuccessViewModel_Factory {
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetCachedAccounts> getCachedAccountsProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<SuccessContentRepository> successContentRepositoryProvider;

    public C0973SuccessViewModel_Factory(Provider<GetCachedAccounts> provider, Provider<GetOrFetchSync> provider2, Provider<SuccessContentRepository> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<Logger> provider5, Provider<NativeAuthFlowCoordinator> provider6) {
        this.getCachedAccountsProvider = provider;
        this.getOrFetchSyncProvider = provider2;
        this.successContentRepositoryProvider = provider3;
        this.eventTrackerProvider = provider4;
        this.loggerProvider = provider5;
        this.nativeAuthFlowCoordinatorProvider = provider6;
    }

    public SuccessViewModel get(SuccessState successState) {
        return newInstance(successState, this.getCachedAccountsProvider.get(), this.getOrFetchSyncProvider.get(), this.successContentRepositoryProvider.get(), this.eventTrackerProvider.get(), this.loggerProvider.get(), this.nativeAuthFlowCoordinatorProvider.get());
    }

    public static C0973SuccessViewModel_Factory create(javax.inject.Provider<GetCachedAccounts> provider, javax.inject.Provider<GetOrFetchSync> provider2, javax.inject.Provider<SuccessContentRepository> provider3, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider4, javax.inject.Provider<Logger> provider5, javax.inject.Provider<NativeAuthFlowCoordinator> provider6) {
        return new C0973SuccessViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static C0973SuccessViewModel_Factory create(Provider<GetCachedAccounts> provider, Provider<GetOrFetchSync> provider2, Provider<SuccessContentRepository> provider3, Provider<FinancialConnectionsAnalyticsTracker> provider4, Provider<Logger> provider5, Provider<NativeAuthFlowCoordinator> provider6) {
        return new C0973SuccessViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static SuccessViewModel newInstance(SuccessState successState, GetCachedAccounts getCachedAccounts, GetOrFetchSync getOrFetchSync, SuccessContentRepository successContentRepository, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, Logger logger, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        return new SuccessViewModel(successState, getCachedAccounts, getOrFetchSync, successContentRepository, financialConnectionsAnalyticsTracker, logger, nativeAuthFlowCoordinator);
    }
}
