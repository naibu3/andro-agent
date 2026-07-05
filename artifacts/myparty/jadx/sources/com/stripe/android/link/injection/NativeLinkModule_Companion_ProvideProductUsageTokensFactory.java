package com.stripe.android.link.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvideProductUsageTokensFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return provideProductUsageTokens();
    }

    public static NativeLinkModule_Companion_ProvideProductUsageTokensFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> provideProductUsageTokens() {
        return (Set) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.provideProductUsageTokens());
    }

    private static final class InstanceHolder {
        static final NativeLinkModule_Companion_ProvideProductUsageTokensFactory INSTANCE = new NativeLinkModule_Companion_ProvideProductUsageTokensFactory();

        private InstanceHolder() {
        }
    }
}
