package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNoneEligibleForPaymentMethodError.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "accountsCount", "", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "merchantName", "", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "<init>", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V", "getAccountsCount", "()I", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getMerchantName", "()Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountNoneEligibleForPaymentMethodError extends FinancialConnectionsError {
    public static final int $stable = 0;
    private final int accountsCount;
    private final FinancialConnectionsInstitution institution;
    private final String merchantName;

    public final int getAccountsCount() {
        return this.accountsCount;
    }

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountNoneEligibleForPaymentMethodError(int i, FinancialConnectionsInstitution institution, String merchantName, StripeException stripeException) {
        super("AccountNoneEligibleForPaymentMethodError", stripeException);
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(stripeException, "stripeException");
        this.accountsCount = i;
        this.institution = institution;
        this.merchantName = merchantName;
    }
}
