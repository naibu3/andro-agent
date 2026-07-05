package com.stripe.android.financialconnections.browser;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class BrowserManager_Factory implements Factory<BrowserManager> {
    private final Provider<Application> contextProvider;

    public BrowserManager_Factory(Provider<Application> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public BrowserManager get() {
        return newInstance(this.contextProvider.get());
    }

    public static BrowserManager_Factory create(javax.inject.Provider<Application> provider) {
        return new BrowserManager_Factory(Providers.asDaggerProvider(provider));
    }

    public static BrowserManager_Factory create(Provider<Application> provider) {
        return new BrowserManager_Factory(provider);
    }

    public static BrowserManager newInstance(Application application) {
        return new BrowserManager(application);
    }
}
