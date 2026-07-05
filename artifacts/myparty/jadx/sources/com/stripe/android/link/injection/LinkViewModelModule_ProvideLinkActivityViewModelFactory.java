package com.stripe.android.link.injection;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler;
import com.stripe.android.paymentsheet.addresselement.DefaultAutocompleteLauncher;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkViewModelModule_ProvideLinkActivityViewModelFactory implements Factory<LinkActivityViewModel> {
    private final Provider<DefaultAutocompleteLauncher> autocompleteLauncherProvider;
    private final Provider<NativeLinkComponent> componentProvider;
    private final Provider<DefaultConfirmationHandler.Factory> defaultConfirmationHandlerFactoryProvider;
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

    public LinkViewModelModule_ProvideLinkActivityViewModelFactory(Provider<NativeLinkComponent> provider, Provider<DefaultConfirmationHandler.Factory> provider2, Provider<LinkAccountManager> provider3, Provider<LinkAccountHolder> provider4, Provider<EventReporter> provider5, Provider<LinkConfiguration> provider6, Provider<LinkAttestationCheck> provider7, Provider<LinkConfirmationHandler.Factory> provider8, Provider<NavigationManager> provider9, Provider<SavedStateHandle> provider10, Provider<LinkLaunchMode> provider11, Provider<DefaultAutocompleteLauncher> provider12, Provider<LinkExpressMode> provider13) {
        this.componentProvider = provider;
        this.defaultConfirmationHandlerFactoryProvider = provider2;
        this.linkAccountManagerProvider = provider3;
        this.linkAccountHolderProvider = provider4;
        this.eventReporterProvider = provider5;
        this.linkConfigurationProvider = provider6;
        this.linkAttestationCheckProvider = provider7;
        this.linkConfirmationHandlerFactoryProvider = provider8;
        this.navigationManagerProvider = provider9;
        this.savedStateHandleProvider = provider10;
        this.linkLaunchModeProvider = provider11;
        this.autocompleteLauncherProvider = provider12;
        this.linkExpressModeProvider = provider13;
    }

    @Override // javax.inject.Provider
    public LinkActivityViewModel get() {
        return provideLinkActivityViewModel(this.componentProvider.get(), this.defaultConfirmationHandlerFactoryProvider.get(), this.linkAccountManagerProvider.get(), this.linkAccountHolderProvider.get(), this.eventReporterProvider.get(), this.linkConfigurationProvider.get(), this.linkAttestationCheckProvider.get(), this.linkConfirmationHandlerFactoryProvider.get(), this.navigationManagerProvider.get(), this.savedStateHandleProvider.get(), this.linkLaunchModeProvider.get(), this.autocompleteLauncherProvider.get(), this.linkExpressModeProvider.get());
    }

    public static LinkViewModelModule_ProvideLinkActivityViewModelFactory create(javax.inject.Provider<NativeLinkComponent> provider, javax.inject.Provider<DefaultConfirmationHandler.Factory> provider2, javax.inject.Provider<LinkAccountManager> provider3, javax.inject.Provider<LinkAccountHolder> provider4, javax.inject.Provider<EventReporter> provider5, javax.inject.Provider<LinkConfiguration> provider6, javax.inject.Provider<LinkAttestationCheck> provider7, javax.inject.Provider<LinkConfirmationHandler.Factory> provider8, javax.inject.Provider<NavigationManager> provider9, javax.inject.Provider<SavedStateHandle> provider10, javax.inject.Provider<LinkLaunchMode> provider11, javax.inject.Provider<DefaultAutocompleteLauncher> provider12, javax.inject.Provider<LinkExpressMode> provider13) {
        return new LinkViewModelModule_ProvideLinkActivityViewModelFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13));
    }

    public static LinkViewModelModule_ProvideLinkActivityViewModelFactory create(Provider<NativeLinkComponent> provider, Provider<DefaultConfirmationHandler.Factory> provider2, Provider<LinkAccountManager> provider3, Provider<LinkAccountHolder> provider4, Provider<EventReporter> provider5, Provider<LinkConfiguration> provider6, Provider<LinkAttestationCheck> provider7, Provider<LinkConfirmationHandler.Factory> provider8, Provider<NavigationManager> provider9, Provider<SavedStateHandle> provider10, Provider<LinkLaunchMode> provider11, Provider<DefaultAutocompleteLauncher> provider12, Provider<LinkExpressMode> provider13) {
        return new LinkViewModelModule_ProvideLinkActivityViewModelFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static LinkActivityViewModel provideLinkActivityViewModel(NativeLinkComponent nativeLinkComponent, DefaultConfirmationHandler.Factory factory, LinkAccountManager linkAccountManager, LinkAccountHolder linkAccountHolder, EventReporter eventReporter, LinkConfiguration linkConfiguration, LinkAttestationCheck linkAttestationCheck, LinkConfirmationHandler.Factory factory2, NavigationManager navigationManager, SavedStateHandle savedStateHandle, LinkLaunchMode linkLaunchMode, DefaultAutocompleteLauncher defaultAutocompleteLauncher, LinkExpressMode linkExpressMode) {
        return (LinkActivityViewModel) Preconditions.checkNotNullFromProvides(LinkViewModelModule.INSTANCE.provideLinkActivityViewModel(nativeLinkComponent, factory, linkAccountManager, linkAccountHolder, eventReporter, linkConfiguration, linkAttestationCheck, factory2, navigationManager, savedStateHandle, linkLaunchMode, defaultAutocompleteLauncher, linkExpressMode));
    }
}
