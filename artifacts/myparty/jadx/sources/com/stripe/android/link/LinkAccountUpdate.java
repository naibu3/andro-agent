package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.link.model.LinkAccount;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkActivityResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/LinkAccountUpdate;", "Landroid/os/Parcelable;", "Value", "None", "Lcom/stripe/android/link/LinkAccountUpdate$None;", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkAccountUpdate extends Parcelable {

    /* compiled from: LinkActivityResult.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/link/LinkAccountUpdate$Value;", "Lcom/stripe/android/link/LinkAccountUpdate;", "account", "Lcom/stripe/android/link/model/LinkAccount;", "lastUpdateReason", "Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;", "<init>", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V", "getAccount", "()Lcom/stripe/android/link/model/LinkAccount;", "getLastUpdateReason", "()Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "UpdateReason", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Value implements LinkAccountUpdate {
        private final LinkAccount account;
        private final UpdateReason lastUpdateReason;
        public static final Parcelable.Creator<Value> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Value createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Value(parcel.readInt() == 0 ? null : LinkAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UpdateReason.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Value[] newArray(int i) {
                return new Value[i];
            }
        }

        public static /* synthetic */ Value copy$default(Value value, LinkAccount linkAccount, UpdateReason updateReason, int i, Object obj) {
            if ((i & 1) != 0) {
                linkAccount = value.account;
            }
            if ((i & 2) != 0) {
                updateReason = value.lastUpdateReason;
            }
            return value.copy(linkAccount, updateReason);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkAccount getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final UpdateReason getLastUpdateReason() {
            return this.lastUpdateReason;
        }

        public final Value copy(LinkAccount account, UpdateReason lastUpdateReason) {
            return new Value(account, lastUpdateReason);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return Intrinsics.areEqual(this.account, value.account) && this.lastUpdateReason == value.lastUpdateReason;
        }

        public int hashCode() {
            LinkAccount linkAccount = this.account;
            int iHashCode = (linkAccount == null ? 0 : linkAccount.hashCode()) * 31;
            UpdateReason updateReason = this.lastUpdateReason;
            return iHashCode + (updateReason != null ? updateReason.hashCode() : 0);
        }

        public String toString() {
            return "Value(account=" + this.account + ", lastUpdateReason=" + this.lastUpdateReason + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            LinkAccount linkAccount = this.account;
            if (linkAccount == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                linkAccount.writeToParcel(dest, flags);
            }
            UpdateReason updateReason = this.lastUpdateReason;
            if (updateReason == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(updateReason.name());
            }
        }

        public Value(LinkAccount linkAccount, UpdateReason updateReason) {
            this.account = linkAccount;
            this.lastUpdateReason = updateReason;
        }

        public /* synthetic */ Value(LinkAccount linkAccount, UpdateReason updateReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(linkAccount, (i & 2) != 0 ? null : updateReason);
        }

        public final LinkAccount getAccount() {
            return this.account;
        }

        public final UpdateReason getLastUpdateReason() {
            return this.lastUpdateReason;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LinkActivityResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;", "", "<init>", "(Ljava/lang/String;I)V", "LoggedOut", "PaymentConfirmed", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class UpdateReason {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ UpdateReason[] $VALUES;
            public static final UpdateReason LoggedOut = new UpdateReason("LoggedOut", 0);
            public static final UpdateReason PaymentConfirmed = new UpdateReason("PaymentConfirmed", 1);

            private static final /* synthetic */ UpdateReason[] $values() {
                return new UpdateReason[]{LoggedOut, PaymentConfirmed};
            }

            public static EnumEntries<UpdateReason> getEntries() {
                return $ENTRIES;
            }

            private UpdateReason(String str, int i) {
            }

            static {
                UpdateReason[] updateReasonArr$values = $values();
                $VALUES = updateReasonArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(updateReasonArr$values);
            }

            public static UpdateReason valueOf(String str) {
                return (UpdateReason) Enum.valueOf(UpdateReason.class, str);
            }

            public static UpdateReason[] values() {
                return (UpdateReason[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: LinkActivityResult.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/LinkAccountUpdate$None;", "Lcom/stripe/android/link/LinkAccountUpdate;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None implements LinkAccountUpdate {
        public static final None INSTANCE = new None();
        public static final Parcelable.Creator<None> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof None)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -56225397;
        }

        public String toString() {
            return "None";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private None() {
        }
    }
}
