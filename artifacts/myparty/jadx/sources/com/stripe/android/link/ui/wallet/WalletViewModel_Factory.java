package com.stripe.android.link.ui.wallet;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.CompleteLinkFlow;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class WalletViewModel_Factory implements Factory<WalletViewModel> {
    private final Provider<CompleteLinkFlow> completeLinkFlowProvider;
    private final Provider<LinkConfiguration> configurationProvider;
    private final Provider<Function1<? super LinkActivityResult, Unit>> dismissWithResultProvider;
    private final Provider<LinkDismissalCoordinator> dismissalCoordinatorProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<LinkAccount> linkAccountProvider;
    private final Provider<LinkLaunchMode> linkLaunchModeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Function1<? super LinkScreen, Unit>> navigateAndClearStackProvider;
    private final Provider<NavigationManager> navigationManagerProvider;

    public WalletViewModel_Factory(Provider<LinkConfiguration> provider, Provider<LinkAccount> provider2, Provider<LinkAccountManager> provider3, Provider<CompleteLinkFlow> provider4, Provider<Logger> provider5, Provider<NavigationManager> provider6, Provider<LinkLaunchMode> provider7, Provider<LinkDismissalCoordinator> provider8, Provider<Function1<? super LinkScreen, Unit>> provider9, Provider<Function1<? super LinkActivityResult, Unit>> provider10) {
        this.configurationProvider = provider;
        this.linkAccountProvider = provider2;
        this.linkAccountManagerProvider = provider3;
        this.completeLinkFlowProvider = provider4;
        this.loggerProvider = provider5;
        this.navigationManagerProvider = provider6;
        this.linkLaunchModeProvider = provider7;
        this.dismissalCoordinatorProvider = provider8;
        this.navigateAndClearStackProvider = provider9;
        this.dismissWithResultProvider = provider10;
    }

    @Override // javax.inject.Provider
    public WalletViewModel get() {
        return newInstance(this.configurationProvider.get(), this.linkAccountProvider.get(), this.linkAccountManagerProvider.get(), this.completeLinkFlowProvider.get(), this.loggerProvider.get(), this.navigationManagerProvider.get(), this.linkLaunchModeProvider.get(), this.dismissalCoordinatorProvider.get(), this.navigateAndClearStackProvider.get(), this.dismissWithResultProvider.get());
    }

    public static WalletViewModel_Factory create(javax.inject.Provider<LinkConfiguration> provider, javax.inject.Provider<LinkAccount> provider2, javax.inject.Provider<LinkAccountManager> provider3, javax.inject.Provider<CompleteLinkFlow> provider4, javax.inject.Provider<Logger> provider5, javax.inject.Provider<NavigationManager> provider6, javax.inject.Provider<LinkLaunchMode> provider7, javax.inject.Provider<LinkDismissalCoordinator> provider8, javax.inject.Provider<Function1<? super LinkScreen, Unit>> provider9, javax.inject.Provider<Function1<? super LinkActivityResult, Unit>> provider10) {
        return new WalletViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10));
    }

    public static WalletViewModel_Factory create(Provider<LinkConfiguration> provider, Provider<LinkAccount> provider2, Provider<LinkAccountManager> provider3, Provider<CompleteLinkFlow> provider4, Provider<Logger> provider5, Provider<NavigationManager> provider6, Provider<LinkLaunchMode> provider7, Provider<LinkDismissalCoordinator> provider8, Provider<Function1<? super LinkScreen, Unit>> provider9, Provider<Function1<? super LinkActivityResult, Unit>> provider10) {
        return new WalletViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static WalletViewModel newInstance(LinkConfiguration linkConfiguration, LinkAccount linkAccount, LinkAccountManager linkAccountManager, CompleteLinkFlow completeLinkFlow, Logger logger, NavigationManager navigationManager, LinkLaunchMode linkLaunchMode, LinkDismissalCoordinator linkDismissalCoordinator, Function1<? super LinkScreen, Unit> function1, Function1<? super LinkActivityResult, Unit> function12) {
        return new WalletViewModel(linkConfiguration, linkAccount, linkAccountManager, completeLinkFlow, logger, navigationManager, linkLaunchMode, linkDismissalCoordinator, function1, function12);
    }
}
