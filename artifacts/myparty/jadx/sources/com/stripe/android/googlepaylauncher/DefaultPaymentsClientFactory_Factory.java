package com.stripe.android.googlepaylauncher;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultPaymentsClientFactory_Factory implements Factory<DefaultPaymentsClientFactory> {
    private final Provider<Context> contextProvider;

    public DefaultPaymentsClientFactory_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public DefaultPaymentsClientFactory get() {
        return newInstance(this.contextProvider.get());
    }

    public static DefaultPaymentsClientFactory_Factory create(javax.inject.Provider<Context> provider) {
        return new DefaultPaymentsClientFactory_Factory(Providers.asDaggerProvider(provider));
    }

    public static DefaultPaymentsClientFactory_Factory create(Provider<Context> provider) {
        return new DefaultPaymentsClientFactory_Factory(provider);
    }

    public static DefaultPaymentsClientFactory newInstance(Context context) {
        return new DefaultPaymentsClientFactory(context);
    }
}
