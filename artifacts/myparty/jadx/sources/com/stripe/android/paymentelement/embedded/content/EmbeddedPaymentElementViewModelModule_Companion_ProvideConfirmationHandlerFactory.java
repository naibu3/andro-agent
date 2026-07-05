package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModelModule_Companion_ProvideConfirmationHandlerFactory implements Factory<ConfirmationHandler> {
    private final Provider<ConfirmationHandler.Factory> confirmationHandlerFactoryProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;

    public EmbeddedPaymentElementViewModelModule_Companion_ProvideConfirmationHandlerFactory(Provider<ConfirmationHandler.Factory> provider, Provider<CoroutineScope> provider2) {
        this.confirmationHandlerFactoryProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ConfirmationHandler get() {
        return provideConfirmationHandler(this.confirmationHandlerFactoryProvider.get(), this.coroutineScopeProvider.get());
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvideConfirmationHandlerFactory create(javax.inject.Provider<ConfirmationHandler.Factory> provider, javax.inject.Provider<CoroutineScope> provider2) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvideConfirmationHandlerFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvideConfirmationHandlerFactory create(Provider<ConfirmationHandler.Factory> provider, Provider<CoroutineScope> provider2) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvideConfirmationHandlerFactory(provider, provider2);
    }

    public static ConfirmationHandler provideConfirmationHandler(ConfirmationHandler.Factory factory, CoroutineScope coroutineScope) {
        return (ConfirmationHandler) Preconditions.checkNotNullFromProvides(EmbeddedPaymentElementViewModelModule.INSTANCE.provideConfirmationHandler(factory, coroutineScope));
    }
}
