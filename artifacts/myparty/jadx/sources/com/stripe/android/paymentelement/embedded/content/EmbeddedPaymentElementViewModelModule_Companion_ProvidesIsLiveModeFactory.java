package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactory implements Factory<Function0<Boolean>> {
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    public EmbeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactory(Provider<PaymentConfiguration> provider) {
        this.paymentConfigurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<Boolean> get() {
        return providesIsLiveMode(this.paymentConfigurationProvider);
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactory create(javax.inject.Provider<PaymentConfiguration> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactory(Providers.asDaggerProvider(provider));
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactory create(Provider<PaymentConfiguration> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvidesIsLiveModeFactory(provider);
    }

    public static Function0<Boolean> providesIsLiveMode(javax.inject.Provider<PaymentConfiguration> provider) {
        return (Function0) Preconditions.checkNotNullFromProvides(EmbeddedPaymentElementViewModelModule.INSTANCE.providesIsLiveMode(provider));
    }
}
