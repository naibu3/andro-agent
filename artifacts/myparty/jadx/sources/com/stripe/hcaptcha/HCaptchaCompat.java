package com.stripe.hcaptcha;

import android.os.Build;
import android.os.Bundle;
import androidx.core.os.BundleCompat;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaCompat.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\tJ9\u0010\u0014\u001a\u0004\u0018\u0001H\u0015\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0019H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/hcaptcha/HCaptchaCompat;", "", "<init>", "()V", "KEY_CONFIG", "", "KEY_INTERNAL_CONFIG", "KEY_LISTENER", "storeValues", "Landroid/os/Bundle;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "internalConfig", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/hcaptcha/HCaptchaStateListener;", "getConfig", "bundle", "getInternalConfig", "getStateListener", "getSerializable", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Serializable;", SDKConstants.PARAM_KEY, "clazz", "Ljava/lang/Class;", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HCaptchaCompat {
    public static final HCaptchaCompat INSTANCE = new HCaptchaCompat();
    private static final String KEY_CONFIG = "hCaptchaConfig";
    private static final String KEY_INTERNAL_CONFIG = "hCaptchaInternalConfig";
    private static final String KEY_LISTENER = "hCaptchaDialogListener";

    private HCaptchaCompat() {
    }

    public final Bundle storeValues(HCaptchaConfig config, HCaptchaInternalConfig internalConfig, HCaptchaStateListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Bundle bundle = new Bundle();
        bundle.putSerializable(KEY_CONFIG, config);
        bundle.putSerializable(KEY_INTERNAL_CONFIG, internalConfig);
        bundle.putParcelable(KEY_LISTENER, listener);
        return bundle;
    }

    public final HCaptchaConfig getConfig(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return (HCaptchaConfig) getSerializable(bundle, KEY_CONFIG, HCaptchaConfig.class);
    }

    public final HCaptchaInternalConfig getInternalConfig(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return (HCaptchaInternalConfig) getSerializable(bundle, KEY_INTERNAL_CONFIG, HCaptchaInternalConfig.class);
    }

    public final HCaptchaStateListener getStateListener(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return (HCaptchaStateListener) BundleCompat.getParcelable(bundle, KEY_LISTENER, HCaptchaStateListener.class);
    }

    private final <T extends Serializable> T getSerializable(Bundle bundle, String key, Class<T> clazz) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) bundle.getSerializable(key, clazz);
        }
        return (T) bundle.getSerializable(key);
    }
}
