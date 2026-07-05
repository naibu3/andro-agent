package com.stripe.android.link;

import com.stripe.android.link.gate.LinkGate;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkActivityContract_Factory implements Factory<LinkActivityContract> {
    private final Provider<LinkGate.Factory> linkGateFactoryProvider;
    private final Provider<NativeLinkActivityContract> nativeLinkActivityContractProvider;
    private final Provider<WebLinkActivityContract> webLinkActivityContractProvider;

    public LinkActivityContract_Factory(Provider<NativeLinkActivityContract> provider, Provider<WebLinkActivityContract> provider2, Provider<LinkGate.Factory> provider3) {
        this.nativeLinkActivityContractProvider = provider;
        this.webLinkActivityContractProvider = provider2;
        this.linkGateFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public LinkActivityContract get() {
        return newInstance(this.nativeLinkActivityContractProvider.get(), this.webLinkActivityContractProvider.get(), this.linkGateFactoryProvider.get());
    }

    public static LinkActivityContract_Factory create(javax.inject.Provider<NativeLinkActivityContract> provider, javax.inject.Provider<WebLinkActivityContract> provider2, javax.inject.Provider<LinkGate.Factory> provider3) {
        return new LinkActivityContract_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static LinkActivityContract_Factory create(Provider<NativeLinkActivityContract> provider, Provider<WebLinkActivityContract> provider2, Provider<LinkGate.Factory> provider3) {
        return new LinkActivityContract_Factory(provider, provider2, provider3);
    }

    public static LinkActivityContract newInstance(NativeLinkActivityContract nativeLinkActivityContract, WebLinkActivityContract webLinkActivityContract, LinkGate.Factory factory) {
        return new LinkActivityContract(nativeLinkActivityContract, webLinkActivityContract, factory);
    }
}
