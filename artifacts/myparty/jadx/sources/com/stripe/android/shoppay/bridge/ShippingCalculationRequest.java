package com.stripe.android.shoppay.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShippingCalculationRequest.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;", "Lcom/stripe/android/core/model/StripeModel;", "shippingAddress", "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;", "<init>", "(Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;)V", "getShippingAddress", "()Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "ShippingAddress", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ShippingCalculationRequest implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ShippingCalculationRequest> CREATOR = new Creator();
    private final ShippingAddress shippingAddress;

    /* compiled from: ShippingCalculationRequest.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShippingCalculationRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingCalculationRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShippingCalculationRequest(ShippingAddress.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingCalculationRequest[] newArray(int i) {
            return new ShippingCalculationRequest[i];
        }
    }

    public static /* synthetic */ ShippingCalculationRequest copy$default(ShippingCalculationRequest shippingCalculationRequest, ShippingAddress shippingAddress, int i, Object obj) {
        if ((i & 1) != 0) {
            shippingAddress = shippingCalculationRequest.shippingAddress;
        }
        return shippingCalculationRequest.copy(shippingAddress);
    }

    /* renamed from: component1, reason: from getter */
    public final ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public final ShippingCalculationRequest copy(ShippingAddress shippingAddress) {
        Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
        return new ShippingCalculationRequest(shippingAddress);
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
        return (other instanceof ShippingCalculationRequest) && Intrinsics.areEqual(this.shippingAddress, ((ShippingCalculationRequest) other).shippingAddress);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.shippingAddress.hashCode();
    }

    public String toString() {
        return "ShippingCalculationRequest(shippingAddress=" + this.shippingAddress + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.shippingAddress.writeToParcel(dest, flags);
    }

    public ShippingCalculationRequest(ShippingAddress shippingAddress) {
        Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
        this.shippingAddress = shippingAddress;
    }

    public final ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /* compiled from: ShippingCalculationRequest.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;", "Landroid/os/Parcelable;", "name", "", "address", "Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;)V", "getName", "()Ljava/lang/String;", "getAddress", "()Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShippingAddress implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ShippingAddress> CREATOR = new Creator();
        private final ECEPartialAddress address;
        private final String name;

        /* compiled from: ShippingCalculationRequest.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShippingAddress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingAddress createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShippingAddress(parcel.readString(), ECEPartialAddress.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingAddress[] newArray(int i) {
                return new ShippingAddress[i];
            }
        }

        public static /* synthetic */ ShippingAddress copy$default(ShippingAddress shippingAddress, String str, ECEPartialAddress eCEPartialAddress, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shippingAddress.name;
            }
            if ((i & 2) != 0) {
                eCEPartialAddress = shippingAddress.address;
            }
            return shippingAddress.copy(str, eCEPartialAddress);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final ECEPartialAddress getAddress() {
            return this.address;
        }

        public final ShippingAddress copy(String name, ECEPartialAddress address) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new ShippingAddress(name, address);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShippingAddress)) {
                return false;
            }
            ShippingAddress shippingAddress = (ShippingAddress) other;
            return Intrinsics.areEqual(this.name, shippingAddress.name) && Intrinsics.areEqual(this.address, shippingAddress.address);
        }

        public int hashCode() {
            String str = this.name;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.address.hashCode();
        }

        public String toString() {
            return "ShippingAddress(name=" + this.name + ", address=" + this.address + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            this.address.writeToParcel(dest, flags);
        }

        public ShippingAddress(String str, ECEPartialAddress address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.name = str;
            this.address = address;
        }

        public final String getName() {
            return this.name;
        }

        public final ECEPartialAddress getAddress() {
            return this.address;
        }
    }
}
