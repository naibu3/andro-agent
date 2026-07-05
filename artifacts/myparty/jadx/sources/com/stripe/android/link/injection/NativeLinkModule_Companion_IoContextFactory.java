package com.stripe.android.link.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class NativeLinkModule_Companion_IoContextFactory implements Factory<CoroutineContext> {
    @Override // javax.inject.Provider
    public CoroutineContext get() {
        return ioContext();
    }

    public static NativeLinkModule_Companion_IoContextFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineContext ioContext() {
        return (CoroutineContext) Preconditions.checkNotNullFromProvides(NativeLinkModule.INSTANCE.ioContext());
    }

    private static final class InstanceHolder {
        static final NativeLinkModule_Companion_IoContextFactory INSTANCE = new NativeLinkModule_Companion_IoContextFactory();

        private InstanceHolder() {
        }
    }
}
