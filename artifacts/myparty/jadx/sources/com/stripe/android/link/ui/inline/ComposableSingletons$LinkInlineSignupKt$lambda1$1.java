package com.stripe.android.link.ui.inline;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SectionController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkInlineSignup.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$LinkInlineSignupKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$LinkInlineSignupKt$lambda1$1 INSTANCE = new ComposableSingletons$LinkInlineSignupKt$lambda1$1();

    ComposableSingletons$LinkInlineSignupKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-549453615, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-1.<anonymous> (LinkInlineSignup.kt:395)");
            }
            SectionController sectionController = new SectionController(null, CollectionsKt.emptyList());
            SimpleTextFieldController simpleTextFieldControllerCreateController$default = EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, "email@me.co", false, 2, null);
            PhoneNumberController phoneNumberControllerCreatePhoneNumberController$default = PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "5555555555", null, null, false, false, 30, null);
            SimpleTextFieldController simpleTextFieldControllerCreateController = NameConfig.INSTANCE.createController("My Name");
            SignUpState signUpState = SignUpState.InputtingRemainingFields;
            composer.startReplaceGroup(108425683);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(108427027);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt$lambda-1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            LinkInlineSignupKt.LinkInlineSignup("Example, Inc.", sectionController, simpleTextFieldControllerCreateController$default, phoneNumberControllerCreatePhoneNumberController$default, simpleTextFieldControllerCreateController, signUpState, true, true, true, false, false, false, null, function0, (Function0) objRememberedValue2, null, composer, (SectionController.$stable << 3) | 920322054 | (SimpleTextFieldController.$stable << 6) | (PhoneNumberController.$stable << 9) | (SimpleTextFieldController.$stable << 12), 28086, 32768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
