package com.stripe.android.link;

import com.stripe.android.core.Logger;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.injection.LinkComponent;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkControllerInteractor_Factory implements Factory<LinkControllerInteractor> {
    private final Provider<LinkAccountHolder> linkAccountHolderProvider;
    private final Provider<LinkComponent.Builder> linkComponentBuilderProvider;
    private final Provider<LinkConfigurationLoader> linkConfigurationLoaderProvider;
    private final Provider<Logger> loggerProvider;

    public LinkControllerInteractor_Factory(Provider<Logger> provider, Provider<LinkConfigurationLoader> provider2, Provider<LinkAccountHolder> provider3, Provider<LinkComponent.Builder> provider4) {
        this.loggerProvider = provider;
        this.linkConfigurationLoaderProvider = provider2;
        this.linkAccountHolderProvider = provider3;
        this.linkComponentBuilderProvider = provider4;
    }

    @Override // javax.inject.Provider
    public LinkControllerInteractor get() {
        return newInstance(this.loggerProvider.get(), this.linkConfigurationLoaderProvider.get(), this.linkAccountHolderProvider.get(), this.linkComponentBuilderProvider);
    }

    public static LinkControllerInteractor_Factory create(javax.inject.Provider<Logger> provider, javax.inject.Provider<LinkConfigurationLoader> provider2, javax.inject.Provider<LinkAccountHolder> provider3, javax.inject.Provider<LinkComponent.Builder> provider4) {
        return new LinkControllerInteractor_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static LinkControllerInteractor_Factory create(Provider<Logger> provider, Provider<LinkConfigurationLoader> provider2, Provider<LinkAccountHolder> provider3, Provider<LinkComponent.Builder> provider4) {
        return new LinkControllerInteractor_Factory(provider, provider2, provider3, provider4);
    }

    public static LinkControllerInteractor newInstance(Logger logger, LinkConfigurationLoader linkConfigurationLoader, LinkAccountHolder linkAccountHolder, javax.inject.Provider<LinkComponent.Builder> provider) {
        return new LinkControllerInteractor(logger, linkConfigurationLoader, linkAccountHolder, provider);
    }
}
