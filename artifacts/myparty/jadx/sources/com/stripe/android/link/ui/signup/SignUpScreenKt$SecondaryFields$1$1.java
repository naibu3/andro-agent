package com.stripe.android.link.ui.signup;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.stripe.android.link.ui.LinkTermsKt;
import com.stripe.android.link.ui.LinkTermsType;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElementUIKt;
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
final class SignUpScreenKt$SecondaryFields$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Boolean> $emailFocused$delegate;
    final /* synthetic */ TextFieldController $nameController;
    final /* synthetic */ MutableState<Boolean> $nameFocused$delegate;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ SignUpScreenState $signUpScreenState;

    SignUpScreenKt$SecondaryFields$1$1(MutableState<Boolean> mutableState, SignUpScreenState signUpScreenState, PhoneNumberController phoneNumberController, MutableState<Boolean> mutableState2, TextFieldController textFieldController) {
        this.$emailFocused$delegate = mutableState;
        this.$signUpScreenState = signUpScreenState;
        this.$phoneNumberController = phoneNumberController;
        this.$nameFocused$delegate = mutableState2;
        this.$nameController = textFieldController;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int iM5781getDoneeUduSuo;
        Object obj;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(390965942, i, -1, "com.stripe.android.link.ui.signup.SecondaryFields.<anonymous>.<anonymous> (SignUpScreen.kt:225)");
            }
            Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(4), 1, null);
            composer.startReplaceGroup(1675606509);
            boolean zChanged = composer.changed(this.$emailFocused$delegate);
            final MutableState<Boolean> mutableState = this.$emailFocused$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$SecondaryFields$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SignUpScreenKt$SecondaryFields$1$1.invoke$lambda$1$lambda$0(mutableState, (FocusState) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1022paddingVpY3zN4$default, (Function1) objRememberedValue);
            boolean canEditForm = this.$signUpScreenState.getCanEditForm();
            boolean zSecondaryFields$lambda$22 = SignUpScreenKt.SecondaryFields$lambda$22(this.$emailFocused$delegate);
            boolean z = this.$phoneNumberController.getInitialPhoneNumber().length() == 0;
            if (this.$signUpScreenState.getRequiresNameCollection()) {
                iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5783getNexteUduSuo();
            } else {
                iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5781getDoneeUduSuo();
            }
            PhoneNumberElementUIKt.m8822PhoneNumberCollectionSectionfhH9uAM(canEditForm, this.$phoneNumberController, modifierOnFocusChanged, null, zSecondaryFields$lambda$22, null, z, false, null, iM5781getDoneeUduSuo, composer, PhoneNumberController.$stable << 3, TypedValues.CycleType.TYPE_WAVE_OFFSET);
            composer.startReplaceGroup(1675623307);
            if (this.$signUpScreenState.getRequiresNameCollection()) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1675627820);
                boolean zChanged2 = composer.changed(this.$nameFocused$delegate);
                final MutableState<Boolean> mutableState2 = this.$nameFocused$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$SecondaryFields$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SignUpScreenKt$SecondaryFields$1$1.invoke$lambda$3$lambda$2(mutableState2, (FocusState) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                obj = null;
                Modifier modifierM1022paddingVpY3zN4$default2 = PaddingKt.m1022paddingVpY3zN4$default(FocusChangedModifierKt.onFocusChanged(companion, (Function1) objRememberedValue2), 0.0f, Dp.m6117constructorimpl(8), 1, null);
                boolean zSecondaryFields$lambda$26 = SignUpScreenKt.SecondaryFields$lambda$26(this.$nameFocused$delegate);
                TextFieldController textFieldController = this.$nameController;
                final SignUpScreenState signUpScreenState = this.$signUpScreenState;
                final TextFieldController textFieldController2 = this.$nameController;
                TextFieldUIKt.TextFieldSection(modifierM1022paddingVpY3zN4$default2, textFieldController, zSecondaryFields$lambda$26, null, ComposableLambdaKt.rememberComposableLambda(-728414982, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$SecondaryFields$1$1.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-728414982, i2, -1, "com.stripe.android.link.ui.signup.SecondaryFields.<anonymous>.<anonymous>.<anonymous> (SignUpScreen.kt:248)");
                            }
                            Modifier modifierM1022paddingVpY3zN4$default3 = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(4), 1, null);
                            TextFieldUIKt.m8846TextFieldZkbtPhE(textFieldController2, signUpScreenState.getCanEditForm(), ImeAction.INSTANCE.m5781getDoneeUduSuo(), modifierM1022paddingVpY3zN4$default3, null, 0, 0, null, false, false, composer2, 3456, PointerIconCompat.TYPE_TEXT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 24576, 8);
            } else {
                obj = null;
            }
            composer.endReplaceGroup();
            LinkTermsKt.m7870LinkTerms8iNrtrE(LinkTermsType.Full, PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), 0.0f, Dp.m6117constructorimpl(8), 0.0f, Dp.m6117constructorimpl(16), 5, null), TextAlign.INSTANCE.m6006getCentere0LSkKk(), composer, 54, 0);
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
        SignUpScreenKt.SecondaryFields$lambda$23(mutableState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(MutableState mutableState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SignUpScreenKt.SecondaryFields$lambda$27(mutableState, it.isFocused());
        return Unit.INSTANCE;
    }
}
