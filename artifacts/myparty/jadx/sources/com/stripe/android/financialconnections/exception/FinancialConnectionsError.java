package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsError.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006BK\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "Lcom/stripe/android/core/exception/StripeException;", "name", "", "stripeException", "<init>", "(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V", "stripeError", "Lcom/stripe/android/core/StripeError;", "requestId", "statusCode", "", "cause", "", "message", "(Ljava/lang/String;Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getStripeException", "()Lcom/stripe/android/core/exception/StripeException;", "analyticsValue", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FinancialConnectionsError extends StripeException {
    public static final int $stable = 8;
    private final String name;
    private final StripeException stripeException;

    public final String getName() {
        return this.name;
    }

    public final StripeException getStripeException() {
        return this.stripeException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsError(String name, StripeException stripeException) {
        super(stripeException.getStripeError(), stripeException.getRequestId(), stripeException.getStatusCode(), stripeException.getCause(), stripeException.getMessage());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.name = name;
        this.stripeException = stripeException;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "fcError";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FinancialConnectionsError(String str, StripeError stripeError, String str2, int i, Throwable th, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        stripeError = (i2 & 2) != 0 ? null : stripeError;
        this(str, stripeError, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : th, (i2 & 32) != 0 ? stripeError != null ? stripeError.getMessage() : null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsError(String name, StripeError stripeError, String str, int i, Throwable th, String str2) {
        this(name, new StripeException(stripeError, str, i, th, str2) { // from class: com.stripe.android.financialconnections.exception.FinancialConnectionsError.1
        });
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
