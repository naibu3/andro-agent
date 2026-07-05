package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class AutocompleteViewModelModule_Companion_ProvidesContextFactory implements Factory<Context> {
    private final Provider<Application> applicationProvider;

    public AutocompleteViewModelModule_Companion_ProvidesContextFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesContext(this.applicationProvider.get());
    }

    public static AutocompleteViewModelModule_Companion_ProvidesContextFactory create(javax.inject.Provider<Application> provider) {
        return new AutocompleteViewModelModule_Companion_ProvidesContextFactory(Providers.asDaggerProvider(provider));
    }

    public static AutocompleteViewModelModule_Companion_ProvidesContextFactory create(Provider<Application> provider) {
        return new AutocompleteViewModelModule_Companion_ProvidesContextFactory(provider);
    }

    public static Context providesContext(Application application) {
        return (Context) Preconditions.checkNotNullFromProvides(AutocompleteViewModelModule.INSTANCE.providesContext(application));
    }
}
