package com.stripe.android.customersheet.injection;

import dagger.internal.Factory;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ProvideLocaleFactory implements Factory<Locale> {
    @Override // javax.inject.Provider
    public Locale get() {
        return provideLocale();
    }

    public static CustomerSheetViewModelModule_Companion_ProvideLocaleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Locale provideLocale() {
        return CustomerSheetViewModelModule.INSTANCE.provideLocale();
    }

    private static final class InstanceHolder {
        static final CustomerSheetViewModelModule_Companion_ProvideLocaleFactory INSTANCE = new CustomerSheetViewModelModule_Companion_ProvideLocaleFactory();

        private InstanceHolder() {
        }
    }
}
