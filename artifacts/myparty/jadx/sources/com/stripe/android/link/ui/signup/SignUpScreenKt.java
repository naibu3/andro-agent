package com.stripe.android.link.ui.signup;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.ErrorTextKt;
import com.stripe.android.link.ui.LinkSpinnerKt;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.PrimaryButtonState;
import com.stripe.android.link.ui.ScrollableTopLevelColumnKt;
import com.stripe.android.link.ui.signup.SignUpScreenKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.SectionStyle;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SignUpScreen.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a;\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a%\u0010\u0019\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u001b\u001a\u00020\u001cX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001cX\u0080T¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"SignUpScreen", "", "viewModel", "Lcom/stripe/android/link/ui/signup/SignUpViewModel;", "(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Landroidx/compose/runtime/Composer;I)V", "SignUpBody", "emailController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "phoneNumberController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "nameController", "signUpScreenState", "Lcom/stripe/android/link/ui/signup/SignUpScreenState;", "onSignUpClick", "Lkotlin/Function0;", "(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpScreenState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EmailCollectionSection", "canEditForm", "", "canEditEmail", "signUpState", "Lcom/stripe/android/link/ui/signup/SignUpState;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(ZZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V", "SecondaryFields", "(Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpScreenState;Landroidx/compose/runtime/Composer;I)V", "SIGN_UP_HEADER_TAG", "", "SIGN_UP_ERROR_TAG", "SignUpScreenLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "SignUpScreenPreview", "paymentsheet_release", "didFocusField", "focused", "emailFocused", "nameFocused"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignUpScreenKt {
    public static final String SIGN_UP_ERROR_TAG = "signUpErrorTag";
    public static final String SIGN_UP_HEADER_TAG = "signUpHeaderTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailCollectionSection$lambda$19(boolean z, boolean z2, TextFieldController textFieldController, SignUpState signUpState, FocusRequester focusRequester, int i, int i2, Composer composer, int i3) {
        EmailCollectionSection(z, z2, textFieldController, signUpState, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryFields$lambda$29(PhoneNumberController phoneNumberController, TextFieldController textFieldController, SignUpScreenState signUpScreenState, int i, Composer composer, int i2) {
        SecondaryFields(phoneNumberController, textFieldController, signUpScreenState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignUpBody$lambda$9(TextFieldController textFieldController, PhoneNumberController phoneNumberController, TextFieldController textFieldController2, SignUpScreenState signUpScreenState, Function0 function0, int i, Composer composer, int i2) {
        SignUpBody(textFieldController, phoneNumberController, textFieldController2, signUpScreenState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignUpScreen$lambda$2(SignUpViewModel signUpViewModel, int i, Composer composer, int i2) {
        SignUpScreen(signUpViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignUpScreenLoadingPreview$lambda$30(int i, Composer composer, int i2) {
        SignUpScreenLoadingPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignUpScreenPreview$lambda$31(int i, Composer composer, int i2) {
        SignUpScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SignUpScreen(final SignUpViewModel viewModel, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1651296263);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651296263, i2, -1, "com.stripe.android.link.ui.signup.SignUpScreen (SignUpScreen.kt:61)");
            }
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getState(), null, composerStartRestartGroup, 0, 1);
            SimpleTextFieldController emailController = viewModel.getEmailController();
            PhoneNumberController phoneNumberController = viewModel.getPhoneNumberController();
            SimpleTextFieldController nameController = viewModel.getNameController();
            SignUpScreenState signUpScreenStateSignUpScreen$lambda$0 = SignUpScreen$lambda$0(stateCollectAsState);
            composerStartRestartGroup.startReplaceGroup(-1727615175);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
            SignUpScreenKt$SignUpScreen$1$1 signUpScreenKt$SignUpScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || signUpScreenKt$SignUpScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                signUpScreenKt$SignUpScreen$1$1RememberedValue = new SignUpScreenKt$SignUpScreen$1$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(signUpScreenKt$SignUpScreen$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SignUpBody(emailController, phoneNumberController, nameController, signUpScreenStateSignUpScreen$lambda$0, (Function0) ((KFunction) signUpScreenKt$SignUpScreen$1$1RememberedValue), composerStartRestartGroup, SimpleTextFieldController.$stable | (PhoneNumberController.$stable << 3) | (SimpleTextFieldController.$stable << 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SignUpScreenKt.SignUpScreen$lambda$2(viewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SignUpBody(final TextFieldController emailController, final PhoneNumberController phoneNumberController, final TextFieldController nameController, final SignUpScreenState signUpScreenState, final Function0<Unit> onSignUpClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(phoneNumberController, "phoneNumberController");
        Intrinsics.checkNotNullParameter(nameController, "nameController");
        Intrinsics.checkNotNullParameter(signUpScreenState, "signUpScreenState");
        Intrinsics.checkNotNullParameter(onSignUpClick, "onSignUpClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1738133955);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(emailController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(phoneNumberController) : composerStartRestartGroup.changedInstance(phoneNumberController) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(nameController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(signUpScreenState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSignUpClick) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1738133955, i2, -1, "com.stripe.android.link.ui.signup.SignUpBody (SignUpScreen.kt:80)");
            }
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localSoftwareKeyboardController);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) objConsume;
            boolean z = signUpScreenState.getSignUpState() == SignUpState.InputtingRemainingFields;
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(-1233002320);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SignUpScreenKt.SignUpBody$lambda$4$lambda$3();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(-1233000524);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1232999160);
            if (!SignUpBody$lambda$5(mutableState) && signUpScreenState.getSignUpState() == SignUpState.InputtingPrimaryField) {
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1232995415);
                boolean zChanged = composerStartRestartGroup.changed(mutableState);
                SignUpScreenKt$SignUpBody$1$1 signUpScreenKt$SignUpBody$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || signUpScreenKt$SignUpBody$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    signUpScreenKt$SignUpBody$1$1RememberedValue = new SignUpScreenKt$SignUpBody$1$1(focusRequester, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(signUpScreenKt$SignUpBody$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) signUpScreenKt$SignUpBody$1$1RememberedValue, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            ScrollableTopLevelColumnKt.ScrollableTopLevelColumn(null, ComposableLambdaKt.rememberComposableLambda(224319795, true, new AnonymousClass2(z, signUpScreenState, onSignUpClick, softwareKeyboardController, emailController, focusRequester, phoneNumberController, nameController), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SignUpScreenKt.SignUpBody$lambda$9(emailController, phoneNumberController, nameController, signUpScreenState, onSignUpClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SignUpBody$lambda$4$lambda$3() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean SignUpBody$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SignUpBody$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: SignUpScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ TextFieldController $emailController;
        final /* synthetic */ FocusRequester $emailFocusRequester;
        final /* synthetic */ boolean $isSigningUp;
        final /* synthetic */ SoftwareKeyboardController $keyboardController;
        final /* synthetic */ TextFieldController $nameController;
        final /* synthetic */ Function0<Unit> $onSignUpClick;
        final /* synthetic */ PhoneNumberController $phoneNumberController;
        final /* synthetic */ SignUpScreenState $signUpScreenState;

        AnonymousClass2(boolean z, SignUpScreenState signUpScreenState, Function0<Unit> function0, SoftwareKeyboardController softwareKeyboardController, TextFieldController textFieldController, FocusRequester focusRequester, PhoneNumberController phoneNumberController, TextFieldController textFieldController2) {
            this.$isSigningUp = z;
            this.$signUpScreenState = signUpScreenState;
            this.$onSignUpClick = function0;
            this.$keyboardController = softwareKeyboardController;
            this.$emailController = textFieldController;
            this.$emailFocusRequester = focusRequester;
            this.$phoneNumberController = phoneNumberController;
            this.$nameController = textFieldController2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope ScrollableTopLevelColumn, Composer composer, int i) {
            int i2;
            String strStringResource;
            PrimaryButtonState primaryButtonState;
            Intrinsics.checkNotNullParameter(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(ScrollableTopLevelColumn) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(224319795, i2, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous> (SignUpScreen.kt:96)");
                }
                float f = 4;
                int i3 = i2;
                TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_link_sign_up_header_v2, composer, 0), PaddingKt.m1022paddingVpY3zN4$default(TestTagKt.testTag(Modifier.INSTANCE, SignUpScreenKt.SIGN_UP_HEADER_TAG), 0.0f, Dp.m6117constructorimpl(f), 1, null), LinkTheme.INSTANCE.getColors(composer, 6).m7810getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(TextAlign.INSTANCE.m6006getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composer, 6).getTitle(), composer, 48, 0, 65016);
                TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_link_sign_up_message_v2, composer, 0), PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(f), 0.0f, Dp.m6117constructorimpl(30), 5, null), LinkTheme.INSTANCE.getColors(composer, 6).m7812getTextTertiary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(TextAlign.INSTANCE.m6006getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composer, 6).getBody(), composer, 48, 0, 65016);
                SectionStyle sectionStyle = SectionStyle.Bordered;
                final SignUpScreenState signUpScreenState = this.$signUpScreenState;
                final TextFieldController textFieldController = this.$emailController;
                final FocusRequester focusRequester = this.$emailFocusRequester;
                ColorKt.StripeThemeForLink(sectionStyle, ComposableLambdaKt.rememberComposableLambda(1882554302, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt.SignUpBody.2.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1882554302, i4, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous> (SignUpScreen.kt:115)");
                            }
                            SignUpScreenKt.EmailCollectionSection(signUpScreenState.getCanEditForm(), signUpScreenState.getCanEditEmail(), textFieldController, signUpScreenState.getSignUpState(), focusRequester, composer2, 24576, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 54, 0);
                boolean z = (this.$isSigningUp || this.$signUpScreenState.getErrorMessage() == null) ? false : true;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                final SignUpScreenState signUpScreenState2 = this.$signUpScreenState;
                int i4 = i3 & 14;
                AnimatedVisibilityKt.AnimatedVisibility(ScrollableTopLevelColumn, z, modifierFillMaxWidth$default, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(115766107, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt.SignUpBody.2.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                        String strResolve;
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(115766107, i5, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous> (SignUpScreen.kt:127)");
                        }
                        ResolvableString errorMessage = signUpScreenState2.getErrorMessage();
                        if (errorMessage == null) {
                            strResolve = null;
                        } else {
                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composer2.consume(localContext);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            strResolve = errorMessage.resolve((Context) objConsume);
                        }
                        if (strResolve == null) {
                            strResolve = "";
                        }
                        ErrorTextKt.ErrorText(strResolve, TestTagKt.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), SignUpScreenKt.SIGN_UP_ERROR_TAG), null, composer2, 48, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, i4 | 1573248, 28);
                boolean z2 = this.$isSigningUp;
                final PhoneNumberController phoneNumberController = this.$phoneNumberController;
                final TextFieldController textFieldController2 = this.$nameController;
                final SignUpScreenState signUpScreenState3 = this.$signUpScreenState;
                AnimatedVisibilityKt.AnimatedVisibility(ScrollableTopLevelColumn, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(185782532, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt.SignUpBody.2.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(185782532, i5, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous> (SignUpScreen.kt:135)");
                        }
                        SignUpScreenKt.SecondaryFields(phoneNumberController, textFieldController2, signUpScreenState3, composer2, PhoneNumberController.$stable);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, i4 | 1572864, 30);
                Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 1, null);
                if (this.$isSigningUp) {
                    composer.startReplaceGroup(1043994144);
                    strStringResource = StringResources_androidKt.stringResource(R.string.stripe_link_sign_up, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1044075798);
                    strStringResource = StringResources_androidKt.stringResource(R.string.stripe_link_log_in_or_sign_up, composer, 0);
                    composer.endReplaceGroup();
                }
                if (this.$signUpScreenState.isSubmitting()) {
                    primaryButtonState = PrimaryButtonState.Processing;
                } else {
                    primaryButtonState = this.$signUpScreenState.getSignUpEnabled() ? PrimaryButtonState.Enabled : PrimaryButtonState.Disabled;
                }
                composer.startReplaceGroup(-381950352);
                boolean zChanged = composer.changed(this.$onSignUpClick) | composer.changed(this.$keyboardController);
                final Function0<Unit> function0 = this.$onSignUpClick;
                final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SignUpScreenKt.AnonymousClass2.invoke$lambda$1$lambda$0(function0, softwareKeyboardController);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                PrimaryButtonKt.PrimaryButton(modifierM1022paddingVpY3zN4$default, strStringResource, primaryButtonState, (Function0) objRememberedValue, null, null, composer, 6, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0, SoftwareKeyboardController softwareKeyboardController) {
            function0.invoke();
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmailCollectionSection(final boolean z, final boolean z2, final TextFieldController emailController, final SignUpState signUpState, FocusRequester focusRequester, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        FocusRequester focusRequester2;
        FocusRequester focusRequester3;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final FocusRequester focusRequester4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        Composer composerStartRestartGroup = composer.startRestartGroup(788378004);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(emailController) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(signUpState) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    focusRequester2 = focusRequester;
                    i3 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    focusRequester4 = focusRequester2;
                } else {
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(860055717);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        focusRequester3 = (FocusRequester) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        focusRequester3 = focusRequester2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(788378004, i3, -1, "com.stripe.android.link.ui.signup.EmailCollectionSection (SignUpScreen.kt:170)");
                    }
                    Object[] objArr = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(860057953);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SignUpScreenKt.EmailCollectionSection$lambda$12$lambda$11();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(0));
                    Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    float f = 8;
                    FocusRequester focusRequester5 = focusRequester3;
                    TextFieldUIKt.TextFieldSection(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), 1, null), emailController, EmailCollectionSection$lambda$13(mutableState), null, ComposableLambdaKt.rememberComposableLambda(-1106691965, true, new SignUpScreenKt$EmailCollectionSection$2$1(focusRequester5, mutableState, signUpState, z3, z4, emailController), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 24582, 8);
                    composerStartRestartGroup.startReplaceGroup(181139623);
                    if (signUpState == SignUpState.VerifyingEmail) {
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                        Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        long jM7800getIconPrimary0d7_KjU = LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7800getIconPrimary0d7_KjU();
                        float fM6117constructorimpl = Dp.m6117constructorimpl(4);
                        Modifier modifierM1065size3ABfNKs = SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(20));
                        composerStartRestartGroup.startReplaceGroup(-101180020);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SignUpScreenKt.EmailCollectionSection$lambda$18$lambda$17$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        LinkSpinnerKt.m7868LinkSpinnerh1eTWw(SemanticsModifierKt.semantics$default(modifierM1065size3ABfNKs, false, (Function1) objRememberedValue3, 1, null), jM7800getIconPrimary0d7_KjU, 0L, fM6117constructorimpl, composerStartRestartGroup, 3072, 4);
                        composerStartRestartGroup = composerStartRestartGroup;
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    focusRequester4 = focusRequester5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SignUpScreenKt.EmailCollectionSection$lambda$19(z, z2, emailController, signUpState, focusRequester4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            focusRequester2 = focusRequester;
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(860057953);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                MutableState mutableState2 = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Modifier modifierM1020padding3ABfNKs2 = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(0));
                Alignment centerEnd2 = Alignment.INSTANCE.getCenterEnd();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd2, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting()) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    float f2 = 8;
                    FocusRequester focusRequester52 = focusRequester3;
                    TextFieldUIKt.TextFieldSection(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f2), 1, null), emailController, EmailCollectionSection$lambda$13(mutableState2), null, ComposableLambdaKt.rememberComposableLambda(-1106691965, true, new SignUpScreenKt$EmailCollectionSection$2$1(focusRequester52, mutableState2, signUpState, z3, z4, emailController), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 24582, 8);
                    composerStartRestartGroup.startReplaceGroup(181139623);
                    if (signUpState == SignUpState.VerifyingEmail) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    focusRequester4 = focusRequester52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        focusRequester2 = focusRequester;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState EmailCollectionSection$lambda$12$lambda$11() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean EmailCollectionSection$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmailCollectionSection$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailCollectionSection$lambda$18$lambda$17$lambda$16$lambda$15(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, "CircularProgressIndicator");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SecondaryFields(final PhoneNumberController phoneNumberController, final TextFieldController textFieldController, final SignUpScreenState signUpScreenState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1710948203);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(phoneNumberController) : composerStartRestartGroup.changedInstance(phoneNumberController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(textFieldController) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(signUpScreenState) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1710948203, i2, -1, "com.stripe.android.link.ui.signup.SecondaryFields (SignUpScreen.kt:220)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(-1187553687);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SignUpScreenKt.SecondaryFields$lambda$21$lambda$20();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(-1187551575);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SignUpScreenKt.SecondaryFields$lambda$25$lambda$24();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            MutableState mutableState2 = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ColorKt.StripeThemeForLink(SectionStyle.Bordered, ComposableLambdaKt.rememberComposableLambda(390965942, true, new SignUpScreenKt$SecondaryFields$1$1(mutableState, signUpScreenState, phoneNumberController, mutableState2, textFieldController), composerStartRestartGroup, 54), composerStartRestartGroup, 54, 0);
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, signUpScreenState.getErrorMessage() != null, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(562799417, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$SecondaryFields$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                    String strResolve;
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(562799417, i3, -1, "com.stripe.android.link.ui.signup.SecondaryFields.<anonymous>.<anonymous> (SignUpScreen.kt:266)");
                    }
                    ResolvableString errorMessage = signUpScreenState.getErrorMessage();
                    if (errorMessage == null) {
                        strResolve = null;
                    } else {
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composer2.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        strResolve = errorMessage.resolve((Context) objConsume);
                    }
                    if (strResolve == null) {
                        strResolve = "";
                    }
                    ErrorTextKt.ErrorText(strResolve, SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, SignUpScreenKt.SIGN_UP_ERROR_TAG), 0.0f, 1, null), null, composer2, 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
            composerStartRestartGroup = composerStartRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SignUpScreenKt.SecondaryFields$lambda$29(phoneNumberController, textFieldController, signUpScreenState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SecondaryFields$lambda$21$lambda$20() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SecondaryFields$lambda$22(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SecondaryFields$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SecondaryFields$lambda$25$lambda$24() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SecondaryFields$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SecondaryFields$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final void SignUpScreenLoadingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1323492979);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1323492979, i, -1, "com.stripe.android.link.ui.signup.SignUpScreenLoadingPreview (SignUpScreen.kt:281)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$SignUpScreenKt.INSTANCE.m7905getLambda1$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SignUpScreenKt.SignUpScreenLoadingPreview$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SignUpScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-444022891);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-444022891, i, -1, "com.stripe.android.link.ui.signup.SignUpScreenPreview (SignUpScreen.kt:301)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$SignUpScreenKt.INSTANCE.m7906getLambda2$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.signup.SignUpScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SignUpScreenKt.SignUpScreenPreview$lambda$31(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SignUpScreenState SignUpScreen$lambda$0(State<SignUpScreenState> state) {
        return state.getValue();
    }
}
