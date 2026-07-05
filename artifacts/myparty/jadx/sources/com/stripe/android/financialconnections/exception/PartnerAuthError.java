package com.stripe.android.financialconnections.exception;

import kotlin.Metadata;

/* compiled from: PartnerAuthError.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/exception/PartnerAuthError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "message", "", "<init>", "(Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartnerAuthError extends FinancialConnectionsError {
    public static final int $stable = 0;

    public PartnerAuthError(String str) {
        super("PartnerAuthError", null, null, 0, null, str, 30, null);
    }
}
