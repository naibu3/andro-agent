package com.stripe.android.paymentelement.embedded;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class EmbeddedCommonModule_Companion_ProvideAllowsManualConfirmationFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provideAllowsManualConfirmation());
    }

    public static EmbeddedCommonModule_Companion_ProvideAllowsManualConfirmationFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provideAllowsManualConfirmation() {
        return EmbeddedCommonModule.INSTANCE.provideAllowsManualConfirmation();
    }

    private static final class InstanceHolder {
        static final EmbeddedCommonModule_Companion_ProvideAllowsManualConfirmationFactory INSTANCE = new EmbeddedCommonModule_Companion_ProvideAllowsManualConfirmationFactory();

        private InstanceHolder() {
        }
    }
}
