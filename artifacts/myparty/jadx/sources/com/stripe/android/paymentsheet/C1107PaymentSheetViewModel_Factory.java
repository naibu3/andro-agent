package com.stripe.android.paymentsheet;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.Logger;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1107PaymentSheetViewModel_Factory implements Factory<PaymentSheetViewModel> {
    private final Provider<PaymentSheetContractV2.Args> argsProvider;
    private final Provider<CardAccountRangeRepository.Factory> cardAccountRangeRepositoryFactoryProvider;
    private final Provider<ConfirmationHandler.Factory> confirmationHandlerFactoryProvider;
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<CvcRecollectionHandler> cvcRecollectionHandlerProvider;
    private final Provider<CvcRecollectionInteractor.Factory> cvcRecollectionInteractorFactoryProvider;
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<Function0<Boolean>> isLiveModeProvider;
    private final Provider<LinkHandler> linkHandlerProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<PaymentElementLoader> paymentElementLoaderProvider;
    private final Provider<PrefsRepository> prefsRepositoryProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public C1107PaymentSheetViewModel_Factory(Provider<PaymentSheetContractV2.Args> provider, Provider<EventReporter> provider2, Provider<PaymentElementLoader> provider3, Provider<CustomerRepository> provider4, Provider<PrefsRepository> provider5, Provider<Logger> provider6, Provider<CoroutineContext> provider7, Provider<SavedStateHandle> provider8, Provider<LinkHandler> provider9, Provider<ConfirmationHandler.Factory> provider10, Provider<CardAccountRangeRepository.Factory> provider11, Provider<ErrorReporter> provider12, Provider<CvcRecollectionHandler> provider13, Provider<CvcRecollectionInteractor.Factory> provider14, Provider<Function0<Boolean>> provider15) {
        this.argsProvider = provider;
        this.eventReporterProvider = provider2;
        this.paymentElementLoaderProvider = provider3;
        this.customerRepositoryProvider = provider4;
        this.prefsRepositoryProvider = provider5;
        this.loggerProvider = provider6;
        this.workContextProvider = provider7;
        this.savedStateHandleProvider = provider8;
        this.linkHandlerProvider = provider9;
        this.confirmationHandlerFactoryProvider = provider10;
        this.cardAccountRangeRepositoryFactoryProvider = provider11;
        this.errorReporterProvider = provider12;
        this.cvcRecollectionHandlerProvider = provider13;
        this.cvcRecollectionInteractorFactoryProvider = provider14;
        this.isLiveModeProvider = provider15;
    }

    @Override // javax.inject.Provider
    public PaymentSheetViewModel get() {
        return newInstance(this.argsProvider.get(), this.eventReporterProvider.get(), this.paymentElementLoaderProvider.get(), this.customerRepositoryProvider.get(), this.prefsRepositoryProvider.get(), this.loggerProvider.get(), this.workContextProvider.get(), this.savedStateHandleProvider.get(), this.linkHandlerProvider.get(), this.confirmationHandlerFactoryProvider.get(), this.cardAccountRangeRepositoryFactoryProvider.get(), this.errorReporterProvider.get(), this.cvcRecollectionHandlerProvider.get(), this.cvcRecollectionInteractorFactoryProvider.get(), this.isLiveModeProvider.get());
    }

    public static C1107PaymentSheetViewModel_Factory create(javax.inject.Provider<PaymentSheetContractV2.Args> provider, javax.inject.Provider<EventReporter> provider2, javax.inject.Provider<PaymentElementLoader> provider3, javax.inject.Provider<CustomerRepository> provider4, javax.inject.Provider<PrefsRepository> provider5, javax.inject.Provider<Logger> provider6, javax.inject.Provider<CoroutineContext> provider7, javax.inject.Provider<SavedStateHandle> provider8, javax.inject.Provider<LinkHandler> provider9, javax.inject.Provider<ConfirmationHandler.Factory> provider10, javax.inject.Provider<CardAccountRangeRepository.Factory> provider11, javax.inject.Provider<ErrorReporter> provider12, javax.inject.Provider<CvcRecollectionHandler> provider13, javax.inject.Provider<CvcRecollectionInteractor.Factory> provider14, javax.inject.Provider<Function0<Boolean>> provider15) {
        return new C1107PaymentSheetViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10), Providers.asDaggerProvider(provider11), Providers.asDaggerProvider(provider12), Providers.asDaggerProvider(provider13), Providers.asDaggerProvider(provider14), Providers.asDaggerProvider(provider15));
    }

    public static C1107PaymentSheetViewModel_Factory create(Provider<PaymentSheetContractV2.Args> provider, Provider<EventReporter> provider2, Provider<PaymentElementLoader> provider3, Provider<CustomerRepository> provider4, Provider<PrefsRepository> provider5, Provider<Logger> provider6, Provider<CoroutineContext> provider7, Provider<SavedStateHandle> provider8, Provider<LinkHandler> provider9, Provider<ConfirmationHandler.Factory> provider10, Provider<CardAccountRangeRepository.Factory> provider11, Provider<ErrorReporter> provider12, Provider<CvcRecollectionHandler> provider13, Provider<CvcRecollectionInteractor.Factory> provider14, Provider<Function0<Boolean>> provider15) {
        return new C1107PaymentSheetViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static PaymentSheetViewModel newInstance(PaymentSheetContractV2.Args args, EventReporter eventReporter, PaymentElementLoader paymentElementLoader, CustomerRepository customerRepository, PrefsRepository prefsRepository, Logger logger, CoroutineContext coroutineContext, SavedStateHandle savedStateHandle, LinkHandler linkHandler, ConfirmationHandler.Factory factory, CardAccountRangeRepository.Factory factory2, ErrorReporter errorReporter, CvcRecollectionHandler cvcRecollectionHandler, CvcRecollectionInteractor.Factory factory3, Function0<Boolean> function0) {
        return new PaymentSheetViewModel(args, eventReporter, paymentElementLoader, customerRepository, prefsRepository, logger, coroutineContext, savedStateHandle, linkHandler, factory, factory2, errorReporter, cvcRecollectionHandler, factory3, function0);
    }
}
