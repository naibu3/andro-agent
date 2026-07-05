package com.stripe.android.paymentelement.confirmation.epms;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPaymentMethodConfirmationOption.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "type", "", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V", "getType", "()Ljava/lang/String;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExternalPaymentMethodConfirmationOption implements ConfirmationHandler.Option {
    private final PaymentMethod.BillingDetails billingDetails;
    private final String type;
    public static final Parcelable.Creator<ExternalPaymentMethodConfirmationOption> CREATOR = new Creator();
    public static final int $stable = PaymentMethod.BillingDetails.$stable;

    /* compiled from: ExternalPaymentMethodConfirmationOption.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExternalPaymentMethodConfirmationOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExternalPaymentMethodConfirmationOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExternalPaymentMethodConfirmationOption(parcel.readString(), (PaymentMethod.BillingDetails) parcel.readParcelable(ExternalPaymentMethodConfirmationOption.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExternalPaymentMethodConfirmationOption[] newArray(int i) {
            return new ExternalPaymentMethodConfirmationOption[i];
        }
    }

    public static /* synthetic */ ExternalPaymentMethodConfirmationOption copy$default(ExternalPaymentMethodConfirmationOption externalPaymentMethodConfirmationOption, String str, PaymentMethod.BillingDetails billingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalPaymentMethodConfirmationOption.type;
        }
        if ((i & 2) != 0) {
            billingDetails = externalPaymentMethodConfirmationOption.billingDetails;
        }
        return externalPaymentMethodConfirmationOption.copy(str, billingDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final ExternalPaymentMethodConfirmationOption copy(String type, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new ExternalPaymentMethodConfirmationOption(type, billingDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPaymentMethodConfirmationOption)) {
            return false;
        }
        ExternalPaymentMethodConfirmationOption externalPaymentMethodConfirmationOption = (ExternalPaymentMethodConfirmationOption) other;
        return Intrinsics.areEqual(this.type, externalPaymentMethodConfirmationOption.type) && Intrinsics.areEqual(this.billingDetails, externalPaymentMethodConfirmationOption.billingDetails);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        return iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode());
    }

    public String toString() {
        return "ExternalPaymentMethodConfirmationOption(type=" + this.type + ", billingDetails=" + this.billingDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        dest.writeParcelable(this.billingDetails, flags);
    }

    public ExternalPaymentMethodConfirmationOption(String type, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.billingDetails = billingDetails;
    }

    public final String getType() {
        return this.type;
    }

    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }
}
