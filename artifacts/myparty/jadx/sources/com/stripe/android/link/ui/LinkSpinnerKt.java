package com.stripe.android.link.ui;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkSpinner.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"LinkSpinner", "", "modifier", "Landroidx/compose/ui/Modifier;", "filledColor", "Landroidx/compose/ui/graphics/Color;", ViewProps.BACKGROUND_COLOR, "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "LinkSpinner-h1eT-Ww", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/runtime/Composer;II)V", "LinkSpinnerPreview", "(Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release", "angle", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkSpinnerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkSpinnerPreview$lambda$4(int i, Composer composer, int i2) {
        LinkSpinnerPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkSpinner_h1eT_Ww$lambda$3(Modifier modifier, long j, long j2, float f, int i, int i2, Composer composer, int i3) {
        m7868LinkSpinnerh1eTWw(modifier, j, j2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0182  */
    /* renamed from: LinkSpinner-h1eT-Ww, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7868LinkSpinnerh1eTWw(Modifier modifier, long j, long j2, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM7798getIconBrand0d7_KjU;
        long jM7807getSurfaceTertiary0d7_KjU;
        float f2;
        final Modifier.Companion companion;
        final float fM6117constructorimpl;
        int i4;
        long j3;
        long j4;
        boolean z;
        final long j5;
        final State<Float> stateAnimateFloat;
        boolean z2;
        Object objRememberedValue;
        final long j6;
        long j7;
        final float f3;
        final long j8;
        final long j9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(459278094);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            jM7798getIconBrand0d7_KjU = j;
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(jM7798getIconBrand0d7_KjU)) ? 32 : 16;
        } else {
            jM7798getIconBrand0d7_KjU = j;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            jM7807getSurfaceTertiary0d7_KjU = j2;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(jM7807getSurfaceTertiary0d7_KjU)) ? 256 : 128;
        } else {
            jM7807getSurfaceTertiary0d7_KjU = j2;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        jM7798getIconBrand0d7_KjU = LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7798getIconBrand0d7_KjU();
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        jM7807getSurfaceTertiary0d7_KjU = LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7807getSurfaceTertiary0d7_KjU();
                        i3 &= -897;
                    }
                    if (i6 == 0) {
                        fM6117constructorimpl = Dp.m6117constructorimpl(6);
                        i4 = i3;
                        j3 = jM7798getIconBrand0d7_KjU;
                        j4 = jM7807getSurfaceTertiary0d7_KjU;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(459278094, i4, -1, "com.stripe.android.link.ui.LinkSpinner (LinkSpinner.kt:29)");
                    }
                    z = false;
                    j5 = j4;
                    stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m478infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1200, 0, null, 6, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    composerStartRestartGroup.startReplaceGroup(2130810875);
                    boolean zChanged = ((i4 & 7168) == 2048) | ((((i4 & 896) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composerStartRestartGroup.changed(j5)) || (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) | composerStartRestartGroup.changed(stateAnimateFloat);
                    if ((((i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32 && composerStartRestartGroup.changed(j3)) || (i4 & 48) == 32) {
                        z = true;
                    }
                    z2 = zChanged | z;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        j6 = j3;
                        objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.LinkSpinnerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LinkSpinnerKt.LinkSpinner_h1eT_Ww$lambda$2$lambda$1(fM6117constructorimpl, j5, j6, stateAnimateFloat, (DrawScope) obj);
                            }
                        };
                        j7 = j5;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        j6 = j3;
                        j7 = j5;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CanvasKt.Canvas(companion, (Function1) objRememberedValue, composerStartRestartGroup, i4 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM6117constructorimpl;
                    j8 = j6;
                    j9 = j7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = modifier2;
                }
                i4 = i3;
                j3 = jM7798getIconBrand0d7_KjU;
                j4 = jM7807getSurfaceTertiary0d7_KjU;
                fM6117constructorimpl = f2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                z = false;
                j5 = j4;
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m478infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1200, 0, null, 6, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                composerStartRestartGroup.startReplaceGroup(2130810875);
                if (((i4 & 896) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256) {
                    boolean zChanged2 = ((i4 & 7168) == 2048) | ((((i4 & 896) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composerStartRestartGroup.changed(j5)) || (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) | composerStartRestartGroup.changed(stateAnimateFloat);
                    if (((i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32) {
                        z = true;
                        z2 = zChanged2 | z;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                            j6 = j3;
                            objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.LinkSpinnerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LinkSpinnerKt.LinkSpinner_h1eT_Ww$lambda$2$lambda$1(fM6117constructorimpl, j5, j6, stateAnimateFloat, (DrawScope) obj);
                                }
                            };
                            j7 = j5;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            CanvasKt.Canvas(companion, (Function1) objRememberedValue, composerStartRestartGroup, i4 & 14);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f3 = fM6117constructorimpl;
                            j8 = j6;
                            j9 = j7;
                        }
                    } else {
                        z = true;
                        z2 = zChanged2 | z;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                        }
                    }
                } else {
                    boolean zChanged22 = ((i4 & 7168) == 2048) | ((((i4 & 896) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composerStartRestartGroup.changed(j5)) || (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) | composerStartRestartGroup.changed(stateAnimateFloat);
                    if (((i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
                j8 = jM7798getIconBrand0d7_KjU;
                j9 = jM7807getSurfaceTertiary0d7_KjU;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkSpinnerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LinkSpinnerKt.LinkSpinner_h1eT_Ww$lambda$3(companion, j8, j9, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        f2 = f;
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i6 == 0) {
                    i4 = i3;
                    j3 = jM7798getIconBrand0d7_KjU;
                    j4 = jM7807getSurfaceTertiary0d7_KjU;
                    fM6117constructorimpl = f2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                z = false;
                j5 = j4;
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m478infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1200, 0, null, 6, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                composerStartRestartGroup.startReplaceGroup(2130810875);
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkSpinner_h1eT_Ww$lambda$2$lambda$1(float f, long j, long j2, State state, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f2 = Canvas.mo712toPx0680j_4(f);
        float f3 = 2;
        float f4 = f2 / f3;
        DrawScope.m4194drawCircleVaOC9Bg$default(Canvas, j, (Size.m3484getMinDimensionimpl(Canvas.mo4213getSizeNHjbRc()) / f3) - f4, 0L, 0.0f, new Stroke(f2, 0.0f, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), 0, null, 26, null), null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
        DrawScope.m4192drawArcyD3GUKo$default(Canvas, j2, LinkSpinner_h1eT_Ww$lambda$0(state), 90.0f, false, OffsetKt.Offset(f4, f4), SizeKt.Size(Size.m3485getWidthimpl(Canvas.mo4213getSizeNHjbRc()) - f2, Size.m3482getHeightimpl(Canvas.mo4213getSizeNHjbRc()) - f2), 0.0f, new Stroke(f2, 0.0f, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
        return Unit.INSTANCE;
    }

    private static final void LinkSpinnerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1654614371);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1654614371, i, -1, "com.stripe.android.link.ui.LinkSpinnerPreview (LinkSpinner.kt:70)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkSpinnerKt.INSTANCE.m7837getLambda1$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkSpinnerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkSpinnerKt.LinkSpinnerPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float LinkSpinner_h1eT_Ww$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }
}
