package com.stripe.android.payments.bankaccount.navigation;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountForInstantDebitsResult;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountForInstantDebitsResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toInstantDebitsResult", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollectBankAccountForInstantDebitsResultKt {
    public static final CollectBankAccountForInstantDebitsResult toInstantDebitsResult(CollectBankAccountResultInternal collectBankAccountResultInternal) {
        Intrinsics.checkNotNullParameter(collectBankAccountResultInternal, "<this>");
        if (collectBankAccountResultInternal instanceof CollectBankAccountResultInternal.Cancelled) {
            return CollectBankAccountForInstantDebitsResult.Cancelled.INSTANCE;
        }
        if (collectBankAccountResultInternal instanceof CollectBankAccountResultInternal.Completed) {
            CollectBankAccountResultInternal.Completed completed = (CollectBankAccountResultInternal.Completed) collectBankAccountResultInternal;
            if (completed.getResponse().getInstantDebitsData() == null) {
                return new CollectBankAccountForInstantDebitsResult.Failed(new IllegalArgumentException("instant debits data cannot be null"));
            }
            return new CollectBankAccountForInstantDebitsResult.Completed(completed.getResponse().getIntent(), completed.getResponse().getInstantDebitsData().getPaymentMethod(), completed.getResponse().getInstantDebitsData().getLast4(), completed.getResponse().getInstantDebitsData().getBankName(), completed.getResponse().getInstantDebitsData().getEligibleForIncentive());
        }
        if (!(collectBankAccountResultInternal instanceof CollectBankAccountResultInternal.Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        return new CollectBankAccountForInstantDebitsResult.Failed(((CollectBankAccountResultInternal.Failed) collectBankAccountResultInternal).getError());
    }
}
