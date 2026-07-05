package com.stripe.android.lpmfoundations.paymentmethod;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: AddPaymentMethodRequirement.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"supportsMobileInstantDebitsFlow", "", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "getSupportsMobileInstantDebitsFlow", "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z", "canShowBankForm", "getCanShowBankForm", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddPaymentMethodRequirementKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSupportsMobileInstantDebitsFlow(PaymentMethodMetadata paymentMethodMetadata) {
        return !paymentMethodMetadata.getStripeIntent().getPaymentMethodTypes().contains(PaymentMethod.Type.USBankAccount.code) && paymentMethodMetadata.getStripeIntent().getLinkFundingSources().contains("bank_account") && getCanShowBankForm(paymentMethodMetadata);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean getCanShowBankForm(PaymentMethodMetadata paymentMethodMetadata) {
        boolean z;
        boolean z2 = paymentMethodMetadata.getBillingDetailsCollectionConfiguration().getEmail() != PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never;
        if (paymentMethodMetadata.getBillingDetailsCollectionConfiguration().getAttachDefaultsToPaymentMethod()) {
            PaymentSheet.BillingDetails defaultBillingDetails = paymentMethodMetadata.getDefaultBillingDetails();
            String email = defaultBillingDetails != null ? defaultBillingDetails.getEmail() : null;
            if (email != null && !StringsKt.isBlank(email)) {
                z = true;
            }
        } else {
            z = false;
        }
        return z2 || z;
    }
}
