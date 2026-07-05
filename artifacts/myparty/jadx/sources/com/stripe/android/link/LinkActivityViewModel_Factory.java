package com.stripe.android.link;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivityLauncher;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkActivityViewModel_Factory implements Factory<LinkActivityViewModel> {
    private final Provider<NativeLinkComponent> activityRetainedComponentProvider;
    private final Provider<AutocompleteActivityLauncher> autocompleteLauncherProvider;
    private final Provider<ConfirmationHandler.Factory> confirmationHandlerFactoryProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<LinkAccountHolder> linkAccountHolderProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<LinkAttestationCheck> linkAttestationCheckProvider;
    private final Provider<LinkConfiguration> linkConfigurationProvider;
    private final Provider<LinkConfirmationHandler.Factory> linkConfirmationHandlerFactoryProvider;
    private final Provider<LinkExpressMode> linkExpressModeProvider;
    private final Provider<LinkLaunchMode> linkLaunchModeProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public LinkActivityViewModel_Factory(Provider<NativeLinkComponent> provider, Provider<ConfirmationHandler.Factory> provider2, Provider<LinkConfirmationHandler.Factory> provider3, Provider<LinkAccountManager> provider4, Provider<LinkAccountHolder> provider5, Provider<EventReporter> provider6, Provider<LinkConfiguration> provider7, Provider<LinkAttestationCheck> provider8, Provider<SavedStateHandle> provider9, Provider<LinkExpressMode> provider10, Provider<NavigationManager> provider11, Provider<LinkLaunchMode> provider12, Provider<AutocompleteActivityLauncher> provider13) {
        this.activityRetainedComponentProvider = provider;
        this.confirmationHandlerFactoryProvider = provider2;
        this.linkConfirmationHandlerFactoryProvider = provider3;
        this.linkAccountManagerProvider = provider4;
        this.linkAccountHolderProvider = provider5;
        this.eventReporterProvider = provider6;
        this.linkConfigurationProvider = provider7;
        this.linkAttestationCheckProvider = provider8;
        this.savedStateHandleProvider = provider9;
        this.linkExpressModeProvider = provider10;
        this.navigationManagerProvider = provider11;
        this.linkLaunchModeProvider = provider12;
        this.autocompleteLauncherProvider = provider13;
    }

    @Override // javax.inject.Provider
    public LinkActivityViewModel get() {
        return newInstance(this.activityRetainedComponentProvider.get(), this.confirmationHandlerFactoryProvider.get(), this.linkConfirmationHandlerFactoryProvider.get(), this.linkAccountManagerProvider.get(), this.linkAccountHolderProvider.get(), this.eventReporterProvider.get(), this.linkConfigurationProvider.get(), this.linkAttestationCheckProvider.get(), this.savedStateHandleProvider.get(), this.linkExpressModeProvider.get(), this.navigationManagerProvider.get(), this.linkLaunchModeProvider.get(), this.autocompleteLauncherProvider.get());
    }

    public static LinkActivityViewModel_Factory create(javax.inject.Provider<NativeLinkComponent> provider, javax.inject.Provider<ConfirmationHandler.Factory> provider2, javax.inject.Provider<LinkConfirmationHandler.Factory> provider3, javax.inject.Provider<LinkAccountManager> provider4, javax.inject.Provider<LinkAccountHolder> provider5, javax.inject.Provider<EventReporter> provider6, javax.inject.Provider<LinkConfiguration> provider7, javax.inject.Provider<LinkAttestationCheck> provider8, javax.inject.Provider<SavedStateHandle> provider9, javax.inject.Provider<LinkExpressMode> provider10, javax.inject.Provider<NavigationManager> provider11, javax.inject.Provider<LinkLaunchMode> provider12, javax.inject.Provider<AutocompleteActivityLauncher> provider13) {
        return new LinkActivityViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13));
    }

    public static LinkActivityViewModel_Factory create(Provider<NativeLinkComponent> provider, Provider<ConfirmationHandler.Factory> provider2, Provider<LinkConfirmationHandler.Factory> provider3, Provider<LinkAccountManager> provider4, Provider<LinkAccountHolder> provider5, Provider<EventReporter> provider6, Provider<LinkConfiguration> provider7, Provider<LinkAttestationCheck> provider8, Provider<SavedStateHandle> provider9, Provider<LinkExpressMode> provider10, Provider<NavigationManager> provider11, Provider<LinkLaunchMode> provider12, Provider<AutocompleteActivityLauncher> provider13) {
        return new LinkActivityViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static LinkActivityViewModel newInstance(NativeLinkComponent nativeLinkComponent, ConfirmationHandler.Factory factory, LinkConfirmationHandler.Factory factory2, LinkAccountManager linkAccountManager, LinkAccountHolder linkAccountHolder, EventReporter eventReporter, LinkConfiguration linkConfiguration, LinkAttestationCheck linkAttestationCheck, SavedStateHandle savedStateHandle, LinkExpressMode linkExpressMode, NavigationManager navigationManager, LinkLaunchMode linkLaunchMode, AutocompleteActivityLauncher autocompleteActivityLauncher) {
        return new LinkActivityViewModel(nativeLinkComponent, factory, factory2, linkAccountManager, linkAccountHolder, eventReporter, linkConfiguration, linkAttestationCheck, savedStateHandle, linkExpressMode, navigationManager, linkLaunchMode, autocompleteActivityLauncher);
    }
}
