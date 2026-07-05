package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1127USBankAccountFormViewModel_Factory implements Factory<USBankAccountFormViewModel> {
    private final Provider<Application> applicationProvider;
    private final Provider<USBankAccountFormViewModel.Args> argsProvider;
    private final Provider<AutocompleteAddressInteractor.Factory> autocompleteAddressInteractorFactoryProvider;
    private final Provider<PaymentConfiguration> lazyPaymentConfigProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public C1127USBankAccountFormViewModel_Factory(Provider<USBankAccountFormViewModel.Args> provider, Provider<Application> provider2, Provider<PaymentConfiguration> provider3, Provider<SavedStateHandle> provider4, Provider<AutocompleteAddressInteractor.Factory> provider5) {
        this.argsProvider = provider;
        this.applicationProvider = provider2;
        this.lazyPaymentConfigProvider = provider3;
        this.savedStateHandleProvider = provider4;
        this.autocompleteAddressInteractorFactoryProvider = provider5;
    }

    @Override // javax.inject.Provider
    public USBankAccountFormViewModel get() {
        return newInstance(this.argsProvider.get(), this.applicationProvider.get(), this.lazyPaymentConfigProvider, this.savedStateHandleProvider.get(), this.autocompleteAddressInteractorFactoryProvider.get());
    }

    public static C1127USBankAccountFormViewModel_Factory create(javax.inject.Provider<USBankAccountFormViewModel.Args> provider, javax.inject.Provider<Application> provider2, javax.inject.Provider<PaymentConfiguration> provider3, javax.inject.Provider<SavedStateHandle> provider4, javax.inject.Provider<AutocompleteAddressInteractor.Factory> provider5) {
        return new C1127USBankAccountFormViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static C1127USBankAccountFormViewModel_Factory create(Provider<USBankAccountFormViewModel.Args> provider, Provider<Application> provider2, Provider<PaymentConfiguration> provider3, Provider<SavedStateHandle> provider4, Provider<AutocompleteAddressInteractor.Factory> provider5) {
        return new C1127USBankAccountFormViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static USBankAccountFormViewModel newInstance(USBankAccountFormViewModel.Args args, Application application, javax.inject.Provider<PaymentConfiguration> provider, SavedStateHandle savedStateHandle, AutocompleteAddressInteractor.Factory factory) {
        return new USBankAccountFormViewModel(args, application, provider, savedStateHandle, factory);
    }
}
