package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentsheet.LinkHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedLinkHelper_Factory implements Factory<DefaultEmbeddedLinkHelper> {
    private final Provider<LinkHandler> linkHandlerProvider;

    public DefaultEmbeddedLinkHelper_Factory(Provider<LinkHandler> provider) {
        this.linkHandlerProvider = provider;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedLinkHelper get() {
        return newInstance(this.linkHandlerProvider.get());
    }

    public static DefaultEmbeddedLinkHelper_Factory create(javax.inject.Provider<LinkHandler> provider) {
        return new DefaultEmbeddedLinkHelper_Factory(Providers.asDaggerProvider(provider));
    }

    public static DefaultEmbeddedLinkHelper_Factory create(Provider<LinkHandler> provider) {
        return new DefaultEmbeddedLinkHelper_Factory(provider);
    }

    public static DefaultEmbeddedLinkHelper newInstance(LinkHandler linkHandler) {
        return new DefaultEmbeddedLinkHelper(linkHandler);
    }
}
