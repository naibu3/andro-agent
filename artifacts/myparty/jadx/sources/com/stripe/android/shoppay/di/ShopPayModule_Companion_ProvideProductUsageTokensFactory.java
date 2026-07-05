package com.stripe.android.shoppay.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes6.dex */
public final class ShopPayModule_Companion_ProvideProductUsageTokensFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return provideProductUsageTokens();
    }

    public static ShopPayModule_Companion_ProvideProductUsageTokensFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> provideProductUsageTokens() {
        return (Set) Preconditions.checkNotNullFromProvides(ShopPayModule.INSTANCE.provideProductUsageTokens());
    }

    private static final class InstanceHolder {
        static final ShopPayModule_Companion_ProvideProductUsageTokensFactory INSTANCE = new ShopPayModule_Companion_ProvideProductUsageTokensFactory();

        private InstanceHolder() {
        }
    }
}
