package com.stripe.android.paymentsheet.utils;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.ui.core.Amount;
import kotlin.Metadata;

/* compiled from: PrimaryButtonUtils.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0012\u0010\b\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\t"}, d2 = {"buyButtonLabel", "Lcom/stripe/android/core/strings/ResolvableString;", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "Lcom/stripe/android/ui/core/Amount;", "primaryButtonLabel", "", "isForPaymentIntent", "", "continueButtonLabel", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrimaryButtonUtilsKt {
    public static final ResolvableString buyButtonLabel(Amount amount, String str, boolean z) {
        ResolvableString resolvableStringBuildPayButtonLabel;
        ResolvableString resolvableString;
        if (str != null && (resolvableString = ResolvableStringUtilsKt.getResolvableString(str)) != null) {
            return resolvableString;
        }
        if (z) {
            return (amount == null || (resolvableStringBuildPayButtonLabel = amount.buildPayButtonLabel()) == null) ? ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_pay_button_label) : resolvableStringBuildPayButtonLabel;
        }
        return ResolvableStringUtilsKt.getResolvableString(com.stripe.android.ui.core.R.string.stripe_setup_button_label);
    }

    public static final ResolvableString continueButtonLabel(String str) {
        ResolvableString resolvableString;
        return (str == null || (resolvableString = ResolvableStringUtilsKt.getResolvableString(str)) == null) ? ResolvableStringUtilsKt.getResolvableString(com.stripe.android.ui.core.R.string.stripe_continue_button_label) : resolvableString;
    }
}
