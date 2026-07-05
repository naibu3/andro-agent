package com.stripe.android.financialconnections.ui.components;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ExposedDropdownMenuDefaults;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aÉ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00122\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00122\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"FinancialConnectionsOutlinedTextField", "", "value", "", ViewProps.ENABLED, "", "modifier", "Landroidx/compose/ui/Modifier;", "onValueChange", "Lkotlin/Function1;", "readOnly", "isError", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "trailingIcon", "leadingIcon", "label", "(Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "FinancialConnectionsOutlinedTextFieldPreview", "(Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextFieldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsOutlinedTextField$lambda$0(String str, boolean z, Modifier modifier, Function1 function1, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Function2 function2, VisualTransformation visualTransformation, Function2 function22, Function2 function23, Function2 function24, int i, int i2, int i3, Composer composer, int i4) {
        FinancialConnectionsOutlinedTextField(str, z, modifier, function1, z2, z3, keyboardOptions, keyboardActions, function2, visualTransformation, function22, function23, function24, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsOutlinedTextFieldPreview$lambda$1(int i, Composer composer, int i2) {
        FinancialConnectionsOutlinedTextFieldPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinancialConnectionsOutlinedTextField(final String value, final boolean z, Modifier modifier, final Function1<? super String, Unit> onValueChange, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Function2<? super Composer, ? super Integer, Unit> function2, VisualTransformation visualTransformation, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        final KeyboardOptions keyboardOptions2;
        int i8;
        KeyboardActions keyboardActions2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        Modifier modifier3;
        float disabled;
        final Modifier modifier4;
        Composer composer2;
        final boolean z6;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final VisualTransformation visualTransformation2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final KeyboardActions keyboardActions3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-644860720);
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
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onValueChange) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    i4 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    keyboardOptions2 = keyboardOptions;
                } else {
                    keyboardOptions2 = keyboardOptions;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    keyboardActions2 = keyboardActions;
                } else {
                    keyboardActions2 = keyboardActions;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 != 0) {
                        if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= composerStartRestartGroup.changed(visualTransformation) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                            i14 = i13;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (composerStartRestartGroup.changedInstance(function22) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i2 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changedInstance(function23) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i21 = i15;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                            i19 = i21 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                        } else {
                            int i22 = i21;
                            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i22 |= composerStartRestartGroup.changedInstance(function24) ? 256 : 128;
                            }
                            i19 = i22;
                        }
                        if ((i4 & 306783379) != 306783378 || (i19 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i20 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                z5 = false;
                            }
                            if (i7 != 0) {
                                keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            }
                            if (i8 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            }
                            final KeyboardActions keyboardActions4 = keyboardActions2;
                            function25 = i10 == 0 ? null : function2;
                            VisualTransformation none = i12 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                            function26 = i14 == 0 ? null : function22;
                            Function2<? super Composer, ? super Integer, Unit> function29 = i17 == 0 ? null : function23;
                            Function2<? super Composer, ? super Integer, Unit> function210 = i18 == 0 ? function24 : null;
                            if (ComposerKt.isTraceInProgress()) {
                                modifier3 = companion;
                            } else {
                                modifier3 = companion;
                                ComposerKt.traceEventStart(-644860720, i4, i19, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                            }
                            if (z) {
                                composerStartRestartGroup.startReplaceGroup(-556370214);
                                disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable);
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-556370954);
                                disabled = ContentAlpha.INSTANCE.getHigh(composerStartRestartGroup, ContentAlpha.$stable);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            final float f = disabled;
                            final RoundedCornerShape roundedCornerShapeM1303RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12));
                            ProvidedValue<TextSelectionColors> providedValueProvides = TextSelectionColorsKt.getLocalTextSelectionColors().provides(ThemeKt.getTextSelectionColors(composerStartRestartGroup, 0));
                            final Function2<? super Composer, ? super Integer, Unit> function211 = function210;
                            final boolean z8 = z4;
                            final boolean z9 = z5;
                            final Modifier modifier5 = modifier3;
                            final VisualTransformation visualTransformation3 = none;
                            final Function2<? super Composer, ? super Integer, Unit> function212 = function29;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(1313859984, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.TextFieldKt.FinancialConnectionsOutlinedTextField.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i23) {
                                    if ((i23 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1313859984, i23, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField.<anonymous> (TextField.kt:47)");
                                        }
                                        Modifier modifierM3321shadows4CzXII$default = ShadowKt.m3321shadows4CzXII$default(AlphaKt.alpha(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), f), Dp.m6117constructorimpl(1), roundedCornerShapeM1303RoundedCornerShape0680j_4, false, 0L, 0L, 28, null);
                                        ExposedDropdownMenuDefaults exposedDropdownMenuDefaults = ExposedDropdownMenuDefaults.INSTANCE;
                                        long jM7630getBackground0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7630getBackground0d7_KjU();
                                        long jM7633getBorder0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7633getBorder0d7_KjU();
                                        long jM7634getBorderNeutral0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7634getBorderNeutral0d7_KjU();
                                        long jM7634getBorderNeutral0d7_KjU2 = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7634getBorderNeutral0d7_KjU();
                                        long jM7647getTextSubdued0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7647getTextSubdued0d7_KjU();
                                        long jM7644getTextCritical0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7644getTextCritical0d7_KjU();
                                        long jM7647getTextSubdued0d7_KjU2 = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7647getTextSubdued0d7_KjU();
                                        OutlinedTextFieldKt.OutlinedTextField(value, (Function1<? super String, Unit>) onValueChange, modifierM3321shadows4CzXII$default, z, z8, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function212, (Function2<? super Composer, ? super Integer, Unit>) function26, z9, visualTransformation3, keyboardOptions2, keyboardActions4, false, 1, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1303RoundedCornerShape0680j_4, exposedDropdownMenuDefaults.m1903outlinedTextFieldColorsDlUQjxs(0L, 0L, jM7630getBackground0d7_KjU, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7645getTextDefault0d7_KjU(), FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7644getTextCritical0d7_KjU(), jM7633getBorder0d7_KjU, jM7634getBorderNeutral0d7_KjU, jM7634getBorderNeutral0d7_KjU2, jM7644getTextCritical0d7_KjU, 0L, 0L, 0L, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7635getIcon0d7_KjU(), FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7635getIcon0d7_KjU(), 0L, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7644getTextCritical0d7_KjU(), jM7647getTextSubdued0d7_KjU2, jM7647getTextSubdued0d7_KjU, 0L, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7644getTextCritical0d7_KjU(), 0L, 0L, composer3, 0, 0, ExposedDropdownMenuDefaults.$stable << 6, 3427843), composer3, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 213024);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            composer2 = composerStartRestartGroup;
                            z6 = z8;
                            z7 = z9;
                            function27 = function212;
                            visualTransformation2 = visualTransformation3;
                            function28 = function211;
                            keyboardActions3 = keyboardActions4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            visualTransformation2 = visualTransformation;
                            function26 = function22;
                            keyboardActions3 = keyboardActions2;
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            z6 = z4;
                            z7 = z5;
                            function25 = function2;
                            function27 = function23;
                            function28 = function24;
                        }
                        final KeyboardOptions keyboardOptions3 = keyboardOptions2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TextFieldKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TextFieldKt.FinancialConnectionsOutlinedTextField$lambda$0(value, z, modifier4, onValueChange, z6, z7, keyboardOptions3, keyboardActions3, function25, visualTransformation2, function26, function27, function28, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    int i212 = i15;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        if (i20 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        final KeyboardActions keyboardActions42 = keyboardActions2;
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (z) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final float f2 = disabled;
                        final RoundedCornerShape roundedCornerShapeM1303RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12));
                        ProvidedValue<TextSelectionColors> providedValueProvides2 = TextSelectionColorsKt.getLocalTextSelectionColors().provides(ThemeKt.getTextSelectionColors(composerStartRestartGroup, 0));
                        final Function2<? super Composer, ? super Integer, Unit> function2112 = function210;
                        final boolean z82 = z4;
                        final boolean z92 = z5;
                        final Modifier modifier52 = modifier3;
                        final VisualTransformation visualTransformation32 = none;
                        final Function2<? super Composer, ? super Integer, Unit> function2122 = function29;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides2, ComposableLambdaKt.rememberComposableLambda(1313859984, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.TextFieldKt.FinancialConnectionsOutlinedTextField.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i23) {
                                if ((i23 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1313859984, i23, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField.<anonymous> (TextField.kt:47)");
                                    }
                                    Modifier modifierM3321shadows4CzXII$default = ShadowKt.m3321shadows4CzXII$default(AlphaKt.alpha(SizeKt.fillMaxWidth$default(modifier52, 0.0f, 1, null), f2), Dp.m6117constructorimpl(1), roundedCornerShapeM1303RoundedCornerShape0680j_42, false, 0L, 0L, 28, null);
                                    ExposedDropdownMenuDefaults exposedDropdownMenuDefaults = ExposedDropdownMenuDefaults.INSTANCE;
                                    long jM7630getBackground0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7630getBackground0d7_KjU();
                                    long jM7633getBorder0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7633getBorder0d7_KjU();
                                    long jM7634getBorderNeutral0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7634getBorderNeutral0d7_KjU();
                                    long jM7634getBorderNeutral0d7_KjU2 = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7634getBorderNeutral0d7_KjU();
                                    long jM7647getTextSubdued0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7647getTextSubdued0d7_KjU();
                                    long jM7644getTextCritical0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7644getTextCritical0d7_KjU();
                                    long jM7647getTextSubdued0d7_KjU2 = FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7647getTextSubdued0d7_KjU();
                                    OutlinedTextFieldKt.OutlinedTextField(value, (Function1<? super String, Unit>) onValueChange, modifierM3321shadows4CzXII$default, z, z82, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) function2112, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function2122, (Function2<? super Composer, ? super Integer, Unit>) function26, z92, visualTransformation32, keyboardOptions2, keyboardActions42, false, 1, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1303RoundedCornerShape0680j_42, exposedDropdownMenuDefaults.m1903outlinedTextFieldColorsDlUQjxs(0L, 0L, jM7630getBackground0d7_KjU, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7645getTextDefault0d7_KjU(), FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7644getTextCritical0d7_KjU(), jM7633getBorder0d7_KjU, jM7634getBorderNeutral0d7_KjU, jM7634getBorderNeutral0d7_KjU2, jM7644getTextCritical0d7_KjU, 0L, 0L, 0L, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7635getIcon0d7_KjU(), FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7635getIcon0d7_KjU(), 0L, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7644getTextCritical0d7_KjU(), jM7647getTextSubdued0d7_KjU2, jM7647getTextSubdued0d7_KjU, 0L, FinancialConnectionsTheme.INSTANCE.getColors(composer3, 6).m7644getTextCritical0d7_KjU(), 0L, 0L, composer3, 0, 0, ExposedDropdownMenuDefaults.$stable << 6, 3427843), composer3, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 213024);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier52;
                        composer2 = composerStartRestartGroup;
                        z6 = z82;
                        z7 = z92;
                        function27 = function2122;
                        visualTransformation2 = visualTransformation32;
                        function28 = function2112;
                        keyboardActions3 = keyboardActions42;
                    }
                    final KeyboardOptions keyboardOptions32 = keyboardOptions2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                int i2122 = i15;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                final KeyboardOptions keyboardOptions322 = keyboardOptions2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            int i21222 = i15;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            final KeyboardOptions keyboardOptions3222 = keyboardOptions2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 8) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        int i212222 = i15;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        final KeyboardOptions keyboardOptions32222 = keyboardOptions2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void FinancialConnectionsOutlinedTextFieldPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1620257465);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1620257465, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextFieldPreview (TextField.kt:87)");
            }
            com.stripe.android.financialconnections.ui.CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$TextFieldKt.INSTANCE.m7569getLambda1$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TextFieldKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldKt.FinancialConnectionsOutlinedTextFieldPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
