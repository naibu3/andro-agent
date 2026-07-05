package com.stripe.android.financialconnections.di;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }

    public static FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return FinancialConnectionsSheetConfigurationModule.INSTANCE.providesEnableLogging();
    }

    private static final class InstanceHolder {
        static final FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory INSTANCE = new FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }
}
