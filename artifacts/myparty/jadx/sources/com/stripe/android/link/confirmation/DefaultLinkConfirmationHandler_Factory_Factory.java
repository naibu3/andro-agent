package com.stripe.android.link.confirmation;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultLinkConfirmationHandler_Factory_Factory implements Factory<DefaultLinkConfirmationHandler.Factory> {
    private final Provider<LinkConfiguration> configurationProvider;
    private final Provider<Logger> loggerProvider;

    public DefaultLinkConfirmationHandler_Factory_Factory(Provider<LinkConfiguration> provider, Provider<Logger> provider2) {
        this.configurationProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public DefaultLinkConfirmationHandler.Factory get() {
        return newInstance(this.configurationProvider.get(), this.loggerProvider.get());
    }

    public static DefaultLinkConfirmationHandler_Factory_Factory create(javax.inject.Provider<LinkConfiguration> provider, javax.inject.Provider<Logger> provider2) {
        return new DefaultLinkConfirmationHandler_Factory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static DefaultLinkConfirmationHandler_Factory_Factory create(Provider<LinkConfiguration> provider, Provider<Logger> provider2) {
        return new DefaultLinkConfirmationHandler_Factory_Factory(provider, provider2);
    }

    public static DefaultLinkConfirmationHandler.Factory newInstance(LinkConfiguration linkConfiguration, Logger logger) {
        return new DefaultLinkConfirmationHandler.Factory(linkConfiguration, logger);
    }
}
