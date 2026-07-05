package com.stripe.android.paymentsheet;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;

/* compiled from: ExternalPaymentMethodConfirmHandler.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "", "confirmExternalPaymentMethod", "", "externalPaymentMethodType", "", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ExternalPaymentMethodConfirmHandler {
    void confirmExternalPaymentMethod(String externalPaymentMethodType, PaymentMethod.BillingDetails billingDetails);
}
