package com.stripe.android.ui.core.forms.resources.injection;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class ResourceRepositoryModule_ProvideResourcesFactory implements Factory<Resources> {
    private final Provider<Context> contextProvider;

    public ResourceRepositoryModule_ProvideResourcesFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public Resources get() {
        return provideResources(this.contextProvider.get());
    }

    public static ResourceRepositoryModule_ProvideResourcesFactory create(javax.inject.Provider<Context> provider) {
        return new ResourceRepositoryModule_ProvideResourcesFactory(Providers.asDaggerProvider(provider));
    }

    public static ResourceRepositoryModule_ProvideResourcesFactory create(Provider<Context> provider) {
        return new ResourceRepositoryModule_ProvideResourcesFactory(provider);
    }

    public static Resources provideResources(Context context) {
        return (Resources) Preconditions.checkNotNullFromProvides(ResourceRepositoryModule.INSTANCE.provideResources(context));
    }
}
