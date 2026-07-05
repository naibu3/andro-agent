package com.stripe.android.link;

import com.stripe.android.link.injection.LinkControllerPresenterComponent;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkController_Factory implements Factory<LinkController> {
    private final Provider<LinkControllerInteractor> interactorProvider;
    private final Provider<LinkControllerPresenterComponent.Factory> presenterComponentFactoryProvider;

    public LinkController_Factory(Provider<LinkControllerInteractor> provider, Provider<LinkControllerPresenterComponent.Factory> provider2) {
        this.interactorProvider = provider;
        this.presenterComponentFactoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public LinkController get() {
        return newInstance(this.interactorProvider.get(), this.presenterComponentFactoryProvider.get());
    }

    public static LinkController_Factory create(javax.inject.Provider<LinkControllerInteractor> provider, javax.inject.Provider<LinkControllerPresenterComponent.Factory> provider2) {
        return new LinkController_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static LinkController_Factory create(Provider<LinkControllerInteractor> provider, Provider<LinkControllerPresenterComponent.Factory> provider2) {
        return new LinkController_Factory(provider, provider2);
    }

    public static LinkController newInstance(LinkControllerInteractor linkControllerInteractor, LinkControllerPresenterComponent.Factory factory) {
        return new LinkController(linkControllerInteractor, factory);
    }
}
