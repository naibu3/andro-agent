package com.stripe.android.customersheet.injection;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ContextFactory implements Factory<Context> {
    private final Provider<Application> applicationProvider;

    public CustomerSheetViewModelModule_Companion_ContextFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return context(this.applicationProvider.get());
    }

    public static CustomerSheetViewModelModule_Companion_ContextFactory create(javax.inject.Provider<Application> provider) {
        return new CustomerSheetViewModelModule_Companion_ContextFactory(Providers.asDaggerProvider(provider));
    }

    public static CustomerSheetViewModelModule_Companion_ContextFactory create(Provider<Application> provider) {
        return new CustomerSheetViewModelModule_Companion_ContextFactory(provider);
    }

    public static Context context(Application application) {
        return (Context) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.context(application));
    }
}
