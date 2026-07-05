package com.stripe.android.link;

import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.link.LinkController;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkControllerCoordinator_Factory implements Factory<LinkControllerCoordinator> {
    private final Provider<ActivityResultRegistryOwner> activityResultRegistryOwnerProvider;
    private final Provider<LinkController.AuthenticationCallback> authenticationCallbackProvider;
    private final Provider<LinkControllerInteractor> interactorProvider;
    private final Provider<LifecycleOwner> lifecycleOwnerProvider;
    private final Provider<NativeLinkActivityContract> linkActivityContractProvider;
    private final Provider<LinkController.PresentPaymentMethodsCallback> selectedPaymentMethodCallbackProvider;

    public LinkControllerCoordinator_Factory(Provider<LinkControllerInteractor> provider, Provider<LifecycleOwner> provider2, Provider<ActivityResultRegistryOwner> provider3, Provider<NativeLinkActivityContract> provider4, Provider<LinkController.PresentPaymentMethodsCallback> provider5, Provider<LinkController.AuthenticationCallback> provider6) {
        this.interactorProvider = provider;
        this.lifecycleOwnerProvider = provider2;
        this.activityResultRegistryOwnerProvider = provider3;
        this.linkActivityContractProvider = provider4;
        this.selectedPaymentMethodCallbackProvider = provider5;
        this.authenticationCallbackProvider = provider6;
    }

    @Override // javax.inject.Provider
    public LinkControllerCoordinator get() {
        return newInstance(this.interactorProvider.get(), this.lifecycleOwnerProvider.get(), this.activityResultRegistryOwnerProvider.get(), this.linkActivityContractProvider.get(), this.selectedPaymentMethodCallbackProvider.get(), this.authenticationCallbackProvider.get());
    }

    public static LinkControllerCoordinator_Factory create(javax.inject.Provider<LinkControllerInteractor> provider, javax.inject.Provider<LifecycleOwner> provider2, javax.inject.Provider<ActivityResultRegistryOwner> provider3, javax.inject.Provider<NativeLinkActivityContract> provider4, javax.inject.Provider<LinkController.PresentPaymentMethodsCallback> provider5, javax.inject.Provider<LinkController.AuthenticationCallback> provider6) {
        return new LinkControllerCoordinator_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static LinkControllerCoordinator_Factory create(Provider<LinkControllerInteractor> provider, Provider<LifecycleOwner> provider2, Provider<ActivityResultRegistryOwner> provider3, Provider<NativeLinkActivityContract> provider4, Provider<LinkController.PresentPaymentMethodsCallback> provider5, Provider<LinkController.AuthenticationCallback> provider6) {
        return new LinkControllerCoordinator_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static LinkControllerCoordinator newInstance(LinkControllerInteractor linkControllerInteractor, LifecycleOwner lifecycleOwner, ActivityResultRegistryOwner activityResultRegistryOwner, NativeLinkActivityContract nativeLinkActivityContract, LinkController.PresentPaymentMethodsCallback presentPaymentMethodsCallback, LinkController.AuthenticationCallback authenticationCallback) {
        return new LinkControllerCoordinator(linkControllerInteractor, lifecycleOwner, activityResultRegistryOwner, nativeLinkActivityContract, presentPaymentMethodsCallback, authenticationCallback);
    }
}
