package com.stripe.android.paymentsheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardUpdateParams.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/CardUpdateParams;", "", "expiryMonth", "", "expiryYear", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V", "getExpiryMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiryYear", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/CardUpdateParams;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardUpdateParams {
    public static final int $stable = PaymentMethod.BillingDetails.$stable;
    private final PaymentMethod.BillingDetails billingDetails;
    private final CardBrand cardBrand;
    private final Integer expiryMonth;
    private final Integer expiryYear;

    public CardUpdateParams() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CardUpdateParams copy$default(CardUpdateParams cardUpdateParams, Integer num, Integer num2, CardBrand cardBrand, PaymentMethod.BillingDetails billingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            num = cardUpdateParams.expiryMonth;
        }
        if ((i & 2) != 0) {
            num2 = cardUpdateParams.expiryYear;
        }
        if ((i & 4) != 0) {
            cardBrand = cardUpdateParams.cardBrand;
        }
        if ((i & 8) != 0) {
            billingDetails = cardUpdateParams.billingDetails;
        }
        return cardUpdateParams.copy(num, num2, cardBrand, billingDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getExpiryMonth() {
        return this.expiryMonth;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getExpiryYear() {
        return this.expiryYear;
    }

    /* renamed from: component3, reason: from getter */
    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final CardUpdateParams copy(Integer expiryMonth, Integer expiryYear, CardBrand cardBrand, PaymentMethod.BillingDetails billingDetails) {
        return new CardUpdateParams(expiryMonth, expiryYear, cardBrand, billingDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardUpdateParams)) {
            return false;
        }
        CardUpdateParams cardUpdateParams = (CardUpdateParams) other;
        return Intrinsics.areEqual(this.expiryMonth, cardUpdateParams.expiryMonth) && Intrinsics.areEqual(this.expiryYear, cardUpdateParams.expiryYear) && this.cardBrand == cardUpdateParams.cardBrand && Intrinsics.areEqual(this.billingDetails, cardUpdateParams.billingDetails);
    }

    public int hashCode() {
        Integer num = this.expiryMonth;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expiryYear;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        CardBrand cardBrand = this.cardBrand;
        int iHashCode3 = (iHashCode2 + (cardBrand == null ? 0 : cardBrand.hashCode())) * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        return iHashCode3 + (billingDetails != null ? billingDetails.hashCode() : 0);
    }

    public String toString() {
        return "CardUpdateParams(expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", cardBrand=" + this.cardBrand + ", billingDetails=" + this.billingDetails + ")";
    }

    public CardUpdateParams(Integer num, Integer num2, CardBrand cardBrand, PaymentMethod.BillingDetails billingDetails) {
        this.expiryMonth = num;
        this.expiryYear = num2;
        this.cardBrand = cardBrand;
        this.billingDetails = billingDetails;
    }

    public /* synthetic */ CardUpdateParams(Integer num, Integer num2, CardBrand cardBrand, PaymentMethod.BillingDetails billingDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : cardBrand, (i & 8) != 0 ? null : billingDetails);
    }

    public final Integer getExpiryMonth() {
        return this.expiryMonth;
    }

    public final Integer getExpiryYear() {
        return this.expiryYear;
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }
}
