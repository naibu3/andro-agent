package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FlowControllerModule_ProvideIsLiveModeFactory implements Factory<Function0<Boolean>> {
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    public FlowControllerModule_ProvideIsLiveModeFactory(Provider<PaymentConfiguration> provider) {
        this.paymentConfigurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<Boolean> get() {
        return provideIsLiveMode(this.paymentConfigurationProvider);
    }

    public static FlowControllerModule_ProvideIsLiveModeFactory create(javax.inject.Provider<PaymentConfiguration> provider) {
        return new FlowControllerModule_ProvideIsLiveModeFactory(Providers.asDaggerProvider(provider));
    }

    public static FlowControllerModule_ProvideIsLiveModeFactory create(Provider<PaymentConfiguration> provider) {
        return new FlowControllerModule_ProvideIsLiveModeFactory(provider);
    }

    public static Function0<Boolean> provideIsLiveMode(javax.inject.Provider<PaymentConfiguration> provider) {
        return (Function0) Preconditions.checkNotNullFromProvides(FlowControllerModule.INSTANCE.provideIsLiveMode(provider));
    }
}
