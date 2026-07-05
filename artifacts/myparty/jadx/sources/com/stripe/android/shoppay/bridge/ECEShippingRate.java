package com.stripe.android.shoppay.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.shoppay.bridge.ECEDeliveryEstimate;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ECETypes.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0006J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "amount", "", ECEShippingRate.FIELD_DISPLAY_NAME, ECEShippingRate.FIELD_DELIVERY_ESTIMATE, "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;)V", "getId", "()Ljava/lang/String;", "getAmount", "()I", "getDisplayName", "getDeliveryEstimate", "()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ECEShippingRate implements JsonSerializer, StripeModel {
    private static final String FIELD_AMOUNT = "amount";
    private static final String FIELD_DELIVERY_ESTIMATE = "deliveryEstimate";
    private static final String FIELD_DISPLAY_NAME = "displayName";
    private static final String FIELD_ID = "id";
    private final int amount;
    private final ECEDeliveryEstimate deliveryEstimate;
    private final String displayName;
    private final String id;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ECEShippingRate> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ECETypes.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ECEShippingRate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEShippingRate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ECEShippingRate(parcel.readString(), parcel.readInt(), parcel.readString(), (ECEDeliveryEstimate) parcel.readParcelable(ECEShippingRate.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEShippingRate[] newArray(int i) {
            return new ECEShippingRate[i];
        }
    }

    public static /* synthetic */ ECEShippingRate copy$default(ECEShippingRate eCEShippingRate, String str, int i, String str2, ECEDeliveryEstimate eCEDeliveryEstimate, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eCEShippingRate.id;
        }
        if ((i2 & 2) != 0) {
            i = eCEShippingRate.amount;
        }
        if ((i2 & 4) != 0) {
            str2 = eCEShippingRate.displayName;
        }
        if ((i2 & 8) != 0) {
            eCEDeliveryEstimate = eCEShippingRate.deliveryEstimate;
        }
        return eCEShippingRate.copy(str, i, str2, eCEDeliveryEstimate);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final ECEDeliveryEstimate getDeliveryEstimate() {
        return this.deliveryEstimate;
    }

    public final ECEShippingRate copy(String id, int amount, String displayName, ECEDeliveryEstimate deliveryEstimate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new ECEShippingRate(id, amount, displayName, deliveryEstimate);
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
        if (!(other instanceof ECEShippingRate)) {
            return false;
        }
        ECEShippingRate eCEShippingRate = (ECEShippingRate) other;
        return Intrinsics.areEqual(this.id, eCEShippingRate.id) && this.amount == eCEShippingRate.amount && Intrinsics.areEqual(this.displayName, eCEShippingRate.displayName) && Intrinsics.areEqual(this.deliveryEstimate, eCEShippingRate.deliveryEstimate);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + Integer.hashCode(this.amount)) * 31) + this.displayName.hashCode()) * 31;
        ECEDeliveryEstimate eCEDeliveryEstimate = this.deliveryEstimate;
        return iHashCode + (eCEDeliveryEstimate == null ? 0 : eCEDeliveryEstimate.hashCode());
    }

    public String toString() {
        return "ECEShippingRate(id=" + this.id + ", amount=" + this.amount + ", displayName=" + this.displayName + ", deliveryEstimate=" + this.deliveryEstimate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.amount);
        dest.writeString(this.displayName);
        dest.writeParcelable(this.deliveryEstimate, flags);
    }

    public ECEShippingRate(String id, int i, String displayName, ECEDeliveryEstimate eCEDeliveryEstimate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.id = id;
        this.amount = i;
        this.displayName = displayName;
        this.deliveryEstimate = eCEDeliveryEstimate;
    }

    public /* synthetic */ ECEShippingRate(String str, int i, String str2, ECEDeliveryEstimate eCEDeliveryEstimate, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 8) != 0 ? null : eCEDeliveryEstimate);
    }

    public final String getId() {
        return this.id;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final ECEDeliveryEstimate getDeliveryEstimate() {
        return this.deliveryEstimate;
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("amount", this.amount);
        jSONObject.put(FIELD_DISPLAY_NAME, this.displayName);
        ECEDeliveryEstimate eCEDeliveryEstimate = this.deliveryEstimate;
        if (eCEDeliveryEstimate == null) {
            return jSONObject;
        }
        if (eCEDeliveryEstimate instanceof ECEDeliveryEstimate.Text) {
            jSONObject.put(FIELD_DELIVERY_ESTIMATE, ((ECEDeliveryEstimate.Text) eCEDeliveryEstimate).getValue());
            return jSONObject;
        }
        if (!(eCEDeliveryEstimate instanceof ECEDeliveryEstimate.Range)) {
            throw new NoWhenBranchMatchedException();
        }
        jSONObject.put(FIELD_DELIVERY_ESTIMATE, ((ECEDeliveryEstimate.Range) eCEDeliveryEstimate).getValue().toJson());
        return jSONObject;
    }

    /* compiled from: ECETypes.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEShippingRate$Companion;", "", "<init>", "()V", "FIELD_ID", "", "FIELD_AMOUNT", "FIELD_DISPLAY_NAME", "FIELD_DELIVERY_ESTIMATE", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
