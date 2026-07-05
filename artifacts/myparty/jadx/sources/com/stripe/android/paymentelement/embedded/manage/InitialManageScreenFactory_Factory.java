package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class InitialManageScreenFactory_Factory implements Factory<InitialManageScreenFactory> {
    private final Provider<CustomerStateHolder> customerStateHolderProvider;
    private final Provider<EmbeddedManageScreenInteractorFactory> manageInteractorFactoryProvider;
    private final Provider<PaymentMethodMetadata> paymentMethodMetadataProvider;
    private final Provider<EmbeddedUpdateScreenInteractorFactory> updateScreenInteractorFactoryProvider;

    public InitialManageScreenFactory_Factory(Provider<CustomerStateHolder> provider, Provider<PaymentMethodMetadata> provider2, Provider<EmbeddedUpdateScreenInteractorFactory> provider3, Provider<EmbeddedManageScreenInteractorFactory> provider4) {
        this.customerStateHolderProvider = provider;
        this.paymentMethodMetadataProvider = provider2;
        this.updateScreenInteractorFactoryProvider = provider3;
        this.manageInteractorFactoryProvider = provider4;
    }

    @Override // javax.inject.Provider
    public InitialManageScreenFactory get() {
        return newInstance(this.customerStateHolderProvider.get(), this.paymentMethodMetadataProvider.get(), this.updateScreenInteractorFactoryProvider.get(), this.manageInteractorFactoryProvider.get());
    }

    public static InitialManageScreenFactory_Factory create(javax.inject.Provider<CustomerStateHolder> provider, javax.inject.Provider<PaymentMethodMetadata> provider2, javax.inject.Provider<EmbeddedUpdateScreenInteractorFactory> provider3, javax.inject.Provider<EmbeddedManageScreenInteractorFactory> provider4) {
        return new InitialManageScreenFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static InitialManageScreenFactory_Factory create(Provider<CustomerStateHolder> provider, Provider<PaymentMethodMetadata> provider2, Provider<EmbeddedUpdateScreenInteractorFactory> provider3, Provider<EmbeddedManageScreenInteractorFactory> provider4) {
        return new InitialManageScreenFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static InitialManageScreenFactory newInstance(CustomerStateHolder customerStateHolder, PaymentMethodMetadata paymentMethodMetadata, EmbeddedUpdateScreenInteractorFactory embeddedUpdateScreenInteractorFactory, EmbeddedManageScreenInteractorFactory embeddedManageScreenInteractorFactory) {
        return new InitialManageScreenFactory(customerStateHolder, paymentMethodMetadata, embeddedUpdateScreenInteractorFactory, embeddedManageScreenInteractorFactory);
    }
}
