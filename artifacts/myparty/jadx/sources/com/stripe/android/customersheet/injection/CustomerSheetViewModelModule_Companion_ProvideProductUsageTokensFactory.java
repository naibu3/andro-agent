package com.stripe.android.customersheet.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return provideProductUsageTokens();
    }

    public static CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> provideProductUsageTokens() {
        return (Set) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.provideProductUsageTokens());
    }

    private static final class InstanceHolder {
        static final CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory INSTANCE = new CustomerSheetViewModelModule_Companion_ProvideProductUsageTokensFactory();

        private InstanceHolder() {
        }
    }
}
