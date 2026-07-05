package com.stripe.android.customersheet.injection;

import android.app.Application;
import android.content.res.Resources;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ResourcesFactory implements Factory<Resources> {
    private final Provider<Application> applicationProvider;

    public CustomerSheetViewModelModule_Companion_ResourcesFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Resources get() {
        return resources(this.applicationProvider.get());
    }

    public static CustomerSheetViewModelModule_Companion_ResourcesFactory create(javax.inject.Provider<Application> provider) {
        return new CustomerSheetViewModelModule_Companion_ResourcesFactory(Providers.asDaggerProvider(provider));
    }

    public static CustomerSheetViewModelModule_Companion_ResourcesFactory create(Provider<Application> provider) {
        return new CustomerSheetViewModelModule_Companion_ResourcesFactory(provider);
    }

    public static Resources resources(Application application) {
        return (Resources) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.resources(application));
    }
}
