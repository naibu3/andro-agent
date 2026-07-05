package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.Token;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonTokenParams.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0005[\\]^_B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u001bHÆ\u0003Jù\u0001\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0006\u0010O\u001a\u00020PJ\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010T\u001a\u00020PHÖ\u0001J\t\u0010U\u001a\u00020\nHÖ\u0001J\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020PR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002090\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00101¨\u0006`"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams;", "Lcom/stripe/android/model/TokenParams;", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", PersonTokenParams.PARAM_METADATA, "", "phone", PersonTokenParams.PARAM_RELATIONSHIP, "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "ssnLast4", PersonTokenParams.PARAM_VERIFICATION, "Lcom/stripe/android/model/PersonTokenParams$Verification;", "<init>", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Relationship;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Verification;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getAddressKana", "()Lcom/stripe/android/model/AddressJapanParams;", "getAddressKanji", "getDateOfBirth", "()Lcom/stripe/android/model/DateOfBirth;", "getEmail", "()Ljava/lang/String;", "getFirstName", "getFirstNameKana", "getFirstNameKanji", "getGender", "getIdNumber", "getLastName", "getLastNameKana", "getLastNameKanji", "getMaidenName", "getMetadata", "()Ljava/util/Map;", "getPhone", "getRelationship", "()Lcom/stripe/android/model/PersonTokenParams$Relationship;", "getSsnLast4", "getVerification", "()Lcom/stripe/android/model/PersonTokenParams$Verification;", "typeDataParams", "", "getTypeDataParams", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Relationship", "Verification", "Document", "Builder", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PersonTokenParams extends TokenParams {
    private static final String PARAM_ADDRESS = "address";
    private static final String PARAM_ADDRESS_KANA = "address_kana";
    private static final String PARAM_ADDRESS_KANJI = "address_kanji";
    private static final String PARAM_DOB = "dob";
    private static final String PARAM_EMAIL = "email";
    private static final String PARAM_FIRST_NAME = "first_name";
    private static final String PARAM_FIRST_NAME_KANA = "first_name_kana";
    private static final String PARAM_FIRST_NAME_KANJI = "first_name_kanji";
    private static final String PARAM_GENDER = "gender";
    private static final String PARAM_ID_NUMBER = "id_number";
    private static final String PARAM_LAST_NAME = "last_name";
    private static final String PARAM_LAST_NAME_KANA = "last_name_kana";
    private static final String PARAM_LAST_NAME_KANJI = "last_name_kanji";
    private static final String PARAM_MAIDEN_NAME = "maiden_name";
    private static final String PARAM_METADATA = "metadata";
    private static final String PARAM_PERSON = "person";
    private static final String PARAM_PHONE = "phone";
    private static final String PARAM_RELATIONSHIP = "relationship";
    private static final String PARAM_SSN_LAST_4 = "ssn_last_4";
    private static final String PARAM_VERIFICATION = "verification";
    private final Address address;
    private final AddressJapanParams addressKana;
    private final AddressJapanParams addressKanji;
    private final DateOfBirth dateOfBirth;
    private final String email;
    private final String firstName;
    private final String firstNameKana;
    private final String firstNameKanji;
    private final String gender;
    private final String idNumber;
    private final String lastName;
    private final String lastNameKana;
    private final String lastNameKanji;
    private final String maidenName;
    private final Map<String, String> metadata;
    private final String phone;
    private final Relationship relationship;
    private final String ssnLast4;
    private final Verification verification;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PersonTokenParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: PersonTokenParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PersonTokenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonTokenParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Address addressCreateFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            AddressJapanParams addressJapanParamsCreateFromParcel = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
            AddressJapanParams addressJapanParamsCreateFromParcel2 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
            DateOfBirth dateOfBirthCreateFromParcel = parcel.readInt() == 0 ? null : DateOfBirth.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                int i2 = 0;
                while (i2 != i) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i2++;
                    i = i;
                }
            }
            return new PersonTokenParams(addressCreateFromParcel, addressJapanParamsCreateFromParcel, addressJapanParamsCreateFromParcel2, dateOfBirthCreateFromParcel, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, linkedHashMap, parcel.readString(), parcel.readInt() == 0 ? null : Relationship.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Verification.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonTokenParams[] newArray(int i) {
            return new PersonTokenParams[i];
        }
    }

    public PersonTokenParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ PersonTokenParams copy$default(PersonTokenParams personTokenParams, Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, Relationship relationship, String str12, Verification verification, int i, Object obj) {
        Verification verification2;
        String str13;
        Address address2 = (i & 1) != 0 ? personTokenParams.address : address;
        AddressJapanParams addressJapanParams3 = (i & 2) != 0 ? personTokenParams.addressKana : addressJapanParams;
        AddressJapanParams addressJapanParams4 = (i & 4) != 0 ? personTokenParams.addressKanji : addressJapanParams2;
        DateOfBirth dateOfBirth2 = (i & 8) != 0 ? personTokenParams.dateOfBirth : dateOfBirth;
        String str14 = (i & 16) != 0 ? personTokenParams.email : str;
        String str15 = (i & 32) != 0 ? personTokenParams.firstName : str2;
        String str16 = (i & 64) != 0 ? personTokenParams.firstNameKana : str3;
        String str17 = (i & 128) != 0 ? personTokenParams.firstNameKanji : str4;
        String str18 = (i & 256) != 0 ? personTokenParams.gender : str5;
        String str19 = (i & 512) != 0 ? personTokenParams.idNumber : str6;
        String str20 = (i & 1024) != 0 ? personTokenParams.lastName : str7;
        String str21 = (i & 2048) != 0 ? personTokenParams.lastNameKana : str8;
        String str22 = (i & 4096) != 0 ? personTokenParams.lastNameKanji : str9;
        String str23 = (i & 8192) != 0 ? personTokenParams.maidenName : str10;
        Address address3 = address2;
        Map map2 = (i & 16384) != 0 ? personTokenParams.metadata : map;
        String str24 = (i & 32768) != 0 ? personTokenParams.phone : str11;
        Relationship relationship2 = (i & 65536) != 0 ? personTokenParams.relationship : relationship;
        String str25 = (i & 131072) != 0 ? personTokenParams.ssnLast4 : str12;
        if ((i & 262144) != 0) {
            str13 = str25;
            verification2 = personTokenParams.verification;
        } else {
            verification2 = verification;
            str13 = str25;
        }
        return personTokenParams.copy(address3, addressJapanParams3, addressJapanParams4, dateOfBirth2, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, map2, str24, relationship2, str13, verification2);
    }

    /* renamed from: component1, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    /* renamed from: component10, reason: from getter */
    public final String getIdNumber() {
        return this.idNumber;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLastNameKana() {
        return this.lastNameKana;
    }

    /* renamed from: component13, reason: from getter */
    public final String getLastNameKanji() {
        return this.lastNameKanji;
    }

    /* renamed from: component14, reason: from getter */
    public final String getMaidenName() {
        return this.maidenName;
    }

    public final Map<String, String> component15() {
        return this.metadata;
    }

    /* renamed from: component16, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component17, reason: from getter */
    public final Relationship getRelationship() {
        return this.relationship;
    }

    /* renamed from: component18, reason: from getter */
    public final String getSsnLast4() {
        return this.ssnLast4;
    }

    /* renamed from: component19, reason: from getter */
    public final Verification getVerification() {
        return this.verification;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressJapanParams getAddressKana() {
        return this.addressKana;
    }

    /* renamed from: component3, reason: from getter */
    public final AddressJapanParams getAddressKanji() {
        return this.addressKanji;
    }

    /* renamed from: component4, reason: from getter */
    public final DateOfBirth getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFirstNameKana() {
        return this.firstNameKana;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFirstNameKanji() {
        return this.firstNameKanji;
    }

    /* renamed from: component9, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    public final PersonTokenParams copy(Address address, AddressJapanParams addressKana, AddressJapanParams addressKanji, DateOfBirth dateOfBirth, String email, String firstName, String firstNameKana, String firstNameKanji, String gender, String idNumber, String lastName, String lastNameKana, String lastNameKanji, String maidenName, Map<String, String> metadata, String phone, Relationship relationship, String ssnLast4, Verification verification) {
        return new PersonTokenParams(address, addressKana, addressKanji, dateOfBirth, email, firstName, firstNameKana, firstNameKanji, gender, idNumber, lastName, lastNameKana, lastNameKanji, maidenName, metadata, phone, relationship, ssnLast4, verification);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonTokenParams)) {
            return false;
        }
        PersonTokenParams personTokenParams = (PersonTokenParams) other;
        return Intrinsics.areEqual(this.address, personTokenParams.address) && Intrinsics.areEqual(this.addressKana, personTokenParams.addressKana) && Intrinsics.areEqual(this.addressKanji, personTokenParams.addressKanji) && Intrinsics.areEqual(this.dateOfBirth, personTokenParams.dateOfBirth) && Intrinsics.areEqual(this.email, personTokenParams.email) && Intrinsics.areEqual(this.firstName, personTokenParams.firstName) && Intrinsics.areEqual(this.firstNameKana, personTokenParams.firstNameKana) && Intrinsics.areEqual(this.firstNameKanji, personTokenParams.firstNameKanji) && Intrinsics.areEqual(this.gender, personTokenParams.gender) && Intrinsics.areEqual(this.idNumber, personTokenParams.idNumber) && Intrinsics.areEqual(this.lastName, personTokenParams.lastName) && Intrinsics.areEqual(this.lastNameKana, personTokenParams.lastNameKana) && Intrinsics.areEqual(this.lastNameKanji, personTokenParams.lastNameKanji) && Intrinsics.areEqual(this.maidenName, personTokenParams.maidenName) && Intrinsics.areEqual(this.metadata, personTokenParams.metadata) && Intrinsics.areEqual(this.phone, personTokenParams.phone) && Intrinsics.areEqual(this.relationship, personTokenParams.relationship) && Intrinsics.areEqual(this.ssnLast4, personTokenParams.ssnLast4) && Intrinsics.areEqual(this.verification, personTokenParams.verification);
    }

    public int hashCode() {
        Address address = this.address;
        int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
        AddressJapanParams addressJapanParams = this.addressKana;
        int iHashCode2 = (iHashCode + (addressJapanParams == null ? 0 : addressJapanParams.hashCode())) * 31;
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        int iHashCode3 = (iHashCode2 + (addressJapanParams2 == null ? 0 : addressJapanParams2.hashCode())) * 31;
        DateOfBirth dateOfBirth = this.dateOfBirth;
        int iHashCode4 = (iHashCode3 + (dateOfBirth == null ? 0 : dateOfBirth.hashCode())) * 31;
        String str = this.email;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstNameKana;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameKanji;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gender;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.idNumber;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastName;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastNameKana;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastNameKanji;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.maidenName;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int iHashCode15 = (iHashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        String str11 = this.phone;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Relationship relationship = this.relationship;
        int iHashCode17 = (iHashCode16 + (relationship == null ? 0 : relationship.hashCode())) * 31;
        String str12 = this.ssnLast4;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Verification verification = this.verification;
        return iHashCode18 + (verification != null ? verification.hashCode() : 0);
    }

    public String toString() {
        return "PersonTokenParams(address=" + this.address + ", addressKana=" + this.addressKana + ", addressKanji=" + this.addressKanji + ", dateOfBirth=" + this.dateOfBirth + ", email=" + this.email + ", firstName=" + this.firstName + ", firstNameKana=" + this.firstNameKana + ", firstNameKanji=" + this.firstNameKanji + ", gender=" + this.gender + ", idNumber=" + this.idNumber + ", lastName=" + this.lastName + ", lastNameKana=" + this.lastNameKana + ", lastNameKanji=" + this.lastNameKanji + ", maidenName=" + this.maidenName + ", metadata=" + this.metadata + ", phone=" + this.phone + ", relationship=" + this.relationship + ", ssnLast4=" + this.ssnLast4 + ", verification=" + this.verification + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Address address = this.address;
        if (address == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            address.writeToParcel(dest, flags);
        }
        AddressJapanParams addressJapanParams = this.addressKana;
        if (addressJapanParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            addressJapanParams.writeToParcel(dest, flags);
        }
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        if (addressJapanParams2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            addressJapanParams2.writeToParcel(dest, flags);
        }
        DateOfBirth dateOfBirth = this.dateOfBirth;
        if (dateOfBirth == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dateOfBirth.writeToParcel(dest, flags);
        }
        dest.writeString(this.email);
        dest.writeString(this.firstName);
        dest.writeString(this.firstNameKana);
        dest.writeString(this.firstNameKanji);
        dest.writeString(this.gender);
        dest.writeString(this.idNumber);
        dest.writeString(this.lastName);
        dest.writeString(this.lastNameKana);
        dest.writeString(this.lastNameKanji);
        dest.writeString(this.maidenName);
        Map<String, String> map = this.metadata;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
        dest.writeString(this.phone);
        Relationship relationship = this.relationship;
        if (relationship == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            relationship.writeToParcel(dest, flags);
        }
        dest.writeString(this.ssnLast4);
        Verification verification = this.verification;
        if (verification == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            verification.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ PersonTokenParams(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, Relationship relationship, String str12, Verification verification, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : addressJapanParams, (i & 4) != 0 ? null : addressJapanParams2, (i & 8) != 0 ? null : dateOfBirth, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : map, (i & 32768) != 0 ? null : str11, (i & 65536) != 0 ? null : relationship, (i & 131072) != 0 ? null : str12, (i & 262144) != 0 ? null : verification);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final AddressJapanParams getAddressKana() {
        return this.addressKana;
    }

    public final AddressJapanParams getAddressKanji() {
        return this.addressKanji;
    }

    public final DateOfBirth getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFirstNameKana() {
        return this.firstNameKana;
    }

    public final String getFirstNameKanji() {
        return this.firstNameKanji;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getIdNumber() {
        return this.idNumber;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLastNameKana() {
        return this.lastNameKana;
    }

    public final String getLastNameKanji() {
        return this.lastNameKanji;
    }

    public final String getMaidenName() {
        return this.maidenName;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Relationship getRelationship() {
        return this.relationship;
    }

    public final String getSsnLast4() {
        return this.ssnLast4;
    }

    public final Verification getVerification() {
        return this.verification;
    }

    public PersonTokenParams(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, Relationship relationship, String str12, Verification verification) {
        super(Token.Type.Person, null, 2, null);
        this.address = address;
        this.addressKana = addressJapanParams;
        this.addressKanji = addressJapanParams2;
        this.dateOfBirth = dateOfBirth;
        this.email = str;
        this.firstName = str2;
        this.firstNameKana = str3;
        this.firstNameKanji = str4;
        this.gender = str5;
        this.idNumber = str6;
        this.lastName = str7;
        this.lastNameKana = str8;
        this.lastNameKanji = str9;
        this.maidenName = str10;
        this.metadata = map;
        this.phone = str11;
        this.relationship = relationship;
        this.ssnLast4 = str12;
        this.verification = verification;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Pair[] pairArr = new Pair[19];
        Address address = this.address;
        pairArr[0] = TuplesKt.to("address", address != null ? address.toParamMap() : null);
        AddressJapanParams addressJapanParams = this.addressKana;
        pairArr[1] = TuplesKt.to(PARAM_ADDRESS_KANA, addressJapanParams != null ? addressJapanParams.toParamMap() : null);
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        pairArr[2] = TuplesKt.to(PARAM_ADDRESS_KANJI, addressJapanParams2 != null ? addressJapanParams2.toParamMap() : null);
        DateOfBirth dateOfBirth = this.dateOfBirth;
        pairArr[3] = TuplesKt.to(PARAM_DOB, dateOfBirth != null ? dateOfBirth.toParamMap() : null);
        pairArr[4] = TuplesKt.to("email", this.email);
        pairArr[5] = TuplesKt.to(PARAM_FIRST_NAME, this.firstName);
        pairArr[6] = TuplesKt.to(PARAM_FIRST_NAME_KANA, this.firstNameKana);
        pairArr[7] = TuplesKt.to(PARAM_FIRST_NAME_KANJI, this.firstNameKanji);
        pairArr[8] = TuplesKt.to("gender", this.gender);
        pairArr[9] = TuplesKt.to(PARAM_ID_NUMBER, this.idNumber);
        pairArr[10] = TuplesKt.to(PARAM_LAST_NAME, this.lastName);
        pairArr[11] = TuplesKt.to(PARAM_LAST_NAME_KANA, this.lastNameKana);
        pairArr[12] = TuplesKt.to(PARAM_LAST_NAME_KANJI, this.lastNameKanji);
        pairArr[13] = TuplesKt.to(PARAM_MAIDEN_NAME, this.maidenName);
        pairArr[14] = TuplesKt.to(PARAM_METADATA, this.metadata);
        pairArr[15] = TuplesKt.to("phone", this.phone);
        Relationship relationship = this.relationship;
        pairArr[16] = TuplesKt.to(PARAM_RELATIONSHIP, relationship != null ? relationship.toParamMap() : null);
        pairArr[17] = TuplesKt.to(PARAM_SSN_LAST_4, this.ssnLast4);
        Verification verification = this.verification;
        pairArr[18] = TuplesKt.to(PARAM_VERIFICATION, verification != null ? verification.toParamMap() : null);
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

    /* compiled from: PersonTokenParams.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0002./BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\bJ\u0013\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00060"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Relationship.PARAM_DIRECTOR, "", Relationship.PARAM_EXECUTIVE, Relationship.PARAM_OWNER, "percentOwnership", "", Relationship.PARAM_REPRESENTATIVE, "title", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getDirector", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExecutive", "getOwner", "getPercentOwnership", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRepresentative", "getTitle", "()Ljava/lang/String;", "toParamMap", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Relationship;", "describeContents", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Relationship implements StripeParamsModel, Parcelable {
        private static final String PARAM_DIRECTOR = "director";
        private static final String PARAM_EXECUTIVE = "executive";
        private static final String PARAM_OWNER = "owner";
        private static final String PARAM_PERCENT_OWNERSHIP = "percent_ownership";
        private static final String PARAM_REPRESENTATIVE = "representative";
        private static final String PARAM_TITLE = "title";
        private final Boolean director;
        private final Boolean executive;
        private final Boolean owner;
        private final Integer percentOwnership;
        private final Boolean representative;
        private final String title;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Relationship> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PersonTokenParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Relationship> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Relationship createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Boolean boolValueOf4 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Relationship(boolValueOf, boolValueOf2, boolValueOf3, numValueOf, boolValueOf4, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Relationship[] newArray(int i) {
                return new Relationship[i];
            }
        }

        public Relationship() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ Relationship copy$default(Relationship relationship, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = relationship.director;
            }
            if ((i & 2) != 0) {
                bool2 = relationship.executive;
            }
            if ((i & 4) != 0) {
                bool3 = relationship.owner;
            }
            if ((i & 8) != 0) {
                num = relationship.percentOwnership;
            }
            if ((i & 16) != 0) {
                bool4 = relationship.representative;
            }
            if ((i & 32) != 0) {
                str = relationship.title;
            }
            Boolean bool5 = bool4;
            String str2 = str;
            return relationship.copy(bool, bool2, bool3, num, bool5, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getDirector() {
            return this.director;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getExecutive() {
            return this.executive;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getOwner() {
            return this.owner;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getPercentOwnership() {
            return this.percentOwnership;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getRepresentative() {
            return this.representative;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Relationship copy(Boolean director, Boolean executive, Boolean owner, Integer percentOwnership, Boolean representative, String title) {
            return new Relationship(director, executive, owner, percentOwnership, representative, title);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Relationship)) {
                return false;
            }
            Relationship relationship = (Relationship) other;
            return Intrinsics.areEqual(this.director, relationship.director) && Intrinsics.areEqual(this.executive, relationship.executive) && Intrinsics.areEqual(this.owner, relationship.owner) && Intrinsics.areEqual(this.percentOwnership, relationship.percentOwnership) && Intrinsics.areEqual(this.representative, relationship.representative) && Intrinsics.areEqual(this.title, relationship.title);
        }

        public int hashCode() {
            Boolean bool = this.director;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.executive;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.owner;
            int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num = this.percentOwnership;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool4 = this.representative;
            int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str = this.title;
            return iHashCode5 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Relationship(director=" + this.director + ", executive=" + this.executive + ", owner=" + this.owner + ", percentOwnership=" + this.percentOwnership + ", representative=" + this.representative + ", title=" + this.title + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.director;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.executive;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.owner;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            Integer num = this.percentOwnership;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Boolean bool4 = this.representative;
            if (bool4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.title);
        }

        public Relationship(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str) {
            this.director = bool;
            this.executive = bool2;
            this.owner = bool3;
            this.percentOwnership = num;
            this.representative = bool4;
            this.title = str;
        }

        public /* synthetic */ Relationship(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str);
        }

        public final Boolean getDirector() {
            return this.director;
        }

        public final Boolean getExecutive() {
            return this.executive;
        }

        public final Boolean getOwner() {
            return this.owner;
        }

        public final Integer getPercentOwnership() {
            return this.percentOwnership;
        }

        public final Boolean getRepresentative() {
            return this.representative;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<Pair> listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(PARAM_DIRECTOR, this.director), TuplesKt.to(PARAM_EXECUTIVE, this.executive), TuplesKt.to(PARAM_OWNER, this.owner), TuplesKt.to(PARAM_PERCENT_OWNERSHIP, this.percentOwnership), TuplesKt.to(PARAM_REPRESENTATIVE, this.representative), TuplesKt.to("title", this.title)});
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

        /* compiled from: PersonTokenParams.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u0017\u001a\u00020\u0018R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "", "<init>", "()V", Relationship.PARAM_DIRECTOR, "", "Ljava/lang/Boolean;", Relationship.PARAM_EXECUTIVE, Relationship.PARAM_OWNER, "percentOwnership", "", "Ljava/lang/Integer;", Relationship.PARAM_REPRESENTATIVE, "title", "", "setDirector", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "setExecutive", "setOwner", "setPercentOwnership", "(Ljava/lang/Integer;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "setRepresentative", "setTitle", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private Boolean director;
            private Boolean executive;
            private Boolean owner;
            private Integer percentOwnership;
            private Boolean representative;
            private String title;

            public final Builder setDirector(Boolean director) {
                this.director = director;
                return this;
            }

            public final Builder setExecutive(Boolean executive) {
                this.executive = executive;
                return this;
            }

            public final Builder setOwner(Boolean owner) {
                this.owner = owner;
                return this;
            }

            public final Builder setPercentOwnership(Integer percentOwnership) {
                this.percentOwnership = percentOwnership;
                return this;
            }

            public final Builder setRepresentative(Boolean representative) {
                this.representative = representative;
                return this;
            }

            public final Builder setTitle(String title) {
                this.title = title;
                return this;
            }

            public final Relationship build() {
                return new Relationship(this.director, this.executive, this.owner, this.percentOwnership, this.representative, this.title);
            }
        }

        /* compiled from: PersonTokenParams.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship$Companion;", "", "<init>", "()V", "PARAM_DIRECTOR", "", "PARAM_EXECUTIVE", "PARAM_OWNER", "PARAM_PERCENT_OWNERSHIP", "PARAM_REPRESENTATIVE", "PARAM_TITLE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PersonTokenParams.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Verification.PARAM_DOCUMENT, "Lcom/stripe/android/model/PersonTokenParams$Document;", "additionalDocument", "<init>", "(Lcom/stripe/android/model/PersonTokenParams$Document;Lcom/stripe/android/model/PersonTokenParams$Document;)V", "getDocument", "()Lcom/stripe/android/model/PersonTokenParams$Document;", "getAdditionalDocument", "toParamMap", "", "", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Verification implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        private static final String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
        private static final String PARAM_DOCUMENT = "document";
        private final Document additionalDocument;
        private final Document document;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Verification> CREATOR = new Creator();

        /* compiled from: PersonTokenParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Verification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Verification createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Verification(parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Document.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Verification[] newArray(int i) {
                return new Verification[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Verification() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Verification(Document document) {
            this(document, null, 2, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Verification copy$default(Verification verification, Document document, Document document2, int i, Object obj) {
            if ((i & 1) != 0) {
                document = verification.document;
            }
            if ((i & 2) != 0) {
                document2 = verification.additionalDocument;
            }
            return verification.copy(document, document2);
        }

        /* renamed from: component1, reason: from getter */
        public final Document getDocument() {
            return this.document;
        }

        /* renamed from: component2, reason: from getter */
        public final Document getAdditionalDocument() {
            return this.additionalDocument;
        }

        public final Verification copy(Document document, Document additionalDocument) {
            return new Verification(document, additionalDocument);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Verification)) {
                return false;
            }
            Verification verification = (Verification) other;
            return Intrinsics.areEqual(this.document, verification.document) && Intrinsics.areEqual(this.additionalDocument, verification.additionalDocument);
        }

        public int hashCode() {
            Document document = this.document;
            int iHashCode = (document == null ? 0 : document.hashCode()) * 31;
            Document document2 = this.additionalDocument;
            return iHashCode + (document2 != null ? document2.hashCode() : 0);
        }

        public String toString() {
            return "Verification(document=" + this.document + ", additionalDocument=" + this.additionalDocument + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Document document = this.document;
            if (document == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                document.writeToParcel(dest, flags);
            }
            Document document2 = this.additionalDocument;
            if (document2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                document2.writeToParcel(dest, flags);
            }
        }

        public Verification(Document document, Document document2) {
            this.document = document;
            this.additionalDocument = document2;
        }

        public /* synthetic */ Verification(Document document, Document document2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : document, (i & 2) != 0 ? null : document2);
        }

        public final Document getDocument() {
            return this.document;
        }

        public final Document getAdditionalDocument() {
            return this.additionalDocument;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Pair[] pairArr = new Pair[2];
            Document document = this.document;
            pairArr[0] = TuplesKt.to(PARAM_ADDITIONAL_DOCUMENT, document != null ? document.toParamMap() : null);
            Document document2 = this.additionalDocument;
            pairArr[1] = TuplesKt.to(PARAM_DOCUMENT, document2 != null ? document2.toParamMap() : null);
            List<Pair> listListOf = CollectionsKt.listOf((Object[]) pairArr);
            Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
            for (Pair pair : listListOf) {
                String str = (String) pair.component1();
                Map map = (Map) pair.component2();
                Map mapMapOf = map != null ? MapsKt.mapOf(TuplesKt.to(str, map)) : null;
                if (mapMapOf == null) {
                    mapMapOf = MapsKt.emptyMap();
                }
                mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
            }
            return mapEmptyMap;
        }

        /* compiled from: PersonTokenParams.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Verification$Companion;", "", "<init>", "()V", "PARAM_ADDITIONAL_DOCUMENT", "", "PARAM_DOCUMENT", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PersonTokenParams.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fH\u0016J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Document.PARAM_FRONT, "", Document.PARAM_BACK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFront", "()Ljava/lang/String;", "getBack", "toParamMap", "", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Document implements StripeParamsModel, Parcelable {
        private static final String PARAM_BACK = "back";
        private static final String PARAM_FRONT = "front";
        private final String back;
        private final String front;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Document> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PersonTokenParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Document> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document[] newArray(int i) {
                return new Document[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Document() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Document(String str) {
            this(str, null, 2, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = document.front;
            }
            if ((i & 2) != 0) {
                str2 = document.back;
            }
            return document.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFront() {
            return this.front;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBack() {
            return this.back;
        }

        public final Document copy(String front, String back) {
            return new Document(front, back);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return Intrinsics.areEqual(this.front, document.front) && Intrinsics.areEqual(this.back, document.back);
        }

        public int hashCode() {
            String str = this.front;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.back;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Document(front=" + this.front + ", back=" + this.back + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.front);
            dest.writeString(this.back);
        }

        public Document(String str, String str2) {
            this.front = str;
            this.back = str2;
        }

        public /* synthetic */ Document(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final String getFront() {
            return this.front;
        }

        public final String getBack() {
            return this.back;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<Pair> listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(PARAM_BACK, this.back), TuplesKt.to(PARAM_FRONT, this.front)});
            Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
            for (Pair pair : listListOf) {
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                Map mapMapOf = str2 != null ? MapsKt.mapOf(TuplesKt.to(str, str2)) : null;
                if (mapMapOf == null) {
                    mapMapOf = MapsKt.emptyMap();
                }
                mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
            }
            return mapEmptyMap;
        }

        /* compiled from: PersonTokenParams.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Document$Companion;", "", "<init>", "()V", "PARAM_BACK", "", "PARAM_FRONT", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: PersonTokenParams.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010 \u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010!\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u0010\u0010*\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u0010\u0010+\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\fJ\u001c\u0010,\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017J\u0010\u0010-\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\fJ\u0010\u00100\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0006\u00101\u001a\u000202R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Builder;", "", "<init>", "()V", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", PersonTokenParams.PARAM_METADATA, "", "phone", PersonTokenParams.PARAM_RELATIONSHIP, "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "ssnLast4", PersonTokenParams.PARAM_VERIFICATION, "Lcom/stripe/android/model/PersonTokenParams$Verification;", "setAddress", "setAddressKana", "setAddressKanji", "setDateOfBirth", "setEmail", "setFirstName", "setFirstNameKana", "setFirstNameKanji", "setGender", "setIdNumber", "setLastName", "setLastNameKana", "setLastNameKanji", "setMaidenName", "setMetadata", "setPhone", "setRelationship", "setSsnLast4", "setVerification", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/model/PersonTokenParams;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Address address;
        private AddressJapanParams addressKana;
        private AddressJapanParams addressKanji;
        private DateOfBirth dateOfBirth;
        private String email;
        private String firstName;
        private String firstNameKana;
        private String firstNameKanji;
        private String gender;
        private String idNumber;
        private String lastName;
        private String lastNameKana;
        private String lastNameKanji;
        private String maidenName;
        private Map<String, String> metadata;
        private String phone;
        private Relationship relationship;
        private String ssnLast4;
        private Verification verification;

        public final Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public final Builder setAddressKana(AddressJapanParams addressKana) {
            this.addressKana = addressKana;
            return this;
        }

        public final Builder setAddressKanji(AddressJapanParams addressKanji) {
            this.addressKanji = addressKanji;
            return this;
        }

        public final Builder setDateOfBirth(DateOfBirth dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public final Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public final Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public final Builder setFirstNameKana(String firstNameKana) {
            this.firstNameKana = firstNameKana;
            return this;
        }

        public final Builder setFirstNameKanji(String firstNameKanji) {
            this.firstNameKanji = firstNameKanji;
            return this;
        }

        public final Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public final Builder setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public final Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public final Builder setLastNameKana(String lastNameKana) {
            this.lastNameKana = lastNameKana;
            return this;
        }

        public final Builder setLastNameKanji(String lastNameKanji) {
            this.lastNameKanji = lastNameKanji;
            return this;
        }

        public final Builder setMaidenName(String maidenName) {
            this.maidenName = maidenName;
            return this;
        }

        public final Builder setMetadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public final Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public final Builder setRelationship(Relationship relationship) {
            this.relationship = relationship;
            return this;
        }

        public final Builder setSsnLast4(String ssnLast4) {
            this.ssnLast4 = ssnLast4;
            return this;
        }

        public final Builder setVerification(Verification verification) {
            this.verification = verification;
            return this;
        }

        public final PersonTokenParams build() {
            return new PersonTokenParams(this.address, this.addressKana, this.addressKanji, this.dateOfBirth, this.email, this.firstName, this.firstNameKana, this.firstNameKanji, this.gender, this.idNumber, this.lastName, this.lastNameKana, this.lastNameKanji, this.maidenName, this.metadata, this.phone, this.relationship, this.ssnLast4, this.verification);
        }
    }

    /* compiled from: PersonTokenParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Companion;", "", "<init>", "()V", "PARAM_PERSON", "", "PARAM_ADDRESS", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DOB", "PARAM_EMAIL", "PARAM_FIRST_NAME", "PARAM_FIRST_NAME_KANA", "PARAM_FIRST_NAME_KANJI", "PARAM_GENDER", "PARAM_ID_NUMBER", "PARAM_LAST_NAME", "PARAM_LAST_NAME_KANA", "PARAM_LAST_NAME_KANJI", "PARAM_MAIDEN_NAME", "PARAM_METADATA", "PARAM_PHONE", "PARAM_RELATIONSHIP", "PARAM_SSN_LAST_4", "PARAM_VERIFICATION", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
