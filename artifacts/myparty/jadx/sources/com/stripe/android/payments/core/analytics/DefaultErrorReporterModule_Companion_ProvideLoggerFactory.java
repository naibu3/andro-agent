package com.stripe.android.payments.core.analytics;

import com.stripe.android.core.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class DefaultErrorReporterModule_Companion_ProvideLoggerFactory implements Factory<Logger> {
    @Override // javax.inject.Provider
    public Logger get() {
        return provideLogger();
    }

    public static DefaultErrorReporterModule_Companion_ProvideLoggerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Logger provideLogger() {
        return (Logger) Preconditions.checkNotNullFromProvides(DefaultErrorReporterModule.INSTANCE.provideLogger());
    }

    private static final class InstanceHolder {
        static final DefaultErrorReporterModule_Companion_ProvideLoggerFactory INSTANCE = new DefaultErrorReporterModule_Companion_ProvideLoggerFactory();

        private InstanceHolder() {
        }
    }
}
