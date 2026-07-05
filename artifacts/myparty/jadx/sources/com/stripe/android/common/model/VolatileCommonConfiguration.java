package com.stripe.android.common.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonConfiguration.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/common/model/VolatileCommonConfiguration;", "", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V", "getDefaultBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getBillingDetailsCollectionConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getCardBrandAcceptance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class VolatileCommonConfiguration {
    private final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
    private final PaymentSheet.CardBrandAcceptance cardBrandAcceptance;
    private final PaymentSheet.BillingDetails defaultBillingDetails;

    public static /* synthetic */ VolatileCommonConfiguration copy$default(VolatileCommonConfiguration volatileCommonConfiguration, PaymentSheet.BillingDetails billingDetails, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, PaymentSheet.CardBrandAcceptance cardBrandAcceptance, int i, Object obj) {
        if ((i & 1) != 0) {
            billingDetails = volatileCommonConfiguration.defaultBillingDetails;
        }
        if ((i & 2) != 0) {
            billingDetailsCollectionConfiguration = volatileCommonConfiguration.billingDetailsCollectionConfiguration;
        }
        if ((i & 4) != 0) {
            cardBrandAcceptance = volatileCommonConfiguration.cardBrandAcceptance;
        }
        return volatileCommonConfiguration.copy(billingDetails, billingDetailsCollectionConfiguration, cardBrandAcceptance);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentSheet.BillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
        return this.billingDetailsCollectionConfiguration;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentSheet.CardBrandAcceptance getCardBrandAcceptance() {
        return this.cardBrandAcceptance;
    }

    public final VolatileCommonConfiguration copy(PaymentSheet.BillingDetails defaultBillingDetails, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, PaymentSheet.CardBrandAcceptance cardBrandAcceptance) {
        Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
        return new VolatileCommonConfiguration(defaultBillingDetails, billingDetailsCollectionConfiguration, cardBrandAcceptance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolatileCommonConfiguration)) {
            return false;
        }
        VolatileCommonConfiguration volatileCommonConfiguration = (VolatileCommonConfiguration) other;
        return Intrinsics.areEqual(this.defaultBillingDetails, volatileCommonConfiguration.defaultBillingDetails) && Intrinsics.areEqual(this.billingDetailsCollectionConfiguration, volatileCommonConfiguration.billingDetailsCollectionConfiguration) && Intrinsics.areEqual(this.cardBrandAcceptance, volatileCommonConfiguration.cardBrandAcceptance);
    }

    public int hashCode() {
        PaymentSheet.BillingDetails billingDetails = this.defaultBillingDetails;
        return ((((billingDetails == null ? 0 : billingDetails.hashCode()) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + this.cardBrandAcceptance.hashCode();
    }

    public String toString() {
        return "VolatileCommonConfiguration(defaultBillingDetails=" + this.defaultBillingDetails + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", cardBrandAcceptance=" + this.cardBrandAcceptance + ")";
    }

    public VolatileCommonConfiguration(PaymentSheet.BillingDetails billingDetails, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, PaymentSheet.CardBrandAcceptance cardBrandAcceptance) {
        Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
        this.defaultBillingDetails = billingDetails;
        this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
        this.cardBrandAcceptance = cardBrandAcceptance;
    }

    public final PaymentSheet.BillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
        return this.billingDetailsCollectionConfiguration;
    }

    public final PaymentSheet.CardBrandAcceptance getCardBrandAcceptance() {
        return this.cardBrandAcceptance;
    }
}
