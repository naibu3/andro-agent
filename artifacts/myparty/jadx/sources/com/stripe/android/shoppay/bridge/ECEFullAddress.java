package com.stripe.android.shoppay.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ECETypes.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0004HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006*"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEFullAddress;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Landroid/os/Parcelable;", ECEFullAddress.FIELD_LINE1, "", ECEFullAddress.FIELD_LINE2, ECEFullAddress.FIELD_CITY, "state", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLine1", "()Ljava/lang/String;", "getLine2", "getCity", "getState", "getPostalCode", "getCountry", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ECEFullAddress implements JsonSerializer, Parcelable {
    private static final String FIELD_CITY = "city";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_LINE1 = "line1";
    private static final String FIELD_LINE2 = "line2";
    private static final String FIELD_POSTAL_CODE = "postal_code";
    private static final String FIELD_STATE = "state";
    private final String city;
    private final String country;
    private final String line1;
    private final String line2;
    private final String postalCode;
    private final String state;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ECEFullAddress> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ECETypes.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ECEFullAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEFullAddress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ECEFullAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEFullAddress[] newArray(int i) {
            return new ECEFullAddress[i];
        }
    }

    public static /* synthetic */ ECEFullAddress copy$default(ECEFullAddress eCEFullAddress, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eCEFullAddress.line1;
        }
        if ((i & 2) != 0) {
            str2 = eCEFullAddress.line2;
        }
        if ((i & 4) != 0) {
            str3 = eCEFullAddress.city;
        }
        if ((i & 8) != 0) {
            str4 = eCEFullAddress.state;
        }
        if ((i & 16) != 0) {
            str5 = eCEFullAddress.postalCode;
        }
        if ((i & 32) != 0) {
            str6 = eCEFullAddress.country;
        }
        String str7 = str5;
        String str8 = str6;
        return eCEFullAddress.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLine1() {
        return this.line1;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLine2() {
        return this.line2;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final ECEFullAddress copy(String line1, String line2, String city, String state, String postalCode, String country) {
        return new ECEFullAddress(line1, line2, city, state, postalCode, country);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ECEFullAddress)) {
            return false;
        }
        ECEFullAddress eCEFullAddress = (ECEFullAddress) other;
        return Intrinsics.areEqual(this.line1, eCEFullAddress.line1) && Intrinsics.areEqual(this.line2, eCEFullAddress.line2) && Intrinsics.areEqual(this.city, eCEFullAddress.city) && Intrinsics.areEqual(this.state, eCEFullAddress.state) && Intrinsics.areEqual(this.postalCode, eCEFullAddress.postalCode) && Intrinsics.areEqual(this.country, eCEFullAddress.country);
    }

    public int hashCode() {
        String str = this.line1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.line2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.country;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "ECEFullAddress(line1=" + this.line1 + ", line2=" + this.line2 + ", city=" + this.city + ", state=" + this.state + ", postalCode=" + this.postalCode + ", country=" + this.country + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.line1);
        dest.writeString(this.line2);
        dest.writeString(this.city);
        dest.writeString(this.state);
        dest.writeString(this.postalCode);
        dest.writeString(this.country);
    }

    public ECEFullAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        this.line1 = str;
        this.line2 = str2;
        this.city = str3;
        this.state = str4;
        this.postalCode = str5;
        this.country = str6;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getLine2() {
        return this.line2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getState() {
        return this.state;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getCountry() {
        return this.country;
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.line1;
        if (str != null) {
            jSONObject.put(FIELD_LINE1, str);
        }
        String str2 = this.line2;
        if (str2 != null) {
            jSONObject.put(FIELD_LINE2, str2);
        }
        String str3 = this.city;
        if (str3 != null) {
            jSONObject.put(FIELD_CITY, str3);
        }
        String str4 = this.state;
        if (str4 != null) {
            jSONObject.put("state", str4);
        }
        String str5 = this.postalCode;
        if (str5 != null) {
            jSONObject.put(FIELD_POSTAL_CODE, str5);
        }
        String str6 = this.country;
        if (str6 != null) {
            jSONObject.put("country", str6);
        }
        return jSONObject;
    }

    /* compiled from: ECETypes.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEFullAddress$Companion;", "", "<init>", "()V", "FIELD_LINE1", "", "FIELD_LINE2", "FIELD_CITY", "FIELD_STATE", "FIELD_POSTAL_CODE", "FIELD_COUNTRY", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
