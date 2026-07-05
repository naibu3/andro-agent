package com.stripe.android.paymentsheet.paymentdatacollection.polling.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes6.dex */
public final class PollingViewModelModule_Companion_ProvidesProductUsageFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return providesProductUsage();
    }

    public static PollingViewModelModule_Companion_ProvidesProductUsageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> providesProductUsage() {
        return (Set) Preconditions.checkNotNullFromProvides(PollingViewModelModule.INSTANCE.providesProductUsage());
    }

    private static final class InstanceHolder {
        static final PollingViewModelModule_Companion_ProvidesProductUsageFactory INSTANCE = new PollingViewModelModule_Companion_ProvidesProductUsageFactory();

        private InstanceHolder() {
        }
    }
}
