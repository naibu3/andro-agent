package com.stripe.android.shoppay.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ECETypes.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Landroid/os/Parcelable;", ECEDeliveryEstimateUnit.FIELD_UNIT, "Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;", "value", "", "<init>", "(Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;I)V", "getUnit", "()Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;", "getValue", "()I", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ECEDeliveryEstimateUnit implements JsonSerializer, Parcelable {
    private static final String FIELD_UNIT = "unit";
    private static final String FIELD_VALUE = "value";
    private final DeliveryTimeUnit unit;
    private final int value;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ECEDeliveryEstimateUnit> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ECETypes.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ECEDeliveryEstimateUnit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEDeliveryEstimateUnit createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ECEDeliveryEstimateUnit(DeliveryTimeUnit.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEDeliveryEstimateUnit[] newArray(int i) {
            return new ECEDeliveryEstimateUnit[i];
        }
    }

    public static /* synthetic */ ECEDeliveryEstimateUnit copy$default(ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit, DeliveryTimeUnit deliveryTimeUnit, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            deliveryTimeUnit = eCEDeliveryEstimateUnit.unit;
        }
        if ((i2 & 2) != 0) {
            i = eCEDeliveryEstimateUnit.value;
        }
        return eCEDeliveryEstimateUnit.copy(deliveryTimeUnit, i);
    }

    /* renamed from: component1, reason: from getter */
    public final DeliveryTimeUnit getUnit() {
        return this.unit;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final ECEDeliveryEstimateUnit copy(DeliveryTimeUnit unit, int value) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new ECEDeliveryEstimateUnit(unit, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ECEDeliveryEstimateUnit)) {
            return false;
        }
        ECEDeliveryEstimateUnit eCEDeliveryEstimateUnit = (ECEDeliveryEstimateUnit) other;
        return this.unit == eCEDeliveryEstimateUnit.unit && this.value == eCEDeliveryEstimateUnit.value;
    }

    public int hashCode() {
        return (this.unit.hashCode() * 31) + Integer.hashCode(this.value);
    }

    public String toString() {
        return "ECEDeliveryEstimateUnit(unit=" + this.unit + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.unit.writeToParcel(dest, flags);
        dest.writeInt(this.value);
    }

    public ECEDeliveryEstimateUnit(DeliveryTimeUnit unit, int i) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.value = i;
    }

    public final DeliveryTimeUnit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String lowerCase = this.unit.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject.put(FIELD_UNIT, lowerCase);
        jSONObject.put("value", this.value);
        return jSONObject;
    }

    /* compiled from: ECETypes.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit$Companion;", "", "<init>", "()V", "FIELD_UNIT", "", "FIELD_VALUE", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
