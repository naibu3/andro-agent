package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.parsers.TokenJsonParser;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GooglePayResult.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-BQ\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÀ\u0001¢\u0006\u0002\b\u001fJ\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lcom/stripe/android/model/GooglePayResult;", "Landroid/os/Parcelable;", "token", "Lcom/stripe/android/model/Token;", "address", "Lcom/stripe/android/model/Address;", "name", "", "email", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "<init>", "(Lcom/stripe/android/model/Token;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;)V", "getToken", "()Lcom/stripe/android/model/Token;", "getAddress", "()Lcom/stripe/android/model/Address;", "getName", "()Ljava/lang/String;", "getEmail", "getPhoneNumber", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GooglePayResult implements Parcelable {
    private final Address address;
    private final String email;
    private final String name;
    private final String phoneNumber;
    private final ShippingInformation shippingInformation;
    private final Token token;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<GooglePayResult> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: GooglePayResult.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GooglePayResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayResult((Token) parcel.readParcelable(GooglePayResult.class.getClassLoader()), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayResult[] newArray(int i) {
            return new GooglePayResult[i];
        }
    }

    public GooglePayResult() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ GooglePayResult copy$payments_core_release$default(GooglePayResult googlePayResult, Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation, int i, Object obj) {
        if ((i & 1) != 0) {
            token = googlePayResult.token;
        }
        if ((i & 2) != 0) {
            address = googlePayResult.address;
        }
        if ((i & 4) != 0) {
            str = googlePayResult.name;
        }
        if ((i & 8) != 0) {
            str2 = googlePayResult.email;
        }
        if ((i & 16) != 0) {
            str3 = googlePayResult.phoneNumber;
        }
        if ((i & 32) != 0) {
            shippingInformation = googlePayResult.shippingInformation;
        }
        String str4 = str3;
        ShippingInformation shippingInformation2 = shippingInformation;
        return googlePayResult.copy$payments_core_release(token, address, str, str2, str4, shippingInformation2);
    }

    @JvmStatic
    public static final GooglePayResult fromJson(JSONObject jSONObject) throws JSONException {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final Token getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final GooglePayResult copy$payments_core_release(Token token, Address address, String name, String email, String phoneNumber, ShippingInformation shippingInformation) {
        return new GooglePayResult(token, address, name, email, phoneNumber, shippingInformation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayResult)) {
            return false;
        }
        GooglePayResult googlePayResult = (GooglePayResult) other;
        return Intrinsics.areEqual(this.token, googlePayResult.token) && Intrinsics.areEqual(this.address, googlePayResult.address) && Intrinsics.areEqual(this.name, googlePayResult.name) && Intrinsics.areEqual(this.email, googlePayResult.email) && Intrinsics.areEqual(this.phoneNumber, googlePayResult.phoneNumber) && Intrinsics.areEqual(this.shippingInformation, googlePayResult.shippingInformation);
    }

    public int hashCode() {
        Token token = this.token;
        int iHashCode = (token == null ? 0 : token.hashCode()) * 31;
        Address address = this.address;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        return iHashCode5 + (shippingInformation != null ? shippingInformation.hashCode() : 0);
    }

    public String toString() {
        return "GooglePayResult(token=" + this.token + ", address=" + this.address + ", name=" + this.name + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", shippingInformation=" + this.shippingInformation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.token, flags);
        Address address = this.address;
        if (address == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            address.writeToParcel(dest, flags);
        }
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.phoneNumber);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shippingInformation.writeToParcel(dest, flags);
        }
    }

    public GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation) {
        this.token = token;
        this.address = address;
        this.name = str;
        this.email = str2;
        this.phoneNumber = str3;
        this.shippingInformation = shippingInformation;
    }

    public /* synthetic */ GooglePayResult(Token token, Address address, String str, String str2, String str3, ShippingInformation shippingInformation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : token, (i & 2) != 0 ? null : address, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : shippingInformation);
    }

    public final Token getToken() {
        return this.token;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    /* compiled from: GooglePayResult.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/GooglePayResult$Companion;", "", "<init>", "()V", "fromJson", "Lcom/stripe/android/model/GooglePayResult;", "paymentDataJson", "Lorg/json/JSONObject;", "createShippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GooglePayResult fromJson(JSONObject paymentDataJson) throws JSONException {
            Address address;
            Intrinsics.checkNotNullParameter(paymentDataJson, "paymentDataJson");
            JSONObject jSONObject = paymentDataJson.getJSONObject("paymentMethodData");
            Token token = new TokenJsonParser().parse(new JSONObject(jSONObject.getJSONObject("tokenizationData").getString("token")));
            JSONObject jSONObjectOptJSONObject = jSONObject.getJSONObject("info").optJSONObject("billingAddress");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = StripeJsonUtils.optString(jSONObjectOptJSONObject, "address1");
                String strOptString2 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "address2");
                address = new Address(StripeJsonUtils.optString(jSONObjectOptJSONObject, "locality"), StripeJsonUtils.optString(jSONObjectOptJSONObject, "countryCode"), strOptString, strOptString2, StripeJsonUtils.optString(jSONObjectOptJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE), StripeJsonUtils.optString(jSONObjectOptJSONObject, "administrativeArea"));
            } else {
                address = null;
            }
            return new GooglePayResult(token, address, StripeJsonUtils.optString(jSONObjectOptJSONObject, "name"), StripeJsonUtils.optString(paymentDataJson, "email"), StripeJsonUtils.optString(jSONObjectOptJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), createShippingInformation(paymentDataJson));
        }

        private final ShippingInformation createShippingInformation(JSONObject paymentDataJson) {
            JSONObject jSONObjectOptJSONObject = paymentDataJson.optJSONObject("shippingAddress");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            String strOptString = StripeJsonUtils.optString(jSONObjectOptJSONObject, "address1");
            String strOptString2 = StripeJsonUtils.optString(jSONObjectOptJSONObject, "address2");
            String strOptString3 = StripeJsonUtils.optString(jSONObjectOptJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            return new ShippingInformation(new Address(StripeJsonUtils.optString(jSONObjectOptJSONObject, "locality"), StripeJsonUtils.optString(jSONObjectOptJSONObject, "countryCode"), strOptString, strOptString2, strOptString3, StripeJsonUtils.optString(jSONObjectOptJSONObject, "administrativeArea")), StripeJsonUtils.optString(jSONObjectOptJSONObject, "name"), StripeJsonUtils.optString(jSONObjectOptJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER));
        }
    }
}
