package com.stripe.android.hcaptcha;

import androidx.fragment.app.FragmentActivity;
import com.stripe.android.hcaptcha.HCaptchaService;
import com.stripe.hcaptcha.HCaptcha;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.HCaptchaTokenResponse;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaOrientation;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.stripe.hcaptcha.config.HCaptchaTheme;
import com.stripe.hcaptcha.task.OnFailureListener;
import com.stripe.hcaptcha.task.OnSuccessListener;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultHCaptchaService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/hcaptcha/DefaultHCaptchaService;", "Lcom/stripe/android/hcaptcha/HCaptchaService;", "hCaptchaProvider", "Lcom/stripe/android/hcaptcha/HCaptchaProvider;", "<init>", "(Lcom/stripe/android/hcaptcha/HCaptchaProvider;)V", "performPassiveHCaptcha", "Lcom/stripe/android/hcaptcha/HCaptchaService$Result;", "activity", "Landroidx/fragment/app/FragmentActivity;", "siteKey", "", "rqData", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultHCaptchaService implements HCaptchaService {
    public static final int $stable = 8;
    private final HCaptchaProvider hCaptchaProvider;

    public DefaultHCaptchaService(HCaptchaProvider hCaptchaProvider) {
        Intrinsics.checkNotNullParameter(hCaptchaProvider, "hCaptchaProvider");
        this.hCaptchaProvider = hCaptchaProvider;
    }

    @Override // com.stripe.android.hcaptcha.HCaptchaService
    public Object performPassiveHCaptcha(FragmentActivity fragmentActivity, String str, String str2, Continuation<? super HCaptchaService.Result> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        HCaptcha hCaptcha = this.hCaptchaProvider.get(fragmentActivity);
        hCaptcha.addOnSuccessListener(new OnSuccessListener<HCaptchaTokenResponse>() { // from class: com.stripe.android.hcaptcha.DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$1
            @Override // com.stripe.hcaptcha.task.OnSuccessListener
            public void onSuccess(HCaptchaTokenResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                Continuation<HCaptchaService.Result> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m9118constructorimpl(new HCaptchaService.Result.Success(result.getTokenResult())));
            }
        });
        hCaptcha.addOnFailureListener(new OnFailureListener() { // from class: com.stripe.android.hcaptcha.DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$2
            @Override // com.stripe.hcaptcha.task.OnFailureListener
            public void onFailure(HCaptchaException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                Continuation<HCaptchaService.Result> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m9118constructorimpl(new HCaptchaService.Result.Failure(exception)));
            }
        });
        hCaptcha.setup(new HCaptchaConfig(str, false, false, true, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, HCaptchaSize.INVISIBLE, (HCaptchaOrientation) null, (HCaptchaTheme) null, (String) null, (String) null, (Function2) new Function2<HCaptchaConfig, HCaptchaException, Boolean>() { // from class: com.stripe.android.hcaptcha.DefaultHCaptchaService$performPassiveHCaptcha$2$config$1
            @Override // kotlin.jvm.functions.Function2
            public final Boolean invoke(HCaptchaConfig hCaptchaConfig, HCaptchaException exception) {
                Intrinsics.checkNotNullParameter(hCaptchaConfig, "<unused var>");
                Intrinsics.checkNotNullParameter(exception, "exception");
                return Boolean.valueOf(exception.getHCaptchaError() == HCaptchaError.SESSION_TIMEOUT);
            }
        }, 0L, true, 194530, (DefaultConstructorMarker) null)).verifyWithHCaptcha();
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
