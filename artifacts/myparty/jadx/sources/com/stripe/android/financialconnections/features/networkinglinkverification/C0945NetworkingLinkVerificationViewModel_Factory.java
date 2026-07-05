package com.stripe.android.financialconnections.features.networkinglinkverification;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.AttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0945NetworkingLinkVerificationViewModel_Factory {
    private final Provider<FinancialConnectionsAnalyticsTracker> analyticsTrackerProvider;
    private final Provider<AttachConsumerToLinkAccountSession> attachConsumerToLinkAccountSessionProvider;
    private final Provider<ConfirmVerification> confirmVerificationProvider;
    private final Provider<ConsumerSessionProvider> consumerSessionProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<HandleError> handleErrorProvider;
    private final Provider<IsLinkWithStripe> isLinkWithStripeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MarkLinkVerified> markLinkVerifiedProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<StartVerification> startVerificationProvider;

    public C0945NetworkingLinkVerificationViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<GetOrFetchSync> provider2, Provider<ConfirmVerification> provider3, Provider<MarkLinkVerified> provider4, Provider<NavigationManager> provider5, Provider<FinancialConnectionsAnalyticsTracker> provider6, Provider<StartVerification> provider7, Provider<Logger> provider8, Provider<IsLinkWithStripe> provider9, Provider<AttachConsumerToLinkAccountSession> provider10, Provider<ConsumerSessionProvider> provider11, Provider<HandleError> provider12) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.getOrFetchSyncProvider = provider2;
        this.confirmVerificationProvider = provider3;
        this.markLinkVerifiedProvider = provider4;
        this.navigationManagerProvider = provider5;
        this.analyticsTrackerProvider = provider6;
        this.startVerificationProvider = provider7;
        this.loggerProvider = provider8;
        this.isLinkWithStripeProvider = provider9;
        this.attachConsumerToLinkAccountSessionProvider = provider10;
        this.consumerSessionProvider = provider11;
        this.handleErrorProvider = provider12;
    }

    public NetworkingLinkVerificationViewModel get(NetworkingLinkVerificationState networkingLinkVerificationState) {
        return newInstance(networkingLinkVerificationState, this.nativeAuthFlowCoordinatorProvider.get(), this.getOrFetchSyncProvider.get(), this.confirmVerificationProvider.get(), this.markLinkVerifiedProvider.get(), this.navigationManagerProvider.get(), this.analyticsTrackerProvider.get(), this.startVerificationProvider.get(), this.loggerProvider.get(), this.isLinkWithStripeProvider.get(), this.attachConsumerToLinkAccountSessionProvider.get(), this.consumerSessionProvider.get(), this.handleErrorProvider.get());
    }

    public static C0945NetworkingLinkVerificationViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<GetOrFetchSync> provider2, javax.inject.Provider<ConfirmVerification> provider3, javax.inject.Provider<MarkLinkVerified> provider4, javax.inject.Provider<NavigationManager> provider5, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider6, javax.inject.Provider<StartVerification> provider7, javax.inject.Provider<Logger> provider8, javax.inject.Provider<IsLinkWithStripe> provider9, javax.inject.Provider<AttachConsumerToLinkAccountSession> provider10, javax.inject.Provider<ConsumerSessionProvider> provider11, javax.inject.Provider<HandleError> provider12) {
        return new C0945NetworkingLinkVerificationViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12));
    }

    public static C0945NetworkingLinkVerificationViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<GetOrFetchSync> provider2, Provider<ConfirmVerification> provider3, Provider<MarkLinkVerified> provider4, Provider<NavigationManager> provider5, Provider<FinancialConnectionsAnalyticsTracker> provider6, Provider<StartVerification> provider7, Provider<Logger> provider8, Provider<IsLinkWithStripe> provider9, Provider<AttachConsumerToLinkAccountSession> provider10, Provider<ConsumerSessionProvider> provider11, Provider<HandleError> provider12) {
        return new C0945NetworkingLinkVerificationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static NetworkingLinkVerificationViewModel newInstance(NetworkingLinkVerificationState networkingLinkVerificationState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, GetOrFetchSync getOrFetchSync, ConfirmVerification confirmVerification, MarkLinkVerified markLinkVerified, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, StartVerification startVerification, Logger logger, IsLinkWithStripe isLinkWithStripe, AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession, ConsumerSessionProvider consumerSessionProvider, HandleError handleError) {
        return new NetworkingLinkVerificationViewModel(networkingLinkVerificationState, nativeAuthFlowCoordinator, getOrFetchSync, confirmVerification, markLinkVerified, navigationManager, financialConnectionsAnalyticsTracker, startVerification, logger, isLinkWithStripe, attachConsumerToLinkAccountSession, consumerSessionProvider, handleError);
    }
}
