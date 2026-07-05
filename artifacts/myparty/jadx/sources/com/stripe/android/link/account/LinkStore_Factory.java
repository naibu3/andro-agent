package com.stripe.android.link.account;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkStore_Factory implements Factory<LinkStore> {
    private final Provider<Context> contextProvider;

    public LinkStore_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public LinkStore get() {
        return newInstance(this.contextProvider.get());
    }

    public static LinkStore_Factory create(javax.inject.Provider<Context> provider) {
        return new LinkStore_Factory(Providers.asDaggerProvider(provider));
    }

    public static LinkStore_Factory create(Provider<Context> provider) {
        return new LinkStore_Factory(provider);
    }

    public static LinkStore newInstance(Context context) {
        return new LinkStore(context);
    }
}
