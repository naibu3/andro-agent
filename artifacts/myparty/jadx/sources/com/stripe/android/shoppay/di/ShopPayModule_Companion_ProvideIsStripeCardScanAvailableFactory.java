package com.stripe.android.shoppay.di;

import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory implements Factory<IsStripeCardScanAvailable> {
    @Override // javax.inject.Provider
    public IsStripeCardScanAvailable get() {
        return provideIsStripeCardScanAvailable();
    }

    public static ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static IsStripeCardScanAvailable provideIsStripeCardScanAvailable() {
        return (IsStripeCardScanAvailable) Preconditions.checkNotNullFromProvides(ShopPayModule.INSTANCE.provideIsStripeCardScanAvailable());
    }

    private static final class InstanceHolder {
        static final ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory INSTANCE = new ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory();

        private InstanceHolder() {
        }
    }
}
