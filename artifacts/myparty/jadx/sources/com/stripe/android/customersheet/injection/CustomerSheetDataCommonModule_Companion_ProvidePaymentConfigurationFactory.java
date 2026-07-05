package com.stripe.android.customersheet.injection;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory implements Factory<PaymentConfiguration> {
    private final Provider<Context> appContextProvider;

    public CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.appContextProvider.get());
    }

    public static CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory create(javax.inject.Provider<Context> provider) {
        return new CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory(Providers.asDaggerProvider(provider));
    }

    public static CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory create(Provider<Context> provider) {
        return new CustomerSheetDataCommonModule_Companion_ProvidePaymentConfigurationFactory(provider);
    }

    public static PaymentConfiguration providePaymentConfiguration(Context context) {
        return (PaymentConfiguration) Preconditions.checkNotNullFromProvides(CustomerSheetDataCommonModule.INSTANCE.providePaymentConfiguration(context));
    }
}
