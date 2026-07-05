package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;

/* compiled from: PaymentSelectionUpdater.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"customerAcknowledgedMandate", "", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "getCustomerAcknowledgedMandate", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Z", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSelectionUpdaterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCustomerAcknowledgedMandate(PaymentSelection.New r0) {
        return r0.getPaymentMethodCreateParams().requiresMandate();
    }
}
