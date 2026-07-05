package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1118AutocompleteViewModel_Factory implements Factory<AutocompleteViewModel> {
    private final Provider<Application> applicationProvider;
    private final Provider<AutocompleteViewModel.Args> autocompleteArgsProvider;
    private final Provider<AddressLauncherEventReporter> eventReporterProvider;
    private final Provider<PlacesClientProxy> placesClientProvider;

    public C1118AutocompleteViewModel_Factory(Provider<PlacesClientProxy> provider, Provider<AutocompleteViewModel.Args> provider2, Provider<AddressLauncherEventReporter> provider3, Provider<Application> provider4) {
        this.placesClientProvider = provider;
        this.autocompleteArgsProvider = provider2;
        this.eventReporterProvider = provider3;
        this.applicationProvider = provider4;
    }

    @Override // javax.inject.Provider
    public AutocompleteViewModel get() {
        return newInstance(this.placesClientProvider.get(), this.autocompleteArgsProvider.get(), this.eventReporterProvider.get(), this.applicationProvider.get());
    }

    public static C1118AutocompleteViewModel_Factory create(javax.inject.Provider<PlacesClientProxy> provider, javax.inject.Provider<AutocompleteViewModel.Args> provider2, javax.inject.Provider<AddressLauncherEventReporter> provider3, javax.inject.Provider<Application> provider4) {
        return new C1118AutocompleteViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static C1118AutocompleteViewModel_Factory create(Provider<PlacesClientProxy> provider, Provider<AutocompleteViewModel.Args> provider2, Provider<AddressLauncherEventReporter> provider3, Provider<Application> provider4) {
        return new C1118AutocompleteViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static AutocompleteViewModel newInstance(PlacesClientProxy placesClientProxy, AutocompleteViewModel.Args args, AddressLauncherEventReporter addressLauncherEventReporter, Application application) {
        return new AutocompleteViewModel(placesClientProxy, args, addressLauncherEventReporter, application);
    }
}
