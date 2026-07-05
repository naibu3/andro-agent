package com.stripe.android.link.injection;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvideAllowsManualConfirmationFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provideAllowsManualConfirmation());
    }

    public static NativeLinkModule_Companion_ProvideAllowsManualConfirmationFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provideAllowsManualConfirmation() {
        return NativeLinkModule.INSTANCE.provideAllowsManualConfirmation();
    }

    private static final class InstanceHolder {
        static final NativeLinkModule_Companion_ProvideAllowsManualConfirmationFactory INSTANCE = new NativeLinkModule_Companion_ProvideAllowsManualConfirmationFactory();

        private InstanceHolder() {
        }
    }
}
