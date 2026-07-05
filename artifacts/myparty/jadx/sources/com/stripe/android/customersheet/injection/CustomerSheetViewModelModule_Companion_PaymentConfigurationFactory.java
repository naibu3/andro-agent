package com.stripe.android.customersheet.injection;

import android.app.Application;
import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_PaymentConfigurationFactory implements Factory<PaymentConfiguration> {
    private final Provider<Application> applicationProvider;

    public CustomerSheetViewModelModule_Companion_PaymentConfigurationFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentConfiguration get() {
        return paymentConfiguration(this.applicationProvider.get());
    }

    public static CustomerSheetViewModelModule_Companion_PaymentConfigurationFactory create(javax.inject.Provider<Application> provider) {
        return new CustomerSheetViewModelModule_Companion_PaymentConfigurationFactory(Providers.asDaggerProvider(provider));
    }

    public static CustomerSheetViewModelModule_Companion_PaymentConfigurationFactory create(Provider<Application> provider) {
        return new CustomerSheetViewModelModule_Companion_PaymentConfigurationFactory(provider);
    }

    public static PaymentConfiguration paymentConfiguration(Application application) {
        return (PaymentConfiguration) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.paymentConfiguration(application));
    }
}
