package com.stripe.android.link.injection;

import dagger.internal.Factory;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvideLocaleFactory implements Factory<Locale> {
    @Override // javax.inject.Provider
    public Locale get() {
        return provideLocale();
    }

    public static NativeLinkModule_Companion_ProvideLocaleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Locale provideLocale() {
        return NativeLinkModule.INSTANCE.provideLocale();
    }

    private static final class InstanceHolder {
        static final NativeLinkModule_Companion_ProvideLocaleFactory INSTANCE = new NativeLinkModule_Companion_ProvideLocaleFactory();

        private InstanceHolder() {
        }
    }
}
