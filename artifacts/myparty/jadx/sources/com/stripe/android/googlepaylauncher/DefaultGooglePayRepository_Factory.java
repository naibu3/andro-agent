package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultGooglePayRepository_Factory implements Factory<DefaultGooglePayRepository> {
    private final Provider<CardBrandFilter> cardBrandFilterProvider;
    private final Provider<Context> contextProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private final Provider<Logger> loggerProvider;

    public DefaultGooglePayRepository_Factory(Provider<Context> provider, Provider<GooglePayPaymentMethodLauncher.Config> provider2, Provider<Logger> provider3, Provider<ErrorReporter> provider4, Provider<CardBrandFilter> provider5) {
        this.contextProvider = provider;
        this.googlePayConfigProvider = provider2;
        this.loggerProvider = provider3;
        this.errorReporterProvider = provider4;
        this.cardBrandFilterProvider = provider5;
    }

    @Override // javax.inject.Provider
    public DefaultGooglePayRepository get() {
        return newInstance(this.contextProvider.get(), this.googlePayConfigProvider.get(), this.loggerProvider.get(), this.errorReporterProvider.get(), this.cardBrandFilterProvider.get());
    }

    public static DefaultGooglePayRepository_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<GooglePayPaymentMethodLauncher.Config> provider2, javax.inject.Provider<Logger> provider3, javax.inject.Provider<ErrorReporter> provider4, javax.inject.Provider<CardBrandFilter> provider5) {
        return new DefaultGooglePayRepository_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static DefaultGooglePayRepository_Factory create(Provider<Context> provider, Provider<GooglePayPaymentMethodLauncher.Config> provider2, Provider<Logger> provider3, Provider<ErrorReporter> provider4, Provider<CardBrandFilter> provider5) {
        return new DefaultGooglePayRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultGooglePayRepository newInstance(Context context, GooglePayPaymentMethodLauncher.Config config, Logger logger, ErrorReporter errorReporter, CardBrandFilter cardBrandFilter) {
        return new DefaultGooglePayRepository(context, config, logger, errorReporter, cardBrandFilter);
    }
}
