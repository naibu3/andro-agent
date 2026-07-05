package com.stripe.hcaptcha.task;

import android.os.Handler;
import android.os.Looper;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bH\u0004J\b\u0010\u001c\u001a\u00020\u0018H\u0004J\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0004¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010&\u001a\u00020\u0010J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010&\u001a\u00020\u0010J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010)\u001a\u00020\u0012J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010)\u001a\u00020\u0012J\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010,\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lcom/stripe/hcaptcha/task/Task;", "TResult", "", "<init>", "()V", "isComplete", "", "isSuccessful", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Ljava/lang/Object;", NotificationsService.EXCEPTION_KEY, "Lcom/stripe/hcaptcha/HCaptchaException;", "onSuccessListeners", "", "Lcom/stripe/hcaptcha/task/OnSuccessListener;", "onFailureListeners", "Lcom/stripe/hcaptcha/task/OnFailureListener;", "onOpenListeners", "Lcom/stripe/hcaptcha/task/OnOpenListener;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "reset", "", "setResult", "(Ljava/lang/Object;)V", "setException", "captchaOpened", "scheduleCaptchaExpired", "tokenExpiration", "Lkotlin/time/Duration;", "scheduleCaptchaExpired-LRDsOJo", "(J)V", "addOnSuccessListener", "onSuccessListener", "removeOnSuccessListener", "addOnFailureListener", "onFailureListener", "removeOnFailureListener", "addOnOpenListener", "onOpenListener", "removeOnOpenListener", "removeAllListeners", "tryCallbacks", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class Task<TResult> {
    private HCaptchaException exception;
    private boolean isComplete;
    private boolean isSuccessful;
    private TResult result;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final List<OnSuccessListener<TResult>> onSuccessListeners = new ArrayList();
    private final List<OnFailureListener> onFailureListeners = new ArrayList();
    private final List<OnOpenListener> onOpenListeners = new ArrayList();

    protected Task() {
        reset();
    }

    protected final Handler getHandler() {
        return this.handler;
    }

    private final void reset() {
        this.isComplete = false;
        this.isSuccessful = false;
        this.result = null;
        this.exception = null;
    }

    protected final void setResult(TResult result) {
        this.result = result;
        this.isSuccessful = true;
        this.isComplete = true;
        tryCallbacks();
    }

    protected final void setException(HCaptchaException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.exception = exception;
        this.isSuccessful = false;
        this.isComplete = true;
        tryCallbacks();
    }

    protected final void captchaOpened() {
        Iterator<T> it = this.onOpenListeners.iterator();
        while (it.hasNext()) {
            ((OnOpenListener) it.next()).onOpen();
        }
    }

    /* renamed from: scheduleCaptchaExpired-LRDsOJo, reason: not valid java name */
    protected final void m8948scheduleCaptchaExpiredLRDsOJo(long tokenExpiration) {
        this.handler.postDelayed(new Runnable() { // from class: com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Task.scheduleCaptchaExpired_LRDsOJo$lambda$1(this.f$0);
            }
        }, Duration.m10493getInWholeMillisecondsimpl(tokenExpiration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleCaptchaExpired_LRDsOJo$lambda$1(Task task) {
        Iterator<OnFailureListener> it = task.onFailureListeners.iterator();
        while (it.hasNext()) {
            it.next().onFailure(new HCaptchaException(HCaptchaError.TOKEN_TIMEOUT, null, 2, null));
        }
    }

    public final Task<TResult> addOnSuccessListener(OnSuccessListener<TResult> onSuccessListener) {
        Intrinsics.checkNotNullParameter(onSuccessListener, "onSuccessListener");
        this.onSuccessListeners.add(onSuccessListener);
        tryCallbacks();
        return this;
    }

    public final Task<TResult> removeOnSuccessListener(OnSuccessListener<TResult> onSuccessListener) {
        Intrinsics.checkNotNullParameter(onSuccessListener, "onSuccessListener");
        this.onSuccessListeners.remove(onSuccessListener);
        return this;
    }

    public final Task<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
        Intrinsics.checkNotNullParameter(onFailureListener, "onFailureListener");
        this.onFailureListeners.add(onFailureListener);
        tryCallbacks();
        return this;
    }

    public final Task<TResult> removeOnFailureListener(OnFailureListener onFailureListener) {
        Intrinsics.checkNotNullParameter(onFailureListener, "onFailureListener");
        this.onFailureListeners.remove(onFailureListener);
        return this;
    }

    public final Task<TResult> addOnOpenListener(OnOpenListener onOpenListener) {
        Intrinsics.checkNotNullParameter(onOpenListener, "onOpenListener");
        this.onOpenListeners.add(onOpenListener);
        tryCallbacks();
        return this;
    }

    public final Task<TResult> removeOnOpenListener(OnOpenListener onOpenListener) {
        Intrinsics.checkNotNullParameter(onOpenListener, "onOpenListener");
        this.onOpenListeners.remove(onOpenListener);
        return this;
    }

    public final Task<TResult> removeAllListeners() {
        this.onSuccessListeners.clear();
        this.onFailureListeners.clear();
        this.onOpenListeners.clear();
        return this;
    }

    private final void tryCallbacks() {
        TResult tresult = this.result;
        boolean z = false;
        if (tresult != null) {
            Iterator<T> it = this.onSuccessListeners.iterator();
            while (it.hasNext()) {
                ((OnSuccessListener) it.next()).onSuccess(tresult);
                z = true;
            }
        }
        HCaptchaException hCaptchaException = this.exception;
        if (hCaptchaException != null) {
            Iterator<T> it2 = this.onFailureListeners.iterator();
            while (it2.hasNext()) {
                ((OnFailureListener) it2.next()).onFailure(hCaptchaException);
                z = true;
            }
        }
        if (z) {
            reset();
        }
    }
}
