package com.stripe.android.paymentelement.embedded;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provideEnabledLogging());
    }

    public static EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provideEnabledLogging() {
        return EmbeddedCommonModule.INSTANCE.provideEnabledLogging();
    }

    private static final class InstanceHolder {
        static final EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory INSTANCE = new EmbeddedCommonModule_Companion_ProvideEnabledLoggingFactory();

        private InstanceHolder() {
        }
    }
}
