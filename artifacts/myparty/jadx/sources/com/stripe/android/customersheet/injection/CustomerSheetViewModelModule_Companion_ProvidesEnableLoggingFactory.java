package com.stripe.android.customersheet.injection;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }

    public static CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return CustomerSheetViewModelModule.INSTANCE.providesEnableLogging();
    }

    private static final class InstanceHolder {
        static final CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory INSTANCE = new CustomerSheetViewModelModule_Companion_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }
}
