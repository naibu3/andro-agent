package com.stripe.android.paymentsheet.model;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedSelection.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toSavedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavedSelectionKt {
    public static final SavedSelection toSavedSelection(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.GooglePay) {
            return SavedSelection.GooglePay.INSTANCE;
        }
        if (paymentSelection instanceof PaymentSelection.Link) {
            return SavedSelection.Link.INSTANCE;
        }
        if (!(paymentSelection instanceof PaymentSelection.Saved)) {
            return null;
        }
        String str = ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().id;
        if (str == null) {
            str = "";
        }
        return new SavedSelection.PaymentMethod(str);
    }
}
