package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class FlowControllerModule_ProvidesConfirmationHandlerFactory implements Factory<ConfirmationHandler> {
    private final Provider<ConfirmationHandler.Factory> confirmationHandlerFactoryProvider;
    private final Provider<FlowControllerViewModel> viewModelProvider;

    public FlowControllerModule_ProvidesConfirmationHandlerFactory(Provider<ConfirmationHandler.Factory> provider, Provider<FlowControllerViewModel> provider2) {
        this.confirmationHandlerFactoryProvider = provider;
        this.viewModelProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ConfirmationHandler get() {
        return providesConfirmationHandler(this.confirmationHandlerFactoryProvider.get(), this.viewModelProvider.get());
    }

    public static FlowControllerModule_ProvidesConfirmationHandlerFactory create(javax.inject.Provider<ConfirmationHandler.Factory> provider, javax.inject.Provider<FlowControllerViewModel> provider2) {
        return new FlowControllerModule_ProvidesConfirmationHandlerFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static FlowControllerModule_ProvidesConfirmationHandlerFactory create(Provider<ConfirmationHandler.Factory> provider, Provider<FlowControllerViewModel> provider2) {
        return new FlowControllerModule_ProvidesConfirmationHandlerFactory(provider, provider2);
    }

    public static ConfirmationHandler providesConfirmationHandler(ConfirmationHandler.Factory factory, FlowControllerViewModel flowControllerViewModel) {
        return (ConfirmationHandler) Preconditions.checkNotNullFromProvides(FlowControllerModule.INSTANCE.providesConfirmationHandler(factory, flowControllerViewModel));
    }
}
