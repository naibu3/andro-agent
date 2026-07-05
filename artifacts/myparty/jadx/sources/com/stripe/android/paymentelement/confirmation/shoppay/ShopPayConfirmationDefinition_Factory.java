package com.stripe.android.paymentelement.confirmation.shoppay;

import com.stripe.android.shoppay.ShopPayActivityContract;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class ShopPayConfirmationDefinition_Factory implements Factory<ShopPayConfirmationDefinition> {
    private final Provider<ShopPayActivityContract> shopPayActivityContractProvider;

    public ShopPayConfirmationDefinition_Factory(Provider<ShopPayActivityContract> provider) {
        this.shopPayActivityContractProvider = provider;
    }

    @Override // javax.inject.Provider
    public ShopPayConfirmationDefinition get() {
        return newInstance(this.shopPayActivityContractProvider.get());
    }

    public static ShopPayConfirmationDefinition_Factory create(javax.inject.Provider<ShopPayActivityContract> provider) {
        return new ShopPayConfirmationDefinition_Factory(Providers.asDaggerProvider(provider));
    }

    public static ShopPayConfirmationDefinition_Factory create(Provider<ShopPayActivityContract> provider) {
        return new ShopPayConfirmationDefinition_Factory(provider);
    }

    public static ShopPayConfirmationDefinition newInstance(ShopPayActivityContract shopPayActivityContract) {
        return new ShopPayConfirmationDefinition(shopPayActivityContract);
    }
}
