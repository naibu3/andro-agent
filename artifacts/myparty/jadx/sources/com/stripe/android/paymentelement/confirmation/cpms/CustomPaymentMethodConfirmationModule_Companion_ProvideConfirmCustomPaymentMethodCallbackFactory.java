package com.stripe.android.paymentelement.confirmation.cpms;

import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory implements Factory<ConfirmCustomPaymentMethodCallback> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public ConfirmCustomPaymentMethodCallback get() {
        return provideConfirmCustomPaymentMethodCallback(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory create(javax.inject.Provider<String> provider) {
        return new CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory(Providers.asDaggerProvider(provider));
    }

    public static CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory create(Provider<String> provider) {
        return new CustomPaymentMethodConfirmationModule_Companion_ProvideConfirmCustomPaymentMethodCallbackFactory(provider);
    }

    public static ConfirmCustomPaymentMethodCallback provideConfirmCustomPaymentMethodCallback(String str) {
        return CustomPaymentMethodConfirmationModule.INSTANCE.provideConfirmCustomPaymentMethodCallback(str);
    }
}
