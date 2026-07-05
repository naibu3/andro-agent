package com.stripe.android.paymentsheet.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetState;", "Landroid/os/Parcelable;", "Loading", "Full", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Loading;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentSheetState extends Parcelable {

    /* compiled from: PaymentSheetState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Loading;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Loading implements PaymentSheetState {
        public static final Loading INSTANCE = new Loading();
        public static final Parcelable.Creator<Loading> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheetState.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Loading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Loading() {
        }
    }

    /* compiled from: PaymentSheetState.kt */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003JA\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006:"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState;", "config", "Lcom/stripe/android/common/model/CommonConfiguration;", "customer", "Lcom/stripe/android/paymentsheet/state/CustomerState;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "validationError", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "<init>", "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V", "getConfig", "()Lcom/stripe/android/common/model/CommonConfiguration;", "getCustomer", "()Lcom/stripe/android/paymentsheet/state/CustomerState;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getValidationError", "()Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "getPaymentMethodMetadata", "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "showSavedPaymentMethods", "", "getShowSavedPaymentMethods", "()Z", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "getLinkConfiguration", "()Lcom/stripe/android/link/LinkConfiguration;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Full implements PaymentSheetState {
        private final CommonConfiguration config;
        private final CustomerState customer;
        private final PaymentMethodMetadata paymentMethodMetadata;
        private final PaymentSelection paymentSelection;
        private final PaymentSheetLoadingException validationError;
        public static final Parcelable.Creator<Full> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheetState.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Full> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Full createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Full(CommonConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CustomerState.CREATOR.createFromParcel(parcel), (PaymentSelection) parcel.readParcelable(Full.class.getClassLoader()), (PaymentSheetLoadingException) parcel.readSerializable(), PaymentMethodMetadata.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Full[] newArray(int i) {
                return new Full[i];
            }
        }

        public static /* synthetic */ Full copy$default(Full full, CommonConfiguration commonConfiguration, CustomerState customerState, PaymentSelection paymentSelection, PaymentSheetLoadingException paymentSheetLoadingException, PaymentMethodMetadata paymentMethodMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                commonConfiguration = full.config;
            }
            if ((i & 2) != 0) {
                customerState = full.customer;
            }
            if ((i & 4) != 0) {
                paymentSelection = full.paymentSelection;
            }
            if ((i & 8) != 0) {
                paymentSheetLoadingException = full.validationError;
            }
            if ((i & 16) != 0) {
                paymentMethodMetadata = full.paymentMethodMetadata;
            }
            PaymentMethodMetadata paymentMethodMetadata2 = paymentMethodMetadata;
            PaymentSelection paymentSelection2 = paymentSelection;
            return full.copy(commonConfiguration, customerState, paymentSelection2, paymentSheetLoadingException, paymentMethodMetadata2);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonConfiguration getConfig() {
            return this.config;
        }

        /* renamed from: component2, reason: from getter */
        public final CustomerState getCustomer() {
            return this.customer;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentSheetLoadingException getValidationError() {
            return this.validationError;
        }

        /* renamed from: component5, reason: from getter */
        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        public final Full copy(CommonConfiguration config, CustomerState customer, PaymentSelection paymentSelection, PaymentSheetLoadingException validationError, PaymentMethodMetadata paymentMethodMetadata) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            return new Full(config, customer, paymentSelection, validationError, paymentMethodMetadata);
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
            Full full = (Full) other;
            return Intrinsics.areEqual(this.config, full.config) && Intrinsics.areEqual(this.customer, full.customer) && Intrinsics.areEqual(this.paymentSelection, full.paymentSelection) && Intrinsics.areEqual(this.validationError, full.validationError) && Intrinsics.areEqual(this.paymentMethodMetadata, full.paymentMethodMetadata);
        }

        public int hashCode() {
            int iHashCode = this.config.hashCode() * 31;
            CustomerState customerState = this.customer;
            int iHashCode2 = (iHashCode + (customerState == null ? 0 : customerState.hashCode())) * 31;
            PaymentSelection paymentSelection = this.paymentSelection;
            int iHashCode3 = (iHashCode2 + (paymentSelection == null ? 0 : paymentSelection.hashCode())) * 31;
            PaymentSheetLoadingException paymentSheetLoadingException = this.validationError;
            return ((iHashCode3 + (paymentSheetLoadingException != null ? paymentSheetLoadingException.hashCode() : 0)) * 31) + this.paymentMethodMetadata.hashCode();
        }

        public String toString() {
            return "Full(config=" + this.config + ", customer=" + this.customer + ", paymentSelection=" + this.paymentSelection + ", validationError=" + this.validationError + ", paymentMethodMetadata=" + this.paymentMethodMetadata + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.config.writeToParcel(dest, flags);
            CustomerState customerState = this.customer;
            if (customerState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customerState.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.paymentSelection, flags);
            dest.writeSerializable(this.validationError);
            this.paymentMethodMetadata.writeToParcel(dest, flags);
        }

        public Full(CommonConfiguration config, CustomerState customerState, PaymentSelection paymentSelection, PaymentSheetLoadingException paymentSheetLoadingException, PaymentMethodMetadata paymentMethodMetadata) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            this.config = config;
            this.customer = customerState;
            this.paymentSelection = paymentSelection;
            this.validationError = paymentSheetLoadingException;
            this.paymentMethodMetadata = paymentMethodMetadata;
        }

        public final CommonConfiguration getConfig() {
            return this.config;
        }

        public final CustomerState getCustomer() {
            return this.customer;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final PaymentSheetLoadingException getValidationError() {
            return this.validationError;
        }

        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Full(PaymentElementLoader.State state) {
            this(state.getConfig(), state.getCustomer(), state.getPaymentSelection(), state.getValidationError(), state.getPaymentMethodMetadata());
            Intrinsics.checkNotNullParameter(state, "state");
        }

        public final boolean getShowSavedPaymentMethods() {
            CustomerState customerState = this.customer;
            return !(customerState == null || customerState.getPaymentMethods().isEmpty()) || this.paymentMethodMetadata.isGooglePayReady();
        }

        public final StripeIntent getStripeIntent() {
            return this.paymentMethodMetadata.getStripeIntent();
        }

        public final LinkConfiguration getLinkConfiguration() {
            LinkState linkState = this.paymentMethodMetadata.getLinkState();
            if (linkState != null) {
                return linkState.getConfiguration();
            }
            return null;
        }
    }
}
