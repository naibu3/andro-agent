package com.qonversion.android.sdk.internal.billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingError.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingError;", "", "billingResponseCode", "", "message", "", "(ILjava/lang/String;)V", "getBillingResponseCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class BillingError {
    private final int billingResponseCode;
    private final String message;

    public static /* synthetic */ BillingError copy$default(BillingError billingError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = billingError.billingResponseCode;
        }
        if ((i2 & 2) != 0) {
            str = billingError.message;
        }
        return billingError.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBillingResponseCode() {
        return this.billingResponseCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final BillingError copy(int billingResponseCode, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new BillingError(billingResponseCode, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingError)) {
            return false;
        }
        BillingError billingError = (BillingError) other;
        return this.billingResponseCode == billingError.billingResponseCode && Intrinsics.areEqual(this.message, billingError.message);
    }

    public int hashCode() {
        return (Integer.hashCode(this.billingResponseCode) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "BillingError(billingResponseCode=" + this.billingResponseCode + ", message=" + this.message + ")";
    }

    public BillingError(int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.billingResponseCode = i;
        this.message = message;
    }

    public final int getBillingResponseCode() {
        return this.billingResponseCode;
    }

    public final String getMessage() {
        return this.message;
    }
}
