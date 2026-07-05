package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory implements Factory<PaymentConfiguration> {
    private final Provider<Context> appContextProvider;

    public PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.appContextProvider.get());
    }

    public static PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory create(javax.inject.Provider<Context> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory(Providers.asDaggerProvider(provider));
    }

    public static PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory create(Provider<Context> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory(provider);
    }

    public static PaymentConfiguration providePaymentConfiguration(Context context) {
        return (PaymentConfiguration) Preconditions.checkNotNullFromProvides(PaymentSheetCommonModule.INSTANCE.providePaymentConfiguration(context));
    }
}
