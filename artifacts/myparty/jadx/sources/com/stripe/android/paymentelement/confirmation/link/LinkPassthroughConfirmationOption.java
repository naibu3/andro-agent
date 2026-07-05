package com.stripe.android.paymentelement.confirmation.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkPassthroughConfirmationOption.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationOption;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "paymentDetailsId", "", "expectedPaymentMethodType", "cvc", "billingPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentDetailsId", "()Ljava/lang/String;", "getExpectedPaymentMethodType", "getCvc", "getBillingPhone", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkPassthroughConfirmationOption implements ConfirmationHandler.Option {
    private final String billingPhone;
    private final String cvc;
    private final String expectedPaymentMethodType;
    private final String paymentDetailsId;
    public static final Parcelable.Creator<LinkPassthroughConfirmationOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: LinkPassthroughConfirmationOption.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkPassthroughConfirmationOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkPassthroughConfirmationOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkPassthroughConfirmationOption(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkPassthroughConfirmationOption[] newArray(int i) {
            return new LinkPassthroughConfirmationOption[i];
        }
    }

    public static /* synthetic */ LinkPassthroughConfirmationOption copy$default(LinkPassthroughConfirmationOption linkPassthroughConfirmationOption, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkPassthroughConfirmationOption.paymentDetailsId;
        }
        if ((i & 2) != 0) {
            str2 = linkPassthroughConfirmationOption.expectedPaymentMethodType;
        }
        if ((i & 4) != 0) {
            str3 = linkPassthroughConfirmationOption.cvc;
        }
        if ((i & 8) != 0) {
            str4 = linkPassthroughConfirmationOption.billingPhone;
        }
        return linkPassthroughConfirmationOption.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentDetailsId() {
        return this.paymentDetailsId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExpectedPaymentMethodType() {
        return this.expectedPaymentMethodType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCvc() {
        return this.cvc;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBillingPhone() {
        return this.billingPhone;
    }

    public final LinkPassthroughConfirmationOption copy(String paymentDetailsId, String expectedPaymentMethodType, String cvc, String billingPhone) {
        Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
        Intrinsics.checkNotNullParameter(expectedPaymentMethodType, "expectedPaymentMethodType");
        return new LinkPassthroughConfirmationOption(paymentDetailsId, expectedPaymentMethodType, cvc, billingPhone);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkPassthroughConfirmationOption)) {
            return false;
        }
        LinkPassthroughConfirmationOption linkPassthroughConfirmationOption = (LinkPassthroughConfirmationOption) other;
        return Intrinsics.areEqual(this.paymentDetailsId, linkPassthroughConfirmationOption.paymentDetailsId) && Intrinsics.areEqual(this.expectedPaymentMethodType, linkPassthroughConfirmationOption.expectedPaymentMethodType) && Intrinsics.areEqual(this.cvc, linkPassthroughConfirmationOption.cvc) && Intrinsics.areEqual(this.billingPhone, linkPassthroughConfirmationOption.billingPhone);
    }

    public int hashCode() {
        int iHashCode = ((this.paymentDetailsId.hashCode() * 31) + this.expectedPaymentMethodType.hashCode()) * 31;
        String str = this.cvc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billingPhone;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LinkPassthroughConfirmationOption(paymentDetailsId=" + this.paymentDetailsId + ", expectedPaymentMethodType=" + this.expectedPaymentMethodType + ", cvc=" + this.cvc + ", billingPhone=" + this.billingPhone + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentDetailsId);
        dest.writeString(this.expectedPaymentMethodType);
        dest.writeString(this.cvc);
        dest.writeString(this.billingPhone);
    }

    public LinkPassthroughConfirmationOption(String paymentDetailsId, String expectedPaymentMethodType, String str, String str2) {
        Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
        Intrinsics.checkNotNullParameter(expectedPaymentMethodType, "expectedPaymentMethodType");
        this.paymentDetailsId = paymentDetailsId;
        this.expectedPaymentMethodType = expectedPaymentMethodType;
        this.cvc = str;
        this.billingPhone = str2;
    }

    public final String getPaymentDetailsId() {
        return this.paymentDetailsId;
    }

    public final String getExpectedPaymentMethodType() {
        return this.expectedPaymentMethodType;
    }

    public final String getCvc() {
        return this.cvc;
    }

    public final String getBillingPhone() {
        return this.billingPhone;
    }
}
