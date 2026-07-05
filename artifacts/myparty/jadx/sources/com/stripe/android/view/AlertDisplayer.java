package com.stripe.android.view;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.stripe.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertDisplayer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/AlertDisplayer;", "", "show", "", "message", "", "DefaultAlertDisplayer", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AlertDisplayer {
    void show(String message);

    /* compiled from: AlertDisplayer.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/AlertDisplayer$DefaultAlertDisplayer;", "Lcom/stripe/android/view/AlertDisplayer;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "show", "", "message", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultAlertDisplayer implements AlertDisplayer {
        public static final int $stable = 8;
        private final Activity activity;

        public DefaultAlertDisplayer(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.stripe.android.view.AlertDisplayer
        public void show(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (this.activity.isFinishing()) {
                return;
            }
            new AlertDialog.Builder(this.activity, R.style.StripeAlertDialogStyle).setMessage(message).setCancelable(true).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.AlertDisplayer$DefaultAlertDisplayer$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).create().show();
        }
    }
}
