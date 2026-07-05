package com.stripe.android.paymentsheet.injection;

import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory implements Factory<Function0<String>> {
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    public PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory(Provider<PaymentConfiguration> provider) {
        this.paymentConfigurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<String> get() {
        return providePublishableKey(this.paymentConfigurationProvider);
    }

    public static PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory create(javax.inject.Provider<PaymentConfiguration> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory(Providers.asDaggerProvider(provider));
    }

    public static PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory create(Provider<PaymentConfiguration> provider) {
        return new PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory(provider);
    }

    public static Function0<String> providePublishableKey(javax.inject.Provider<PaymentConfiguration> provider) {
        return (Function0) Preconditions.checkNotNullFromProvides(PaymentSheetCommonModule.INSTANCE.providePublishableKey(provider));
    }
}
