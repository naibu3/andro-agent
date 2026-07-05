package com.stripe.android.view;

import android.text.Editable;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackUpFieldDeleteListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/BackUpFieldDeleteListener;", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "backUpTarget", "Lcom/stripe/android/view/StripeEditText;", "<init>", "(Lcom/stripe/android/view/StripeEditText;)V", "onDeleteEmpty", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackUpFieldDeleteListener implements StripeEditText.DeleteEmptyListener {
    public static final int $stable = 8;
    private final StripeEditText backUpTarget;

    public BackUpFieldDeleteListener(StripeEditText backUpTarget) {
        Intrinsics.checkNotNullParameter(backUpTarget, "backUpTarget");
        this.backUpTarget = backUpTarget;
    }

    @Override // com.stripe.android.view.StripeEditText.DeleteEmptyListener
    public void onDeleteEmpty() {
        String string;
        Editable text = this.backUpTarget.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() > 1) {
            StripeEditText stripeEditText = this.backUpTarget;
            String strSubstring = string.substring(0, string.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            stripeEditText.setText(strSubstring);
        }
        this.backUpTarget.requestFocus();
        StripeEditText stripeEditText2 = this.backUpTarget;
        stripeEditText2.setSelection(stripeEditText2.length());
    }
}
