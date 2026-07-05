package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SectionFieldErrorController.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/stripe/android/uicore/elements/FieldError;", "", "errorMessage", "", "formatArgs", "", "<init>", "(I[Ljava/lang/Object;)V", "getErrorMessage", "()I", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FieldError {
    public static final int $stable = 8;
    private final int errorMessage;
    private final Object[] formatArgs;

    public FieldError(int i, Object[] objArr) {
        this.errorMessage = i;
        this.formatArgs = objArr;
    }

    public /* synthetic */ FieldError(int i, Object[] objArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : objArr);
    }

    public final int getErrorMessage() {
        return this.errorMessage;
    }

    public final Object[] getFormatArgs() {
        return this.formatArgs;
    }
}
