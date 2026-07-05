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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Landroid/os/Parcelable;", ECEPaymentMethodOptions.FIELD_SHOP_PAY, "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;", "<init>", "(Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;)V", "getShopPay", "()Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;", "toJson", "Lorg/json/JSONObject;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "ShopPay", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ECEPaymentMethodOptions implements JsonSerializer, Parcelable {
    public static final int $stable = 0;
    private static final String FIELD_SHOP_PAY = "shopPay";
    private final ShopPay shopPay;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ECEPaymentMethodOptions> CREATOR = new Creator();

    /* compiled from: ECETypes.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ECEPaymentMethodOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEPaymentMethodOptions createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ECEPaymentMethodOptions(parcel.readInt() == 0 ? null : ShopPay.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ECEPaymentMethodOptions[] newArray(int i) {
            return new ECEPaymentMethodOptions[i];
        }
    }

    public static /* synthetic */ ECEPaymentMethodOptions copy$default(ECEPaymentMethodOptions eCEPaymentMethodOptions, ShopPay shopPay, int i, Object obj) {
        if ((i & 1) != 0) {
            shopPay = eCEPaymentMethodOptions.shopPay;
        }
        return eCEPaymentMethodOptions.copy(shopPay);
    }

    /* renamed from: component1, reason: from getter */
    public final ShopPay getShopPay() {
        return this.shopPay;
    }

    public final ECEPaymentMethodOptions copy(ShopPay shopPay) {
        return new ECEPaymentMethodOptions(shopPay);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ECEPaymentMethodOptions) && Intrinsics.areEqual(this.shopPay, ((ECEPaymentMethodOptions) other).shopPay);
    }

    public int hashCode() {
        ShopPay shopPay = this.shopPay;
        if (shopPay == null) {
            return 0;
        }
        return shopPay.hashCode();
    }

    public String toString() {
        return "ECEPaymentMethodOptions(shopPay=" + this.shopPay + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ShopPay shopPay = this.shopPay;
        if (shopPay == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shopPay.writeToParcel(dest, flags);
        }
    }

    public ECEPaymentMethodOptions(ShopPay shopPay) {
        this.shopPay = shopPay;
    }

    public final ShopPay getShopPay() {
        return this.shopPay;
    }

    /* compiled from: ECETypes.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Landroid/os/Parcelable;", ShopPay.FIELD_EXTERNAL_SOURCE_ID, "", "<init>", "(Ljava/lang/String;)V", "getExternalSourceId", "()Ljava/lang/String;", "toJson", "Lorg/json/JSONObject;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShopPay implements JsonSerializer, Parcelable {
        private static final String FIELD_EXTERNAL_SOURCE_ID = "externalSourceId";
        private final String externalSourceId;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ShopPay> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ECETypes.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShopPay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShopPay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShopPay(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShopPay[] newArray(int i) {
                return new ShopPay[i];
            }
        }

        public static /* synthetic */ ShopPay copy$default(ShopPay shopPay, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shopPay.externalSourceId;
            }
            return shopPay.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getExternalSourceId() {
            return this.externalSourceId;
        }

        public final ShopPay copy(String externalSourceId) {
            Intrinsics.checkNotNullParameter(externalSourceId, "externalSourceId");
            return new ShopPay(externalSourceId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShopPay) && Intrinsics.areEqual(this.externalSourceId, ((ShopPay) other).externalSourceId);
        }

        public int hashCode() {
            return this.externalSourceId.hashCode();
        }

        public String toString() {
            return "ShopPay(externalSourceId=" + this.externalSourceId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.externalSourceId);
        }

        public ShopPay(String externalSourceId) {
            Intrinsics.checkNotNullParameter(externalSourceId, "externalSourceId");
            this.externalSourceId = externalSourceId;
        }

        public final String getExternalSourceId() {
            return this.externalSourceId;
        }

        @Override // com.stripe.android.shoppay.bridge.JsonSerializer
        public JSONObject toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FIELD_EXTERNAL_SOURCE_ID, this.externalSourceId);
            return jSONObject;
        }

        /* compiled from: ECETypes.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay$Companion;", "", "<init>", "()V", "FIELD_EXTERNAL_SOURCE_ID", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ShopPay shopPay = this.shopPay;
        if (shopPay != null) {
            jSONObject.put(FIELD_SHOP_PAY, shopPay.toJson());
        }
        return jSONObject;
    }

    /* compiled from: ECETypes.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$Companion;", "", "<init>", "()V", "FIELD_SHOP_PAY", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
