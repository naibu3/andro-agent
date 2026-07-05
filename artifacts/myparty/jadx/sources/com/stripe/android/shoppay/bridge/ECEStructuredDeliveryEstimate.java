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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Landroid/os/Parcelable;", ECEStructuredDeliveryEstimate.FIELD_MAXIMUM, "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;", ECEStructuredDeliveryEstimate.FIELD_MINIMUM, "<init>", "(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;)V", "getMaximum", "()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;", "getMinimum", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ECEStructuredDeliveryEstimate implements JsonSerializer, Parcelable {
    public static final int $stable = 0;
    private static final String FIELD_MAXIMUM = "maximum";
    private static final String FIELD_MINIMUM = "minimum";
    private final ECEDeliveryEstimateUnit maximum;
    private final ECEDeliveryEstimateUnit minimum;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ECEStructuredDeliveryEstimate> CREATOR = new Creator();

    /* compiled from: ECETypes.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ECEStructuredDeliveryEstimate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEStructuredDeliveryEstimate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ECEStructuredDeliveryEstimate(parcel.readInt() == 0 ? null : ECEDeliveryEstimateUnit.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ECEDeliveryEstimateUnit.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEStructuredDeliveryEstimate[] newArray(int i) {
            return new ECEStructuredDeliveryEstimate[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ECEStructuredDeliveryEstimate() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ECEStructuredDeliveryEstimate copy$default(ECEStructuredDeliveryEstimate eCEStructuredDeliveryEstimate, ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit, ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit2, int i, Object obj) {
        if ((i & 1) != 0) {
            eCEDeliveryEstimateUnit = eCEStructuredDeliveryEstimate.maximum;
        }
        if ((i & 2) != 0) {
            eCEDeliveryEstimateUnit2 = eCEStructuredDeliveryEstimate.minimum;
        }
        return eCEStructuredDeliveryEstimate.copy(eCEDeliveryEstimateUnit, eCEDeliveryEstimateUnit2);
    }

    /* renamed from: component1, reason: from getter */
    public final ECEDeliveryEstimateUnit getMaximum() {
        return this.maximum;
    }

    /* renamed from: component2, reason: from getter */
    public final ECEDeliveryEstimateUnit getMinimum() {
        return this.minimum;
    }

    public final ECEStructuredDeliveryEstimate copy(ECEDeliveryEstimateUnit maximum, ECEDeliveryEstimateUnit minimum) {
        return new ECEStructuredDeliveryEstimate(maximum, minimum);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ECEStructuredDeliveryEstimate)) {
            return false;
        }
        ECEStructuredDeliveryEstimate eCEStructuredDeliveryEstimate = (ECEStructuredDeliveryEstimate) other;
        return Intrinsics.areEqual(this.maximum, eCEStructuredDeliveryEstimate.maximum) && Intrinsics.areEqual(this.minimum, eCEStructuredDeliveryEstimate.minimum);
    }

    public int hashCode() {
        ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit = this.maximum;
        int iHashCode = (eCEDeliveryEstimateUnit == null ? 0 : eCEDeliveryEstimateUnit.hashCode()) * 31;
        ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit2 = this.minimum;
        return iHashCode + (eCEDeliveryEstimateUnit2 != null ? eCEDeliveryEstimateUnit2.hashCode() : 0);
    }

    public String toString() {
        return "ECEStructuredDeliveryEstimate(maximum=" + this.maximum + ", minimum=" + this.minimum + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit = this.maximum;
        if (eCEDeliveryEstimateUnit == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eCEDeliveryEstimateUnit.writeToParcel(dest, flags);
        }
        ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit2 = this.minimum;
        if (eCEDeliveryEstimateUnit2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eCEDeliveryEstimateUnit2.writeToParcel(dest, flags);
        }
    }

    public ECEStructuredDeliveryEstimate(ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit, ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit2) {
        this.maximum = eCEDeliveryEstimateUnit;
        this.minimum = eCEDeliveryEstimateUnit2;
    }

    public /* synthetic */ ECEStructuredDeliveryEstimate(ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit, ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eCEDeliveryEstimateUnit, (i & 2) != 0 ? null : eCEDeliveryEstimateUnit2);
    }

    public final ECEDeliveryEstimateUnit getMaximum() {
        return this.maximum;
    }

    public final ECEDeliveryEstimateUnit getMinimum() {
        return this.minimum;
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit = this.maximum;
        if (eCEDeliveryEstimateUnit != null) {
            jSONObject.put(FIELD_MAXIMUM, eCEDeliveryEstimateUnit.toJson());
        }
        ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit2 = this.minimum;
        if (eCEDeliveryEstimateUnit2 != null) {
            jSONObject.put(FIELD_MINIMUM, eCEDeliveryEstimateUnit2.toJson());
        }
        return jSONObject;
    }

    /* compiled from: ECETypes.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate$Companion;", "", "<init>", "()V", "FIELD_MAXIMUM", "", "FIELD_MINIMUM", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
