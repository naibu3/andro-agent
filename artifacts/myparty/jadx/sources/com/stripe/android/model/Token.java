package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.TokenJsonParser;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Token.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000234BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003JS\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020\u0004HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00065"}, d2 = {"Lcom/stripe/android/model/Token;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "id", "", "type", "Lcom/stripe/android/model/Token$Type;", "created", "Ljava/util/Date;", TokenJsonParser.FIELD_LIVEMODE, "", TokenJsonParser.FIELD_USED, "bankAccount", "Lcom/stripe/android/model/BankAccount;", "card", "Lcom/stripe/android/model/Card;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Ljava/util/Date;ZZLcom/stripe/android/model/BankAccount;Lcom/stripe/android/model/Card;)V", "getId", "()Ljava/lang/String;", "getType", "()Lcom/stripe/android/model/Token$Type;", "getCreated", "()Ljava/util/Date;", "getLivemode", "()Z", "getUsed", "getBankAccount", "()Lcom/stripe/android/model/BankAccount;", "getCard", "()Lcom/stripe/android/model/Card;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Type", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Token implements StripeModel, StripePaymentSource {
    private final BankAccount bankAccount;
    private final Card card;
    private final Date created;
    private final String id;
    private final boolean livemode;
    private final Type type;
    private final boolean used;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Token> CREATOR = new Creator();

    /* compiled from: Token.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Token> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Token createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Type typeValueOf = Type.valueOf(parcel.readString());
            Date date = (Date) parcel.readSerializable();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new Token(string, typeValueOf, date, z2, parcel.readInt() != 0 ? z : false, parcel.readInt() == 0 ? null : BankAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Card.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Token[] newArray(int i) {
            return new Token[i];
        }
    }

    public static /* synthetic */ Token copy$default(Token token, String str, Type type, Date date, boolean z, boolean z2, BankAccount bankAccount, Card card, int i, Object obj) {
        if ((i & 1) != 0) {
            str = token.id;
        }
        if ((i & 2) != 0) {
            type = token.type;
        }
        if ((i & 4) != 0) {
            date = token.created;
        }
        if ((i & 8) != 0) {
            z = token.livemode;
        }
        if ((i & 16) != 0) {
            z2 = token.used;
        }
        if ((i & 32) != 0) {
            bankAccount = token.bankAccount;
        }
        if ((i & 64) != 0) {
            card = token.card;
        }
        BankAccount bankAccount2 = bankAccount;
        Card card2 = card;
        boolean z3 = z2;
        Date date2 = date;
        return token.copy(str, type, date2, z, z3, bankAccount2, card2);
    }

    @JvmStatic
    public static final Token fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getCreated() {
        return this.created;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLivemode() {
        return this.livemode;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUsed() {
        return this.used;
    }

    /* renamed from: component6, reason: from getter */
    public final BankAccount getBankAccount() {
        return this.bankAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    public final Token copy(String id, Type type, Date created, boolean livemode, boolean used, BankAccount bankAccount, Card card) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(created, "created");
        return new Token(id, type, created, livemode, used, bankAccount, card);
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
        if (!(other instanceof Token)) {
            return false;
        }
        Token token = (Token) other;
        return Intrinsics.areEqual(this.id, token.id) && this.type == token.type && Intrinsics.areEqual(this.created, token.created) && this.livemode == token.livemode && this.used == token.used && Intrinsics.areEqual(this.bankAccount, token.bankAccount) && Intrinsics.areEqual(this.card, token.card);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.created.hashCode()) * 31) + Boolean.hashCode(this.livemode)) * 31) + Boolean.hashCode(this.used)) * 31;
        BankAccount bankAccount = this.bankAccount;
        int iHashCode2 = (iHashCode + (bankAccount == null ? 0 : bankAccount.hashCode())) * 31;
        Card card = this.card;
        return iHashCode2 + (card != null ? card.hashCode() : 0);
    }

    public String toString() {
        return "Token(id=" + this.id + ", type=" + this.type + ", created=" + this.created + ", livemode=" + this.livemode + ", used=" + this.used + ", bankAccount=" + this.bankAccount + ", card=" + this.card + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type.name());
        dest.writeSerializable(this.created);
        dest.writeInt(this.livemode ? 1 : 0);
        dest.writeInt(this.used ? 1 : 0);
        BankAccount bankAccount = this.bankAccount;
        if (bankAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bankAccount.writeToParcel(dest, flags);
        }
        Card card = this.card;
        if (card == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            card.writeToParcel(dest, flags);
        }
    }

    public Token(String id, Type type, Date created, boolean z, boolean z2, BankAccount bankAccount, Card card) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(created, "created");
        this.id = id;
        this.type = type;
        this.created = created;
        this.livemode = z;
        this.used = z2;
        this.bankAccount = bankAccount;
        this.card = card;
    }

    public /* synthetic */ Token(String str, Type type, Date date, boolean z, boolean z2, BankAccount bankAccount, Card card, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, date, z, z2, (i & 32) != 0 ? null : bankAccount, (i & 64) != 0 ? null : card);
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.id;
    }

    public final Type getType() {
        return this.type;
    }

    public final Date getCreated() {
        return this.created;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final boolean getUsed() {
        return this.used;
    }

    public final BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public final Card getCard() {
        return this.card;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Token.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/Token$Type;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Card", "BankAccount", "Pii", "Account", "CvcUpdate", "Person", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final Type Card = new Type("Card", 0, "card");
        public static final Type BankAccount = new Type("BankAccount", 1, "bank_account");
        public static final Type Pii = new Type("Pii", 2, "pii");
        public static final Type Account = new Type("Account", 3, "account");
        public static final Type CvcUpdate = new Type("CvcUpdate", 4, "cvc_update");
        public static final Type Person = new Type("Person", 5, "person");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Card, BankAccount, Pii, Account, CvcUpdate, Person};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/Token$Type$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/Token$Type;", "code", "", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Type fromCode(String code) {
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

    /* compiled from: Token.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/Token$Companion;", "", "<init>", "()V", "fromJson", "Lcom/stripe/android/model/Token;", "jsonObject", "Lorg/json/JSONObject;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Token fromJson(JSONObject jsonObject) {
            if (jsonObject != null) {
                return new TokenJsonParser().parse(jsonObject);
            }
            return null;
        }
    }
}
