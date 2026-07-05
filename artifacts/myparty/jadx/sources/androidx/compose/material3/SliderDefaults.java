package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0014Jy\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/SliderColors;", ViewProps.ENABLED, "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "material3_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2417colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(885588574);
        ComposerKt.sourceInformation(composer, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)619@27285L9,620@27360L9,622@27460L9,624@27611L9,625@27702L9,628@27869L9,630@27982L11,633@28113L9,636@28294L9,640@28492L9,643@28665L9:Slider.kt#uh7d8r");
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getHandleColor(), composer, 6) : j;
        long color2 = (i3 & 2) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getActiveTrackColor(), composer, 6) : j2;
        long jM3656copywmQWz5c$default = (i3 & 4) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksActiveContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i3 & 8) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getInactiveTrackColor(), composer, 6) : j4;
        long jM3656copywmQWz5c$default2 = (i3 & 16) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksInactiveContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM3702compositeOverOWjLjI = (i3 & 32) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledHandleColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m2194getSurface0d7_KjU()) : j6;
        long jM3656copywmQWz5c$default3 = (i3 & 64) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledActiveTrackColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM3656copywmQWz5c$default4 = (i3 & 128) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long jM3656copywmQWz5c$default5 = (i3 & 256) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledInactiveTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long jM3656copywmQWz5c$default6 = (i3 & 512) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:618)");
        }
        SliderColors sliderColors = new SliderColors(color, color2, jM3656copywmQWz5c$default, color3, jM3656copywmQWz5c$default2, jM3702compositeOverOWjLjI, jM3656copywmQWz5c$default3, jM3656copywmQWz5c$default4, jM3656copywmQWz5c$default5, jM3656copywmQWz5c$default6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013f  */
    @ExperimentalMaterial3Api
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2416Thumb9LiSoMs(final MutableInteractionSource interactionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        Modifier.Companion companion;
        final boolean z3;
        long j3;
        Object objRememberedValue;
        SnapshotStateList snapshotStateList;
        boolean zChanged;
        Object objRememberedValue2;
        final Modifier modifier3;
        final SliderColors sliderColors3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-290277409);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Thumb)P(2,3!,4:c#ui.unit.DpSize)676@30208L8,680@30324L46,681@30413L658,681@30379L692,699@31270L9,706@31472L143,713@31814L19,701@31289L568:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(interactionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i7 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i7;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((57344 & i) == 0) {
                        j2 = j;
                        i3 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
                    }
                    if ((i2 & 32) != 0) {
                        if ((458752 & i) == 0) {
                            i3 |= composerStartRestartGroup.changed(this) ? 131072 : 65536;
                        }
                        if ((374491 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 4) != 0) {
                                    SliderColors sliderColorsM2417colorsq0g_0yA = m2417colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i3 >> 15) & 14, 1023);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    i3 &= -897;
                                    sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                                }
                                z3 = i4 == 0 ? true : z;
                                j3 = i5 == 0 ? SliderKt.ThumbSize : j;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                companion = modifier2;
                                z3 = z2;
                                j3 = j2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-290277409, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:673)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            snapshotStateList = (SnapshotStateList) objRememberedValue;
                            int i8 = i3 & 14;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function2) new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i8 | 64);
                            float f = snapshotStateList.isEmpty() ? SliderKt.ThumbPressedElevation : SliderKt.ThumbDefaultElevation;
                            Shape shape = ShapesKt.toShape(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                            long j5 = j3;
                            SpacerKt.Spacer(BackgroundKt.m574backgroundbw27NRU(ShadowKt.m3321shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1066size6HolHcs(companion, j3), interactionSource, RippleKt.m2107rememberRipple9IZ8Weo(false, Dp.m6117constructorimpl(SliderTokens.INSTANCE.m3016getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), interactionSource, false, 2, null), !z3 ? f : Dp.m6117constructorimpl(0), shape, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z3, composerStartRestartGroup, ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 9) & 14)).getValue().m3667unboximpl(), shape), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            sliderColors3 = sliderColors2;
                            j4 = j5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            sliderColors3 = sliderColors2;
                            z3 = z2;
                            j4 = j2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                this.$tmp0_rcvr.m2416Thumb9LiSoMs(interactionSource, modifier3, sliderColors3, z3, j4, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    if ((374491 & i3) != 74898) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i6 == 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            snapshotStateList = (SnapshotStateList) objRememberedValue;
                            int i82 = i3 & 14;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue2 = (Function2) new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i82 | 64);
                                if (snapshotStateList.isEmpty()) {
                                }
                                Shape shape2 = ShapesKt.toShape(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                                long j52 = j3;
                                SpacerKt.Spacer(BackgroundKt.m574backgroundbw27NRU(ShadowKt.m3321shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1066size6HolHcs(companion, j3), interactionSource, RippleKt.m2107rememberRipple9IZ8Weo(false, Dp.m6117constructorimpl(SliderTokens.INSTANCE.m3016getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), interactionSource, false, 2, null), !z3 ? f : Dp.m6117constructorimpl(0), shape2, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z3, composerStartRestartGroup, ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 9) & 14)).getValue().m3667unboximpl(), shape2), composerStartRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = companion;
                                sliderColors3 = sliderColors2;
                                j4 = j52;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                j2 = j;
                if ((i2 & 32) != 0) {
                }
                if ((374491 & i3) != 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            j2 = j;
            if ((i2 & 32) != 0) {
            }
            if ((374491 & i3) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        j2 = j;
        if ((i2 & 32) != 0) {
        }
        if ((374491 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164 A[LOOP:0: B:86:0x0161->B:88:0x0164, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(final SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Composer composer2;
        boolean z3;
        SliderColors sliderColorsM2417colorsq0g_0yA;
        boolean z4;
        SliderColors sliderColors3;
        Modifier modifier3;
        ?? r5;
        final State<Color> stateTrackColor$material3_release;
        final State<Color> stateTrackColor$material3_release2;
        final State<Color> stateTickColor$material3_release;
        final State<Color> stateTickColor$material3_release2;
        int i5;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier4;
        final SliderColors sliderColors4;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(sliderPositions, "sliderPositions");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1546713545);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Track)P(3,2)734@32707L8,737@32798L35,738@32872L34,739@32946L34,740@33018L33,744@33147L1806,741@33060L1893:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(sliderPositions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i7 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i7;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    if ((57344 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                    }
                    if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 4) == 0) {
                                z3 = true;
                                sliderColorsM2417colorsq0g_0yA = m2417colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i3 >> 12) & 14, 1023);
                                composer2 = composerStartRestartGroup;
                                i3 &= -897;
                            } else {
                                composer2 = composerStartRestartGroup;
                                z3 = true;
                                sliderColorsM2417colorsq0g_0yA = sliderColors2;
                            }
                            if (i4 == 0) {
                                sliderColors3 = sliderColorsM2417colorsq0g_0yA;
                                modifier3 = companion;
                                z4 = z3 ? 1 : 0;
                                r5 = z3;
                            } else {
                                z4 = z;
                                sliderColors3 = sliderColorsM2417colorsq0g_0yA;
                                modifier3 = companion;
                                r5 = z3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            sliderColors3 = sliderColors2;
                            z4 = z2;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            r5 = 1;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1546713545, i3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:731)");
                        }
                        int i8 = ((i3 >> 9) & 14) | 48 | (i3 & 896);
                        stateTrackColor$material3_release = sliderColors3.trackColor$material3_release(z4, false, composer2, i8);
                        stateTrackColor$material3_release2 = sliderColors3.trackColor$material3_release(z4, r5, composer2, i8);
                        stateTickColor$material3_release = sliderColors3.tickColor$material3_release(z4, false, composer2, i8);
                        stateTickColor$material3_release2 = sliderColors3.tickColor$material3_release(z4, r5, composer2, i8);
                        Modifier modifierM1051height3ABfNKs = SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, r5, null), SliderKt.getTrackHeight());
                        Object[] objArr = {stateTrackColor$material3_release, sliderPositions, stateTrackColor$material3_release2, stateTickColor$material3_release, stateTickColor$material3_release2};
                        composer2.startReplaceableGroup(-568225417);
                        ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                        zChanged = false;
                        for (i5 = 0; i5 < 5; i5++) {
                            zChanged |= composer2.changed(objArr[i5]);
                        }
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
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
                                    boolean z6 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                                    long jOffset = OffsetKt.Offset(0.0f, Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0()));
                                    long jOffset2 = OffsetKt.Offset(Size.m3485getWidthimpl(Canvas.mo4213getSizeNHjbRc()), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0()));
                                    long j = z6 ? jOffset2 : jOffset;
                                    long j2 = z6 ? jOffset : jOffset2;
                                    float f = Canvas.mo712toPx0680j_4(SliderKt.TickSize);
                                    float f2 = Canvas.mo712toPx0680j_4(SliderKt.getTrackHeight());
                                    DrawScope.m4199drawLineNGM6Ib0$default(Canvas, stateTrackColor$material3_release.getValue().m3667unboximpl(), j, j2, f2, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    long j3 = j;
                                    long j4 = j2;
                                    DrawScope.m4199drawLineNGM6Ib0$default(Canvas, stateTrackColor$material3_release2.getValue().m3667unboximpl(), OffsetKt.Offset(Offset.m3416getXimpl(j) + ((Offset.m3416getXimpl(j2) - Offset.m3416getXimpl(j)) * 0.0f), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3416getXimpl(j) + ((Offset.m3416getXimpl(j2) - Offset.m3416getXimpl(j)) * sliderPositions.getPositionFraction()), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    float[] tickFractions = sliderPositions.getTickFractions();
                                    SliderPositions sliderPositions2 = sliderPositions;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    int length = tickFractions.length;
                                    for (int i9 = 0; i9 < length; i9++) {
                                        float f3 = tickFractions[i9];
                                        Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getPositionFraction() || f3 < 0.0f);
                                        Object obj = linkedHashMap.get(boolValueOf);
                                        if (obj == null) {
                                            obj = (List) new ArrayList();
                                            linkedHashMap.put(boolValueOf, obj);
                                        }
                                        ((List) obj).add(Float.valueOf(f3));
                                    }
                                    State<Color> state = stateTickColor$material3_release;
                                    State<Color> state2 = stateTickColor$material3_release2;
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                        List list = (List) entry.getValue();
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(Offset.m3405boximpl(OffsetKt.Offset(Offset.m3416getXimpl(OffsetKt.m3439lerpWko1d7g(j3, j4, ((Number) it.next()).floatValue())), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0()))));
                                        }
                                        long j5 = j3;
                                        long j6 = j4;
                                        DrawScope.m4204drawPointsF8ZwMP8$default(Canvas, arrayList, PointMode.INSTANCE.m3963getPointsr_lszbg(), (zBooleanValue ? state : state2).getValue().m3667unboximpl(), f, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                        j3 = j5;
                                        j4 = j6;
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM1051height3ABfNKs, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        sliderColors4 = sliderColors3;
                        z5 = z4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        sliderColors4 = sliderColors2;
                        z5 = z2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            SliderDefaults.this.Track(sliderPositions, modifier4, sliderColors4, z5, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= 24576;
                if ((46811 & i3) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i6 == 0) {
                        }
                        if ((i2 & 4) == 0) {
                        }
                        if (i4 == 0) {
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = ((i3 >> 9) & 14) | 48 | (i3 & 896);
                        stateTrackColor$material3_release = sliderColors3.trackColor$material3_release(z4, false, composer2, i82);
                        stateTrackColor$material3_release2 = sliderColors3.trackColor$material3_release(z4, r5, composer2, i82);
                        stateTickColor$material3_release = sliderColors3.tickColor$material3_release(z4, false, composer2, i82);
                        stateTickColor$material3_release2 = sliderColors3.tickColor$material3_release(z4, r5, composer2, i82);
                        Modifier modifierM1051height3ABfNKs2 = SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, r5, null), SliderKt.getTrackHeight());
                        Object[] objArr2 = {stateTrackColor$material3_release, sliderPositions, stateTrackColor$material3_release2, stateTickColor$material3_release, stateTickColor$material3_release2};
                        composer2.startReplaceableGroup(-568225417);
                        ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                        zChanged = false;
                        while (i5 < 5) {
                        }
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
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
                                    boolean z6 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                                    long jOffset = OffsetKt.Offset(0.0f, Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0()));
                                    long jOffset2 = OffsetKt.Offset(Size.m3485getWidthimpl(Canvas.mo4213getSizeNHjbRc()), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0()));
                                    long j = z6 ? jOffset2 : jOffset;
                                    long j2 = z6 ? jOffset : jOffset2;
                                    float f = Canvas.mo712toPx0680j_4(SliderKt.TickSize);
                                    float f2 = Canvas.mo712toPx0680j_4(SliderKt.getTrackHeight());
                                    DrawScope.m4199drawLineNGM6Ib0$default(Canvas, stateTrackColor$material3_release.getValue().m3667unboximpl(), j, j2, f2, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    long j3 = j;
                                    long j4 = j2;
                                    DrawScope.m4199drawLineNGM6Ib0$default(Canvas, stateTrackColor$material3_release2.getValue().m3667unboximpl(), OffsetKt.Offset(Offset.m3416getXimpl(j) + ((Offset.m3416getXimpl(j2) - Offset.m3416getXimpl(j)) * 0.0f), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3416getXimpl(j) + ((Offset.m3416getXimpl(j2) - Offset.m3416getXimpl(j)) * sliderPositions.getPositionFraction()), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    float[] tickFractions = sliderPositions.getTickFractions();
                                    SliderPositions sliderPositions2 = sliderPositions;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    int length = tickFractions.length;
                                    for (int i9 = 0; i9 < length; i9++) {
                                        float f3 = tickFractions[i9];
                                        Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getPositionFraction() || f3 < 0.0f);
                                        Object obj = linkedHashMap.get(boolValueOf);
                                        if (obj == null) {
                                            obj = (List) new ArrayList();
                                            linkedHashMap.put(boolValueOf, obj);
                                        }
                                        ((List) obj).add(Float.valueOf(f3));
                                    }
                                    State<Color> state = stateTickColor$material3_release;
                                    State<Color> state2 = stateTickColor$material3_release2;
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                        List list = (List) entry.getValue();
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(Offset.m3405boximpl(OffsetKt.Offset(Offset.m3416getXimpl(OffsetKt.m3439lerpWko1d7g(j3, j4, ((Number) it.next()).floatValue())), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0()))));
                                        }
                                        long j5 = j3;
                                        long j6 = j4;
                                        DrawScope.m4204drawPointsF8ZwMP8$default(Canvas, arrayList, PointMode.INSTANCE.m3963getPointsr_lszbg(), (zBooleanValue ? state : state2).getValue().m3667unboximpl(), f, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                        j3 = j5;
                                        j4 = j6;
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            composer2.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM1051height3ABfNKs2, (Function1) objRememberedValue, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            sliderColors4 = sliderColors3;
                            z5 = z4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i2 & 16) == 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
