package com.stripe.android.payments.core.authentication;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class RealRedirectResolver_Factory implements Factory<RealRedirectResolver> {
    private final Provider<CoroutineContext> ioDispatcherProvider;

    public RealRedirectResolver_Factory(Provider<CoroutineContext> provider) {
        this.ioDispatcherProvider = provider;
    }

    @Override // javax.inject.Provider
    public RealRedirectResolver get() {
        return newInstance(this.ioDispatcherProvider.get());
    }

    public static RealRedirectResolver_Factory create(javax.inject.Provider<CoroutineContext> provider) {
        return new RealRedirectResolver_Factory(Providers.asDaggerProvider(provider));
    }

    public static RealRedirectResolver_Factory create(Provider<CoroutineContext> provider) {
        return new RealRedirectResolver_Factory(provider);
    }

    public static RealRedirectResolver newInstance(CoroutineContext coroutineContext) {
        return new RealRedirectResolver(coroutineContext);
    }
}
