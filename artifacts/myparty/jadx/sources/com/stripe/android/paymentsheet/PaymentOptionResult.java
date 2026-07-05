package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "", "paymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "didCancel", "", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentOption;Z)V", "getPaymentOption", "()Lcom/stripe/android/paymentsheet/model/PaymentOption;", "getDidCancel", "()Z", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionResult {
    public static final int $stable = 8;
    private final boolean didCancel;
    private final PaymentOption paymentOption;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOptionResult)) {
            return false;
        }
        PaymentOptionResult paymentOptionResult = (PaymentOptionResult) obj;
        return Intrinsics.areEqual(this.paymentOption, paymentOptionResult.paymentOption) && this.didCancel == paymentOptionResult.didCancel;
    }

    public int hashCode() {
        PaymentOption paymentOption = this.paymentOption;
        return ((paymentOption == null ? 0 : paymentOption.hashCode()) * 31) + Boolean.hashCode(this.didCancel);
    }

    public String toString() {
        return "PaymentOptionResult(paymentOption=" + this.paymentOption + ", didCancel=" + this.didCancel + ")";
    }

    public PaymentOptionResult(PaymentOption paymentOption, boolean z) {
        this.paymentOption = paymentOption;
        this.didCancel = z;
    }

    public final PaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    public final boolean getDidCancel() {
        return this.didCancel;
    }
}
