package com.stripe.android.paymentsheet.flowcontroller;

import android.content.Context;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentOptionResultCallback;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class DefaultFlowController_Factory implements Factory<DefaultFlowController> {
    private final Provider<ActivityResultCaller> activityResultCallerProvider;
    private final Provider<ActivityResultRegistryOwner> activityResultRegistryOwnerProvider;
    private final Provider<FlowControllerConfigurationHandler> configurationHandlerProvider;
    private final Provider<ConfirmationHandler> confirmationHandlerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<LinkPaymentLauncher> flowControllerLinkLauncherProvider;
    private final Provider<Boolean> initializedViaComposeProvider;
    private final Provider<LifecycleOwner> lifecycleOwnerProvider;
    private final Provider<LinkAccountHolder> linkAccountHolderProvider;
    private final Provider<LinkGate.Factory> linkGateFactoryProvider;
    private final Provider<LinkHandler> linkHandlerProvider;
    private final Provider<String> paymentElementCallbackIdentifierProvider;
    private final Provider<PaymentOptionFactory> paymentOptionFactoryProvider;
    private final Provider<PaymentOptionResultCallback> paymentOptionResultCallbackProvider;
    private final Provider<PaymentSheetResultCallback> paymentResultCallbackProvider;
    private final Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> prefsRepositoryFactoryProvider;
    private final Provider<Set<String>> productUsageProvider;
    private final Provider<FlowControllerViewModel> viewModelProvider;
    private final Provider<CoroutineScope> viewModelScopeProvider;
    private final Provider<LinkPaymentLauncher> walletsButtonLinkLauncherProvider;

    public DefaultFlowController_Factory(Provider<CoroutineScope> provider, Provider<LifecycleOwner> provider2, Provider<PaymentOptionFactory> provider3, Provider<PaymentOptionResultCallback> provider4, Provider<PaymentSheetResultCallback> provider5, Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider6, Provider<ActivityResultCaller> provider7, Provider<ActivityResultRegistryOwner> provider8, Provider<Context> provider9, Provider<EventReporter> provider10, Provider<FlowControllerViewModel> provider11, Provider<ConfirmationHandler> provider12, Provider<LinkGate.Factory> provider13, Provider<LinkHandler> provider14, Provider<LinkAccountHolder> provider15, Provider<LinkPaymentLauncher> provider16, Provider<LinkPaymentLauncher> provider17, Provider<Boolean> provider18, Provider<Set<String>> provider19, Provider<FlowControllerConfigurationHandler> provider20, Provider<ErrorReporter> provider21, Provider<Boolean> provider22, Provider<String> provider23) {
        this.viewModelScopeProvider = provider;
        this.lifecycleOwnerProvider = provider2;
        this.paymentOptionFactoryProvider = provider3;
        this.paymentOptionResultCallbackProvider = provider4;
        this.paymentResultCallbackProvider = provider5;
        this.prefsRepositoryFactoryProvider = provider6;
        this.activityResultCallerProvider = provider7;
        this.activityResultRegistryOwnerProvider = provider8;
        this.contextProvider = provider9;
        this.eventReporterProvider = provider10;
        this.viewModelProvider = provider11;
        this.confirmationHandlerProvider = provider12;
        this.linkGateFactoryProvider = provider13;
        this.linkHandlerProvider = provider14;
        this.linkAccountHolderProvider = provider15;
        this.flowControllerLinkLauncherProvider = provider16;
        this.walletsButtonLinkLauncherProvider = provider17;
        this.enableLoggingProvider = provider18;
        this.productUsageProvider = provider19;
        this.configurationHandlerProvider = provider20;
        this.errorReporterProvider = provider21;
        this.initializedViaComposeProvider = provider22;
        this.paymentElementCallbackIdentifierProvider = provider23;
    }

    @Override // javax.inject.Provider
    public DefaultFlowController get() {
        return newInstance(this.viewModelScopeProvider.get(), this.lifecycleOwnerProvider.get(), this.paymentOptionFactoryProvider.get(), this.paymentOptionResultCallbackProvider.get(), this.paymentResultCallbackProvider.get(), this.prefsRepositoryFactoryProvider.get(), this.activityResultCallerProvider.get(), this.activityResultRegistryOwnerProvider.get(), this.contextProvider.get(), this.eventReporterProvider.get(), this.viewModelProvider.get(), this.confirmationHandlerProvider.get(), this.linkGateFactoryProvider.get(), this.linkHandlerProvider.get(), this.linkAccountHolderProvider.get(), this.flowControllerLinkLauncherProvider.get(), this.walletsButtonLinkLauncherProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.productUsageProvider.get(), this.configurationHandlerProvider.get(), this.errorReporterProvider.get(), this.initializedViaComposeProvider.get().booleanValue(), this.paymentElementCallbackIdentifierProvider.get());
    }

    public static DefaultFlowController_Factory create(javax.inject.Provider<CoroutineScope> provider, javax.inject.Provider<LifecycleOwner> provider2, javax.inject.Provider<PaymentOptionFactory> provider3, javax.inject.Provider<PaymentOptionResultCallback> provider4, javax.inject.Provider<PaymentSheetResultCallback> provider5, javax.inject.Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider6, javax.inject.Provider<ActivityResultCaller> provider7, javax.inject.Provider<ActivityResultRegistryOwner> provider8, javax.inject.Provider<Context> provider9, javax.inject.Provider<EventReporter> provider10, javax.inject.Provider<FlowControllerViewModel> provider11, javax.inject.Provider<ConfirmationHandler> provider12, javax.inject.Provider<LinkGate.Factory> provider13, javax.inject.Provider<LinkHandler> provider14, javax.inject.Provider<LinkAccountHolder> provider15, javax.inject.Provider<LinkPaymentLauncher> provider16, javax.inject.Provider<LinkPaymentLauncher> provider17, javax.inject.Provider<Boolean> provider18, javax.inject.Provider<Set<String>> provider19, javax.inject.Provider<FlowControllerConfigurationHandler> provider20, javax.inject.Provider<ErrorReporter> provider21, javax.inject.Provider<Boolean> provider22, javax.inject.Provider<String> provider23) {
        return new DefaultFlowController_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13), Providers.asDaggerProvider(provider14), Providers.asDaggerProvider(provider15), Providers.asDaggerProvider(provider16), Providers.asDaggerProvider(provider17), Providers.asDaggerProvider(provider18), Providers.asDaggerProvider(provider19), Providers.asDaggerProvider(provider20), Providers.asDaggerProvider(provider21), Providers.asDaggerProvider(provider22), Providers.asDaggerProvider(provider23));
    }

    public static DefaultFlowController_Factory create(Provider<CoroutineScope> provider, Provider<LifecycleOwner> provider2, Provider<PaymentOptionFactory> provider3, Provider<PaymentOptionResultCallback> provider4, Provider<PaymentSheetResultCallback> provider5, Provider<Function1<PaymentSheet.CustomerConfiguration, PrefsRepository>> provider6, Provider<ActivityResultCaller> provider7, Provider<ActivityResultRegistryOwner> provider8, Provider<Context> provider9, Provider<EventReporter> provider10, Provider<FlowControllerViewModel> provider11, Provider<ConfirmationHandler> provider12, Provider<LinkGate.Factory> provider13, Provider<LinkHandler> provider14, Provider<LinkAccountHolder> provider15, Provider<LinkPaymentLauncher> provider16, Provider<LinkPaymentLauncher> provider17, Provider<Boolean> provider18, Provider<Set<String>> provider19, Provider<FlowControllerConfigurationHandler> provider20, Provider<ErrorReporter> provider21, Provider<Boolean> provider22, Provider<String> provider23) {
        return new DefaultFlowController_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23);
    }

    public static DefaultFlowController newInstance(CoroutineScope coroutineScope, LifecycleOwner lifecycleOwner, PaymentOptionFactory paymentOptionFactory, PaymentOptionResultCallback paymentOptionResultCallback, PaymentSheetResultCallback paymentSheetResultCallback, Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> function1, ActivityResultCaller activityResultCaller, ActivityResultRegistryOwner activityResultRegistryOwner, Context context, EventReporter eventReporter, FlowControllerViewModel flowControllerViewModel, ConfirmationHandler confirmationHandler, LinkGate.Factory factory, LinkHandler linkHandler, LinkAccountHolder linkAccountHolder, LinkPaymentLauncher linkPaymentLauncher, LinkPaymentLauncher linkPaymentLauncher2, boolean z, Set<String> set, FlowControllerConfigurationHandler flowControllerConfigurationHandler, ErrorReporter errorReporter, boolean z2, String str) {
        return new DefaultFlowController(coroutineScope, lifecycleOwner, paymentOptionFactory, paymentOptionResultCallback, paymentSheetResultCallback, function1, activityResultCaller, activityResultRegistryOwner, context, eventReporter, flowControllerViewModel, confirmationHandler, factory, linkHandler, linkAccountHolder, linkPaymentLauncher, linkPaymentLauncher2, z, set, flowControllerConfigurationHandler, errorReporter, z2, str);
    }
}
