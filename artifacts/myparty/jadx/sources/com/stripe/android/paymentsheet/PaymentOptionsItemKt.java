package com.stripe.android.paymentsheet;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionsItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {SDKConstants.PARAM_KEY, "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "getKey", "(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;)Ljava/lang/String;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionsItemKt {
    public static final String getKey(PaymentOptionsItem paymentOptionsItem) {
        PaymentMethod paymentMethod;
        Intrinsics.checkNotNullParameter(paymentOptionsItem, "<this>");
        String str = null;
        PaymentOptionsItem.SavedPaymentMethod savedPaymentMethod = paymentOptionsItem instanceof PaymentOptionsItem.SavedPaymentMethod ? (PaymentOptionsItem.SavedPaymentMethod) paymentOptionsItem : null;
        if (savedPaymentMethod != null && (paymentMethod = savedPaymentMethod.getPaymentMethod()) != null) {
            str = paymentMethod.id;
        }
        return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull(paymentOptionsItem.getViewType(), str), "-", null, null, 0, null, null, 62, null);
    }
}
