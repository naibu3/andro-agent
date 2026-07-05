package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPaymentMethodResultHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H ¢\u0006\u0002\b\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;", "Landroid/os/Parcelable;", "<init>", "()V", "toPaymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "toPaymentResult$paymentsheet_release", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Companion", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Completed;", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ExternalPaymentMethodResult implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ ExternalPaymentMethodResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final ExternalPaymentMethodResult canceled() {
        return INSTANCE.canceled();
    }

    @JvmStatic
    public static final ExternalPaymentMethodResult completed() {
        return INSTANCE.completed();
    }

    @JvmStatic
    public static final ExternalPaymentMethodResult failed() {
        return INSTANCE.failed();
    }

    @JvmStatic
    public static final ExternalPaymentMethodResult failed(String str) {
        return INSTANCE.failed(str);
    }

    public abstract PaymentResult toPaymentResult$paymentsheet_release();

    private ExternalPaymentMethodResult() {
    }

    /* compiled from: ExternalPaymentMethodResultHandler.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0010¢\u0006\u0002\b\u0006J\u0006\u0010\n\u001a\u00020\bJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bR\u0014\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Completed;", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;", "<init>", "()V", "toPaymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "toPaymentResult$paymentsheet_release", "RESULT_CODE", "", "getRESULT_CODE$annotations", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Completed extends ExternalPaymentMethodResult {
        public static final int RESULT_CODE = -1;
        public static final Completed INSTANCE = new Completed();
        public static final Parcelable.Creator<Completed> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ExternalPaymentMethodResultHandler.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Completed.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed[] newArray(int i) {
                return new Completed[i];
            }
        }

        public static /* synthetic */ void getRESULT_CODE$annotations() {
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
            return true;
        }

        public int hashCode() {
            return 523547124;
        }

        public String toString() {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Completed() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.ExternalPaymentMethodResult
        public PaymentResult toPaymentResult$paymentsheet_release() {
            return PaymentResult.Completed.INSTANCE;
        }
    }

    /* compiled from: ExternalPaymentMethodResultHandler.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0010¢\u0006\u0002\b\u0006J\u0006\u0010\n\u001a\u00020\bJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bR\u0014\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;", "<init>", "()V", "toPaymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "toPaymentResult$paymentsheet_release", "RESULT_CODE", "", "getRESULT_CODE$annotations", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Canceled extends ExternalPaymentMethodResult {
        public static final int RESULT_CODE = 0;
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ExternalPaymentMethodResultHandler.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Canceled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        public static /* synthetic */ void getRESULT_CODE$annotations() {
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
            return true;
        }

        public int hashCode() {
            return -1307955248;
        }

        public String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Canceled() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.ExternalPaymentMethodResult
        public PaymentResult toPaymentResult$paymentsheet_release() {
            return PaymentResult.Canceled.INSTANCE;
        }
    }

    /* compiled from: ExternalPaymentMethodResultHandler.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;", "displayMessage", "", "<init>", "(Ljava/lang/String;)V", "getDisplayMessage", "()Ljava/lang/String;", "toPaymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "toPaymentResult$paymentsheet_release", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed extends ExternalPaymentMethodResult {
        public static final String DISPLAY_MESSAGE_EXTRA = "external_payment_method_error_message";
        public static final int RESULT_CODE = 1;
        private final String displayMessage;
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ExternalPaymentMethodResultHandler.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.displayMessage;
            }
            return failed.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayMessage() {
            return this.displayMessage;
        }

        public final Failed copy(String displayMessage) {
            return new Failed(displayMessage);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.displayMessage, ((Failed) other).displayMessage);
        }

        public int hashCode() {
            String str = this.displayMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Failed(displayMessage=" + this.displayMessage + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.displayMessage);
        }

        public final String getDisplayMessage() {
            return this.displayMessage;
        }

        public Failed(String str) {
            super(null);
            this.displayMessage = str;
        }

        @Override // com.stripe.android.paymentsheet.ExternalPaymentMethodResult
        public PaymentResult toPaymentResult$paymentsheet_release() {
            return new PaymentResult.Failed(new LocalStripeException(this.displayMessage, "externalPaymentMethodFailure"));
        }
    }

    /* compiled from: ExternalPaymentMethodResultHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0014\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;", "", "<init>", "()V", "completed", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;", "canceled", "failed", "displayMessage", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ExternalPaymentMethodResult failed() {
            return failed$default(this, null, 1, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final ExternalPaymentMethodResult completed() {
            return Completed.INSTANCE;
        }

        @JvmStatic
        public final ExternalPaymentMethodResult canceled() {
            return Canceled.INSTANCE;
        }

        public static /* synthetic */ ExternalPaymentMethodResult failed$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.failed(str);
        }

        @JvmStatic
        public final ExternalPaymentMethodResult failed(String displayMessage) {
            return new Failed(displayMessage);
        }
    }
}
