package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorListener.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/ErrorListener;", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "<init>", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "displayErrorMessage", "", "message", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ErrorListener implements StripeEditText.ErrorMessageListener {
    public static final int $stable = 8;
    private final TextInputLayout textInputLayout;

    public ErrorListener(TextInputLayout textInputLayout) {
        Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
        this.textInputLayout = textInputLayout;
    }

    @Override // com.stripe.android.view.StripeEditText.ErrorMessageListener
    public void displayErrorMessage(String message) {
        if (message == null) {
            this.textInputLayout.setError(null);
            this.textInputLayout.setErrorEnabled(false);
        } else {
            this.textInputLayout.setError(message);
        }
    }
}
