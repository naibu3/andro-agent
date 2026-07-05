package com.stripe.android.uicore.elements;

import kotlin.Metadata;

/* compiled from: TextFieldState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldState;", "", "shouldShowError", "", "hasFocus", "isValid", "getError", "Lcom/stripe/android/uicore/elements/FieldError;", "isFull", "isBlank", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TextFieldState {
    FieldError getError();

    boolean isBlank();

    boolean isFull();

    boolean isValid();

    boolean shouldShowError(boolean hasFocus);
}
