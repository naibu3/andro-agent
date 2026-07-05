package com.stripe.android.paymentsheet.injection;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provideEnabledLogging());
    }

    public static PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provideEnabledLogging() {
        return PaymentSheetCommonModule.INSTANCE.provideEnabledLogging();
    }

    private static final class InstanceHolder {
        static final PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory INSTANCE = new PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory();

        private InstanceHolder() {
        }
    }
}
