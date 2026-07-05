package com.stripe.android.link.injection;

import com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory implements Factory<LinkConfirmationHandler.Factory> {
    private final Provider<DefaultLinkConfirmationHandler.Factory> factoryProvider;

    public NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory(Provider<DefaultLinkConfirmationHandler.Factory> provider) {
        this.factoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public LinkConfirmationHandler.Factory get() {
        return provideLinkConfirmationHandlerFactory(this.factoryProvider.get());
    }

    public static NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory create(javax.inject.Provider<DefaultLinkConfirmationHandler.Factory> provider) {
        return new NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory(Providers.asDaggerProvider(provider));
    }

    public static NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory create(Provider<DefaultLinkConfirmationHandler.Factory> provider) {
        return new NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory(provider);
    }

    public static LinkConfirmationHandler.Factory provideLinkConfirmationHandlerFactory(DefaultLinkConfirmationHandler.Factory factory) {
        return (LinkConfirmationHandler.Factory) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.provideLinkConfirmationHandlerFactory(factory));
    }
}
