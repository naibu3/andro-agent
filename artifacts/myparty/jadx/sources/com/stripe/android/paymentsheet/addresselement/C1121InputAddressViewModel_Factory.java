package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1121InputAddressViewModel_Factory implements Factory<InputAddressViewModel> {
    private final Provider<AddressElementActivityContract.Args> argsProvider;
    private final Provider<AddressLauncherEventReporter> eventReporterProvider;
    private final Provider<AddressElementNavigator> navigatorProvider;

    public C1121InputAddressViewModel_Factory(Provider<AddressElementActivityContract.Args> provider, Provider<AddressElementNavigator> provider2, Provider<AddressLauncherEventReporter> provider3) {
        this.argsProvider = provider;
        this.navigatorProvider = provider2;
        this.eventReporterProvider = provider3;
    }

    @Override // javax.inject.Provider
    public InputAddressViewModel get() {
        return newInstance(this.argsProvider.get(), this.navigatorProvider.get(), this.eventReporterProvider.get());
    }

    public static C1121InputAddressViewModel_Factory create(javax.inject.Provider<AddressElementActivityContract.Args> provider, javax.inject.Provider<AddressElementNavigator> provider2, javax.inject.Provider<AddressLauncherEventReporter> provider3) {
        return new C1121InputAddressViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static C1121InputAddressViewModel_Factory create(Provider<AddressElementActivityContract.Args> provider, Provider<AddressElementNavigator> provider2, Provider<AddressLauncherEventReporter> provider3) {
        return new C1121InputAddressViewModel_Factory(provider, provider2, provider3);
    }

    public static InputAddressViewModel newInstance(AddressElementActivityContract.Args args, AddressElementNavigator addressElementNavigator, AddressLauncherEventReporter addressLauncherEventReporter) {
        return new InputAddressViewModel(args, addressElementNavigator, addressLauncherEventReporter);
    }
}
