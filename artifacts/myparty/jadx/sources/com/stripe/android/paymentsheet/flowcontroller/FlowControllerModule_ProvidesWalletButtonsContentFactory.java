package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.paymentsheet.ui.WalletButtonsContent;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class FlowControllerModule_ProvidesWalletButtonsContentFactory implements Factory<WalletButtonsContent> {
    private final Provider<FlowControllerViewModel> viewModelProvider;
    private final Provider<LinkPaymentLauncher> walletsButtonLinkLauncherProvider;

    public FlowControllerModule_ProvidesWalletButtonsContentFactory(Provider<FlowControllerViewModel> provider, Provider<LinkPaymentLauncher> provider2) {
        this.viewModelProvider = provider;
        this.walletsButtonLinkLauncherProvider = provider2;
    }

    @Override // javax.inject.Provider
    public WalletButtonsContent get() {
        return providesWalletButtonsContent(this.viewModelProvider.get(), this.walletsButtonLinkLauncherProvider.get());
    }

    public static FlowControllerModule_ProvidesWalletButtonsContentFactory create(javax.inject.Provider<FlowControllerViewModel> provider, javax.inject.Provider<LinkPaymentLauncher> provider2) {
        return new FlowControllerModule_ProvidesWalletButtonsContentFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static FlowControllerModule_ProvidesWalletButtonsContentFactory create(Provider<FlowControllerViewModel> provider, Provider<LinkPaymentLauncher> provider2) {
        return new FlowControllerModule_ProvidesWalletButtonsContentFactory(provider, provider2);
    }

    public static WalletButtonsContent providesWalletButtonsContent(FlowControllerViewModel flowControllerViewModel, LinkPaymentLauncher linkPaymentLauncher) {
        return (WalletButtonsContent) Preconditions.checkNotNullFromProvides(FlowControllerModule.INSTANCE.providesWalletButtonsContent(flowControllerViewModel, linkPaymentLauncher));
    }
}
