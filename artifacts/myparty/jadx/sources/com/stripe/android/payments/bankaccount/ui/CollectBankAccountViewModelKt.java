package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CollectBankAccountViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"retrieveElementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollectBankAccountViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ElementsSessionContext retrieveElementsSessionContext(CollectBankAccountConfiguration collectBankAccountConfiguration) {
        if (collectBankAccountConfiguration instanceof CollectBankAccountConfiguration.InstantDebits) {
            return ((CollectBankAccountConfiguration.InstantDebits) collectBankAccountConfiguration).getElementsSessionContext();
        }
        if (collectBankAccountConfiguration instanceof CollectBankAccountConfiguration.USBankAccountInternal) {
            return ((CollectBankAccountConfiguration.USBankAccountInternal) collectBankAccountConfiguration).getElementsSessionContext();
        }
        if (collectBankAccountConfiguration instanceof CollectBankAccountConfiguration.USBankAccount) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
