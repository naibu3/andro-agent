package com.stripe.android.paymentsheet.model;

import android.content.Context;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class PaymentOptionFactory_Factory implements Factory<PaymentOptionFactory> {
    private final Provider<Context> contextProvider;
    private final Provider<PaymentSelection.IconLoader> iconLoaderProvider;

    public PaymentOptionFactory_Factory(Provider<PaymentSelection.IconLoader> provider, Provider<Context> provider2) {
        this.iconLoaderProvider = provider;
        this.contextProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PaymentOptionFactory get() {
        return newInstance(this.iconLoaderProvider.get(), this.contextProvider.get());
    }

    public static PaymentOptionFactory_Factory create(javax.inject.Provider<PaymentSelection.IconLoader> provider, javax.inject.Provider<Context> provider2) {
        return new PaymentOptionFactory_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static PaymentOptionFactory_Factory create(Provider<PaymentSelection.IconLoader> provider, Provider<Context> provider2) {
        return new PaymentOptionFactory_Factory(provider, provider2);
    }

    public static PaymentOptionFactory newInstance(PaymentSelection.IconLoader iconLoader, Context context) {
        return new PaymentOptionFactory(iconLoader, context);
    }
}
