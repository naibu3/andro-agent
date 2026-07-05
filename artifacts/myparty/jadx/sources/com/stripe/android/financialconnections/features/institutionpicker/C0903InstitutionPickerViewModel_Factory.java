package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.domain.SelectInstitution;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0903InstitutionPickerViewModel_Factory {
    private final Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<FeaturedInstitutions> featuredInstitutionsProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<HandleError> handleErrorProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<PostAuthorizationSession> postAuthorizationSessionProvider;
    private final Provider<SearchInstitutions> searchInstitutionsProvider;
    private final Provider<SelectInstitution> selectInstitutionProvider;
    private final Provider<UpdateLocalManifest> updateLocalManifestProvider;

    public C0903InstitutionPickerViewModel_Factory(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<PostAuthorizationSession> provider2, Provider<SelectInstitution> provider3, Provider<GetOrFetchSync> provider4, Provider<SearchInstitutions> provider5, Provider<FeaturedInstitutions> provider6, Provider<FinancialConnectionsAnalyticsTracker> provider7, Provider<HandleError> provider8, Provider<NavigationManager> provider9, Provider<UpdateLocalManifest> provider10, Provider<Logger> provider11, Provider<NativeAuthFlowCoordinator> provider12) {
        this.configurationProvider = provider;
        this.postAuthorizationSessionProvider = provider2;
        this.selectInstitutionProvider = provider3;
        this.getOrFetchSyncProvider = provider4;
        this.searchInstitutionsProvider = provider5;
        this.featuredInstitutionsProvider = provider6;
        this.eventTrackerProvider = provider7;
        this.handleErrorProvider = provider8;
        this.navigationManagerProvider = provider9;
        this.updateLocalManifestProvider = provider10;
        this.loggerProvider = provider11;
        this.nativeAuthFlowCoordinatorProvider = provider12;
    }

    public InstitutionPickerViewModel get(InstitutionPickerState institutionPickerState) {
        return newInstance(this.configurationProvider.get(), this.postAuthorizationSessionProvider.get(), this.selectInstitutionProvider.get(), this.getOrFetchSyncProvider.get(), this.searchInstitutionsProvider.get(), this.featuredInstitutionsProvider.get(), this.eventTrackerProvider.get(), this.handleErrorProvider.get(), this.navigationManagerProvider.get(), this.updateLocalManifestProvider.get(), this.loggerProvider.get(), institutionPickerState, this.nativeAuthFlowCoordinatorProvider.get());
    }

    public static C0903InstitutionPickerViewModel_Factory create(javax.inject.Provider<FinancialConnectionsSheetConfiguration> provider, javax.inject.Provider<PostAuthorizationSession> provider2, javax.inject.Provider<SelectInstitution> provider3, javax.inject.Provider<GetOrFetchSync> provider4, javax.inject.Provider<SearchInstitutions> provider5, javax.inject.Provider<FeaturedInstitutions> provider6, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider7, javax.inject.Provider<HandleError> provider8, javax.inject.Provider<NavigationManager> provider9, javax.inject.Provider<UpdateLocalManifest> provider10, javax.inject.Provider<Logger> provider11, javax.inject.Provider<NativeAuthFlowCoordinator> provider12) {
        return new C0903InstitutionPickerViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12));
    }

    public static C0903InstitutionPickerViewModel_Factory create(Provider<FinancialConnectionsSheetConfiguration> provider, Provider<PostAuthorizationSession> provider2, Provider<SelectInstitution> provider3, Provider<GetOrFetchSync> provider4, Provider<SearchInstitutions> provider5, Provider<FeaturedInstitutions> provider6, Provider<FinancialConnectionsAnalyticsTracker> provider7, Provider<HandleError> provider8, Provider<NavigationManager> provider9, Provider<UpdateLocalManifest> provider10, Provider<Logger> provider11, Provider<NativeAuthFlowCoordinator> provider12) {
        return new C0903InstitutionPickerViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static InstitutionPickerViewModel newInstance(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, PostAuthorizationSession postAuthorizationSession, SelectInstitution selectInstitution, GetOrFetchSync getOrFetchSync, SearchInstitutions searchInstitutions, FeaturedInstitutions featuredInstitutions, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, HandleError handleError, NavigationManager navigationManager, UpdateLocalManifest updateLocalManifest, Logger logger, InstitutionPickerState institutionPickerState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        return new InstitutionPickerViewModel(financialConnectionsSheetConfiguration, postAuthorizationSession, selectInstitution, getOrFetchSync, searchInstitutions, featuredInstitutions, financialConnectionsAnalyticsTracker, handleError, navigationManager, updateLocalManifest, logger, institutionPickerState, nativeAuthFlowCoordinator);
    }
}
