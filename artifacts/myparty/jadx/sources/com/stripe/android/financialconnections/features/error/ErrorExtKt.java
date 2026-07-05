package com.stripe.android.financialconnections.features.error;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.attestation.AttestationError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, d2 = {"toAttestationErrorIfApplicable", "", "sdkPrefillDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorExtKt {
    public static final Throwable toAttestationErrorIfApplicable(Throwable th, ElementsSessionContext.PrefillDetails prefillDetails) {
        String str;
        String message;
        Intrinsics.checkNotNullParameter(th, "<this>");
        str = "An unknown error occurred";
        if (th instanceof APIException) {
            APIException aPIException = (APIException) th;
            StripeError stripeError = aPIException.getStripeError();
            if (Intrinsics.areEqual(stripeError != null ? stripeError.getCode() : null, "link_failed_to_attest_request")) {
                AttestationError.ErrorType errorType = AttestationError.ErrorType.BACKEND_VERDICT_FAILED;
                StripeError stripeError2 = aPIException.getStripeError();
                if (stripeError2 != null && (message = stripeError2.getMessage()) != null) {
                    str = message;
                }
                return new FinancialConnectionsAttestationError(errorType, prefillDetails, str, aPIException);
            }
        }
        if (!(th instanceof AttestationError)) {
            return th;
        }
        AttestationError attestationError = (AttestationError) th;
        AttestationError.ErrorType errorType2 = attestationError.getErrorType();
        String message2 = th.getMessage();
        return new FinancialConnectionsAttestationError(errorType2, prefillDetails, message2 != null ? message2 : "An unknown error occurred", attestationError);
    }
}
