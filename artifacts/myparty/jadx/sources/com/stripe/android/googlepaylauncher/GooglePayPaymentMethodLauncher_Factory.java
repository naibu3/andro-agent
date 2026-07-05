package com.stripe.android.googlepaylauncher;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class GooglePayPaymentMethodLauncher_Factory {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<Function1<GooglePayEnvironment, GooglePayRepository>> googlePayRepositoryFactoryProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;

    public GooglePayPaymentMethodLauncher_Factory(Provider<Context> provider, Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<AnalyticsRequestExecutor> provider4) {
        this.contextProvider = provider;
        this.googlePayRepositoryFactoryProvider = provider2;
        this.paymentAnalyticsRequestFactoryProvider = provider3;
        this.analyticsRequestExecutorProvider = provider4;
    }

    public GooglePayPaymentMethodLauncher get(CoroutineScope coroutineScope, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, boolean z, CardBrandFilter cardBrandFilter) {
        return newInstance(coroutineScope, config, readyCallback, activityResultLauncher, z, this.contextProvider.get(), this.googlePayRepositoryFactoryProvider.get(), cardBrandFilter, this.paymentAnalyticsRequestFactoryProvider.get(), this.analyticsRequestExecutorProvider.get());
    }

    public static GooglePayPaymentMethodLauncher_Factory create(javax.inject.Provider<Context> provider, javax.inject.Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provider2, javax.inject.Provider<PaymentAnalyticsRequestFactory> provider3, javax.inject.Provider<AnalyticsRequestExecutor> provider4) {
        return new GooglePayPaymentMethodLauncher_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static GooglePayPaymentMethodLauncher_Factory create(Provider<Context> provider, Provider<Function1<GooglePayEnvironment, GooglePayRepository>> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<AnalyticsRequestExecutor> provider4) {
        return new GooglePayPaymentMethodLauncher_Factory(provider, provider2, provider3, provider4);
    }

    public static GooglePayPaymentMethodLauncher newInstance(CoroutineScope coroutineScope, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, boolean z, Context context, Function1<GooglePayEnvironment, GooglePayRepository> function1, CardBrandFilter cardBrandFilter, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor) {
        return new GooglePayPaymentMethodLauncher(coroutineScope, config, readyCallback, activityResultLauncher, z, context, function1, cardBrandFilter, paymentAnalyticsRequestFactory, analyticsRequestExecutor);
    }
}
