package com.stripe.android.financialconnections.model;

import com.facebook.device.yearclass.YearClass;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSessionExtensions.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"update", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "usesMicrodeposits", "", "setUsesMicrodepositsIfNeeded", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSessionExtensionsKt {
    public static final FinancialConnectionsSession update(FinancialConnectionsSession financialConnectionsSession, FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        Intrinsics.checkNotNullParameter(financialConnectionsSession, "<this>");
        boolean manualEntryUsesMicrodeposits = financialConnectionsSessionManifest != null ? financialConnectionsSessionManifest.getManualEntryUsesMicrodeposits() : false;
        PaymentAccount paymentAccount = financialConnectionsSession.getPaymentAccount();
        return FinancialConnectionsSession.copy$default(financialConnectionsSession, null, null, null, null, false, paymentAccount != null ? setUsesMicrodepositsIfNeeded(paymentAccount, manualEntryUsesMicrodeposits) : null, null, null, null, null, null, YearClass.CLASS_2015, null);
    }

    public static final FinancialConnectionsSession update(FinancialConnectionsSession financialConnectionsSession, boolean z) {
        Intrinsics.checkNotNullParameter(financialConnectionsSession, "<this>");
        PaymentAccount paymentAccount = financialConnectionsSession.getPaymentAccount();
        return FinancialConnectionsSession.copy$default(financialConnectionsSession, null, null, null, null, false, paymentAccount != null ? setUsesMicrodepositsIfNeeded(paymentAccount, z) : null, null, null, null, null, null, YearClass.CLASS_2015, null);
    }

    private static final PaymentAccount setUsesMicrodepositsIfNeeded(PaymentAccount paymentAccount, boolean z) {
        if (paymentAccount instanceof BankAccount) {
            return BankAccount.copy$default((BankAccount) paymentAccount, null, null, null, null, z, 15, null);
        }
        if (paymentAccount instanceof FinancialConnectionsAccount) {
            return paymentAccount;
        }
        throw new NoWhenBranchMatchedException();
    }
}
