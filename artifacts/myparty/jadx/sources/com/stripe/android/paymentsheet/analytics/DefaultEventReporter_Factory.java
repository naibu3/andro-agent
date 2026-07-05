package com.stripe.android.paymentsheet.analytics;

import android.content.Context;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class DefaultEventReporter_Factory implements Factory<DefaultEventReporter> {
    private final Provider<AnalyticEventCallback> analyticEventCallbackProvider;
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<AnalyticsRequestV2Executor> analyticsRequestV2ExecutorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<DurationProvider> durationProvider;
    private final Provider<IsStripeCardScanAvailable> isStripeCardScanAvailableProvider;
    private final Provider<UserFacingLogger> loggerProvider;
    private final Provider<EventReporter.Mode> modeProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public DefaultEventReporter_Factory(Provider<Context> provider, Provider<EventReporter.Mode> provider2, Provider<AnalyticsRequestExecutor> provider3, Provider<AnalyticsRequestV2Executor> provider4, Provider<PaymentAnalyticsRequestFactory> provider5, Provider<DurationProvider> provider6, Provider<AnalyticEventCallback> provider7, Provider<CoroutineContext> provider8, Provider<IsStripeCardScanAvailable> provider9, Provider<UserFacingLogger> provider10) {
        this.contextProvider = provider;
        this.modeProvider = provider2;
        this.analyticsRequestExecutorProvider = provider3;
        this.analyticsRequestV2ExecutorProvider = provider4;
        this.paymentAnalyticsRequestFactoryProvider = provider5;
        this.durationProvider = provider6;
        this.analyticEventCallbackProvider = provider7;
        this.workContextProvider = provider8;
        this.isStripeCardScanAvailableProvider = provider9;
        this.loggerProvider = provider10;
    }

    @Override // javax.inject.Provider
    public DefaultEventReporter get() {
        return newInstance(this.contextProvider.get(), this.modeProvider.get(), this.analyticsRequestExecutorProvider.get(), this.analyticsRequestV2ExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.durationProvider.get(), this.analyticEventCallbackProvider, this.workContextProvider.get(), this.isStripeCardScanAvailableProvider.get(), this.loggerProvider.get());
    }

    public static DefaultEventReporter_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<EventReporter.Mode> provider2, javax.inject.Provider<AnalyticsRequestExecutor> provider3, javax.inject.Provider<AnalyticsRequestV2Executor> provider4, javax.inject.Provider<PaymentAnalyticsRequestFactory> provider5, javax.inject.Provider<DurationProvider> provider6, javax.inject.Provider<AnalyticEventCallback> provider7, javax.inject.Provider<CoroutineContext> provider8, javax.inject.Provider<IsStripeCardScanAvailable> provider9, javax.inject.Provider<UserFacingLogger> provider10) {
        return new DefaultEventReporter_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10));
    }

    public static DefaultEventReporter_Factory create(Provider<Context> provider, Provider<EventReporter.Mode> provider2, Provider<AnalyticsRequestExecutor> provider3, Provider<AnalyticsRequestV2Executor> provider4, Provider<PaymentAnalyticsRequestFactory> provider5, Provider<DurationProvider> provider6, Provider<AnalyticEventCallback> provider7, Provider<CoroutineContext> provider8, Provider<IsStripeCardScanAvailable> provider9, Provider<UserFacingLogger> provider10) {
        return new DefaultEventReporter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static DefaultEventReporter newInstance(Context context, EventReporter.Mode mode, AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestV2Executor analyticsRequestV2Executor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, DurationProvider durationProvider, javax.inject.Provider<AnalyticEventCallback> provider, CoroutineContext coroutineContext, IsStripeCardScanAvailable isStripeCardScanAvailable, UserFacingLogger userFacingLogger) {
        return new DefaultEventReporter(context, mode, analyticsRequestExecutor, analyticsRequestV2Executor, paymentAnalyticsRequestFactory, durationProvider, provider, coroutineContext, isStripeCardScanAvailable, userFacingLogger);
    }
}
