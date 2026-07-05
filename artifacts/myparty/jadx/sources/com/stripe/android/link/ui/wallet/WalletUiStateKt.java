package com.stripe.android.link.ui.wallet;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.paymentsheet.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WalletUiState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"makeMandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "isSettingUp", "", "merchantName", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletUiStateKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvableString makeMandateText(ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, String str) {
        if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
            return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_wallet_bank_account_terms, new Object[0], null, 4, null);
        }
        if (!(paymentDetails instanceof ConsumerPaymentDetails.Card) && !(paymentDetails instanceof ConsumerPaymentDetails.Passthrough)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_card_mandate, new Object[]{str}, null, 4, null);
        }
        return null;
    }
}
