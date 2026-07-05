package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory implements Factory<PaymentConfiguration> {
    private final Provider<Context> appContextProvider;
    private final USBankAccountFormViewModelModule module;

    public USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Context> provider) {
        this.module = uSBankAccountFormViewModelModule;
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.module, this.appContextProvider.get());
    }

    public static USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, javax.inject.Provider<Context> provider) {
        return new USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory(uSBankAccountFormViewModelModule, Providers.asDaggerProvider(provider));
    }

    public static USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory create(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Provider<Context> provider) {
        return new USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory(uSBankAccountFormViewModelModule, provider);
    }

    public static PaymentConfiguration providePaymentConfiguration(USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, Context context) {
        return (PaymentConfiguration) Preconditions.checkNotNullFromProvides(uSBankAccountFormViewModelModule.providePaymentConfiguration(context));
    }
}
