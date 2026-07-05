package com.stripe.android.paymentelement.embedded.content;

import android.content.Context;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class PaymentOptionDisplayDataFactory_Factory implements Factory<PaymentOptionDisplayDataFactory> {
    private final Provider<Context> contextProvider;
    private final Provider<PaymentSelection.IconLoader> iconLoaderProvider;

    public PaymentOptionDisplayDataFactory_Factory(Provider<PaymentSelection.IconLoader> provider, Provider<Context> provider2) {
        this.iconLoaderProvider = provider;
        this.contextProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PaymentOptionDisplayDataFactory get() {
        return newInstance(this.iconLoaderProvider.get(), this.contextProvider.get());
    }

    public static PaymentOptionDisplayDataFactory_Factory create(javax.inject.Provider<PaymentSelection.IconLoader> provider, javax.inject.Provider<Context> provider2) {
        return new PaymentOptionDisplayDataFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static PaymentOptionDisplayDataFactory_Factory create(Provider<PaymentSelection.IconLoader> provider, Provider<Context> provider2) {
        return new PaymentOptionDisplayDataFactory_Factory(provider, provider2);
    }

    public static PaymentOptionDisplayDataFactory newInstance(PaymentSelection.IconLoader iconLoader, Context context) {
        return new PaymentOptionDisplayDataFactory(iconLoader, context);
    }
}
