package com.stripe.android.financialconnections.debug;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DebugConfiguration_Factory implements Factory<DebugConfiguration> {
    private final Provider<Application> contextProvider;

    public DebugConfiguration_Factory(Provider<Application> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public DebugConfiguration get() {
        return newInstance(this.contextProvider.get());
    }

    public static DebugConfiguration_Factory create(javax.inject.Provider<Application> provider) {
        return new DebugConfiguration_Factory(Providers.asDaggerProvider(provider));
    }

    public static DebugConfiguration_Factory create(Provider<Application> provider) {
        return new DebugConfiguration_Factory(provider);
    }

    public static DebugConfiguration newInstance(Application application) {
        return new DebugConfiguration(application);
    }
}
