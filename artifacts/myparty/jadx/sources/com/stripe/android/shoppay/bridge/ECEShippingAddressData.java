package com.stripe.android.shoppay.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ECETypes.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Landroid/os/Parcelable;", "name", "", "address", "Lcom/stripe/android/shoppay/bridge/ECEFullAddress;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEFullAddress;)V", "getName", "()Ljava/lang/String;", "getAddress", "()Lcom/stripe/android/shoppay/bridge/ECEFullAddress;", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ECEShippingAddressData implements JsonSerializer, Parcelable {
    public static final int $stable = 0;
    private static final String FIELD_ADDRESS = "address";
    private static final String FIELD_NAME = "name";
    private final ECEFullAddress address;
    private final String name;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ECEShippingAddressData> CREATOR = new Creator();

    /* compiled from: ECETypes.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ECEShippingAddressData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEShippingAddressData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ECEShippingAddressData(parcel.readString(), parcel.readInt() == 0 ? null : ECEFullAddress.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEShippingAddressData[] newArray(int i) {
            return new ECEShippingAddressData[i];
        }
    }

    public static /* synthetic */ ECEShippingAddressData copy$default(ECEShippingAddressData eCEShippingAddressData, String str, ECEFullAddress eCEFullAddress, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eCEShippingAddressData.name;
        }
        if ((i & 2) != 0) {
            eCEFullAddress = eCEShippingAddressData.address;
        }
        return eCEShippingAddressData.copy(str, eCEFullAddress);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final ECEFullAddress getAddress() {
        return this.address;
    }

    public final ECEShippingAddressData copy(String name, ECEFullAddress address) {
        return new ECEShippingAddressData(name, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ECEShippingAddressData)) {
            return false;
        }
        ECEShippingAddressData eCEShippingAddressData = (ECEShippingAddressData) other;
        return Intrinsics.areEqual(this.name, eCEShippingAddressData.name) && Intrinsics.areEqual(this.address, eCEShippingAddressData.address);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECEFullAddress eCEFullAddress = this.address;
        return iHashCode + (eCEFullAddress != null ? eCEFullAddress.hashCode() : 0);
    }

    public String toString() {
        return "ECEShippingAddressData(name=" + this.name + ", address=" + this.address + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        ECEFullAddress eCEFullAddress = this.address;
        if (eCEFullAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eCEFullAddress.writeToParcel(dest, flags);
        }
    }

    public ECEShippingAddressData(String str, ECEFullAddress eCEFullAddress) {
        this.name = str;
        this.address = eCEFullAddress;
    }

    public final String getName() {
        return this.name;
    }

    public final ECEFullAddress getAddress() {
        return this.address;
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.name;
        if (str != null) {
            jSONObject.put("name", str);
        }
        ECEFullAddress eCEFullAddress = this.address;
        if (eCEFullAddress != null) {
            jSONObject.put("address", eCEFullAddress.toJson());
        }
        return jSONObject;
    }

    /* compiled from: ECETypes.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData$Companion;", "", "<init>", "()V", "FIELD_NAME", "", "FIELD_ADDRESS", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
