package com.stripe.android.link.injection;

import android.app.Application;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory implements Factory<IntegrityRequestManager> {
    private final Provider<Application> contextProvider;

    public LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory(Provider<Application> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public IntegrityRequestManager get() {
        return provideIntegrityStandardRequestManager(this.contextProvider.get());
    }

    public static LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory create(javax.inject.Provider<Application> provider) {
        return new LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory(Providers.asDaggerProvider(provider));
    }

    public static LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory create(Provider<Application> provider) {
        return new LinkModule_Companion_ProvideIntegrityStandardRequestManagerFactory(provider);
    }

    public static IntegrityRequestManager provideIntegrityStandardRequestManager(Application application) {
        return (IntegrityRequestManager) Preconditions.checkNotNullFromProvides(LinkModule.INSTANCE.provideIntegrityStandardRequestManager(application));
    }
}
