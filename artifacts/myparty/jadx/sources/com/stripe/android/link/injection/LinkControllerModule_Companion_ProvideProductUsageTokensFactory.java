package com.stripe.android.link.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes5.dex */
public final class LinkControllerModule_Companion_ProvideProductUsageTokensFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return provideProductUsageTokens();
    }

    public static LinkControllerModule_Companion_ProvideProductUsageTokensFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> provideProductUsageTokens() {
        return (Set) Preconditions.checkNotNullFromProvides(LinkControllerModule.INSTANCE.provideProductUsageTokens());
    }

    private static final class InstanceHolder {
        static final LinkControllerModule_Companion_ProvideProductUsageTokensFactory INSTANCE = new LinkControllerModule_Companion_ProvideProductUsageTokensFactory();

        private InstanceHolder() {
        }
    }
}
