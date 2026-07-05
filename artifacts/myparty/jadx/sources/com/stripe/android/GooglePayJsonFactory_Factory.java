package com.stripe.android;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class GooglePayJsonFactory_Factory implements Factory<GooglePayJsonFactory> {
    private final Provider<CardBrandFilter> cardBrandFilterProvider;
    private final Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private final Provider<Function0<String>> publishableKeyProvider;
    private final Provider<Function0<String>> stripeAccountIdProvider;

    public GooglePayJsonFactory_Factory(Provider<Function0<String>> provider, Provider<Function0<String>> provider2, Provider<GooglePayPaymentMethodLauncher.Config> provider3, Provider<CardBrandFilter> provider4) {
        this.publishableKeyProvider = provider;
        this.stripeAccountIdProvider = provider2;
        this.googlePayConfigProvider = provider3;
        this.cardBrandFilterProvider = provider4;
    }

    @Override // javax.inject.Provider
    public GooglePayJsonFactory get() {
        return newInstance(this.publishableKeyProvider.get(), this.stripeAccountIdProvider.get(), this.googlePayConfigProvider.get(), this.cardBrandFilterProvider.get());
    }

    public static GooglePayJsonFactory_Factory create(javax.inject.Provider<Function0<String>> provider, javax.inject.Provider<Function0<String>> provider2, javax.inject.Provider<GooglePayPaymentMethodLauncher.Config> provider3, javax.inject.Provider<CardBrandFilter> provider4) {
        return new GooglePayJsonFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static GooglePayJsonFactory_Factory create(Provider<Function0<String>> provider, Provider<Function0<String>> provider2, Provider<GooglePayPaymentMethodLauncher.Config> provider3, Provider<CardBrandFilter> provider4) {
        return new GooglePayJsonFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static GooglePayJsonFactory newInstance(Function0<String> function0, Function0<String> function02, GooglePayPaymentMethodLauncher.Config config, CardBrandFilter cardBrandFilter) {
        return new GooglePayJsonFactory(function0, function02, config, cardBrandFilter);
    }
}
