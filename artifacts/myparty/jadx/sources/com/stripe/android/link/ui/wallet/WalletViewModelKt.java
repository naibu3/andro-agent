package com.stripe.android.link.ui.wallet;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.ui.core.elements.CardDetailsUtil;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletViewModel.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"toPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/link/ui/wallet/WalletUiState;", "isSetupForFutureUsage", "", "Lcom/stripe/android/model/StripeIntent;", "passthroughModeEnabled", "secondaryButtonLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentMethodCreateParams toPaymentMethodCreateParams(WalletUiState walletUiState) {
        return FieldValuesToParamsMapConverter.Companion.transformToPaymentMethodCreateParams$default(FieldValuesToParamsMapConverter.INSTANCE, CardDetailsUtil.INSTANCE.createExpiryDateFormFieldValues(walletUiState.getExpiryDateInput()), PaymentMethod.Type.Card.code, false, null, 8, null);
    }

    public static final boolean isSetupForFutureUsage(StripeIntent stripeIntent, boolean z) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        if (stripeIntent instanceof PaymentIntent) {
            if (z) {
                return ((PaymentIntent) stripeIntent).isSetupFutureUsageSet(PaymentMethod.Type.Card.code);
            }
            return ((PaymentIntent) stripeIntent).isSetupFutureUsageSet(PaymentMethod.Type.Link.code);
        }
        if (stripeIntent instanceof SetupIntent) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvableString secondaryButtonLabel(StripeIntent stripeIntent, LinkLaunchMode linkLaunchMode) {
        if ((linkLaunchMode instanceof LinkLaunchMode.Full) || (linkLaunchMode instanceof LinkLaunchMode.Confirmation)) {
            if (stripeIntent instanceof PaymentIntent) {
                return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_wallet_pay_another_way, new Object[0], null, 4, null);
            }
            if (stripeIntent instanceof SetupIntent) {
                return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_wallet_continue_another_way, new Object[0], null, 4, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection) && !(linkLaunchMode instanceof LinkLaunchMode.Authentication)) {
            throw new NoWhenBranchMatchedException();
        }
        return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_wallet_continue_another_way, new Object[0], null, 4, null);
    }
}
