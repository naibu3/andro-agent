package com.stripe.android.payments.core.analytics;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class DefaultErrorReporterModule_Companion_ProvideIoContextFactory implements Factory<CoroutineContext> {
    @Override // javax.inject.Provider
    public CoroutineContext get() {
        return provideIoContext();
    }

    public static DefaultErrorReporterModule_Companion_ProvideIoContextFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineContext provideIoContext() {
        return (CoroutineContext) Preconditions.checkNotNullFromProvides(DefaultErrorReporterModule.INSTANCE.provideIoContext());
    }

    private static final class InstanceHolder {
        static final DefaultErrorReporterModule_Companion_ProvideIoContextFactory INSTANCE = new DefaultErrorReporterModule_Companion_ProvideIoContextFactory();

        private InstanceHolder() {
        }
    }
}
