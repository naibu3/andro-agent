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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Landroid/os/Parcelable;", "name", "", "email", "phone", "address", "Lcom/stripe/android/shoppay/bridge/ECEFullAddress;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEFullAddress;)V", "getName", "()Ljava/lang/String;", "getEmail", "getPhone", "getAddress", "()Lcom/stripe/android/shoppay/bridge/ECEFullAddress;", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ECEBillingDetails implements JsonSerializer, Parcelable {
    public static final int $stable = 0;
    private static final String FIELD_ADDRESS = "address";
    private static final String FIELD_EMAIL = "email";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_PHONE = "phone";
    private final ECEFullAddress address;
    private final String email;
    private final String name;
    private final String phone;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ECEBillingDetails> CREATOR = new Creator();

    /* compiled from: ECETypes.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ECEBillingDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEBillingDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ECEBillingDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ECEFullAddress.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEBillingDetails[] newArray(int i) {
            return new ECEBillingDetails[i];
        }
    }

    public static /* synthetic */ ECEBillingDetails copy$default(ECEBillingDetails eCEBillingDetails, String str, String str2, String str3, ECEFullAddress eCEFullAddress, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eCEBillingDetails.name;
        }
        if ((i & 2) != 0) {
            str2 = eCEBillingDetails.email;
        }
        if ((i & 4) != 0) {
            str3 = eCEBillingDetails.phone;
        }
        if ((i & 8) != 0) {
            eCEFullAddress = eCEBillingDetails.address;
        }
        return eCEBillingDetails.copy(str, str2, str3, eCEFullAddress);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component4, reason: from getter */
    public final ECEFullAddress getAddress() {
        return this.address;
    }

    public final ECEBillingDetails copy(String name, String email, String phone, ECEFullAddress address) {
        return new ECEBillingDetails(name, email, phone, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ECEBillingDetails)) {
            return false;
        }
        ECEBillingDetails eCEBillingDetails = (ECEBillingDetails) other;
        return Intrinsics.areEqual(this.name, eCEBillingDetails.name) && Intrinsics.areEqual(this.email, eCEBillingDetails.email) && Intrinsics.areEqual(this.phone, eCEBillingDetails.phone) && Intrinsics.areEqual(this.address, eCEBillingDetails.address);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ECEFullAddress eCEFullAddress = this.address;
        return iHashCode3 + (eCEFullAddress != null ? eCEFullAddress.hashCode() : 0);
    }

    public String toString() {
        return "ECEBillingDetails(name=" + this.name + ", email=" + this.email + ", phone=" + this.phone + ", address=" + this.address + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.phone);
        ECEFullAddress eCEFullAddress = this.address;
        if (eCEFullAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eCEFullAddress.writeToParcel(dest, flags);
        }
    }

    public ECEBillingDetails(String str, String str2, String str3, ECEFullAddress eCEFullAddress) {
        this.name = str;
        this.email = str2;
        this.phone = str3;
        this.address = eCEFullAddress;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone() {
        return this.phone;
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
        String str2 = this.email;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.phone;
        if (str3 != null) {
            jSONObject.put("phone", str3);
        }
        ECEFullAddress eCEFullAddress = this.address;
        if (eCEFullAddress != null) {
            jSONObject.put("address", eCEFullAddress.toJson());
        }
        return jSONObject;
    }

    /* compiled from: ECETypes.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEBillingDetails$Companion;", "", "<init>", "()V", "FIELD_NAME", "", "FIELD_EMAIL", "FIELD_PHONE", "FIELD_ADDRESS", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
