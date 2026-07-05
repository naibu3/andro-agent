package com.stripe.android.payments.bankaccount.di;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class CollectBankAccountModule_ProvidesEnableLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }

    public static CollectBankAccountModule_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return CollectBankAccountModule.INSTANCE.providesEnableLogging();
    }

    private static final class InstanceHolder {
        static final CollectBankAccountModule_ProvidesEnableLoggingFactory INSTANCE = new CollectBankAccountModule_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }
}
