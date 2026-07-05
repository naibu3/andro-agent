package com.stripe.android.uicore.elements;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusEventModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.FocusManagerKtKt;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.text.AutofillModifierKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PhoneNumberElementUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PhoneNumberElementUIKt$PhoneNumberElementUI$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ PhoneNumberController $controller;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Function2<Composer, Integer, Unit> $countryDropdown;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Boolean> $hasFocus$delegate;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ State<ResolvableString> $label$delegate;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ State<String> $placeholder$delegate;
    final /* synthetic */ FormInsets $textFieldInsets;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ State<String> $value$delegate;
    final /* synthetic */ State<VisualTransformation> $visualTransformation$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    PhoneNumberElementUIKt$PhoneNumberElementUI$4(PhoneNumberController phoneNumberController, Modifier modifier, BringIntoViewRequester bringIntoViewRequester, FocusRequester focusRequester, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, int i, FocusManager focusManager, FormInsets formInsets, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, TextFieldColors textFieldColors, State<String> state, State<? extends VisualTransformation> state2, State<? extends ResolvableString> state3, State<String> state4) {
        this.$controller = phoneNumberController;
        this.$modifier = modifier;
        this.$bringIntoViewRequester = bringIntoViewRequester;
        this.$focusRequester = focusRequester;
        this.$coroutineScope = coroutineScope;
        this.$hasFocus$delegate = mutableState;
        this.$imeAction = i;
        this.$focusManager = focusManager;
        this.$textFieldInsets = formInsets;
        this.$enabled = z;
        this.$countryDropdown = function2;
        this.$trailingIcon = function22;
        this.$colors = textFieldColors;
        this.$value$delegate = state;
        this.$visualTransformation$delegate = state2;
        this.$label$delegate = state3;
        this.$placeholder$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1206588108, i, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:145)");
        }
        String strPhoneNumberElementUI_Rts_TWA$lambda$9 = PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$9(this.$value$delegate);
        PhoneNumberController phoneNumberController = this.$controller;
        composer.startReplaceGroup(135314976);
        boolean zChangedInstance = composer.changedInstance(phoneNumberController);
        PhoneNumberElementUIKt$PhoneNumberElementUI$4$1$1 phoneNumberElementUIKt$PhoneNumberElementUI$4$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || phoneNumberElementUIKt$PhoneNumberElementUI$4$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            phoneNumberElementUIKt$PhoneNumberElementUI$4$1$1RememberedValue = new PhoneNumberElementUIKt$PhoneNumberElementUI$4$1$1(phoneNumberController);
            composer.updateRememberedValue(phoneNumberElementUIKt$PhoneNumberElementUI$4$1$1RememberedValue);
        }
        KFunction kFunction = (KFunction) phoneNumberElementUIKt$PhoneNumberElementUI$4$1$1RememberedValue;
        composer.endReplaceGroup();
        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null), this.$bringIntoViewRequester), this.$focusRequester);
        List listListOf = CollectionsKt.listOf(AutofillType.PhoneNumberNational);
        PhoneNumberController phoneNumberController2 = this.$controller;
        composer.startReplaceGroup(135325504);
        boolean zChangedInstance2 = composer.changedInstance(phoneNumberController2);
        PhoneNumberElementUIKt$PhoneNumberElementUI$4$2$1 phoneNumberElementUIKt$PhoneNumberElementUI$4$2$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance2 || phoneNumberElementUIKt$PhoneNumberElementUI$4$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            phoneNumberElementUIKt$PhoneNumberElementUI$4$2$1RememberedValue = new PhoneNumberElementUIKt$PhoneNumberElementUI$4$2$1(phoneNumberController2);
            composer.updateRememberedValue(phoneNumberElementUIKt$PhoneNumberElementUI$4$2$1RememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierAutofill = AutofillModifierKt.autofill(modifierFocusRequester, listListOf, (Function1) ((KFunction) phoneNumberElementUIKt$PhoneNumberElementUI$4$2$1RememberedValue), composer, 48);
        composer.startReplaceGroup(135328049);
        boolean zChangedInstance3 = composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$bringIntoViewRequester);
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final BringIntoViewRequester bringIntoViewRequester = this.$bringIntoViewRequester;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhoneNumberElementUIKt$PhoneNumberElementUI$4.invoke$lambda$3$lambda$2(coroutineScope, bringIntoViewRequester, (FocusState) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierOnFocusEvent = FocusEventModifierKt.onFocusEvent(modifierAutofill, (Function1) objRememberedValue);
        composer.startReplaceGroup(135334575);
        boolean zChanged = composer.changed(this.$hasFocus$delegate) | composer.changedInstance(this.$controller);
        final PhoneNumberController phoneNumberController3 = this.$controller;
        final MutableState<Boolean> mutableState = this.$hasFocus$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhoneNumberElementUIKt$PhoneNumberElementUI$4.invoke$lambda$5$lambda$4(phoneNumberController3, mutableState, (FocusState) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierTestTag = TestTagKt.testTag(FocusChangedModifierKt.onFocusChanged(modifierOnFocusEvent, (Function1) objRememberedValue2), PhoneNumberElementUIKt.PHONE_NUMBER_TEXT_FIELD_TAG);
        VisualTransformation visualTransformationPhoneNumberElementUI_Rts_TWA$lambda$14 = PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$14(this.$visualTransformation$delegate);
        KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m5840getPhonePjHm6EE(), this.$imeAction, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
        composer.startReplaceGroup(135374828);
        boolean zChangedInstance4 = composer.changedInstance(this.$focusManager);
        final FocusManager focusManager = this.$focusManager;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$4$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhoneNumberElementUIKt$PhoneNumberElementUI$4.invoke$lambda$7$lambda$6(focusManager, (KeyboardActionScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function1 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(135371136);
        boolean zChangedInstance5 = composer.changedInstance(this.$focusManager);
        final FocusManager focusManager2 = this.$focusManager;
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$4$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhoneNumberElementUIKt$PhoneNumberElementUI$4.invoke$lambda$9$lambda$8(focusManager2, (KeyboardActionScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        KeyboardActions keyboardActions = new KeyboardActions(function1, null, (Function1) objRememberedValue4, null, null, null, 58, null);
        PaddingValues paddingValuesAsPaddingValues = this.$textFieldInsets.asPaddingValues();
        boolean z = this.$enabled;
        final PhoneNumberController phoneNumberController4 = this.$controller;
        final State<ResolvableString> state = this.$label$delegate;
        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1503889606, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$4.7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                String strResolve;
                if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1503889606, i2, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous>.<anonymous> (PhoneNumberElementUI.kt:170)");
                    }
                    if (phoneNumberController4.getShowOptionalLabel()) {
                        composer2.startReplaceGroup(-1043440202);
                        strResolve = StringResources_androidKt.stringResource(R.string.stripe_form_label_optional, new Object[]{ResolvableStringComposeUtilsKt.resolve(PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$12(state), composer2, 0)}, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1043242019);
                        strResolve = ResolvableStringComposeUtilsKt.resolve(PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$12(state), composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    FormLabelKt.FormLabel(strResolve, null, composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composer, 54);
        final State<String> state2 = this.$placeholder$delegate;
        CompatTextFieldKt.CompatTextField(strPhoneNumberElementUI_Rts_TWA$lambda$9, (Function1<? super String, Unit>) kFunction, modifierTestTag, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-140059163, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$4.8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-140059163, i2, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous>.<anonymous> (PhoneNumberElementUI.kt:182)");
                }
                TextKt.m2076Text4IGK_g(PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$13(state2), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), (Function2<? super Composer, ? super Integer, Unit>) this.$countryDropdown, (Function2<? super Composer, ? super Integer, Unit>) this.$trailingIcon, false, (String) null, visualTransformationPhoneNumberElementUI_Rts_TWA$lambda$14, keyboardOptions, keyboardActions, true, 0, 0, (MutableInteractionSource) null, (Shape) null, this.$colors, paddingValuesAsPaddingValues, composer, 14155776, 196656, 0, 984112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isFocused()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PhoneNumberElementUIKt$PhoneNumberElementUI$4$3$1$1(bringIntoViewRequester, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(PhoneNumberController phoneNumberController, MutableState mutableState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$17(mutableState) != it.isFocused()) {
            phoneNumberController.onFocusChange(it.isFocused());
        }
        PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$18(mutableState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        FocusManagerKtKt.m8697moveFocusSafelyMxy_nc0(focusManager, FocusDirection.INSTANCE.m3338getNextdhqQ8s());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.INSTANCE;
    }
}
