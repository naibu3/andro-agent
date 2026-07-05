package com.stripe.android.shoppay;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class ShopPayActivityContract_Factory implements Factory<ShopPayActivityContract> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public ShopPayActivityContract_Factory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public ShopPayActivityContract get() {
        return newInstance(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static ShopPayActivityContract_Factory create(javax.inject.Provider<String> provider) {
        return new ShopPayActivityContract_Factory(Providers.asDaggerProvider(provider));
    }

    public static ShopPayActivityContract_Factory create(Provider<String> provider) {
        return new ShopPayActivityContract_Factory(provider);
    }

    public static ShopPayActivityContract newInstance(String str) {
        return new ShopPayActivityContract(str);
    }
}
