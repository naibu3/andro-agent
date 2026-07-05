package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState$Payload;", "confirmVerification", "", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getConfirmVerification", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NetworkingSaveToLinkVerificationState {
    public static final int $stable = OTPElement.$stable;
    private final Async<Unit> confirmVerification;
    private final Async<Payload> payload;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkingSaveToLinkVerificationState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkingSaveToLinkVerificationState copy$default(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState, Async async, Async async2, int i, Object obj) {
        if ((i & 1) != 0) {
            async = networkingSaveToLinkVerificationState.payload;
        }
        if ((i & 2) != 0) {
            async2 = networkingSaveToLinkVerificationState.confirmVerification;
        }
        return networkingSaveToLinkVerificationState.copy(async, async2);
    }

    public final Async<Payload> component1() {
        return this.payload;
    }

    public final Async<Unit> component2() {
        return this.confirmVerification;
    }

    public final NetworkingSaveToLinkVerificationState copy(Async<Payload> payload, Async<Unit> confirmVerification) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(confirmVerification, "confirmVerification");
        return new NetworkingSaveToLinkVerificationState(payload, confirmVerification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingSaveToLinkVerificationState)) {
            return false;
        }
        NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState = (NetworkingSaveToLinkVerificationState) other;
        return Intrinsics.areEqual(this.payload, networkingSaveToLinkVerificationState.payload) && Intrinsics.areEqual(this.confirmVerification, networkingSaveToLinkVerificationState.confirmVerification);
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.confirmVerification.hashCode();
    }

    public String toString() {
        return "NetworkingSaveToLinkVerificationState(payload=" + this.payload + ", confirmVerification=" + this.confirmVerification + ")";
    }

    public NetworkingSaveToLinkVerificationState(Async<Payload> payload, Async<Unit> confirmVerification) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(confirmVerification, "confirmVerification");
        this.payload = payload;
        this.confirmVerification = confirmVerification;
    }

    public /* synthetic */ NetworkingSaveToLinkVerificationState(Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final Async<Unit> getConfirmVerification() {
        return this.confirmVerification;
    }

    /* compiled from: NetworkingSaveToLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState$Payload;", "", "showNotNowButton", "", "email", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "consumerSessionClientSecret", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;)V", "getShowNotNowButton", "()Z", "getEmail", "()Ljava/lang/String;", "getPhoneNumber", "getOtpElement", "()Lcom/stripe/android/uicore/elements/OTPElement;", "getConsumerSessionClientSecret", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = OTPElement.$stable;
        private final String consumerSessionClientSecret;
        private final String email;
        private final OTPElement otpElement;
        private final String phoneNumber;
        private final boolean showNotNowButton;

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z, String str, String str2, OTPElement oTPElement, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = payload.showNotNowButton;
            }
            if ((i & 2) != 0) {
                str = payload.email;
            }
            if ((i & 4) != 0) {
                str2 = payload.phoneNumber;
            }
            if ((i & 8) != 0) {
                oTPElement = payload.otpElement;
            }
            if ((i & 16) != 0) {
                str3 = payload.consumerSessionClientSecret;
            }
            String str4 = str3;
            String str5 = str2;
            return payload.copy(z, str, str5, oTPElement, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowNotNowButton() {
            return this.showNotNowButton;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final OTPElement getOtpElement() {
            return this.otpElement;
        }

        /* renamed from: component5, reason: from getter */
        public final String getConsumerSessionClientSecret() {
            return this.consumerSessionClientSecret;
        }

        public final Payload copy(boolean showNotNowButton, String email, String phoneNumber, OTPElement otpElement, String consumerSessionClientSecret) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(otpElement, "otpElement");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new Payload(showNotNowButton, email, phoneNumber, otpElement, consumerSessionClientSecret);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return this.showNotNowButton == payload.showNotNowButton && Intrinsics.areEqual(this.email, payload.email) && Intrinsics.areEqual(this.phoneNumber, payload.phoneNumber) && Intrinsics.areEqual(this.otpElement, payload.otpElement) && Intrinsics.areEqual(this.consumerSessionClientSecret, payload.consumerSessionClientSecret);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.showNotNowButton) * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.otpElement.hashCode()) * 31) + this.consumerSessionClientSecret.hashCode();
        }

        public String toString() {
            return "Payload(showNotNowButton=" + this.showNotNowButton + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", otpElement=" + this.otpElement + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ")";
        }

        public Payload(boolean z, String email, String phoneNumber, OTPElement otpElement, String consumerSessionClientSecret) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(otpElement, "otpElement");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.showNotNowButton = z;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.otpElement = otpElement;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
        }

        public final boolean getShowNotNowButton() {
            return this.showNotNowButton;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final OTPElement getOtpElement() {
            return this.otpElement;
        }

        public final String getConsumerSessionClientSecret() {
            return this.consumerSessionClientSecret;
        }
    }
}
