package com.stripe.android.paymentelement.embedded;

import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.embedded.content.EmbeddedStateHelper;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class DefaultEmbeddedResultCallbackHelper_Factory implements Factory<DefaultEmbeddedResultCallbackHelper> {
    private final Provider<EmbeddedPaymentElement.ResultCallback> resultCallbackProvider;
    private final Provider<EmbeddedStateHelper> stateHelperProvider;

    public DefaultEmbeddedResultCallbackHelper_Factory(Provider<EmbeddedPaymentElement.ResultCallback> provider, Provider<EmbeddedStateHelper> provider2) {
        this.resultCallbackProvider = provider;
        this.stateHelperProvider = provider2;
    }

    @Override // javax.inject.Provider
    public DefaultEmbeddedResultCallbackHelper get() {
        return newInstance(this.resultCallbackProvider.get(), this.stateHelperProvider.get());
    }

    public static DefaultEmbeddedResultCallbackHelper_Factory create(javax.inject.Provider<EmbeddedPaymentElement.ResultCallback> provider, javax.inject.Provider<EmbeddedStateHelper> provider2) {
        return new DefaultEmbeddedResultCallbackHelper_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static DefaultEmbeddedResultCallbackHelper_Factory create(Provider<EmbeddedPaymentElement.ResultCallback> provider, Provider<EmbeddedStateHelper> provider2) {
        return new DefaultEmbeddedResultCallbackHelper_Factory(provider, provider2);
    }

    public static DefaultEmbeddedResultCallbackHelper newInstance(EmbeddedPaymentElement.ResultCallback resultCallback, EmbeddedStateHelper embeddedStateHelper) {
        return new DefaultEmbeddedResultCallbackHelper(resultCallback, embeddedStateHelper);
    }
}
