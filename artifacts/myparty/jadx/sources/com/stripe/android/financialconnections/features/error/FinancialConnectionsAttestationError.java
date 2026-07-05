package com.stripe.android.financialconnections.features.error;

import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.attestation.AttestationError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorExt.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorType", "Lcom/stripe/attestation/AttestationError$ErrorType;", "prefillDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "message", "", "cause", "", "<init>", "(Lcom/stripe/attestation/AttestationError$ErrorType;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Ljava/lang/String;Ljava/lang/Throwable;)V", "getErrorType", "()Lcom/stripe/attestation/AttestationError$ErrorType;", "getPrefillDetails", "()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsAttestationError extends Exception {
    public static final int $stable = 8;
    private final AttestationError.ErrorType errorType;
    private final ElementsSessionContext.PrefillDetails prefillDetails;

    public /* synthetic */ FinancialConnectionsAttestationError(AttestationError.ErrorType errorType, ElementsSessionContext.PrefillDetails prefillDetails, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, prefillDetails, str, (i & 8) != 0 ? null : th);
    }

    public final AttestationError.ErrorType getErrorType() {
        return this.errorType;
    }

    public final ElementsSessionContext.PrefillDetails getPrefillDetails() {
        return this.prefillDetails;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsAttestationError(AttestationError.ErrorType errorType, ElementsSessionContext.PrefillDetails prefillDetails, String message, Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(message, "message");
        this.errorType = errorType;
        this.prefillDetails = prefillDetails;
    }
}
