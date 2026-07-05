package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0924ManualEntrySuccessViewModel_Factory {
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<SuccessContentRepository> successContentRepositoryProvider;

    public C0924ManualEntrySuccessViewModel_Factory(Provider<GetOrFetchSync> provider, Provider<SuccessContentRepository> provider2, Provider<FinancialConnectionsAnalyticsTracker> provider3, Provider<NativeAuthFlowCoordinator> provider4) {
        this.getOrFetchSyncProvider = provider;
        this.successContentRepositoryProvider = provider2;
        this.eventTrackerProvider = provider3;
        this.nativeAuthFlowCoordinatorProvider = provider4;
    }

    public ManualEntrySuccessViewModel get(ManualEntrySuccessState manualEntrySuccessState) {
        return newInstance(manualEntrySuccessState, this.getOrFetchSyncProvider.get(), this.successContentRepositoryProvider.get(), this.eventTrackerProvider.get(), this.nativeAuthFlowCoordinatorProvider.get());
    }

    public static C0924ManualEntrySuccessViewModel_Factory create(javax.inject.Provider<GetOrFetchSync> provider, javax.inject.Provider<SuccessContentRepository> provider2, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider3, javax.inject.Provider<NativeAuthFlowCoordinator> provider4) {
        return new C0924ManualEntrySuccessViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static C0924ManualEntrySuccessViewModel_Factory create(Provider<GetOrFetchSync> provider, Provider<SuccessContentRepository> provider2, Provider<FinancialConnectionsAnalyticsTracker> provider3, Provider<NativeAuthFlowCoordinator> provider4) {
        return new C0924ManualEntrySuccessViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static ManualEntrySuccessViewModel newInstance(ManualEntrySuccessState manualEntrySuccessState, GetOrFetchSync getOrFetchSync, SuccessContentRepository successContentRepository, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        return new ManualEntrySuccessViewModel(manualEntrySuccessState, getOrFetchSync, successContentRepository, financialConnectionsAnalyticsTracker, nativeAuthFlowCoordinator);
    }
}
