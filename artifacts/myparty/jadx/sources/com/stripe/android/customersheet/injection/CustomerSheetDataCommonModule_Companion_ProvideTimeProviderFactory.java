package com.stripe.android.customersheet.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory implements Factory<Function0<Long>> {
    @Override // javax.inject.Provider
    public Function0<Long> get() {
        return provideTimeProvider();
    }

    public static CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Function0<Long> provideTimeProvider() {
        return (Function0) Preconditions.checkNotNullFromProvides(CustomerSheetDataCommonModule.INSTANCE.provideTimeProvider());
    }

    private static final class InstanceHolder {
        static final CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory INSTANCE = new CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory();

        private InstanceHolder() {
        }
    }
}
