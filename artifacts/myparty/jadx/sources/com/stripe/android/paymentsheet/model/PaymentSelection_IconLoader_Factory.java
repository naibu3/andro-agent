package com.stripe.android.paymentsheet.model;

import android.content.res.Resources;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.uicore.image.StripeImageLoader;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class PaymentSelection_IconLoader_Factory implements Factory<PaymentSelection.IconLoader> {
    private final Provider<StripeImageLoader> imageLoaderProvider;
    private final Provider<Resources> resourcesProvider;

    public PaymentSelection_IconLoader_Factory(Provider<Resources> provider, Provider<StripeImageLoader> provider2) {
        this.resourcesProvider = provider;
        this.imageLoaderProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PaymentSelection.IconLoader get() {
        return newInstance(this.resourcesProvider.get(), this.imageLoaderProvider.get());
    }

    public static PaymentSelection_IconLoader_Factory create(javax.inject.Provider<Resources> provider, javax.inject.Provider<StripeImageLoader> provider2) {
        return new PaymentSelection_IconLoader_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static PaymentSelection_IconLoader_Factory create(Provider<Resources> provider, Provider<StripeImageLoader> provider2) {
        return new PaymentSelection_IconLoader_Factory(provider, provider2);
    }

    public static PaymentSelection.IconLoader newInstance(Resources resources, StripeImageLoader stripeImageLoader) {
        return new PaymentSelection.IconLoader(resources, stripeImageLoader);
    }
}
