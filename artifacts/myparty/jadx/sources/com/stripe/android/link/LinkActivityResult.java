package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.model.ConsumerShippingAddress;
import com.stripe.android.model.PaymentMethod;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkActivityResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/link/LinkActivityResult;", "Landroid/os/Parcelable;", "<init>", "()V", "linkAccountUpdate", "Lcom/stripe/android/link/LinkAccountUpdate;", "getLinkAccountUpdate", "()Lcom/stripe/android/link/LinkAccountUpdate;", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "PaymentMethodObtained", "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/link/LinkActivityResult$Canceled;", "Lcom/stripe/android/link/LinkActivityResult$Completed;", "Lcom/stripe/android/link/LinkActivityResult$Failed;", "Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LinkActivityResult implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ LinkActivityResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract LinkAccountUpdate getLinkAccountUpdate();

    private LinkActivityResult() {
    }

    /* compiled from: LinkActivityResult.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/stripe/android/link/LinkActivityResult$Completed;", "Lcom/stripe/android/link/LinkActivityResult;", "linkAccountUpdate", "Lcom/stripe/android/link/LinkAccountUpdate;", "selectedPayment", "Lcom/stripe/android/link/LinkPaymentMethod;", "shippingAddress", "Lcom/stripe/android/model/ConsumerShippingAddress;", "<init>", "(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)V", "getLinkAccountUpdate", "()Lcom/stripe/android/link/LinkAccountUpdate;", "getSelectedPayment", "()Lcom/stripe/android/link/LinkPaymentMethod;", "getShippingAddress", "()Lcom/stripe/android/model/ConsumerShippingAddress;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Completed extends LinkActivityResult {
        private final LinkAccountUpdate linkAccountUpdate;
        private final LinkPaymentMethod selectedPayment;
        private final ConsumerShippingAddress shippingAddress;
        public static final Parcelable.Creator<Completed> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Completed((LinkAccountUpdate) parcel.readParcelable(Completed.class.getClassLoader()), (LinkPaymentMethod) parcel.readParcelable(Completed.class.getClassLoader()), (ConsumerShippingAddress) parcel.readParcelable(Completed.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed[] newArray(int i) {
                return new Completed[i];
            }
        }

        public static /* synthetic */ Completed copy$default(Completed completed, LinkAccountUpdate linkAccountUpdate, LinkPaymentMethod linkPaymentMethod, ConsumerShippingAddress consumerShippingAddress, int i, Object obj) {
            if ((i & 1) != 0) {
                linkAccountUpdate = completed.linkAccountUpdate;
            }
            if ((i & 2) != 0) {
                linkPaymentMethod = completed.selectedPayment;
            }
            if ((i & 4) != 0) {
                consumerShippingAddress = completed.shippingAddress;
            }
            return completed.copy(linkAccountUpdate, linkPaymentMethod, consumerShippingAddress);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkAccountUpdate getLinkAccountUpdate() {
            return this.linkAccountUpdate;
        }

        /* renamed from: component2, reason: from getter */
        public final LinkPaymentMethod getSelectedPayment() {
            return this.selectedPayment;
        }

        /* renamed from: component3, reason: from getter */
        public final ConsumerShippingAddress getShippingAddress() {
            return this.shippingAddress;
        }

        public final Completed copy(LinkAccountUpdate linkAccountUpdate, LinkPaymentMethod selectedPayment, ConsumerShippingAddress shippingAddress) {
            Intrinsics.checkNotNullParameter(linkAccountUpdate, "linkAccountUpdate");
            return new Completed(linkAccountUpdate, selectedPayment, shippingAddress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return Intrinsics.areEqual(this.linkAccountUpdate, completed.linkAccountUpdate) && Intrinsics.areEqual(this.selectedPayment, completed.selectedPayment) && Intrinsics.areEqual(this.shippingAddress, completed.shippingAddress);
        }

        public int hashCode() {
            int iHashCode = this.linkAccountUpdate.hashCode() * 31;
            LinkPaymentMethod linkPaymentMethod = this.selectedPayment;
            int iHashCode2 = (iHashCode + (linkPaymentMethod == null ? 0 : linkPaymentMethod.hashCode())) * 31;
            ConsumerShippingAddress consumerShippingAddress = this.shippingAddress;
            return iHashCode2 + (consumerShippingAddress != null ? consumerShippingAddress.hashCode() : 0);
        }

        public String toString() {
            return "Completed(linkAccountUpdate=" + this.linkAccountUpdate + ", selectedPayment=" + this.selectedPayment + ", shippingAddress=" + this.shippingAddress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.linkAccountUpdate, flags);
            dest.writeParcelable(this.selectedPayment, flags);
            dest.writeParcelable(this.shippingAddress, flags);
        }

        public /* synthetic */ Completed(LinkAccountUpdate linkAccountUpdate, LinkPaymentMethod linkPaymentMethod, ConsumerShippingAddress consumerShippingAddress, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(linkAccountUpdate, (i & 2) != 0 ? null : linkPaymentMethod, (i & 4) != 0 ? null : consumerShippingAddress);
        }

        @Override // com.stripe.android.link.LinkActivityResult
        public LinkAccountUpdate getLinkAccountUpdate() {
            return this.linkAccountUpdate;
        }

        public final LinkPaymentMethod getSelectedPayment() {
            return this.selectedPayment;
        }

        public final ConsumerShippingAddress getShippingAddress() {
            return this.shippingAddress;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(LinkAccountUpdate linkAccountUpdate, LinkPaymentMethod linkPaymentMethod, ConsumerShippingAddress consumerShippingAddress) {
            super(null);
            Intrinsics.checkNotNullParameter(linkAccountUpdate, "linkAccountUpdate");
            this.linkAccountUpdate = linkAccountUpdate;
            this.selectedPayment = linkPaymentMethod;
            this.shippingAddress = consumerShippingAddress;
        }
    }

    /* compiled from: LinkActivityResult.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;", "Lcom/stripe/android/link/LinkActivityResult;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "linkAccountUpdate", "Lcom/stripe/android/link/LinkAccountUpdate;", "getLinkAccountUpdate", "()Lcom/stripe/android/link/LinkAccountUpdate;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethodObtained extends LinkActivityResult {
        private final PaymentMethod paymentMethod;
        public static final Parcelable.Creator<PaymentMethodObtained> CREATOR = new Creator();
        public static final int $stable = PaymentMethod.$stable;

        /* compiled from: LinkActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentMethodObtained> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodObtained createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentMethodObtained((PaymentMethod) parcel.readParcelable(PaymentMethodObtained.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodObtained[] newArray(int i) {
                return new PaymentMethodObtained[i];
            }
        }

        public static /* synthetic */ PaymentMethodObtained copy$default(PaymentMethodObtained paymentMethodObtained, PaymentMethod paymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = paymentMethodObtained.paymentMethod;
            }
            return paymentMethodObtained.copy(paymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final PaymentMethodObtained copy(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new PaymentMethodObtained(paymentMethod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentMethodObtained) && Intrinsics.areEqual(this.paymentMethod, ((PaymentMethodObtained) other).paymentMethod);
        }

        @Override // com.stripe.android.link.LinkActivityResult
        public LinkAccountUpdate getLinkAccountUpdate() {
            return null;
        }

        public int hashCode() {
            return this.paymentMethod.hashCode();
        }

        public String toString() {
            return "PaymentMethodObtained(paymentMethod=" + this.paymentMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentMethod, flags);
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethodObtained(PaymentMethod paymentMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
        }
    }

    /* compiled from: LinkActivityResult.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/link/LinkActivityResult$Canceled;", "Lcom/stripe/android/link/LinkActivityResult;", "reason", "Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;", "linkAccountUpdate", "Lcom/stripe/android/link/LinkAccountUpdate;", "<init>", "(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)V", "getReason", "()Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;", "getLinkAccountUpdate", "()Lcom/stripe/android/link/LinkAccountUpdate;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Reason", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Canceled extends LinkActivityResult {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        private final LinkAccountUpdate linkAccountUpdate;
        private final Reason reason;

        /* compiled from: LinkActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Canceled(Reason.valueOf(parcel.readString()), (LinkAccountUpdate) parcel.readParcelable(Canceled.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, Reason reason, LinkAccountUpdate linkAccountUpdate, int i, Object obj) {
            if ((i & 1) != 0) {
                reason = canceled.reason;
            }
            if ((i & 2) != 0) {
                linkAccountUpdate = canceled.linkAccountUpdate;
            }
            return canceled.copy(reason, linkAccountUpdate);
        }

        /* renamed from: component1, reason: from getter */
        public final Reason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final LinkAccountUpdate getLinkAccountUpdate() {
            return this.linkAccountUpdate;
        }

        public final Canceled copy(Reason reason, LinkAccountUpdate linkAccountUpdate) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(linkAccountUpdate, "linkAccountUpdate");
            return new Canceled(reason, linkAccountUpdate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Canceled)) {
                return false;
            }
            Canceled canceled = (Canceled) other;
            return this.reason == canceled.reason && Intrinsics.areEqual(this.linkAccountUpdate, canceled.linkAccountUpdate);
        }

        public int hashCode() {
            return (this.reason.hashCode() * 31) + this.linkAccountUpdate.hashCode();
        }

        public String toString() {
            return "Canceled(reason=" + this.reason + ", linkAccountUpdate=" + this.linkAccountUpdate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.reason.name());
            dest.writeParcelable(this.linkAccountUpdate, flags);
        }

        public /* synthetic */ Canceled(Reason reason, LinkAccountUpdate linkAccountUpdate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Reason.BackPressed : reason, linkAccountUpdate);
        }

        public final Reason getReason() {
            return this.reason;
        }

        @Override // com.stripe.android.link.LinkActivityResult
        public LinkAccountUpdate getLinkAccountUpdate() {
            return this.linkAccountUpdate;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LinkActivityResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "BackPressed", "LoggedOut", "PayAnotherWay", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Reason {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Reason[] $VALUES;
            public static final Reason BackPressed = new Reason("BackPressed", 0);
            public static final Reason LoggedOut = new Reason("LoggedOut", 1);
            public static final Reason PayAnotherWay = new Reason("PayAnotherWay", 2);

            private static final /* synthetic */ Reason[] $values() {
                return new Reason[]{BackPressed, LoggedOut, PayAnotherWay};
            }

            public static EnumEntries<Reason> getEntries() {
                return $ENTRIES;
            }

            private Reason(String str, int i) {
            }

            static {
                Reason[] reasonArr$values = $values();
                $VALUES = reasonArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(reasonArr$values);
            }

            public static Reason valueOf(String str) {
                return (Reason) Enum.valueOf(Reason.class, str);
            }

            public static Reason[] values() {
                return (Reason[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(Reason reason, LinkAccountUpdate linkAccountUpdate) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(linkAccountUpdate, "linkAccountUpdate");
            this.reason = reason;
            this.linkAccountUpdate = linkAccountUpdate;
        }
    }

    /* compiled from: LinkActivityResult.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/link/LinkActivityResult$Failed;", "Lcom/stripe/android/link/LinkActivityResult;", "error", "", "linkAccountUpdate", "Lcom/stripe/android/link/LinkAccountUpdate;", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/link/LinkAccountUpdate;)V", "getError", "()Ljava/lang/Throwable;", "getLinkAccountUpdate", "()Lcom/stripe/android/link/LinkAccountUpdate;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed extends LinkActivityResult {
        private final Throwable error;
        private final LinkAccountUpdate linkAccountUpdate;
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed((Throwable) parcel.readSerializable(), (LinkAccountUpdate) parcel.readParcelable(Failed.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, LinkAccountUpdate linkAccountUpdate, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failed.error;
            }
            if ((i & 2) != 0) {
                linkAccountUpdate = failed.linkAccountUpdate;
            }
            return failed.copy(th, linkAccountUpdate);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final LinkAccountUpdate getLinkAccountUpdate() {
            return this.linkAccountUpdate;
        }

        public final Failed copy(Throwable error, LinkAccountUpdate linkAccountUpdate) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(linkAccountUpdate, "linkAccountUpdate");
            return new Failed(error, linkAccountUpdate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.error, failed.error) && Intrinsics.areEqual(this.linkAccountUpdate, failed.linkAccountUpdate);
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + this.linkAccountUpdate.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.error + ", linkAccountUpdate=" + this.linkAccountUpdate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.error);
            dest.writeParcelable(this.linkAccountUpdate, flags);
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.stripe.android.link.LinkActivityResult
        public LinkAccountUpdate getLinkAccountUpdate() {
            return this.linkAccountUpdate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error, LinkAccountUpdate linkAccountUpdate) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(linkAccountUpdate, "linkAccountUpdate");
            this.error = error;
            this.linkAccountUpdate = linkAccountUpdate;
        }
    }
}
