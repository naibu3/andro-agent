package com.stripe.android.paymentelement.embedded.content;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewModelModule_Companion_ProvideResourcesFactory implements Factory<Resources> {
    private final Provider<Context> contextProvider;

    public EmbeddedPaymentElementViewModelModule_Companion_ProvideResourcesFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public Resources get() {
        return provideResources(this.contextProvider.get());
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvideResourcesFactory create(javax.inject.Provider<Context> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvideResourcesFactory(Providers.asDaggerProvider(provider));
    }

    public static EmbeddedPaymentElementViewModelModule_Companion_ProvideResourcesFactory create(Provider<Context> provider) {
        return new EmbeddedPaymentElementViewModelModule_Companion_ProvideResourcesFactory(provider);
    }

    public static Resources provideResources(Context context) {
        return (Resources) Preconditions.checkNotNullFromProvides(EmbeddedPaymentElementViewModelModule.INSTANCE.provideResources(context));
    }
}
