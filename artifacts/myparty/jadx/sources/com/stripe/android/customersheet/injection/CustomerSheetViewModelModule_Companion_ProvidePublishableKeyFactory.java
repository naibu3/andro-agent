package com.stripe.android.customersheet.injection;

import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory implements Factory<Function0<String>> {
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    public CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory(Provider<PaymentConfiguration> provider) {
        this.paymentConfigurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<String> get() {
        return providePublishableKey(this.paymentConfigurationProvider);
    }

    public static CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory create(javax.inject.Provider<PaymentConfiguration> provider) {
        return new CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory(Providers.asDaggerProvider(provider));
    }

    public static CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory create(Provider<PaymentConfiguration> provider) {
        return new CustomerSheetViewModelModule_Companion_ProvidePublishableKeyFactory(provider);
    }

    public static Function0<String> providePublishableKey(javax.inject.Provider<PaymentConfiguration> provider) {
        return (Function0) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.providePublishableKey(provider));
    }
}
