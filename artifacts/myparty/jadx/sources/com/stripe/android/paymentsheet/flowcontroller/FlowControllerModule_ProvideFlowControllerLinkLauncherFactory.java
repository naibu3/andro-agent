package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.injection.LinkAnalyticsComponent;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class FlowControllerModule_ProvideFlowControllerLinkLauncherFactory implements Factory<LinkPaymentLauncher> {
    private final Provider<String> identifierProvider;
    private final Provider<LinkActivityContract> linkActivityContractProvider;
    private final Provider<LinkAnalyticsComponent.Builder> linkAnalyticsComponentBuilderProvider;
    private final Provider<LinkStore> linkStoreProvider;

    public FlowControllerModule_ProvideFlowControllerLinkLauncherFactory(Provider<LinkAnalyticsComponent.Builder> provider, Provider<LinkActivityContract> provider2, Provider<String> provider3, Provider<LinkStore> provider4) {
        this.linkAnalyticsComponentBuilderProvider = provider;
        this.linkActivityContractProvider = provider2;
        this.identifierProvider = provider3;
        this.linkStoreProvider = provider4;
    }

    @Override // javax.inject.Provider
    public LinkPaymentLauncher get() {
        return provideFlowControllerLinkLauncher(this.linkAnalyticsComponentBuilderProvider.get(), this.linkActivityContractProvider.get(), this.identifierProvider.get(), this.linkStoreProvider.get());
    }

    public static FlowControllerModule_ProvideFlowControllerLinkLauncherFactory create(javax.inject.Provider<LinkAnalyticsComponent.Builder> provider, javax.inject.Provider<LinkActivityContract> provider2, javax.inject.Provider<String> provider3, javax.inject.Provider<LinkStore> provider4) {
        return new FlowControllerModule_ProvideFlowControllerLinkLauncherFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static FlowControllerModule_ProvideFlowControllerLinkLauncherFactory create(Provider<LinkAnalyticsComponent.Builder> provider, Provider<LinkActivityContract> provider2, Provider<String> provider3, Provider<LinkStore> provider4) {
        return new FlowControllerModule_ProvideFlowControllerLinkLauncherFactory(provider, provider2, provider3, provider4);
    }

    public static LinkPaymentLauncher provideFlowControllerLinkLauncher(LinkAnalyticsComponent.Builder builder, LinkActivityContract linkActivityContract, String str, LinkStore linkStore) {
        return (LinkPaymentLauncher) Preconditions.checkNotNullFromProvides(FlowControllerModule.INSTANCE.provideFlowControllerLinkLauncher(builder, linkActivityContract, str, linkStore));
    }
}
