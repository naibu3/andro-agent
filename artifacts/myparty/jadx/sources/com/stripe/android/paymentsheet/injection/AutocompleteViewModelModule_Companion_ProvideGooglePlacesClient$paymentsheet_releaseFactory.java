package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AutocompleteContract;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class AutocompleteViewModelModule_Companion_ProvideGooglePlacesClient$paymentsheet_releaseFactory implements Factory<PlacesClientProxy> {
    private final Provider<AutocompleteContract.Args> argsProvider;
    private final Provider<Context> contextProvider;

    public AutocompleteViewModelModule_Companion_ProvideGooglePlacesClient$paymentsheet_releaseFactory(Provider<Context> provider, Provider<AutocompleteContract.Args> provider2) {
        this.contextProvider = provider;
        this.argsProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PlacesClientProxy get() {
        return provideGooglePlacesClient$paymentsheet_release(this.contextProvider.get(), this.argsProvider.get());
    }

    public static AutocompleteViewModelModule_Companion_ProvideGooglePlacesClient$paymentsheet_releaseFactory create(javax.inject.Provider<Context> provider, javax.inject.Provider<AutocompleteContract.Args> provider2) {
        return new AutocompleteViewModelModule_Companion_ProvideGooglePlacesClient$paymentsheet_releaseFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static AutocompleteViewModelModule_Companion_ProvideGooglePlacesClient$paymentsheet_releaseFactory create(Provider<Context> provider, Provider<AutocompleteContract.Args> provider2) {
        return new AutocompleteViewModelModule_Companion_ProvideGooglePlacesClient$paymentsheet_releaseFactory(provider, provider2);
    }

    public static PlacesClientProxy provideGooglePlacesClient$paymentsheet_release(Context context, AutocompleteContract.Args args) {
        return (PlacesClientProxy) Preconditions.checkNotNullFromProvides(AutocompleteViewModelModule.INSTANCE.provideGooglePlacesClient$paymentsheet_release(context, args));
    }
}
