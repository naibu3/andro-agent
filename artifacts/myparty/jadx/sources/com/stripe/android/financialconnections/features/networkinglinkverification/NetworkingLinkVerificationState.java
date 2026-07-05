package com.stripe.android.financialconnections.features.networkinglinkverification;

import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkingLinkVerificationViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;", "confirmVerification", "", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getConfirmVerification", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NetworkingLinkVerificationState {
    public static final int $stable = OTPElement.$stable;
    private final Async<Unit> confirmVerification;
    private final Async<Payload> payload;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkingLinkVerificationState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkingLinkVerificationState copy$default(NetworkingLinkVerificationState networkingLinkVerificationState, Async async, Async async2, int i, Object obj) {
        if ((i & 1) != 0) {
            async = networkingLinkVerificationState.payload;
        }
        if ((i & 2) != 0) {
            async2 = networkingLinkVerificationState.confirmVerification;
        }
        return networkingLinkVerificationState.copy(async, async2);
    }

    public final Async<Payload> component1() {
        return this.payload;
    }

    public final Async<Unit> component2() {
        return this.confirmVerification;
    }

    public final NetworkingLinkVerificationState copy(Async<Payload> payload, Async<Unit> confirmVerification) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(confirmVerification, "confirmVerification");
        return new NetworkingLinkVerificationState(payload, confirmVerification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingLinkVerificationState)) {
            return false;
        }
        NetworkingLinkVerificationState networkingLinkVerificationState = (NetworkingLinkVerificationState) other;
        return Intrinsics.areEqual(this.payload, networkingLinkVerificationState.payload) && Intrinsics.areEqual(this.confirmVerification, networkingLinkVerificationState.confirmVerification);
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.confirmVerification.hashCode();
    }

    public String toString() {
        return "NetworkingLinkVerificationState(payload=" + this.payload + ", confirmVerification=" + this.confirmVerification + ")";
    }

    public NetworkingLinkVerificationState(Async<Payload> payload, Async<Unit> confirmVerification) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(confirmVerification, "confirmVerification");
        this.payload = payload;
        this.confirmVerification = confirmVerification;
    }

    public /* synthetic */ NetworkingLinkVerificationState(Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final Async<Unit> getConfirmVerification() {
        return this.confirmVerification;
    }

    /* compiled from: NetworkingLinkVerificationViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;", "", "email", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "consumerSessionClientSecret", "initialInstitution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V", "getEmail", "()Ljava/lang/String;", "getPhoneNumber", "getOtpElement", "()Lcom/stripe/android/uicore/elements/OTPElement;", "getConsumerSessionClientSecret", "getInitialInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = OTPElement.$stable;
        private final String consumerSessionClientSecret;
        private final String email;
        private final FinancialConnectionsInstitution initialInstitution;
        private final OTPElement otpElement;
        private final String phoneNumber;

        public static /* synthetic */ Payload copy$default(Payload payload, String str, String str2, OTPElement oTPElement, String str3, FinancialConnectionsInstitution financialConnectionsInstitution, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payload.email;
            }
            if ((i & 2) != 0) {
                str2 = payload.phoneNumber;
            }
            if ((i & 4) != 0) {
                oTPElement = payload.otpElement;
            }
            if ((i & 8) != 0) {
                str3 = payload.consumerSessionClientSecret;
            }
            if ((i & 16) != 0) {
                financialConnectionsInstitution = payload.initialInstitution;
            }
            FinancialConnectionsInstitution financialConnectionsInstitution2 = financialConnectionsInstitution;
            OTPElement oTPElement2 = oTPElement;
            return payload.copy(str, str2, oTPElement2, str3, financialConnectionsInstitution2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final OTPElement getOtpElement() {
            return this.otpElement;
        }

        /* renamed from: component4, reason: from getter */
        public final String getConsumerSessionClientSecret() {
            return this.consumerSessionClientSecret;
        }

        /* renamed from: component5, reason: from getter */
        public final FinancialConnectionsInstitution getInitialInstitution() {
            return this.initialInstitution;
        }

        public final Payload copy(String email, String phoneNumber, OTPElement otpElement, String consumerSessionClientSecret, FinancialConnectionsInstitution initialInstitution) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(otpElement, "otpElement");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new Payload(email, phoneNumber, otpElement, consumerSessionClientSecret, initialInstitution);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.email, payload.email) && Intrinsics.areEqual(this.phoneNumber, payload.phoneNumber) && Intrinsics.areEqual(this.otpElement, payload.otpElement) && Intrinsics.areEqual(this.consumerSessionClientSecret, payload.consumerSessionClientSecret) && Intrinsics.areEqual(this.initialInstitution, payload.initialInstitution);
        }

        public int hashCode() {
            int iHashCode = ((((((this.email.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.otpElement.hashCode()) * 31) + this.consumerSessionClientSecret.hashCode()) * 31;
            FinancialConnectionsInstitution financialConnectionsInstitution = this.initialInstitution;
            return iHashCode + (financialConnectionsInstitution == null ? 0 : financialConnectionsInstitution.hashCode());
        }

        public String toString() {
            return "Payload(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", otpElement=" + this.otpElement + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ", initialInstitution=" + this.initialInstitution + ")";
        }

        public Payload(String email, String phoneNumber, OTPElement otpElement, String consumerSessionClientSecret, FinancialConnectionsInstitution financialConnectionsInstitution) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(otpElement, "otpElement");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.otpElement = otpElement;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
            this.initialInstitution = financialConnectionsInstitution;
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

        public final FinancialConnectionsInstitution getInitialInstitution() {
            return this.initialInstitution;
        }
    }
}
