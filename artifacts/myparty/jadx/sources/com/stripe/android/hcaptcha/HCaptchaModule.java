package com.stripe.android.hcaptcha;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaModule.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/hcaptcha/HCaptchaModule;", "", "<init>", "()V", "provideHCaptchaProvider", "Lcom/stripe/android/hcaptcha/HCaptchaProvider;", "provideHCaptchaProvider$payments_core_release", "provideHCaptchaService", "Lcom/stripe/android/hcaptcha/HCaptchaService;", "hCaptchaProvider", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class HCaptchaModule {
    public static final int $stable = 0;
    public static final HCaptchaModule INSTANCE = new HCaptchaModule();

    private HCaptchaModule() {
    }

    @Provides
    public final HCaptchaProvider provideHCaptchaProvider$payments_core_release() {
        return new DefaultHCaptchaProvider();
    }

    @Provides
    public final HCaptchaService provideHCaptchaService(HCaptchaProvider hCaptchaProvider) {
        Intrinsics.checkNotNullParameter(hCaptchaProvider, "hCaptchaProvider");
        return new DefaultHCaptchaService(hCaptchaProvider);
    }
}
