package com.stripe.android.paymentelement.confirmation.link;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkStore;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkConfirmationDefinition_Factory implements Factory<LinkConfirmationDefinition> {
    private final Provider<LinkAccountHolder> linkAccountHolderProvider;
    private final Provider<LinkPaymentLauncher> linkPaymentLauncherProvider;
    private final Provider<LinkStore> linkStoreProvider;

    public LinkConfirmationDefinition_Factory(Provider<LinkPaymentLauncher> provider, Provider<LinkStore> provider2, Provider<LinkAccountHolder> provider3) {
        this.linkPaymentLauncherProvider = provider;
        this.linkStoreProvider = provider2;
        this.linkAccountHolderProvider = provider3;
    }

    @Override // javax.inject.Provider
    public LinkConfirmationDefinition get() {
        return newInstance(this.linkPaymentLauncherProvider.get(), this.linkStoreProvider.get(), this.linkAccountHolderProvider.get());
    }

    public static LinkConfirmationDefinition_Factory create(javax.inject.Provider<LinkPaymentLauncher> provider, javax.inject.Provider<LinkStore> provider2, javax.inject.Provider<LinkAccountHolder> provider3) {
        return new LinkConfirmationDefinition_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static LinkConfirmationDefinition_Factory create(Provider<LinkPaymentLauncher> provider, Provider<LinkStore> provider2, Provider<LinkAccountHolder> provider3) {
        return new LinkConfirmationDefinition_Factory(provider, provider2, provider3);
    }

    public static LinkConfirmationDefinition newInstance(LinkPaymentLauncher linkPaymentLauncher, LinkStore linkStore, LinkAccountHolder linkAccountHolder) {
        return new LinkConfirmationDefinition(linkPaymentLauncher, linkStore, linkAccountHolder);
    }
}
