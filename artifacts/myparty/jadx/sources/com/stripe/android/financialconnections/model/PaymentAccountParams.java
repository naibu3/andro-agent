package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentAccountParams.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "Landroid/os/Parcelable;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "toParamMap", "", "LinkedAccount", "BankAccount", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams$BankAccount;", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams$LinkedAccount;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PaymentAccountParams implements Parcelable {
    public static final int $stable = 0;
    private final String type;

    public /* synthetic */ PaymentAccountParams(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public abstract Map<String, String> toParamMap();

    private PaymentAccountParams(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: PaymentAccountParams.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/financialconnections/model/PaymentAccountParams$LinkedAccount;", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "toParamMap", "", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkedAccount extends PaymentAccountParams {
        private final String id;
        public static final Parcelable.Creator<LinkedAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentAccountParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LinkedAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkedAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccount(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkedAccount[] newArray(int i) {
                return new LinkedAccount[i];
            }
        }

        public static /* synthetic */ LinkedAccount copy$default(LinkedAccount linkedAccount, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linkedAccount.id;
            }
            return linkedAccount.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final LinkedAccount copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new LinkedAccount(id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LinkedAccount) && Intrinsics.areEqual(this.id, ((LinkedAccount) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "LinkedAccount(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
        }

        public final String getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkedAccount(String id) {
            super(FinancialConnectionsAccount.OBJECT_OLD, null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        @Override // com.stripe.android.financialconnections.model.PaymentAccountParams
        public Map<String, String> toParamMap() {
            return MapsKt.mapOf(TuplesKt.to("type", getType()), TuplesKt.to(getType() + "[id]", this.id));
        }
    }

    /* compiled from: PaymentAccountParams.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/financialconnections/model/PaymentAccountParams$BankAccount;", "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;", "routingNumber", "", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoutingNumber", "()Ljava/lang/String;", "getAccountNumber", "toParamMap", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BankAccount extends PaymentAccountParams {
        private final String accountNumber;
        private final String routingNumber;
        public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentAccountParams.kt */
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
                str = bankAccount.routingNumber;
            }
            if ((i & 2) != 0) {
                str2 = bankAccount.accountNumber;
            }
            return bankAccount.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BankAccount copy(String routingNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new BankAccount(routingNumber, accountNumber);
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
            return Intrinsics.areEqual(this.routingNumber, bankAccount.routingNumber) && Intrinsics.areEqual(this.accountNumber, bankAccount.accountNumber);
        }

        public int hashCode() {
            return (this.routingNumber.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "BankAccount(routingNumber=" + this.routingNumber + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.routingNumber);
            dest.writeString(this.accountNumber);
        }

        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankAccount(String routingNumber, String accountNumber) {
            super("bank_account", null);
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.routingNumber = routingNumber;
            this.accountNumber = accountNumber;
        }

        @Override // com.stripe.android.financialconnections.model.PaymentAccountParams
        public Map<String, String> toParamMap() {
            return MapsKt.mapOf(TuplesKt.to("type", getType()), TuplesKt.to(getType() + "[routing_number]", this.routingNumber), TuplesKt.to(getType() + "[account_number]", this.accountNumber));
        }
    }
}
