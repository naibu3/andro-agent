package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstitutionPlannedDowntimeError.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "showManualEntry", "", "isToday", "backUpAt", "", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZJLcom/stripe/android/core/exception/StripeException;)V", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getShowManualEntry", "()Z", "getBackUpAt", "()J", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstitutionPlannedDowntimeError extends FinancialConnectionsError {
    public static final int $stable = 0;
    private final long backUpAt;
    private final FinancialConnectionsInstitution institution;
    private final boolean isToday;
    private final boolean showManualEntry;

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    public final boolean getShowManualEntry() {
        return this.showManualEntry;
    }

    /* renamed from: isToday, reason: from getter */
    public final boolean getIsToday() {
        return this.isToday;
    }

    public final long getBackUpAt() {
        return this.backUpAt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPlannedDowntimeError(FinancialConnectionsInstitution institution, boolean z, boolean z2, long j, StripeException stripeException) {
        super("InstitutionPlannedDowntimeError", stripeException);
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.institution = institution;
        this.showManualEntry = z;
        this.isToday = z2;
        this.backUpAt = j;
    }
}
