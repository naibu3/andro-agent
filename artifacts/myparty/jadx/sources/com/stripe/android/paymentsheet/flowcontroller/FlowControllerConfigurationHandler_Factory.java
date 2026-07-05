package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FlowControllerConfigurationHandler_Factory implements Factory<FlowControllerConfigurationHandler> {
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<Function0<Boolean>> isLiveModeProvider;
    private final Provider<PaymentElementLoader> paymentElementLoaderProvider;
    private final Provider<PaymentSelectionUpdater> paymentSelectionUpdaterProvider;
    private final Provider<CoroutineContext> uiContextProvider;
    private final Provider<FlowControllerViewModel> viewModelProvider;

    public FlowControllerConfigurationHandler_Factory(Provider<PaymentElementLoader> provider, Provider<CoroutineContext> provider2, Provider<EventReporter> provider3, Provider<FlowControllerViewModel> provider4, Provider<PaymentSelectionUpdater> provider5, Provider<Function0<Boolean>> provider6) {
        this.paymentElementLoaderProvider = provider;
        this.uiContextProvider = provider2;
        this.eventReporterProvider = provider3;
        this.viewModelProvider = provider4;
        this.paymentSelectionUpdaterProvider = provider5;
        this.isLiveModeProvider = provider6;
    }

    @Override // javax.inject.Provider
    public FlowControllerConfigurationHandler get() {
        return newInstance(this.paymentElementLoaderProvider.get(), this.uiContextProvider.get(), this.eventReporterProvider.get(), this.viewModelProvider.get(), this.paymentSelectionUpdaterProvider.get(), this.isLiveModeProvider.get());
    }

    public static FlowControllerConfigurationHandler_Factory create(javax.inject.Provider<PaymentElementLoader> provider, javax.inject.Provider<CoroutineContext> provider2, javax.inject.Provider<EventReporter> provider3, javax.inject.Provider<FlowControllerViewModel> provider4, javax.inject.Provider<PaymentSelectionUpdater> provider5, javax.inject.Provider<Function0<Boolean>> provider6) {
        return new FlowControllerConfigurationHandler_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static FlowControllerConfigurationHandler_Factory create(Provider<PaymentElementLoader> provider, Provider<CoroutineContext> provider2, Provider<EventReporter> provider3, Provider<FlowControllerViewModel> provider4, Provider<PaymentSelectionUpdater> provider5, Provider<Function0<Boolean>> provider6) {
        return new FlowControllerConfigurationHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static FlowControllerConfigurationHandler newInstance(PaymentElementLoader paymentElementLoader, CoroutineContext coroutineContext, EventReporter eventReporter, FlowControllerViewModel flowControllerViewModel, PaymentSelectionUpdater paymentSelectionUpdater, Function0<Boolean> function0) {
        return new FlowControllerConfigurationHandler(paymentElementLoader, coroutineContext, eventReporter, flowControllerViewModel, paymentSelectionUpdater, function0);
    }
}
