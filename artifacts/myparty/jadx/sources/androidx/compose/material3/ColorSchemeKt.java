package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorScheme.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aµ\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aµ\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010+\u001a)\u0010.\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u000200H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a\u001c\u00105\u001a\u00020\b*\u00020\u00042\u0006\u00106\u001a\u000207H\u0000ø\u0001\u0001¢\u0006\u0002\u00108\u001a\u001f\u00109\u001a\u00020\b*\u00020\u00042\u0006\u0010/\u001a\u000200ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\b*\u000207H\u0001ø\u0001\u0001¢\u0006\u0002\u0010=\u001a\u0014\u0010>\u001a\u00020?*\u00020\u00042\u0006\u0010@\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"DisabledAlpha", "", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ColorScheme;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "contentColorFor", "Landroidx/compose/ui/graphics/Color;", ViewProps.BACKGROUND_COLOR, "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColorScheme", PaymentSheetAppearanceKeys.PRIMARY, "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "darkColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "lightColorScheme-G1PFc-w", "applyTonalElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "applyTonalElevation-Hht5A8o", "(Landroidx/compose/material3/ColorScheme;JF)J", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "fromToken", "value", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "surfaceColorAtElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "toColor", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "updateColorSchemeFrom", "", "other", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new Function0<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ColorScheme invoke() {
            return ColorSchemeKt.m2234lightColorSchemeG1PFcw$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 536870911, null);
        }
    });

    /* compiled from: ColorScheme.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2234lightColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long jM2697getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m2697getPrimary0d7_KjU() : j;
        long jM2687getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m2687getOnPrimary0d7_KjU() : j2;
        long jM2698getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m2698getPrimaryContainer0d7_KjU() : j3;
        long jM2688getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m2688getOnPrimaryContainer0d7_KjU() : j4;
        long jM2682getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m2682getInversePrimary0d7_KjU() : j5;
        long jM2700getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m2700getSecondary0d7_KjU() : j6;
        long jM2689getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m2689getOnSecondary0d7_KjU() : j7;
        long jM2701getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m2701getSecondaryContainer0d7_KjU() : j8;
        long j30 = jM2697getPrimary0d7_KjU;
        long jM2690getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m2690getOnSecondaryContainer0d7_KjU() : j9;
        long jM2705getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m2705getTertiary0d7_KjU() : j10;
        long jM2693getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m2693getOnTertiary0d7_KjU() : j11;
        long jM2706getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m2706getTertiaryContainer0d7_KjU() : j12;
        long jM2694getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m2694getOnTertiaryContainer0d7_KjU() : j13;
        long jM2678getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m2678getBackground0d7_KjU() : j14;
        long jM2684getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m2684getOnBackground0d7_KjU() : j15;
        long jM2702getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m2702getSurface0d7_KjU() : j16;
        long jM2691getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m2691getOnSurface0d7_KjU() : j17;
        long jM2704getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m2704getSurfaceVariant0d7_KjU() : j18;
        long jM2692getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m2692getOnSurfaceVariant0d7_KjU() : j19;
        long j31 = (i & 524288) != 0 ? j30 : j20;
        long jM2683getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m2683getInverseSurface0d7_KjU() : j21;
        long jM2681getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m2681getInverseOnSurface0d7_KjU() : j22;
        long jM2679getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m2679getError0d7_KjU() : j23;
        long jM2685getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m2685getOnError0d7_KjU() : j24;
        long jM2680getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m2680getErrorContainer0d7_KjU() : j25;
        long jM2686getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m2686getOnErrorContainer0d7_KjU() : j26;
        long jM2695getOutline0d7_KjU = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m2695getOutline0d7_KjU() : j27;
        long jM2696getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorLightTokens.INSTANCE.m2696getOutlineVariant0d7_KjU() : j28;
        if ((i & 268435456) != 0) {
            j29 = ColorLightTokens.INSTANCE.m2699getScrim0d7_KjU();
        }
        return m2233lightColorSchemeG1PFcw(j30, jM2687getOnPrimary0d7_KjU, jM2698getPrimaryContainer0d7_KjU, jM2688getOnPrimaryContainer0d7_KjU, jM2682getInversePrimary0d7_KjU, jM2700getSecondary0d7_KjU, jM2689getOnSecondary0d7_KjU, jM2701getSecondaryContainer0d7_KjU, jM2690getOnSecondaryContainer0d7_KjU, jM2705getTertiary0d7_KjU, jM2693getOnTertiary0d7_KjU, jM2706getTertiaryContainer0d7_KjU, jM2694getOnTertiaryContainer0d7_KjU, jM2678getBackground0d7_KjU, jM2684getOnBackground0d7_KjU, jM2702getSurface0d7_KjU, jM2691getOnSurface0d7_KjU, jM2704getSurfaceVariant0d7_KjU, jM2692getOnSurfaceVariant0d7_KjU, j31, jM2683getInverseSurface0d7_KjU, jM2681getInverseOnSurface0d7_KjU, jM2679getError0d7_KjU, jM2685getOnError0d7_KjU, jM2680getErrorContainer0d7_KjU, jM2686getOnErrorContainer0d7_KjU, jM2695getOutline0d7_KjU, jM2696getOutlineVariant0d7_KjU, j29);
    }

    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m2233lightColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2232darkColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long jM2668getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m2668getPrimary0d7_KjU() : j;
        long jM2658getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m2658getOnPrimary0d7_KjU() : j2;
        long jM2669getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m2669getPrimaryContainer0d7_KjU() : j3;
        long jM2659getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m2659getOnPrimaryContainer0d7_KjU() : j4;
        long jM2653getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m2653getInversePrimary0d7_KjU() : j5;
        long jM2671getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m2671getSecondary0d7_KjU() : j6;
        long jM2660getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m2660getOnSecondary0d7_KjU() : j7;
        long jM2672getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m2672getSecondaryContainer0d7_KjU() : j8;
        long j30 = jM2668getPrimary0d7_KjU;
        long jM2661getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m2661getOnSecondaryContainer0d7_KjU() : j9;
        long jM2676getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m2676getTertiary0d7_KjU() : j10;
        long jM2664getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m2664getOnTertiary0d7_KjU() : j11;
        long jM2677getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m2677getTertiaryContainer0d7_KjU() : j12;
        long jM2665getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m2665getOnTertiaryContainer0d7_KjU() : j13;
        long jM2649getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m2649getBackground0d7_KjU() : j14;
        long jM2655getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m2655getOnBackground0d7_KjU() : j15;
        long jM2673getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m2673getSurface0d7_KjU() : j16;
        long jM2662getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m2662getOnSurface0d7_KjU() : j17;
        long jM2675getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m2675getSurfaceVariant0d7_KjU() : j18;
        long jM2663getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m2663getOnSurfaceVariant0d7_KjU() : j19;
        long j31 = (i & 524288) != 0 ? j30 : j20;
        long jM2654getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m2654getInverseSurface0d7_KjU() : j21;
        long jM2652getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m2652getInverseOnSurface0d7_KjU() : j22;
        long jM2650getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m2650getError0d7_KjU() : j23;
        long jM2656getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m2656getOnError0d7_KjU() : j24;
        long jM2651getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m2651getErrorContainer0d7_KjU() : j25;
        long jM2657getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m2657getOnErrorContainer0d7_KjU() : j26;
        long jM2666getOutline0d7_KjU = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m2666getOutline0d7_KjU() : j27;
        long jM2667getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m2667getOutlineVariant0d7_KjU() : j28;
        if ((i & 268435456) != 0) {
            j29 = ColorDarkTokens.INSTANCE.m2670getScrim0d7_KjU();
        }
        return m2231darkColorSchemeG1PFcw(j30, jM2658getOnPrimary0d7_KjU, jM2669getPrimaryContainer0d7_KjU, jM2659getOnPrimaryContainer0d7_KjU, jM2653getInversePrimary0d7_KjU, jM2671getSecondary0d7_KjU, jM2660getOnSecondary0d7_KjU, jM2672getSecondaryContainer0d7_KjU, jM2661getOnSecondaryContainer0d7_KjU, jM2676getTertiary0d7_KjU, jM2664getOnTertiary0d7_KjU, jM2677getTertiaryContainer0d7_KjU, jM2665getOnTertiaryContainer0d7_KjU, jM2649getBackground0d7_KjU, jM2655getOnBackground0d7_KjU, jM2673getSurface0d7_KjU, jM2662getOnSurface0d7_KjU, jM2675getSurfaceVariant0d7_KjU, jM2663getOnSurfaceVariant0d7_KjU, j31, jM2654getInverseSurface0d7_KjU, jM2652getInverseOnSurface0d7_KjU, jM2650getError0d7_KjU, jM2656getOnError0d7_KjU, jM2651getErrorContainer0d7_KjU, jM2657getOnErrorContainer0d7_KjU, jM2666getOutline0d7_KjU, jM2667getOutlineVariant0d7_KjU, j29);
    }

    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m2231darkColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, null);
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m2229contentColorFor4WTKRHQ(ColorScheme contentColorFor, long j) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        return Color.m3658equalsimpl0(j, contentColorFor.m2189getPrimary0d7_KjU()) ? contentColorFor.m2179getOnPrimary0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2192getSecondary0d7_KjU()) ? contentColorFor.m2181getOnSecondary0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2197getTertiary0d7_KjU()) ? contentColorFor.m2185getOnTertiary0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2170getBackground0d7_KjU()) ? contentColorFor.m2176getOnBackground0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2171getError0d7_KjU()) ? contentColorFor.m2177getOnError0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2194getSurface0d7_KjU()) ? contentColorFor.m2183getOnSurface0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2196getSurfaceVariant0d7_KjU()) ? contentColorFor.m2184getOnSurfaceVariant0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2190getPrimaryContainer0d7_KjU()) ? contentColorFor.m2180getOnPrimaryContainer0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2193getSecondaryContainer0d7_KjU()) ? contentColorFor.m2182getOnSecondaryContainer0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2198getTertiaryContainer0d7_KjU()) ? contentColorFor.m2186getOnTertiaryContainer0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2172getErrorContainer0d7_KjU()) ? contentColorFor.m2178getOnErrorContainer0d7_KjU() : Color.m3658equalsimpl0(j, contentColorFor.m2175getInverseSurface0d7_KjU()) ? contentColorFor.m2173getInverseOnSurface0d7_KjU() : Color.INSTANCE.m3693getUnspecified0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m2230contentColorForek8zF_U(long j, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 509589638, "C(contentColorFor)P(0:c#ui.graphics.Color)*474@21497L11,475@21581L7:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long jM2229contentColorFor4WTKRHQ = m2229contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (jM2229contentColorFor4WTKRHQ == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM2229contentColorFor4WTKRHQ = ((Color) objConsume).m3667unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jM2229contentColorFor4WTKRHQ;
    }

    /* renamed from: applyTonalElevation-Hht5A8o, reason: not valid java name */
    public static final long m2228applyTonalElevationHht5A8o(ColorScheme applyTonalElevation, long j, float f) {
        Intrinsics.checkNotNullParameter(applyTonalElevation, "$this$applyTonalElevation");
        return Color.m3658equalsimpl0(j, applyTonalElevation.m2194getSurface0d7_KjU()) ? m2235surfaceColorAtElevation3ABfNKs(applyTonalElevation, f) : j;
    }

    public static final void updateColorSchemeFrom(ColorScheme colorScheme, ColorScheme other) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colorScheme.m2218setPrimary8_81llA$material3_release(other.m2189getPrimary0d7_KjU());
        colorScheme.m2208setOnPrimary8_81llA$material3_release(other.m2179getOnPrimary0d7_KjU());
        colorScheme.m2219setPrimaryContainer8_81llA$material3_release(other.m2190getPrimaryContainer0d7_KjU());
        colorScheme.m2209setOnPrimaryContainer8_81llA$material3_release(other.m2180getOnPrimaryContainer0d7_KjU());
        colorScheme.m2203setInversePrimary8_81llA$material3_release(other.m2174getInversePrimary0d7_KjU());
        colorScheme.m2221setSecondary8_81llA$material3_release(other.m2192getSecondary0d7_KjU());
        colorScheme.m2210setOnSecondary8_81llA$material3_release(other.m2181getOnSecondary0d7_KjU());
        colorScheme.m2222setSecondaryContainer8_81llA$material3_release(other.m2193getSecondaryContainer0d7_KjU());
        colorScheme.m2211setOnSecondaryContainer8_81llA$material3_release(other.m2182getOnSecondaryContainer0d7_KjU());
        colorScheme.m2226setTertiary8_81llA$material3_release(other.m2197getTertiary0d7_KjU());
        colorScheme.m2214setOnTertiary8_81llA$material3_release(other.m2185getOnTertiary0d7_KjU());
        colorScheme.m2227setTertiaryContainer8_81llA$material3_release(other.m2198getTertiaryContainer0d7_KjU());
        colorScheme.m2215setOnTertiaryContainer8_81llA$material3_release(other.m2186getOnTertiaryContainer0d7_KjU());
        colorScheme.m2199setBackground8_81llA$material3_release(other.m2170getBackground0d7_KjU());
        colorScheme.m2205setOnBackground8_81llA$material3_release(other.m2176getOnBackground0d7_KjU());
        colorScheme.m2223setSurface8_81llA$material3_release(other.m2194getSurface0d7_KjU());
        colorScheme.m2212setOnSurface8_81llA$material3_release(other.m2183getOnSurface0d7_KjU());
        colorScheme.m2225setSurfaceVariant8_81llA$material3_release(other.m2196getSurfaceVariant0d7_KjU());
        colorScheme.m2213setOnSurfaceVariant8_81llA$material3_release(other.m2184getOnSurfaceVariant0d7_KjU());
        colorScheme.m2224setSurfaceTint8_81llA$material3_release(other.m2195getSurfaceTint0d7_KjU());
        colorScheme.m2204setInverseSurface8_81llA$material3_release(other.m2175getInverseSurface0d7_KjU());
        colorScheme.m2202setInverseOnSurface8_81llA$material3_release(other.m2173getInverseOnSurface0d7_KjU());
        colorScheme.m2200setError8_81llA$material3_release(other.m2171getError0d7_KjU());
        colorScheme.m2206setOnError8_81llA$material3_release(other.m2177getOnError0d7_KjU());
        colorScheme.m2201setErrorContainer8_81llA$material3_release(other.m2172getErrorContainer0d7_KjU());
        colorScheme.m2207setOnErrorContainer8_81llA$material3_release(other.m2178getOnErrorContainer0d7_KjU());
        colorScheme.m2216setOutline8_81llA$material3_release(other.m2187getOutline0d7_KjU());
        colorScheme.m2217setOutlineVariant8_81llA$material3_release(other.m2188getOutlineVariant0d7_KjU());
        colorScheme.m2220setScrim8_81llA$material3_release(other.m2191getScrim0d7_KjU());
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens value) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return colorScheme.m2170getBackground0d7_KjU();
            case 2:
                return colorScheme.m2171getError0d7_KjU();
            case 3:
                return colorScheme.m2172getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m2173getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m2174getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m2175getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m2176getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m2177getOnError0d7_KjU();
            case 9:
                return colorScheme.m2178getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m2179getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m2180getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m2181getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m2182getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m2183getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m2184getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m2195getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m2185getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m2186getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m2187getOutline0d7_KjU();
            case 20:
                return colorScheme.m2188getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m2189getPrimary0d7_KjU();
            case 22:
                return colorScheme.m2190getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m2191getScrim0d7_KjU();
            case 24:
                return colorScheme.m2192getSecondary0d7_KjU();
            case 25:
                return colorScheme.m2193getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m2194getSurface0d7_KjU();
            case 27:
                return colorScheme.m2196getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m2197getTertiary0d7_KjU();
            case 29:
                return colorScheme.m2198getTertiaryContainer0d7_KjU();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final long toColor(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colorSchemeKeyTokens, "<this>");
        ComposerKt.sourceInformationMarkerStart(composer, 1330949347, "C(toColor)612@27498L11:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330949347, i, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jFromToken;
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m2235surfaceColorAtElevation3ABfNKs(ColorScheme surfaceColorAtElevation, float f) {
        Intrinsics.checkNotNullParameter(surfaceColorAtElevation, "$this$surfaceColorAtElevation");
        if (Dp.m6122equalsimpl0(f, Dp.m6117constructorimpl(0))) {
            return surfaceColorAtElevation.m2194getSurface0d7_KjU();
        }
        return ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(surfaceColorAtElevation.m2195getSurfaceTint0d7_KjU(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), surfaceColorAtElevation.m2194getSurface0d7_KjU());
    }
}
