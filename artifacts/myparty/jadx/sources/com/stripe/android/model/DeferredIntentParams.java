package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeferredIntentParams.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006'"}, d2 = {"Lcom/stripe/android/model/DeferredIntentParams;", "Lcom/stripe/android/core/model/StripeModel;", "mode", "Lcom/stripe/android/model/DeferredIntentParams$Mode;", "paymentMethodTypes", "", "", "paymentMethodConfigurationId", "onBehalfOf", "<init>", "(Lcom/stripe/android/model/DeferredIntentParams$Mode;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getMode", "()Lcom/stripe/android/model/DeferredIntentParams$Mode;", "getPaymentMethodTypes", "()Ljava/util/List;", "getPaymentMethodConfigurationId", "()Ljava/lang/String;", "getOnBehalfOf", "toQueryParams", "", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Mode", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeferredIntentParams implements StripeModel {
    private final Mode mode;
    private final String onBehalfOf;
    private final String paymentMethodConfigurationId;
    private final List<String> paymentMethodTypes;
    public static final Parcelable.Creator<DeferredIntentParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: DeferredIntentParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeferredIntentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeferredIntentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeferredIntentParams((Mode) parcel.readParcelable(DeferredIntentParams.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeferredIntentParams[] newArray(int i) {
            return new DeferredIntentParams[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeferredIntentParams copy$default(DeferredIntentParams deferredIntentParams, Mode mode, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            mode = deferredIntentParams.mode;
        }
        if ((i & 2) != 0) {
            list = deferredIntentParams.paymentMethodTypes;
        }
        if ((i & 4) != 0) {
            str = deferredIntentParams.paymentMethodConfigurationId;
        }
        if ((i & 8) != 0) {
            str2 = deferredIntentParams.onBehalfOf;
        }
        return deferredIntentParams.copy(mode, list, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Mode getMode() {
        return this.mode;
    }

    public final List<String> component2() {
        return this.paymentMethodTypes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentMethodConfigurationId() {
        return this.paymentMethodConfigurationId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final DeferredIntentParams copy(Mode mode, List<String> paymentMethodTypes, String paymentMethodConfigurationId, String onBehalfOf) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        return new DeferredIntentParams(mode, paymentMethodTypes, paymentMethodConfigurationId, onBehalfOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeferredIntentParams)) {
            return false;
        }
        DeferredIntentParams deferredIntentParams = (DeferredIntentParams) other;
        return Intrinsics.areEqual(this.mode, deferredIntentParams.mode) && Intrinsics.areEqual(this.paymentMethodTypes, deferredIntentParams.paymentMethodTypes) && Intrinsics.areEqual(this.paymentMethodConfigurationId, deferredIntentParams.paymentMethodConfigurationId) && Intrinsics.areEqual(this.onBehalfOf, deferredIntentParams.onBehalfOf);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((this.mode.hashCode() * 31) + this.paymentMethodTypes.hashCode()) * 31;
        String str = this.paymentMethodConfigurationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onBehalfOf;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeferredIntentParams(mode=" + this.mode + ", paymentMethodTypes=" + this.paymentMethodTypes + ", paymentMethodConfigurationId=" + this.paymentMethodConfigurationId + ", onBehalfOf=" + this.onBehalfOf + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.mode, flags);
        dest.writeStringList(this.paymentMethodTypes);
        dest.writeString(this.paymentMethodConfigurationId);
        dest.writeString(this.onBehalfOf);
    }

    public DeferredIntentParams(Mode mode, List<String> paymentMethodTypes, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        this.mode = mode;
        this.paymentMethodTypes = paymentMethodTypes;
        this.paymentMethodConfigurationId = str;
        this.onBehalfOf = str2;
    }

    public final Mode getMode() {
        return this.mode;
    }

    public final List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final String getPaymentMethodConfigurationId() {
        return this.paymentMethodConfigurationId;
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    /* compiled from: DeferredIntentParams.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/DeferredIntentParams$Mode;", "Landroid/os/Parcelable;", "code", "", "getCode", "()Ljava/lang/String;", "currency", "getCurrency", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "getSetupFutureUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "Payment", "Setup", "Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;", "Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Mode extends Parcelable {
        String getCode();

        String getCurrency();

        StripeIntent.Usage getSetupFutureUsage();

        /* compiled from: DeferredIntentParams.kt */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006+"}, d2 = {"Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;", "Lcom/stripe/android/model/DeferredIntentParams$Mode;", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "captureMethod", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "paymentMethodOptionsJsonString", "<init>", "(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "getSetupFutureUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "getCaptureMethod", "()Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "getPaymentMethodOptionsJsonString", "code", "getCode", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Payment implements Mode {
            private final long amount;
            private final PaymentIntent.CaptureMethod captureMethod;
            private final String currency;
            private final String paymentMethodOptionsJsonString;
            private final StripeIntent.Usage setupFutureUsage;
            public static final Parcelable.Creator<Payment> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: DeferredIntentParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Payment> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Payment createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Payment(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), PaymentIntent.CaptureMethod.valueOf(parcel.readString()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Payment[] newArray(int i) {
                    return new Payment[i];
                }
            }

            public static /* synthetic */ Payment copy$default(Payment payment, long j, String str, StripeIntent.Usage usage, PaymentIntent.CaptureMethod captureMethod, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = payment.amount;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = payment.currency;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    usage = payment.setupFutureUsage;
                }
                StripeIntent.Usage usage2 = usage;
                if ((i & 8) != 0) {
                    captureMethod = payment.captureMethod;
                }
                PaymentIntent.CaptureMethod captureMethod2 = captureMethod;
                if ((i & 16) != 0) {
                    str2 = payment.paymentMethodOptionsJsonString;
                }
                return payment.copy(j2, str3, usage2, captureMethod2, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final long getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            /* renamed from: component3, reason: from getter */
            public final StripeIntent.Usage getSetupFutureUsage() {
                return this.setupFutureUsage;
            }

            /* renamed from: component4, reason: from getter */
            public final PaymentIntent.CaptureMethod getCaptureMethod() {
                return this.captureMethod;
            }

            /* renamed from: component5, reason: from getter */
            public final String getPaymentMethodOptionsJsonString() {
                return this.paymentMethodOptionsJsonString;
            }

            public final Payment copy(long amount, String currency, StripeIntent.Usage setupFutureUsage, PaymentIntent.CaptureMethod captureMethod, String paymentMethodOptionsJsonString) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
                return new Payment(amount, currency, setupFutureUsage, captureMethod, paymentMethodOptionsJsonString);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Payment)) {
                    return false;
                }
                Payment payment = (Payment) other;
                return this.amount == payment.amount && Intrinsics.areEqual(this.currency, payment.currency) && this.setupFutureUsage == payment.setupFutureUsage && this.captureMethod == payment.captureMethod && Intrinsics.areEqual(this.paymentMethodOptionsJsonString, payment.paymentMethodOptionsJsonString);
            }

            public int hashCode() {
                int iHashCode = ((Long.hashCode(this.amount) * 31) + this.currency.hashCode()) * 31;
                StripeIntent.Usage usage = this.setupFutureUsage;
                int iHashCode2 = (((iHashCode + (usage == null ? 0 : usage.hashCode())) * 31) + this.captureMethod.hashCode()) * 31;
                String str = this.paymentMethodOptionsJsonString;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "Payment(amount=" + this.amount + ", currency=" + this.currency + ", setupFutureUsage=" + this.setupFutureUsage + ", captureMethod=" + this.captureMethod + ", paymentMethodOptionsJsonString=" + this.paymentMethodOptionsJsonString + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeLong(this.amount);
                dest.writeString(this.currency);
                StripeIntent.Usage usage = this.setupFutureUsage;
                if (usage == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(usage.name());
                }
                dest.writeString(this.captureMethod.name());
                dest.writeString(this.paymentMethodOptionsJsonString);
            }

            public Payment(long j, String currency, StripeIntent.Usage usage, PaymentIntent.CaptureMethod captureMethod, String str) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
                this.amount = j;
                this.currency = currency;
                this.setupFutureUsage = usage;
                this.captureMethod = captureMethod;
                this.paymentMethodOptionsJsonString = str;
            }

            public final long getAmount() {
                return this.amount;
            }

            @Override // com.stripe.android.model.DeferredIntentParams.Mode
            public String getCurrency() {
                return this.currency;
            }

            @Override // com.stripe.android.model.DeferredIntentParams.Mode
            public StripeIntent.Usage getSetupFutureUsage() {
                return this.setupFutureUsage;
            }

            public final PaymentIntent.CaptureMethod getCaptureMethod() {
                return this.captureMethod;
            }

            public final String getPaymentMethodOptionsJsonString() {
                return this.paymentMethodOptionsJsonString;
            }

            @Override // com.stripe.android.model.DeferredIntentParams.Mode
            public String getCode() {
                return "payment";
            }
        }

        /* compiled from: DeferredIntentParams.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;", "Lcom/stripe/android/model/DeferredIntentParams$Mode;", "currency", "", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;)V", "getCurrency", "()Ljava/lang/String;", "getSetupFutureUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "code", "getCode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Setup implements Mode {
            private final String currency;
            private final StripeIntent.Usage setupFutureUsage;
            public static final Parcelable.Creator<Setup> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: DeferredIntentParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Setup> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Setup createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Setup(parcel.readString(), StripeIntent.Usage.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Setup[] newArray(int i) {
                    return new Setup[i];
                }
            }

            public static /* synthetic */ Setup copy$default(Setup setup, String str, StripeIntent.Usage usage, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setup.currency;
                }
                if ((i & 2) != 0) {
                    usage = setup.setupFutureUsage;
                }
                return setup.copy(str, usage);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            /* renamed from: component2, reason: from getter */
            public final StripeIntent.Usage getSetupFutureUsage() {
                return this.setupFutureUsage;
            }

            public final Setup copy(String currency, StripeIntent.Usage setupFutureUsage) {
                Intrinsics.checkNotNullParameter(setupFutureUsage, "setupFutureUsage");
                return new Setup(currency, setupFutureUsage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Setup)) {
                    return false;
                }
                Setup setup = (Setup) other;
                return Intrinsics.areEqual(this.currency, setup.currency) && this.setupFutureUsage == setup.setupFutureUsage;
            }

            public int hashCode() {
                String str = this.currency;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.setupFutureUsage.hashCode();
            }

            public String toString() {
                return "Setup(currency=" + this.currency + ", setupFutureUsage=" + this.setupFutureUsage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.currency);
                dest.writeString(this.setupFutureUsage.name());
            }

            public Setup(String str, StripeIntent.Usage setupFutureUsage) {
                Intrinsics.checkNotNullParameter(setupFutureUsage, "setupFutureUsage");
                this.currency = str;
                this.setupFutureUsage = setupFutureUsage;
            }

            @Override // com.stripe.android.model.DeferredIntentParams.Mode
            public String getCurrency() {
                return this.currency;
            }

            @Override // com.stripe.android.model.DeferredIntentParams.Mode
            public StripeIntent.Usage getSetupFutureUsage() {
                return this.setupFutureUsage;
            }

            @Override // com.stripe.android.model.DeferredIntentParams.Mode
            public String getCode() {
                return "setup";
            }
        }
    }

    public final Map<String, Object> toQueryParams() {
        PaymentIntent.CaptureMethod captureMethod;
        Pair[] pairArr = new Pair[7];
        int i = 0;
        pairArr[0] = TuplesKt.to("deferred_intent[mode]", this.mode.getCode());
        Mode mode = this.mode;
        String code = null;
        Mode.Payment payment = mode instanceof Mode.Payment ? (Mode.Payment) mode : null;
        pairArr[1] = TuplesKt.to("deferred_intent[amount]", payment != null ? Long.valueOf(payment.getAmount()) : null);
        pairArr[2] = TuplesKt.to("deferred_intent[currency]", this.mode.getCurrency());
        StripeIntent.Usage setupFutureUsage = this.mode.getSetupFutureUsage();
        pairArr[3] = TuplesKt.to("deferred_intent[setup_future_usage]", setupFutureUsage != null ? setupFutureUsage.getCode() : null);
        Mode mode2 = this.mode;
        Mode.Payment payment2 = mode2 instanceof Mode.Payment ? (Mode.Payment) mode2 : null;
        if (payment2 != null && (captureMethod = payment2.getCaptureMethod()) != null) {
            code = captureMethod.getCode();
        }
        pairArr[4] = TuplesKt.to("deferred_intent[capture_method]", code);
        pairArr[5] = TuplesKt.to("deferred_intent[payment_method_configuration][id]", this.paymentMethodConfigurationId);
        pairArr[6] = TuplesKt.to("deferred_intent[on_behalf_of]", this.onBehalfOf);
        Map mapMapOf = MapsKt.mapOf(pairArr);
        List<String> list = this.paymentMethodTypes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to("deferred_intent[payment_method_types][" + i + "]", (String) obj));
            i = i2;
        }
        return MapsKt.plus(mapMapOf, arrayList);
    }
}
