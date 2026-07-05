package com.stripe.android.financialconnections.features.accountupdate;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0872AccountUpdateRequiredViewModel_Factory {
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<CoreAuthorizationPendingNetworkingRepairRepository> pendingRepairRepositoryProvider;
    private final Provider<UpdateLocalManifest> updateLocalManifestProvider;
    private final Provider<AccountUpdateRequiredContentRepository> updateRequiredContentRepositoryProvider;

    public C0872AccountUpdateRequiredViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<AccountUpdateRequiredContentRepository> provider2, Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider3, Provider<NavigationManager> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<UpdateLocalManifest> provider6, Provider<Logger> provider7) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.updateRequiredContentRepositoryProvider = provider2;
        this.pendingRepairRepositoryProvider = provider3;
        this.navigationManagerProvider = provider4;
        this.eventTrackerProvider = provider5;
        this.updateLocalManifestProvider = provider6;
        this.loggerProvider = provider7;
    }

    public AccountUpdateRequiredViewModel get(AccountUpdateRequiredState accountUpdateRequiredState) {
        return newInstance(accountUpdateRequiredState, this.nativeAuthFlowCoordinatorProvider.get(), this.updateRequiredContentRepositoryProvider.get(), this.pendingRepairRepositoryProvider.get(), this.navigationManagerProvider.get(), this.eventTrackerProvider.get(), this.updateLocalManifestProvider.get(), this.loggerProvider.get());
    }

    public static C0872AccountUpdateRequiredViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<AccountUpdateRequiredContentRepository> provider2, javax.inject.Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider3, javax.inject.Provider<NavigationManager> provider4, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider5, javax.inject.Provider<UpdateLocalManifest> provider6, javax.inject.Provider<Logger> provider7) {
        return new C0872AccountUpdateRequiredViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7));
    }

    public static C0872AccountUpdateRequiredViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<AccountUpdateRequiredContentRepository> provider2, Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider3, Provider<NavigationManager> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<UpdateLocalManifest> provider6, Provider<Logger> provider7) {
        return new C0872AccountUpdateRequiredViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AccountUpdateRequiredViewModel newInstance(AccountUpdateRequiredState accountUpdateRequiredState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, AccountUpdateRequiredContentRepository accountUpdateRequiredContentRepository, CoreAuthorizationPendingNetworkingRepairRepository coreAuthorizationPendingNetworkingRepairRepository, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, UpdateLocalManifest updateLocalManifest, Logger logger) {
        return new AccountUpdateRequiredViewModel(accountUpdateRequiredState, nativeAuthFlowCoordinator, accountUpdateRequiredContentRepository, coreAuthorizationPendingNetworkingRepairRepository, navigationManager, financialConnectionsAnalyticsTracker, updateLocalManifest, logger);
    }
}
