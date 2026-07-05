package com.stripe.android.link;

import com.stripe.android.link.LinkController;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkController_Presenter_Factory implements Factory<LinkController.Presenter> {
    private final Provider<LinkControllerCoordinator> coordinatorProvider;
    private final Provider<LinkControllerInteractor> interactorProvider;

    public LinkController_Presenter_Factory(Provider<LinkControllerCoordinator> provider, Provider<LinkControllerInteractor> provider2) {
        this.coordinatorProvider = provider;
        this.interactorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public LinkController.Presenter get() {
        return newInstance(this.coordinatorProvider.get(), this.interactorProvider.get());
    }

    public static LinkController_Presenter_Factory create(javax.inject.Provider<LinkControllerCoordinator> provider, javax.inject.Provider<LinkControllerInteractor> provider2) {
        return new LinkController_Presenter_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static LinkController_Presenter_Factory create(Provider<LinkControllerCoordinator> provider, Provider<LinkControllerInteractor> provider2) {
        return new LinkController_Presenter_Factory(provider, provider2);
    }

    public static LinkController.Presenter newInstance(LinkControllerCoordinator linkControllerCoordinator, LinkControllerInteractor linkControllerInteractor) {
        return new LinkController.Presenter(linkControllerCoordinator, linkControllerInteractor);
    }
}
