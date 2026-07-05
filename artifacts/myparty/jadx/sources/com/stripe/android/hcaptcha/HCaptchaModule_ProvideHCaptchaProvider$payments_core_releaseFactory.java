package com.stripe.android.hcaptcha;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory implements Factory<HCaptchaProvider> {
    @Override // javax.inject.Provider
    public HCaptchaProvider get() {
        return provideHCaptchaProvider$payments_core_release();
    }

    public static HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HCaptchaProvider provideHCaptchaProvider$payments_core_release() {
        return (HCaptchaProvider) Preconditions.checkNotNullFromProvides(HCaptchaModule.INSTANCE.provideHCaptchaProvider$payments_core_release());
    }

    /* compiled from: HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory.java */
    private static final class InstanceHolder {
        static final HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory INSTANCE = new HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory();

        private InstanceHolder() {
        }
    }
}
