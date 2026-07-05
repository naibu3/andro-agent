package com.stripe.android.paymentsheet.paymentdatacollection.polling.di;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class PollingViewModelModule_Companion_ProvidesAppContextFactory implements Factory<Context> {
    private final Provider<Application> applicationProvider;

    public PollingViewModelModule_Companion_ProvidesAppContextFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesAppContext(this.applicationProvider.get());
    }

    public static PollingViewModelModule_Companion_ProvidesAppContextFactory create(javax.inject.Provider<Application> provider) {
        return new PollingViewModelModule_Companion_ProvidesAppContextFactory(Providers.asDaggerProvider(provider));
    }

    public static PollingViewModelModule_Companion_ProvidesAppContextFactory create(Provider<Application> provider) {
        return new PollingViewModelModule_Companion_ProvidesAppContextFactory(provider);
    }

    public static Context providesAppContext(Application application) {
        return (Context) Preconditions.checkNotNullFromProvides(PollingViewModelModule.INSTANCE.providesAppContext(application));
    }
}
