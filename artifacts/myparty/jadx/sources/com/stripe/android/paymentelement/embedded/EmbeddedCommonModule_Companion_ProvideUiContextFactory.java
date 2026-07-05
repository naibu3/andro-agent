package com.stripe.android.paymentelement.embedded;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class EmbeddedCommonModule_Companion_ProvideUiContextFactory implements Factory<CoroutineContext> {
    @Override // javax.inject.Provider
    public CoroutineContext get() {
        return provideUiContext();
    }

    public static EmbeddedCommonModule_Companion_ProvideUiContextFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineContext provideUiContext() {
        return (CoroutineContext) Preconditions.checkNotNullFromProvides(EmbeddedCommonModule.INSTANCE.provideUiContext());
    }

    private static final class InstanceHolder {
        static final EmbeddedCommonModule_Companion_ProvideUiContextFactory INSTANCE = new EmbeddedCommonModule_Companion_ProvideUiContextFactory();

        private InstanceHolder() {
        }
    }
}
