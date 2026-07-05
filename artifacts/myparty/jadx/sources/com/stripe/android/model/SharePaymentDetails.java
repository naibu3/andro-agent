package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharePaymentDetails.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/SharePaymentDetails;", "Lcom/stripe/android/core/model/StripeModel;", "paymentMethodId", "", "encodedPaymentMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodId", "()Ljava/lang/String;", "getEncodedPaymentMethod", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SharePaymentDetails implements StripeModel {
    public static final Parcelable.Creator<SharePaymentDetails> CREATOR = new Creator();
    private final String encodedPaymentMethod;
    private final String paymentMethodId;

    /* compiled from: SharePaymentDetails.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SharePaymentDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharePaymentDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharePaymentDetails(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharePaymentDetails[] newArray(int i) {
            return new SharePaymentDetails[i];
        }
    }

    public static /* synthetic */ SharePaymentDetails copy$default(SharePaymentDetails sharePaymentDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharePaymentDetails.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str2 = sharePaymentDetails.encodedPaymentMethod;
        }
        return sharePaymentDetails.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEncodedPaymentMethod() {
        return this.encodedPaymentMethod;
    }

    public final SharePaymentDetails copy(String paymentMethodId, String encodedPaymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(encodedPaymentMethod, "encodedPaymentMethod");
        return new SharePaymentDetails(paymentMethodId, encodedPaymentMethod);
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
        if (!(other instanceof SharePaymentDetails)) {
            return false;
        }
        SharePaymentDetails sharePaymentDetails = (SharePaymentDetails) other;
        return Intrinsics.areEqual(this.paymentMethodId, sharePaymentDetails.paymentMethodId) && Intrinsics.areEqual(this.encodedPaymentMethod, sharePaymentDetails.encodedPaymentMethod);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.paymentMethodId.hashCode() * 31) + this.encodedPaymentMethod.hashCode();
    }

    public String toString() {
        return "SharePaymentDetails(paymentMethodId=" + this.paymentMethodId + ", encodedPaymentMethod=" + this.encodedPaymentMethod + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentMethodId);
        dest.writeString(this.encodedPaymentMethod);
    }

    public SharePaymentDetails(String paymentMethodId, String encodedPaymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(encodedPaymentMethod, "encodedPaymentMethod");
        this.paymentMethodId = paymentMethodId;
        this.encodedPaymentMethod = encodedPaymentMethod;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getEncodedPaymentMethod() {
        return this.encodedPaymentMethod;
    }
}
