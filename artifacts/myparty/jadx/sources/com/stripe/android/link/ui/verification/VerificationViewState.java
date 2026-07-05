package com.stripe.android.link.ui.verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.ui.wallet.DefaultPaymentUI;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationViewState.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jq\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\nHÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lcom/stripe/android/link/ui/verification/VerificationViewState;", "Landroid/os/Parcelable;", "isProcessing", "", "requestFocus", "errorMessage", "Lcom/stripe/android/core/strings/ResolvableString;", "isSendingNewCode", "didSendNewCode", "redactedPhoneNumber", "", "email", "isDialog", "allowLogout", "defaultPayment", "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;", "<init>", "(ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;)V", "()Z", "getRequestFocus", "getErrorMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "getDidSendNewCode", "getRedactedPhoneNumber", "()Ljava/lang/String;", "getEmail", "getAllowLogout", "getDefaultPayment", "()Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VerificationViewState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VerificationViewState> CREATOR = new Creator();
    private final boolean allowLogout;
    private final DefaultPaymentUI defaultPayment;
    private final boolean didSendNewCode;
    private final String email;
    private final ResolvableString errorMessage;
    private final boolean isDialog;
    private final boolean isProcessing;
    private final boolean isSendingNewCode;
    private final String redactedPhoneNumber;
    private final boolean requestFocus;

    /* compiled from: VerificationViewState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationViewState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerificationViewState createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            ResolvableString resolvableString;
            boolean z4;
            boolean z5;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z7 = true;
            boolean z8 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z2 = false;
                z8 = z;
            } else {
                z2 = false;
            }
            ResolvableString resolvableString2 = (ResolvableString) parcel.readParcelable(VerificationViewState.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = z2;
                resolvableString = resolvableString2;
                z4 = z;
            } else {
                z3 = z2;
                resolvableString = resolvableString2;
                z4 = z3;
            }
            if (parcel.readInt() != 0) {
                z5 = z3;
                z3 = z;
            } else {
                z5 = z3;
            }
            String string = parcel.readString();
            boolean z9 = z5;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = z9;
                z9 = z;
            } else {
                z6 = z9;
            }
            if (parcel.readInt() != 0) {
                z6 = z;
            }
            return new VerificationViewState(z7, z8, resolvableString, z4, z3, string, string2, z9, z6, parcel.readInt() == 0 ? null : DefaultPaymentUI.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerificationViewState[] newArray(int i) {
            return new VerificationViewState[i];
        }
    }

    public static /* synthetic */ VerificationViewState copy$default(VerificationViewState verificationViewState, boolean z, boolean z2, ResolvableString resolvableString, boolean z3, boolean z4, String str, String str2, boolean z5, boolean z6, DefaultPaymentUI defaultPaymentUI, int i, Object obj) {
        if ((i & 1) != 0) {
            z = verificationViewState.isProcessing;
        }
        if ((i & 2) != 0) {
            z2 = verificationViewState.requestFocus;
        }
        if ((i & 4) != 0) {
            resolvableString = verificationViewState.errorMessage;
        }
        if ((i & 8) != 0) {
            z3 = verificationViewState.isSendingNewCode;
        }
        if ((i & 16) != 0) {
            z4 = verificationViewState.didSendNewCode;
        }
        if ((i & 32) != 0) {
            str = verificationViewState.redactedPhoneNumber;
        }
        if ((i & 64) != 0) {
            str2 = verificationViewState.email;
        }
        if ((i & 128) != 0) {
            z5 = verificationViewState.isDialog;
        }
        if ((i & 256) != 0) {
            z6 = verificationViewState.allowLogout;
        }
        if ((i & 512) != 0) {
            defaultPaymentUI = verificationViewState.defaultPayment;
        }
        boolean z7 = z6;
        DefaultPaymentUI defaultPaymentUI2 = defaultPaymentUI;
        String str3 = str2;
        boolean z8 = z5;
        boolean z9 = z4;
        String str4 = str;
        return verificationViewState.copy(z, z2, resolvableString, z3, z9, str4, str3, z8, z7, defaultPaymentUI2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsProcessing() {
        return this.isProcessing;
    }

    /* renamed from: component10, reason: from getter */
    public final DefaultPaymentUI getDefaultPayment() {
        return this.defaultPayment;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequestFocus() {
        return this.requestFocus;
    }

    /* renamed from: component3, reason: from getter */
    public final ResolvableString getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSendingNewCode() {
        return this.isSendingNewCode;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDidSendNewCode() {
        return this.didSendNewCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsDialog() {
        return this.isDialog;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAllowLogout() {
        return this.allowLogout;
    }

    public final VerificationViewState copy(boolean isProcessing, boolean requestFocus, ResolvableString errorMessage, boolean isSendingNewCode, boolean didSendNewCode, String redactedPhoneNumber, String email, boolean isDialog, boolean allowLogout, DefaultPaymentUI defaultPayment) {
        Intrinsics.checkNotNullParameter(redactedPhoneNumber, "redactedPhoneNumber");
        Intrinsics.checkNotNullParameter(email, "email");
        return new VerificationViewState(isProcessing, requestFocus, errorMessage, isSendingNewCode, didSendNewCode, redactedPhoneNumber, email, isDialog, allowLogout, defaultPayment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationViewState)) {
            return false;
        }
        VerificationViewState verificationViewState = (VerificationViewState) other;
        return this.isProcessing == verificationViewState.isProcessing && this.requestFocus == verificationViewState.requestFocus && Intrinsics.areEqual(this.errorMessage, verificationViewState.errorMessage) && this.isSendingNewCode == verificationViewState.isSendingNewCode && this.didSendNewCode == verificationViewState.didSendNewCode && Intrinsics.areEqual(this.redactedPhoneNumber, verificationViewState.redactedPhoneNumber) && Intrinsics.areEqual(this.email, verificationViewState.email) && this.isDialog == verificationViewState.isDialog && this.allowLogout == verificationViewState.allowLogout && Intrinsics.areEqual(this.defaultPayment, verificationViewState.defaultPayment);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isProcessing) * 31) + Boolean.hashCode(this.requestFocus)) * 31;
        ResolvableString resolvableString = this.errorMessage;
        int iHashCode2 = (((((((((((((iHashCode + (resolvableString == null ? 0 : resolvableString.hashCode())) * 31) + Boolean.hashCode(this.isSendingNewCode)) * 31) + Boolean.hashCode(this.didSendNewCode)) * 31) + this.redactedPhoneNumber.hashCode()) * 31) + this.email.hashCode()) * 31) + Boolean.hashCode(this.isDialog)) * 31) + Boolean.hashCode(this.allowLogout)) * 31;
        DefaultPaymentUI defaultPaymentUI = this.defaultPayment;
        return iHashCode2 + (defaultPaymentUI != null ? defaultPaymentUI.hashCode() : 0);
    }

    public String toString() {
        return "VerificationViewState(isProcessing=" + this.isProcessing + ", requestFocus=" + this.requestFocus + ", errorMessage=" + this.errorMessage + ", isSendingNewCode=" + this.isSendingNewCode + ", didSendNewCode=" + this.didSendNewCode + ", redactedPhoneNumber=" + this.redactedPhoneNumber + ", email=" + this.email + ", isDialog=" + this.isDialog + ", allowLogout=" + this.allowLogout + ", defaultPayment=" + this.defaultPayment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isProcessing ? 1 : 0);
        dest.writeInt(this.requestFocus ? 1 : 0);
        dest.writeParcelable(this.errorMessage, flags);
        dest.writeInt(this.isSendingNewCode ? 1 : 0);
        dest.writeInt(this.didSendNewCode ? 1 : 0);
        dest.writeString(this.redactedPhoneNumber);
        dest.writeString(this.email);
        dest.writeInt(this.isDialog ? 1 : 0);
        dest.writeInt(this.allowLogout ? 1 : 0);
        DefaultPaymentUI defaultPaymentUI = this.defaultPayment;
        if (defaultPaymentUI == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            defaultPaymentUI.writeToParcel(dest, flags);
        }
    }

    public VerificationViewState(boolean z, boolean z2, ResolvableString resolvableString, boolean z3, boolean z4, String redactedPhoneNumber, String email, boolean z5, boolean z6, DefaultPaymentUI defaultPaymentUI) {
        Intrinsics.checkNotNullParameter(redactedPhoneNumber, "redactedPhoneNumber");
        Intrinsics.checkNotNullParameter(email, "email");
        this.isProcessing = z;
        this.requestFocus = z2;
        this.errorMessage = resolvableString;
        this.isSendingNewCode = z3;
        this.didSendNewCode = z4;
        this.redactedPhoneNumber = redactedPhoneNumber;
        this.email = email;
        this.isDialog = z5;
        this.allowLogout = z6;
        this.defaultPayment = defaultPaymentUI;
    }

    public final boolean isProcessing() {
        return this.isProcessing;
    }

    public final boolean getRequestFocus() {
        return this.requestFocus;
    }

    public final ResolvableString getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean isSendingNewCode() {
        return this.isSendingNewCode;
    }

    public final boolean getDidSendNewCode() {
        return this.didSendNewCode;
    }

    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean isDialog() {
        return this.isDialog;
    }

    public final boolean getAllowLogout() {
        return this.allowLogout;
    }

    public final DefaultPaymentUI getDefaultPayment() {
        return this.defaultPayment;
    }
}
