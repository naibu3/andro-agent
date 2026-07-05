package com.stripe.android.paymentsheet.forms;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.ui.core.Amount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormArgumentsFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "paymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormArgumentsFactory {
    public static final int $stable = 0;
    public static final FormArgumentsFactory INSTANCE = new FormArgumentsFactory();

    private FormArgumentsFactory() {
    }

    public final FormArguments create(String paymentMethodCode, PaymentMethodMetadata metadata) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        String merchantName = metadata.getMerchantName();
        Amount amount = metadata.amount();
        PaymentSheet.BillingDetails defaultBillingDetails = metadata.getDefaultBillingDetails();
        AddressDetails shippingDetails = metadata.getShippingDetails();
        PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = metadata.getBillingDetailsCollectionConfiguration();
        return new FormArguments(paymentMethodCode, metadata.getCbcEligibility(), merchantName, amount, defaultBillingDetails, shippingDetails, metadata.getPaymentMethodSaveConsentBehavior(), metadata.hasIntentToSetup(paymentMethodCode), billingDetailsCollectionConfiguration);
    }
}
