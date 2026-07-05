package com.stripe.android.googlepaylauncher.injection;

import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory implements Factory<PaymentsClient> {
    private final Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private final Provider<PaymentsClientFactory> paymentsClientFactoryProvider;

    public GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory(Provider<GooglePayPaymentMethodLauncher.Config> provider, Provider<PaymentsClientFactory> provider2) {
        this.googlePayConfigProvider = provider;
        this.paymentsClientFactoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PaymentsClient get() {
        return providePaymentsClient(this.googlePayConfigProvider.get(), this.paymentsClientFactoryProvider.get());
    }

    public static GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory create(javax.inject.Provider<GooglePayPaymentMethodLauncher.Config> provider, javax.inject.Provider<PaymentsClientFactory> provider2) {
        return new GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory create(Provider<GooglePayPaymentMethodLauncher.Config> provider, Provider<PaymentsClientFactory> provider2) {
        return new GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory(provider, provider2);
    }

    public static PaymentsClient providePaymentsClient(GooglePayPaymentMethodLauncher.Config config, PaymentsClientFactory paymentsClientFactory) {
        return (PaymentsClient) Preconditions.checkNotNullFromProvides(GooglePayPaymentMethodLauncherModule.INSTANCE.providePaymentsClient(config, paymentsClientFactory));
    }
}
