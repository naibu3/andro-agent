package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.Token;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BankAccountTokenParams.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÂ\u0003JK\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams;", "Lcom/stripe/android/model/TokenParams;", "country", "", "currency", "accountNumber", "accountHolderType", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", "accountHolderName", "routingNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccountTokenParams$Type;Ljava/lang/String;Ljava/lang/String;)V", "typeDataParams", "", "", "getTypeDataParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Type", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BankAccountTokenParams extends TokenParams {
    private static final String PARAM_ACCOUNT_HOLDER_NAME = "account_holder_name";
    private static final String PARAM_ACCOUNT_HOLDER_TYPE = "account_holder_type";
    private static final String PARAM_ACCOUNT_NUMBER = "account_number";
    private static final String PARAM_COUNTRY = "country";
    private static final String PARAM_CURRENCY = "currency";
    private static final String PARAM_ROUTING_NUMBER = "routing_number";
    private final String accountHolderName;
    private final Type accountHolderType;
    private final String accountNumber;
    private final String country;
    private final String currency;
    private final String routingNumber;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BankAccountTokenParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BankAccountTokenParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankAccountTokenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccountTokenParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccountTokenParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccountTokenParams[] newArray(int i) {
            return new BankAccountTokenParams[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BankAccountTokenParams(String country, String currency, String accountNumber) {
        this(country, currency, accountNumber, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BankAccountTokenParams(String country, String currency, String accountNumber, Type type) {
        this(country, currency, accountNumber, type, null, null, 48, null);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BankAccountTokenParams(String country, String currency, String accountNumber, Type type, String str) {
        this(country, currency, accountNumber, type, str, null, 32, null);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    /* renamed from: component1, reason: from getter */
    private final String getCountry() {
        return this.country;
    }

    /* renamed from: component2, reason: from getter */
    private final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    private final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    private final Type getAccountHolderType() {
        return this.accountHolderType;
    }

    /* renamed from: component5, reason: from getter */
    private final String getAccountHolderName() {
        return this.accountHolderName;
    }

    /* renamed from: component6, reason: from getter */
    private final String getRoutingNumber() {
        return this.routingNumber;
    }

    public static /* synthetic */ BankAccountTokenParams copy$default(BankAccountTokenParams bankAccountTokenParams, String str, String str2, String str3, Type type, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankAccountTokenParams.country;
        }
        if ((i & 2) != 0) {
            str2 = bankAccountTokenParams.currency;
        }
        if ((i & 4) != 0) {
            str3 = bankAccountTokenParams.accountNumber;
        }
        if ((i & 8) != 0) {
            type = bankAccountTokenParams.accountHolderType;
        }
        if ((i & 16) != 0) {
            str4 = bankAccountTokenParams.accountHolderName;
        }
        if ((i & 32) != 0) {
            str5 = bankAccountTokenParams.routingNumber;
        }
        String str6 = str4;
        String str7 = str5;
        return bankAccountTokenParams.copy(str, str2, str3, type, str6, str7);
    }

    public final BankAccountTokenParams copy(String country, String currency, String accountNumber, Type accountHolderType, String accountHolderName, String routingNumber) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new BankAccountTokenParams(country, currency, accountNumber, accountHolderType, accountHolderName, routingNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankAccountTokenParams)) {
            return false;
        }
        BankAccountTokenParams bankAccountTokenParams = (BankAccountTokenParams) other;
        return Intrinsics.areEqual(this.country, bankAccountTokenParams.country) && Intrinsics.areEqual(this.currency, bankAccountTokenParams.currency) && Intrinsics.areEqual(this.accountNumber, bankAccountTokenParams.accountNumber) && this.accountHolderType == bankAccountTokenParams.accountHolderType && Intrinsics.areEqual(this.accountHolderName, bankAccountTokenParams.accountHolderName) && Intrinsics.areEqual(this.routingNumber, bankAccountTokenParams.routingNumber);
    }

    public int hashCode() {
        int iHashCode = ((((this.country.hashCode() * 31) + this.currency.hashCode()) * 31) + this.accountNumber.hashCode()) * 31;
        Type type = this.accountHolderType;
        int iHashCode2 = (iHashCode + (type == null ? 0 : type.hashCode())) * 31;
        String str = this.accountHolderName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BankAccountTokenParams(country=" + this.country + ", currency=" + this.currency + ", accountNumber=" + this.accountNumber + ", accountHolderType=" + this.accountHolderType + ", accountHolderName=" + this.accountHolderName + ", routingNumber=" + this.routingNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.country);
        dest.writeString(this.currency);
        dest.writeString(this.accountNumber);
        Type type = this.accountHolderType;
        if (type == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(type.name());
        }
        dest.writeString(this.accountHolderName);
        dest.writeString(this.routingNumber);
    }

    public /* synthetic */ BankAccountTokenParams(String str, String str2, String str3, Type type, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : type, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BankAccountTokenParams.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Type;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Individual", "Company", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final Type Individual = new Type("Individual", 0, "individual");
        public static final Type Company = new Type("Company", 1, "company");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Individual, Company};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, String str2) {
            this.code = str2;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: BankAccountTokenParams.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Type$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", "code", "", "fromCode$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Type fromCode$payments_core_release(String code) {
                Type next;
                Iterator<Type> it = Type.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getCode(), code)) {
                        break;
                    }
                }
                return next;
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BankAccountTokenParams(String country, String currency, String accountNumber, Type type, String str, String str2) {
        super(Token.Type.BankAccount, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.country = country;
        this.currency = currency;
        this.accountNumber = accountNumber;
        this.accountHolderType = type;
        this.accountHolderName = str;
        this.routingNumber = str2;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("country", this.country);
        pairArr[1] = TuplesKt.to("currency", this.currency);
        pairArr[2] = TuplesKt.to("account_holder_name", this.accountHolderName);
        Type type = this.accountHolderType;
        pairArr[3] = TuplesKt.to("account_holder_type", type != null ? type.getCode() : null);
        pairArr[4] = TuplesKt.to("routing_number", this.routingNumber);
        pairArr[5] = TuplesKt.to(PARAM_ACCOUNT_NUMBER, this.accountNumber);
        List<Pair> listListOf = CollectionsKt.listOf((Object[]) pairArr);
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

    /* compiled from: BankAccountTokenParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Companion;", "", "<init>", "()V", "PARAM_COUNTRY", "", "PARAM_CURRENCY", "PARAM_ACCOUNT_HOLDER_NAME", "PARAM_ACCOUNT_HOLDER_TYPE", "PARAM_ROUTING_NUMBER", "PARAM_ACCOUNT_NUMBER", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
