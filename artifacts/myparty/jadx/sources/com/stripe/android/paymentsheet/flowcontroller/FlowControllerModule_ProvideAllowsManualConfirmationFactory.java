package com.stripe.android.paymentsheet.flowcontroller;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class FlowControllerModule_ProvideAllowsManualConfirmationFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provideAllowsManualConfirmation());
    }

    public static FlowControllerModule_ProvideAllowsManualConfirmationFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provideAllowsManualConfirmation() {
        return FlowControllerModule.INSTANCE.provideAllowsManualConfirmation();
    }

    private static final class InstanceHolder {
        static final FlowControllerModule_ProvideAllowsManualConfirmationFactory INSTANCE = new FlowControllerModule_ProvideAllowsManualConfirmationFactory();

        private InstanceHolder() {
        }
    }
}
