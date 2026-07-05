package com.stripe.android.link.ui.signup;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: SignUpScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.link.ui.signup.ComposableSingletons$SignUpScreenKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$SignUpScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SignUpScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$SignUpScreenKt$lambda1$1();

    ComposableSingletons$SignUpScreenKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463730935, i, -1, "com.stripe.android.link.ui.signup.ComposableSingletons$SignUpScreenKt.lambda-1.<anonymous> (SignUpScreen.kt:283)");
            }
            SimpleTextFieldController simpleTextFieldControllerCreateController$default = EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, "email@email.com", false, 2, null);
            PhoneNumberController phoneNumberControllerCreatePhoneNumberController$default = PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "5555555555", null, null, false, false, 30, null);
            SimpleTextFieldController simpleTextFieldControllerCreateController = NameConfig.INSTANCE.createController("My Name");
            SignUpScreenState signUpScreenState = new SignUpScreenState("Example, Inc.", false, true, true, SignUpState.VerifyingEmail, false, null, 96, null);
            composer.startReplaceGroup(1356001915);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.signup.ComposableSingletons$SignUpScreenKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SignUpScreenKt.SignUpBody(simpleTextFieldControllerCreateController$default, phoneNumberControllerCreatePhoneNumberController$default, simpleTextFieldControllerCreateController, signUpScreenState, (Function0) objRememberedValue, composer, SimpleTextFieldController.$stable | 24576 | (PhoneNumberController.$stable << 3) | (SimpleTextFieldController.$stable << 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
