package com.stripe.android.paymentsheet.injection;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class PaymentSheetLauncherModule_Companion_ProvideAllowsManualConfirmationFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provideAllowsManualConfirmation());
    }

    public static PaymentSheetLauncherModule_Companion_ProvideAllowsManualConfirmationFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provideAllowsManualConfirmation() {
        return PaymentSheetLauncherModule.INSTANCE.provideAllowsManualConfirmation();
    }

    private static final class InstanceHolder {
        static final PaymentSheetLauncherModule_Companion_ProvideAllowsManualConfirmationFactory INSTANCE = new PaymentSheetLauncherModule_Companion_ProvideAllowsManualConfirmationFactory();

        private InstanceHolder() {
        }
    }
}
