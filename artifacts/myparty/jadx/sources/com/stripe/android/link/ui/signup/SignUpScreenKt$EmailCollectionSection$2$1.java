package com.stripe.android.link.ui.signup;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.PointerIconCompat;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SignUpScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SignUpScreenKt$EmailCollectionSection$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $canEditEmail;
    final /* synthetic */ boolean $canEditForm;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Boolean> $focused$delegate;
    final /* synthetic */ SignUpState $signUpState;

    SignUpScreenKt$EmailCollectionSection$2$1(FocusRequester focusRequester, MutableState<Boolean> mutableState, SignUpState signUpState, boolean z, boolean z2, TextFieldController textFieldController) {
        this.$focusRequester = focusRequester;
        this.$focused$delegate = mutableState;
        this.$signUpState = signUpState;
        this.$canEditForm = z;
        this.$canEditEmail = z2;
        this.$emailController = textFieldController;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int iM5781getDoneeUduSuo;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1106691965, i, -1, "com.stripe.android.link.ui.signup.EmailCollectionSection.<anonymous>.<anonymous> (SignUpScreen.kt:184)");
            }
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(4), 1, null), this.$focusRequester);
            composer.startReplaceGroup(-101204608);
            boolean zChanged = composer.changed(this.$focused$delegate);
            final MutableState<Boolean> mutableState = this.$focused$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$EmailCollectionSection$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SignUpScreenKt$EmailCollectionSection$2$1.invoke$lambda$1$lambda$0(mutableState, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
            if (this.$signUpState == SignUpState.InputtingRemainingFields) {
                iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5783getNexteUduSuo();
            } else {
                iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5781getDoneeUduSuo();
            }
            TextFieldUIKt.m8846TextFieldZkbtPhE(this.$emailController, this.$canEditForm && this.$canEditEmail && this.$signUpState != SignUpState.VerifyingEmail, iM5781getDoneeUduSuo, modifierOnFocusChanged, null, 0, 0, null, false, false, composer, 0, PointerIconCompat.TYPE_TEXT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SignUpScreenKt.EmailCollectionSection$lambda$14(mutableState, it.isFocused());
        return Unit.INSTANCE;
    }
}
