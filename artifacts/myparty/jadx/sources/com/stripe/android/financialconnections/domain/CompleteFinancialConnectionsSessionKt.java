package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.Metadata;

/* compiled from: CompleteFinancialConnectionsSession.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u0005"}, d2 = {"completionStatus", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "closeAuthFlowError", "", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompleteFinancialConnectionsSessionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String completionStatus(FinancialConnectionsSession financialConnectionsSession, Throwable th) {
        if (!financialConnectionsSession.getAccounts().getData().isEmpty() || financialConnectionsSession.getPaymentAccount() != null || financialConnectionsSession.getBankAccountToken() != null) {
            return "completed";
        }
        if (th != null) {
            return "failed";
        }
        return "canceled";
    }
}
