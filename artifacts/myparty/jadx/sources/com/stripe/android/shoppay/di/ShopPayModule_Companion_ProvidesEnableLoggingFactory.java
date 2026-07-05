package com.stripe.android.shoppay.di;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class ShopPayModule_Companion_ProvidesEnableLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }

    public static ShopPayModule_Companion_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return ShopPayModule.INSTANCE.providesEnableLogging();
    }

    private static final class InstanceHolder {
        static final ShopPayModule_Companion_ProvidesEnableLoggingFactory INSTANCE = new ShopPayModule_Companion_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }
}
