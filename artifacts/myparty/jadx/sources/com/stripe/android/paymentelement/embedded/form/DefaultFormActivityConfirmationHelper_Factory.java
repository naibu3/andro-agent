package com.stripe.android.paymentelement.embedded.form;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class DefaultFormActivityConfirmationHelper_Factory implements Factory<DefaultFormActivityConfirmationHelper> {
    private final Provider<ActivityResultCaller> activityResultCallerProvider;
    private final Provider<EmbeddedPaymentElement.Configuration> configurationProvider;
    private final Provider<ConfirmationHandler> confirmationHandlerProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<PaymentElementLoader.InitializationMode> initializationModeProvider;
    private final Provider<LifecycleOwner> lifecycleOwnerProvider;
    private final Provider<OnClickOverrideDelegate> onClickDelegateProvider;
    private final Provider<PaymentMethodMetadata> paymentMethodMetadataProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;
    private final Provider<FormActivityStateHelper> stateHelperProvider;

    public DefaultFormActivityConfirmationHelper_Factory(Provider<PaymentElementLoader.InitializationMode> provider, Provider<PaymentMethodMetadata> provider2, Provider<ConfirmationHandler> provider3, Provider<EmbeddedPaymentElement.Configuration> provider4, Provider<EmbeddedSelectionHolder> provider5, Provider<FormActivityStateHelper> provider6, Provider<OnClickOverrideDelegate> provider7, Provider<EventReporter> provider8, Provider<LifecycleOwner> provider9, Provider<ActivityResultCaller> provider10, Provider<CoroutineScope> provider11) {
        this.initializationModeProvider = provider;
        this.paymentMethodMetadataProvider = provider2;
        this.confirmationHandlerProvider = provider3;
        this.configurationProvider = provider4;
        this.selectionHolderProvider = provider5;
        this.stateHelperProvider = provider6;
        this.onClickDelegateProvider = provider7;
        this.eventReporterProvider = provider8;
        this.lifecycleOwnerProvider = provider9;
        this.activityResultCallerProvider = provider10;
        this.coroutineScopeProvider = provider11;
    }

    @Override // javax.inject.Provider
    public DefaultFormActivityConfirmationHelper get() {
        return newInstance(this.initializationModeProvider.get(), this.paymentMethodMetadataProvider.get(), this.confirmationHandlerProvider.get(), this.configurationProvider.get(), this.selectionHolderProvider.get(), this.stateHelperProvider.get(), this.onClickDelegateProvider.get(), this.eventReporterProvider.get(), this.lifecycleOwnerProvider.get(), this.activityResultCallerProvider.get(), this.coroutineScopeProvider.get());
    }

    public static DefaultFormActivityConfirmationHelper_Factory create(javax.inject.Provider<PaymentElementLoader.InitializationMode> provider, javax.inject.Provider<PaymentMethodMetadata> provider2, javax.inject.Provider<ConfirmationHandler> provider3, javax.inject.Provider<EmbeddedPaymentElement.Configuration> provider4, javax.inject.Provider<EmbeddedSelectionHolder> provider5, javax.inject.Provider<FormActivityStateHelper> provider6, javax.inject.Provider<OnClickOverrideDelegate> provider7, javax.inject.Provider<EventReporter> provider8, javax.inject.Provider<LifecycleOwner> provider9, javax.inject.Provider<ActivityResultCaller> provider10, javax.inject.Provider<CoroutineScope> provider11) {
        return new DefaultFormActivityConfirmationHelper_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11));
    }

    public static DefaultFormActivityConfirmationHelper_Factory create(Provider<PaymentElementLoader.InitializationMode> provider, Provider<PaymentMethodMetadata> provider2, Provider<ConfirmationHandler> provider3, Provider<EmbeddedPaymentElement.Configuration> provider4, Provider<EmbeddedSelectionHolder> provider5, Provider<FormActivityStateHelper> provider6, Provider<OnClickOverrideDelegate> provider7, Provider<EventReporter> provider8, Provider<LifecycleOwner> provider9, Provider<ActivityResultCaller> provider10, Provider<CoroutineScope> provider11) {
        return new DefaultFormActivityConfirmationHelper_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static DefaultFormActivityConfirmationHelper newInstance(PaymentElementLoader.InitializationMode initializationMode, PaymentMethodMetadata paymentMethodMetadata, ConfirmationHandler confirmationHandler, EmbeddedPaymentElement.Configuration configuration, EmbeddedSelectionHolder embeddedSelectionHolder, FormActivityStateHelper formActivityStateHelper, OnClickOverrideDelegate onClickOverrideDelegate, EventReporter eventReporter, LifecycleOwner lifecycleOwner, ActivityResultCaller activityResultCaller, CoroutineScope coroutineScope) {
        return new DefaultFormActivityConfirmationHelper(initializationMode, paymentMethodMetadata, confirmationHandler, configuration, embeddedSelectionHolder, formActivityStateHelper, onClickOverrideDelegate, eventReporter, lifecycleOwner, activityResultCaller, coroutineScope);
    }
}
