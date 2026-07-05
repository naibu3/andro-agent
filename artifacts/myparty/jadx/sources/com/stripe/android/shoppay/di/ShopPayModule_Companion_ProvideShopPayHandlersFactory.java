package com.stripe.android.shoppay.di;

import com.stripe.android.paymentsheet.ShopPayHandlers;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class ShopPayModule_Companion_ProvideShopPayHandlersFactory implements Factory<ShopPayHandlers> {
    private final Provider<String> paymentElementCallbackIdentifierProvider;

    public ShopPayModule_Companion_ProvideShopPayHandlersFactory(Provider<String> provider) {
        this.paymentElementCallbackIdentifierProvider = provider;
    }

    @Override // javax.inject.Provider
    public ShopPayHandlers get() {
        return provideShopPayHandlers(this.paymentElementCallbackIdentifierProvider.get());
    }

    public static ShopPayModule_Companion_ProvideShopPayHandlersFactory create(javax.inject.Provider<String> provider) {
        return new ShopPayModule_Companion_ProvideShopPayHandlersFactory(Providers.asDaggerProvider(provider));
    }

    public static ShopPayModule_Companion_ProvideShopPayHandlersFactory create(Provider<String> provider) {
        return new ShopPayModule_Companion_ProvideShopPayHandlersFactory(provider);
    }

    public static ShopPayHandlers provideShopPayHandlers(String str) {
        return (ShopPayHandlers) Preconditions.checkNotNullFromProvides(ShopPayModule.INSTANCE.provideShopPayHandlers(str));
    }
}
