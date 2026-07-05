package com.stripe.android.customersheet;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetViewState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"isModifiable", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "cbcEligibility", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "canUpdateFullPaymentMethodDetails", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetViewStateKt {
    public static final boolean isModifiable(PaymentMethod paymentMethod, CardBrandChoiceEligibility cbcEligibility, boolean z) {
        PaymentMethod.Card.Networks networks;
        Set<String> available;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(cbcEligibility, "cbcEligibility");
        if (z && paymentMethod.card != null) {
            return true;
        }
        PaymentMethod.Card card = paymentMethod.card;
        return (cbcEligibility instanceof CardBrandChoiceEligibility.Eligible) && (card != null && (networks = card.networks) != null && (available = networks.getAvailable()) != null && available.size() > 1);
    }
}
