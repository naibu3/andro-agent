package com.stripe.android.payments.financialconnections;

import kotlin.Metadata;

/* compiled from: IsFinancialConnectionsSdkAvailable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;", "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;", "<init>", "()V", "invoke", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultIsFinancialConnectionsAvailable implements IsFinancialConnectionsSdkAvailable {
    public static final int $stable = 0;
    public static final DefaultIsFinancialConnectionsAvailable INSTANCE = new DefaultIsFinancialConnectionsAvailable();

    private DefaultIsFinancialConnectionsAvailable() {
    }

    @Override // com.stripe.android.payments.financialconnections.IsFinancialConnectionsSdkAvailable
    public boolean invoke() throws ClassNotFoundException {
        try {
            Class.forName("com.stripe.android.financialconnections.FinancialConnectionsSheet");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
