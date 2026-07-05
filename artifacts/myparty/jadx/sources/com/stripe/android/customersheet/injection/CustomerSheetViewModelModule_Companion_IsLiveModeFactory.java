package com.stripe.android.customersheet.injection;

import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_IsLiveModeFactory implements Factory<Function0<Boolean>> {
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    public CustomerSheetViewModelModule_Companion_IsLiveModeFactory(Provider<PaymentConfiguration> provider) {
        this.paymentConfigurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<Boolean> get() {
        return isLiveMode(this.paymentConfigurationProvider);
    }

    public static CustomerSheetViewModelModule_Companion_IsLiveModeFactory create(javax.inject.Provider<PaymentConfiguration> provider) {
        return new CustomerSheetViewModelModule_Companion_IsLiveModeFactory(Providers.asDaggerProvider(provider));
    }

    public static CustomerSheetViewModelModule_Companion_IsLiveModeFactory create(Provider<PaymentConfiguration> provider) {
        return new CustomerSheetViewModelModule_Companion_IsLiveModeFactory(provider);
    }

    public static Function0<Boolean> isLiveMode(javax.inject.Provider<PaymentConfiguration> provider) {
        return (Function0) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.isLiveMode(provider));
    }
}
