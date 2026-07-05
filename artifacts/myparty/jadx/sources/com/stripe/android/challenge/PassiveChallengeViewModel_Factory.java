package com.stripe.android.challenge;

import com.stripe.android.hcaptcha.HCaptchaService;
import com.stripe.android.model.PassiveCaptchaParams;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class PassiveChallengeViewModel_Factory implements Factory<PassiveChallengeViewModel> {
    private final Provider<HCaptchaService> hCaptchaServiceProvider;
    private final Provider<PassiveCaptchaParams> passiveCaptchaParamsProvider;

    public PassiveChallengeViewModel_Factory(Provider<PassiveCaptchaParams> provider, Provider<HCaptchaService> provider2) {
        this.passiveCaptchaParamsProvider = provider;
        this.hCaptchaServiceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PassiveChallengeViewModel get() {
        return newInstance(this.passiveCaptchaParamsProvider.get(), this.hCaptchaServiceProvider.get());
    }

    public static PassiveChallengeViewModel_Factory create(javax.inject.Provider<PassiveCaptchaParams> provider, javax.inject.Provider<HCaptchaService> provider2) {
        return new PassiveChallengeViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
    }

    public static PassiveChallengeViewModel_Factory create(Provider<PassiveCaptchaParams> provider, Provider<HCaptchaService> provider2) {
        return new PassiveChallengeViewModel_Factory(provider, provider2);
    }

    public static PassiveChallengeViewModel newInstance(PassiveCaptchaParams passiveCaptchaParams, HCaptchaService hCaptchaService) {
        return new PassiveChallengeViewModel(passiveCaptchaParams, hCaptchaService);
    }
}
