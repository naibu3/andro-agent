package androidx.compose.material;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0018"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m6117constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, RadioButtonColors radioButtonColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        RadioButtonColors radioButtonColors2;
        boolean z4;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        RadioButtonColors radioButtonColors3;
        float fM6117constructorimpl;
        ?? r9;
        int i7;
        final boolean z5;
        State<Dp> state;
        final State<Color> state2;
        Modifier.Companion companionM1271selectableO2vRcR0;
        Modifier.Companion companionMinimumInteractiveComponentSize;
        final State<Dp> state3;
        boolean zChanged;
        Object objRememberedValue;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1314435585);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RadioButton)P(5,4,3,1,2)78@3689L8,80@3722L164,84@3915L29,114@4883L385,101@4476L792:RadioButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            radioButtonColors2 = radioButtonColors;
                            int i9 = composerStartRestartGroup.changed(radioButtonColors2) ? 131072 : 65536;
                            i3 |= i9;
                        } else {
                            radioButtonColors2 = radioButtonColors;
                        }
                        i3 |= i9;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            z4 = i4 == 0 ? true : z3;
                            MutableInteractionSource mutableInteractionSource5 = i5 == 0 ? null : mutableInteractionSource2;
                            if ((i2 & 32) == 0) {
                                RadioButtonColors radioButtonColorsM1977colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1977colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                                composerStartRestartGroup = composerStartRestartGroup;
                                modifier3 = companion;
                                mutableInteractionSource3 = mutableInteractionSource5;
                                i6 = i3 & (-458753);
                                radioButtonColors3 = radioButtonColorsM1977colorsRGew2ao;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1314435585, i6, -1, "androidx.compose.material.RadioButton (RadioButton.kt:79)");
                                }
                                if (!z) {
                                    fM6117constructorimpl = Dp.m6117constructorimpl(RadioButtonDotSize / 2);
                                } else {
                                    fM6117constructorimpl = Dp.m6117constructorimpl(0);
                                }
                                State<Dp> stateM467animateDpAsStateAjpBEmI = AnimateAsStateKt.m467animateDpAsStateAjpBEmI(fM6117constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                                int i10 = i6 >> 9;
                                State<Color> stateRadioColor = radioButtonColors3.radioColor(z4, z, composerStartRestartGroup, ((i6 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i10 & 14) | (i10 & 896));
                                if (function0 == null) {
                                    composerStartRestartGroup.startReplaceGroup(1892955885);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "93@4270L139");
                                    state = stateM467animateDpAsStateAjpBEmI;
                                    radioButtonColors2 = radioButtonColors3;
                                    i7 = 2;
                                    z5 = z4;
                                    state2 = stateRadioColor;
                                    r9 = 0;
                                    companionM1271selectableO2vRcR0 = SelectableKt.m1271selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1985rippleOrFallbackImplementation9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m5405boximpl(Role.INSTANCE.m5416getRadioButtono7Vup1c()), function0);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    r9 = 0;
                                    radioButtonColors2 = radioButtonColors3;
                                    i7 = 2;
                                    z5 = z4;
                                    state = stateM467animateDpAsStateAjpBEmI;
                                    state2 = stateRadioColor;
                                    composerStartRestartGroup.startReplaceGroup(1893376059);
                                    composerStartRestartGroup.endReplaceGroup();
                                    companionM1271selectableO2vRcR0 = Modifier.INSTANCE;
                                }
                                if (function0 == null) {
                                    companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                                } else {
                                    companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                                }
                                Modifier modifierM1057requiredSize3ABfNKs = SizeKt.m1057requiredSize3ABfNKs(PaddingKt.m1020padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1271selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r9, i7, null), RadioButtonPadding), RadioButtonSize);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 61091208, "CC(remember):RadioButton.kt#9igjgp");
                                state3 = state;
                                zChanged = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(state3);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$1$1
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
                                        public final void invoke2(DrawScope drawScope) {
                                            float f = drawScope.mo712toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                            float f2 = f / 2;
                                            DrawScope.m4194drawCircleVaOC9Bg$default(drawScope, state2.getValue().m3667unboximpl(), drawScope.mo712toPx0680j_4(RadioButtonKt.RadioRadius) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
                                            if (Dp.m6116compareTo0680j_4(state3.getValue().m6131unboximpl(), Dp.m6117constructorimpl(0)) > 0) {
                                                DrawScope.m4194drawCircleVaOC9Bg$default(drawScope, state2.getValue().m3667unboximpl(), drawScope.mo712toPx0680j_4(state3.getValue().m6131unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                CanvasKt.Canvas(modifierM1057requiredSize3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, r9);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier4 = modifier3;
                            } else {
                                modifier3 = companion;
                                mutableInteractionSource3 = mutableInteractionSource5;
                                i6 = i3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        radioButtonColors3 = radioButtonColors2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z) {
                        }
                        State<Dp> stateM467animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m467animateDpAsStateAjpBEmI(fM6117constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        int i102 = i6 >> 9;
                        State<Color> stateRadioColor2 = radioButtonColors3.radioColor(z4, z, composerStartRestartGroup, ((i6 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i102 & 14) | (i102 & 896));
                        if (function0 == null) {
                        }
                        if (function0 == null) {
                        }
                        Modifier modifierM1057requiredSize3ABfNKs2 = SizeKt.m1057requiredSize3ABfNKs(PaddingKt.m1020padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1271selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r9, i7, null), RadioButtonPadding), RadioButtonSize);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 61091208, "CC(remember):RadioButton.kt#9igjgp");
                        state3 = state;
                        zChanged = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(state3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$1$1
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
                                public final void invoke2(DrawScope drawScope) {
                                    float f = drawScope.mo712toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f2 = f / 2;
                                    DrawScope.m4194drawCircleVaOC9Bg$default(drawScope, state2.getValue().m3667unboximpl(), drawScope.mo712toPx0680j_4(RadioButtonKt.RadioRadius) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
                                    if (Dp.m6116compareTo0680j_4(state3.getValue().m6131unboximpl(), Dp.m6117constructorimpl(0)) > 0) {
                                        DrawScope.m4194drawCircleVaOC9Bg$default(drawScope, state2.getValue().m3667unboximpl(), drawScope.mo712toPx0680j_4(state3.getValue().m6131unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            CanvasKt.Canvas(modifierM1057requiredSize3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, r9);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    final RadioButtonColors radioButtonColors4 = radioButtonColors2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                RadioButtonKt.RadioButton(z, function0, modifier4, z5, mutableInteractionSource4, radioButtonColors4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                    }
                }
                final RadioButtonColors radioButtonColors42 = radioButtonColors2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            final RadioButtonColors radioButtonColors422 = radioButtonColors2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        final RadioButtonColors radioButtonColors4222 = radioButtonColors2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = Dp.m6117constructorimpl(f);
        float fM6117constructorimpl = Dp.m6117constructorimpl(20);
        RadioButtonSize = fM6117constructorimpl;
        RadioRadius = Dp.m6117constructorimpl(fM6117constructorimpl / f);
        RadioButtonDotSize = Dp.m6117constructorimpl(12);
        RadioStrokeWidth = Dp.m6117constructorimpl(f);
    }
}
