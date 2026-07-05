package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentsheet.LinkHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedWalletsHelper_Factory implements Factory<DefaultEmbeddedWalletsHelper> {
    private final Provider<LinkHandler> linkHandlerProvider;

    public DefaultEmbeddedWalletsHelper_Factory(Provider<LinkHandler> provider) {
        this.linkHandlerProvider = provider;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedWalletsHelper get() {
        return newInstance(this.linkHandlerProvider.get());
    }

    public static DefaultEmbeddedWalletsHelper_Factory create(javax.inject.Provider<LinkHandler> provider) {
        return new DefaultEmbeddedWalletsHelper_Factory(Providers.asDaggerProvider(provider));
    }

    public static DefaultEmbeddedWalletsHelper_Factory create(Provider<LinkHandler> provider) {
        return new DefaultEmbeddedWalletsHelper_Factory(provider);
    }

    public static DefaultEmbeddedWalletsHelper newInstance(LinkHandler linkHandler) {
        return new DefaultEmbeddedWalletsHelper(linkHandler);
    }
}
