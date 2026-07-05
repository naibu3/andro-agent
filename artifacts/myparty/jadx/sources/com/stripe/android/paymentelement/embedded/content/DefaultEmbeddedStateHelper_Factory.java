package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedStateHelper_Factory implements Factory<DefaultEmbeddedStateHelper> {
    private final Provider<EmbeddedConfirmationStateHolder> confirmationStateHolderProvider;
    private final Provider<CustomerStateHolder> customerStateHolderProvider;
    private final Provider<EmbeddedContentHelper> embeddedContentHelperProvider;
    private final Provider<Function0<Unit>> internalRowSelectionCallbackProvider;
    private final Provider<EmbeddedSelectionHolder> selectionHolderProvider;

    public DefaultEmbeddedStateHelper_Factory(Provider<EmbeddedSelectionHolder> provider, Provider<CustomerStateHolder> provider2, Provider<EmbeddedConfirmationStateHolder> provider3, Provider<EmbeddedContentHelper> provider4, Provider<Function0<Unit>> provider5) {
        this.selectionHolderProvider = provider;
        this.customerStateHolderProvider = provider2;
        this.confirmationStateHolderProvider = provider3;
        this.embeddedContentHelperProvider = provider4;
        this.internalRowSelectionCallbackProvider = provider5;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedStateHelper get() {
        return newInstance(this.selectionHolderProvider.get(), this.customerStateHolderProvider.get(), this.confirmationStateHolderProvider.get(), this.embeddedContentHelperProvider.get(), this.internalRowSelectionCallbackProvider);
    }

    public static DefaultEmbeddedStateHelper_Factory create(javax.inject.Provider<EmbeddedSelectionHolder> provider, javax.inject.Provider<CustomerStateHolder> provider2, javax.inject.Provider<EmbeddedConfirmationStateHolder> provider3, javax.inject.Provider<EmbeddedContentHelper> provider4, javax.inject.Provider<Function0<Unit>> provider5) {
        return new DefaultEmbeddedStateHelper_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static DefaultEmbeddedStateHelper_Factory create(Provider<EmbeddedSelectionHolder> provider, Provider<CustomerStateHolder> provider2, Provider<EmbeddedConfirmationStateHolder> provider3, Provider<EmbeddedContentHelper> provider4, Provider<Function0<Unit>> provider5) {
        return new DefaultEmbeddedStateHelper_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultEmbeddedStateHelper newInstance(EmbeddedSelectionHolder embeddedSelectionHolder, CustomerStateHolder customerStateHolder, EmbeddedConfirmationStateHolder embeddedConfirmationStateHolder, EmbeddedContentHelper embeddedContentHelper, javax.inject.Provider<Function0<Unit>> provider) {
        return new DefaultEmbeddedStateHelper(embeddedSelectionHolder, customerStateHolder, embeddedConfirmationStateHolder, embeddedContentHelper, provider);
    }
}
