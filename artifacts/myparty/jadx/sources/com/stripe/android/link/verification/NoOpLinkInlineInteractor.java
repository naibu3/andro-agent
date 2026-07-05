package com.stripe.android.link.verification;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.link.verification.VerificationState;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.ui.core.elements.OTPSpec;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: NoOpLinkInlineInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/verification/NoOpLinkInlineInteractor;", "Lcom/stripe/android/link/verification/LinkInlineInteractor;", "<init>", "()V", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/link/verification/LinkInlineState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "getOtpElement", "()Lcom/stripe/android/uicore/elements/OTPElement;", "setup", "", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "resendCode", "didShowCodeSentNotification", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NoOpLinkInlineInteractor implements LinkInlineInteractor {
    public static final int $stable = 8;
    private final StateFlow<LinkInlineState> state = StateFlowKt.MutableStateFlow(new LinkInlineState(VerificationState.RenderButton.INSTANCE));
    private final OTPElement otpElement = OTPSpec.INSTANCE.transform();

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public void didShowCodeSentNotification() {
    }

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public void resendCode() {
    }

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public void setup(PaymentMethodMetadata paymentMethodMetadata) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
    }

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public StateFlow<LinkInlineState> getState() {
        return this.state;
    }

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public OTPElement getOtpElement() {
        return this.otpElement;
    }
}
