package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountResultInternal.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;", "Lcom/stripe/android/core/model/StripeModel;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "usBankAccountData", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;", "instantDebitsData", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;)V", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "getUsBankAccountData", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;", "getInstantDebitsData", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "USBankAccountData", "InstantDebitsData", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CollectBankAccountResponseInternal implements StripeModel {
    private final InstantDebitsData instantDebitsData;
    private final StripeIntent intent;
    private final USBankAccountData usBankAccountData;
    public static final Parcelable.Creator<CollectBankAccountResponseInternal> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: CollectBankAccountResultInternal.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CollectBankAccountResponseInternal> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponseInternal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectBankAccountResponseInternal((StripeIntent) parcel.readParcelable(CollectBankAccountResponseInternal.class.getClassLoader()), parcel.readInt() == 0 ? null : USBankAccountData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InstantDebitsData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponseInternal[] newArray(int i) {
            return new CollectBankAccountResponseInternal[i];
        }
    }

    public static /* synthetic */ CollectBankAccountResponseInternal copy$default(CollectBankAccountResponseInternal collectBankAccountResponseInternal, StripeIntent stripeIntent, USBankAccountData uSBankAccountData, InstantDebitsData instantDebitsData, int i, Object obj) {
        if ((i & 1) != 0) {
            stripeIntent = collectBankAccountResponseInternal.intent;
        }
        if ((i & 2) != 0) {
            uSBankAccountData = collectBankAccountResponseInternal.usBankAccountData;
        }
        if ((i & 4) != 0) {
            instantDebitsData = collectBankAccountResponseInternal.instantDebitsData;
        }
        return collectBankAccountResponseInternal.copy(stripeIntent, uSBankAccountData, instantDebitsData);
    }

    /* renamed from: component1, reason: from getter */
    public final StripeIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component2, reason: from getter */
    public final USBankAccountData getUsBankAccountData() {
        return this.usBankAccountData;
    }

    /* renamed from: component3, reason: from getter */
    public final InstantDebitsData getInstantDebitsData() {
        return this.instantDebitsData;
    }

    public final CollectBankAccountResponseInternal copy(StripeIntent intent, USBankAccountData usBankAccountData, InstantDebitsData instantDebitsData) {
        return new CollectBankAccountResponseInternal(intent, usBankAccountData, instantDebitsData);
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
        if (!(other instanceof CollectBankAccountResponseInternal)) {
            return false;
        }
        CollectBankAccountResponseInternal collectBankAccountResponseInternal = (CollectBankAccountResponseInternal) other;
        return Intrinsics.areEqual(this.intent, collectBankAccountResponseInternal.intent) && Intrinsics.areEqual(this.usBankAccountData, collectBankAccountResponseInternal.usBankAccountData) && Intrinsics.areEqual(this.instantDebitsData, collectBankAccountResponseInternal.instantDebitsData);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        StripeIntent stripeIntent = this.intent;
        int iHashCode = (stripeIntent == null ? 0 : stripeIntent.hashCode()) * 31;
        USBankAccountData uSBankAccountData = this.usBankAccountData;
        int iHashCode2 = (iHashCode + (uSBankAccountData == null ? 0 : uSBankAccountData.hashCode())) * 31;
        InstantDebitsData instantDebitsData = this.instantDebitsData;
        return iHashCode2 + (instantDebitsData != null ? instantDebitsData.hashCode() : 0);
    }

    public String toString() {
        return "CollectBankAccountResponseInternal(intent=" + this.intent + ", usBankAccountData=" + this.usBankAccountData + ", instantDebitsData=" + this.instantDebitsData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.intent, flags);
        USBankAccountData uSBankAccountData = this.usBankAccountData;
        if (uSBankAccountData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            uSBankAccountData.writeToParcel(dest, flags);
        }
        InstantDebitsData instantDebitsData = this.instantDebitsData;
        if (instantDebitsData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            instantDebitsData.writeToParcel(dest, flags);
        }
    }

    public CollectBankAccountResponseInternal(StripeIntent stripeIntent, USBankAccountData uSBankAccountData, InstantDebitsData instantDebitsData) {
        this.intent = stripeIntent;
        this.usBankAccountData = uSBankAccountData;
        this.instantDebitsData = instantDebitsData;
    }

    public final StripeIntent getIntent() {
        return this.intent;
    }

    public final USBankAccountData getUsBankAccountData() {
        return this.usBankAccountData;
    }

    public final InstantDebitsData getInstantDebitsData() {
        return this.instantDebitsData;
    }

    /* compiled from: CollectBankAccountResultInternal.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;", "Lcom/stripe/android/core/model/StripeModel;", "financialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", "getFinancialConnectionsSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class USBankAccountData implements StripeModel {
        private final FinancialConnectionsSession financialConnectionsSession;
        public static final Parcelable.Creator<USBankAccountData> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CollectBankAccountResultInternal.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<USBankAccountData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccountData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccountData((FinancialConnectionsSession) parcel.readParcelable(USBankAccountData.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccountData[] newArray(int i) {
                return new USBankAccountData[i];
            }
        }

        public static /* synthetic */ USBankAccountData copy$default(USBankAccountData uSBankAccountData, FinancialConnectionsSession financialConnectionsSession, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSession = uSBankAccountData.financialConnectionsSession;
            }
            return uSBankAccountData.copy(financialConnectionsSession);
        }

        /* renamed from: component1, reason: from getter */
        public final FinancialConnectionsSession getFinancialConnectionsSession() {
            return this.financialConnectionsSession;
        }

        public final USBankAccountData copy(FinancialConnectionsSession financialConnectionsSession) {
            Intrinsics.checkNotNullParameter(financialConnectionsSession, "financialConnectionsSession");
            return new USBankAccountData(financialConnectionsSession);
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
            return (other instanceof USBankAccountData) && Intrinsics.areEqual(this.financialConnectionsSession, ((USBankAccountData) other).financialConnectionsSession);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            return this.financialConnectionsSession.hashCode();
        }

        public String toString() {
            return "USBankAccountData(financialConnectionsSession=" + this.financialConnectionsSession + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.financialConnectionsSession, flags);
        }

        public USBankAccountData(FinancialConnectionsSession financialConnectionsSession) {
            Intrinsics.checkNotNullParameter(financialConnectionsSession, "financialConnectionsSession");
            this.financialConnectionsSession = financialConnectionsSession;
        }

        public final FinancialConnectionsSession getFinancialConnectionsSession() {
            return this.financialConnectionsSession;
        }
    }

    /* compiled from: CollectBankAccountResultInternal.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;", "Lcom/stripe/android/core/model/StripeModel;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "last4", "", "bankName", "eligibleForIncentive", "", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Z)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getLast4", "()Ljava/lang/String;", "getBankName", "getEligibleForIncentive", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InstantDebitsData implements StripeModel {
        private final String bankName;
        private final boolean eligibleForIncentive;
        private final String last4;
        private final PaymentMethod paymentMethod;
        public static final Parcelable.Creator<InstantDebitsData> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CollectBankAccountResultInternal.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InstantDebitsData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantDebitsData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstantDebitsData(PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantDebitsData[] newArray(int i) {
                return new InstantDebitsData[i];
            }
        }

        public static /* synthetic */ InstantDebitsData copy$default(InstantDebitsData instantDebitsData, PaymentMethod paymentMethod, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = instantDebitsData.paymentMethod;
            }
            if ((i & 2) != 0) {
                str = instantDebitsData.last4;
            }
            if ((i & 4) != 0) {
                str2 = instantDebitsData.bankName;
            }
            if ((i & 8) != 0) {
                z = instantDebitsData.eligibleForIncentive;
            }
            return instantDebitsData.copy(paymentMethod, str, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getEligibleForIncentive() {
            return this.eligibleForIncentive;
        }

        public final InstantDebitsData copy(PaymentMethod paymentMethod, String last4, String bankName, boolean eligibleForIncentive) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new InstantDebitsData(paymentMethod, last4, bankName, eligibleForIncentive);
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
            if (!(other instanceof InstantDebitsData)) {
                return false;
            }
            InstantDebitsData instantDebitsData = (InstantDebitsData) other;
            return Intrinsics.areEqual(this.paymentMethod, instantDebitsData.paymentMethod) && Intrinsics.areEqual(this.last4, instantDebitsData.last4) && Intrinsics.areEqual(this.bankName, instantDebitsData.bankName) && this.eligibleForIncentive == instantDebitsData.eligibleForIncentive;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int iHashCode = this.paymentMethod.hashCode() * 31;
            String str = this.last4;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bankName;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.eligibleForIncentive);
        }

        public String toString() {
            return "InstantDebitsData(paymentMethod=" + this.paymentMethod + ", last4=" + this.last4 + ", bankName=" + this.bankName + ", eligibleForIncentive=" + this.eligibleForIncentive + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.paymentMethod.writeToParcel(dest, flags);
            dest.writeString(this.last4);
            dest.writeString(this.bankName);
            dest.writeInt(this.eligibleForIncentive ? 1 : 0);
        }

        public InstantDebitsData(PaymentMethod paymentMethod, String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            this.last4 = str;
            this.bankName = str2;
            this.eligibleForIncentive = z;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final boolean getEligibleForIncentive() {
            return this.eligibleForIncentive;
        }
    }
}
