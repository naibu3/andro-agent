package com.stripe.android.financialconnections;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.browser.BrowserManager;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.NativeAuthFlowRouter;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetViewModel_Factory implements Factory<FinancialConnectionsSheetViewModel> {
    private final Provider<FinancialConnectionsAnalyticsTracker> analyticsTrackerProvider;
    private final Provider<String> applicationIdProvider;
    private final Provider<BrowserManager> browserManagerProvider;
    private final Provider<FinancialConnectionsEventReporter> eventReporterProvider;
    private final Provider<FetchFinancialConnectionsSessionForToken> fetchFinancialConnectionsSessionForTokenProvider;
    private final Provider<FetchFinancialConnectionsSession> fetchFinancialConnectionsSessionProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<FinancialConnectionsSheetState> initialStateProvider;
    private final Provider<IntegrityRequestManager> integrityRequestManagerProvider;
    private final Provider<IntegrityVerdictManager> integrityVerdictManagerProvider;
    private final Provider<CoroutineDispatcher> ioDispatcherProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NativeAuthFlowRouter> nativeRouterProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public FinancialConnectionsSheetViewModel_Factory(Provider<String> provider, Provider<SavedStateHandle> provider2, Provider<GetOrFetchSync> provider3, Provider<IntegrityRequestManager> provider4, Provider<IntegrityVerdictManager> provider5, Provider<FetchFinancialConnectionsSession> provider6, Provider<FetchFinancialConnectionsSessionForToken> provider7, Provider<Logger> provider8, Provider<BrowserManager> provider9, Provider<FinancialConnectionsEventReporter> provider10, Provider<FinancialConnectionsAnalyticsTracker> provider11, Provider<NativeAuthFlowRouter> provider12, Provider<NativeAuthFlowCoordinator> provider13, Provider<FinancialConnectionsSheetState> provider14, Provider<CoroutineDispatcher> provider15) {
        this.applicationIdProvider = provider;
        this.savedStateHandleProvider = provider2;
        this.getOrFetchSyncProvider = provider3;
        this.integrityRequestManagerProvider = provider4;
        this.integrityVerdictManagerProvider = provider5;
        this.fetchFinancialConnectionsSessionProvider = provider6;
        this.fetchFinancialConnectionsSessionForTokenProvider = provider7;
        this.loggerProvider = provider8;
        this.browserManagerProvider = provider9;
        this.eventReporterProvider = provider10;
        this.analyticsTrackerProvider = provider11;
        this.nativeRouterProvider = provider12;
        this.nativeAuthFlowCoordinatorProvider = provider13;
        this.initialStateProvider = provider14;
        this.ioDispatcherProvider = provider15;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsSheetViewModel get() {
        return newInstance(this.applicationIdProvider.get(), this.savedStateHandleProvider.get(), this.getOrFetchSyncProvider.get(), this.integrityRequestManagerProvider.get(), this.integrityVerdictManagerProvider.get(), this.fetchFinancialConnectionsSessionProvider.get(), this.fetchFinancialConnectionsSessionForTokenProvider.get(), this.loggerProvider.get(), this.browserManagerProvider.get(), this.eventReporterProvider.get(), this.analyticsTrackerProvider.get(), this.nativeRouterProvider.get(), this.nativeAuthFlowCoordinatorProvider.get(), this.initialStateProvider.get(), this.ioDispatcherProvider.get());
    }

    public static FinancialConnectionsSheetViewModel_Factory create(javax.inject.Provider<String> provider, javax.inject.Provider<SavedStateHandle> provider2, javax.inject.Provider<GetOrFetchSync> provider3, javax.inject.Provider<IntegrityRequestManager> provider4, javax.inject.Provider<IntegrityVerdictManager> provider5, javax.inject.Provider<FetchFinancialConnectionsSession> provider6, javax.inject.Provider<FetchFinancialConnectionsSessionForToken> provider7, javax.inject.Provider<Logger> provider8, javax.inject.Provider<BrowserManager> provider9, javax.inject.Provider<FinancialConnectionsEventReporter> provider10, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider11, javax.inject.Provider<NativeAuthFlowRouter> provider12, javax.inject.Provider<NativeAuthFlowCoordinator> provider13, javax.inject.Provider<FinancialConnectionsSheetState> provider14, javax.inject.Provider<CoroutineDispatcher> provider15) {
        return new FinancialConnectionsSheetViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13), Providers.asDaggerProvider(provider14), Providers.asDaggerProvider(provider15));
    }

    public static FinancialConnectionsSheetViewModel_Factory create(Provider<String> provider, Provider<SavedStateHandle> provider2, Provider<GetOrFetchSync> provider3, Provider<IntegrityRequestManager> provider4, Provider<IntegrityVerdictManager> provider5, Provider<FetchFinancialConnectionsSession> provider6, Provider<FetchFinancialConnectionsSessionForToken> provider7, Provider<Logger> provider8, Provider<BrowserManager> provider9, Provider<FinancialConnectionsEventReporter> provider10, Provider<FinancialConnectionsAnalyticsTracker> provider11, Provider<NativeAuthFlowRouter> provider12, Provider<NativeAuthFlowCoordinator> provider13, Provider<FinancialConnectionsSheetState> provider14, Provider<CoroutineDispatcher> provider15) {
        return new FinancialConnectionsSheetViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static FinancialConnectionsSheetViewModel newInstance(String str, SavedStateHandle savedStateHandle, GetOrFetchSync getOrFetchSync, IntegrityRequestManager integrityRequestManager, IntegrityVerdictManager integrityVerdictManager, FetchFinancialConnectionsSession fetchFinancialConnectionsSession, FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken, Logger logger, BrowserManager browserManager, FinancialConnectionsEventReporter financialConnectionsEventReporter, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, NativeAuthFlowRouter nativeAuthFlowRouter, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsSheetState financialConnectionsSheetState, CoroutineDispatcher coroutineDispatcher) {
        return new FinancialConnectionsSheetViewModel(str, savedStateHandle, getOrFetchSync, integrityRequestManager, integrityVerdictManager, fetchFinancialConnectionsSession, fetchFinancialConnectionsSessionForToken, logger, browserManager, financialConnectionsEventReporter, financialConnectionsAnalyticsTracker, nativeAuthFlowRouter, nativeAuthFlowCoordinator, financialConnectionsSheetState, coroutineDispatcher);
    }
}
