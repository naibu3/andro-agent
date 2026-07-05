package com.stripe.android.paymentsheet.state;

import com.stripe.android.paymentsheet.state.PaymentSheetLoadingException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetLoadingException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"asPaymentSheetLoadingException", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "", "getAsPaymentSheetLoadingException", "(Ljava/lang/Throwable;)Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetLoadingExceptionKt {
    public static final PaymentSheetLoadingException getAsPaymentSheetLoadingException(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        PaymentSheetLoadingException paymentSheetLoadingException = th instanceof PaymentSheetLoadingException ? (PaymentSheetLoadingException) th : null;
        return paymentSheetLoadingException == null ? new PaymentSheetLoadingException.Unknown(th) : paymentSheetLoadingException;
    }
}
