package com.stripe.android.financialconnections.features.linkstepupverification;

import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkStepUpVerificationViewModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001 B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;", "confirmVerification", "", "resendOtp", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getConfirmVerification", "getResendOtp", "submitLoading", "", "getSubmitLoading", "()Z", "submitError", "", "getSubmitError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkStepUpVerificationState {
    public static final int $stable = OTPElement.$stable;
    private final Async<Unit> confirmVerification;
    private final Async<Payload> payload;
    private final Async<Unit> resendOtp;

    public LinkStepUpVerificationState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkStepUpVerificationState copy$default(LinkStepUpVerificationState linkStepUpVerificationState, Async async, Async async2, Async async3, int i, Object obj) {
        if ((i & 1) != 0) {
            async = linkStepUpVerificationState.payload;
        }
        if ((i & 2) != 0) {
            async2 = linkStepUpVerificationState.confirmVerification;
        }
        if ((i & 4) != 0) {
            async3 = linkStepUpVerificationState.resendOtp;
        }
        return linkStepUpVerificationState.copy(async, async2, async3);
    }

    public final Async<Payload> component1() {
        return this.payload;
    }

    public final Async<Unit> component2() {
        return this.confirmVerification;
    }

    public final Async<Unit> component3() {
        return this.resendOtp;
    }

    public final LinkStepUpVerificationState copy(Async<Payload> payload, Async<Unit> confirmVerification, Async<Unit> resendOtp) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(confirmVerification, "confirmVerification");
        Intrinsics.checkNotNullParameter(resendOtp, "resendOtp");
        return new LinkStepUpVerificationState(payload, confirmVerification, resendOtp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkStepUpVerificationState)) {
            return false;
        }
        LinkStepUpVerificationState linkStepUpVerificationState = (LinkStepUpVerificationState) other;
        return Intrinsics.areEqual(this.payload, linkStepUpVerificationState.payload) && Intrinsics.areEqual(this.confirmVerification, linkStepUpVerificationState.confirmVerification) && Intrinsics.areEqual(this.resendOtp, linkStepUpVerificationState.resendOtp);
    }

    public int hashCode() {
        return (((this.payload.hashCode() * 31) + this.confirmVerification.hashCode()) * 31) + this.resendOtp.hashCode();
    }

    public String toString() {
        return "LinkStepUpVerificationState(payload=" + this.payload + ", confirmVerification=" + this.confirmVerification + ", resendOtp=" + this.resendOtp + ")";
    }

    public LinkStepUpVerificationState(Async<Payload> payload, Async<Unit> confirmVerification, Async<Unit> resendOtp) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(confirmVerification, "confirmVerification");
        Intrinsics.checkNotNullParameter(resendOtp, "resendOtp");
        this.payload = payload;
        this.confirmVerification = confirmVerification;
        this.resendOtp = resendOtp;
    }

    public /* synthetic */ LinkStepUpVerificationState(Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, Async.Uninitialized uninitialized3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2, (i & 4) != 0 ? Async.Uninitialized.INSTANCE : uninitialized3);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final Async<Unit> getConfirmVerification() {
        return this.confirmVerification;
    }

    public final Async<Unit> getResendOtp() {
        return this.resendOtp;
    }

    public final boolean getSubmitLoading() {
        return (this.confirmVerification instanceof Async.Loading) || (this.resendOtp instanceof Async.Loading);
    }

    public final Throwable getSubmitError() {
        Throwable error = MavericksExtensionsKt.getError(this.confirmVerification);
        return error == null ? MavericksExtensionsKt.getError(this.resendOtp) : error;
    }

    /* compiled from: LinkStepUpVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;", "", "email", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "consumerSessionClientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhoneNumber", "getOtpElement", "()Lcom/stripe/android/uicore/elements/OTPElement;", "getConsumerSessionClientSecret", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = OTPElement.$stable;
        private final String consumerSessionClientSecret;
        private final String email;
        private final OTPElement otpElement;
        private final String phoneNumber;

        public static /* synthetic */ Payload copy$default(Payload payload, String str, String str2, OTPElement oTPElement, String str3, int i, Object obj) {
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
            return payload.copy(str, str2, oTPElement, str3);
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

        public final Payload copy(String email, String phoneNumber, OTPElement otpElement, String consumerSessionClientSecret) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(otpElement, "otpElement");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new Payload(email, phoneNumber, otpElement, consumerSessionClientSecret);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.email, payload.email) && Intrinsics.areEqual(this.phoneNumber, payload.phoneNumber) && Intrinsics.areEqual(this.otpElement, payload.otpElement) && Intrinsics.areEqual(this.consumerSessionClientSecret, payload.consumerSessionClientSecret);
        }

        public int hashCode() {
            return (((((this.email.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.otpElement.hashCode()) * 31) + this.consumerSessionClientSecret.hashCode();
        }

        public String toString() {
            return "Payload(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", otpElement=" + this.otpElement + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ")";
        }

        public Payload(String email, String phoneNumber, OTPElement otpElement, String consumerSessionClientSecret) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(otpElement, "otpElement");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.otpElement = otpElement;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
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
