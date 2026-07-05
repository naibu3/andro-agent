package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class AddressElementViewModelModule_ProvideEventReporterFactory implements Factory<AddressLauncherEventReporter> {
    private final Provider<DefaultAddressLauncherEventReporter> defaultAddressLauncherEventReporterProvider;
    private final AddressElementViewModelModule module;

    public AddressElementViewModelModule_ProvideEventReporterFactory(AddressElementViewModelModule addressElementViewModelModule, Provider<DefaultAddressLauncherEventReporter> provider) {
        this.module = addressElementViewModelModule;
        this.defaultAddressLauncherEventReporterProvider = provider;
    }

    @Override // javax.inject.Provider
    public AddressLauncherEventReporter get() {
        return provideEventReporter(this.module, this.defaultAddressLauncherEventReporterProvider.get());
    }

    public static AddressElementViewModelModule_ProvideEventReporterFactory create(AddressElementViewModelModule addressElementViewModelModule, javax.inject.Provider<DefaultAddressLauncherEventReporter> provider) {
        return new AddressElementViewModelModule_ProvideEventReporterFactory(addressElementViewModelModule, Providers.asDaggerProvider(provider));
    }

    public static AddressElementViewModelModule_ProvideEventReporterFactory create(AddressElementViewModelModule addressElementViewModelModule, Provider<DefaultAddressLauncherEventReporter> provider) {
        return new AddressElementViewModelModule_ProvideEventReporterFactory(addressElementViewModelModule, provider);
    }

    public static AddressLauncherEventReporter provideEventReporter(AddressElementViewModelModule addressElementViewModelModule, DefaultAddressLauncherEventReporter defaultAddressLauncherEventReporter) {
        return (AddressLauncherEventReporter) Preconditions.checkNotNullFromProvides(addressElementViewModelModule.provideEventReporter(defaultAddressLauncherEventReporter));
    }
}
