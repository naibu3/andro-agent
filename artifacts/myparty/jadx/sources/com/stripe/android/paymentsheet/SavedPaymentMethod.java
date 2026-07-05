package com.stripe.android.paymentsheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.utils.DateUtils;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayableSavedPaymentMethod.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/SavedPaymentMethod;", "", "Card", "USBankAccount", "SepaDebit", "Link", "Unexpected", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod$SepaDebit;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod$USBankAccount;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Unexpected;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SavedPaymentMethod {

    /* compiled from: DisplayableSavedPaymentMethod.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod;", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "<init>", "(Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V", "getCard", "()Lcom/stripe/android/model/PaymentMethod$Card;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "isExpired", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card implements SavedPaymentMethod {
        public static final int $stable = PaymentMethod.BillingDetails.$stable | PaymentMethod.Card.$stable;
        private final PaymentMethod.BillingDetails billingDetails;
        private final PaymentMethod.Card card;

        public static /* synthetic */ Card copy$default(Card card, PaymentMethod.Card card2, PaymentMethod.BillingDetails billingDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                card2 = card.card;
            }
            if ((i & 2) != 0) {
                billingDetails = card.billingDetails;
            }
            return card.copy(card2, billingDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod.Card getCard() {
            return this.card;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public final Card copy(PaymentMethod.Card card, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(card, "card");
            return new Card(card, billingDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.card, card.card) && Intrinsics.areEqual(this.billingDetails, card.billingDetails);
        }

        public int hashCode() {
            int iHashCode = this.card.hashCode() * 31;
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            return iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode());
        }

        public String toString() {
            return "Card(card=" + this.card + ", billingDetails=" + this.billingDetails + ")";
        }

        public Card(PaymentMethod.Card card, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(card, "card");
            this.card = card;
            this.billingDetails = billingDetails;
        }

        public final PaymentMethod.Card getCard() {
            return this.card;
        }

        public final PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public final boolean isExpired() {
            Integer num = this.card.expiryMonth;
            Integer num2 = this.card.expiryYear;
            return (num == null || num2 == null || DateUtils.isExpiryDataValid(num.intValue(), num2.intValue())) ? false : true;
        }
    }

    /* compiled from: DisplayableSavedPaymentMethod.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/SavedPaymentMethod$USBankAccount;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod;", "usBankAccount", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "<init>", "(Lcom/stripe/android/model/PaymentMethod$USBankAccount;)V", "getUsBankAccount", "()Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class USBankAccount implements SavedPaymentMethod {
        public static final int $stable = PaymentMethod.USBankAccount.$stable;
        private final PaymentMethod.USBankAccount usBankAccount;

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, PaymentMethod.USBankAccount uSBankAccount2, int i, Object obj) {
            if ((i & 1) != 0) {
                uSBankAccount2 = uSBankAccount.usBankAccount;
            }
            return uSBankAccount.copy(uSBankAccount2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod.USBankAccount getUsBankAccount() {
            return this.usBankAccount;
        }

        public final USBankAccount copy(PaymentMethod.USBankAccount usBankAccount) {
            Intrinsics.checkNotNullParameter(usBankAccount, "usBankAccount");
            return new USBankAccount(usBankAccount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof USBankAccount) && Intrinsics.areEqual(this.usBankAccount, ((USBankAccount) other).usBankAccount);
        }

        public int hashCode() {
            return this.usBankAccount.hashCode();
        }

        public String toString() {
            return "USBankAccount(usBankAccount=" + this.usBankAccount + ")";
        }

        public USBankAccount(PaymentMethod.USBankAccount usBankAccount) {
            Intrinsics.checkNotNullParameter(usBankAccount, "usBankAccount");
            this.usBankAccount = usBankAccount;
        }

        public final PaymentMethod.USBankAccount getUsBankAccount() {
            return this.usBankAccount;
        }
    }

    /* compiled from: DisplayableSavedPaymentMethod.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/SavedPaymentMethod$SepaDebit;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "<init>", "(Lcom/stripe/android/model/PaymentMethod$SepaDebit;)V", "getSepaDebit", "()Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SepaDebit implements SavedPaymentMethod {
        public static final int $stable = PaymentMethod.SepaDebit.$stable;
        private final PaymentMethod.SepaDebit sepaDebit;

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, PaymentMethod.SepaDebit sepaDebit2, int i, Object obj) {
            if ((i & 1) != 0) {
                sepaDebit2 = sepaDebit.sepaDebit;
            }
            return sepaDebit.copy(sepaDebit2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod.SepaDebit getSepaDebit() {
            return this.sepaDebit;
        }

        public final SepaDebit copy(PaymentMethod.SepaDebit sepaDebit) {
            Intrinsics.checkNotNullParameter(sepaDebit, "sepaDebit");
            return new SepaDebit(sepaDebit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SepaDebit) && Intrinsics.areEqual(this.sepaDebit, ((SepaDebit) other).sepaDebit);
        }

        public int hashCode() {
            return this.sepaDebit.hashCode();
        }

        public String toString() {
            return "SepaDebit(sepaDebit=" + this.sepaDebit + ")";
        }

        public SepaDebit(PaymentMethod.SepaDebit sepaDebit) {
            Intrinsics.checkNotNullParameter(sepaDebit, "sepaDebit");
            this.sepaDebit = sepaDebit;
        }

        public final PaymentMethod.SepaDebit getSepaDebit() {
            return this.sepaDebit;
        }
    }

    /* compiled from: DisplayableSavedPaymentMethod.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod;", "paymentDetails", "Lcom/stripe/android/model/LinkPaymentDetails;", "<init>", "(Lcom/stripe/android/model/LinkPaymentDetails;)V", "getPaymentDetails", "()Lcom/stripe/android/model/LinkPaymentDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link implements SavedPaymentMethod {
        public static final int $stable = 8;
        private final LinkPaymentDetails paymentDetails;

        public static /* synthetic */ Link copy$default(Link link, LinkPaymentDetails linkPaymentDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                linkPaymentDetails = link.paymentDetails;
            }
            return link.copy(linkPaymentDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkPaymentDetails getPaymentDetails() {
            return this.paymentDetails;
        }

        public final Link copy(LinkPaymentDetails paymentDetails) {
            Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
            return new Link(paymentDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Link) && Intrinsics.areEqual(this.paymentDetails, ((Link) other).paymentDetails);
        }

        public int hashCode() {
            return this.paymentDetails.hashCode();
        }

        public String toString() {
            return "Link(paymentDetails=" + this.paymentDetails + ")";
        }

        public Link(LinkPaymentDetails paymentDetails) {
            Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
            this.paymentDetails = paymentDetails;
        }

        public final LinkPaymentDetails getPaymentDetails() {
            return this.paymentDetails;
        }
    }

    /* compiled from: DisplayableSavedPaymentMethod.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Unexpected;", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unexpected implements SavedPaymentMethod {
        public static final int $stable = 0;
        public static final Unexpected INSTANCE = new Unexpected();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unexpected)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1234872733;
        }

        public String toString() {
            return "Unexpected";
        }

        private Unexpected() {
        }
    }
}
