package com.stripe.android.paymentelement.confirmation.cpms;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomPaymentMethodInput.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;", "", "paymentElementCallbackIdentifier", "", "type", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V", "getPaymentElementCallbackIdentifier", "()Ljava/lang/String;", "getType", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomPaymentMethodInput {
    public static final int $stable = 8;
    private final PaymentMethod.BillingDetails billingDetails;
    private final String paymentElementCallbackIdentifier;
    private final PaymentSheet.CustomPaymentMethod type;

    public static /* synthetic */ CustomPaymentMethodInput copy$default(CustomPaymentMethodInput customPaymentMethodInput, String str, PaymentSheet.CustomPaymentMethod customPaymentMethod, PaymentMethod.BillingDetails billingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customPaymentMethodInput.paymentElementCallbackIdentifier;
        }
        if ((i & 2) != 0) {
            customPaymentMethod = customPaymentMethodInput.type;
        }
        if ((i & 4) != 0) {
            billingDetails = customPaymentMethodInput.billingDetails;
        }
        return customPaymentMethodInput.copy(str, customPaymentMethod, billingDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentElementCallbackIdentifier() {
        return this.paymentElementCallbackIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentSheet.CustomPaymentMethod getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final CustomPaymentMethodInput copy(String paymentElementCallbackIdentifier, PaymentSheet.CustomPaymentMethod type, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(type, "type");
        return new CustomPaymentMethodInput(paymentElementCallbackIdentifier, type, billingDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomPaymentMethodInput)) {
            return false;
        }
        CustomPaymentMethodInput customPaymentMethodInput = (CustomPaymentMethodInput) other;
        return Intrinsics.areEqual(this.paymentElementCallbackIdentifier, customPaymentMethodInput.paymentElementCallbackIdentifier) && Intrinsics.areEqual(this.type, customPaymentMethodInput.type) && Intrinsics.areEqual(this.billingDetails, customPaymentMethodInput.billingDetails);
    }

    public int hashCode() {
        int iHashCode = ((this.paymentElementCallbackIdentifier.hashCode() * 31) + this.type.hashCode()) * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        return iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode());
    }

    public String toString() {
        return "CustomPaymentMethodInput(paymentElementCallbackIdentifier=" + this.paymentElementCallbackIdentifier + ", type=" + this.type + ", billingDetails=" + this.billingDetails + ")";
    }

    public CustomPaymentMethodInput(String paymentElementCallbackIdentifier, PaymentSheet.CustomPaymentMethod type, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(type, "type");
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        this.type = type;
        this.billingDetails = billingDetails;
    }

    public final String getPaymentElementCallbackIdentifier() {
        return this.paymentElementCallbackIdentifier;
    }

    public final PaymentSheet.CustomPaymentMethod getType() {
        return this.type;
    }

    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }
}
