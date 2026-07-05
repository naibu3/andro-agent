package com.stripe.android.customersheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.customersheet.CustomerSheetResult;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalCustomerSheetResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\r\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/customersheet/InternalCustomerSheetResult;", "Landroid/os/Parcelable;", "<init>", "()V", "toPublicResult", "Lcom/stripe/android/customersheet/CustomerSheetResult;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "toBundle", "Landroid/os/Bundle;", "toBundle$paymentsheet_release", "Selected", "Canceled", "Error", "Companion", "Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;", "Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Error;", "Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Selected;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class InternalCustomerSheetResult implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_RESULT = "extra_activity_result";

    public /* synthetic */ InternalCustomerSheetResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract CustomerSheetResult toPublicResult(PaymentOptionFactory paymentOptionFactory);

    private InternalCustomerSheetResult() {
    }

    /* compiled from: InternalCustomerSheetResult.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001a\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Selected;", "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "toPublicResult", "Lcom/stripe/android/customersheet/CustomerSheetResult;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "component1", "copy", "copy$paymentsheet_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Selected extends InternalCustomerSheetResult {
        private final PaymentSelection paymentSelection;
        public static final Parcelable.Creator<Selected> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: InternalCustomerSheetResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Selected> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Selected createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Selected((PaymentSelection) parcel.readParcelable(Selected.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Selected[] newArray(int i) {
                return new Selected[i];
            }
        }

        public static /* synthetic */ Selected copy$paymentsheet_release$default(Selected selected, PaymentSelection paymentSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSelection = selected.paymentSelection;
            }
            return selected.copy$paymentsheet_release(paymentSelection);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final Selected copy$paymentsheet_release(PaymentSelection paymentSelection) {
            return new Selected(paymentSelection);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Selected) && Intrinsics.areEqual(this.paymentSelection, ((Selected) other).paymentSelection);
        }

        public int hashCode() {
            PaymentSelection paymentSelection = this.paymentSelection;
            if (paymentSelection == null) {
                return 0;
            }
            return paymentSelection.hashCode();
        }

        public String toString() {
            return "Selected(paymentSelection=" + this.paymentSelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentSelection, flags);
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public Selected(PaymentSelection paymentSelection) {
            super(null);
            this.paymentSelection = paymentSelection;
        }

        @Override // com.stripe.android.customersheet.InternalCustomerSheetResult
        public CustomerSheetResult toPublicResult(PaymentOptionFactory paymentOptionFactory) {
            Intrinsics.checkNotNullParameter(paymentOptionFactory, "paymentOptionFactory");
            PaymentSelection paymentSelection = this.paymentSelection;
            return new CustomerSheetResult.Selected(paymentSelection != null ? CustomerSheet.INSTANCE.toPaymentOptionSelection$paymentsheet_release(paymentSelection, paymentOptionFactory, true) : null);
        }
    }

    /* compiled from: InternalCustomerSheetResult.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;", "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "toPublicResult", "Lcom/stripe/android/customersheet/CustomerSheetResult;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Canceled extends InternalCustomerSheetResult {
        private final PaymentSelection paymentSelection;
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: InternalCustomerSheetResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Canceled((PaymentSelection) parcel.readParcelable(Canceled.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, PaymentSelection paymentSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSelection = canceled.paymentSelection;
            }
            return canceled.copy(paymentSelection);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final Canceled copy(PaymentSelection paymentSelection) {
            return new Canceled(paymentSelection);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Canceled) && Intrinsics.areEqual(this.paymentSelection, ((Canceled) other).paymentSelection);
        }

        public int hashCode() {
            PaymentSelection paymentSelection = this.paymentSelection;
            if (paymentSelection == null) {
                return 0;
            }
            return paymentSelection.hashCode();
        }

        public String toString() {
            return "Canceled(paymentSelection=" + this.paymentSelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentSelection, flags);
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public Canceled(PaymentSelection paymentSelection) {
            super(null);
            this.paymentSelection = paymentSelection;
        }

        @Override // com.stripe.android.customersheet.InternalCustomerSheetResult
        public CustomerSheetResult toPublicResult(PaymentOptionFactory paymentOptionFactory) {
            Intrinsics.checkNotNullParameter(paymentOptionFactory, "paymentOptionFactory");
            PaymentSelection paymentSelection = this.paymentSelection;
            return new CustomerSheetResult.Canceled(paymentSelection != null ? CustomerSheet.INSTANCE.toPaymentOptionSelection$paymentsheet_release(paymentSelection, paymentOptionFactory, true) : null);
        }
    }

    /* compiled from: InternalCustomerSheetResult.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Error;", "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;", NotificationsService.EXCEPTION_KEY, "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "toPublicResult", "Lcom/stripe/android/customersheet/CustomerSheetResult;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error extends InternalCustomerSheetResult {
        private final Throwable exception;
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: InternalCustomerSheetResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error((Throwable) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.exception);
        }

        public final Throwable getException() {
            return this.exception;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        @Override // com.stripe.android.customersheet.InternalCustomerSheetResult
        public CustomerSheetResult toPublicResult(PaymentOptionFactory paymentOptionFactory) {
            Intrinsics.checkNotNullParameter(paymentOptionFactory, "paymentOptionFactory");
            return new CustomerSheetResult.Failed(this.exception);
        }
    }

    /* compiled from: InternalCustomerSheetResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Companion;", "", "<init>", "()V", "EXTRA_RESULT", "", "fromIntent", "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ InternalCustomerSheetResult fromIntent$paymentsheet_release(Intent intent) {
            if (intent != null) {
                return (InternalCustomerSheetResult) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }
    }

    public final Bundle toBundle$paymentsheet_release() {
        return BundleKt.bundleOf(TuplesKt.to("extra_activity_result", this));
    }
}
