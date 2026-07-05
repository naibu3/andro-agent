package com.stripe.hcaptcha;

import androidx.fragment.app.FragmentActivity;
import com.stripe.hcaptcha.task.OnFailureListener;
import com.stripe.hcaptcha.task.OnLoadedListener;
import com.stripe.hcaptcha.task.OnOpenListener;
import com.stripe.hcaptcha.task.OnSuccessListener;
import kotlin.Metadata;

/* compiled from: IHCaptchaVerifier.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "Lcom/stripe/hcaptcha/task/OnLoadedListener;", "Lcom/stripe/hcaptcha/task/OnOpenListener;", "Lcom/stripe/hcaptcha/task/OnSuccessListener;", "", "Lcom/stripe/hcaptcha/task/OnFailureListener;", "startVerification", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "reset", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IHCaptchaVerifier extends OnLoadedListener, OnOpenListener, OnSuccessListener<String>, OnFailureListener {
    void reset();

    void startVerification(FragmentActivity activity);
}
