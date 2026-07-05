package com.stripe.android.shoppay.di;

import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory implements Factory<PreparePaymentMethodHandler> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public PreparePaymentMethodHandler get() {
        return providePreparePaymentMethodHandler(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory create(javax.inject.Provider<String> provider) {
        return new ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory(Providers.asDaggerProvider(provider));
    }

    public static ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory create(Provider<String> provider) {
        return new ShopPayModule_Companion_ProvidePreparePaymentMethodHandlerFactory(provider);
    }

    public static PreparePaymentMethodHandler providePreparePaymentMethodHandler(String str) {
        return ShopPayModule.INSTANCE.providePreparePaymentMethodHandler(str);
    }
}
