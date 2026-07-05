package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory implements Factory<PlacesClientProxy> {
    private final Provider<AddressElementActivityContract.Args> argsProvider;
    private final Provider<Context> contextProvider;
    private final AddressElementViewModelModule module;

    public AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory(AddressElementViewModelModule addressElementViewModelModule, Provider<Context> provider, Provider<AddressElementActivityContract.Args> provider2) {
        this.module = addressElementViewModelModule;
        this.contextProvider = provider;
        this.argsProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PlacesClientProxy get() {
        return this.module.provideGooglePlacesClient$paymentsheet_release(this.contextProvider.get(), this.argsProvider.get());
    }

    public static AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory create(AddressElementViewModelModule addressElementViewModelModule, javax.inject.Provider<Context> provider, javax.inject.Provider<AddressElementActivityContract.Args> provider2) {
        return new AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory(addressElementViewModelModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory create(AddressElementViewModelModule addressElementViewModelModule, Provider<Context> provider, Provider<AddressElementActivityContract.Args> provider2) {
        return new AddressElementViewModelModule_ProvideGooglePlacesClient$paymentsheet_releaseFactory(addressElementViewModelModule, provider, provider2);
    }
}
