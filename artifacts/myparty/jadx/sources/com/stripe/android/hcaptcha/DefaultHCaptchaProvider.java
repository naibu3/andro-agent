package com.stripe.android.hcaptcha;

import androidx.fragment.app.FragmentActivity;
import com.stripe.hcaptcha.HCaptcha;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/hcaptcha/DefaultHCaptchaProvider;", "Lcom/stripe/android/hcaptcha/HCaptchaProvider;", "<init>", "()V", "get", "Lcom/stripe/hcaptcha/HCaptcha;", "activity", "Landroidx/fragment/app/FragmentActivity;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultHCaptchaProvider implements HCaptchaProvider {
    public static final int $stable = 0;

    @Override // com.stripe.android.hcaptcha.HCaptchaProvider
    public HCaptcha get(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return HCaptcha.Companion.getClient$default(HCaptcha.INSTANCE, activity, null, 2, null);
    }
}
