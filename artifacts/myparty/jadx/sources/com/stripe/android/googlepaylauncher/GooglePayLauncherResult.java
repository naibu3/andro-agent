package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.api.Status;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.view.ActivityStarter;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.service.NotificationsService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;

/* compiled from: GooglePayLauncherResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \n2\u00020\u0001:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "Lcom/stripe/android/view/ActivityStarter$Result;", "<init>", "()V", "toBundle", "Landroid/os/Bundle;", "Error", "PaymentData", "Canceled", "Unavailable", "Companion", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Unavailable;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class GooglePayLauncherResult implements ActivityStarter.Result {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ GooglePayLauncherResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final GooglePayLauncherResult fromIntent(Intent intent) {
        return INSTANCE.fromIntent(intent);
    }

    private GooglePayLauncherResult() {
    }

    @Override // com.stripe.android.view.ActivityStarter.Result
    public Bundle toBundle() {
        return BundleKt.bundleOf(TuplesKt.to("extra_activity_result", this));
    }

    /* compiled from: GooglePayLauncherResult.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001'B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", NotificationsService.EXCEPTION_KEY, "", "googlePayStatus", "Lcom/google/android/gms/common/api/Status;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "<init>", "(Ljava/lang/Throwable;Lcom/google/android/gms/common/api/Status;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V", "getException", "()Ljava/lang/Throwable;", "getGooglePayStatus", "()Lcom/google/android/gms/common/api/Status;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends GooglePayLauncherResult {
        private final Throwable exception;
        private final Status googlePayStatus;
        private final PaymentMethod paymentMethod;
        private final ShippingInformation shippingInformation;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GooglePayLauncherResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Error.INSTANCE.create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.exception;
            }
            if ((i & 2) != 0) {
                status = error.googlePayStatus;
            }
            if ((i & 4) != 0) {
                paymentMethod = error.paymentMethod;
            }
            if ((i & 8) != 0) {
                shippingInformation = error.shippingInformation;
            }
            return error.copy(th, status, paymentMethod, shippingInformation);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        /* renamed from: component2, reason: from getter */
        public final Status getGooglePayStatus() {
            return this.googlePayStatus;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final ShippingInformation getShippingInformation() {
            return this.shippingInformation;
        }

        public final Error copy(Throwable exception, Status googlePayStatus, PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Error(exception, googlePayStatus, paymentMethod, shippingInformation);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.exception, error.exception) && Intrinsics.areEqual(this.googlePayStatus, error.googlePayStatus) && Intrinsics.areEqual(this.paymentMethod, error.paymentMethod) && Intrinsics.areEqual(this.shippingInformation, error.shippingInformation);
        }

        public int hashCode() {
            int iHashCode = this.exception.hashCode() * 31;
            Status status = this.googlePayStatus;
            int iHashCode2 = (iHashCode + (status == null ? 0 : status.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int iHashCode3 = (iHashCode2 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            ShippingInformation shippingInformation = this.shippingInformation;
            return iHashCode3 + (shippingInformation != null ? shippingInformation.hashCode() : 0);
        }

        public String toString() {
            return "Error(exception=" + this.exception + ", googlePayStatus=" + this.googlePayStatus + ", paymentMethod=" + this.paymentMethod + ", shippingInformation=" + this.shippingInformation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            INSTANCE.write(this, dest, flags);
        }

        public /* synthetic */ Error(Throwable th, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : status, (i & 4) != 0 ? null : paymentMethod, (i & 8) != 0 ? null : shippingInformation);
        }

        public final Throwable getException() {
            return this.exception;
        }

        public final Status getGooglePayStatus() {
            return this.googlePayStatus;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final ShippingInformation getShippingInformation() {
            return this.shippingInformation;
        }

        /* compiled from: GooglePayLauncherResult.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;", "<init>", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements Parceler<Error> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlinx.parcelize.Parceler
            public Error[] newArray(int i) {
                return (Error[]) Parceler.DefaultImpls.newArray(this, i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlinx.parcelize.Parceler
            public Error create(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Serializable serializable = parcel.readSerializable();
                Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type kotlin.Throwable");
                return new Error((Throwable) serializable, (Status) parcel.readParcelable(Status.class.getClassLoader()), null, null, 12, null);
            }

            @Override // kotlinx.parcelize.Parceler
            public void write(Error error, Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(error, "<this>");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.writeSerializable(error.getException());
                parcel.writeParcelable(error.getGooglePayStatus(), i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable exception, Status status, PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
            this.googlePayStatus = status;
            this.paymentMethod = paymentMethod;
            this.shippingInformation = shippingInformation;
        }
    }

    /* compiled from: GooglePayLauncherResult.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentData extends GooglePayLauncherResult {
        private final PaymentMethod paymentMethod;
        private final ShippingInformation shippingInformation;
        public static final Parcelable.Creator<PaymentData> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GooglePayLauncherResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentData(PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentData[] newArray(int i) {
                return new PaymentData[i];
            }
        }

        public static /* synthetic */ PaymentData copy$default(PaymentData paymentData, PaymentMethod paymentMethod, ShippingInformation shippingInformation, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = paymentData.paymentMethod;
            }
            if ((i & 2) != 0) {
                shippingInformation = paymentData.shippingInformation;
            }
            return paymentData.copy(paymentMethod, shippingInformation);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component2, reason: from getter */
        public final ShippingInformation getShippingInformation() {
            return this.shippingInformation;
        }

        public final PaymentData copy(PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new PaymentData(paymentMethod, shippingInformation);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentData)) {
                return false;
            }
            PaymentData paymentData = (PaymentData) other;
            return Intrinsics.areEqual(this.paymentMethod, paymentData.paymentMethod) && Intrinsics.areEqual(this.shippingInformation, paymentData.shippingInformation);
        }

        public int hashCode() {
            int iHashCode = this.paymentMethod.hashCode() * 31;
            ShippingInformation shippingInformation = this.shippingInformation;
            return iHashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode());
        }

        public String toString() {
            return "PaymentData(paymentMethod=" + this.paymentMethod + ", shippingInformation=" + this.shippingInformation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.paymentMethod.writeToParcel(dest, flags);
            ShippingInformation shippingInformation = this.shippingInformation;
            if (shippingInformation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shippingInformation.writeToParcel(dest, flags);
            }
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final ShippingInformation getShippingInformation() {
            return this.shippingInformation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentData(PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            this.shippingInformation = shippingInformation;
        }
    }

    /* compiled from: GooglePayLauncherResult.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Canceled extends GooglePayLauncherResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GooglePayLauncherResult.kt */
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
            return -895583315;
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
    }

    /* compiled from: GooglePayLauncherResult.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Unavailable;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unavailable extends GooglePayLauncherResult {
        public static final Unavailable INSTANCE = new Unavailable();
        public static final Parcelable.Creator<Unavailable> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GooglePayLauncherResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unavailable> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unavailable createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unavailable.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unavailable[] newArray(int i) {
                return new Unavailable[i];
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
            if (!(other instanceof Unavailable)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 915511484;
        }

        public String toString() {
            return "Unavailable";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Unavailable() {
            super(null);
        }
    }

    /* compiled from: GooglePayLauncherResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GooglePayLauncherResult fromIntent(Intent intent) {
            GooglePayLauncherResult googlePayLauncherResult = intent != null ? (GooglePayLauncherResult) intent.getParcelableExtra("extra_activity_result") : null;
            if (googlePayLauncherResult == null) {
                return new Error(new IllegalStateException("Error while processing result from Google Pay."), null, null, null, 14, null);
            }
            return googlePayLauncherResult;
        }
    }
}
