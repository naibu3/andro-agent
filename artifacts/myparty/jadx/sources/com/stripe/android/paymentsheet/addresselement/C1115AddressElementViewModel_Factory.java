package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1115AddressElementViewModel_Factory implements Factory<AddressElementViewModel> {
    private final Provider<AutocompleteViewModelSubcomponent.Builder> autoCompleteViewModelSubcomponentBuilderProvider;
    private final Provider<InputAddressViewModelSubcomponent.Builder> inputAddressViewModelSubcomponentBuilderProvider;
    private final Provider<NavHostAddressElementNavigator> navigatorProvider;

    public C1115AddressElementViewModel_Factory(Provider<NavHostAddressElementNavigator> provider, Provider<InputAddressViewModelSubcomponent.Builder> provider2, Provider<AutocompleteViewModelSubcomponent.Builder> provider3) {
        this.navigatorProvider = provider;
        this.inputAddressViewModelSubcomponentBuilderProvider = provider2;
        this.autoCompleteViewModelSubcomponentBuilderProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AddressElementViewModel get() {
        return newInstance(this.navigatorProvider.get(), this.inputAddressViewModelSubcomponentBuilderProvider, this.autoCompleteViewModelSubcomponentBuilderProvider);
    }

    public static C1115AddressElementViewModel_Factory create(javax.inject.Provider<NavHostAddressElementNavigator> provider, javax.inject.Provider<InputAddressViewModelSubcomponent.Builder> provider2, javax.inject.Provider<AutocompleteViewModelSubcomponent.Builder> provider3) {
        return new C1115AddressElementViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static C1115AddressElementViewModel_Factory create(Provider<NavHostAddressElementNavigator> provider, Provider<InputAddressViewModelSubcomponent.Builder> provider2, Provider<AutocompleteViewModelSubcomponent.Builder> provider3) {
        return new C1115AddressElementViewModel_Factory(provider, provider2, provider3);
    }

    public static AddressElementViewModel newInstance(NavHostAddressElementNavigator navHostAddressElementNavigator, javax.inject.Provider<InputAddressViewModelSubcomponent.Builder> provider, javax.inject.Provider<AutocompleteViewModelSubcomponent.Builder> provider2) {
        return new AddressElementViewModel(navHostAddressElementNavigator, provider, provider2);
    }
}
