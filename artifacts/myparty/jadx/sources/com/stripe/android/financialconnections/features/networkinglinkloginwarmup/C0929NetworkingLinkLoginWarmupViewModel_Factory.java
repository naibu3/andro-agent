package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.DisableNetworking;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0929NetworkingLinkLoginWarmupViewModel_Factory {
    private final Provider<ConsumerSessionProvider> consumerSessionProvider;
    private final Provider<DisableNetworking> disableNetworkingProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<HandleError> handleErrorProvider;
    private final Provider<LookupAccount> lookupAccountProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<ElementsSessionContext.PrefillDetails> prefillDetailsProvider;

    public C0929NetworkingLinkLoginWarmupViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<HandleError> provider3, Provider<GetOrFetchSync> provider4, Provider<DisableNetworking> provider5, Provider<NavigationManager> provider6, Provider<LookupAccount> provider7, Provider<ElementsSessionContext.PrefillDetails> provider8, Provider<ConsumerSessionProvider> provider9) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.eventTrackerProvider = provider2;
        this.handleErrorProvider = provider3;
        this.getOrFetchSyncProvider = provider4;
        this.disableNetworkingProvider = provider5;
        this.navigationManagerProvider = provider6;
        this.lookupAccountProvider = provider7;
        this.prefillDetailsProvider = provider8;
        this.consumerSessionProvider = provider9;
    }

    public NetworkingLinkLoginWarmupViewModel get(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState) {
        return newInstance(networkingLinkLoginWarmupState, this.nativeAuthFlowCoordinatorProvider.get(), this.eventTrackerProvider.get(), this.handleErrorProvider.get(), this.getOrFetchSyncProvider.get(), this.disableNetworkingProvider.get(), this.navigationManagerProvider.get(), this.lookupAccountProvider.get(), this.prefillDetailsProvider.get(), this.consumerSessionProvider.get());
    }

    public static C0929NetworkingLinkLoginWarmupViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider2, javax.inject.Provider<HandleError> provider3, javax.inject.Provider<GetOrFetchSync> provider4, javax.inject.Provider<DisableNetworking> provider5, javax.inject.Provider<NavigationManager> provider6, javax.inject.Provider<LookupAccount> provider7, javax.inject.Provider<ElementsSessionContext.PrefillDetails> provider8, javax.inject.Provider<ConsumerSessionProvider> provider9) {
        return new C0929NetworkingLinkLoginWarmupViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9));
    }

    public static C0929NetworkingLinkLoginWarmupViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<HandleError> provider3, Provider<GetOrFetchSync> provider4, Provider<DisableNetworking> provider5, Provider<NavigationManager> provider6, Provider<LookupAccount> provider7, Provider<ElementsSessionContext.PrefillDetails> provider8, Provider<ConsumerSessionProvider> provider9) {
        return new C0929NetworkingLinkLoginWarmupViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static NetworkingLinkLoginWarmupViewModel newInstance(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, HandleError handleError, GetOrFetchSync getOrFetchSync, DisableNetworking disableNetworking, NavigationManager navigationManager, LookupAccount lookupAccount, ElementsSessionContext.PrefillDetails prefillDetails, ConsumerSessionProvider consumerSessionProvider) {
        return new NetworkingLinkLoginWarmupViewModel(networkingLinkLoginWarmupState, nativeAuthFlowCoordinator, financialConnectionsAnalyticsTracker, handleError, getOrFetchSync, disableNetworking, navigationManager, lookupAccount, prefillDetails, consumerSessionProvider);
    }
}
