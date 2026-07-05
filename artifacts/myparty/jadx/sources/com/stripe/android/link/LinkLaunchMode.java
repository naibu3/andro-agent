package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.stripe.android.model.ConsumerPaymentDetails;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkLaunchMode.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkLaunchMode;", "Landroid/os/Parcelable;", "selectedPayment", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "PaymentMethodSelection", "Full", "Confirmation", "Authentication", "Lcom/stripe/android/link/LinkLaunchMode$Authentication;", "Lcom/stripe/android/link/LinkLaunchMode$Confirmation;", "Lcom/stripe/android/link/LinkLaunchMode$Full;", "Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkLaunchMode extends Parcelable {
    ConsumerPaymentDetails.PaymentDetails selectedPayment();

    /* compiled from: LinkLaunchMode.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;", "Lcom/stripe/android/link/LinkLaunchMode;", "selectedPayment", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "sharePaymentDetailsImmediatelyAfterCreation", "", ViewHierarchyConstants.HINT_KEY, "", "<init>", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLjava/lang/String;)V", "getSelectedPayment", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getSharePaymentDetailsImmediatelyAfterCreation", "()Z", "getHint", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethodSelection implements LinkLaunchMode {
        private final String hint;
        private final ConsumerPaymentDetails.PaymentDetails selectedPayment;
        private final boolean sharePaymentDetailsImmediatelyAfterCreation;
        public static final Parcelable.Creator<PaymentMethodSelection> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkLaunchMode.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentMethodSelection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodSelection createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentMethodSelection((ConsumerPaymentDetails.PaymentDetails) parcel.readParcelable(PaymentMethodSelection.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodSelection[] newArray(int i) {
                return new PaymentMethodSelection[i];
            }
        }

        public static /* synthetic */ PaymentMethodSelection copy$default(PaymentMethodSelection paymentMethodSelection, ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentDetails = paymentMethodSelection.selectedPayment;
            }
            if ((i & 2) != 0) {
                z = paymentMethodSelection.sharePaymentDetailsImmediatelyAfterCreation;
            }
            if ((i & 4) != 0) {
                str = paymentMethodSelection.hint;
            }
            return paymentMethodSelection.copy(paymentDetails, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ConsumerPaymentDetails.PaymentDetails getSelectedPayment() {
            return this.selectedPayment;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSharePaymentDetailsImmediatelyAfterCreation() {
            return this.sharePaymentDetailsImmediatelyAfterCreation;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        public final PaymentMethodSelection copy(ConsumerPaymentDetails.PaymentDetails selectedPayment, boolean sharePaymentDetailsImmediatelyAfterCreation, String hint) {
            return new PaymentMethodSelection(selectedPayment, sharePaymentDetailsImmediatelyAfterCreation, hint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethodSelection)) {
                return false;
            }
            PaymentMethodSelection paymentMethodSelection = (PaymentMethodSelection) other;
            return Intrinsics.areEqual(this.selectedPayment, paymentMethodSelection.selectedPayment) && this.sharePaymentDetailsImmediatelyAfterCreation == paymentMethodSelection.sharePaymentDetailsImmediatelyAfterCreation && Intrinsics.areEqual(this.hint, paymentMethodSelection.hint);
        }

        public int hashCode() {
            ConsumerPaymentDetails.PaymentDetails paymentDetails = this.selectedPayment;
            int iHashCode = (((paymentDetails == null ? 0 : paymentDetails.hashCode()) * 31) + Boolean.hashCode(this.sharePaymentDetailsImmediatelyAfterCreation)) * 31;
            String str = this.hint;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "PaymentMethodSelection(selectedPayment=" + this.selectedPayment + ", sharePaymentDetailsImmediatelyAfterCreation=" + this.sharePaymentDetailsImmediatelyAfterCreation + ", hint=" + this.hint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.selectedPayment, flags);
            dest.writeInt(this.sharePaymentDetailsImmediatelyAfterCreation ? 1 : 0);
            dest.writeString(this.hint);
        }

        @Override // com.stripe.android.link.LinkLaunchMode
        public ConsumerPaymentDetails.PaymentDetails selectedPayment() {
            return DefaultImpls.selectedPayment(this);
        }

        public PaymentMethodSelection(ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, String str) {
            this.selectedPayment = paymentDetails;
            this.sharePaymentDetailsImmediatelyAfterCreation = z;
            this.hint = str;
        }

        public /* synthetic */ PaymentMethodSelection(ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentDetails, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str);
        }

        public final ConsumerPaymentDetails.PaymentDetails getSelectedPayment() {
            return this.selectedPayment;
        }

        public final boolean getSharePaymentDetailsImmediatelyAfterCreation() {
            return this.sharePaymentDetailsImmediatelyAfterCreation;
        }

        public final String getHint() {
            return this.hint;
        }
    }

    /* compiled from: LinkLaunchMode.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/LinkLaunchMode$Full;", "Lcom/stripe/android/link/LinkLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Full implements LinkLaunchMode {
        public static final Full INSTANCE = new Full();
        public static final Parcelable.Creator<Full> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkLaunchMode.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Full> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Full createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Full.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Full[] newArray(int i) {
                return new Full[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Full)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 115601132;
        }

        public String toString() {
            return "Full";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Full() {
        }

        @Override // com.stripe.android.link.LinkLaunchMode
        public ConsumerPaymentDetails.PaymentDetails selectedPayment() {
            return DefaultImpls.selectedPayment(this);
        }
    }

    /* compiled from: LinkLaunchMode.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/link/LinkLaunchMode$Confirmation;", "Lcom/stripe/android/link/LinkLaunchMode;", "selectedPayment", "Lcom/stripe/android/link/LinkPaymentMethod;", "<init>", "(Lcom/stripe/android/link/LinkPaymentMethod;)V", "getSelectedPayment", "()Lcom/stripe/android/link/LinkPaymentMethod;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Confirmation implements LinkLaunchMode {
        private final LinkPaymentMethod selectedPayment;
        public static final Parcelable.Creator<Confirmation> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkLaunchMode.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Confirmation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Confirmation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation((LinkPaymentMethod) parcel.readParcelable(Confirmation.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Confirmation[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public static /* synthetic */ Confirmation copy$default(Confirmation confirmation, LinkPaymentMethod linkPaymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                linkPaymentMethod = confirmation.selectedPayment;
            }
            return confirmation.copy(linkPaymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkPaymentMethod getSelectedPayment() {
            return this.selectedPayment;
        }

        public final Confirmation copy(LinkPaymentMethod selectedPayment) {
            Intrinsics.checkNotNullParameter(selectedPayment, "selectedPayment");
            return new Confirmation(selectedPayment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Confirmation) && Intrinsics.areEqual(this.selectedPayment, ((Confirmation) other).selectedPayment);
        }

        public int hashCode() {
            return this.selectedPayment.hashCode();
        }

        public String toString() {
            return "Confirmation(selectedPayment=" + this.selectedPayment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.selectedPayment, flags);
        }

        @Override // com.stripe.android.link.LinkLaunchMode
        public ConsumerPaymentDetails.PaymentDetails selectedPayment() {
            return DefaultImpls.selectedPayment(this);
        }

        public Confirmation(LinkPaymentMethod selectedPayment) {
            Intrinsics.checkNotNullParameter(selectedPayment, "selectedPayment");
            this.selectedPayment = selectedPayment;
        }

        public final LinkPaymentMethod getSelectedPayment() {
            return this.selectedPayment;
        }
    }

    /* compiled from: LinkLaunchMode.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/LinkLaunchMode$Authentication;", "Lcom/stripe/android/link/LinkLaunchMode;", "existingOnly", "", "<init>", "(Z)V", "getExistingOnly", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Authentication implements LinkLaunchMode {
        private final boolean existingOnly;
        public static final Parcelable.Creator<Authentication> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkLaunchMode.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Authentication> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Authentication createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Authentication(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Authentication[] newArray(int i) {
                return new Authentication[i];
            }
        }

        public Authentication() {
            this(false, 1, null);
        }

        public static /* synthetic */ Authentication copy$default(Authentication authentication, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = authentication.existingOnly;
            }
            return authentication.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getExistingOnly() {
            return this.existingOnly;
        }

        public final Authentication copy(boolean existingOnly) {
            return new Authentication(existingOnly);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Authentication) && this.existingOnly == ((Authentication) other).existingOnly;
        }

        public int hashCode() {
            return Boolean.hashCode(this.existingOnly);
        }

        public String toString() {
            return "Authentication(existingOnly=" + this.existingOnly + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.existingOnly ? 1 : 0);
        }

        @Override // com.stripe.android.link.LinkLaunchMode
        public ConsumerPaymentDetails.PaymentDetails selectedPayment() {
            return DefaultImpls.selectedPayment(this);
        }

        public Authentication(boolean z) {
            this.existingOnly = z;
        }

        public /* synthetic */ Authentication(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getExistingOnly() {
            return this.existingOnly;
        }
    }

    /* compiled from: LinkLaunchMode.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static ConsumerPaymentDetails.PaymentDetails selectedPayment(LinkLaunchMode linkLaunchMode) {
            if ((linkLaunchMode instanceof Authentication) || (linkLaunchMode instanceof Full)) {
                return null;
            }
            if (linkLaunchMode instanceof Confirmation) {
                return ((Confirmation) linkLaunchMode).getSelectedPayment().getDetails();
            }
            if (linkLaunchMode instanceof PaymentMethodSelection) {
                return ((PaymentMethodSelection) linkLaunchMode).getSelectedPayment();
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
