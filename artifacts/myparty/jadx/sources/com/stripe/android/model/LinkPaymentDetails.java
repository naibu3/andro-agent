package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkPaymentDetails.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/LinkPaymentDetails;", "Landroid/os/Parcelable;", "last4", "", "getLast4", "()Ljava/lang/String;", "Card", "BankAccount", "Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;", "Lcom/stripe/android/model/LinkPaymentDetails$Card;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkPaymentDetails extends Parcelable {
    String getLast4();

    /* compiled from: LinkPaymentDetails.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0005J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006)"}, d2 = {"Lcom/stripe/android/model/LinkPaymentDetails$Card;", "Lcom/stripe/android/model/LinkPaymentDetails;", "nickname", "", "expMonth", "", "expYear", "last4", "brand", "Lcom/stripe/android/model/CardBrand;", "funding", "<init>", "(Ljava/lang/String;IILjava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)V", "getNickname", "()Ljava/lang/String;", "getExpMonth", "()I", "getExpYear", "getLast4", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getFunding", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card implements LinkPaymentDetails {
        private final CardBrand brand;
        private final int expMonth;
        private final int expYear;
        private final String funding;
        private final String last4;
        private final String nickname;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkPaymentDetails.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), CardBrand.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public static /* synthetic */ Card copy$default(Card card, String str, int i, int i2, String str2, CardBrand cardBrand, String str3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = card.nickname;
            }
            if ((i3 & 2) != 0) {
                i = card.expMonth;
            }
            if ((i3 & 4) != 0) {
                i2 = card.expYear;
            }
            if ((i3 & 8) != 0) {
                str2 = card.last4;
            }
            if ((i3 & 16) != 0) {
                cardBrand = card.brand;
            }
            if ((i3 & 32) != 0) {
                str3 = card.funding;
            }
            CardBrand cardBrand2 = cardBrand;
            String str4 = str3;
            return card.copy(str, i, i2, str2, cardBrand2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        /* renamed from: component2, reason: from getter */
        public final int getExpMonth() {
            return this.expMonth;
        }

        /* renamed from: component3, reason: from getter */
        public final int getExpYear() {
            return this.expYear;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component5, reason: from getter */
        public final CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component6, reason: from getter */
        public final String getFunding() {
            return this.funding;
        }

        public final Card copy(String nickname, int expMonth, int expYear, String last4, CardBrand brand, String funding) {
            Intrinsics.checkNotNullParameter(last4, "last4");
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(funding, "funding");
            return new Card(nickname, expMonth, expYear, last4, brand, funding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.nickname, card.nickname) && this.expMonth == card.expMonth && this.expYear == card.expYear && Intrinsics.areEqual(this.last4, card.last4) && this.brand == card.brand && Intrinsics.areEqual(this.funding, card.funding);
        }

        public int hashCode() {
            String str = this.nickname;
            return ((((((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.expMonth)) * 31) + Integer.hashCode(this.expYear)) * 31) + this.last4.hashCode()) * 31) + this.brand.hashCode()) * 31) + this.funding.hashCode();
        }

        public String toString() {
            return "Card(nickname=" + this.nickname + ", expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", last4=" + this.last4 + ", brand=" + this.brand + ", funding=" + this.funding + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.nickname);
            dest.writeInt(this.expMonth);
            dest.writeInt(this.expYear);
            dest.writeString(this.last4);
            dest.writeString(this.brand.name());
            dest.writeString(this.funding);
        }

        public Card(String str, int i, int i2, String last4, CardBrand brand, String funding) {
            Intrinsics.checkNotNullParameter(last4, "last4");
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(funding, "funding");
            this.nickname = str;
            this.expMonth = i;
            this.expYear = i2;
            this.last4 = last4;
            this.brand = brand;
            this.funding = funding;
        }

        public final String getNickname() {
            return this.nickname;
        }

        public final int getExpMonth() {
            return this.expMonth;
        }

        public final int getExpYear() {
            return this.expYear;
        }

        @Override // com.stripe.android.model.LinkPaymentDetails
        public String getLast4() {
            return this.last4;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final String getFunding() {
            return this.funding;
        }
    }

    /* compiled from: LinkPaymentDetails.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;", "Lcom/stripe/android/model/LinkPaymentDetails;", "bankName", "", "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBankName", "()Ljava/lang/String;", "getLast4", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BankAccount implements LinkPaymentDetails {
        private final String bankName;
        private final String last4;
        public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkPaymentDetails.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankAccount(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BankAccount[] newArray(int i) {
                return new BankAccount[i];
            }
        }

        public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.bankName;
            }
            if ((i & 2) != 0) {
                str2 = bankAccount.last4;
            }
            return bankAccount.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        public final BankAccount copy(String bankName, String last4) {
            Intrinsics.checkNotNullParameter(last4, "last4");
            return new BankAccount(bankName, last4);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankAccount)) {
                return false;
            }
            BankAccount bankAccount = (BankAccount) other;
            return Intrinsics.areEqual(this.bankName, bankAccount.bankName) && Intrinsics.areEqual(this.last4, bankAccount.last4);
        }

        public int hashCode() {
            String str = this.bankName;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.last4.hashCode();
        }

        public String toString() {
            return "BankAccount(bankName=" + this.bankName + ", last4=" + this.last4 + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.bankName);
            dest.writeString(this.last4);
        }

        public BankAccount(String str, String last4) {
            Intrinsics.checkNotNullParameter(last4, "last4");
            this.bankName = str;
            this.last4 = last4;
        }

        public final String getBankName() {
            return this.bankName;
        }

        @Override // com.stripe.android.model.LinkPaymentDetails
        public String getLast4() {
            return this.last4;
        }
    }
}
