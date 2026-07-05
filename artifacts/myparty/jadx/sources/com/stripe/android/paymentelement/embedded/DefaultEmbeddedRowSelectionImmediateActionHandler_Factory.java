package com.stripe.android.paymentelement.embedded;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedRowSelectionImmediateActionHandler_Factory implements Factory<DefaultEmbeddedRowSelectionImmediateActionHandler> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<Function0<Unit>> internalRowSelectionCallbackProvider;

    public DefaultEmbeddedRowSelectionImmediateActionHandler_Factory(Provider<CoroutineScope> provider, Provider<Function0<Unit>> provider2) {
        this.coroutineScopeProvider = provider;
        this.internalRowSelectionCallbackProvider = provider2;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedRowSelectionImmediateActionHandler get() {
        return newInstance(this.coroutineScopeProvider.get(), this.internalRowSelectionCallbackProvider);
    }

    public static DefaultEmbeddedRowSelectionImmediateActionHandler_Factory create(javax.inject.Provider<CoroutineScope> provider, javax.inject.Provider<Function0<Unit>> provider2) {
        return new DefaultEmbeddedRowSelectionImmediateActionHandler_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static DefaultEmbeddedRowSelectionImmediateActionHandler_Factory create(Provider<CoroutineScope> provider, Provider<Function0<Unit>> provider2) {
        return new DefaultEmbeddedRowSelectionImmediateActionHandler_Factory(provider, provider2);
    }

    public static DefaultEmbeddedRowSelectionImmediateActionHandler newInstance(CoroutineScope coroutineScope, javax.inject.Provider<Function0<Unit>> provider) {
        return new DefaultEmbeddedRowSelectionImmediateActionHandler(coroutineScope, provider);
    }
}
