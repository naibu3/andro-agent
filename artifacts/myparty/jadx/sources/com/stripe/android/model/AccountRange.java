package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountRange.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÀ\u0001¢\u0006\u0002\b\u001dJ\u0006\u0010\u001e\u001a\u00020\u0005J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, d2 = {"Lcom/stripe/android/model/AccountRange;", "Lcom/stripe/android/core/model/StripeModel;", "binRange", "Lcom/stripe/android/model/BinRange;", "panLength", "", "brandInfo", "Lcom/stripe/android/model/AccountRange$BrandInfo;", "country", "", "<init>", "(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;)V", "getBinRange", "()Lcom/stripe/android/model/BinRange;", "getPanLength", "()I", "getBrandInfo", "()Lcom/stripe/android/model/AccountRange$BrandInfo;", "getCountry", "()Ljava/lang/String;", "brand", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "component1", "component2", "component3", "component4", "copy", "copy$payments_core_release", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "BrandInfo", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountRange implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AccountRange> CREATOR = new Creator();
    private final BinRange binRange;
    private final BrandInfo brandInfo;
    private final String country;
    private final int panLength;

    /* compiled from: AccountRange.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountRange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountRange(BinRange.CREATOR.createFromParcel(parcel), parcel.readInt(), BrandInfo.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRange[] newArray(int i) {
            return new AccountRange[i];
        }
    }

    public static /* synthetic */ AccountRange copy$payments_core_release$default(AccountRange accountRange, BinRange binRange, int i, BrandInfo brandInfo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            binRange = accountRange.binRange;
        }
        if ((i2 & 2) != 0) {
            i = accountRange.panLength;
        }
        if ((i2 & 4) != 0) {
            brandInfo = accountRange.brandInfo;
        }
        if ((i2 & 8) != 0) {
            str = accountRange.country;
        }
        return accountRange.copy$payments_core_release(binRange, i, brandInfo, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BinRange getBinRange() {
        return this.binRange;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPanLength() {
        return this.panLength;
    }

    /* renamed from: component3, reason: from getter */
    public final BrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final AccountRange copy$payments_core_release(BinRange binRange, int panLength, BrandInfo brandInfo, String country) {
        Intrinsics.checkNotNullParameter(binRange, "binRange");
        Intrinsics.checkNotNullParameter(brandInfo, "brandInfo");
        return new AccountRange(binRange, panLength, brandInfo, country);
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
        if (!(other instanceof AccountRange)) {
            return false;
        }
        AccountRange accountRange = (AccountRange) other;
        return Intrinsics.areEqual(this.binRange, accountRange.binRange) && this.panLength == accountRange.panLength && this.brandInfo == accountRange.brandInfo && Intrinsics.areEqual(this.country, accountRange.country);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((((this.binRange.hashCode() * 31) + Integer.hashCode(this.panLength)) * 31) + this.brandInfo.hashCode()) * 31;
        String str = this.country;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AccountRange(binRange=" + this.binRange + ", panLength=" + this.panLength + ", brandInfo=" + this.brandInfo + ", country=" + this.country + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.binRange.writeToParcel(dest, flags);
        dest.writeInt(this.panLength);
        dest.writeString(this.brandInfo.name());
        dest.writeString(this.country);
    }

    public AccountRange(BinRange binRange, int i, BrandInfo brandInfo, String str) {
        Intrinsics.checkNotNullParameter(binRange, "binRange");
        Intrinsics.checkNotNullParameter(brandInfo, "brandInfo");
        this.binRange = binRange;
        this.panLength = i;
        this.brandInfo = brandInfo;
        this.country = str;
    }

    public /* synthetic */ AccountRange(BinRange binRange, int i, BrandInfo brandInfo, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(binRange, i, brandInfo, (i2 & 8) != 0 ? null : str);
    }

    public final BinRange getBinRange() {
        return this.binRange;
    }

    public final int getPanLength() {
        return this.panLength;
    }

    public final BrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    public final String getCountry() {
        return this.country;
    }

    public final CardBrand getBrand() {
        return this.brandInfo.getBrand();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountRange.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/AccountRange$BrandInfo;", "", "brandName", "", "brand", "Lcom/stripe/android/model/CardBrand;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V", "getBrandName", "()Ljava/lang/String;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "Visa", "Mastercard", "AmericanExpress", "JCB", "DinersClub", "Discover", "UnionPay", "CartesBancaires", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BrandInfo {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BrandInfo[] $VALUES;
        private final CardBrand brand;
        private final String brandName;
        public static final BrandInfo Visa = new BrandInfo("Visa", 0, "VISA", CardBrand.Visa);
        public static final BrandInfo Mastercard = new BrandInfo("Mastercard", 1, "MASTERCARD", CardBrand.MasterCard);
        public static final BrandInfo AmericanExpress = new BrandInfo("AmericanExpress", 2, "AMERICAN_EXPRESS", CardBrand.AmericanExpress);
        public static final BrandInfo JCB = new BrandInfo("JCB", 3, "JCB", CardBrand.JCB);
        public static final BrandInfo DinersClub = new BrandInfo("DinersClub", 4, "DINERS_CLUB", CardBrand.DinersClub);
        public static final BrandInfo Discover = new BrandInfo("Discover", 5, "DISCOVER", CardBrand.Discover);
        public static final BrandInfo UnionPay = new BrandInfo("UnionPay", 6, "UNIONPAY", CardBrand.UnionPay);
        public static final BrandInfo CartesBancaires = new BrandInfo("CartesBancaires", 7, "CARTES_BANCAIRES", CardBrand.CartesBancaires);

        private static final /* synthetic */ BrandInfo[] $values() {
            return new BrandInfo[]{Visa, Mastercard, AmericanExpress, JCB, DinersClub, Discover, UnionPay, CartesBancaires};
        }

        public static EnumEntries<BrandInfo> getEntries() {
            return $ENTRIES;
        }

        private BrandInfo(String str, int i, String str2, CardBrand cardBrand) {
            this.brandName = str2;
            this.brand = cardBrand;
        }

        public final String getBrandName() {
            return this.brandName;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        static {
            BrandInfo[] brandInfoArr$values = $values();
            $VALUES = brandInfoArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(brandInfoArr$values);
        }

        public static BrandInfo valueOf(String str) {
            return (BrandInfo) Enum.valueOf(BrandInfo.class, str);
        }

        public static BrandInfo[] values() {
            return (BrandInfo[]) $VALUES.clone();
        }
    }
}
