package com.stripe.android.paymentelement.confirmation.gpay;

import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class GooglePayConfirmationDefinition_Factory implements Factory<GooglePayConfirmationDefinition> {
    private final Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
    private final Provider<UserFacingLogger> userFacingLoggerProvider;

    public GooglePayConfirmationDefinition_Factory(Provider<GooglePayPaymentMethodLauncherFactory> provider, Provider<UserFacingLogger> provider2) {
        this.googlePayPaymentMethodLauncherFactoryProvider = provider;
        this.userFacingLoggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public GooglePayConfirmationDefinition get() {
        return newInstance(this.googlePayPaymentMethodLauncherFactoryProvider.get(), this.userFacingLoggerProvider.get());
    }

    public static GooglePayConfirmationDefinition_Factory create(javax.inject.Provider<GooglePayPaymentMethodLauncherFactory> provider, javax.inject.Provider<UserFacingLogger> provider2) {
        return new GooglePayConfirmationDefinition_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static GooglePayConfirmationDefinition_Factory create(Provider<GooglePayPaymentMethodLauncherFactory> provider, Provider<UserFacingLogger> provider2) {
        return new GooglePayConfirmationDefinition_Factory(provider, provider2);
    }

    public static GooglePayConfirmationDefinition newInstance(GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, UserFacingLogger userFacingLogger) {
        return new GooglePayConfirmationDefinition(googlePayPaymentMethodLauncherFactory, userFacingLogger);
    }
}
