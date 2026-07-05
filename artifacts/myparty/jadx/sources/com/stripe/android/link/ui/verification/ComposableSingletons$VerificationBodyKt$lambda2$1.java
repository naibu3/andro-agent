package com.stripe.android.link.ui.verification;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.OTPController;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: VerificationBody.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$VerificationBodyKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$VerificationBodyKt$lambda2$1 INSTANCE = new ComposableSingletons$VerificationBodyKt$lambda2$1();

    ComposableSingletons$VerificationBodyKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1814127193, i, -1, "com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt.lambda-2.<anonymous> (VerificationBody.kt:365)");
            }
            VerificationViewState verificationViewState = new VerificationViewState(false, false, null, false, false, "(•••) ••• ••55", "email@email.com", true, true, null);
            OTPElement oTPElement = new OTPElement(IdentifierSpec.INSTANCE.Generic("otp"), new OTPController(0, 1, null));
            composer.startReplaceGroup(1909405792);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt$lambda-2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1909407168);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt$lambda-2$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1909408896);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt$lambda-2$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function03 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1909410336);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt$lambda-2$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function04 = (Function0) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1909411744);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationBodyKt$lambda-2$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            VerificationBodyKt.VerificationBody(verificationViewState, oTPElement, function0, function02, function03, function04, (Function0) objRememberedValue5, composer, (OTPElement.$stable << 3) | 1797510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
