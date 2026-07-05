package com.stripe.android.paymentsheet.flowcontroller;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FlowControllerModule_ProvideProductUsageTokensFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return provideProductUsageTokens();
    }

    public static FlowControllerModule_ProvideProductUsageTokensFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> provideProductUsageTokens() {
        return (Set) Preconditions.checkNotNullFromProvides(FlowControllerModule.INSTANCE.provideProductUsageTokens());
    }

    private static final class InstanceHolder {
        static final FlowControllerModule_ProvideProductUsageTokensFactory INSTANCE = new FlowControllerModule_ProvideProductUsageTokensFactory();

        private InstanceHolder() {
        }
    }
}
