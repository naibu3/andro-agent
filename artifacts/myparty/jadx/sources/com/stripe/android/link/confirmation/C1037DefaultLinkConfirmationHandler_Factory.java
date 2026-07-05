package com.stripe.android.link.confirmation;

import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1037DefaultLinkConfirmationHandler_Factory implements Factory<DefaultLinkConfirmationHandler> {
    private final Provider<LinkConfiguration> configurationProvider;
    private final Provider<ConfirmationHandler> confirmationHandlerProvider;
    private final Provider<Logger> loggerProvider;

    public C1037DefaultLinkConfirmationHandler_Factory(Provider<LinkConfiguration> provider, Provider<Logger> provider2, Provider<ConfirmationHandler> provider3) {
        this.configurationProvider = provider;
        this.loggerProvider = provider2;
        this.confirmationHandlerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public DefaultLinkConfirmationHandler get() {
        return newInstance(this.configurationProvider.get(), this.loggerProvider.get(), this.confirmationHandlerProvider.get());
    }

    public static C1037DefaultLinkConfirmationHandler_Factory create(javax.inject.Provider<LinkConfiguration> provider, javax.inject.Provider<Logger> provider2, javax.inject.Provider<ConfirmationHandler> provider3) {
        return new C1037DefaultLinkConfirmationHandler_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static C1037DefaultLinkConfirmationHandler_Factory create(Provider<LinkConfiguration> provider, Provider<Logger> provider2, Provider<ConfirmationHandler> provider3) {
        return new C1037DefaultLinkConfirmationHandler_Factory(provider, provider2, provider3);
    }

    public static DefaultLinkConfirmationHandler newInstance(LinkConfiguration linkConfiguration, Logger logger, ConfirmationHandler confirmationHandler) {
        return new DefaultLinkConfirmationHandler(linkConfiguration, logger, confirmationHandler);
    }
}
