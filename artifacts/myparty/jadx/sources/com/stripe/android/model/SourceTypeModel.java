package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SourceTypeModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel;", "Lcom/stripe/android/core/model/StripeModel;", "<init>", "()V", "Card", "SepaDebit", "Lcom/stripe/android/model/SourceTypeModel$Card;", "Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SourceTypeModel implements StripeModel {
    public static final int $stable = 0;

    public /* synthetic */ SourceTypeModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SourceTypeModel() {
    }

    /* compiled from: SourceTypeModel.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001DB\u0095\u0001\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u009e\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÀ\u0001¢\u0006\u0004\b6\u00107J\u0006\u00108\u001a\u00020\u000bJ\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u000bHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006E"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card;", "Lcom/stripe/android/model/SourceTypeModel;", "addressLine1Check", "", "addressZipCheck", "brand", "Lcom/stripe/android/model/CardBrand;", "country", "cvcCheck", "dynamicLast4", "expiryMonth", "", "expiryYear", "funding", "Lcom/stripe/android/model/CardFunding;", "last4", "threeDSecureStatus", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "tokenizationMethod", "Lcom/stripe/android/model/TokenizationMethod;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;Lcom/stripe/android/model/TokenizationMethod;)V", "getAddressLine1Check", "()Ljava/lang/String;", "getAddressZipCheck", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCountry", "getCvcCheck", "getDynamicLast4", "getExpiryMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiryYear", "getFunding", "()Lcom/stripe/android/model/CardFunding;", "getLast4", "getThreeDSecureStatus", "()Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "getTokenizationMethod", "()Lcom/stripe/android/model/TokenizationMethod;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "copy$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;Lcom/stripe/android/model/TokenizationMethod;)Lcom/stripe/android/model/SourceTypeModel$Card;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "ThreeDSecureStatus", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card extends SourceTypeModel {
        private final String addressLine1Check;
        private final String addressZipCheck;
        private final CardBrand brand;
        private final String country;
        private final String cvcCheck;
        private final String dynamicLast4;
        private final Integer expiryMonth;
        private final Integer expiryYear;
        private final CardFunding funding;
        private final String last4;
        private final ThreeDSecureStatus threeDSecureStatus;
        private final TokenizationMethod tokenizationMethod;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: SourceTypeModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), CardBrand.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : CardFunding.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureStatus.valueOf(parcel.readString()), parcel.readInt() != 0 ? TokenizationMethod.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public static /* synthetic */ Card copy$payments_core_release$default(Card card, String str, String str2, CardBrand cardBrand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = card.addressLine1Check;
            }
            if ((i & 2) != 0) {
                str2 = card.addressZipCheck;
            }
            if ((i & 4) != 0) {
                cardBrand = card.brand;
            }
            if ((i & 8) != 0) {
                str3 = card.country;
            }
            if ((i & 16) != 0) {
                str4 = card.cvcCheck;
            }
            if ((i & 32) != 0) {
                str5 = card.dynamicLast4;
            }
            if ((i & 64) != 0) {
                num = card.expiryMonth;
            }
            if ((i & 128) != 0) {
                num2 = card.expiryYear;
            }
            if ((i & 256) != 0) {
                cardFunding = card.funding;
            }
            if ((i & 512) != 0) {
                str6 = card.last4;
            }
            if ((i & 1024) != 0) {
                threeDSecureStatus = card.threeDSecureStatus;
            }
            if ((i & 2048) != 0) {
                tokenizationMethod = card.tokenizationMethod;
            }
            ThreeDSecureStatus threeDSecureStatus2 = threeDSecureStatus;
            TokenizationMethod tokenizationMethod2 = tokenizationMethod;
            CardFunding cardFunding2 = cardFunding;
            String str7 = str6;
            Integer num3 = num;
            Integer num4 = num2;
            String str8 = str4;
            String str9 = str5;
            return card.copy$payments_core_release(str, str2, cardBrand, str3, str8, str9, num3, num4, cardFunding2, str7, threeDSecureStatus2, tokenizationMethod2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAddressLine1Check() {
            return this.addressLine1Check;
        }

        /* renamed from: component10, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component11, reason: from getter */
        public final ThreeDSecureStatus getThreeDSecureStatus() {
            return this.threeDSecureStatus;
        }

        /* renamed from: component12, reason: from getter */
        public final TokenizationMethod getTokenizationMethod() {
            return this.tokenizationMethod;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAddressZipCheck() {
            return this.addressZipCheck;
        }

        /* renamed from: component3, reason: from getter */
        public final CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCvcCheck() {
            return this.cvcCheck;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getExpiryMonth() {
            return this.expiryMonth;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getExpiryYear() {
            return this.expiryYear;
        }

        /* renamed from: component9, reason: from getter */
        public final CardFunding getFunding() {
            return this.funding;
        }

        public final Card copy$payments_core_release(String addressLine1Check, String addressZipCheck, CardBrand brand, String country, String cvcCheck, String dynamicLast4, Integer expiryMonth, Integer expiryYear, CardFunding funding, String last4, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            return new Card(addressLine1Check, addressZipCheck, brand, country, cvcCheck, dynamicLast4, expiryMonth, expiryYear, funding, last4, threeDSecureStatus, tokenizationMethod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.addressLine1Check, card.addressLine1Check) && Intrinsics.areEqual(this.addressZipCheck, card.addressZipCheck) && this.brand == card.brand && Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.cvcCheck, card.cvcCheck) && Intrinsics.areEqual(this.dynamicLast4, card.dynamicLast4) && Intrinsics.areEqual(this.expiryMonth, card.expiryMonth) && Intrinsics.areEqual(this.expiryYear, card.expiryYear) && this.funding == card.funding && Intrinsics.areEqual(this.last4, card.last4) && this.threeDSecureStatus == card.threeDSecureStatus && this.tokenizationMethod == card.tokenizationMethod;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.addressLine1Check;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.addressZipCheck;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.brand.hashCode()) * 31;
            String str3 = this.country;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cvcCheck;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.dynamicLast4;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.expiryMonth;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            CardFunding cardFunding = this.funding;
            int iHashCode8 = (iHashCode7 + (cardFunding == null ? 0 : cardFunding.hashCode())) * 31;
            String str6 = this.last4;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            ThreeDSecureStatus threeDSecureStatus = this.threeDSecureStatus;
            int iHashCode10 = (iHashCode9 + (threeDSecureStatus == null ? 0 : threeDSecureStatus.hashCode())) * 31;
            TokenizationMethod tokenizationMethod = this.tokenizationMethod;
            return iHashCode10 + (tokenizationMethod != null ? tokenizationMethod.hashCode() : 0);
        }

        public String toString() {
            return "Card(addressLine1Check=" + this.addressLine1Check + ", addressZipCheck=" + this.addressZipCheck + ", brand=" + this.brand + ", country=" + this.country + ", cvcCheck=" + this.cvcCheck + ", dynamicLast4=" + this.dynamicLast4 + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", funding=" + this.funding + ", last4=" + this.last4 + ", threeDSecureStatus=" + this.threeDSecureStatus + ", tokenizationMethod=" + this.tokenizationMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.addressLine1Check);
            dest.writeString(this.addressZipCheck);
            dest.writeString(this.brand.name());
            dest.writeString(this.country);
            dest.writeString(this.cvcCheck);
            dest.writeString(this.dynamicLast4);
            Integer num = this.expiryMonth;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            CardFunding cardFunding = this.funding;
            if (cardFunding == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cardFunding.name());
            }
            dest.writeString(this.last4);
            ThreeDSecureStatus threeDSecureStatus = this.threeDSecureStatus;
            if (threeDSecureStatus == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(threeDSecureStatus.name());
            }
            TokenizationMethod tokenizationMethod = this.tokenizationMethod;
            if (tokenizationMethod == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(tokenizationMethod.name());
            }
        }

        public /* synthetic */ Card(String str, String str2, CardBrand cardBrand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, cardBrand, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : cardFunding, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : threeDSecureStatus, (i & 2048) != 0 ? null : tokenizationMethod);
        }

        public final String getAddressLine1Check() {
            return this.addressLine1Check;
        }

        public final String getAddressZipCheck() {
            return this.addressZipCheck;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getCvcCheck() {
            return this.cvcCheck;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public final Integer getExpiryMonth() {
            return this.expiryMonth;
        }

        public final Integer getExpiryYear() {
            return this.expiryYear;
        }

        public final CardFunding getFunding() {
            return this.funding;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final ThreeDSecureStatus getThreeDSecureStatus() {
            return this.threeDSecureStatus;
        }

        public final TokenizationMethod getTokenizationMethod() {
            return this.tokenizationMethod;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SourceTypeModel.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Required", "Optional", "NotSupported", "Recommended", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ThreeDSecureStatus {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ThreeDSecureStatus[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String code;
            public static final ThreeDSecureStatus Required = new ThreeDSecureStatus("Required", 0, "required");
            public static final ThreeDSecureStatus Optional = new ThreeDSecureStatus("Optional", 1, "optional");
            public static final ThreeDSecureStatus NotSupported = new ThreeDSecureStatus("NotSupported", 2, "not_supported");
            public static final ThreeDSecureStatus Recommended = new ThreeDSecureStatus("Recommended", 3, "recommended");
            public static final ThreeDSecureStatus Unknown = new ThreeDSecureStatus(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 4, "unknown");

            private static final /* synthetic */ ThreeDSecureStatus[] $values() {
                return new ThreeDSecureStatus[]{Required, Optional, NotSupported, Recommended, Unknown};
            }

            public static EnumEntries<ThreeDSecureStatus> getEntries() {
                return $ENTRIES;
            }

            private ThreeDSecureStatus(String str, int i, String str2) {
                this.code = str2;
            }

            static {
                ThreeDSecureStatus[] threeDSecureStatusArr$values = $values();
                $VALUES = threeDSecureStatusArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(threeDSecureStatusArr$values);
                INSTANCE = new Companion(null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }

            /* compiled from: SourceTypeModel.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final ThreeDSecureStatus fromCode(String code) {
                    ThreeDSecureStatus next;
                    Iterator<ThreeDSecureStatus> it = ThreeDSecureStatus.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(next.code, code)) {
                            break;
                        }
                    }
                    return next;
                }
            }

            public static ThreeDSecureStatus valueOf(String str) {
                return (ThreeDSecureStatus) Enum.valueOf(ThreeDSecureStatus.class, str);
            }

            public static ThreeDSecureStatus[] values() {
                return (ThreeDSecureStatus[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String str, String str2, CardBrand brand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(brand, "brand");
            this.addressLine1Check = str;
            this.addressZipCheck = str2;
            this.brand = brand;
            this.country = str3;
            this.cvcCheck = str4;
            this.dynamicLast4 = str5;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.funding = cardFunding;
            this.last4 = str6;
            this.threeDSecureStatus = threeDSecureStatus;
            this.tokenizationMethod = tokenizationMethod;
        }
    }

    /* compiled from: SourceTypeModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006*"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "Lcom/stripe/android/model/SourceTypeModel;", "bankCode", "", "branchCode", "country", "fingerPrint", "last4", "mandateReference", "mandateUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankCode", "()Ljava/lang/String;", "getBranchCode", "getCountry", "getFingerPrint", "getLast4", "getMandateReference", "getMandateUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SepaDebit extends SourceTypeModel {
        private final String bankCode;
        private final String branchCode;
        private final String country;
        private final String fingerPrint;
        private final String last4;
        private final String mandateReference;
        private final String mandateUrl;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: SourceTypeModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        public static /* synthetic */ SepaDebit copy$payments_core_release$default(SepaDebit sepaDebit, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sepaDebit.bankCode;
            }
            if ((i & 2) != 0) {
                str2 = sepaDebit.branchCode;
            }
            if ((i & 4) != 0) {
                str3 = sepaDebit.country;
            }
            if ((i & 8) != 0) {
                str4 = sepaDebit.fingerPrint;
            }
            if ((i & 16) != 0) {
                str5 = sepaDebit.last4;
            }
            if ((i & 32) != 0) {
                str6 = sepaDebit.mandateReference;
            }
            if ((i & 64) != 0) {
                str7 = sepaDebit.mandateUrl;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return sepaDebit.copy$payments_core_release(str, str2, str11, str4, str10, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBankCode() {
            return this.bankCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBranchCode() {
            return this.branchCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFingerPrint() {
            return this.fingerPrint;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMandateReference() {
            return this.mandateReference;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMandateUrl() {
            return this.mandateUrl;
        }

        public final SepaDebit copy$payments_core_release(String bankCode, String branchCode, String country, String fingerPrint, String last4, String mandateReference, String mandateUrl) {
            return new SepaDebit(bankCode, branchCode, country, fingerPrint, last4, mandateReference, mandateUrl);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SepaDebit)) {
                return false;
            }
            SepaDebit sepaDebit = (SepaDebit) other;
            return Intrinsics.areEqual(this.bankCode, sepaDebit.bankCode) && Intrinsics.areEqual(this.branchCode, sepaDebit.branchCode) && Intrinsics.areEqual(this.country, sepaDebit.country) && Intrinsics.areEqual(this.fingerPrint, sepaDebit.fingerPrint) && Intrinsics.areEqual(this.last4, sepaDebit.last4) && Intrinsics.areEqual(this.mandateReference, sepaDebit.mandateReference) && Intrinsics.areEqual(this.mandateUrl, sepaDebit.mandateUrl);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bankCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.branchCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fingerPrint;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.last4;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.mandateReference;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.mandateUrl;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.bankCode + ", branchCode=" + this.branchCode + ", country=" + this.country + ", fingerPrint=" + this.fingerPrint + ", last4=" + this.last4 + ", mandateReference=" + this.mandateReference + ", mandateUrl=" + this.mandateUrl + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.bankCode);
            dest.writeString(this.branchCode);
            dest.writeString(this.country);
            dest.writeString(this.fingerPrint);
            dest.writeString(this.last4);
            dest.writeString(this.mandateReference);
            dest.writeString(this.mandateUrl);
        }

        public final String getBankCode() {
            return this.bankCode;
        }

        public final String getBranchCode() {
            return this.branchCode;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getFingerPrint() {
            return this.fingerPrint;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final String getMandateReference() {
            return this.mandateReference;
        }

        public final String getMandateUrl() {
            return this.mandateUrl;
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(null);
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerPrint = str4;
            this.last4 = str5;
            this.mandateReference = str6;
            this.mandateUrl = str7;
        }
    }
}
