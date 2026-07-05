package com.stripe.android.paymentsheet.paymentdatacollection.polling.di;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory implements Factory<PaymentConfiguration> {
    private final Provider<Context> appContextProvider;

    public PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.appContextProvider.get());
    }

    public static PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory create(javax.inject.Provider<Context> provider) {
        return new PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory(Providers.asDaggerProvider(provider));
    }

    public static PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory create(Provider<Context> provider) {
        return new PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory(provider);
    }

    public static PaymentConfiguration providePaymentConfiguration(Context context) {
        return (PaymentConfiguration) Preconditions.checkNotNullFromProvides(PollingViewModelModule.INSTANCE.providePaymentConfiguration(context));
    }
}
