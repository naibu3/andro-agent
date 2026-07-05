package com.stripe.android.core.injection;

import dagger.internal.Factory;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class CoreCommonModule_ProvideLocaleFactory implements Factory<Locale> {
    private final CoreCommonModule module;

    public CoreCommonModule_ProvideLocaleFactory(CoreCommonModule coreCommonModule) {
        this.module = coreCommonModule;
    }

    @Override // javax.inject.Provider
    public Locale get() {
        return provideLocale(this.module);
    }

    public static CoreCommonModule_ProvideLocaleFactory create(CoreCommonModule coreCommonModule) {
        return new CoreCommonModule_ProvideLocaleFactory(coreCommonModule);
    }

    public static Locale provideLocale(CoreCommonModule coreCommonModule) {
        return coreCommonModule.provideLocale();
    }
}
