package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.ConsumerPaymentDetails;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsumerShippingAddresses.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\""}, d2 = {"Lcom/stripe/android/model/ConsumerShippingAddress;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "isDefault", "", "address", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "unredactedPhoneNumber", "<init>", "(Ljava/lang/String;ZLcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getAddress", "()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "getUnredactedPhoneNumber", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConsumerShippingAddress implements StripeModel {
    public static final Parcelable.Creator<ConsumerShippingAddress> CREATOR = new Creator();
    private final ConsumerPaymentDetails.BillingAddress address;
    private final String id;
    private final boolean isDefault;
    private final String unredactedPhoneNumber;

    /* compiled from: ConsumerShippingAddresses.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsumerShippingAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerShippingAddress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsumerShippingAddress(parcel.readString(), parcel.readInt() != 0, ConsumerPaymentDetails.BillingAddress.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerShippingAddress[] newArray(int i) {
            return new ConsumerShippingAddress[i];
        }
    }

    public static /* synthetic */ ConsumerShippingAddress copy$default(ConsumerShippingAddress consumerShippingAddress, String str, boolean z, ConsumerPaymentDetails.BillingAddress billingAddress, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consumerShippingAddress.id;
        }
        if ((i & 2) != 0) {
            z = consumerShippingAddress.isDefault;
        }
        if ((i & 4) != 0) {
            billingAddress = consumerShippingAddress.address;
        }
        if ((i & 8) != 0) {
            str2 = consumerShippingAddress.unredactedPhoneNumber;
        }
        return consumerShippingAddress.copy(str, z, billingAddress, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component3, reason: from getter */
    public final ConsumerPaymentDetails.BillingAddress getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUnredactedPhoneNumber() {
        return this.unredactedPhoneNumber;
    }

    public final ConsumerShippingAddress copy(String id, boolean isDefault, ConsumerPaymentDetails.BillingAddress address, String unredactedPhoneNumber) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        return new ConsumerShippingAddress(id, isDefault, address, unredactedPhoneNumber);
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
        if (!(other instanceof ConsumerShippingAddress)) {
            return false;
        }
        ConsumerShippingAddress consumerShippingAddress = (ConsumerShippingAddress) other;
        return Intrinsics.areEqual(this.id, consumerShippingAddress.id) && this.isDefault == consumerShippingAddress.isDefault && Intrinsics.areEqual(this.address, consumerShippingAddress.address) && Intrinsics.areEqual(this.unredactedPhoneNumber, consumerShippingAddress.unredactedPhoneNumber);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + Boolean.hashCode(this.isDefault)) * 31) + this.address.hashCode()) * 31;
        String str = this.unredactedPhoneNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ConsumerShippingAddress(id=" + this.id + ", isDefault=" + this.isDefault + ", address=" + this.address + ", unredactedPhoneNumber=" + this.unredactedPhoneNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.isDefault ? 1 : 0);
        this.address.writeToParcel(dest, flags);
        dest.writeString(this.unredactedPhoneNumber);
    }

    public ConsumerShippingAddress(String id, boolean z, ConsumerPaymentDetails.BillingAddress address, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        this.id = id;
        this.isDefault = z;
        this.address = address;
        this.unredactedPhoneNumber = str;
    }

    public /* synthetic */ ConsumerShippingAddress(String str, boolean z, ConsumerPaymentDetails.BillingAddress billingAddress, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, billingAddress, (i & 8) != 0 ? null : str2);
    }

    public final String getId() {
        return this.id;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final ConsumerPaymentDetails.BillingAddress getAddress() {
        return this.address;
    }

    public final String getUnredactedPhoneNumber() {
        return this.unredactedPhoneNumber;
    }
}
