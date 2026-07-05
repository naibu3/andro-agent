package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.parsers.MobileCardElementConfigParser;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BankFormScreenState.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003,-.B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0019\u001a\u00020\u0000J\t\u0010\u001a\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010¨\u0006/"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;", "Landroid/os/Parcelable;", "isPaymentFlow", "", "promoText", "", "_isProcessing", "linkedBankAccount", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;", "error", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(ZLjava/lang/String;ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;Lcom/stripe/android/core/strings/ResolvableString;)V", "getLinkedBankAccount", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;", "getError", "()Lcom/stripe/android/core/strings/ResolvableString;", "isProcessing", "()Z", "promoBadgeState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$PromoBadgeState;", "getPromoBadgeState", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$PromoBadgeState;", "promoDisclaimerText", "getPromoDisclaimerText", BaseSheetViewModel.SAVE_PROCESSING, "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "LinkedBankAccount", "PromoBadgeState", "ResultIdentifier", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BankFormScreenState implements Parcelable {
    private final boolean _isProcessing;
    private final ResolvableString error;
    private final boolean isPaymentFlow;
    private final LinkedBankAccount linkedBankAccount;
    private final String promoText;
    public static final Parcelable.Creator<BankFormScreenState> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BankFormScreenState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankFormScreenState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankFormScreenState createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
                z2 = false;
            } else {
                z = true;
                z3 = false;
                z2 = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = z;
            }
            return new BankFormScreenState(z3, string, z2, parcel.readInt() == 0 ? null : LinkedBankAccount.CREATOR.createFromParcel(parcel), (ResolvableString) parcel.readParcelable(BankFormScreenState.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankFormScreenState[] newArray(int i) {
            return new BankFormScreenState[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getIsPaymentFlow() {
        return this.isPaymentFlow;
    }

    /* renamed from: component2, reason: from getter */
    private final String getPromoText() {
        return this.promoText;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean get_isProcessing() {
        return this._isProcessing;
    }

    public static /* synthetic */ BankFormScreenState copy$default(BankFormScreenState bankFormScreenState, boolean z, String str, boolean z2, LinkedBankAccount linkedBankAccount, ResolvableString resolvableString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bankFormScreenState.isPaymentFlow;
        }
        if ((i & 2) != 0) {
            str = bankFormScreenState.promoText;
        }
        if ((i & 4) != 0) {
            z2 = bankFormScreenState._isProcessing;
        }
        if ((i & 8) != 0) {
            linkedBankAccount = bankFormScreenState.linkedBankAccount;
        }
        if ((i & 16) != 0) {
            resolvableString = bankFormScreenState.error;
        }
        ResolvableString resolvableString2 = resolvableString;
        boolean z3 = z2;
        return bankFormScreenState.copy(z, str, z3, linkedBankAccount, resolvableString2);
    }

    /* renamed from: component4, reason: from getter */
    public final LinkedBankAccount getLinkedBankAccount() {
        return this.linkedBankAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final ResolvableString getError() {
        return this.error;
    }

    public final BankFormScreenState copy(boolean isPaymentFlow, String promoText, boolean _isProcessing, LinkedBankAccount linkedBankAccount, ResolvableString error) {
        return new BankFormScreenState(isPaymentFlow, promoText, _isProcessing, linkedBankAccount, error);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankFormScreenState)) {
            return false;
        }
        BankFormScreenState bankFormScreenState = (BankFormScreenState) other;
        return this.isPaymentFlow == bankFormScreenState.isPaymentFlow && Intrinsics.areEqual(this.promoText, bankFormScreenState.promoText) && this._isProcessing == bankFormScreenState._isProcessing && Intrinsics.areEqual(this.linkedBankAccount, bankFormScreenState.linkedBankAccount) && Intrinsics.areEqual(this.error, bankFormScreenState.error);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isPaymentFlow) * 31;
        String str = this.promoText;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this._isProcessing)) * 31;
        LinkedBankAccount linkedBankAccount = this.linkedBankAccount;
        int iHashCode3 = (iHashCode2 + (linkedBankAccount == null ? 0 : linkedBankAccount.hashCode())) * 31;
        ResolvableString resolvableString = this.error;
        return iHashCode3 + (resolvableString != null ? resolvableString.hashCode() : 0);
    }

    public String toString() {
        return "BankFormScreenState(isPaymentFlow=" + this.isPaymentFlow + ", promoText=" + this.promoText + ", _isProcessing=" + this._isProcessing + ", linkedBankAccount=" + this.linkedBankAccount + ", error=" + this.error + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isPaymentFlow ? 1 : 0);
        dest.writeString(this.promoText);
        dest.writeInt(this._isProcessing ? 1 : 0);
        LinkedBankAccount linkedBankAccount = this.linkedBankAccount;
        if (linkedBankAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkedBankAccount.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.error, flags);
    }

    public BankFormScreenState(boolean z, String str, boolean z2, LinkedBankAccount linkedBankAccount, ResolvableString resolvableString) {
        this.isPaymentFlow = z;
        this.promoText = str;
        this._isProcessing = z2;
        this.linkedBankAccount = linkedBankAccount;
        this.error = resolvableString;
    }

    public /* synthetic */ BankFormScreenState(boolean z, String str, boolean z2, LinkedBankAccount linkedBankAccount, ResolvableString resolvableString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : linkedBankAccount, (i & 16) != 0 ? null : resolvableString);
    }

    public final LinkedBankAccount getLinkedBankAccount() {
        return this.linkedBankAccount;
    }

    public final ResolvableString getError() {
        return this.error;
    }

    public final boolean isProcessing() {
        return this._isProcessing && this.linkedBankAccount == null;
    }

    public final PromoBadgeState getPromoBadgeState() {
        if (this.promoText == null || this.linkedBankAccount == null) {
            return null;
        }
        return new PromoBadgeState(this.promoText, this.linkedBankAccount.getEligibleForIncentive());
    }

    public final ResolvableString getPromoDisclaimerText() {
        String str = this.promoText;
        if (str == null) {
            return null;
        }
        LinkedBankAccount linkedBankAccount = this.linkedBankAccount;
        if (linkedBankAccount != null && !linkedBankAccount.getEligibleForIncentive()) {
            return null;
        }
        if (this.isPaymentFlow) {
            return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_bank_payment_promo_for_payment, new Object[]{str}, null, 4, null);
        }
        return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_bank_payment_promo_for_setup, new Object[]{str}, null, 4, null);
    }

    public final BankFormScreenState processing() {
        return copy$default(this, false, null, true, null, null, 27, null);
    }

    /* compiled from: BankFormScreenState.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u00060"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;", "Landroid/os/Parcelable;", "resultIdentifier", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;", "bankName", "", "last4", "intentId", "financialConnectionsSessionId", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "isVerifyingWithMicrodeposits", "", "eligibleForIncentive", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZZ)V", "getResultIdentifier", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;", "getBankName", "()Ljava/lang/String;", "getLast4", "getIntentId", "getFinancialConnectionsSessionId", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "()Z", "getEligibleForIncentive", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkedBankAccount implements Parcelable {
        private final String bankName;
        private final boolean eligibleForIncentive;
        private final String financialConnectionsSessionId;
        private final String intentId;
        private final boolean isVerifyingWithMicrodeposits;
        private final String last4;
        private final ResolvableString mandateText;
        private final ResultIdentifier resultIdentifier;
        public static final Parcelable.Creator<LinkedBankAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: BankFormScreenState.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LinkedBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkedBankAccount createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ResultIdentifier resultIdentifier = (ResultIdentifier) parcel.readParcelable(LinkedBankAccount.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ResolvableString resolvableString = (ResolvableString) parcel.readParcelable(LinkedBankAccount.class.getClassLoader());
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                return new LinkedBankAccount(resultIdentifier, string, string2, string3, string4, resolvableString, z2, parcel.readInt() != 0 ? z : false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkedBankAccount[] newArray(int i) {
                return new LinkedBankAccount[i];
            }
        }

        public static /* synthetic */ LinkedBankAccount copy$default(LinkedBankAccount linkedBankAccount, ResultIdentifier resultIdentifier, String str, String str2, String str3, String str4, ResolvableString resolvableString, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                resultIdentifier = linkedBankAccount.resultIdentifier;
            }
            if ((i & 2) != 0) {
                str = linkedBankAccount.bankName;
            }
            if ((i & 4) != 0) {
                str2 = linkedBankAccount.last4;
            }
            if ((i & 8) != 0) {
                str3 = linkedBankAccount.intentId;
            }
            if ((i & 16) != 0) {
                str4 = linkedBankAccount.financialConnectionsSessionId;
            }
            if ((i & 32) != 0) {
                resolvableString = linkedBankAccount.mandateText;
            }
            if ((i & 64) != 0) {
                z = linkedBankAccount.isVerifyingWithMicrodeposits;
            }
            if ((i & 128) != 0) {
                z2 = linkedBankAccount.eligibleForIncentive;
            }
            boolean z3 = z;
            boolean z4 = z2;
            String str5 = str4;
            ResolvableString resolvableString2 = resolvableString;
            return linkedBankAccount.copy(resultIdentifier, str, str2, str3, str5, resolvableString2, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final ResultIdentifier getResultIdentifier() {
            return this.resultIdentifier;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIntentId() {
            return this.intentId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        /* renamed from: component6, reason: from getter */
        public final ResolvableString getMandateText() {
            return this.mandateText;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsVerifyingWithMicrodeposits() {
            return this.isVerifyingWithMicrodeposits;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getEligibleForIncentive() {
            return this.eligibleForIncentive;
        }

        public final LinkedBankAccount copy(ResultIdentifier resultIdentifier, String bankName, String last4, String intentId, String financialConnectionsSessionId, ResolvableString mandateText, boolean isVerifyingWithMicrodeposits, boolean eligibleForIncentive) {
            Intrinsics.checkNotNullParameter(resultIdentifier, "resultIdentifier");
            Intrinsics.checkNotNullParameter(mandateText, "mandateText");
            return new LinkedBankAccount(resultIdentifier, bankName, last4, intentId, financialConnectionsSessionId, mandateText, isVerifyingWithMicrodeposits, eligibleForIncentive);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkedBankAccount)) {
                return false;
            }
            LinkedBankAccount linkedBankAccount = (LinkedBankAccount) other;
            return Intrinsics.areEqual(this.resultIdentifier, linkedBankAccount.resultIdentifier) && Intrinsics.areEqual(this.bankName, linkedBankAccount.bankName) && Intrinsics.areEqual(this.last4, linkedBankAccount.last4) && Intrinsics.areEqual(this.intentId, linkedBankAccount.intentId) && Intrinsics.areEqual(this.financialConnectionsSessionId, linkedBankAccount.financialConnectionsSessionId) && Intrinsics.areEqual(this.mandateText, linkedBankAccount.mandateText) && this.isVerifyingWithMicrodeposits == linkedBankAccount.isVerifyingWithMicrodeposits && this.eligibleForIncentive == linkedBankAccount.eligibleForIncentive;
        }

        public int hashCode() {
            int iHashCode = this.resultIdentifier.hashCode() * 31;
            String str = this.bankName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.last4;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.intentId;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.financialConnectionsSessionId;
            return ((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.mandateText.hashCode()) * 31) + Boolean.hashCode(this.isVerifyingWithMicrodeposits)) * 31) + Boolean.hashCode(this.eligibleForIncentive);
        }

        public String toString() {
            return "LinkedBankAccount(resultIdentifier=" + this.resultIdentifier + ", bankName=" + this.bankName + ", last4=" + this.last4 + ", intentId=" + this.intentId + ", financialConnectionsSessionId=" + this.financialConnectionsSessionId + ", mandateText=" + this.mandateText + ", isVerifyingWithMicrodeposits=" + this.isVerifyingWithMicrodeposits + ", eligibleForIncentive=" + this.eligibleForIncentive + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.resultIdentifier, flags);
            dest.writeString(this.bankName);
            dest.writeString(this.last4);
            dest.writeString(this.intentId);
            dest.writeString(this.financialConnectionsSessionId);
            dest.writeParcelable(this.mandateText, flags);
            dest.writeInt(this.isVerifyingWithMicrodeposits ? 1 : 0);
            dest.writeInt(this.eligibleForIncentive ? 1 : 0);
        }

        public LinkedBankAccount(ResultIdentifier resultIdentifier, String str, String str2, String str3, String str4, ResolvableString mandateText, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(resultIdentifier, "resultIdentifier");
            Intrinsics.checkNotNullParameter(mandateText, "mandateText");
            this.resultIdentifier = resultIdentifier;
            this.bankName = str;
            this.last4 = str2;
            this.intentId = str3;
            this.financialConnectionsSessionId = str4;
            this.mandateText = mandateText;
            this.isVerifyingWithMicrodeposits = z;
            this.eligibleForIncentive = z2;
        }

        public /* synthetic */ LinkedBankAccount(ResultIdentifier resultIdentifier, String str, String str2, String str3, String str4, ResolvableString resolvableString, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(resultIdentifier, str, str2, str3, str4, resolvableString, z, (i & 128) != 0 ? false : z2);
        }

        public final ResultIdentifier getResultIdentifier() {
            return this.resultIdentifier;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final String getIntentId() {
            return this.intentId;
        }

        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        public final ResolvableString getMandateText() {
            return this.mandateText;
        }

        public final boolean isVerifyingWithMicrodeposits() {
            return this.isVerifyingWithMicrodeposits;
        }

        public final boolean getEligibleForIncentive() {
            return this.eligibleForIncentive;
        }
    }

    /* compiled from: BankFormScreenState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$PromoBadgeState;", "", "promoText", "", MobileCardElementConfigParser.FIELD_ELIGIBLE, "", "<init>", "(Ljava/lang/String;Z)V", "getPromoText", "()Ljava/lang/String;", "getEligible", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromoBadgeState {
        public static final int $stable = 0;
        private final boolean eligible;
        private final String promoText;

        public static /* synthetic */ PromoBadgeState copy$default(PromoBadgeState promoBadgeState, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promoBadgeState.promoText;
            }
            if ((i & 2) != 0) {
                z = promoBadgeState.eligible;
            }
            return promoBadgeState.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPromoText() {
            return this.promoText;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEligible() {
            return this.eligible;
        }

        public final PromoBadgeState copy(String promoText, boolean eligible) {
            Intrinsics.checkNotNullParameter(promoText, "promoText");
            return new PromoBadgeState(promoText, eligible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromoBadgeState)) {
                return false;
            }
            PromoBadgeState promoBadgeState = (PromoBadgeState) other;
            return Intrinsics.areEqual(this.promoText, promoBadgeState.promoText) && this.eligible == promoBadgeState.eligible;
        }

        public int hashCode() {
            return (this.promoText.hashCode() * 31) + Boolean.hashCode(this.eligible);
        }

        public String toString() {
            return "PromoBadgeState(promoText=" + this.promoText + ", eligible=" + this.eligible + ")";
        }

        public PromoBadgeState(String promoText, boolean z) {
            Intrinsics.checkNotNullParameter(promoText, "promoText");
            this.promoText = promoText;
            this.eligible = z;
        }

        public final String getPromoText() {
            return this.promoText;
        }

        public final boolean getEligible() {
            return this.eligible;
        }
    }

    /* compiled from: BankFormScreenState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;", "Landroid/os/Parcelable;", "Session", "PaymentMethod", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$PaymentMethod;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ResultIdentifier extends Parcelable {

        /* compiled from: BankFormScreenState.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Session implements ResultIdentifier {
            private final String id;
            public static final Parcelable.Creator<Session> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: BankFormScreenState.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Session> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Session createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Session(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Session[] newArray(int i) {
                    return new Session[i];
                }
            }

            public static /* synthetic */ Session copy$default(Session session, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = session.id;
                }
                return session.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Session copy(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new Session(id);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Session) && Intrinsics.areEqual(this.id, ((Session) other).id);
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "Session(id=" + this.id + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.id);
            }

            public Session(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
            }

            public final String getId() {
                return this.id;
            }
        }

        /* compiled from: BankFormScreenState.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$PaymentMethod;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PaymentMethod implements ResultIdentifier {
            private final com.stripe.android.model.PaymentMethod paymentMethod;
            public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();
            public static final int $stable = com.stripe.android.model.PaymentMethod.$stable;

            /* compiled from: BankFormScreenState.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentMethod createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PaymentMethod((com.stripe.android.model.PaymentMethod) parcel.readParcelable(PaymentMethod.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentMethod[] newArray(int i) {
                    return new PaymentMethod[i];
                }
            }

            public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, com.stripe.android.model.PaymentMethod paymentMethod2, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethod2 = paymentMethod.paymentMethod;
                }
                return paymentMethod.copy(paymentMethod2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public final PaymentMethod copy(com.stripe.android.model.PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                return new PaymentMethod(paymentMethod);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentMethod) && Intrinsics.areEqual(this.paymentMethod, ((PaymentMethod) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "PaymentMethod(paymentMethod=" + this.paymentMethod + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.paymentMethod, flags);
            }

            public PaymentMethod(com.stripe.android.model.PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }
        }
    }
}
