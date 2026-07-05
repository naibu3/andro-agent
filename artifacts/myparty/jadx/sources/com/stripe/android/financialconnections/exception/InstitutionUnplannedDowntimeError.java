package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstitutionUnplannedDowntimeError.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "showManualEntry", "", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLcom/stripe/android/core/exception/StripeException;)V", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getShowManualEntry", "()Z", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstitutionUnplannedDowntimeError extends FinancialConnectionsError {
    public static final int $stable = 0;
    private final FinancialConnectionsInstitution institution;
    private final boolean showManualEntry;

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    public final boolean getShowManualEntry() {
        return this.showManualEntry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionUnplannedDowntimeError(FinancialConnectionsInstitution institution, boolean z, StripeException stripeException) {
        super("InstitutionUnplannedDowntimeError", stripeException);
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.institution = institution;
        this.showManualEntry = z;
    }
}
