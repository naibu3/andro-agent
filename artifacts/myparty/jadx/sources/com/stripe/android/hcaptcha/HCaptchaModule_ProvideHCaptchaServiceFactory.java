package com.stripe.android.hcaptcha;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class HCaptchaModule_ProvideHCaptchaServiceFactory implements Factory<HCaptchaService> {
    private final Provider<HCaptchaProvider> hCaptchaProvider;

    public HCaptchaModule_ProvideHCaptchaServiceFactory(Provider<HCaptchaProvider> provider) {
        this.hCaptchaProvider = provider;
    }

    @Override // javax.inject.Provider
    public HCaptchaService get() {
        return provideHCaptchaService(this.hCaptchaProvider.get());
    }

    public static HCaptchaModule_ProvideHCaptchaServiceFactory create(javax.inject.Provider<HCaptchaProvider> provider) {
        return new HCaptchaModule_ProvideHCaptchaServiceFactory(Providers.asDaggerProvider(provider));
    }

    public static HCaptchaModule_ProvideHCaptchaServiceFactory create(Provider<HCaptchaProvider> provider) {
        return new HCaptchaModule_ProvideHCaptchaServiceFactory(provider);
    }

    public static HCaptchaService provideHCaptchaService(HCaptchaProvider hCaptchaProvider) {
        return (HCaptchaService) Preconditions.checkNotNullFromProvides(HCaptchaModule.INSTANCE.provideHCaptchaService(hCaptchaProvider));
    }
}
