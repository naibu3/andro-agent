package com.stripe.android.paymentsheet.injection;

import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModelModule_IsLiveModeFactory implements Factory<Function0<Boolean>> {
    private final PaymentSheetViewModelModule module;
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    public PaymentSheetViewModelModule_IsLiveModeFactory(PaymentSheetViewModelModule paymentSheetViewModelModule, Provider<PaymentConfiguration> provider) {
        this.module = paymentSheetViewModelModule;
        this.paymentConfigurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<Boolean> get() {
        return isLiveMode(this.module, this.paymentConfigurationProvider);
    }

    public static PaymentSheetViewModelModule_IsLiveModeFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule, javax.inject.Provider<PaymentConfiguration> provider) {
        return new PaymentSheetViewModelModule_IsLiveModeFactory(paymentSheetViewModelModule, Providers.asDaggerProvider(provider));
    }

    public static PaymentSheetViewModelModule_IsLiveModeFactory create(PaymentSheetViewModelModule paymentSheetViewModelModule, Provider<PaymentConfiguration> provider) {
        return new PaymentSheetViewModelModule_IsLiveModeFactory(paymentSheetViewModelModule, provider);
    }

    public static Function0<Boolean> isLiveMode(PaymentSheetViewModelModule paymentSheetViewModelModule, javax.inject.Provider<PaymentConfiguration> provider) {
        return (Function0) Preconditions.checkNotNullFromProvides(paymentSheetViewModelModule.isLiveMode(provider));
    }
}
