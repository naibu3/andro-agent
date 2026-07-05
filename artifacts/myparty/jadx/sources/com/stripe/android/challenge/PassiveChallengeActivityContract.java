package com.stripe.android.challenge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.challenge.PassiveChallengeActivityResult;
import com.stripe.android.model.PassiveCaptchaParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassiveChallengeActivityContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/challenge/PassiveChallengeActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/challenge/PassiveChallengeActivityContract$Args;", "Lcom/stripe/android/challenge/PassiveChallengeActivityResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PassiveChallengeActivityContract extends ActivityResultContract<Args, PassiveChallengeActivityResult> {
    public static final int $stable = 0;
    public static final String EXTRA_RESULT = "com.stripe.android.challenge.PassiveChallengeActivityContract.extra_result";

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return PassiveChallengeActivity.INSTANCE.createIntent$paymentsheet_release(context, new PassiveChallengeArgs(input.getPassiveCaptchaParams()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public PassiveChallengeActivityResult parseResult(int resultCode, Intent intent) {
        Bundle extras;
        PassiveChallengeActivityResult passiveChallengeActivityResult = (intent == null || (extras = intent.getExtras()) == null) ? null : (PassiveChallengeActivityResult) BundleCompat.getParcelable(extras, EXTRA_RESULT, PassiveChallengeActivityResult.class);
        return passiveChallengeActivityResult == null ? new PassiveChallengeActivityResult.Failed(new Throwable("No result")) : passiveChallengeActivityResult;
    }

    /* compiled from: PassiveChallengeActivityContract.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/challenge/PassiveChallengeActivityContract$Args;", "", "passiveCaptchaParams", "Lcom/stripe/android/model/PassiveCaptchaParams;", "<init>", "(Lcom/stripe/android/model/PassiveCaptchaParams;)V", "getPassiveCaptchaParams", "()Lcom/stripe/android/model/PassiveCaptchaParams;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args {
        public static final int $stable = PassiveCaptchaParams.$stable;
        private final PassiveCaptchaParams passiveCaptchaParams;

        public static /* synthetic */ Args copy$default(Args args, PassiveCaptchaParams passiveCaptchaParams, int i, Object obj) {
            if ((i & 1) != 0) {
                passiveCaptchaParams = args.passiveCaptchaParams;
            }
            return args.copy(passiveCaptchaParams);
        }

        /* renamed from: component1, reason: from getter */
        public final PassiveCaptchaParams getPassiveCaptchaParams() {
            return this.passiveCaptchaParams;
        }

        public final Args copy(PassiveCaptchaParams passiveCaptchaParams) {
            Intrinsics.checkNotNullParameter(passiveCaptchaParams, "passiveCaptchaParams");
            return new Args(passiveCaptchaParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.passiveCaptchaParams, ((Args) other).passiveCaptchaParams);
        }

        public int hashCode() {
            return this.passiveCaptchaParams.hashCode();
        }

        public String toString() {
            return "Args(passiveCaptchaParams=" + this.passiveCaptchaParams + ")";
        }

        public Args(PassiveCaptchaParams passiveCaptchaParams) {
            Intrinsics.checkNotNullParameter(passiveCaptchaParams, "passiveCaptchaParams");
            this.passiveCaptchaParams = passiveCaptchaParams;
        }

        public final PassiveCaptchaParams getPassiveCaptchaParams() {
            return this.passiveCaptchaParams;
        }
    }
}
