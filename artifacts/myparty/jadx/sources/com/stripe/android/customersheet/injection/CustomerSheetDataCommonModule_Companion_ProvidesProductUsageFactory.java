package com.stripe.android.customersheet.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return providesProductUsage();
    }

    public static CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> providesProductUsage() {
        return (Set) Preconditions.checkNotNullFromProvides(CustomerSheetDataCommonModule.INSTANCE.providesProductUsage());
    }

    private static final class InstanceHolder {
        static final CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory INSTANCE = new CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory();

        private InstanceHolder() {
        }
    }
}
