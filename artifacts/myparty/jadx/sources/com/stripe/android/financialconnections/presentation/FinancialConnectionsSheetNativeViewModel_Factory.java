package com.stripe.android.financialconnections.presentation;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.CreateInstantDebitsResult;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeViewModel_Factory implements Factory<FinancialConnectionsSheetNativeViewModel> {
    private final Provider<FinancialConnectionsSheetNativeComponent> activityRetainedComponentProvider;
    private final Provider<String> applicationIdProvider;
    private final Provider<CompleteFinancialConnectionsSession> completeFinancialConnectionsSessionProvider;
    private final Provider<CreateInstantDebitsResult> createInstantDebitsResultProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<FinancialConnectionsSheetNativeState> initialStateProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<UriUtils> uriUtilsProvider;

    public FinancialConnectionsSheetNativeViewModel_Factory(Provider<FinancialConnectionsSheetNativeComponent> provider, Provider<SavedStateHandle> provider2, Provider<NativeAuthFlowCoordinator> provider3, Provider<UriUtils> provider4, Provider<CompleteFinancialConnectionsSession> provider5, Provider<CreateInstantDebitsResult> provider6, Provider<FinancialConnectionsAnalyticsTracker> provider7, Provider<Logger> provider8, Provider<NavigationManager> provider9, Provider<String> provider10, Provider<FinancialConnectionsSheetNativeState> provider11) {
        this.activityRetainedComponentProvider = provider;
        this.savedStateHandleProvider = provider2;
        this.nativeAuthFlowCoordinatorProvider = provider3;
        this.uriUtilsProvider = provider4;
        this.completeFinancialConnectionsSessionProvider = provider5;
        this.createInstantDebitsResultProvider = provider6;
        this.eventTrackerProvider = provider7;
        this.loggerProvider = provider8;
        this.navigationManagerProvider = provider9;
        this.applicationIdProvider = provider10;
        this.initialStateProvider = provider11;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsSheetNativeViewModel get() {
        return newInstance(this.activityRetainedComponentProvider.get(), this.savedStateHandleProvider.get(), this.nativeAuthFlowCoordinatorProvider.get(), this.uriUtilsProvider.get(), this.completeFinancialConnectionsSessionProvider.get(), this.createInstantDebitsResultProvider.get(), this.eventTrackerProvider.get(), this.loggerProvider.get(), this.navigationManagerProvider.get(), this.applicationIdProvider.get(), this.initialStateProvider.get());
    }

    public static FinancialConnectionsSheetNativeViewModel_Factory create(javax.inject.Provider<FinancialConnectionsSheetNativeComponent> provider, javax.inject.Provider<SavedStateHandle> provider2, javax.inject.Provider<NativeAuthFlowCoordinator> provider3, javax.inject.Provider<UriUtils> provider4, javax.inject.Provider<CompleteFinancialConnectionsSession> provider5, javax.inject.Provider<CreateInstantDebitsResult> provider6, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider7, javax.inject.Provider<Logger> provider8, javax.inject.Provider<NavigationManager> provider9, javax.inject.Provider<String> provider10, javax.inject.Provider<FinancialConnectionsSheetNativeState> provider11) {
        return new FinancialConnectionsSheetNativeViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11));
    }

    public static FinancialConnectionsSheetNativeViewModel_Factory create(Provider<FinancialConnectionsSheetNativeComponent> provider, Provider<SavedStateHandle> provider2, Provider<NativeAuthFlowCoordinator> provider3, Provider<UriUtils> provider4, Provider<CompleteFinancialConnectionsSession> provider5, Provider<CreateInstantDebitsResult> provider6, Provider<FinancialConnectionsAnalyticsTracker> provider7, Provider<Logger> provider8, Provider<NavigationManager> provider9, Provider<String> provider10, Provider<FinancialConnectionsSheetNativeState> provider11) {
        return new FinancialConnectionsSheetNativeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static FinancialConnectionsSheetNativeViewModel newInstance(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, SavedStateHandle savedStateHandle, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, UriUtils uriUtils, CompleteFinancialConnectionsSession completeFinancialConnectionsSession, CreateInstantDebitsResult createInstantDebitsResult, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, Logger logger, NavigationManager navigationManager, String str, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
        return new FinancialConnectionsSheetNativeViewModel(financialConnectionsSheetNativeComponent, savedStateHandle, nativeAuthFlowCoordinator, uriUtils, completeFinancialConnectionsSession, createInstantDebitsResult, financialConnectionsAnalyticsTracker, logger, navigationManager, str, financialConnectionsSheetNativeState);
    }
}
