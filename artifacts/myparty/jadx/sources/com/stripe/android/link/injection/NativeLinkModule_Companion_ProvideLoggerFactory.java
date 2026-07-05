package com.stripe.android.link.injection;

import com.stripe.android.core.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_ProvideLoggerFactory implements Factory<Logger> {
    private final Provider<Boolean> enableLoggingProvider;

    public NativeLinkModule_Companion_ProvideLoggerFactory(Provider<Boolean> provider) {
        this.enableLoggingProvider = provider;
    }

    @Override // javax.inject.Provider
    public Logger get() {
        return provideLogger(this.enableLoggingProvider.get().booleanValue());
    }

    public static NativeLinkModule_Companion_ProvideLoggerFactory create(javax.inject.Provider<Boolean> provider) {
        return new NativeLinkModule_Companion_ProvideLoggerFactory(Providers.asDaggerProvider(provider));
    }

    public static NativeLinkModule_Companion_ProvideLoggerFactory create(Provider<Boolean> provider) {
        return new NativeLinkModule_Companion_ProvideLoggerFactory(provider);
    }

    public static Logger provideLogger(boolean z) {
        return (Logger) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.provideLogger(z));
    }
}
