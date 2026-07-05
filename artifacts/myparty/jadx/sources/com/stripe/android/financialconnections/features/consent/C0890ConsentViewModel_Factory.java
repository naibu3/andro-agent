package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0890ConsentViewModel_Factory {
    private final Provider<AcceptConsent> acceptConsentProvider;
    private final Provider<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Provider<GetOrFetchSync> getOrFetchSyncProvider;
    private final Provider<HandleClickableUrl> handleClickableUrlProvider;
    private final Provider<IsLinkWithStripe> isLinkWithStripeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<LookupAccount> lookupAccountProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<ElementsSessionContext.PrefillDetails> prefillDetailsProvider;
    private final Provider<PresentSheet> presentSheetProvider;

    public C0890ConsentViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<AcceptConsent> provider2, Provider<GetOrFetchSync> provider3, Provider<NavigationManager> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<HandleClickableUrl> provider6, Provider<Logger> provider7, Provider<PresentSheet> provider8, Provider<LookupAccount> provider9, Provider<IsLinkWithStripe> provider10, Provider<ElementsSessionContext.PrefillDetails> provider11) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.acceptConsentProvider = provider2;
        this.getOrFetchSyncProvider = provider3;
        this.navigationManagerProvider = provider4;
        this.eventTrackerProvider = provider5;
        this.handleClickableUrlProvider = provider6;
        this.loggerProvider = provider7;
        this.presentSheetProvider = provider8;
        this.lookupAccountProvider = provider9;
        this.isLinkWithStripeProvider = provider10;
        this.prefillDetailsProvider = provider11;
    }

    public ConsentViewModel get(ConsentState consentState) {
        return newInstance(consentState, this.nativeAuthFlowCoordinatorProvider.get(), this.acceptConsentProvider.get(), this.getOrFetchSyncProvider.get(), this.navigationManagerProvider.get(), this.eventTrackerProvider.get(), this.handleClickableUrlProvider.get(), this.loggerProvider.get(), this.presentSheetProvider.get(), this.lookupAccountProvider.get(), this.isLinkWithStripeProvider.get(), this.prefillDetailsProvider.get());
    }

    public static C0890ConsentViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<AcceptConsent> provider2, javax.inject.Provider<GetOrFetchSync> provider3, javax.inject.Provider<NavigationManager> provider4, javax.inject.Provider<FinancialConnectionsAnalyticsTracker> provider5, javax.inject.Provider<HandleClickableUrl> provider6, javax.inject.Provider<Logger> provider7, javax.inject.Provider<PresentSheet> provider8, javax.inject.Provider<LookupAccount> provider9, javax.inject.Provider<IsLinkWithStripe> provider10, javax.inject.Provider<ElementsSessionContext.PrefillDetails> provider11) {
        return new C0890ConsentViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11));
    }

    public static C0890ConsentViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<AcceptConsent> provider2, Provider<GetOrFetchSync> provider3, Provider<NavigationManager> provider4, Provider<FinancialConnectionsAnalyticsTracker> provider5, Provider<HandleClickableUrl> provider6, Provider<Logger> provider7, Provider<PresentSheet> provider8, Provider<LookupAccount> provider9, Provider<IsLinkWithStripe> provider10, Provider<ElementsSessionContext.PrefillDetails> provider11) {
        return new C0890ConsentViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static ConsentViewModel newInstance(ConsentState consentState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, AcceptConsent acceptConsent, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, HandleClickableUrl handleClickableUrl, Logger logger, PresentSheet presentSheet, LookupAccount lookupAccount, IsLinkWithStripe isLinkWithStripe, ElementsSessionContext.PrefillDetails prefillDetails) {
        return new ConsentViewModel(consentState, nativeAuthFlowCoordinator, acceptConsent, getOrFetchSync, navigationManager, financialConnectionsAnalyticsTracker, handleClickableUrl, logger, presentSheet, lookupAccount, isLinkWithStripe, prefillDetails);
    }
}
