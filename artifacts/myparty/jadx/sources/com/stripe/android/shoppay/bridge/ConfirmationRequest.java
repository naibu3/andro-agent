package com.stripe.android.shoppay.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmationRequest.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;", "Lcom/stripe/android/core/model/StripeModel;", "paymentDetails", "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;", "<init>", "(Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;)V", "getPaymentDetails", "()Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "ConfirmEventData", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConfirmationRequest implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ConfirmationRequest> CREATOR = new Creator();
    private final ConfirmEventData paymentDetails;

    /* compiled from: ConfirmationRequest.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConfirmationRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmationRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmationRequest(ConfirmEventData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmationRequest[] newArray(int i) {
            return new ConfirmationRequest[i];
        }
    }

    public static /* synthetic */ ConfirmationRequest copy$default(ConfirmationRequest confirmationRequest, ConfirmEventData confirmEventData, int i, Object obj) {
        if ((i & 1) != 0) {
            confirmEventData = confirmationRequest.paymentDetails;
        }
        return confirmationRequest.copy(confirmEventData);
    }

    /* renamed from: component1, reason: from getter */
    public final ConfirmEventData getPaymentDetails() {
        return this.paymentDetails;
    }

    public final ConfirmationRequest copy(ConfirmEventData paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        return new ConfirmationRequest(paymentDetails);
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
        return (other instanceof ConfirmationRequest) && Intrinsics.areEqual(this.paymentDetails, ((ConfirmationRequest) other).paymentDetails);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.paymentDetails.hashCode();
    }

    public String toString() {
        return "ConfirmationRequest(paymentDetails=" + this.paymentDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.paymentDetails.writeToParcel(dest, flags);
    }

    public ConfirmationRequest(ConfirmEventData paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        this.paymentDetails = paymentDetails;
    }

    public final ConfirmEventData getPaymentDetails() {
        return this.paymentDetails;
    }

    /* compiled from: ConfirmationRequest.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;", "Lcom/stripe/android/core/model/StripeModel;", "billingDetails", "Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;", "shippingAddress", "Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;", "shippingRate", "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "paymentMethodOptions", "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;", "<init>", "(Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;)V", "getBillingDetails", "()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;", "getShippingAddress", "()Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;", "getShippingRate", "()Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "getPaymentMethodOptions", "()Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfirmEventData implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ConfirmEventData> CREATOR = new Creator();
        private final ECEBillingDetails billingDetails;
        private final ECEPaymentMethodOptions paymentMethodOptions;
        private final ECEShippingAddressData shippingAddress;
        private final ECEShippingRate shippingRate;

        /* compiled from: ConfirmationRequest.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ConfirmEventData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfirmEventData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmEventData(ECEBillingDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ECEShippingAddressData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ECEShippingRate.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ECEPaymentMethodOptions.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfirmEventData[] newArray(int i) {
                return new ConfirmEventData[i];
            }
        }

        public static /* synthetic */ ConfirmEventData copy$default(ConfirmEventData confirmEventData, ECEBillingDetails eCEBillingDetails, ECEShippingAddressData eCEShippingAddressData, ECEShippingRate eCEShippingRate, ECEPaymentMethodOptions eCEPaymentMethodOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                eCEBillingDetails = confirmEventData.billingDetails;
            }
            if ((i & 2) != 0) {
                eCEShippingAddressData = confirmEventData.shippingAddress;
            }
            if ((i & 4) != 0) {
                eCEShippingRate = confirmEventData.shippingRate;
            }
            if ((i & 8) != 0) {
                eCEPaymentMethodOptions = confirmEventData.paymentMethodOptions;
            }
            return confirmEventData.copy(eCEBillingDetails, eCEShippingAddressData, eCEShippingRate, eCEPaymentMethodOptions);
        }

        /* renamed from: component1, reason: from getter */
        public final ECEBillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        /* renamed from: component2, reason: from getter */
        public final ECEShippingAddressData getShippingAddress() {
            return this.shippingAddress;
        }

        /* renamed from: component3, reason: from getter */
        public final ECEShippingRate getShippingRate() {
            return this.shippingRate;
        }

        /* renamed from: component4, reason: from getter */
        public final ECEPaymentMethodOptions getPaymentMethodOptions() {
            return this.paymentMethodOptions;
        }

        public final ConfirmEventData copy(ECEBillingDetails billingDetails, ECEShippingAddressData shippingAddress, ECEShippingRate shippingRate, ECEPaymentMethodOptions paymentMethodOptions) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new ConfirmEventData(billingDetails, shippingAddress, shippingRate, paymentMethodOptions);
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
            if (!(other instanceof ConfirmEventData)) {
                return false;
            }
            ConfirmEventData confirmEventData = (ConfirmEventData) other;
            return Intrinsics.areEqual(this.billingDetails, confirmEventData.billingDetails) && Intrinsics.areEqual(this.shippingAddress, confirmEventData.shippingAddress) && Intrinsics.areEqual(this.shippingRate, confirmEventData.shippingRate) && Intrinsics.areEqual(this.paymentMethodOptions, confirmEventData.paymentMethodOptions);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int iHashCode = this.billingDetails.hashCode() * 31;
            ECEShippingAddressData eCEShippingAddressData = this.shippingAddress;
            int iHashCode2 = (iHashCode + (eCEShippingAddressData == null ? 0 : eCEShippingAddressData.hashCode())) * 31;
            ECEShippingRate eCEShippingRate = this.shippingRate;
            int iHashCode3 = (iHashCode2 + (eCEShippingRate == null ? 0 : eCEShippingRate.hashCode())) * 31;
            ECEPaymentMethodOptions eCEPaymentMethodOptions = this.paymentMethodOptions;
            return iHashCode3 + (eCEPaymentMethodOptions != null ? eCEPaymentMethodOptions.hashCode() : 0);
        }

        public String toString() {
            return "ConfirmEventData(billingDetails=" + this.billingDetails + ", shippingAddress=" + this.shippingAddress + ", shippingRate=" + this.shippingRate + ", paymentMethodOptions=" + this.paymentMethodOptions + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.billingDetails.writeToParcel(dest, flags);
            ECEShippingAddressData eCEShippingAddressData = this.shippingAddress;
            if (eCEShippingAddressData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eCEShippingAddressData.writeToParcel(dest, flags);
            }
            ECEShippingRate eCEShippingRate = this.shippingRate;
            if (eCEShippingRate == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eCEShippingRate.writeToParcel(dest, flags);
            }
            ECEPaymentMethodOptions eCEPaymentMethodOptions = this.paymentMethodOptions;
            if (eCEPaymentMethodOptions == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eCEPaymentMethodOptions.writeToParcel(dest, flags);
            }
        }

        public ConfirmEventData(ECEBillingDetails billingDetails, ECEShippingAddressData eCEShippingAddressData, ECEShippingRate eCEShippingRate, ECEPaymentMethodOptions eCEPaymentMethodOptions) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            this.billingDetails = billingDetails;
            this.shippingAddress = eCEShippingAddressData;
            this.shippingRate = eCEShippingRate;
            this.paymentMethodOptions = eCEPaymentMethodOptions;
        }

        public /* synthetic */ ConfirmEventData(ECEBillingDetails eCEBillingDetails, ECEShippingAddressData eCEShippingAddressData, ECEShippingRate eCEShippingRate, ECEPaymentMethodOptions eCEPaymentMethodOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eCEBillingDetails, (i & 2) != 0 ? null : eCEShippingAddressData, (i & 4) != 0 ? null : eCEShippingRate, (i & 8) != 0 ? null : eCEPaymentMethodOptions);
        }

        public final ECEBillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public final ECEShippingAddressData getShippingAddress() {
            return this.shippingAddress;
        }

        public final ECEShippingRate getShippingRate() {
            return this.shippingRate;
        }

        public final ECEPaymentMethodOptions getPaymentMethodOptions() {
            return this.paymentMethodOptions;
        }
    }
}
