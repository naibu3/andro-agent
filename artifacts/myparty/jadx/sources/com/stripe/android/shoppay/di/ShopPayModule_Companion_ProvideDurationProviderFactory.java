package com.stripe.android.shoppay.di;

import com.stripe.android.core.utils.DurationProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class ShopPayModule_Companion_ProvideDurationProviderFactory implements Factory<DurationProvider> {
    @Override // javax.inject.Provider
    public DurationProvider get() {
        return provideDurationProvider();
    }

    public static ShopPayModule_Companion_ProvideDurationProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DurationProvider provideDurationProvider() {
        return (DurationProvider) Preconditions.checkNotNullFromProvides(ShopPayModule.INSTANCE.provideDurationProvider());
    }

    private static final class InstanceHolder {
        static final ShopPayModule_Companion_ProvideDurationProviderFactory INSTANCE = new ShopPayModule_Companion_ProvideDurationProviderFactory();

        private InstanceHolder() {
        }
    }
}
