package com.stripe.android.paymentelement.embedded.form;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FormActivityViewModelModule_Companion_ProvidesContextFactory implements Factory<Context> {
    private final Provider<Application> applicationProvider;

    public FormActivityViewModelModule_Companion_ProvidesContextFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesContext(this.applicationProvider.get());
    }

    public static FormActivityViewModelModule_Companion_ProvidesContextFactory create(javax.inject.Provider<Application> provider) {
        return new FormActivityViewModelModule_Companion_ProvidesContextFactory(Providers.asDaggerProvider(provider));
    }

    public static FormActivityViewModelModule_Companion_ProvidesContextFactory create(Provider<Application> provider) {
        return new FormActivityViewModelModule_Companion_ProvidesContextFactory(provider);
    }

    public static Context providesContext(Application application) {
        return (Context) Preconditions.checkNotNullFromProvides(FormActivityViewModelModule.INSTANCE.providesContext(application));
    }
}
