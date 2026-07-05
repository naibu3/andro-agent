package androidx.compose.material3;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioStrokeWidth", "RadioButton", "", "selected", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/RadioButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = Dp.m6117constructorimpl(12);
    private static final float RadioButtonPadding;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0263 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0142  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        RadioButtonColors radioButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        boolean z4;
        RadioButtonColors radioButtonColorsM2411colorsro_MJ88;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        int i6;
        RadioButtonColors radioButtonColors3;
        float fM6117constructorimpl;
        ?? r10;
        int i7;
        final State<Color> state;
        final boolean z5;
        State state2;
        Object obj;
        RadioButtonColors radioButtonColors4;
        Modifier.Companion companionM1271selectableO2vRcR0;
        Modifier.Companion companionMinimumTouchTargetSize;
        final State state3;
        boolean zChanged;
        Object objRememberedValue;
        final MutableInteractionSource mutableInteractionSource4;
        final RadioButtonColors radioButtonColors5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(408580840);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RadioButton)P(5,4,3,1)77@3761L8,78@3821L39,80@3885L164,84@4078L29,114@5045L415,101@4636L824:RadioButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        radioButtonColors2 = radioButtonColors;
                        int i9 = composerStartRestartGroup.changed(radioButtonColors2) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    i3 |= i9;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((458752 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            z4 = i4 == 0 ? true : z3;
                            if ((i2 & 16) == 0) {
                                radioButtonColorsM2411colorsro_MJ88 = RadioButtonDefaults.INSTANCE.m2411colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                composerStartRestartGroup = composerStartRestartGroup;
                                i3 &= -57345;
                            } else {
                                radioButtonColorsM2411colorsro_MJ88 = radioButtonColors2;
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                modifier3 = companion;
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                modifier3 = companion;
                            }
                            i6 = i3;
                            radioButtonColors3 = radioButtonColorsM2411colorsro_MJ88;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            z4 = z3;
                            radioButtonColors3 = radioButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(408580840, i6, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                        }
                        if (!z) {
                            fM6117constructorimpl = Dp.m6117constructorimpl(RadioButtonDotSize / 2);
                        } else {
                            fM6117constructorimpl = Dp.m6117constructorimpl(0);
                        }
                        State stateM468animateDpAsStateKz89ssw = AnimateAsStateKt.m468animateDpAsStateKz89ssw(fM6117constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                        State<Color> stateRadioColor$material3_release = radioButtonColors3.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                        composerStartRestartGroup.startReplaceableGroup(735546407);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "93@4433L136");
                        if (function0 == null) {
                            state2 = stateM468animateDpAsStateKz89ssw;
                            Composer composer2 = composerStartRestartGroup;
                            obj = null;
                            composerStartRestartGroup = composer2;
                            radioButtonColors4 = radioButtonColors3;
                            state = stateRadioColor$material3_release;
                            r10 = 0;
                            i7 = 2;
                            z5 = z4;
                            companionM1271selectableO2vRcR0 = SelectableKt.m1271selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m2107rememberRipple9IZ8Weo(false, Dp.m6117constructorimpl(RadioButtonTokens.INSTANCE.m3006getStateLayerSizeD9Ej5fM() / 2), 0L, composer2, 54, 4), z5, Role.m5405boximpl(Role.INSTANCE.m5416getRadioButtono7Vup1c()), function0);
                        } else {
                            r10 = 0;
                            i7 = 2;
                            state = stateRadioColor$material3_release;
                            z5 = z4;
                            state2 = stateM468animateDpAsStateKz89ssw;
                            obj = null;
                            radioButtonColors4 = radioButtonColors3;
                            companionM1271selectableO2vRcR0 = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function0 == null) {
                            companionMinimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.INSTANCE);
                        } else {
                            companionMinimumTouchTargetSize = Modifier.INSTANCE;
                        }
                        Modifier modifierM1057requiredSize3ABfNKs = SizeKt.m1057requiredSize3ABfNKs(PaddingKt.m1020padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumTouchTargetSize).then(companionM1271selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r10, i7, obj), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3005getIconSizeD9Ej5fM());
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                        state3 = state2;
                        zChanged = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(state3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope Canvas) {
                                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                    float f = Canvas.mo712toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f2 = 2;
                                    float f3 = f / f2;
                                    DrawScope.m4194drawCircleVaOC9Bg$default(Canvas, state.getValue().m3667unboximpl(), Canvas.mo712toPx0680j_4(Dp.m6117constructorimpl(RadioButtonTokens.INSTANCE.m3005getIconSizeD9Ej5fM() / f2)) - f3, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
                                    if (Dp.m6116compareTo0680j_4(state3.getValue().m6131unboximpl(), Dp.m6117constructorimpl(0)) > 0) {
                                        DrawScope.m4194drawCircleVaOC9Bg$default(Canvas, state.getValue().m3667unboximpl(), Canvas.mo712toPx0680j_4(state3.getValue().m6131unboximpl()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM1057requiredSize3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, r10);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        radioButtonColors5 = radioButtonColors4;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z5 = z3;
                        radioButtonColors5 = radioButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            RadioButtonKt.RadioButton(z, function0, modifier4, z5, radioButtonColors5, mutableInteractionSource4, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if (i5 == 0) {
                        }
                        i6 = i3;
                        radioButtonColors3 = radioButtonColorsM2411colorsro_MJ88;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z) {
                        }
                        State stateM468animateDpAsStateKz89ssw2 = AnimateAsStateKt.m468animateDpAsStateKz89ssw(fM6117constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composerStartRestartGroup, 48, 4);
                        State<Color> stateRadioColor$material3_release2 = radioButtonColors3.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                        composerStartRestartGroup.startReplaceableGroup(735546407);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "93@4433L136");
                        if (function0 == null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function0 == null) {
                        }
                        Modifier modifierM1057requiredSize3ABfNKs2 = SizeKt.m1057requiredSize3ABfNKs(PaddingKt.m1020padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumTouchTargetSize).then(companionM1271selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r10, i7, obj), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3005getIconSizeD9Ej5fM());
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                        state3 = state2;
                        zChanged = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(state3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope Canvas) {
                                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                    float f = Canvas.mo712toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f2 = 2;
                                    float f3 = f / f2;
                                    DrawScope.m4194drawCircleVaOC9Bg$default(Canvas, state.getValue().m3667unboximpl(), Canvas.mo712toPx0680j_4(Dp.m6117constructorimpl(RadioButtonTokens.INSTANCE.m3005getIconSizeD9Ej5fM() / f2)) - f3, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
                                    if (Dp.m6116compareTo0680j_4(state3.getValue().m6131unboximpl(), Dp.m6117constructorimpl(0)) > 0) {
                                        DrawScope.m4194drawCircleVaOC9Bg$default(Canvas, state.getValue().m3667unboximpl(), Canvas.mo712toPx0680j_4(state3.getValue().m6131unboximpl()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM1057requiredSize3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, r10);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            radioButtonColors5 = radioButtonColors4;
                            modifier4 = modifier3;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z2;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((374491 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((374491 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = Dp.m6117constructorimpl(f);
        RadioStrokeWidth = Dp.m6117constructorimpl(f);
    }
}
