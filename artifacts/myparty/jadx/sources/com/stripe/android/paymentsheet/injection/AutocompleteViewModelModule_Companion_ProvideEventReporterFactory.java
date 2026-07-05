package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.addresselement.analytics.DefaultAddressLauncherEventReporter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class AutocompleteViewModelModule_Companion_ProvideEventReporterFactory implements Factory<AddressLauncherEventReporter> {
    private final Provider<DefaultAddressLauncherEventReporter> defaultAddressLauncherEventReporterProvider;

    public AutocompleteViewModelModule_Companion_ProvideEventReporterFactory(Provider<DefaultAddressLauncherEventReporter> provider) {
        this.defaultAddressLauncherEventReporterProvider = provider;
    }

    @Override // javax.inject.Provider
    public AddressLauncherEventReporter get() {
        return provideEventReporter(this.defaultAddressLauncherEventReporterProvider.get());
    }

    public static AutocompleteViewModelModule_Companion_ProvideEventReporterFactory create(javax.inject.Provider<DefaultAddressLauncherEventReporter> provider) {
        return new AutocompleteViewModelModule_Companion_ProvideEventReporterFactory(Providers.asDaggerProvider(provider));
    }

    public static AutocompleteViewModelModule_Companion_ProvideEventReporterFactory create(Provider<DefaultAddressLauncherEventReporter> provider) {
        return new AutocompleteViewModelModule_Companion_ProvideEventReporterFactory(provider);
    }

    public static AddressLauncherEventReporter provideEventReporter(DefaultAddressLauncherEventReporter defaultAddressLauncherEventReporter) {
        return (AddressLauncherEventReporter) Preconditions.checkNotNullFromProvides(AutocompleteViewModelModule.INSTANCE.provideEventReporter(defaultAddressLauncherEventReporter));
    }
}
