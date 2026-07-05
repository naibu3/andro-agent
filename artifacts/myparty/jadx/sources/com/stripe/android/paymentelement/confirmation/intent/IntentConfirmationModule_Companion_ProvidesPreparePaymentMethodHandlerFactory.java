package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory implements Factory<PreparePaymentMethodHandler> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public PreparePaymentMethodHandler get() {
        return providesPreparePaymentMethodHandler(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory create(javax.inject.Provider<String> provider) {
        return new IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory(Providers.asDaggerProvider(provider));
    }

    public static IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory create(Provider<String> provider) {
        return new IntentConfirmationModule_Companion_ProvidesPreparePaymentMethodHandlerFactory(provider);
    }

    public static PreparePaymentMethodHandler providesPreparePaymentMethodHandler(String str) {
        return IntentConfirmationModule.INSTANCE.providesPreparePaymentMethodHandler(str);
    }
}
