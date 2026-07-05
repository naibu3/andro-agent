package com.stripe.android.payments.bankaccount.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes6.dex */
public final class CollectBankAccountModule_ProvidesProductUsageFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return providesProductUsage();
    }

    public static CollectBankAccountModule_ProvidesProductUsageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> providesProductUsage() {
        return (Set) Preconditions.checkNotNullFromProvides(CollectBankAccountModule.INSTANCE.providesProductUsage());
    }

    private static final class InstanceHolder {
        static final CollectBankAccountModule_ProvidesProductUsageFactory INSTANCE = new CollectBankAccountModule_ProvidesProductUsageFactory();

        private InstanceHolder() {
        }
    }
}
