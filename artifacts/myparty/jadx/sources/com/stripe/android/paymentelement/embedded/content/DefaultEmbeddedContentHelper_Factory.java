package com.stripe.android.paymentelement.embedded.content;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory;
import com.stripe.android.paymentelement.embedded.EmbeddedRowSelectionImmediateActionHandler;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedContentHelper_Factory implements Factory<DefaultEmbeddedContentHelper> {
    private final Provider<ConfirmationHandler> confirmationHandlerProvider;
    private final Provider<EmbeddedConfirmationStateHolder> confirmationStateHolderProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<CustomerStateHolder> customerStateHolderProvider;
    private final Provider<EmbeddedFormHelperFactory> embeddedFormHelperFactoryProvider;
    private final Provider<EmbeddedLinkHelper> embeddedLinkHelperProvider;
    private final Provider<EmbeddedWalletsHelper> embeddedWalletsHelperProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<Function0<Unit>> internalRowSelectionCallbackProvider;
    private final Provider<LinkAccountHolder> linkAccountHolderProvider;
    private final Provider<LinkPaymentLauncher> linkPaymentLauncherProvider;
    private final Provider<EmbeddedRowSelectionImmediateActionHandler> rowSelectionImmediateActionHandlerProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;
    private final Provider<CoroutineContext> uiContextProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public DefaultEmbeddedContentHelper_Factory(Provider<CoroutineScope> provider, Provider<SavedStateHandle> provider2, Provider<EventReporter> provider3, Provider<ErrorReporter> provider4, Provider<CoroutineContext> provider5, Provider<CoroutineContext> provider6, Provider<CustomerRepository> provider7, Provider<EmbeddedSelectionHolder> provider8, Provider<EmbeddedLinkHelper> provider9, Provider<EmbeddedRowSelectionImmediateActionHandler> provider10, Provider<Function0<Unit>> provider11, Provider<EmbeddedWalletsHelper> provider12, Provider<CustomerStateHolder> provider13, Provider<EmbeddedFormHelperFactory> provider14, Provider<ConfirmationHandler> provider15, Provider<EmbeddedConfirmationStateHolder> provider16, Provider<LinkPaymentLauncher> provider17, Provider<LinkAccountHolder> provider18) {
        this.coroutineScopeProvider = provider;
        this.savedStateHandleProvider = provider2;
        this.eventReporterProvider = provider3;
        this.errorReporterProvider = provider4;
        this.workContextProvider = provider5;
        this.uiContextProvider = provider6;
        this.customerRepositoryProvider = provider7;
        this.selectionHolderProvider = provider8;
        this.embeddedLinkHelperProvider = provider9;
        this.rowSelectionImmediateActionHandlerProvider = provider10;
        this.internalRowSelectionCallbackProvider = provider11;
        this.embeddedWalletsHelperProvider = provider12;
        this.customerStateHolderProvider = provider13;
        this.embeddedFormHelperFactoryProvider = provider14;
        this.confirmationHandlerProvider = provider15;
        this.confirmationStateHolderProvider = provider16;
        this.linkPaymentLauncherProvider = provider17;
        this.linkAccountHolderProvider = provider18;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedContentHelper get() {
        return newInstance(this.coroutineScopeProvider.get(), this.savedStateHandleProvider.get(), this.eventReporterProvider.get(), this.errorReporterProvider.get(), this.workContextProvider.get(), this.uiContextProvider.get(), this.customerRepositoryProvider.get(), this.selectionHolderProvider.get(), this.embeddedLinkHelperProvider.get(), this.rowSelectionImmediateActionHandlerProvider.get(), this.internalRowSelectionCallbackProvider, this.embeddedWalletsHelperProvider.get(), this.customerStateHolderProvider.get(), this.embeddedFormHelperFactoryProvider.get(), this.confirmationHandlerProvider.get(), this.confirmationStateHolderProvider.get(), this.linkPaymentLauncherProvider.get(), this.linkAccountHolderProvider.get());
    }

    public static DefaultEmbeddedContentHelper_Factory create(javax.inject.Provider<CoroutineScope> provider, javax.inject.Provider<SavedStateHandle> provider2, javax.inject.Provider<EventReporter> provider3, javax.inject.Provider<ErrorReporter> provider4, javax.inject.Provider<CoroutineContext> provider5, javax.inject.Provider<CoroutineContext> provider6, javax.inject.Provider<CustomerRepository> provider7, javax.inject.Provider<EmbeddedSelectionHolder> provider8, javax.inject.Provider<EmbeddedLinkHelper> provider9, javax.inject.Provider<EmbeddedRowSelectionImmediateActionHandler> provider10, javax.inject.Provider<Function0<Unit>> provider11, javax.inject.Provider<EmbeddedWalletsHelper> provider12, javax.inject.Provider<CustomerStateHolder> provider13, javax.inject.Provider<EmbeddedFormHelperFactory> provider14, javax.inject.Provider<ConfirmationHandler> provider15, javax.inject.Provider<EmbeddedConfirmationStateHolder> provider16, javax.inject.Provider<LinkPaymentLauncher> provider17, javax.inject.Provider<LinkAccountHolder> provider18) {
        return new DefaultEmbeddedContentHelper_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13), Providers.asDaggerProvider(provider14), Providers.asDaggerProvider(provider15), Providers.asDaggerProvider(provider16), Providers.asDaggerProvider(provider17), Providers.asDaggerProvider(provider18));
    }

    public static DefaultEmbeddedContentHelper_Factory create(Provider<CoroutineScope> provider, Provider<SavedStateHandle> provider2, Provider<EventReporter> provider3, Provider<ErrorReporter> provider4, Provider<CoroutineContext> provider5, Provider<CoroutineContext> provider6, Provider<CustomerRepository> provider7, Provider<EmbeddedSelectionHolder> provider8, Provider<EmbeddedLinkHelper> provider9, Provider<EmbeddedRowSelectionImmediateActionHandler> provider10, Provider<Function0<Unit>> provider11, Provider<EmbeddedWalletsHelper> provider12, Provider<CustomerStateHolder> provider13, Provider<EmbeddedFormHelperFactory> provider14, Provider<ConfirmationHandler> provider15, Provider<EmbeddedConfirmationStateHolder> provider16, Provider<LinkPaymentLauncher> provider17, Provider<LinkAccountHolder> provider18) {
        return new DefaultEmbeddedContentHelper_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static DefaultEmbeddedContentHelper newInstance(CoroutineScope coroutineScope, SavedStateHandle savedStateHandle, EventReporter eventReporter, ErrorReporter errorReporter, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CustomerRepository customerRepository, EmbeddedSelectionHolder embeddedSelectionHolder, EmbeddedLinkHelper embeddedLinkHelper, EmbeddedRowSelectionImmediateActionHandler embeddedRowSelectionImmediateActionHandler, javax.inject.Provider<Function0<Unit>> provider, EmbeddedWalletsHelper embeddedWalletsHelper, CustomerStateHolder customerStateHolder, EmbeddedFormHelperFactory embeddedFormHelperFactory, ConfirmationHandler confirmationHandler, EmbeddedConfirmationStateHolder embeddedConfirmationStateHolder, LinkPaymentLauncher linkPaymentLauncher, LinkAccountHolder linkAccountHolder) {
        return new DefaultEmbeddedContentHelper(coroutineScope, savedStateHandle, eventReporter, errorReporter, coroutineContext, coroutineContext2, customerRepository, embeddedSelectionHolder, embeddedLinkHelper, embeddedRowSelectionImmediateActionHandler, provider, embeddedWalletsHelper, customerStateHolder, embeddedFormHelperFactory, confirmationHandler, embeddedConfirmationStateHolder, linkPaymentLauncher, linkAccountHolder);
    }
}
