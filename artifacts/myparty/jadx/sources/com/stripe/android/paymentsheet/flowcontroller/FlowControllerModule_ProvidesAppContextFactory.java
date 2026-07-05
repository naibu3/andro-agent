package com.stripe.android.paymentsheet.flowcontroller;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class FlowControllerModule_ProvidesAppContextFactory implements Factory<Context> {
    private final Provider<Application> applicationProvider;

    public FlowControllerModule_ProvidesAppContextFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesAppContext(this.applicationProvider.get());
    }

    public static FlowControllerModule_ProvidesAppContextFactory create(javax.inject.Provider<Application> provider) {
        return new FlowControllerModule_ProvidesAppContextFactory(Providers.asDaggerProvider(provider));
    }

    public static FlowControllerModule_ProvidesAppContextFactory create(Provider<Application> provider) {
        return new FlowControllerModule_ProvidesAppContextFactory(provider);
    }

    public static Context providesAppContext(Application application) {
        return (Context) Preconditions.checkNotNullFromProvides(FlowControllerModule.INSTANCE.providesAppContext(application));
    }
}
