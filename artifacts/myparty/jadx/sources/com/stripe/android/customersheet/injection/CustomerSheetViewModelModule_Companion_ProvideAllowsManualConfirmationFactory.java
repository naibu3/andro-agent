package com.stripe.android.customersheet.injection;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ProvideAllowsManualConfirmationFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provideAllowsManualConfirmation());
    }

    public static CustomerSheetViewModelModule_Companion_ProvideAllowsManualConfirmationFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provideAllowsManualConfirmation() {
        return CustomerSheetViewModelModule.INSTANCE.provideAllowsManualConfirmation();
    }

    private static final class InstanceHolder {
        static final CustomerSheetViewModelModule_Companion_ProvideAllowsManualConfirmationFactory INSTANCE = new CustomerSheetViewModelModule_Companion_ProvideAllowsManualConfirmationFactory();

        private InstanceHolder() {
        }
    }
}
