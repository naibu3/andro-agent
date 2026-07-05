package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aj\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a|\u0010\u001f\u001a\u00020\u000f*\u00020 2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001c\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u0007\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\b\u0010\t\"\u0013\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "SwitchHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchWidth", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPadding", "ThumbPathLength", "UncheckedThumbDiameter", "getUncheckedThumbDiameter", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "thumbContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ViewProps.ENABLED, PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/SwitchColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "thumbShape", "Landroidx/compose/ui/graphics/Shape;", "uncheckedThumbDiameter", "minBound", "maxBound", "SwitchImpl-0DmnUew", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material3/SwitchColors;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float ThumbPathLength;
    private static final float UncheckedThumbDiameter;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x047e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i5;
        boolean z3;
        SwitchColors switchColors2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        String str;
        SwitchColors switchColorsM2469colorsV1nXRL4;
        int i7;
        MutableInteractionSource mutableInteractionSource3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        SwitchColors switchColors3;
        int i8;
        boolean z4;
        Modifier modifier3;
        float f;
        final float fMo712toPx0680j_4;
        final float fMo712toPx0680j_42;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        Object objRememberedValue3;
        String str2;
        float f2;
        int i9;
        Object obj;
        ?? r9;
        boolean z5;
        Animatable animatable;
        MutableInteractionSource mutableInteractionSource4;
        Modifier.Companion companionM1276toggleableO2vRcR0;
        Composer composer3;
        final boolean z6;
        final Modifier modifier4;
        final SwitchColors switchColors4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final MutableInteractionSource mutableInteractionSource5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1580463220);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Switch)P(!1,5,4,6,2)96@4503L8,97@4563L39,*106@4851L7,107@4926L7,108@4986L111,113@5161L36,114@5214L24,116@5244L156,121@5406L216,145@6082L759:Switch.kt#uh7d8r");
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
            i3 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
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
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changed(function22) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((57344 & i) == 0) {
                        z3 = z2;
                        i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            int i11 = composerStartRestartGroup.changed(switchColors2) ? 131072 : 65536;
                            i3 |= i11;
                        } else {
                            switchColors2 = switchColors;
                        }
                        i3 |= i11;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((i & 3670016) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            int i12 = i3;
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                Function2<? super Composer, ? super Integer, Unit> function25 = i4 == 0 ? null : function22;
                                boolean z7 = i5 == 0 ? true : z3;
                                if ((i2 & 32) == 0) {
                                    str = "C(remember):Composables.kt#9igjgp";
                                    switchColorsM2469colorsV1nXRL4 = SwitchDefaults.INSTANCE.m2469colorsV1nXRL4(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 1572864, 65535);
                                    composer2 = composerStartRestartGroup;
                                    i7 = i12 & (-458753);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    str = "C(remember):Composables.kt#9igjgp";
                                    switchColorsM2469colorsV1nXRL4 = switchColors2;
                                    i7 = i12;
                                }
                                if (i6 == 0) {
                                    composer2.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composer2, str);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    function23 = function25;
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue4;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    function23 = function25;
                                }
                                switchColors3 = switchColorsM2469colorsV1nXRL4;
                                i8 = i7;
                                z4 = z7;
                                modifier3 = companion;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i8 = i12 & (-458753);
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    switchColors3 = switchColors2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                } else {
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    switchColors3 = switchColors2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    i8 = i12;
                                }
                                function23 = function22;
                                composer2 = composerStartRestartGroup;
                                str = "C(remember):Composables.kt#9igjgp";
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1580463220, i8, -1, "androidx.compose.material3.Switch (Switch.kt:90)");
                            }
                            if (function23 != null) {
                                f = UncheckedThumbDiameter;
                            } else {
                                f = ThumbDiameter;
                            }
                            float f3 = f;
                            float f4 = SwitchHeight;
                            float fM6117constructorimpl = Dp.m6117constructorimpl(Dp.m6117constructorimpl(f4 - f3) / 2);
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            fMo712toPx0680j_4 = ((Density) objConsume).mo712toPx0680j_4(fM6117constructorimpl);
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composer2.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            float f5 = ThumbPathLength;
                            fMo712toPx0680j_42 = ((Density) objConsume2).mo712toPx0680j_4(f5);
                            Float fValueOf = Float.valueOf(fMo712toPx0680j_4);
                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                            Float fValueOf2 = Float.valueOf(fMo712toPx0680j_42);
                            composer2.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composer2.changed(fValueOf2) | composer2.changed(fValueOf);
                            objRememberedValue = composer2.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function1) new Function1<Boolean, Float>() { // from class: androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public final Float invoke(boolean z8) {
                                        return Float.valueOf(z8 ? fMo712toPx0680j_42 : fMo712toPx0680j_4);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Float invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            final float fFloatValue = ((Number) ((Function1) objRememberedValue).invoke(Boolean.valueOf(z))).floatValue();
                            composer2.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composer2, str);
                            objRememberedValue2 = composer2.rememberedValue();
                            if (objRememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = AnimatableKt.Animatable$default(fFloatValue, 0.0f, 2, null);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final Animatable animatable2 = (Animatable) objRememberedValue2;
                            composer2.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
                            composer2.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composer2, str);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material3.SwitchKt.Switch.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Animatable.updateBounds$default(animatable2, Float.valueOf(fMo712toPx0680j_4), null, 2, null);
                                }
                            }, composer2, 0);
                            EffectsKt.DisposableEffect(Boolean.valueOf(z), new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.SwitchKt.Switch.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    if (animatable2.getTargetValue().floatValue() != fFloatValue) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(animatable2, fFloatValue, null), 3, null);
                                    }
                                    return new DisposableEffectResult() { // from class: androidx.compose.material3.SwitchKt$Switch$3$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                        }
                                    };
                                }

                                /* compiled from: Switch.kt */
                                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material3.SwitchKt$Switch$3$1", f = "Switch.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: androidx.compose.material3.SwitchKt$Switch$3$1, reason: invalid class name */
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ Animatable<Float, AnimationVector1D> $offset;
                                    final /* synthetic */ float $targetValue;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$offset = animatable;
                                        this.$targetValue = f;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$offset, this.$targetValue, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (Animatable.animateTo$default(this.$offset, Boxing.boxFloat(this.$targetValue), SwitchKt.AnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer2, i8 & 14);
                            if (function1 == null) {
                                obj = null;
                                str2 = "C:CompositionLocal.kt#9igjgp";
                                f2 = f5;
                                i9 = i8;
                                r9 = 0;
                                z5 = z4;
                                animatable = animatable2;
                                mutableInteractionSource4 = mutableInteractionSource6;
                                companionM1276toggleableO2vRcR0 = ToggleableKt.m1276toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m5405boximpl(Role.INSTANCE.m5417getSwitcho7Vup1c()), function1);
                            } else {
                                str2 = "C:CompositionLocal.kt#9igjgp";
                                f2 = f5;
                                i9 = i8;
                                obj = null;
                                r9 = 0;
                                z5 = z4;
                                animatable = animatable2;
                                mutableInteractionSource4 = mutableInteractionSource6;
                                companionM1276toggleableO2vRcR0 = Modifier.INSTANCE;
                            }
                            Modifier.Companion companionMinimumTouchTargetSize = Modifier.INSTANCE;
                            if (function1 != null) {
                                companionMinimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(companionMinimumTouchTargetSize);
                            }
                            Modifier modifierM1059requiredSizeVpY3zN4 = SizeKt.m1059requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumTouchTargetSize).then(companionM1276toggleableO2vRcR0), Alignment.INSTANCE.getCenter(), r9, 2, obj), SwitchWidth, f4);
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r9, composer2, r9);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                            String str3 = str2;
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str3);
                            Object objConsume3 = composer2.consume(localDensity3);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) objConsume3;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str3);
                            Object objConsume4 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) objConsume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str3);
                            Object objConsume5 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM1059requiredSizeVpY3zN4);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (!composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, Integer.valueOf((int) r9));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-2137368960);
                            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1204996270);
                            ComposerKt.sourceInformation(composer2, "C160@6631L9,154@6384L451:Switch.kt#uh7d8r");
                            int i13 = i9 >> 6;
                            Composer composer4 = composer2;
                            m2471SwitchImpl0DmnUew(boxScopeInstance, z, z5, switchColors3, animatable.asState(), function23, mutableInteractionSource4, ShapesKt.toShape(SwitchTokens.INSTANCE.getHandleShape(), composer2, 6), f3, fM6117constructorimpl, f2, composer4, 6 | ((i9 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i13 & 896) | (i13 & 7168) | ((i9 << 6) & 458752) | (i9 & 3670016), 6);
                            composer3 = composer4;
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z5;
                            modifier4 = modifier3;
                            switchColors4 = switchColors3;
                            function24 = function23;
                            mutableInteractionSource5 = mutableInteractionSource4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer3 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            function24 = function22;
                            z6 = z3;
                            switchColors4 = switchColors2;
                            mutableInteractionSource5 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt.Switch.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i14) {
                                SwitchKt.Switch(z, function1, modifier4, function24, z6, switchColors4, mutableInteractionSource5, composer5, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((2995931 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        int i122 = i3;
                        if ((i & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            switchColors3 = switchColorsM2469colorsV1nXRL4;
                            i8 = i7;
                            z4 = z7;
                            modifier3 = companion;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (function23 != null) {
                            }
                            float f32 = f;
                            float f42 = SwitchHeight;
                            float fM6117constructorimpl2 = Dp.m6117constructorimpl(Dp.m6117constructorimpl(f42 - f32) / 2);
                            ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume6 = composer2.consume(localDensity4);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            fMo712toPx0680j_4 = ((Density) objConsume6).mo712toPx0680j_4(fM6117constructorimpl2);
                            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object objConsume22 = composer2.consume(localDensity22);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            float f52 = ThumbPathLength;
                            fMo712toPx0680j_42 = ((Density) objConsume22).mo712toPx0680j_4(f52);
                            Float fValueOf3 = Float.valueOf(fMo712toPx0680j_4);
                            MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource3;
                            Float fValueOf22 = Float.valueOf(fMo712toPx0680j_42);
                            composer2.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composer2.changed(fValueOf22) | composer2.changed(fValueOf3);
                            objRememberedValue = composer2.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function1) new Function1<Boolean, Float>() { // from class: androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public final Float invoke(boolean z8) {
                                        return Float.valueOf(z8 ? fMo712toPx0680j_42 : fMo712toPx0680j_4);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Float invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                                composer2.endReplaceableGroup();
                                final float fFloatValue2 = ((Number) ((Function1) objRememberedValue).invoke(Boolean.valueOf(z))).floatValue();
                                composer2.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer2, str);
                                objRememberedValue2 = composer2.rememberedValue();
                                if (objRememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                }
                                composer2.endReplaceableGroup();
                                final Animatable<Float, AnimationVector1D> animatable22 = (Animatable) objRememberedValue2;
                                composer2.startReplaceableGroup(773894976);
                                ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
                                composer2.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer2, str);
                                objRememberedValue3 = composer2.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                }
                                composer2.endReplaceableGroup();
                                final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                                composer2.endReplaceableGroup();
                                EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material3.SwitchKt.Switch.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Animatable.updateBounds$default(animatable22, Float.valueOf(fMo712toPx0680j_4), null, 2, null);
                                    }
                                }, composer2, 0);
                                EffectsKt.DisposableEffect(Boolean.valueOf(z), new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.SwitchKt.Switch.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        if (animatable22.getTargetValue().floatValue() != fFloatValue2) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(animatable22, fFloatValue2, null), 3, null);
                                        }
                                        return new DisposableEffectResult() { // from class: androidx.compose.material3.SwitchKt$Switch$3$invoke$$inlined$onDispose$1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                            }
                                        };
                                    }

                                    /* compiled from: Switch.kt */
                                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material3.SwitchKt$Switch$3$1", f = "Switch.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material3.SwitchKt$Switch$3$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ Animatable<Float, AnimationVector1D> $offset;
                                        final /* synthetic */ float $targetValue;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$offset = animatable;
                                            this.$targetValue = f;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$offset, this.$targetValue, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (Animatable.animateTo$default(this.$offset, Boxing.boxFloat(this.$targetValue), SwitchKt.AnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer2, i8 & 14);
                                if (function1 == null) {
                                }
                                Modifier.Companion companionMinimumTouchTargetSize2 = Modifier.INSTANCE;
                                if (function1 != null) {
                                }
                                Modifier modifierM1059requiredSizeVpY3zN42 = SizeKt.m1059requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumTouchTargetSize2).then(companionM1276toggleableO2vRcR0), Alignment.INSTANCE.getCenter(), r9, 2, obj), SwitchWidth, f42);
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r9, composer2, r9);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                                String str32 = str2;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str32);
                                Object objConsume32 = composer2.consume(localDensity32);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Density density2 = (Density) objConsume32;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str32);
                                Object objConsume42 = composer2.consume(localLayoutDirection2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) objConsume42;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str32);
                                Object objConsume52 = composer2.consume(localViewConfiguration2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume52;
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM1059requiredSizeVpY3zN42);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                }
                                composer2.disableReusing();
                                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer2);
                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, Integer.valueOf((int) r9));
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-2137368960);
                                ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(1204996270);
                                ComposerKt.sourceInformation(composer2, "C160@6631L9,154@6384L451:Switch.kt#uh7d8r");
                                int i132 = i9 >> 6;
                                Composer composer42 = composer2;
                                m2471SwitchImpl0DmnUew(boxScopeInstance2, z, z5, switchColors3, animatable.asState(), function23, mutableInteractionSource4, ShapesKt.toShape(SwitchTokens.INSTANCE.getHandleShape(), composer2, 6), f32, fM6117constructorimpl2, f2, composer42, 6 | ((i9 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i132 & 896) | (i132 & 7168) | ((i9 << 6) & 458752) | (i9 & 3670016), 6);
                                composer3 = composer42;
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z6 = z5;
                                modifier4 = modifier3;
                                switchColors4 = switchColors3;
                                function24 = function23;
                                mutableInteractionSource5 = mutableInteractionSource4;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z3 = z2;
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((2995931 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function22 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z2;
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((2995931 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((2995931 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchImpl-0DmnUew, reason: not valid java name */
    public static final void m2471SwitchImpl0DmnUew(final BoxScope boxScope, boolean z, final boolean z2, final SwitchColors switchColors, final State<Float> state, Function2<? super Composer, ? super Integer, Unit> function2, final InteractionSource interactionSource, Shape shape, final float f, final float f2, final float f3, Composer composer, final int i, final int i2) {
        int i3;
        State<Float> state2;
        int i4;
        float fM6117constructorimpl;
        final float fFloatValue;
        Composer composer2;
        Shape shape2;
        float fM3042getTrackOutlineWidthD9Ej5fM;
        final boolean z3 = z;
        final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1968109941);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SwitchImpl)P(!1,2!1,8,6!1,7,9:c#ui.unit.Dp,5:c#ui.unit.Dp,4:c#ui.unit.Dp)183@7283L28,184@7351L25,*186@7419L7,206@8052L9,213@8261L29,218@8380L951:Switch.kt#uh7d8r");
        if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            state2 = state;
            i3 |= composerStartRestartGroup.changed(state2) ? 16384 : 8192;
        } else {
            state2 = state;
        }
        if ((i & 458752) == 0) {
            i3 |= composerStartRestartGroup.changed(function22) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(f3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) != 306783378 || (i4 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i3, i4, "androidx.compose.material3.SwitchImpl (Switch.kt:171)");
            }
            int i5 = ((i3 >> 6) & 14) | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 3) & 896);
            State<Color> stateTrackColor$material3_release = switchColors.trackColor$material3_release(z2, z3, composerStartRestartGroup, i5);
            State<Boolean> stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, composerStartRestartGroup, (i3 >> 18) & 14);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            int i6 = i3;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            float fMo708toDpu2uoSUM = ((Density) objConsume).mo708toDpu2uoSUM(state2.getValue().floatValue());
            if (m2474SwitchImpl_0DmnUew$lambda7(stateCollectIsPressedAsState)) {
                fM6117constructorimpl = SwitchTokens.INSTANCE.m3036getPressedHandleWidthD9Ej5fM();
            } else {
                fM6117constructorimpl = Dp.m6117constructorimpl(f + Dp.m6117constructorimpl(Dp.m6117constructorimpl(ThumbDiameter - f) * (Dp.m6117constructorimpl(fMo708toDpu2uoSUM - f2) / Dp.m6117constructorimpl(f3 - f2))));
            }
            composerStartRestartGroup.startReplaceableGroup(-993794194);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*195@7760L7");
            if (m2474SwitchImpl_0DmnUew$lambda7(stateCollectIsPressedAsState)) {
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density = (Density) objConsume2;
                if (!z3) {
                    fM3042getTrackOutlineWidthD9Ej5fM = SwitchTokens.INSTANCE.m3042getTrackOutlineWidthD9Ej5fM();
                } else {
                    fM3042getTrackOutlineWidthD9Ej5fM = Dp.m6117constructorimpl(ThumbPathLength - SwitchTokens.INSTANCE.m3042getTrackOutlineWidthD9Ej5fM());
                }
                fFloatValue = density.mo712toPx0680j_4(fM3042getTrackOutlineWidthD9Ej5fM);
            } else {
                fFloatValue = state2.getValue().floatValue();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Shape shape3 = ShapesKt.toShape(SwitchTokens.INSTANCE.getTrackShape(), composerStartRestartGroup, 6);
            float f4 = fM6117constructorimpl;
            Modifier modifierM574backgroundbw27NRU = BackgroundKt.m574backgroundbw27NRU(BorderKt.m586borderxT4_qwU(SizeKt.m1051height3ABfNKs(SizeKt.m1070width3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), SwitchWidth), SwitchHeight), SwitchTokens.INSTANCE.m3042getTrackOutlineWidthD9Ej5fM(), switchColors.borderColor$material3_release(z2, z3, composerStartRestartGroup, i5).getValue().m3667unboximpl(), shape3), m2473SwitchImpl_0DmnUew$lambda6(stateTrackColor$material3_release), shape3);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localDensity3);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density2 = (Density) objConsume3;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume4 = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume4;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume5 = composerStartRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume5;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM574backgroundbw27NRU);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(968687813);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C219@8429L28,224@8617L42,227@8781L64,221@8510L815:Switch.kt#uh7d8r");
            long jM2472SwitchImpl_0DmnUew$lambda13$lambda10 = m2472SwitchImpl_0DmnUew$lambda13$lambda10(switchColors.thumbColor$material3_release(z2, z3, composerStartRestartGroup, i5));
            Modifier modifierAlign = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart());
            Float fValueOf = Float.valueOf(fFloatValue);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(fValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                        return IntOffset.m6236boximpl(m2476invokeBjo55l4(density3));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m2476invokeBjo55l4(Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffsetKt.IntOffset(MathKt.roundToInt(fFloatValue), 0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            shape2 = shape;
            Modifier modifierM574backgroundbw27NRU2 = BackgroundKt.m574backgroundbw27NRU(SizeKt.m1057requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue), interactionSource, RippleKt.m2107rememberRipple9IZ8Weo(false, Dp.m6117constructorimpl(SwitchTokens.INSTANCE.m3040getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), f4), jM2472SwitchImpl_0DmnUew$lambda13$lambda10, shape2);
            Alignment center = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume6 = composer2.consume(localDensity4);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density3 = (Density) objConsume6;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume7 = composer2.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection2 = (LayoutDirection) objConsume7;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume8 = composer2.consume(localViewConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume8;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM574backgroundbw27NRU2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer2);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, density3, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composer2.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(881862015);
            ComposerKt.sourceInformation(composer2, "C234@9107L27,235@9151L150:Switch.kt#uh7d8r");
            z3 = z;
            if (function2 != null) {
                function22 = function2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(switchColors.iconColor$material3_release(z2, z3, composer2, i5).getValue())}, function22, composer2, ((i6 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8);
            } else {
                function22 = function2;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            shape2 = shape;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Shape shape4 = shape2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i7) {
                SwitchKt.m2471SwitchImpl0DmnUew(boxScope, z3, z2, switchColors, state, function22, interactionSource, shape4, f, f2, f3, composer3, i | 1, i2);
            }
        });
    }

    static {
        float fM3038getSelectedHandleWidthD9Ej5fM = SwitchTokens.INSTANCE.m3038getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = fM3038getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = SwitchTokens.INSTANCE.m3045getUnselectedHandleWidthD9Ej5fM();
        float fM3043getTrackWidthD9Ej5fM = SwitchTokens.INSTANCE.m3043getTrackWidthD9Ej5fM();
        SwitchWidth = fM3043getTrackWidthD9Ej5fM;
        float fM3041getTrackHeightD9Ej5fM = SwitchTokens.INSTANCE.m3041getTrackHeightD9Ej5fM();
        SwitchHeight = fM3041getTrackHeightD9Ej5fM;
        float fM6117constructorimpl = Dp.m6117constructorimpl(Dp.m6117constructorimpl(fM3041getTrackHeightD9Ej5fM - fM3038getSelectedHandleWidthD9Ej5fM) / 2);
        ThumbPadding = fM6117constructorimpl;
        ThumbPathLength = Dp.m6117constructorimpl(Dp.m6117constructorimpl(fM3043getTrackWidthD9Ej5fM - fM3038getSelectedHandleWidthD9Ej5fM) - fM6117constructorimpl);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-6, reason: not valid java name */
    private static final long m2473SwitchImpl_0DmnUew$lambda6(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-7, reason: not valid java name */
    private static final boolean m2474SwitchImpl_0DmnUew$lambda7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-13$lambda-10, reason: not valid java name */
    private static final long m2472SwitchImpl_0DmnUew$lambda13$lambda10(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }
}
