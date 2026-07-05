package com.stripe.android.payments.paymentlauncher;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1097PaymentLauncherViewModel_Factory implements Factory<PaymentLauncherViewModel> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<ApiRequest.Options> apiRequestOptionsProvider;
    private final Provider<DefaultReturnUrl> defaultReturnUrlProvider;
    private final Provider<Boolean> isInstantAppProvider;
    private final Provider<Boolean> isPaymentIntentProvider;
    private final Provider<PaymentNextActionHandlerRegistry> nextActionHandlerRegistryProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;
    private final Provider<StripeRepository> stripeApiRepositoryProvider;
    private final Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
    private final Provider<CoroutineContext> uiContextProvider;

    public C1097PaymentLauncherViewModel_Factory(Provider<Boolean> provider, Provider<StripeRepository> provider2, Provider<PaymentNextActionHandlerRegistry> provider3, Provider<DefaultReturnUrl> provider4, Provider<ApiRequest.Options> provider5, Provider<Map<String, String>> provider6, Provider<PaymentIntentFlowResultProcessor> provider7, Provider<SetupIntentFlowResultProcessor> provider8, Provider<AnalyticsRequestExecutor> provider9, Provider<PaymentAnalyticsRequestFactory> provider10, Provider<CoroutineContext> provider11, Provider<SavedStateHandle> provider12, Provider<Boolean> provider13) {
        this.isPaymentIntentProvider = provider;
        this.stripeApiRepositoryProvider = provider2;
        this.nextActionHandlerRegistryProvider = provider3;
        this.defaultReturnUrlProvider = provider4;
        this.apiRequestOptionsProvider = provider5;
        this.threeDs1IntentReturnUrlMapProvider = provider6;
        this.paymentIntentFlowResultProcessorProvider = provider7;
        this.setupIntentFlowResultProcessorProvider = provider8;
        this.analyticsRequestExecutorProvider = provider9;
        this.paymentAnalyticsRequestFactoryProvider = provider10;
        this.uiContextProvider = provider11;
        this.savedStateHandleProvider = provider12;
        this.isInstantAppProvider = provider13;
    }

    @Override // javax.inject.Provider
    public PaymentLauncherViewModel get() {
        return newInstance(this.isPaymentIntentProvider.get().booleanValue(), this.stripeApiRepositoryProvider.get(), this.nextActionHandlerRegistryProvider.get(), this.defaultReturnUrlProvider.get(), this.apiRequestOptionsProvider, this.threeDs1IntentReturnUrlMapProvider.get(), DoubleCheck.lazy((Provider) this.paymentIntentFlowResultProcessorProvider), DoubleCheck.lazy((Provider) this.setupIntentFlowResultProcessorProvider), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.uiContextProvider.get(), this.savedStateHandleProvider.get(), this.isInstantAppProvider.get().booleanValue());
    }

    public static C1097PaymentLauncherViewModel_Factory create(javax.inject.Provider<Boolean> provider, javax.inject.Provider<StripeRepository> provider2, javax.inject.Provider<PaymentNextActionHandlerRegistry> provider3, javax.inject.Provider<DefaultReturnUrl> provider4, javax.inject.Provider<ApiRequest.Options> provider5, javax.inject.Provider<Map<String, String>> provider6, javax.inject.Provider<PaymentIntentFlowResultProcessor> provider7, javax.inject.Provider<SetupIntentFlowResultProcessor> provider8, javax.inject.Provider<AnalyticsRequestExecutor> provider9, javax.inject.Provider<PaymentAnalyticsRequestFactory> provider10, javax.inject.Provider<CoroutineContext> provider11, javax.inject.Provider<SavedStateHandle> provider12, javax.inject.Provider<Boolean> provider13) {
        return new C1097PaymentLauncherViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13));
    }

    public static C1097PaymentLauncherViewModel_Factory create(Provider<Boolean> provider, Provider<StripeRepository> provider2, Provider<PaymentNextActionHandlerRegistry> provider3, Provider<DefaultReturnUrl> provider4, Provider<ApiRequest.Options> provider5, Provider<Map<String, String>> provider6, Provider<PaymentIntentFlowResultProcessor> provider7, Provider<SetupIntentFlowResultProcessor> provider8, Provider<AnalyticsRequestExecutor> provider9, Provider<PaymentAnalyticsRequestFactory> provider10, Provider<CoroutineContext> provider11, Provider<SavedStateHandle> provider12, Provider<Boolean> provider13) {
        return new C1097PaymentLauncherViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static PaymentLauncherViewModel newInstance(boolean z, StripeRepository stripeRepository, PaymentNextActionHandlerRegistry paymentNextActionHandlerRegistry, DefaultReturnUrl defaultReturnUrl, javax.inject.Provider<ApiRequest.Options> provider, Map<String, String> map, Lazy<PaymentIntentFlowResultProcessor> lazy, Lazy<SetupIntentFlowResultProcessor> lazy2, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, CoroutineContext coroutineContext, SavedStateHandle savedStateHandle, boolean z2) {
        return new PaymentLauncherViewModel(z, stripeRepository, paymentNextActionHandlerRegistry, defaultReturnUrl, provider, map, lazy, lazy2, analyticsRequestExecutor, paymentAnalyticsRequestFactory, coroutineContext, savedStateHandle, z2);
    }
}
