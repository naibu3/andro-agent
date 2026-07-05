package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.ConsumerPaymentDetails;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkPaymentMethod.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B%\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/link/LinkPaymentMethod;", "Landroid/os/Parcelable;", "details", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "collectedCvc", "", "billingPhone", "<init>", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;)V", "getDetails", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getCollectedCvc", "()Ljava/lang/String;", "getBillingPhone", "readyForConfirmation", "", "readyForConfirmation$paymentsheet_release", "ConsumerPaymentDetails", "LinkPaymentDetails", "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;", "Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LinkPaymentMethod implements Parcelable {
    public static final int $stable = 8;
    private final String billingPhone;
    private final String collectedCvc;
    private final ConsumerPaymentDetails.PaymentDetails details;

    public /* synthetic */ LinkPaymentMethod(ConsumerPaymentDetails.PaymentDetails paymentDetails, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentDetails, str, str2);
    }

    private LinkPaymentMethod(ConsumerPaymentDetails.PaymentDetails paymentDetails, String str, String str2) {
        this.details = paymentDetails;
        this.collectedCvc = str;
        this.billingPhone = str2;
    }

    public ConsumerPaymentDetails.PaymentDetails getDetails() {
        return this.details;
    }

    public String getCollectedCvc() {
        return this.collectedCvc;
    }

    public String getBillingPhone() {
        return this.billingPhone;
    }

    public final boolean readyForConfirmation$paymentsheet_release() {
        String collectedCvc;
        ConsumerPaymentDetails.PaymentDetails details = getDetails();
        if (details instanceof ConsumerPaymentDetails.BankAccount) {
            return true;
        }
        if (details instanceof ConsumerPaymentDetails.Card) {
            ConsumerPaymentDetails.Card card = (ConsumerPaymentDetails.Card) details;
            return !card.isExpired() && (!card.getCvcCheck().getRequiresRecollection() || ((collectedCvc = getCollectedCvc()) != null && collectedCvc.length() > 0));
        }
        if (details instanceof ConsumerPaymentDetails.Passthrough) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: LinkPaymentMethod.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;", "Lcom/stripe/android/link/LinkPaymentMethod;", "details", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "collectedCvc", "", "billingPhone", "<init>", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;)V", "getDetails", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getCollectedCvc", "()Ljava/lang/String;", "getBillingPhone", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConsumerPaymentDetails extends LinkPaymentMethod {
        private final String billingPhone;
        private final String collectedCvc;
        private final ConsumerPaymentDetails.PaymentDetails details;
        public static final Parcelable.Creator<ConsumerPaymentDetails> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkPaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ConsumerPaymentDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConsumerPaymentDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsumerPaymentDetails((ConsumerPaymentDetails.PaymentDetails) parcel.readParcelable(ConsumerPaymentDetails.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConsumerPaymentDetails[] newArray(int i) {
                return new ConsumerPaymentDetails[i];
            }
        }

        public static /* synthetic */ ConsumerPaymentDetails copy$default(ConsumerPaymentDetails consumerPaymentDetails, ConsumerPaymentDetails.PaymentDetails paymentDetails, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentDetails = consumerPaymentDetails.details;
            }
            if ((i & 2) != 0) {
                str = consumerPaymentDetails.collectedCvc;
            }
            if ((i & 4) != 0) {
                str2 = consumerPaymentDetails.billingPhone;
            }
            return consumerPaymentDetails.copy(paymentDetails, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final ConsumerPaymentDetails.PaymentDetails getDetails() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCollectedCvc() {
            return this.collectedCvc;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBillingPhone() {
            return this.billingPhone;
        }

        public final ConsumerPaymentDetails copy(ConsumerPaymentDetails.PaymentDetails details, String collectedCvc, String billingPhone) {
            Intrinsics.checkNotNullParameter(details, "details");
            return new ConsumerPaymentDetails(details, collectedCvc, billingPhone);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConsumerPaymentDetails)) {
                return false;
            }
            ConsumerPaymentDetails consumerPaymentDetails = (ConsumerPaymentDetails) other;
            return Intrinsics.areEqual(this.details, consumerPaymentDetails.details) && Intrinsics.areEqual(this.collectedCvc, consumerPaymentDetails.collectedCvc) && Intrinsics.areEqual(this.billingPhone, consumerPaymentDetails.billingPhone);
        }

        public int hashCode() {
            int iHashCode = this.details.hashCode() * 31;
            String str = this.collectedCvc;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.billingPhone;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ConsumerPaymentDetails(details=" + this.details + ", collectedCvc=" + this.collectedCvc + ", billingPhone=" + this.billingPhone + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.details, flags);
            dest.writeString(this.collectedCvc);
            dest.writeString(this.billingPhone);
        }

        @Override // com.stripe.android.link.LinkPaymentMethod
        public ConsumerPaymentDetails.PaymentDetails getDetails() {
            return this.details;
        }

        @Override // com.stripe.android.link.LinkPaymentMethod
        public String getCollectedCvc() {
            return this.collectedCvc;
        }

        @Override // com.stripe.android.link.LinkPaymentMethod
        public String getBillingPhone() {
            return this.billingPhone;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsumerPaymentDetails(ConsumerPaymentDetails.PaymentDetails details, String str, String str2) {
            super(details, str, str2, null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
            this.collectedCvc = str;
            this.billingPhone = str2;
        }
    }

    /* compiled from: LinkPaymentMethod.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;", "Lcom/stripe/android/link/LinkPaymentMethod;", "linkPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails;", "collectedCvc", "", "billingPhone", "<init>", "(Lcom/stripe/android/link/LinkPaymentDetails;Ljava/lang/String;Ljava/lang/String;)V", "getLinkPaymentDetails", "()Lcom/stripe/android/link/LinkPaymentDetails;", "getCollectedCvc", "()Ljava/lang/String;", "getBillingPhone", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkPaymentDetails extends LinkPaymentMethod {
        private final String billingPhone;
        private final String collectedCvc;
        private final com.stripe.android.link.LinkPaymentDetails linkPaymentDetails;
        public static final Parcelable.Creator<LinkPaymentDetails> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkPaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LinkPaymentDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkPaymentDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkPaymentDetails((com.stripe.android.link.LinkPaymentDetails) parcel.readParcelable(LinkPaymentDetails.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkPaymentDetails[] newArray(int i) {
                return new LinkPaymentDetails[i];
            }
        }

        public static /* synthetic */ LinkPaymentDetails copy$default(LinkPaymentDetails linkPaymentDetails, com.stripe.android.link.LinkPaymentDetails linkPaymentDetails2, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                linkPaymentDetails2 = linkPaymentDetails.linkPaymentDetails;
            }
            if ((i & 2) != 0) {
                str = linkPaymentDetails.collectedCvc;
            }
            if ((i & 4) != 0) {
                str2 = linkPaymentDetails.billingPhone;
            }
            return linkPaymentDetails.copy(linkPaymentDetails2, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.stripe.android.link.LinkPaymentDetails getLinkPaymentDetails() {
            return this.linkPaymentDetails;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCollectedCvc() {
            return this.collectedCvc;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBillingPhone() {
            return this.billingPhone;
        }

        public final LinkPaymentDetails copy(com.stripe.android.link.LinkPaymentDetails linkPaymentDetails, String collectedCvc, String billingPhone) {
            Intrinsics.checkNotNullParameter(linkPaymentDetails, "linkPaymentDetails");
            return new LinkPaymentDetails(linkPaymentDetails, collectedCvc, billingPhone);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkPaymentDetails)) {
                return false;
            }
            LinkPaymentDetails linkPaymentDetails = (LinkPaymentDetails) other;
            return Intrinsics.areEqual(this.linkPaymentDetails, linkPaymentDetails.linkPaymentDetails) && Intrinsics.areEqual(this.collectedCvc, linkPaymentDetails.collectedCvc) && Intrinsics.areEqual(this.billingPhone, linkPaymentDetails.billingPhone);
        }

        public int hashCode() {
            int iHashCode = this.linkPaymentDetails.hashCode() * 31;
            String str = this.collectedCvc;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.billingPhone;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "LinkPaymentDetails(linkPaymentDetails=" + this.linkPaymentDetails + ", collectedCvc=" + this.collectedCvc + ", billingPhone=" + this.billingPhone + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.linkPaymentDetails, flags);
            dest.writeString(this.collectedCvc);
            dest.writeString(this.billingPhone);
        }

        public final com.stripe.android.link.LinkPaymentDetails getLinkPaymentDetails() {
            return this.linkPaymentDetails;
        }

        @Override // com.stripe.android.link.LinkPaymentMethod
        public String getCollectedCvc() {
            return this.collectedCvc;
        }

        @Override // com.stripe.android.link.LinkPaymentMethod
        public String getBillingPhone() {
            return this.billingPhone;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkPaymentDetails(com.stripe.android.link.LinkPaymentDetails linkPaymentDetails, String str, String str2) {
            super(linkPaymentDetails.getPaymentDetails(), str, str2, null);
            Intrinsics.checkNotNullParameter(linkPaymentDetails, "linkPaymentDetails");
            this.linkPaymentDetails = linkPaymentDetails;
            this.collectedCvc = str;
            this.billingPhone = str2;
        }
    }
}
