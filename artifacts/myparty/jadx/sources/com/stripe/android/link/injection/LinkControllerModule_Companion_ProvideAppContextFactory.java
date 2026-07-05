package com.stripe.android.link.injection;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkControllerModule_Companion_ProvideAppContextFactory implements Factory<Context> {
    private final Provider<Application> applicationProvider;

    public LinkControllerModule_Companion_ProvideAppContextFactory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideAppContext(this.applicationProvider.get());
    }

    public static LinkControllerModule_Companion_ProvideAppContextFactory create(javax.inject.Provider<Application> provider) {
        return new LinkControllerModule_Companion_ProvideAppContextFactory(Providers.asDaggerProvider(provider));
    }

    public static LinkControllerModule_Companion_ProvideAppContextFactory create(Provider<Application> provider) {
        return new LinkControllerModule_Companion_ProvideAppContextFactory(provider);
    }

    public static Context provideAppContext(Application application) {
        return (Context) Preconditions.checkNotNullFromProvides(LinkControllerModule.INSTANCE.provideAppContext(application));
    }
}
