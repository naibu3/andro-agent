package com.stripe.android.customersheet.injection;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }

    public static CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return CustomerSheetDataCommonModule.INSTANCE.providesEnableLogging();
    }

    private static final class InstanceHolder {
        static final CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory INSTANCE = new CustomerSheetDataCommonModule_Companion_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }
}
