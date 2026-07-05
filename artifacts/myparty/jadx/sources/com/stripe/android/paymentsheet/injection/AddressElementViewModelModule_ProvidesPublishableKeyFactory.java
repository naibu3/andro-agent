package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class AddressElementViewModelModule_ProvidesPublishableKeyFactory implements Factory<String> {
    private final Provider<AddressElementActivityContract.Args> argsProvider;
    private final AddressElementViewModelModule module;

    public AddressElementViewModelModule_ProvidesPublishableKeyFactory(AddressElementViewModelModule addressElementViewModelModule, Provider<AddressElementActivityContract.Args> provider) {
        this.module = addressElementViewModelModule;
        this.argsProvider = provider;
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesPublishableKey(this.module, this.argsProvider.get());
    }

    public static AddressElementViewModelModule_ProvidesPublishableKeyFactory create(AddressElementViewModelModule addressElementViewModelModule, javax.inject.Provider<AddressElementActivityContract.Args> provider) {
        return new AddressElementViewModelModule_ProvidesPublishableKeyFactory(addressElementViewModelModule, Providers.asDaggerProvider(provider));
    }

    public static AddressElementViewModelModule_ProvidesPublishableKeyFactory create(AddressElementViewModelModule addressElementViewModelModule, Provider<AddressElementActivityContract.Args> provider) {
        return new AddressElementViewModelModule_ProvidesPublishableKeyFactory(addressElementViewModelModule, provider);
    }

    public static String providesPublishableKey(AddressElementViewModelModule addressElementViewModelModule, AddressElementActivityContract.Args args) {
        return (String) Preconditions.checkNotNullFromProvides(addressElementViewModelModule.providesPublishableKey(args));
    }
}
