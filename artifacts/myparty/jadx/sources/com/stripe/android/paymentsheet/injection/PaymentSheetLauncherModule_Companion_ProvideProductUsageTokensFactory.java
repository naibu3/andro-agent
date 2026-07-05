package com.stripe.android.paymentsheet.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes6.dex */
public final class PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return provideProductUsageTokens();
    }

    public static PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> provideProductUsageTokens() {
        return (Set) Preconditions.checkNotNullFromProvides(PaymentSheetLauncherModule.INSTANCE.provideProductUsageTokens());
    }

    private static final class InstanceHolder {
        static final PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory INSTANCE = new PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory();

        private InstanceHolder() {
        }
    }
}
