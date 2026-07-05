package com.stripe.android.link.ui.updatecard;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.CompleteLinkFlow;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class UpdateCardScreenViewModel_Factory implements Factory<UpdateCardScreenViewModel> {
    private final Provider<LinkScreen.UpdateCard.BillingDetailsUpdateFlow> billingDetailsUpdateFlowProvider;
    private final Provider<CompleteLinkFlow> completeLinkFlowProvider;
    private final Provider<LinkConfiguration> configurationProvider;
    private final Provider<Function1<? super LinkActivityResult, Unit>> dismissWithResultProvider;
    private final Provider<LinkDismissalCoordinator> dismissalCoordinatorProvider;
    private final Provider<LinkAccountManager> linkAccountManagerProvider;
    private final Provider<LinkLaunchMode> linkLaunchModeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<String> paymentDetailsIdProvider;

    public UpdateCardScreenViewModel_Factory(Provider<Logger> provider, Provider<LinkAccountManager> provider2, Provider<NavigationManager> provider3, Provider<LinkDismissalCoordinator> provider4, Provider<LinkConfiguration> provider5, Provider<LinkLaunchMode> provider6, Provider<CompleteLinkFlow> provider7, Provider<Function1<? super LinkActivityResult, Unit>> provider8, Provider<String> provider9, Provider<LinkScreen.UpdateCard.BillingDetailsUpdateFlow> provider10) {
        this.loggerProvider = provider;
        this.linkAccountManagerProvider = provider2;
        this.navigationManagerProvider = provider3;
        this.dismissalCoordinatorProvider = provider4;
        this.configurationProvider = provider5;
        this.linkLaunchModeProvider = provider6;
        this.completeLinkFlowProvider = provider7;
        this.dismissWithResultProvider = provider8;
        this.paymentDetailsIdProvider = provider9;
        this.billingDetailsUpdateFlowProvider = provider10;
    }

    @Override // javax.inject.Provider
    public UpdateCardScreenViewModel get() {
        return newInstance(this.loggerProvider.get(), this.linkAccountManagerProvider.get(), this.navigationManagerProvider.get(), this.dismissalCoordinatorProvider.get(), this.configurationProvider.get(), this.linkLaunchModeProvider.get(), this.completeLinkFlowProvider.get(), this.dismissWithResultProvider.get(), this.paymentDetailsIdProvider.get(), this.billingDetailsUpdateFlowProvider.get());
    }

    public static UpdateCardScreenViewModel_Factory create(javax.inject.Provider<Logger> provider, javax.inject.Provider<LinkAccountManager> provider2, javax.inject.Provider<NavigationManager> provider3, javax.inject.Provider<LinkDismissalCoordinator> provider4, javax.inject.Provider<LinkConfiguration> provider5, javax.inject.Provider<LinkLaunchMode> provider6, javax.inject.Provider<CompleteLinkFlow> provider7, javax.inject.Provider<Function1<? super LinkActivityResult, Unit>> provider8, javax.inject.Provider<String> provider9, javax.inject.Provider<LinkScreen.UpdateCard.BillingDetailsUpdateFlow> provider10) {
        return new UpdateCardScreenViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10));
    }

    public static UpdateCardScreenViewModel_Factory create(Provider<Logger> provider, Provider<LinkAccountManager> provider2, Provider<NavigationManager> provider3, Provider<LinkDismissalCoordinator> provider4, Provider<LinkConfiguration> provider5, Provider<LinkLaunchMode> provider6, Provider<CompleteLinkFlow> provider7, Provider<Function1<? super LinkActivityResult, Unit>> provider8, Provider<String> provider9, Provider<LinkScreen.UpdateCard.BillingDetailsUpdateFlow> provider10) {
        return new UpdateCardScreenViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static UpdateCardScreenViewModel newInstance(Logger logger, LinkAccountManager linkAccountManager, NavigationManager navigationManager, LinkDismissalCoordinator linkDismissalCoordinator, LinkConfiguration linkConfiguration, LinkLaunchMode linkLaunchMode, CompleteLinkFlow completeLinkFlow, Function1<? super LinkActivityResult, Unit> function1, String str, LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow) {
        return new UpdateCardScreenViewModel(logger, linkAccountManager, navigationManager, linkDismissalCoordinator, linkConfiguration, linkLaunchMode, completeLinkFlow, function1, str, billingDetailsUpdateFlow);
    }
}
