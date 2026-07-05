package com.stripe.android.paymentelement;

import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfigurationCoordinator;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationHelper;
import com.stripe.android.paymentelement.embedded.content.EmbeddedContentHelper;
import com.stripe.android.paymentelement.embedded.content.EmbeddedStateHelper;
import com.stripe.android.paymentelement.embedded.content.PaymentOptionDisplayDataHolder;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElement_Factory implements Factory<EmbeddedPaymentElement> {
    private final Provider<EmbeddedConfigurationCoordinator> configurationCoordinatorProvider;
    private final Provider<EmbeddedConfirmationHelper> confirmationHelperProvider;
    private final Provider<EmbeddedContentHelper> contentHelperProvider;
    private final Provider<PaymentOptionDisplayDataHolder> paymentOptionDisplayDataHolderProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;
    private final Provider<EmbeddedStateHelper> stateHelperProvider;

    public EmbeddedPaymentElement_Factory(Provider<EmbeddedConfirmationHelper> provider, Provider<EmbeddedContentHelper> provider2, Provider<EmbeddedSelectionHolder> provider3, Provider<PaymentOptionDisplayDataHolder> provider4, Provider<EmbeddedConfigurationCoordinator> provider5, Provider<EmbeddedStateHelper> provider6) {
        this.confirmationHelperProvider = provider;
        this.contentHelperProvider = provider2;
        this.selectionHolderProvider = provider3;
        this.paymentOptionDisplayDataHolderProvider = provider4;
        this.configurationCoordinatorProvider = provider5;
        this.stateHelperProvider = provider6;
    }

    @Override // javax.inject.Provider
    public EmbeddedPaymentElement get() {
        return newInstance(this.confirmationHelperProvider.get(), this.contentHelperProvider.get(), this.selectionHolderProvider.get(), this.paymentOptionDisplayDataHolderProvider.get(), this.configurationCoordinatorProvider.get(), this.stateHelperProvider.get());
    }

    public static EmbeddedPaymentElement_Factory create(javax.inject.Provider<EmbeddedConfirmationHelper> provider, javax.inject.Provider<EmbeddedContentHelper> provider2, javax.inject.Provider<EmbeddedSelectionHolder> provider3, javax.inject.Provider<PaymentOptionDisplayDataHolder> provider4, javax.inject.Provider<EmbeddedConfigurationCoordinator> provider5, javax.inject.Provider<EmbeddedStateHelper> provider6) {
        return new EmbeddedPaymentElement_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static EmbeddedPaymentElement_Factory create(Provider<EmbeddedConfirmationHelper> provider, Provider<EmbeddedContentHelper> provider2, Provider<EmbeddedSelectionHolder> provider3, Provider<PaymentOptionDisplayDataHolder> provider4, Provider<EmbeddedConfigurationCoordinator> provider5, Provider<EmbeddedStateHelper> provider6) {
        return new EmbeddedPaymentElement_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static EmbeddedPaymentElement newInstance(EmbeddedConfirmationHelper embeddedConfirmationHelper, EmbeddedContentHelper embeddedContentHelper, EmbeddedSelectionHolder embeddedSelectionHolder, PaymentOptionDisplayDataHolder paymentOptionDisplayDataHolder, EmbeddedConfigurationCoordinator embeddedConfigurationCoordinator, EmbeddedStateHelper embeddedStateHelper) {
        return new EmbeddedPaymentElement(embeddedConfirmationHelper, embeddedContentHelper, embeddedSelectionHolder, paymentOptionDisplayDataHolder, embeddedConfigurationCoordinator, embeddedStateHelper);
    }
}
