package com.stripe.android.paymentsheet.paymentdatacollection.polling.di;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class PollingViewModelModule_Companion_ProvidesEnableLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }

    public static PollingViewModelModule_Companion_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return PollingViewModelModule.INSTANCE.providesEnableLogging();
    }

    private static final class InstanceHolder {
        static final PollingViewModelModule_Companion_ProvidesEnableLoggingFactory INSTANCE = new PollingViewModelModule_Companion_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }
}
