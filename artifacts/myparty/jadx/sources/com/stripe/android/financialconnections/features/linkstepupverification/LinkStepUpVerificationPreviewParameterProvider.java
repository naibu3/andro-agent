package com.stripe.android.financialconnections.features.linkstepupverification;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.OTPController;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: LinkStepUpVerificationPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "canonical", "submitting", "otpError", "randomError", "payload", "Lcom/stripe/android/financialconnections/presentation/Async$Success;", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;", "loading", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkStepUpVerificationPreviewParameterProvider implements PreviewParameterProvider<LinkStepUpVerificationState> {
    public static final int $stable = 8;
    private final Sequence<LinkStepUpVerificationState> values = SequencesKt.sequenceOf(loading(), canonical(), submitting(), otpError(), randomError());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<LinkStepUpVerificationState> getValues() {
        return this.values;
    }

    private final LinkStepUpVerificationState canonical() {
        return new LinkStepUpVerificationState(payload(), Async.Uninitialized.INSTANCE, null, 4, null);
    }

    private final LinkStepUpVerificationState submitting() {
        return new LinkStepUpVerificationState(payload(), new Async.Loading(null, 1, null), null, 4, null);
    }

    private final LinkStepUpVerificationState otpError() {
        return new LinkStepUpVerificationState(payload(), new Async.Fail(new ConfirmVerification.OTPError("12345678", ConfirmVerification.OTPError.Type.EMAIL_CODE_EXPIRED)), null, 4, null);
    }

    private final LinkStepUpVerificationState randomError() {
        return new LinkStepUpVerificationState(payload(), new Async.Fail(new Exception("Random error")), null, 4, null);
    }

    private final Async.Success<LinkStepUpVerificationState.Payload> payload() {
        return new Async.Success<>(new LinkStepUpVerificationState.Payload("theLargestEmailYoulleverseeThatCouldBreakALayout@email.com", "12345678", new OTPElement(IdentifierSpec.INSTANCE.Generic("otp"), new OTPController(0, 1, null)), "12345678"));
    }

    private final LinkStepUpVerificationState loading() {
        return new LinkStepUpVerificationState(new Async.Loading(null, 1, null), null, null, 6, null);
    }
}
