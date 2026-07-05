package com.stripe.android.uicore.elements;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.uicore.FocusManagerKtKt;
import com.stripe.android.uicore.text.AutofillModifierKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: OTPElementUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OTPElementUIKt$OTPElementUI$2$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TextStyle $boxTextStyle;
    final /* synthetic */ OTPElementColors $colors;
    final /* synthetic */ OTPElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableIntState $focusedElementIndex$delegate;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $otpInputPlaceholder;

    OTPElementUIKt$OTPElementUI$2$1$1(OTPElement oTPElement, int i, boolean z, FocusManager focusManager, FocusRequester focusRequester, TextStyle textStyle, boolean z2, OTPElementColors oTPElementColors, String str, MutableIntState mutableIntState) {
        this.$element = oTPElement;
        this.$index = i;
        this.$isSelected = z;
        this.$focusManager = focusManager;
        this.$focusRequester = focusRequester;
        this.$boxTextStyle = textStyle;
        this.$enabled = z2;
        this.$colors = oTPElementColors;
        this.$otpInputPlaceholder = str;
        this.$focusedElementIndex$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091924397, i, -1, "com.stripe.android.uicore.elements.OTPElementUI.<anonymous>.<anonymous>.<anonymous> (OTPElementUI.kt:147)");
            }
            final State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.$element.getController().getFieldValues$stripe_ui_core_release().get(this.$index), null, composer, 0, 1);
            Modifier modifierM1051height3ABfNKs = SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(56));
            composer.startReplaceGroup(448330171);
            boolean zChanged = composer.changed(this.$index) | composer.changed(this.$isSelected);
            final int i2 = this.$index;
            final boolean z = this.$isSelected;
            final MutableIntState mutableIntState = this.$focusedElementIndex$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OTPElementUIKt$OTPElementUI$2$1$1.invoke$lambda$2$lambda$1(i2, z, mutableIntState, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1051height3ABfNKs, (Function1) objRememberedValue);
            composer.startReplaceGroup(448341356);
            boolean zChanged2 = composer.changed(this.$index) | composer.changed(stateCollectAsState) | composer.changedInstance(this.$focusManager) | composer.changedInstance(this.$element);
            final int i3 = this.$index;
            final FocusManager focusManager = this.$focusManager;
            final OTPElement oTPElement = this.$element;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m8814invokeZmokQxo(keyEvent.m4711unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m8814invokeZmokQxo(android.view.KeyEvent event) throws IOException {
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (i3 != 0 && KeyEventType.m4715equalsimpl0(KeyEvent_androidKt.m4723getTypeZmokQxo(event), KeyEventType.INSTANCE.m4719getKeyDownCS__XNY()) && event.getKeyCode() == 67 && OTPElementUIKt$OTPElementUI$2$1$1.invoke$lambda$0(stateCollectAsState).length() == 0) {
                            FocusManagerKtKt.m8697moveFocusSafelyMxy_nc0(focusManager, FocusDirection.INSTANCE.m3339getPreviousdhqQ8s());
                            oTPElement.getController().onValueChanged(i3 - 1, "");
                            return true;
                        }
                        return false;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierTestTag = TestTagKt.testTag(KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue2), "OTP-" + this.$index);
            composer.startReplaceGroup(448364464);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OTPElementUIKt$OTPElementUI$2$1$1.invoke$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierTestTag, false, (Function1) objRememberedValue3, 1, null);
            composer.startReplaceGroup(448366354);
            if (this.$index == 0) {
                Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierSemantics$default, this.$focusRequester);
                List listListOf = CollectionsKt.listOf(AutofillType.SmsOtpCode);
                Object controller = this.$element.getController();
                composer.startReplaceGroup(448374772);
                boolean zChangedInstance = composer.changedInstance(controller);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = (KFunction) new OTPElementUIKt$OTPElementUI$2$1$1$1$1(controller);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                modifierSemantics$default = AutofillModifierKt.autofill(modifierFocusRequester, listListOf, (Function1) ((KFunction) objRememberedValue4), composer, 48);
            }
            composer.endReplaceGroup();
            OTPElementUIKt.OTPInputBox(invoke$lambda$0(stateCollectAsState), this.$isSelected, this.$boxTextStyle, this.$element, this.$index, this.$focusManager, modifierSemantics$default, this.$enabled, this.$colors, this.$otpInputPlaceholder, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(int i, boolean z, MutableIntState mutableIntState, FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (!focusState.isFocused()) {
            if (!focusState.isFocused() && z) {
                mutableIntState.setIntValue(-1);
            }
        } else {
            mutableIntState.setIntValue(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$0(State<String> state) {
        return state.getValue();
    }
}
