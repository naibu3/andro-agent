package com.stripe.hcaptcha.task;

import com.stripe.hcaptcha.HCaptchaException;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;

/* compiled from: OnFailureListener.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/hcaptcha/task/OnFailureListener;", "", "onFailure", "", NotificationsService.EXCEPTION_KEY, "Lcom/stripe/hcaptcha/HCaptchaException;", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnFailureListener {
    void onFailure(HCaptchaException exception);
}
