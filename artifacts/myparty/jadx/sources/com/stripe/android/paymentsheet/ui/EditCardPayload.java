package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditCardDetailsInteractor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0001-BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003Jf\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017¨\u0006."}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", "", "last4", "", "expiryMonth", "", "expiryYear", "brand", "Lcom/stripe/android/model/CardBrand;", "displayBrand", "networks", "", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V", "getLast4", "()Ljava/lang/String;", "getExpiryMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiryYear", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getDisplayBrand", "getNetworks", "()Ljava/util/Set;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "cardBrand", "getCardBrand", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EditCardPayload {
    private final PaymentMethod.BillingDetails billingDetails;
    private final CardBrand brand;
    private final String displayBrand;
    private final Integer expiryMonth;
    private final Integer expiryYear;
    private final String last4;
    private final Set<String> networks;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ EditCardPayload copy$default(EditCardPayload editCardPayload, String str, Integer num, Integer num2, CardBrand cardBrand, String str2, Set set, PaymentMethod.BillingDetails billingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editCardPayload.last4;
        }
        if ((i & 2) != 0) {
            num = editCardPayload.expiryMonth;
        }
        if ((i & 4) != 0) {
            num2 = editCardPayload.expiryYear;
        }
        if ((i & 8) != 0) {
            cardBrand = editCardPayload.brand;
        }
        if ((i & 16) != 0) {
            str2 = editCardPayload.displayBrand;
        }
        if ((i & 32) != 0) {
            set = editCardPayload.networks;
        }
        if ((i & 64) != 0) {
            billingDetails = editCardPayload.billingDetails;
        }
        Set set2 = set;
        PaymentMethod.BillingDetails billingDetails2 = billingDetails;
        String str3 = str2;
        Integer num3 = num2;
        return editCardPayload.copy(str, num, num3, cardBrand, str3, set2, billingDetails2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getExpiryMonth() {
        return this.expiryMonth;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getExpiryYear() {
        return this.expiryYear;
    }

    /* renamed from: component4, reason: from getter */
    public final CardBrand getBrand() {
        return this.brand;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayBrand() {
        return this.displayBrand;
    }

    public final Set<String> component6() {
        return this.networks;
    }

    /* renamed from: component7, reason: from getter */
    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final EditCardPayload copy(String last4, Integer expiryMonth, Integer expiryYear, CardBrand brand, String displayBrand, Set<String> networks, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        return new EditCardPayload(last4, expiryMonth, expiryYear, brand, displayBrand, networks, billingDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditCardPayload)) {
            return false;
        }
        EditCardPayload editCardPayload = (EditCardPayload) other;
        return Intrinsics.areEqual(this.last4, editCardPayload.last4) && Intrinsics.areEqual(this.expiryMonth, editCardPayload.expiryMonth) && Intrinsics.areEqual(this.expiryYear, editCardPayload.expiryYear) && this.brand == editCardPayload.brand && Intrinsics.areEqual(this.displayBrand, editCardPayload.displayBrand) && Intrinsics.areEqual(this.networks, editCardPayload.networks) && Intrinsics.areEqual(this.billingDetails, editCardPayload.billingDetails);
    }

    public int hashCode() {
        String str = this.last4;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.expiryMonth;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expiryYear;
        int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.brand.hashCode()) * 31;
        String str2 = this.displayBrand;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Set<String> set = this.networks;
        int iHashCode5 = (iHashCode4 + (set == null ? 0 : set.hashCode())) * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        return iHashCode5 + (billingDetails != null ? billingDetails.hashCode() : 0);
    }

    public String toString() {
        return "EditCardPayload(last4=" + this.last4 + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", brand=" + this.brand + ", displayBrand=" + this.displayBrand + ", networks=" + this.networks + ", billingDetails=" + this.billingDetails + ")";
    }

    public EditCardPayload(String str, Integer num, Integer num2, CardBrand brand, String str2, Set<String> set, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.last4 = str;
        this.expiryMonth = num;
        this.expiryYear = num2;
        this.brand = brand;
        this.displayBrand = str2;
        this.networks = set;
        this.billingDetails = billingDetails;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final Integer getExpiryMonth() {
        return this.expiryMonth;
    }

    public final Integer getExpiryYear() {
        return this.expiryYear;
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    public final String getDisplayBrand() {
        return this.displayBrand;
    }

    public final Set<String> getNetworks() {
        return this.networks;
    }

    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final CardBrand getCardBrand() {
        CardBrand cardBrandFromCode = CardBrand.INSTANCE.fromCode(this.displayBrand);
        if (cardBrandFromCode == CardBrand.Unknown) {
            cardBrandFromCode = null;
        }
        return cardBrandFromCode == null ? this.brand : cardBrandFromCode;
    }

    /* compiled from: EditCardDetailsInteractor.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "details", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "billingPhoneNumber", "", "link", "Lcom/stripe/android/model/LinkPaymentDetails$Card;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EditCardPayload create(PaymentMethod.Card card, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(card, "card");
            String str = card.last4;
            Integer num = card.expiryMonth;
            Integer num2 = card.expiryYear;
            CardBrand cardBrand = card.brand;
            String str2 = card.displayBrand;
            PaymentMethod.Card.Networks networks = card.networks;
            return new EditCardPayload(str, num, num2, cardBrand, str2, networks != null ? networks.getAvailable() : null, billingDetails);
        }

        public final EditCardPayload create(ConsumerPaymentDetails.PaymentDetails details, String billingPhoneNumber) {
            CardBrand brand;
            Address address;
            List<String> networks;
            CardBrand brand2;
            Intrinsics.checkNotNullParameter(details, "details");
            ConsumerPaymentDetails.Card card = details instanceof ConsumerPaymentDetails.Card ? (ConsumerPaymentDetails.Card) details : null;
            String last4 = card != null ? card.getLast4() : null;
            Integer numValueOf = card != null ? Integer.valueOf(card.getExpiryMonth()) : null;
            Integer numValueOf2 = card != null ? Integer.valueOf(card.getExpiryYear()) : null;
            if (card == null || (brand = card.getBrand()) == null) {
                brand = CardBrand.Unknown;
            }
            CardBrand cardBrand = brand;
            String code = (card == null || (brand2 = card.getBrand()) == null) ? null : brand2.getCode();
            Set set = (card == null || (networks = card.getNetworks()) == null) ? null : CollectionsKt.toSet(networks);
            Set set2 = ((set != null ? Integer.valueOf(set.size()) : null) == null || set.size() <= 1) ? null : set;
            ConsumerPaymentDetails.BillingAddress billingAddress = details.getBillingAddress();
            if (billingAddress != null) {
                String line1 = billingAddress.getLine1();
                String line2 = billingAddress.getLine2();
                String locality = billingAddress.getLocality();
                String administrativeArea = billingAddress.getAdministrativeArea();
                String postalCode = billingAddress.getPostalCode();
                CountryCode countryCode = billingAddress.getCountryCode();
                address = new Address(locality, countryCode != null ? countryCode.getValue() : null, line1, line2, postalCode, administrativeArea);
            } else {
                address = null;
            }
            String billingEmailAddress = details.getBillingEmailAddress();
            ConsumerPaymentDetails.BillingAddress billingAddress2 = details.getBillingAddress();
            return new EditCardPayload(last4, numValueOf, numValueOf2, cardBrand, code, set2, new PaymentMethod.BillingDetails(address, billingEmailAddress, billingAddress2 != null ? billingAddress2.getName() : null, billingPhoneNumber));
        }

        public final EditCardPayload create(LinkPaymentDetails.Card link) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new EditCardPayload(link.getLast4(), Integer.valueOf(link.getExpMonth()), Integer.valueOf(link.getExpYear()), link.getBrand(), null, null, null);
        }
    }
}
