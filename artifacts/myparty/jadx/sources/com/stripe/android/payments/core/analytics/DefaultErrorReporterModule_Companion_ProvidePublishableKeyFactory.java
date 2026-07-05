package com.stripe.android.payments.core.analytics;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class DefaultErrorReporterModule_Companion_ProvidePublishableKeyFactory implements Factory<Function0<String>> {
    private final Provider<Context> contextProvider;

    public DefaultErrorReporterModule_Companion_ProvidePublishableKeyFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<String> get() {
        return providePublishableKey(this.contextProvider.get());
    }

    public static DefaultErrorReporterModule_Companion_ProvidePublishableKeyFactory create(javax.inject.Provider<Context> provider) {
        return new DefaultErrorReporterModule_Companion_ProvidePublishableKeyFactory(Providers.asDaggerProvider(provider));
    }

    public static DefaultErrorReporterModule_Companion_ProvidePublishableKeyFactory create(Provider<Context> provider) {
        return new DefaultErrorReporterModule_Companion_ProvidePublishableKeyFactory(provider);
    }

    public static Function0<String> providePublishableKey(Context context) {
        return (Function0) Preconditions.checkNotNullFromProvides(DefaultErrorReporterModule.INSTANCE.providePublishableKey(context));
    }
}
