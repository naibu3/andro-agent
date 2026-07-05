package com.stripe.android.paymentelement.embedded;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory implements Factory<PaymentConfiguration> {
    private final Provider<Context> appContextProvider;

    public EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentConfiguration get() {
        return providePaymentConfiguration(this.appContextProvider.get());
    }

    public static EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory create(javax.inject.Provider<Context> provider) {
        return new EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory(Providers.asDaggerProvider(provider));
    }

    public static EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory create(Provider<Context> provider) {
        return new EmbeddedCommonModule_Companion_ProvidePaymentConfigurationFactory(provider);
    }

    public static PaymentConfiguration providePaymentConfiguration(Context context) {
        return (PaymentConfiguration) Preconditions.checkNotNullFromProvides(EmbeddedCommonModule.INSTANCE.providePaymentConfiguration(context));
    }
}
