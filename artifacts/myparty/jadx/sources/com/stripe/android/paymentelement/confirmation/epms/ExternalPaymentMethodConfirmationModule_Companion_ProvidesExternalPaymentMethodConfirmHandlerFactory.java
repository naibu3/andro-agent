package com.stripe.android.paymentelement.confirmation.epms;

import com.stripe.android.paymentsheet.ExternalPaymentMethodConfirmHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory implements Factory<ExternalPaymentMethodConfirmHandler> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public ExternalPaymentMethodConfirmHandler get() {
        return providesExternalPaymentMethodConfirmHandler(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory create(javax.inject.Provider<String> provider) {
        return new ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory(Providers.asDaggerProvider(provider));
    }

    public static ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory create(Provider<String> provider) {
        return new ExternalPaymentMethodConfirmationModule_Companion_ProvidesExternalPaymentMethodConfirmHandlerFactory(provider);
    }

    public static ExternalPaymentMethodConfirmHandler providesExternalPaymentMethodConfirmHandler(String str) {
        return ExternalPaymentMethodConfirmationModule.INSTANCE.providesExternalPaymentMethodConfirmHandler(str);
    }
}
