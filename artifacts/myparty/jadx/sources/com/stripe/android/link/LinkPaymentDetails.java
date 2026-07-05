package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.ui.core.forms.ConvertToFormValuesMapKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkPaymentDetails.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/link/LinkPaymentDetails;", "Landroid/os/Parcelable;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "<init>", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/model/PaymentMethodCreateParams;)V", "getPaymentDetails", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "Saved", "New", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LinkPaymentDetails implements Parcelable {
    public static final int $stable = 8;
    private final ConsumerPaymentDetails.PaymentDetails paymentDetails;
    private final PaymentMethodCreateParams paymentMethodCreateParams;

    public /* synthetic */ LinkPaymentDetails(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentDetails, paymentMethodCreateParams);
    }

    private LinkPaymentDetails(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
        this.paymentDetails = paymentDetails;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
    }

    public ConsumerPaymentDetails.PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    /* compiled from: LinkPaymentDetails.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "Lcom/stripe/android/link/LinkPaymentDetails;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "<init>", "(Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;Lcom/stripe/android/model/PaymentMethodCreateParams;)V", "getPaymentDetails", "()Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Saved extends LinkPaymentDetails {
        private final ConsumerPaymentDetails.Passthrough paymentDetails;
        private final PaymentMethodCreateParams paymentMethodCreateParams;
        public static final Parcelable.Creator<Saved> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkPaymentDetails.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Saved> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Saved((ConsumerPaymentDetails.Passthrough) parcel.readParcelable(Saved.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(Saved.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved[] newArray(int i) {
                return new Saved[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentDetails, flags);
            dest.writeParcelable(this.paymentMethodCreateParams, flags);
        }

        @Override // com.stripe.android.link.LinkPaymentDetails
        public ConsumerPaymentDetails.Passthrough getPaymentDetails() {
            return this.paymentDetails;
        }

        @Override // com.stripe.android.link.LinkPaymentDetails
        public PaymentMethodCreateParams getPaymentMethodCreateParams() {
            return this.paymentMethodCreateParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Saved(ConsumerPaymentDetails.Passthrough paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            this.paymentDetails = paymentDetails;
            this.paymentMethodCreateParams = paymentMethodCreateParams;
        }
    }

    /* compiled from: LinkPaymentDetails.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/link/LinkPaymentDetails$New;", "Lcom/stripe/android/link/LinkPaymentDetails;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "originalParams", "<init>", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodCreateParams;)V", "getPaymentDetails", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getOriginalParams", "buildFormValues", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class New extends LinkPaymentDetails {
        private final PaymentMethodCreateParams originalParams;
        private final ConsumerPaymentDetails.PaymentDetails paymentDetails;
        private final PaymentMethodCreateParams paymentMethodCreateParams;
        public static final Parcelable.Creator<New> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkPaymentDetails.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<New> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new New((ConsumerPaymentDetails.PaymentDetails) parcel.readParcelable(New.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(New.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(New.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New[] newArray(int i) {
                return new New[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentDetails, flags);
            dest.writeParcelable(this.paymentMethodCreateParams, flags);
            dest.writeParcelable(this.originalParams, flags);
        }

        @Override // com.stripe.android.link.LinkPaymentDetails
        public ConsumerPaymentDetails.PaymentDetails getPaymentDetails() {
            return this.paymentDetails;
        }

        @Override // com.stripe.android.link.LinkPaymentDetails
        public PaymentMethodCreateParams getPaymentMethodCreateParams() {
            return this.paymentMethodCreateParams;
        }

        public final PaymentMethodCreateParams getOriginalParams() {
            return this.originalParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public New(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodCreateParams originalParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(originalParams, "originalParams");
            this.paymentDetails = paymentDetails;
            this.paymentMethodCreateParams = paymentMethodCreateParams;
            this.originalParams = originalParams;
        }

        public final Map<IdentifierSpec, String> buildFormValues() {
            return ConvertToFormValuesMapKt.convertToFormValuesMap(this.originalParams.toParamMap());
        }
    }
}
