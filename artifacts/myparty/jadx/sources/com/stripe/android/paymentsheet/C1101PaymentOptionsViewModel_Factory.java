package com.stripe.android.paymentsheet;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.coroutines.CoroutineContext;

/* renamed from: com.stripe.android.paymentsheet.PaymentOptionsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1101PaymentOptionsViewModel_Factory implements Factory<PaymentOptionsViewModel> {
    private final Provider<PaymentOptionContract.Args> argsProvider;
    private final Provider<CardAccountRangeRepository.Factory> cardAccountRangeRepositoryFactoryProvider;
    private final Provider<CustomerRepository> customerRepositoryProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<LinkAccountHolder> linkAccountHolderProvider;
    private final Provider<LinkGate.Factory> linkGateFactoryProvider;
    private final Provider<LinkHandler> linkHandlerProvider;
    private final Provider<LinkPaymentLauncher> linkPaymentLauncherProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public C1101PaymentOptionsViewModel_Factory(Provider<PaymentOptionContract.Args> provider, Provider<LinkAccountHolder> provider2, Provider<LinkGate.Factory> provider3, Provider<LinkPaymentLauncher> provider4, Provider<EventReporter> provider5, Provider<CustomerRepository> provider6, Provider<CoroutineContext> provider7, Provider<SavedStateHandle> provider8, Provider<LinkHandler> provider9, Provider<CardAccountRangeRepository.Factory> provider10) {
        this.argsProvider = provider;
        this.linkAccountHolderProvider = provider2;
        this.linkGateFactoryProvider = provider3;
        this.linkPaymentLauncherProvider = provider4;
        this.eventReporterProvider = provider5;
        this.customerRepositoryProvider = provider6;
        this.workContextProvider = provider7;
        this.savedStateHandleProvider = provider8;
        this.linkHandlerProvider = provider9;
        this.cardAccountRangeRepositoryFactoryProvider = provider10;
    }

    @Override // javax.inject.Provider
    public PaymentOptionsViewModel get() {
        return newInstance(this.argsProvider.get(), this.linkAccountHolderProvider.get(), this.linkGateFactoryProvider.get(), this.linkPaymentLauncherProvider.get(), this.eventReporterProvider.get(), this.customerRepositoryProvider.get(), this.workContextProvider.get(), this.savedStateHandleProvider.get(), this.linkHandlerProvider.get(), this.cardAccountRangeRepositoryFactoryProvider.get());
    }

    public static C1101PaymentOptionsViewModel_Factory create(javax.inject.Provider<PaymentOptionContract.Args> provider, javax.inject.Provider<LinkAccountHolder> provider2, javax.inject.Provider<LinkGate.Factory> provider3, javax.inject.Provider<LinkPaymentLauncher> provider4, javax.inject.Provider<EventReporter> provider5, javax.inject.Provider<CustomerRepository> provider6, javax.inject.Provider<CoroutineContext> provider7, javax.inject.Provider<SavedStateHandle> provider8, javax.inject.Provider<LinkHandler> provider9, javax.inject.Provider<CardAccountRangeRepository.Factory> provider10) {
        return new C1101PaymentOptionsViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9), Providers.asDaggerProvider(provider10));
    }

    public static C1101PaymentOptionsViewModel_Factory create(Provider<PaymentOptionContract.Args> provider, Provider<LinkAccountHolder> provider2, Provider<LinkGate.Factory> provider3, Provider<LinkPaymentLauncher> provider4, Provider<EventReporter> provider5, Provider<CustomerRepository> provider6, Provider<CoroutineContext> provider7, Provider<SavedStateHandle> provider8, Provider<LinkHandler> provider9, Provider<CardAccountRangeRepository.Factory> provider10) {
        return new C1101PaymentOptionsViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static PaymentOptionsViewModel newInstance(PaymentOptionContract.Args args, LinkAccountHolder linkAccountHolder, LinkGate.Factory factory, LinkPaymentLauncher linkPaymentLauncher, EventReporter eventReporter, CustomerRepository customerRepository, CoroutineContext coroutineContext, SavedStateHandle savedStateHandle, LinkHandler linkHandler, CardAccountRangeRepository.Factory factory2) {
        return new PaymentOptionsViewModel(args, linkAccountHolder, factory, linkPaymentLauncher, eventReporter, customerRepository, coroutineContext, savedStateHandle, linkHandler, factory2);
    }
}
