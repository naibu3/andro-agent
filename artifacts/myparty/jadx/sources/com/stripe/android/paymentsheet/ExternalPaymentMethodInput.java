package com.stripe.android.paymentsheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPaymentMethodContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;", "", "paymentElementCallbackIdentifier", "", "type", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V", "getPaymentElementCallbackIdentifier", "()Ljava/lang/String;", "getType", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ExternalPaymentMethodInput {
    public static final int $stable = PaymentMethod.BillingDetails.$stable;
    private final PaymentMethod.BillingDetails billingDetails;
    private final String paymentElementCallbackIdentifier;
    private final String type;

    public static /* synthetic */ ExternalPaymentMethodInput copy$default(ExternalPaymentMethodInput externalPaymentMethodInput, String str, String str2, PaymentMethod.BillingDetails billingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalPaymentMethodInput.paymentElementCallbackIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = externalPaymentMethodInput.type;
        }
        if ((i & 4) != 0) {
            billingDetails = externalPaymentMethodInput.billingDetails;
        }
        return externalPaymentMethodInput.copy(str, str2, billingDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentElementCallbackIdentifier() {
        return this.paymentElementCallbackIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final ExternalPaymentMethodInput copy(String paymentElementCallbackIdentifier, String type, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ExternalPaymentMethodInput(paymentElementCallbackIdentifier, type, billingDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPaymentMethodInput)) {
            return false;
        }
        ExternalPaymentMethodInput externalPaymentMethodInput = (ExternalPaymentMethodInput) other;
        return Intrinsics.areEqual(this.paymentElementCallbackIdentifier, externalPaymentMethodInput.paymentElementCallbackIdentifier) && Intrinsics.areEqual(this.type, externalPaymentMethodInput.type) && Intrinsics.areEqual(this.billingDetails, externalPaymentMethodInput.billingDetails);
    }

    public int hashCode() {
        int iHashCode = ((this.paymentElementCallbackIdentifier.hashCode() * 31) + this.type.hashCode()) * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        return iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode());
    }

    public String toString() {
        return "ExternalPaymentMethodInput(paymentElementCallbackIdentifier=" + this.paymentElementCallbackIdentifier + ", type=" + this.type + ", billingDetails=" + this.billingDetails + ")";
    }

    public ExternalPaymentMethodInput(String paymentElementCallbackIdentifier, String type, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(type, "type");
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        this.type = type;
        this.billingDetails = billingDetails;
    }

    public final String getPaymentElementCallbackIdentifier() {
        return this.paymentElementCallbackIdentifier;
    }

    public final String getType() {
        return this.type;
    }

    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }
}
