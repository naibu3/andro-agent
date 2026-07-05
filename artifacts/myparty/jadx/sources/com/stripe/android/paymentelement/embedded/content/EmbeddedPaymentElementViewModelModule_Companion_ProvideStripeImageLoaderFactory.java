package com.stripe.android.paymentelement.embedded.content;

import android.content.Context;
import com.stripe.android.uicore.image.StripeImageLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModelModule_Companion_ProvideStripeImageLoaderFactory implements Factory<StripeImageLoader> {
    private final Provider<Context> contextProvider;

    public EmbeddedPaymentElementViewModelModule_Companion_ProvideStripeImageLoaderFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public StripeImageLoader get() {
        return provideStripeImageLoader(this.contextProvider.get());
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvideStripeImageLoaderFactory create(javax.inject.Provider<Context> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvideStripeImageLoaderFactory(Providers.asDaggerProvider(provider));
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvideStripeImageLoaderFactory create(Provider<Context> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvideStripeImageLoaderFactory(provider);
    }

    public static StripeImageLoader provideStripeImageLoader(Context context) {
        return (StripeImageLoader) Preconditions.checkNotNullFromProvides(EmbeddedPaymentElementViewModelModule.INSTANCE.provideStripeImageLoader(context));
    }
}
