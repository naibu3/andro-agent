package com.stripe.android.financialconnections.di;

import dagger.internal.Factory;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetSharedModule_Companion_ProvideLocale$financial_connections_releaseFactory implements Factory<Locale> {
    @Override // javax.inject.Provider
    public Locale get() {
        return provideLocale$financial_connections_release();
    }

    public static FinancialConnectionsSheetSharedModule_Companion_ProvideLocale$financial_connections_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Locale provideLocale$financial_connections_release() {
        return FinancialConnectionsSheetSharedModule.INSTANCE.provideLocale$financial_connections_release();
    }

    /* compiled from: FinancialConnectionsSheetSharedModule_Companion_ProvideLocale$financial_connections_releaseFactory.java */
    private static final class InstanceHolder {
        static final FinancialConnectionsSheetSharedModule_Companion_ProvideLocale$financial_connections_releaseFactory INSTANCE = new FinancialConnectionsSheetSharedModule_Companion_ProvideLocale$financial_connections_releaseFactory();

        private InstanceHolder() {
        }
    }
}
