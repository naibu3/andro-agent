package com.stripe.android.link;

import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.injection.LinkAnalyticsComponent;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkPaymentLauncher_Factory implements Factory<LinkPaymentLauncher> {
    private final Provider<LinkActivityContract> linkActivityContractProvider;
    private final Provider<LinkAnalyticsComponent.Builder> linkAnalyticsComponentBuilderProvider;
    private final Provider<LinkStore> linkStoreProvider;
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public LinkPaymentLauncher_Factory(Provider<LinkAnalyticsComponent.Builder> provider, Provider<String> provider2, Provider<LinkActivityContract> provider3, Provider<LinkStore> provider4) {
        this.linkAnalyticsComponentBuilderProvider = provider;
        this.paymentElementCallbackIdentifierProvider = provider2;
        this.linkActivityContractProvider = provider3;
        this.linkStoreProvider = provider4;
    }

    @Override // javax.inject.Provider
    public LinkPaymentLauncher get() {
        return newInstance(this.linkAnalyticsComponentBuilderProvider.get(), this.paymentElementCallbackIdentifierProvider.get(), this.linkActivityContractProvider.get(), this.linkStoreProvider.get());
    }

    public static LinkPaymentLauncher_Factory create(javax.inject.Provider<LinkAnalyticsComponent.Builder> provider, javax.inject.Provider<String> provider2, javax.inject.Provider<LinkActivityContract> provider3, javax.inject.Provider<LinkStore> provider4) {
        return new LinkPaymentLauncher_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static LinkPaymentLauncher_Factory create(Provider<LinkAnalyticsComponent.Builder> provider, Provider<String> provider2, Provider<LinkActivityContract> provider3, Provider<LinkStore> provider4) {
        return new LinkPaymentLauncher_Factory(provider, provider2, provider3, provider4);
    }

    public static LinkPaymentLauncher newInstance(LinkAnalyticsComponent.Builder builder, String str, LinkActivityContract linkActivityContract, LinkStore linkStore) {
        return new LinkPaymentLauncher(builder, str, linkActivityContract, linkStore);
    }
}
