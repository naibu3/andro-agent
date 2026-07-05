package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.CardUtils;
import com.stripe.android.model.Token;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CardParams.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0001NB\u008d\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015Bi\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0016J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003J\u009a\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÀ\u0001¢\u0006\u0002\bBJ\u0006\u0010C\u001a\u00020\tJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u000104HÖ\u0003J\t\u0010G\u001a\u00020\tHÖ\u0001J\t\u0010H\u001a\u00020\u0006HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u00101\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b2\u0010\u001cR \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002040\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010.¨\u0006O"}, d2 = {"Lcom/stripe/android/model/CardParams;", "Lcom/stripe/android/model/TokenParams;", "brand", "Lcom/stripe/android/model/CardBrand;", "loggingTokens", "", "", CardParams.PARAM_NUMBER, "expMonth", "", "expYear", CardParams.PARAM_CVC, "name", "address", "Lcom/stripe/android/model/Address;", "currency", "networks", "Lcom/stripe/android/model/Networks;", CardParams.PARAM_METADATA, "", "<init>", "(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Lcom/stripe/android/model/Networks;Ljava/util/Map;)V", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;)V", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getNumber$annotations", "()V", "getNumber", "()Ljava/lang/String;", "getExpMonth", "()I", "getExpYear", "getCvc$annotations", "getCvc", "getName", "setName", "(Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getCurrency", "setCurrency", "getNetworks", "()Lcom/stripe/android/model/Networks;", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "last4", "getLast4", "typeDataParams", "", "getTypeDataParams", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "copy$payments_core_release", "describeContents", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CardParams extends TokenParams {
    private static final String PARAM_ADDRESS_CITY = "address_city";
    private static final String PARAM_ADDRESS_COUNTRY = "address_country";
    private static final String PARAM_ADDRESS_LINE1 = "address_line1";
    private static final String PARAM_ADDRESS_LINE2 = "address_line2";
    private static final String PARAM_ADDRESS_STATE = "address_state";
    private static final String PARAM_ADDRESS_ZIP = "address_zip";
    private static final String PARAM_CURRENCY = "currency";
    private static final String PARAM_CVC = "cvc";
    private static final String PARAM_EXP_MONTH = "exp_month";
    private static final String PARAM_EXP_YEAR = "exp_year";
    private static final String PARAM_METADATA = "metadata";
    private static final String PARAM_NAME = "name";
    private static final String PARAM_NUMBER = "number";
    private Address address;
    private final CardBrand brand;
    private String currency;
    private final String cvc;
    private final int expMonth;
    private final int expYear;
    private final Set<String> loggingTokens;
    private Map<String, String> metadata;
    private String name;
    private final Networks networks;
    private final String number;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CardParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: CardParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CardBrand cardBrandValueOf = CardBrand.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readString());
            }
            LinkedHashSet linkedHashSet2 = linkedHashSet;
            String string = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Address addressCreateFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            Networks networksCreateFromParcel = parcel.readInt() == 0 ? null : Networks.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CardParams(cardBrandValueOf, linkedHashSet2, string, i3, i4, string2, string3, addressCreateFromParcel, string4, networksCreateFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardParams[] newArray(int i) {
            return new CardParams[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i, int i2) {
        this(number, i, i2, null, null, null, null, null, 248, null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i, int i2, String str) {
        this(number, i, i2, str, null, null, null, null, 240, null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i, int i2, String str, String str2) {
        this(number, i, i2, str, str2, null, null, null, 224, null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i, int i2, String str, String str2, Address address) {
        this(number, i, i2, str, str2, address, null, null, 192, null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i, int i2, String str, String str2, Address address, String str3) {
        this(number, i, i2, str, str2, address, str3, null, 128, null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    private final Set<String> component2() {
        return this.loggingTokens;
    }

    public static /* synthetic */ CardParams copy$payments_core_release$default(CardParams cardParams, CardBrand cardBrand, Set set, String str, int i, int i2, String str2, String str3, Address address, String str4, Networks networks, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            cardBrand = cardParams.brand;
        }
        if ((i3 & 2) != 0) {
            set = cardParams.loggingTokens;
        }
        if ((i3 & 4) != 0) {
            str = cardParams.number;
        }
        if ((i3 & 8) != 0) {
            i = cardParams.expMonth;
        }
        if ((i3 & 16) != 0) {
            i2 = cardParams.expYear;
        }
        if ((i3 & 32) != 0) {
            str2 = cardParams.cvc;
        }
        if ((i3 & 64) != 0) {
            str3 = cardParams.name;
        }
        if ((i3 & 128) != 0) {
            address = cardParams.address;
        }
        if ((i3 & 256) != 0) {
            str4 = cardParams.currency;
        }
        if ((i3 & 512) != 0) {
            networks = cardParams.networks;
        }
        if ((i3 & 1024) != 0) {
            map = cardParams.metadata;
        }
        Networks networks2 = networks;
        Map map2 = map;
        Address address2 = address;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        int i4 = i2;
        String str8 = str;
        return cardParams.copy$payments_core_release(cardBrand, set, str8, i, i4, str6, str7, address2, str5, networks2, map2);
    }

    public static /* synthetic */ void getCvc$annotations() {
    }

    public static /* synthetic */ void getNumber$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final CardBrand getBrand() {
        return this.brand;
    }

    /* renamed from: component10, reason: from getter */
    public final Networks getNetworks() {
        return this.networks;
    }

    public final Map<String, String> component11() {
        return this.metadata;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component4, reason: from getter */
    public final int getExpMonth() {
        return this.expMonth;
    }

    /* renamed from: component5, reason: from getter */
    public final int getExpYear() {
        return this.expYear;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCvc() {
        return this.cvc;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final CardParams copy$payments_core_release(CardBrand brand, Set<String> loggingTokens, String number, int expMonth, int expYear, String cvc, String name, Address address, String currency, Networks networks, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(loggingTokens, "loggingTokens");
        Intrinsics.checkNotNullParameter(number, "number");
        return new CardParams(brand, loggingTokens, number, expMonth, expYear, cvc, name, address, currency, networks, metadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardParams)) {
            return false;
        }
        CardParams cardParams = (CardParams) other;
        return this.brand == cardParams.brand && Intrinsics.areEqual(this.loggingTokens, cardParams.loggingTokens) && Intrinsics.areEqual(this.number, cardParams.number) && this.expMonth == cardParams.expMonth && this.expYear == cardParams.expYear && Intrinsics.areEqual(this.cvc, cardParams.cvc) && Intrinsics.areEqual(this.name, cardParams.name) && Intrinsics.areEqual(this.address, cardParams.address) && Intrinsics.areEqual(this.currency, cardParams.currency) && Intrinsics.areEqual(this.networks, cardParams.networks) && Intrinsics.areEqual(this.metadata, cardParams.metadata);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.brand.hashCode() * 31) + this.loggingTokens.hashCode()) * 31) + this.number.hashCode()) * 31) + Integer.hashCode(this.expMonth)) * 31) + Integer.hashCode(this.expYear)) * 31;
        String str = this.cvc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.address;
        int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Networks networks = this.networks;
        int iHashCode6 = (iHashCode5 + (networks == null ? 0 : networks.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "CardParams(brand=" + this.brand + ", loggingTokens=" + this.loggingTokens + ", number=" + this.number + ", expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", cvc=" + this.cvc + ", name=" + this.name + ", address=" + this.address + ", currency=" + this.currency + ", networks=" + this.networks + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.brand.name());
        Set<String> set = this.loggingTokens;
        dest.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next());
        }
        dest.writeString(this.number);
        dest.writeInt(this.expMonth);
        dest.writeInt(this.expYear);
        dest.writeString(this.cvc);
        dest.writeString(this.name);
        Address address = this.address;
        if (address == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            address.writeToParcel(dest, flags);
        }
        dest.writeString(this.currency);
        Networks networks = this.networks;
        if (networks == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            networks.writeToParcel(dest, flags);
        }
        Map<String, String> map = this.metadata;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CardParams(com.stripe.android.model.CardBrand r15, java.util.Set r16, java.lang.String r17, int r18, int r19, java.lang.String r20, java.lang.String r21, com.stripe.android.model.Address r22, java.lang.String r23, com.stripe.android.model.Networks r24, java.util.Map r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 2
            if (r1 == 0) goto Lc
            java.util.Set r1 = kotlin.collections.SetsKt.emptySet()
            r4 = r1
            goto Le
        Lc:
            r4 = r16
        Le:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L15
            r8 = r2
            goto L17
        L15:
            r8 = r20
        L17:
            r1 = r0 & 64
            if (r1 == 0) goto L1d
            r9 = r2
            goto L1f
        L1d:
            r9 = r21
        L1f:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L25
            r10 = r2
            goto L27
        L25:
            r10 = r22
        L27:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2d
            r11 = r2
            goto L2f
        L2d:
            r11 = r23
        L2f:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L35
            r12 = r2
            goto L37
        L35:
            r12 = r24
        L37:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L45
            r13 = r2
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r2 = r14
            goto L4f
        L45:
            r13 = r25
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
        L4f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardParams.<init>(com.stripe.android.model.CardBrand, java.util.Set, java.lang.String, int, int, java.lang.String, java.lang.String, com.stripe.android.model.Address, java.lang.String, com.stripe.android.model.Networks, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getNumber() {
        return this.number;
    }

    public final int getExpMonth() {
        return this.expMonth;
    }

    public final int getExpYear() {
        return this.expYear;
    }

    public final String getCvc() {
        return this.cvc;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final void setAddress(Address address) {
        this.address = address;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final Networks getNetworks() {
        return this.networks;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardParams(CardBrand brand, Set<String> loggingTokens, String number, int i, int i2, String str, String str2, Address address, String str3, Networks networks, Map<String, String> map) {
        super(Token.Type.Card, loggingTokens);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(loggingTokens, "loggingTokens");
        Intrinsics.checkNotNullParameter(number, "number");
        this.brand = brand;
        this.loggingTokens = loggingTokens;
        this.number = number;
        this.expMonth = i;
        this.expYear = i2;
        this.cvc = str;
        this.name = str2;
        this.address = address;
        this.currency = str3;
        this.networks = networks;
        this.metadata = map;
    }

    public final String getLast4() {
        return StringsKt.takeLast(this.number, 4);
    }

    public /* synthetic */ CardParams(String str, int i, int i2, String str2, String str3, Address address, String str4, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : address, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i, int i2, String str, String str2, Address address, String str3, Map<String, String> map) {
        this(CardUtils.getPossibleCardBrand(number), SetsKt.emptySet(), number, i, i2, str, str2, address, str3, null, map, 512, null);
        Intrinsics.checkNotNullParameter(number, "number");
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Pair[] pairArr = new Pair[13];
        pairArr[0] = TuplesKt.to(PARAM_NUMBER, this.number);
        pairArr[1] = TuplesKt.to(PARAM_EXP_MONTH, Integer.valueOf(this.expMonth));
        pairArr[2] = TuplesKt.to(PARAM_EXP_YEAR, Integer.valueOf(this.expYear));
        pairArr[3] = TuplesKt.to(PARAM_CVC, this.cvc);
        pairArr[4] = TuplesKt.to("name", this.name);
        pairArr[5] = TuplesKt.to("currency", this.currency);
        Address address = this.address;
        pairArr[6] = TuplesKt.to(PARAM_ADDRESS_LINE1, address != null ? address.getLine1() : null);
        Address address2 = this.address;
        pairArr[7] = TuplesKt.to(PARAM_ADDRESS_LINE2, address2 != null ? address2.getLine2() : null);
        Address address3 = this.address;
        pairArr[8] = TuplesKt.to(PARAM_ADDRESS_CITY, address3 != null ? address3.getCity() : null);
        Address address4 = this.address;
        pairArr[9] = TuplesKt.to(PARAM_ADDRESS_STATE, address4 != null ? address4.getState() : null);
        Address address5 = this.address;
        pairArr[10] = TuplesKt.to(PARAM_ADDRESS_ZIP, address5 != null ? address5.getPostalCode() : null);
        Address address6 = this.address;
        pairArr[11] = TuplesKt.to(PARAM_ADDRESS_COUNTRY, address6 != null ? address6.getCountry() : null);
        pairArr[12] = TuplesKt.to(PARAM_METADATA, this.metadata);
        List<Pair> listListOf = CollectionsKt.listOf((Object[]) pairArr);
        Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
        for (Pair pair : listListOf) {
            String str = (String) pair.component1();
            Object objComponent2 = pair.component2();
            Map mapMapOf = objComponent2 != null ? MapsKt.mapOf(TuplesKt.to(str, objComponent2)) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
        }
        return mapEmptyMap;
    }

    /* compiled from: CardParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/CardParams$Companion;", "", "<init>", "()V", "PARAM_NUMBER", "", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_CVC", "PARAM_NAME", "PARAM_ADDRESS_LINE1", "PARAM_ADDRESS_LINE2", "PARAM_ADDRESS_CITY", "PARAM_ADDRESS_STATE", "PARAM_ADDRESS_ZIP", "PARAM_ADDRESS_COUNTRY", "PARAM_CURRENCY", "PARAM_METADATA", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
