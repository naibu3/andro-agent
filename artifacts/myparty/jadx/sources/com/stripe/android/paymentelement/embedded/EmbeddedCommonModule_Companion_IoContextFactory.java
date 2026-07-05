package com.stripe.android.paymentelement.embedded;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class EmbeddedCommonModule_Companion_IoContextFactory implements Factory<CoroutineContext> {
    @Override // javax.inject.Provider
    public CoroutineContext get() {
        return ioContext();
    }

    public static EmbeddedCommonModule_Companion_IoContextFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineContext ioContext() {
        return (CoroutineContext) Preconditions.checkNotNullFromProvides(EmbeddedCommonModule.INSTANCE.ioContext());
    }

    private static final class InstanceHolder {
        static final EmbeddedCommonModule_Companion_IoContextFactory INSTANCE = new EmbeddedCommonModule_Companion_IoContextFactory();

        private InstanceHolder() {
        }
    }
}
