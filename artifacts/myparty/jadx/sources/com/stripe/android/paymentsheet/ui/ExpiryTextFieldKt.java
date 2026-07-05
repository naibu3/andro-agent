package com.stripe.android.paymentsheet.ui;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.elements.ExpiryDateVisualTransformation;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpiryTextField.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"ExpiryTextField", "", "modifier", "Landroidx/compose/ui/Modifier;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;", "hasNextField", "", "onValueChange", "Lkotlin/Function1;", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpiryTextFieldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpiryTextField$lambda$5(Modifier modifier, ExpiryDateState expiryDateState, boolean z, Function1 function1, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        ExpiryTextField(modifier, expiryDateState, z, function1, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExpiryTextField(Modifier modifier, final ExpiryDateState state, final boolean z, final Function1<? super String, Unit> onValueChange, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        final FocusManager focusManager;
        final SoftwareKeyboardController softwareKeyboardController;
        int iM5781getDoneeUduSuo;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1925649419);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 == 0) {
                    composerStartRestartGroup.startReplaceGroup(-618690199);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1925649419, i3, -1, "com.stripe.android.paymentsheet.ui.ExpiryTextField (ExpiryTextField.kt:31)");
                }
                ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localFocusManager);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                focusManager = (FocusManager) objConsume;
                ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localSoftwareKeyboardController);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                softwareKeyboardController = (SoftwareKeyboardController) objConsume2;
                boolean zShouldShowError = state.shouldShowError();
                TextFieldColors textFieldColorsCommonTextFieldColors = CommonTextFieldKt.commonTextFieldColors(zShouldShowError, state.getEnabled(), composerStartRestartGroup, 0);
                Modifier modifierM2049indicatorLinegv0btCI$default = TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier4, state.getEnabled(), !zShouldShowError && state.getEnabled(), mutableInteractionSource3, textFieldColorsCommonTextFieldColors, 0.0f, 0.0f, 48, null);
                Modifier modifier5 = modifier4;
                ResolvableString resolvableStringSectionError = state.sectionError();
                composerStartRestartGroup.startReplaceGroup(-618667285);
                String strResolve = resolvableStringSectionError != null ? null : ResolvableStringComposeUtilsKt.resolve(resolvableStringSectionError, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierErrorSemanticsWithDefault = CompatTextFieldKt.errorSemanticsWithDefault(modifierM2049indicatorLinegv0btCI$default, zShouldShowError, strResolve);
                String text = state.getText();
                boolean enabled = state.getEnabled();
                String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_expiration_date_hint, composerStartRestartGroup, 0);
                CornerBasedShape cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getSmall(), CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), null, 8, null);
                KeyboardOptions keyboardOptions = KeyboardOptions.INSTANCE.getDefault();
                int iM5838getNumberPasswordPjHm6EE = KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE();
                if (!z) {
                    iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5783getNexteUduSuo();
                } else {
                    iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                }
                KeyboardOptions keyboardOptionsM1340copyINvB4aQ$default = KeyboardOptions.m1340copyINvB4aQ$default(keyboardOptions, 0, (Boolean) null, iM5838getNumberPasswordPjHm6EE, iM5781getDoneeUduSuo, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (Object) null);
                ExpiryDateVisualTransformation expiryDateVisualTransformation = new ExpiryDateVisualTransformation(CardDetailsUIKt.CARD_EDIT_UI_FALLBACK_EXPIRY_DATE);
                composerStartRestartGroup.startReplaceGroup(-618636608);
                zChanged = composerStartRestartGroup.changed(softwareKeyboardController);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.ExpiryTextFieldKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ExpiryTextFieldKt.ExpiryTextField$lambda$2$lambda$1(softwareKeyboardController, (KeyboardActionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-618638831);
                zChangedInstance = composerStartRestartGroup.changedInstance(focusManager);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.ExpiryTextFieldKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ExpiryTextFieldKt.ExpiryTextField$lambda$4$lambda$3(focusManager, (KeyboardActionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                CommonTextFieldKt.CommonTextField(text, strStringResource, modifierErrorSemanticsWithDefault, onValueChange, null, zShouldShowError, enabled, expiryDateVisualTransformation, keyboardOptionsM1340copyINvB4aQ$default, new KeyboardActions(function1, null, (Function1) objRememberedValue2, null, null, null, 58, null), cornerBasedShapeCopy$default, textFieldColorsCommonTextFieldColors, composer2, i3 & 7168, 0, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.ExpiryTextFieldKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExpiryTextFieldKt.ExpiryTextField$lambda$5(modifier3, state, z, onValueChange, mutableInteractionSource4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localFocusManager2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            focusManager = (FocusManager) objConsume3;
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController2 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume22 = composerStartRestartGroup.consume(localSoftwareKeyboardController2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            softwareKeyboardController = (SoftwareKeyboardController) objConsume22;
            boolean zShouldShowError2 = state.shouldShowError();
            TextFieldColors textFieldColorsCommonTextFieldColors2 = CommonTextFieldKt.commonTextFieldColors(zShouldShowError2, state.getEnabled(), composerStartRestartGroup, 0);
            if (zShouldShowError2) {
                Modifier modifierM2049indicatorLinegv0btCI$default2 = TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier4, state.getEnabled(), !zShouldShowError2 && state.getEnabled(), mutableInteractionSource3, textFieldColorsCommonTextFieldColors2, 0.0f, 0.0f, 48, null);
                Modifier modifier52 = modifier4;
                ResolvableString resolvableStringSectionError2 = state.sectionError();
                composerStartRestartGroup.startReplaceGroup(-618667285);
                if (resolvableStringSectionError2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierErrorSemanticsWithDefault2 = CompatTextFieldKt.errorSemanticsWithDefault(modifierM2049indicatorLinegv0btCI$default2, zShouldShowError2, strResolve);
                String text2 = state.getText();
                boolean enabled2 = state.getEnabled();
                String strStringResource2 = StringResources_androidKt.stringResource(R.string.stripe_expiration_date_hint, composerStartRestartGroup, 0);
                CornerBasedShape cornerBasedShapeCopy$default2 = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getSmall(), CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), null, 8, null);
                KeyboardOptions keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                int iM5838getNumberPasswordPjHm6EE2 = KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE();
                if (!z) {
                }
                KeyboardOptions keyboardOptionsM1340copyINvB4aQ$default2 = KeyboardOptions.m1340copyINvB4aQ$default(keyboardOptions2, 0, (Boolean) null, iM5838getNumberPasswordPjHm6EE2, iM5781getDoneeUduSuo, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (Object) null);
                ExpiryDateVisualTransformation expiryDateVisualTransformation2 = new ExpiryDateVisualTransformation(CardDetailsUIKt.CARD_EDIT_UI_FALLBACK_EXPIRY_DATE);
                composerStartRestartGroup.startReplaceGroup(-618636608);
                zChanged = composerStartRestartGroup.changed(softwareKeyboardController);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.ExpiryTextFieldKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ExpiryTextFieldKt.ExpiryTextField$lambda$2$lambda$1(softwareKeyboardController, (KeyboardActionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function1 function12 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-618638831);
                    zChangedInstance = composerStartRestartGroup.changedInstance(focusManager);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.ExpiryTextFieldKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ExpiryTextFieldKt.ExpiryTextField$lambda$4$lambda$3(focusManager, (KeyboardActionScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        CommonTextFieldKt.CommonTextField(text2, strStringResource2, modifierErrorSemanticsWithDefault2, onValueChange, null, zShouldShowError2, enabled2, expiryDateVisualTransformation2, keyboardOptionsM1340copyINvB4aQ$default2, new KeyboardActions(function12, null, (Function1) objRememberedValue2, null, null, null, 58, null), cornerBasedShapeCopy$default2, textFieldColorsCommonTextFieldColors2, composer2, i3 & 7168, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpiryTextField$lambda$4$lambda$3(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.mo3343moveFocus3ESFkO8(FocusDirection.INSTANCE.m3338getNextdhqQ8s());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpiryTextField$lambda$2$lambda$1(SoftwareKeyboardController softwareKeyboardController, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }
}
