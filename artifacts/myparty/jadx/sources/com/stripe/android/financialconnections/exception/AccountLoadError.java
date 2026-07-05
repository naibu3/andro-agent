package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountLoadError.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/exception/AccountLoadError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "showManualEntry", "", "canRetry", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "<init>", "(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V", "getShowManualEntry", "()Z", "getCanRetry", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountLoadError extends FinancialConnectionsError {
    public static final int $stable = 0;
    private final boolean canRetry;
    private final FinancialConnectionsInstitution institution;
    private final boolean showManualEntry;

    public final boolean getShowManualEntry() {
        return this.showManualEntry;
    }

    public final boolean getCanRetry() {
        return this.canRetry;
    }

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountLoadError(boolean z, boolean z2, FinancialConnectionsInstitution institution, StripeException stripeException) {
        super("AccountLoadError", stripeException);
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.showManualEntry = z;
        this.canRetry = z2;
        this.institution = institution;
    }
}
