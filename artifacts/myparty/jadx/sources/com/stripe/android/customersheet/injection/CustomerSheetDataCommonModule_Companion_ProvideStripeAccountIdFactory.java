package com.stripe.android.customersheet.injection;

import com.stripe.android.PaymentConfiguration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class CustomerSheetDataCommonModule_Companion_ProvideStripeAccountIdFactory implements Factory<Function0<String>> {
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    public CustomerSheetDataCommonModule_Companion_ProvideStripeAccountIdFactory(Provider<PaymentConfiguration> provider) {
        this.paymentConfigurationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function0<String> get() {
        return provideStripeAccountId(this.paymentConfigurationProvider);
    }

    public static CustomerSheetDataCommonModule_Companion_ProvideStripeAccountIdFactory create(javax.inject.Provider<PaymentConfiguration> provider) {
        return new CustomerSheetDataCommonModule_Companion_ProvideStripeAccountIdFactory(Providers.asDaggerProvider(provider));
    }

    public static CustomerSheetDataCommonModule_Companion_ProvideStripeAccountIdFactory create(Provider<PaymentConfiguration> provider) {
        return new CustomerSheetDataCommonModule_Companion_ProvideStripeAccountIdFactory(provider);
    }

    public static Function0<String> provideStripeAccountId(javax.inject.Provider<PaymentConfiguration> provider) {
        return (Function0) Preconditions.checkNotNullFromProvides(CustomerSheetDataCommonModule.INSTANCE.provideStripeAccountId(provider));
    }
}
