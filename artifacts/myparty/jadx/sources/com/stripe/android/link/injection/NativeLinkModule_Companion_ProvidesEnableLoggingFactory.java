package com.stripe.android.link.injection;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvidesEnableLoggingFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }

    public static NativeLinkModule_Companion_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return NativeLinkModule.INSTANCE.providesEnableLogging();
    }

    private static final class InstanceHolder {
        static final NativeLinkModule_Companion_ProvidesEnableLoggingFactory INSTANCE = new NativeLinkModule_Companion_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }
}
