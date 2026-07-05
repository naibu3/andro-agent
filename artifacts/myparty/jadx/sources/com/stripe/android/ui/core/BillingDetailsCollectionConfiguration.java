package com.stripe.android.ui.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingDetailsCollectionConfiguration.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration;", "Landroid/os/Parcelable;", "collectName", "", "collectEmail", "collectPhone", "address", "Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;", "<init>", "(ZZZLcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;)V", "getCollectName", "()Z", "getCollectEmail", "getCollectPhone", "getAddress", "()Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "AddressCollectionMode", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BillingDetailsCollectionConfiguration implements Parcelable {
    private final AddressCollectionMode address;
    private final boolean collectEmail;
    private final boolean collectName;
    private final boolean collectPhone;
    public static final Parcelable.Creator<BillingDetailsCollectionConfiguration> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BillingDetailsCollectionConfiguration.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BillingDetailsCollectionConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillingDetailsCollectionConfiguration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillingDetailsCollectionConfiguration(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, AddressCollectionMode.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillingDetailsCollectionConfiguration[] newArray(int i) {
            return new BillingDetailsCollectionConfiguration[i];
        }
    }

    public BillingDetailsCollectionConfiguration() {
        this(false, false, false, null, 15, null);
    }

    public static /* synthetic */ BillingDetailsCollectionConfiguration copy$default(BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z, boolean z2, boolean z3, AddressCollectionMode addressCollectionMode, int i, Object obj) {
        if ((i & 1) != 0) {
            z = billingDetailsCollectionConfiguration.collectName;
        }
        if ((i & 2) != 0) {
            z2 = billingDetailsCollectionConfiguration.collectEmail;
        }
        if ((i & 4) != 0) {
            z3 = billingDetailsCollectionConfiguration.collectPhone;
        }
        if ((i & 8) != 0) {
            addressCollectionMode = billingDetailsCollectionConfiguration.address;
        }
        return billingDetailsCollectionConfiguration.copy(z, z2, z3, addressCollectionMode);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCollectName() {
        return this.collectName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCollectEmail() {
        return this.collectEmail;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCollectPhone() {
        return this.collectPhone;
    }

    /* renamed from: component4, reason: from getter */
    public final AddressCollectionMode getAddress() {
        return this.address;
    }

    public final BillingDetailsCollectionConfiguration copy(boolean collectName, boolean collectEmail, boolean collectPhone, AddressCollectionMode address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return new BillingDetailsCollectionConfiguration(collectName, collectEmail, collectPhone, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingDetailsCollectionConfiguration)) {
            return false;
        }
        BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = (BillingDetailsCollectionConfiguration) other;
        return this.collectName == billingDetailsCollectionConfiguration.collectName && this.collectEmail == billingDetailsCollectionConfiguration.collectEmail && this.collectPhone == billingDetailsCollectionConfiguration.collectPhone && this.address == billingDetailsCollectionConfiguration.address;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.collectName) * 31) + Boolean.hashCode(this.collectEmail)) * 31) + Boolean.hashCode(this.collectPhone)) * 31) + this.address.hashCode();
    }

    public String toString() {
        return "BillingDetailsCollectionConfiguration(collectName=" + this.collectName + ", collectEmail=" + this.collectEmail + ", collectPhone=" + this.collectPhone + ", address=" + this.address + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.collectName ? 1 : 0);
        dest.writeInt(this.collectEmail ? 1 : 0);
        dest.writeInt(this.collectPhone ? 1 : 0);
        dest.writeString(this.address.name());
    }

    public BillingDetailsCollectionConfiguration(boolean z, boolean z2, boolean z3, AddressCollectionMode address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.collectName = z;
        this.collectEmail = z2;
        this.collectPhone = z3;
        this.address = address;
    }

    public final boolean getCollectName() {
        return this.collectName;
    }

    public final boolean getCollectEmail() {
        return this.collectEmail;
    }

    public final boolean getCollectPhone() {
        return this.collectPhone;
    }

    public /* synthetic */ BillingDetailsCollectionConfiguration(boolean z, boolean z2, boolean z3, AddressCollectionMode addressCollectionMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? AddressCollectionMode.Automatic : addressCollectionMode);
    }

    public final AddressCollectionMode getAddress() {
        return this.address;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BillingDetailsCollectionConfiguration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "Automatic", "Never", "Full", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddressCollectionMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AddressCollectionMode[] $VALUES;
        public static final AddressCollectionMode Automatic = new AddressCollectionMode("Automatic", 0);
        public static final AddressCollectionMode Never = new AddressCollectionMode("Never", 1);
        public static final AddressCollectionMode Full = new AddressCollectionMode("Full", 2);

        private static final /* synthetic */ AddressCollectionMode[] $values() {
            return new AddressCollectionMode[]{Automatic, Never, Full};
        }

        public static EnumEntries<AddressCollectionMode> getEntries() {
            return $ENTRIES;
        }

        private AddressCollectionMode(String str, int i) {
        }

        static {
            AddressCollectionMode[] addressCollectionModeArr$values = $values();
            $VALUES = addressCollectionModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(addressCollectionModeArr$values);
        }

        public static AddressCollectionMode valueOf(String str) {
            return (AddressCollectionMode) Enum.valueOf(AddressCollectionMode.class, str);
        }

        public static AddressCollectionMode[] values() {
            return (AddressCollectionMode[]) $VALUES.clone();
        }
    }
}
