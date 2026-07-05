package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0948NetworkingSaveToLinkVerificationViewModel_Factory {
    private final Provider<AttachedPaymentAccountRepository> attachedPaymentAccountRepositoryProvider;
    private final Provider<ConfirmVerification> confirmVerificationProvider;
    private final Provider<ConsumerSessionProvider> consumerSessionProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetCachedAccounts> getCachedAccountsProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MarkLinkVerified> markLinkVerifiedProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<SaveAccountToLink> saveAccountToLinkProvider;
    private final Provider<StartVerification> startVerificationProvider;

    public C0948NetworkingSaveToLinkVerificationViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<ConsumerSessionProvider> provider3, Provider<StartVerification> provider4, Provider<GetOrFetchSync> provider5, Provider<ConfirmVerification> provider6, Provider<AttachedPaymentAccountRepository> provider7, Provider<MarkLinkVerified> provider8, Provider<GetCachedAccounts> provider9, Provider<SaveAccountToLink> provider10, Provider<NavigationManager> provider11, Provider<Logger> provider12) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.eventTrackerProvider = provider2;
        this.consumerSessionProvider = provider3;
        this.startVerificationProvider = provider4;
        this.getOrFetchSyncProvider = provider5;
        this.confirmVerificationProvider = provider6;
        this.attachedPaymentAccountRepositoryProvider = provider7;
        this.markLinkVerifiedProvider = provider8;
        this.getCachedAccountsProvider = provider9;
        this.saveAccountToLinkProvider = provider10;
        this.navigationManagerProvider = provider11;
        this.loggerProvider = provider12;
    }

    public NetworkingSaveToLinkVerificationViewModel get(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState) {
        return newInstance(networkingSaveToLinkVerificationState, this.nativeAuthFlowCoordinatorProvider.get(), this.eventTrackerProvider.get(), this.consumerSessionProvider.get(), this.startVerificationProvider.get(), this.getOrFetchSyncProvider.get(), this.confirmVerificationProvider.get(), this.attachedPaymentAccountRepositoryProvider.get(), this.markLinkVerifiedProvider.get(), this.getCachedAccountsProvider.get(), this.saveAccountToLinkProvider.get(), this.navigationManagerProvider.get(), this.loggerProvider.get());
    }

    public static C0948NetworkingSaveToLinkVerificationViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider2, javax.inject.Provider<ConsumerSessionProvider> provider3, javax.inject.Provider<StartVerification> provider4, javax.inject.Provider<GetOrFetchSync> provider5, javax.inject.Provider<ConfirmVerification> provider6, javax.inject.Provider<AttachedPaymentAccountRepository> provider7, javax.inject.Provider<MarkLinkVerified> provider8, javax.inject.Provider<GetCachedAccounts> provider9, javax.inject.Provider<SaveAccountToLink> provider10, javax.inject.Provider<NavigationManager> provider11, javax.inject.Provider<Logger> provider12) {
        return new C0948NetworkingSaveToLinkVerificationViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12));
    }

    public static C0948NetworkingSaveToLinkVerificationViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<FinancialConnectionsAnalyticsTracker> provider2, Provider<ConsumerSessionProvider> provider3, Provider<StartVerification> provider4, Provider<GetOrFetchSync> provider5, Provider<ConfirmVerification> provider6, Provider<AttachedPaymentAccountRepository> provider7, Provider<MarkLinkVerified> provider8, Provider<GetCachedAccounts> provider9, Provider<SaveAccountToLink> provider10, Provider<NavigationManager> provider11, Provider<Logger> provider12) {
        return new C0948NetworkingSaveToLinkVerificationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static NetworkingSaveToLinkVerificationViewModel newInstance(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, ConsumerSessionProvider consumerSessionProvider, StartVerification startVerification, GetOrFetchSync getOrFetchSync, ConfirmVerification confirmVerification, AttachedPaymentAccountRepository attachedPaymentAccountRepository, MarkLinkVerified markLinkVerified, GetCachedAccounts getCachedAccounts, SaveAccountToLink saveAccountToLink, NavigationManager navigationManager, Logger logger) {
        return new NetworkingSaveToLinkVerificationViewModel(networkingSaveToLinkVerificationState, nativeAuthFlowCoordinator, financialConnectionsAnalyticsTracker, consumerSessionProvider, startVerification, getOrFetchSync, confirmVerification, attachedPaymentAccountRepository, markLinkVerified, getCachedAccounts, saveAccountToLink, navigationManager, logger);
    }
}
