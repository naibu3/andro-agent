package com.stripe.android.financialconnections.di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.repository.ConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiService;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.repository.ConsumersApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsConsumerSessionRepositoryFactory implements Factory<FinancialConnectionsConsumerSessionRepository> {
    private final Provider<ConsumerSessionRepository> consumerSessionRepositoryProvider;
    private final Provider<ConsumersApiService> consumersApiServiceProvider;
    private final Provider<ElementsSessionContext> elementsSessionContextProvider;
    private final Provider<FinancialConnectionsConsumersApiService> financialConnectionsConsumersApiServiceProvider;
    private final Provider<FraudDetectionDataRepository> fraudDetectionDataRepositoryProvider;
    private final Provider<IsLinkWithStripe> isLinkWithStripeProvider;
    private final Provider<Locale> localeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<ProvideApiRequestOptions> provideApiRequestOptionsProvider;

    public FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsConsumerSessionRepositoryFactory(Provider<ConsumersApiService> provider, Provider<ProvideApiRequestOptions> provider2, Provider<FinancialConnectionsConsumersApiService> provider3, Provider<ConsumerSessionRepository> provider4, Provider<Locale> provider5, Provider<Logger> provider6, Provider<IsLinkWithStripe> provider7, Provider<FraudDetectionDataRepository> provider8, Provider<ElementsSessionContext> provider9) {
        this.consumersApiServiceProvider = provider;
        this.provideApiRequestOptionsProvider = provider2;
        this.financialConnectionsConsumersApiServiceProvider = provider3;
        this.consumerSessionRepositoryProvider = provider4;
        this.localeProvider = provider5;
        this.loggerProvider = provider6;
        this.isLinkWithStripeProvider = provider7;
        this.fraudDetectionDataRepositoryProvider = provider8;
        this.elementsSessionContextProvider = provider9;
    }

    @Override // javax.inject.Provider
    public FinancialConnectionsConsumerSessionRepository get() {
        return providesFinancialConnectionsConsumerSessionRepository(this.consumersApiServiceProvider.get(), this.provideApiRequestOptionsProvider.get(), this.financialConnectionsConsumersApiServiceProvider.get(), this.consumerSessionRepositoryProvider.get(), this.localeProvider.get(), this.loggerProvider.get(), this.isLinkWithStripeProvider.get(), this.fraudDetectionDataRepositoryProvider.get(), this.elementsSessionContextProvider.get());
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsConsumerSessionRepositoryFactory create(javax.inject.Provider<ConsumersApiService> provider, javax.inject.Provider<ProvideApiRequestOptions> provider2, javax.inject.Provider<FinancialConnectionsConsumersApiService> provider3, javax.inject.Provider<ConsumerSessionRepository> provider4, javax.inject.Provider<Locale> provider5, javax.inject.Provider<Logger> provider6, javax.inject.Provider<IsLinkWithStripe> provider7, javax.inject.Provider<FraudDetectionDataRepository> provider8, javax.inject.Provider<ElementsSessionContext> provider9) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsConsumerSessionRepositoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6), Providers.asDaggerProvider(provider7), Providers.asDaggerProvider(provider8), Providers.asDaggerProvider(provider9));
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsConsumerSessionRepositoryFactory create(Provider<ConsumersApiService> provider, Provider<ProvideApiRequestOptions> provider2, Provider<FinancialConnectionsConsumersApiService> provider3, Provider<ConsumerSessionRepository> provider4, Provider<Locale> provider5, Provider<Logger> provider6, Provider<IsLinkWithStripe> provider7, Provider<FraudDetectionDataRepository> provider8, Provider<ElementsSessionContext> provider9) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsConsumerSessionRepositoryFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static FinancialConnectionsConsumerSessionRepository providesFinancialConnectionsConsumerSessionRepository(ConsumersApiService consumersApiService, ProvideApiRequestOptions provideApiRequestOptions, FinancialConnectionsConsumersApiService financialConnectionsConsumersApiService, ConsumerSessionRepository consumerSessionRepository, Locale locale, Logger logger, IsLinkWithStripe isLinkWithStripe, FraudDetectionDataRepository fraudDetectionDataRepository, ElementsSessionContext elementsSessionContext) {
        return (FinancialConnectionsConsumerSessionRepository) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetNativeModule.INSTANCE.providesFinancialConnectionsConsumerSessionRepository(consumersApiService, provideApiRequestOptions, financialConnectionsConsumersApiService, consumerSessionRepository, locale, logger, isLinkWithStripe, fraudDetectionDataRepository, elementsSessionContext));
    }
}
