package com.stripe.hcaptcha;

import com.stripe.hcaptcha.config.HCaptchaConfig;
import kotlin.Metadata;

/* compiled from: HCaptcha.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/stripe/hcaptcha/IHCaptcha;", "", "setup", "Lcom/stripe/hcaptcha/HCaptcha;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "verifyWithHCaptcha", "reset", "", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IHCaptcha {
    void reset();

    HCaptcha setup(HCaptchaConfig config);

    HCaptcha verifyWithHCaptcha();
}
