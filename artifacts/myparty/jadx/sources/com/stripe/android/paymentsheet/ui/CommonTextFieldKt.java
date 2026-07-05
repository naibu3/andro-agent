package com.stripe.android.paymentsheet.ui;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: CommonTextField.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b2\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a\u001d\u0010 \u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"CommonTextField", "", "value", "", "label", "modifier", "Landroidx/compose/ui/Modifier;", "onValueChange", "Lkotlin/Function1;", "trailingIcon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "shouldShowError", "", ViewProps.ENABLED, "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "shape", "Landroidx/compose/ui/graphics/Shape;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/TextFieldColors;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Label", "text", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "disabledBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/runtime/Composer;I)J", "commonTextFieldColors", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/material/TextFieldColors;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonTextFieldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonTextField$lambda$2(String str, String str2, Modifier modifier, Function1 function1, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Shape shape, TextFieldColors textFieldColors, int i, int i2, int i3, Composer composer, int i4) {
        CommonTextField(str, str2, modifier, function1, function2, z, z2, visualTransformation, keyboardOptions, keyboardActions, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Label$lambda$3(String str, int i, Composer composer, int i2) {
        Label(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonTextField$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonTextField(final String value, final String label, Modifier modifier, Function1<? super String, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function1<? super String, Unit> function12;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        VisualTransformation none;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier.Companion companion;
        Function1<? super String, Unit> function13;
        CornerBasedShape cornerBasedShapeCopy$default;
        TextFieldColors textFieldColorsCommonTextFieldColors;
        boolean z5;
        boolean z6;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i15;
        Shape shape2;
        Composer composer2;
        final Function1<? super String, Unit> function14;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final VisualTransformation visualTransformation2;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final Shape shape3;
        final TextFieldColors textFieldColors2;
        final boolean z8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1785226767);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i4 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function22 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        none = visualTransformation;
                    } else {
                        none = visualTransformation;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(none) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changed(keyboardOptions) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                            if ((i & 805306368) == 0) {
                                i13 = i12;
                                i4 |= composerStartRestartGroup.changed(keyboardActions) ? 536870912 : 268435456;
                            }
                            if ((i2 & 6) != 0) {
                                i14 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
                            } else {
                                i14 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i14 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 32 : 16;
                            }
                            if ((i4 & 306783379) == 306783378 || (i14 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    companion = i16 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i5 == 0) {
                                        composerStartRestartGroup.startReplaceGroup(-1520135956);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.CommonTextFieldKt$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return CommonTextFieldKt.CommonTextField$lambda$1$lambda$0((String) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        function13 = (Function1) objRememberedValue;
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        function13 = function12;
                                    }
                                    if (i6 != 0) {
                                        function22 = null;
                                    }
                                    if (i7 != 0) {
                                        z3 = false;
                                    }
                                    boolean z9 = i8 == 0 ? false : z4;
                                    if (i9 != 0) {
                                        none = VisualTransformation.INSTANCE.getNone();
                                    }
                                    KeyboardOptions keyboardOptions4 = i11 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                    KeyboardActions keyboardActions4 = i13 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                    if ((i3 & 1024) == 0) {
                                        cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                                        i14 &= -15;
                                    } else {
                                        cornerBasedShapeCopy$default = shape;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        i14 &= -113;
                                        z5 = z3;
                                        z6 = z9;
                                        keyboardActions2 = keyboardActions4;
                                        textFieldColorsCommonTextFieldColors = commonTextFieldColors(z3, z9, composerStartRestartGroup, (i4 >> 15) & WebSocketProtocol.PAYLOAD_SHORT);
                                        function23 = function22;
                                        keyboardOptions2 = keyboardOptions4;
                                    } else {
                                        textFieldColorsCommonTextFieldColors = textFieldColors;
                                        z5 = z3;
                                        z6 = z9;
                                        keyboardOptions2 = keyboardOptions4;
                                        keyboardActions2 = keyboardActions4;
                                        function23 = function22;
                                    }
                                    i15 = 1572864;
                                    shape2 = cornerBasedShapeCopy$default;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 1024) != 0) {
                                        i14 &= -15;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i14 &= -113;
                                    }
                                    keyboardOptions2 = keyboardOptions;
                                    textFieldColorsCommonTextFieldColors = textFieldColors;
                                    function23 = function22;
                                    z5 = z3;
                                    z6 = z4;
                                    companion = modifier2;
                                    function13 = function12;
                                    i15 = 1572864;
                                    keyboardActions2 = keyboardActions;
                                    shape2 = shape;
                                }
                                VisualTransformation visualTransformation3 = none;
                                int i17 = i14;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1785226767, i4, i17, "com.stripe.android.paymentsheet.ui.CommonTextField (CommonTextField.kt:38)");
                                }
                                ProvidableCompositionLocal<FormInsets> localTextFieldInsets = StripeThemeKt.getLocalTextFieldInsets();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume = composerStartRestartGroup.consume(localTextFieldInsets);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                PaddingValues paddingValuesAsPaddingValues = ((FormInsets) objConsume).asPaddingValues();
                                int i18 = i15;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1442308373, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.CommonTextFieldKt.CommonTextField.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i19) {
                                        if ((i19 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1442308373, i19, -1, "com.stripe.android.paymentsheet.ui.CommonTextField.<anonymous> (CommonTextField.kt:46)");
                                            }
                                            CommonTextFieldKt.Label(label, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54);
                                int i19 = (i4 & 14) | i18 | ((i4 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 >> 9) & 7168) | ((i4 << 15) & 1879048192);
                                int i20 = i4 >> 15;
                                composer2 = composerStartRestartGroup;
                                Function1<? super String, Unit> function15 = function13;
                                Modifier modifier4 = companion;
                                CompatTextFieldKt.CompatTextField(value, function15, modifierFillMaxWidth$default, z6, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function23, false, (String) null, visualTransformation3, keyboardOptions2, keyboardActions2, false, 0, 0, (MutableInteractionSource) null, shape2, textFieldColorsCommonTextFieldColors, paddingValuesAsPaddingValues, composer2, i19, (i20 & 57344) | (i20 & 896) | 48 | (i20 & 7168) | ((i17 << 27) & 1879048192), (i17 >> 3) & 14, 492976);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function14 = function15;
                                z7 = z6;
                                function24 = function23;
                                visualTransformation2 = visualTransformation3;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                shape3 = shape2;
                                textFieldColors2 = textFieldColorsCommonTextFieldColors;
                                z8 = z5;
                                modifier3 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                keyboardOptions3 = keyboardOptions;
                                shape3 = shape;
                                composer2 = composerStartRestartGroup;
                                function24 = function22;
                                z8 = z3;
                                z7 = z4;
                                modifier3 = modifier2;
                                keyboardActions3 = keyboardActions;
                                textFieldColors2 = textFieldColors;
                                visualTransformation2 = none;
                                function14 = function12;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.CommonTextFieldKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CommonTextFieldKt.CommonTextField$lambda$2(value, label, modifier3, function14, function24, z8, z7, visualTransformation2, keyboardOptions3, keyboardActions3, shape3, textFieldColors2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i13 = i12;
                        if ((i2 & 6) != 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i16 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if ((i3 & 1024) == 0) {
                                }
                                if ((i3 & 2048) == 0) {
                                }
                                i15 = 1572864;
                                shape2 = cornerBasedShapeCopy$default;
                                VisualTransformation visualTransformation32 = none;
                                int i172 = i14;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ProvidableCompositionLocal<FormInsets> localTextFieldInsets2 = StripeThemeKt.getLocalTextFieldInsets();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume2 = composerStartRestartGroup.consume(localTextFieldInsets2);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                PaddingValues paddingValuesAsPaddingValues2 = ((FormInsets) objConsume2).asPaddingValues();
                                int i182 = i15;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1442308373, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.CommonTextFieldKt.CommonTextField.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i192) {
                                        if ((i192 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1442308373, i192, -1, "com.stripe.android.paymentsheet.ui.CommonTextField.<anonymous> (CommonTextField.kt:46)");
                                            }
                                            CommonTextFieldKt.Label(label, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54);
                                int i192 = (i4 & 14) | i182 | ((i4 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 >> 9) & 7168) | ((i4 << 15) & 1879048192);
                                int i202 = i4 >> 15;
                                composer2 = composerStartRestartGroup;
                                Function1<? super String, Unit> function152 = function13;
                                Modifier modifier42 = companion;
                                CompatTextFieldKt.CompatTextField(value, function152, modifierFillMaxWidth$default2, z6, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda2, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function23, false, (String) null, visualTransformation32, keyboardOptions2, keyboardActions2, false, 0, 0, (MutableInteractionSource) null, shape2, textFieldColorsCommonTextFieldColors, paddingValuesAsPaddingValues2, composer2, i192, (i202 & 57344) | (i202 & 896) | 48 | (i202 & 7168) | ((i172 << 27) & 1879048192), (i172 >> 3) & 14, 492976);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function14 = function152;
                                z7 = z6;
                                function24 = function23;
                                visualTransformation2 = visualTransformation32;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                shape3 = shape2;
                                textFieldColors2 = textFieldColorsCommonTextFieldColors;
                                z8 = z5;
                                modifier3 = modifier42;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i2 & 6) != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function22 = function2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function22 = function2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function12 = function1;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function22 = function2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Label(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1055727587);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055727587, i2, -1, "com.stripe.android.paymentsheet.ui.Label (CommonTextField.kt:65)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getSubtitle1(), composer2, i2 & 14, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.CommonTextFieldKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommonTextFieldKt.Label$lambda$3(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long disabledBackgroundColor(Composer composer, int i) {
        long jM3656copywmQWz5c$default;
        composer.startReplaceGroup(1187285190);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1187285190, i, -1, "com.stripe.android.paymentsheet.ui.disabledBackgroundColor (CommonTextField.kt:73)");
        }
        if (DarkThemeKt.isSystemInDarkTheme(composer, 0)) {
            jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(Color.INSTANCE.m3694getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(Color.INSTANCE.m3683getBlack0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM3656copywmQWz5c$default;
    }

    public static final TextFieldColors commonTextFieldColors(boolean z, boolean z2, Composer composer, int i) {
        long jDisabledBackgroundColor;
        composer.startReplaceGroup(1973674345);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1973674345, i, -1, "com.stripe.android.paymentsheet.ui.commonTextFieldColors (CommonTextField.kt:85)");
        }
        if (z2) {
            composer.startReplaceGroup(773652812);
            jDisabledBackgroundColor = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8725getComponent0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(773717943);
            jDisabledBackgroundColor = disabledBackgroundColor(composer, 0);
            composer.endReplaceGroup();
        }
        TextFieldColors textFieldColorsM8847TextFieldColorsGyCwops = TextFieldUIKt.m8847TextFieldColorsGyCwops(z, 0L, 0L, jDisabledBackgroundColor, composer, i & 14, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textFieldColorsM8847TextFieldColorsGyCwops;
    }
}
