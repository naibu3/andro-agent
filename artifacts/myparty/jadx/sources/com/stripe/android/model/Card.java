package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.BankAccountJsonParser;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]Bû\u0001\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010F\u001a\u00020\u0012HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0088\u0002\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010PJ\u0006\u0010Q\u001a\u00020\u0004J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020\u0004HÖ\u0001J\t\u0010W\u001a\u00020\u0007HÖ\u0001J\u0016\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0004R\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00048G¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006^"}, d2 = {"Lcom/stripe/android/model/Card;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "expMonth", "", "expYear", "name", "", "addressLine1", "addressLine1Check", "addressLine2", "addressCity", "addressState", "addressZip", "addressZipCheck", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY, "last4", "brand", "Lcom/stripe/android/model/CardBrand;", "funding", "Lcom/stripe/android/model/CardFunding;", BankAccountJsonParser.FIELD_FINGERPRINT, "country", "currency", "customerId", "cvcCheck", "id", "tokenizationMethod", "Lcom/stripe/android/model/TokenizationMethod;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/TokenizationMethod;)V", "getExpMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpYear", "getName", "()Ljava/lang/String;", "getAddressLine1", "getAddressLine1Check", "getAddressLine2", "getAddressCity", "getAddressState", "getAddressZip", "getAddressZipCheck", "getAddressCountry", "getLast4", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getFunding", "()Lcom/stripe/android/model/CardFunding;", "getFingerprint", "getCountry", "getCurrency", "getCustomerId", "getCvcCheck", "getId", "getTokenizationMethod", "()Lcom/stripe/android/model/TokenizationMethod;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/TokenizationMethod;)Lcom/stripe/android/model/Card;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Card implements StripeModel, StripePaymentSource {
    private final String addressCity;
    private final String addressCountry;
    private final String addressLine1;
    private final String addressLine1Check;
    private final String addressLine2;
    private final String addressState;
    private final String addressZip;
    private final String addressZipCheck;
    private final CardBrand brand;
    private final String country;
    private final String currency;
    private final String customerId;
    private final String cvcCheck;
    private final Integer expMonth;
    private final Integer expYear;
    private final String fingerprint;
    private final CardFunding funding;
    private final String id;
    private final String last4;
    private final String name;
    private final TokenizationMethod tokenizationMethod;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Card> CREATOR = new Creator();

    /* compiled from: Card.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Card> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Card createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Card(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CardBrand.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CardFunding.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? TokenizationMethod.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Card[] newArray(int i) {
            return new Card[i];
        }
    }

    public static /* synthetic */ Card copy$default(Card card, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand cardBrand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod, int i, Object obj) {
        TokenizationMethod tokenizationMethod2;
        String str17;
        Integer num3 = (i & 1) != 0 ? card.expMonth : num;
        Integer num4 = (i & 2) != 0 ? card.expYear : num2;
        String str18 = (i & 4) != 0 ? card.name : str;
        String str19 = (i & 8) != 0 ? card.addressLine1 : str2;
        String str20 = (i & 16) != 0 ? card.addressLine1Check : str3;
        String str21 = (i & 32) != 0 ? card.addressLine2 : str4;
        String str22 = (i & 64) != 0 ? card.addressCity : str5;
        String str23 = (i & 128) != 0 ? card.addressState : str6;
        String str24 = (i & 256) != 0 ? card.addressZip : str7;
        String str25 = (i & 512) != 0 ? card.addressZipCheck : str8;
        String str26 = (i & 1024) != 0 ? card.addressCountry : str9;
        String str27 = (i & 2048) != 0 ? card.last4 : str10;
        CardBrand cardBrand2 = (i & 4096) != 0 ? card.brand : cardBrand;
        CardFunding cardFunding2 = (i & 8192) != 0 ? card.funding : cardFunding;
        Integer num5 = num3;
        String str28 = (i & 16384) != 0 ? card.fingerprint : str11;
        String str29 = (i & 32768) != 0 ? card.country : str12;
        String str30 = (i & 65536) != 0 ? card.currency : str13;
        String str31 = (i & 131072) != 0 ? card.customerId : str14;
        String str32 = (i & 262144) != 0 ? card.cvcCheck : str15;
        String str33 = (i & 524288) != 0 ? card.id : str16;
        if ((i & 1048576) != 0) {
            str17 = str33;
            tokenizationMethod2 = card.tokenizationMethod;
        } else {
            tokenizationMethod2 = tokenizationMethod;
            str17 = str33;
        }
        return card.copy(num5, num4, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, cardBrand2, cardFunding2, str28, str29, str30, str31, str32, str17, tokenizationMethod2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getExpMonth() {
        return this.expMonth;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAddressZipCheck() {
        return this.addressZipCheck;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAddressCountry() {
        return this.addressCountry;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* renamed from: component13, reason: from getter */
    public final CardBrand getBrand() {
        return this.brand;
    }

    /* renamed from: component14, reason: from getter */
    public final CardFunding getFunding() {
        return this.funding;
    }

    /* renamed from: component15, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* renamed from: component16, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component18, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component19, reason: from getter */
    public final String getCvcCheck() {
        return this.cvcCheck;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getExpYear() {
        return this.expYear;
    }

    /* renamed from: component20, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component21, reason: from getter */
    public final TokenizationMethod getTokenizationMethod() {
        return this.tokenizationMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAddressLine1Check() {
        return this.addressLine1Check;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAddressCity() {
        return this.addressCity;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAddressState() {
        return this.addressState;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAddressZip() {
        return this.addressZip;
    }

    public final Card copy(Integer expMonth, Integer expYear, String name, String addressLine1, String addressLine1Check, String addressLine2, String addressCity, String addressState, String addressZip, String addressZipCheck, String addressCountry, String last4, CardBrand brand, CardFunding funding, String fingerprint, String country, String currency, String customerId, String cvcCheck, String id, TokenizationMethod tokenizationMethod) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        return new Card(expMonth, expYear, name, addressLine1, addressLine1Check, addressLine2, addressCity, addressState, addressZip, addressZipCheck, addressCountry, last4, brand, funding, fingerprint, country, currency, customerId, cvcCheck, id, tokenizationMethod);
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
        return Intrinsics.areEqual(this.expMonth, card.expMonth) && Intrinsics.areEqual(this.expYear, card.expYear) && Intrinsics.areEqual(this.name, card.name) && Intrinsics.areEqual(this.addressLine1, card.addressLine1) && Intrinsics.areEqual(this.addressLine1Check, card.addressLine1Check) && Intrinsics.areEqual(this.addressLine2, card.addressLine2) && Intrinsics.areEqual(this.addressCity, card.addressCity) && Intrinsics.areEqual(this.addressState, card.addressState) && Intrinsics.areEqual(this.addressZip, card.addressZip) && Intrinsics.areEqual(this.addressZipCheck, card.addressZipCheck) && Intrinsics.areEqual(this.addressCountry, card.addressCountry) && Intrinsics.areEqual(this.last4, card.last4) && this.brand == card.brand && this.funding == card.funding && Intrinsics.areEqual(this.fingerprint, card.fingerprint) && Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.currency, card.currency) && Intrinsics.areEqual(this.customerId, card.customerId) && Intrinsics.areEqual(this.cvcCheck, card.cvcCheck) && Intrinsics.areEqual(this.id, card.id) && this.tokenizationMethod == card.tokenizationMethod;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        Integer num = this.expMonth;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expYear;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine1;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1Check;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressCity;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressState;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressZip;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressZipCheck;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressCountry;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.last4;
        int iHashCode12 = (((iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.brand.hashCode()) * 31;
        CardFunding cardFunding = this.funding;
        int iHashCode13 = (iHashCode12 + (cardFunding == null ? 0 : cardFunding.hashCode())) * 31;
        String str11 = this.fingerprint;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.country;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currency;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.customerId;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cvcCheck;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.id;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        TokenizationMethod tokenizationMethod = this.tokenizationMethod;
        return iHashCode19 + (tokenizationMethod != null ? tokenizationMethod.hashCode() : 0);
    }

    public String toString() {
        return "Card(expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", name=" + this.name + ", addressLine1=" + this.addressLine1 + ", addressLine1Check=" + this.addressLine1Check + ", addressLine2=" + this.addressLine2 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressZip=" + this.addressZip + ", addressZipCheck=" + this.addressZipCheck + ", addressCountry=" + this.addressCountry + ", last4=" + this.last4 + ", brand=" + this.brand + ", funding=" + this.funding + ", fingerprint=" + this.fingerprint + ", country=" + this.country + ", currency=" + this.currency + ", customerId=" + this.customerId + ", cvcCheck=" + this.cvcCheck + ", id=" + this.id + ", tokenizationMethod=" + this.tokenizationMethod + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.expMonth;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.expYear;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.addressLine1);
        dest.writeString(this.addressLine1Check);
        dest.writeString(this.addressLine2);
        dest.writeString(this.addressCity);
        dest.writeString(this.addressState);
        dest.writeString(this.addressZip);
        dest.writeString(this.addressZipCheck);
        dest.writeString(this.addressCountry);
        dest.writeString(this.last4);
        dest.writeString(this.brand.name());
        CardFunding cardFunding = this.funding;
        if (cardFunding == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cardFunding.name());
        }
        dest.writeString(this.fingerprint);
        dest.writeString(this.country);
        dest.writeString(this.currency);
        dest.writeString(this.customerId);
        dest.writeString(this.cvcCheck);
        dest.writeString(this.id);
        TokenizationMethod tokenizationMethod = this.tokenizationMethod;
        if (tokenizationMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(tokenizationMethod.name());
        }
    }

    public Card(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand brand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.expMonth = num;
        this.expYear = num2;
        this.name = str;
        this.addressLine1 = str2;
        this.addressLine1Check = str3;
        this.addressLine2 = str4;
        this.addressCity = str5;
        this.addressState = str6;
        this.addressZip = str7;
        this.addressZipCheck = str8;
        this.addressCountry = str9;
        this.last4 = str10;
        this.brand = brand;
        this.funding = cardFunding;
        this.fingerprint = str11;
        this.country = str12;
        this.currency = str13;
        this.customerId = str14;
        this.cvcCheck = str15;
        this.id = str16;
        this.tokenizationMethod = tokenizationMethod;
    }

    public /* synthetic */ Card(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand cardBrand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, cardBrand, (i & 8192) != 0 ? null : cardFunding, (i & 16384) != 0 ? null : str11, (32768 & i) != 0 ? null : str12, (65536 & i) != 0 ? null : str13, (131072 & i) != 0 ? null : str14, (262144 & i) != 0 ? null : str15, str16, (i & 1048576) != 0 ? null : tokenizationMethod);
    }

    public final Integer getExpMonth() {
        return this.expMonth;
    }

    public final Integer getExpYear() {
        return this.expYear;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine1Check() {
        return this.addressLine1Check;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAddressCity() {
        return this.addressCity;
    }

    public final String getAddressState() {
        return this.addressState;
    }

    public final String getAddressZip() {
        return this.addressZip;
    }

    public final String getAddressZipCheck() {
        return this.addressZipCheck;
    }

    public final String getAddressCountry() {
        return this.addressCountry;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    public final CardFunding getFunding() {
        return this.funding;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getCvcCheck() {
        return this.cvcCheck;
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.id;
    }

    public final TokenizationMethod getTokenizationMethod() {
        return this.tokenizationMethod;
    }

    /* compiled from: Card.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/Card$Companion;", "", "<init>", "()V", "getCardBrand", "Lcom/stripe/android/model/CardBrand;", "brandName", "", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final /* synthetic */ CardBrand getCardBrand(String brandName) {
            if (brandName != null) {
                switch (brandName.hashCode()) {
                    case -993787207:
                        if (brandName.equals("Diners Club")) {
                            return CardBrand.DinersClub;
                        }
                        break;
                    case -298759312:
                        if (brandName.equals("American Express")) {
                            return CardBrand.AmericanExpress;
                        }
                        break;
                    case -231891079:
                        if (brandName.equals("UnionPay")) {
                            return CardBrand.UnionPay;
                        }
                        break;
                    case -46205774:
                        if (brandName.equals("MasterCard")) {
                            return CardBrand.MasterCard;
                        }
                        break;
                    case 73257:
                        if (brandName.equals("JCB")) {
                            return CardBrand.JCB;
                        }
                        break;
                    case 2666593:
                        if (brandName.equals("Visa")) {
                            return CardBrand.Visa;
                        }
                        break;
                    case 337828873:
                        if (brandName.equals("Discover")) {
                            return CardBrand.Discover;
                        }
                        break;
                }
            }
            return CardBrand.Unknown;
        }
    }
}
