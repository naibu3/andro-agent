package com.stripe.android.paymentsheet.injection;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class AutocompleteViewModelModule_Companion_ProvidesEnableLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }

    public static AutocompleteViewModelModule_Companion_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return AutocompleteViewModelModule.INSTANCE.providesEnableLogging();
    }

    private static final class InstanceHolder {
        static final AutocompleteViewModelModule_Companion_ProvidesEnableLoggingFactory INSTANCE = new AutocompleteViewModelModule_Companion_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }
}
