package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a¬\u0001\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u007f\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$¢\u0006\u0002\b\u000e¢\u0006\u0002\b&H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a8\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aN\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$¢\u0006\u0002\b\u000e¢\u0006\u0002\b&2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aN\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$¢\u0006\u0002\b\u000e¢\u0006\u0002\b&2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00102\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"ContentEndPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingContentEndPadding", "ListItemHorizontalPadding", "ListItemThreeLineVerticalPadding", "ListItemVerticalPadding", "ThreeLineListItemContainerHeight", "TrailingHorizontalPadding", "TwoLineListItemContainerHeight", "ListItem", "", "headlineText", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "overlineText", "supportingText", "leadingContent", "trailingContent", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/ListItemColors;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", ViewProps.MIN_HEIGHT, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "ListItem-xOgov6c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ProvideTextStyleFromToken", "color", "textToken", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "topAlign", "", "leadingContent-iJQMabo", "(Lkotlin/jvm/functions/Function2;JZLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;", "trailingContent-iJQMabo", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt {
    private static final float ContentEndPadding;
    private static final float LeadingContentEndPadding;
    private static final float ListItemHorizontalPadding;
    private static final float ListItemThreeLineVerticalPadding;
    private static final float ListItemVerticalPadding;
    private static final float TrailingHorizontalPadding;
    private static final float TwoLineListItemContainerHeight = Dp.m6117constructorimpl(72);
    private static final float ThreeLineListItemContainerHeight = Dp.m6117constructorimpl(88);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    @ExperimentalMaterial3Api
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2340ListItemHXNGIdc(final Function2<? super Composer, ? super Integer, Unit> headlineText, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, ListItemColors listItemColors, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Composer composer2;
        int i12;
        int i13;
        ListItemColors listItemColorsM2338colorsJ08w3E;
        float fM2339getElevationD9Ej5fM;
        float f4;
        final ListItemColors listItemColors2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        Composer composer3;
        Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final ListItemColors listItemColors3;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Modifier modifier4;
        final float f5;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(headlineText, "headlineText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1647707763);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ListItem)P(1,3,4,6,2,8!1,7:c#ui.unit.Dp,5:c#ui.unit.Dp)78@3522L8:ListItem.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(headlineText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    function25 = function2;
                    i3 |= composerStartRestartGroup.changed(function25) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        function26 = function22;
                        i3 |= composerStartRestartGroup.changed(function26) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 57344) == 0) {
                            i3 |= composerStartRestartGroup.changed(function23) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else {
                            if ((i & 458752) == 0) {
                                function27 = function24;
                                i3 |= composerStartRestartGroup.changed(function27) ? 131072 : 65536;
                            }
                            if ((i & 3670016) == 0) {
                                i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(listItemColors)) ? 1048576 : 524288;
                            }
                            i8 = i2 & 128;
                            if (i8 == 0) {
                                i3 |= 12582912;
                            } else {
                                if ((i & 29360128) == 0) {
                                    i9 = i8;
                                    i3 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
                                }
                                i10 = i2 & 256;
                                if (i10 == 0) {
                                    if ((i & 234881024) == 0) {
                                        i11 = i10;
                                        f3 = f2;
                                        i3 |= composerStartRestartGroup.changed(f3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    }
                                    if ((i3 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            if (i14 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i4 != 0) {
                                                function25 = null;
                                            }
                                            if (i5 != 0) {
                                                function26 = null;
                                            }
                                            function28 = i6 == 0 ? null : function23;
                                            Function2<? super Composer, ? super Integer, Unit> function213 = i7 == 0 ? function27 : null;
                                            if ((i2 & 64) == 0) {
                                                i12 = i9;
                                                i13 = i11;
                                                listItemColorsM2338colorsJ08w3E = ListItemDefaults.INSTANCE.m2338colorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, FrameMetricsAggregator.EVERY_DURATION);
                                                composer2 = composerStartRestartGroup;
                                                i3 &= -3670017;
                                            } else {
                                                composer2 = composerStartRestartGroup;
                                                i12 = i9;
                                                i13 = i11;
                                                listItemColorsM2338colorsJ08w3E = listItemColors;
                                            }
                                            float fM2339getElevationD9Ej5fM2 = i12 == 0 ? ListItemDefaults.INSTANCE.m2339getElevationD9Ej5fM() : f;
                                            if (i13 == 0) {
                                                function27 = function213;
                                                f4 = fM2339getElevationD9Ej5fM2;
                                                fM2339getElevationD9Ej5fM = ListItemDefaults.INSTANCE.m2339getElevationD9Ej5fM();
                                            } else {
                                                fM2339getElevationD9Ej5fM = f2;
                                                function27 = function213;
                                                f4 = fM2339getElevationD9Ej5fM2;
                                            }
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i2 & 64) != 0) {
                                                i3 &= -3670017;
                                            }
                                            function28 = function23;
                                            f4 = f;
                                            composer2 = composerStartRestartGroup;
                                            fM2339getElevationD9Ej5fM = f3;
                                            listItemColorsM2338colorsJ08w3E = listItemColors;
                                        }
                                        composer2.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1647707763, i3, -1, "androidx.compose.material3.ListItem (ListItem.kt:71)");
                                        }
                                        if (function25 == null || function26 != null) {
                                            final ListItemColors listItemColors4 = listItemColorsM2338colorsJ08w3E;
                                            final Function2<? super Composer, ? super Integer, Unit> function214 = function27;
                                            if (function25 != null) {
                                                composer2.startReplaceableGroup(-85612818);
                                                ComposerKt.sourceInformation(composer2, "123@5273L16,124@5331L29,121@5194L1665");
                                                long jM3667unboximpl = listItemColors4.containerColor$material3_release(composer2, (i3 >> 18) & 14).getValue().m3667unboximpl();
                                                long jM3667unboximpl2 = listItemColors4.headlineColor$material3_release(true, composer2, ((i3 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl();
                                                float f7 = TwoLineListItemContainerHeight;
                                                PaddingValues paddingValuesM1014PaddingValuesYgX7TsA = PaddingKt.m1014PaddingValuesYgX7TsA(ListItemHorizontalPadding, ListItemVerticalPadding);
                                                final int i15 = i3;
                                                final Function2<? super Composer, ? super Integer, Unit> function215 = function28;
                                                final Function2<? super Composer, ? super Integer, Unit> function216 = function26;
                                                Function3<RowScope, Composer, Integer, Unit> function3 = new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                                        invoke(rowScope, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(RowScope ListItem, Composer composer4, int i16) {
                                                        int i17;
                                                        Composer composer5;
                                                        Intrinsics.checkNotNullParameter(ListItem, "$this$ListItem");
                                                        ComposerKt.sourceInformation(composer4, "C137@5914L650,158@6738L33,156@6624L209,156@6624L211:ListItem.kt#uh7d8r");
                                                        if ((i16 & 14) == 0) {
                                                            i17 = i16 | (composer4.changed(ListItem) ? 4 : 2);
                                                        } else {
                                                            i17 = i16;
                                                        }
                                                        if ((i17 & 91) != 18 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(48069791, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:129)");
                                                            }
                                                            composer4.startReplaceableGroup(1316673775);
                                                            ComposerKt.sourceInformation(composer4, "133@5791L32,131@5680L205,131@5680L207");
                                                            Function2<Composer, Integer, Unit> function217 = function215;
                                                            if (function217 != null) {
                                                                composer5 = composer4;
                                                                ListItemKt.m2347leadingContentiJQMabo(function217, listItemColors4.leadingIconColor$material3_release(true, composer4, ((i15 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), false, composer4, ((i15 >> 12) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT).invoke(ListItem, composer5, Integer.valueOf(i17 & 14));
                                                            } else {
                                                                composer5 = composer4;
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            Modifier modifierAlign = ListItem.align(RowScope.weight$default(ListItem, Modifier.INSTANCE, 1.0f, false, 2, null), Alignment.INSTANCE.getCenterVertically());
                                                            ListItemColors listItemColors5 = listItemColors4;
                                                            int i18 = i15;
                                                            Function2<Composer, Integer, Unit> function218 = headlineText;
                                                            Function2<Composer, Integer, Unit> function219 = function216;
                                                            composer5.startReplaceableGroup(733328855);
                                                            ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object objConsume = composer5.consume(localDensity);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            Density density = (Density) objConsume;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object objConsume2 = composer5.consume(localLayoutDirection);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object objConsume3 = composer5.consume(localViewConfiguration);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlign);
                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            composer5.disableReusing();
                                                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer5.enableReusing();
                                                            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            composer5.startReplaceableGroup(-2137368960);
                                                            ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(691896537);
                                                            ComposerKt.sourceInformation(composer5, "C142@6063L487:ListItem.kt#uh7d8r");
                                                            composer5.startReplaceableGroup(-483455358);
                                                            ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object objConsume4 = composer5.consume(localDensity2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            Density density2 = (Density) objConsume4;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object objConsume5 = composer5.consume(localLayoutDirection2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object objConsume6 = composer5.consume(localViewConfiguration2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor2);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            composer5.disableReusing();
                                                            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer5);
                                                            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer5.enableReusing();
                                                            function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            composer5.startReplaceableGroup(-1163856341);
                                                            ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(-1123604189);
                                                            ComposerKt.sourceInformation(composer5, "C144@6150L29,143@6092L211,149@6382L17,148@6324L208:ListItem.kt#uh7d8r");
                                                            Composer composer6 = composer5;
                                                            ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(listItemColors5.headlineColor$material3_release(true, composer5, ((i18 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), ListTokens.INSTANCE.getListItemLabelTextFont(), function218, composer6, ((i18 << 6) & 896) | 48);
                                                            long jM3667unboximpl3 = listItemColors5.supportingColor$material3_release(composer6, (i18 >> 18) & 14).getValue().m3667unboximpl();
                                                            TypographyKeyTokens listItemSupportingTextFont = ListTokens.INSTANCE.getListItemSupportingTextFont();
                                                            Intrinsics.checkNotNull(function219);
                                                            ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(jM3667unboximpl3, listItemSupportingTextFont, function219, composer6, 48);
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endNode();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endNode();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            Function2<Composer, Integer, Unit> function220 = function214;
                                                            if (function220 != null) {
                                                                ListItemKt.m2348trailingContentiJQMabo(function220, listItemColors4.trailingIconColor$material3_release(true, composer6, ((i15 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), false, composer6, ((i15 >> 15) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT).invoke(ListItem, composer6, Integer.valueOf(i17 & 14));
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                };
                                                listItemColors2 = listItemColors4;
                                                function29 = function214;
                                                int i16 = i3 >> 9;
                                                composer3 = composer2;
                                                m2341ListItemxOgov6c(modifier2, null, jM3667unboximpl, jM3667unboximpl2, f4, fM2339getElevationD9Ej5fM, f7, paddingValuesM1014PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composer2, 48069791, true, function3), composer3, 114819072 | ((i3 >> 3) & 14) | (i16 & 57344) | (i16 & 458752), 2);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                listItemColors2 = listItemColors4;
                                                function29 = function214;
                                                if (function26 == null) {
                                                    composer2.startReplaceableGroup(-85611073);
                                                    ComposerKt.sourceInformation(composer2, "167@7018L16,168@7076L29,165@6939L1653");
                                                    final int i17 = i3;
                                                    final Function2<? super Composer, ? super Integer, Unit> function217 = function28;
                                                    final Function2<? super Composer, ? super Integer, Unit> function218 = function25;
                                                    int i18 = i3 >> 9;
                                                    composer3 = composer2;
                                                    m2341ListItemxOgov6c(modifier2, null, listItemColors2.containerColor$material3_release(composer2, (i3 >> 18) & 14).getValue().m3667unboximpl(), listItemColors2.headlineColor$material3_release(true, composer2, ((i3 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), f4, fM2339getElevationD9Ej5fM, TwoLineListItemContainerHeight, PaddingKt.m1014PaddingValuesYgX7TsA(ListItemHorizontalPadding, ListItemVerticalPadding), ComposableLambdaKt.composableLambda(composer2, 1733969726, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                                            invoke(rowScope, composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(RowScope ListItem, Composer composer4, int i19) {
                                                            int i20;
                                                            Composer composer5;
                                                            Intrinsics.checkNotNullParameter(ListItem, "$this$ListItem");
                                                            ComposerKt.sourceInformation(composer4, "C181@7659L638,202@8471L33,200@8357L209,200@8357L211:ListItem.kt#uh7d8r");
                                                            if ((i19 & 14) == 0) {
                                                                i20 = i19 | (composer4.changed(ListItem) ? 4 : 2);
                                                            } else {
                                                                i20 = i19;
                                                            }
                                                            if ((i20 & 91) != 18 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1733969726, i20, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:173)");
                                                                }
                                                                composer4.startReplaceableGroup(1316675520);
                                                                ComposerKt.sourceInformation(composer4, "177@7536L32,175@7425L205,175@7425L207");
                                                                Function2<Composer, Integer, Unit> function219 = function217;
                                                                if (function219 != null) {
                                                                    composer5 = composer4;
                                                                    ListItemKt.m2347leadingContentiJQMabo(function219, listItemColors2.leadingIconColor$material3_release(true, composer4, ((i17 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), false, composer4, ((i17 >> 12) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT).invoke(ListItem, composer5, Integer.valueOf(i20 & 14));
                                                                } else {
                                                                    composer5 = composer4;
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                Modifier modifierAlign = ListItem.align(RowScope.weight$default(ListItem, Modifier.INSTANCE, 1.0f, false, 2, null), Alignment.INSTANCE.getCenterVertically());
                                                                ListItemColors listItemColors5 = listItemColors2;
                                                                int i21 = i17;
                                                                Function2<Composer, Integer, Unit> function220 = function218;
                                                                Function2<Composer, Integer, Unit> function221 = headlineText;
                                                                composer5.startReplaceableGroup(733328855);
                                                                ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume = composer5.consume(localDensity);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                Density density = (Density) objConsume;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume2 = composer5.consume(localLayoutDirection);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume3 = composer5.consume(localViewConfiguration);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlign);
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                composer5.disableReusing();
                                                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer5.enableReusing();
                                                                function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                composer5.startReplaceableGroup(-2137368960);
                                                                ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                composer5.startReplaceableGroup(-1917170824);
                                                                ComposerKt.sourceInformation(composer5, "C186@7808L475:ListItem.kt#uh7d8r");
                                                                composer5.startReplaceableGroup(-483455358);
                                                                ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume4 = composer5.consume(localDensity2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                Density density2 = (Density) objConsume4;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume5 = composer5.consume(localLayoutDirection2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume6 = composer5.consume(localViewConfiguration2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor2);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                composer5.disableReusing();
                                                                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer5);
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer5.enableReusing();
                                                                function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                composer5.startReplaceableGroup(-1163856341);
                                                                ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                                composer5.startReplaceableGroup(562295746);
                                                                ComposerKt.sourceInformation(composer5, "C188@7895L15,187@7837L196,193@8112L29,192@8054L211:ListItem.kt#uh7d8r");
                                                                Composer composer6 = composer5;
                                                                ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(listItemColors5.overlineColor$material3_release(composer5, (i21 >> 18) & 14).getValue().m3667unboximpl(), ListTokens.INSTANCE.getListItemOverlineFont(), function220, composer6, (i21 & 896) | 48);
                                                                ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(listItemColors5.headlineColor$material3_release(true, composer6, ((i21 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), ListTokens.INSTANCE.getListItemLabelTextFont(), function221, composer6, ((i21 << 6) & 896) | 48);
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endNode();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endNode();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                Function2<Composer, Integer, Unit> function222 = function29;
                                                                if (function222 != null) {
                                                                    ListItemKt.m2348trailingContentiJQMabo(function222, listItemColors2.trailingIconColor$material3_release(true, composer6, ((i17 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), false, composer6, ((i17 >> 15) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT).invoke(ListItem, composer6, Integer.valueOf(i20 & 14));
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 114819072 | ((i3 >> 3) & 14) | (i18 & 57344) | (i18 & 458752), 2);
                                                    composer3.endReplaceableGroup();
                                                } else {
                                                    composer2.startReplaceableGroup(-85609368);
                                                    ComposerKt.sourceInformation(composer2, "211@8725L16,212@8783L29,209@8646L1935");
                                                    final int i19 = i3;
                                                    final Function2<? super Composer, ? super Integer, Unit> function219 = function28;
                                                    final Function2<? super Composer, ? super Integer, Unit> function220 = function25;
                                                    final Function2<? super Composer, ? super Integer, Unit> function221 = function26;
                                                    int i20 = i3 >> 9;
                                                    composer3 = composer2;
                                                    modifier3 = modifier2;
                                                    m2341ListItemxOgov6c(modifier3, null, listItemColors2.containerColor$material3_release(composer2, (i3 >> 18) & 14).getValue().m3667unboximpl(), listItemColors2.headlineColor$material3_release(true, composer2, ((i3 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), f4, fM2339getElevationD9Ej5fM, ThreeLineListItemContainerHeight, PaddingKt.m1014PaddingValuesYgX7TsA(ListItemHorizontalPadding, ListItemThreeLineVerticalPadding), ComposableLambdaKt.composableLambda(composer2, -1269203265, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$4
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                                            invoke(rowScope, composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(RowScope ListItem, Composer composer4, int i21) {
                                                            int i22;
                                                            Composer composer5;
                                                            Intrinsics.checkNotNullParameter(ListItem, "$this$ListItem");
                                                            ComposerKt.sourceInformation(composer4, "C228@9422L865,254@10461L33,252@10347L208,252@10347L210:ListItem.kt#uh7d8r");
                                                            if ((i21 & 14) == 0) {
                                                                i22 = i21 | (composer4.changed(ListItem) ? 4 : 2);
                                                            } else {
                                                                i22 = i21;
                                                            }
                                                            if ((i22 & 91) != 18 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1269203265, i22, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:220)");
                                                                }
                                                                composer4.startReplaceableGroup(1316677284);
                                                                ComposerKt.sourceInformation(composer4, "224@9300L32,222@9189L204,222@9189L206");
                                                                Function2<Composer, Integer, Unit> function222 = function219;
                                                                if (function222 != null) {
                                                                    composer5 = composer4;
                                                                    ListItemKt.m2347leadingContentiJQMabo(function222, listItemColors2.leadingIconColor$material3_release(true, composer4, ((i19 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), true, composer4, ((i19 >> 12) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT).invoke(ListItem, composer5, Integer.valueOf(i22 & 14));
                                                                } else {
                                                                    composer5 = composer4;
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(RowScope.weight$default(ListItem, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 0.0f, ListItemKt.ContentEndPadding, 0.0f, 11, null);
                                                                ListItemColors listItemColors5 = listItemColors2;
                                                                int i23 = i19;
                                                                Function2<Composer, Integer, Unit> function223 = function220;
                                                                Function2<Composer, Integer, Unit> function224 = headlineText;
                                                                Function2<Composer, Integer, Unit> function225 = function221;
                                                                composer5.startReplaceableGroup(733328855);
                                                                ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume = composer5.consume(localDensity);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                Density density = (Density) objConsume;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume2 = composer5.consume(localLayoutDirection);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume3 = composer5.consume(localViewConfiguration);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM1024paddingqDBjuR0$default);
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                composer5.disableReusing();
                                                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer5.enableReusing();
                                                                function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                composer5.startReplaceableGroup(-2137368960);
                                                                ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                composer5.startReplaceableGroup(-729239559);
                                                                ComposerKt.sourceInformation(composer5, "C233@9571L702:ListItem.kt#uh7d8r");
                                                                composer5.startReplaceableGroup(-483455358);
                                                                ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume4 = composer5.consume(localDensity2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                Density density2 = (Density) objConsume4;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume5 = composer5.consume(localLayoutDirection2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume6 = composer5.consume(localViewConfiguration2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor2);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                composer5.disableReusing();
                                                                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer5);
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer5.enableReusing();
                                                                function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                composer5.startReplaceableGroup(-1163856341);
                                                                ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                                composer5.startReplaceableGroup(-466219709);
                                                                ComposerKt.sourceInformation(composer5, "C235@9658L15,234@9600L196,240@9875L29,239@9817L211,245@10107L17,244@10049L206:ListItem.kt#uh7d8r");
                                                                int i24 = (i23 >> 18) & 14;
                                                                Composer composer6 = composer5;
                                                                ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(listItemColors5.overlineColor$material3_release(composer5, i24).getValue().m3667unboximpl(), ListTokens.INSTANCE.getListItemOverlineFont(), function223, composer6, (i23 & 896) | 48);
                                                                ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(listItemColors5.headlineColor$material3_release(true, composer6, ((i23 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), ListTokens.INSTANCE.getListItemLabelTextFont(), function224, composer6, ((i23 << 6) & 896) | 48);
                                                                ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(listItemColors5.supportingColor$material3_release(composer6, i24).getValue().m3667unboximpl(), ListTokens.INSTANCE.getListItemSupportingTextFont(), function225, composer6, ((i23 >> 3) & 896) | 48);
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endNode();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endNode();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                Function2<Composer, Integer, Unit> function226 = function29;
                                                                if (function226 != null) {
                                                                    ListItemKt.m2348trailingContentiJQMabo(function226, listItemColors2.trailingIconColor$material3_release(true, composer6, ((i19 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), true, composer6, ((i19 >> 15) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT).invoke(ListItem, composer6, Integer.valueOf(i22 & 14));
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 114819072 | ((i3 >> 3) & 14) | (i20 & 57344) | (i20 & 458752), 2);
                                                    composer3.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    function210 = function28;
                                                    function211 = function25;
                                                    listItemColors3 = listItemColors2;
                                                    function212 = function26;
                                                    modifier4 = modifier3;
                                                    f5 = f4;
                                                    f6 = fM2339getElevationD9Ej5fM;
                                                }
                                            }
                                        } else {
                                            composer2.startReplaceableGroup(-85614273);
                                            ComposerKt.sourceInformation(composer2, "86@3818L16,87@3876L29,84@3739L1377");
                                            final ListItemColors listItemColors5 = listItemColorsM2338colorsJ08w3E;
                                            final int i21 = i3;
                                            final Function2<? super Composer, ? super Integer, Unit> function222 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function223 = function27;
                                            int i22 = i3 >> 9;
                                            composer3 = composer2;
                                            m2341ListItemxOgov6c(modifier2, null, listItemColorsM2338colorsJ08w3E.containerColor$material3_release(composer2, (i3 >> 18) & 14).getValue().m3667unboximpl(), listItemColorsM2338colorsJ08w3E.headlineColor$material3_release(true, composer2, ((i3 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), f4, fM2339getElevationD9Ej5fM, ListTokens.INSTANCE.m2856getListItemContainerHeightD9Ej5fM(), PaddingKt.m1014PaddingValuesYgX7TsA(ListItemHorizontalPadding, ListItemVerticalPadding), ComposableLambdaKt.composableLambda(composer2, 967218806, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                                    invoke(rowScope, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(RowScope ListItem, Composer composer4, int i23) {
                                                    Composer composer5;
                                                    Intrinsics.checkNotNullParameter(ListItem, "$this$ListItem");
                                                    ComposerKt.sourceInformation(composer4, "C100@4463L358,114@4995L33,112@4881L209,112@4881L211:ListItem.kt#uh7d8r");
                                                    if ((i23 & 14) == 0) {
                                                        i23 |= composer4.changed(ListItem) ? 4 : 2;
                                                    }
                                                    if ((i23 & 91) != 18 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(967218806, i23, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:92)");
                                                        }
                                                        composer4.startReplaceableGroup(1316672324);
                                                        ComposerKt.sourceInformation(composer4, "96@4340L32,94@4229L205,94@4229L207");
                                                        Function2<Composer, Integer, Unit> function224 = function222;
                                                        if (function224 != null) {
                                                            composer5 = composer4;
                                                            ListItemKt.m2347leadingContentiJQMabo(function224, listItemColors5.leadingIconColor$material3_release(true, composer4, ((i21 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), false, composer5, ((i21 >> 12) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT).invoke(ListItem, composer5, Integer.valueOf(i23 & 14));
                                                        } else {
                                                            composer5 = composer4;
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        Modifier modifierAlign = ListItem.align(RowScope.weight$default(ListItem, Modifier.INSTANCE, 1.0f, false, 2, null), Alignment.INSTANCE.getCenterVertically());
                                                        ListItemColors listItemColors6 = listItemColors5;
                                                        int i24 = i21;
                                                        Function2<Composer, Integer, Unit> function225 = headlineText;
                                                        composer5.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object objConsume = composer5.consume(localDensity);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        Density density = (Density) objConsume;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object objConsume2 = composer5.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object objConsume3 = composer5.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlign);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        composer5.disableReusing();
                                                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer5.startReplaceableGroup(181297456);
                                                        ComposerKt.sourceInformation(composer5, "C106@4666L29,105@4612L195:ListItem.kt#uh7d8r");
                                                        ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(listItemColors6.headlineColor$material3_release(true, composer5, ((i24 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), ListTokens.INSTANCE.getListItemLabelTextFont(), function225, composer5, ((i24 << 6) & 896) | 48);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        Function2<Composer, Integer, Unit> function226 = function223;
                                                        if (function226 != null) {
                                                            ListItemKt.m2348trailingContentiJQMabo(function226, listItemColors5.trailingIconColor$material3_release(true, composer5, ((i21 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6).getValue().m3667unboximpl(), false, composer5, ((i21 >> 15) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT).invoke(ListItem, composer5, Integer.valueOf(i23 & 14));
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 114819072 | ((i3 >> 3) & 14) | (i22 & 57344) | (i22 & 458752), 2);
                                            composer3.endReplaceableGroup();
                                            listItemColors2 = listItemColors5;
                                            function29 = function223;
                                        }
                                        modifier3 = modifier2;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function210 = function28;
                                        function211 = function25;
                                        listItemColors3 = listItemColors2;
                                        function212 = function26;
                                        modifier4 = modifier3;
                                        f5 = f4;
                                        f6 = fM2339getElevationD9Ej5fM;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        f5 = f;
                                        composer3 = composerStartRestartGroup;
                                        modifier4 = modifier2;
                                        function211 = function25;
                                        function212 = function26;
                                        f6 = f3;
                                        function29 = function27;
                                        function210 = function23;
                                        listItemColors3 = listItemColors;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                        return;
                                    }
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i23) {
                                            ListItemKt.m2340ListItemHXNGIdc(headlineText, modifier4, function211, function212, function210, function29, listItemColors3, f5, f6, composer4, i | 1, i2);
                                        }
                                    });
                                    return;
                                }
                                i3 |= 100663296;
                                i11 = i10;
                                f3 = f2;
                                if ((i3 & 191739611) == 38347922) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0) {
                                        if (i14 != 0) {
                                        }
                                        if (i4 != 0) {
                                        }
                                        if (i5 != 0) {
                                        }
                                        if (i6 == 0) {
                                        }
                                        if (i7 == 0) {
                                        }
                                        if ((i2 & 64) == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        composer2.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (function25 == null) {
                                            final ListItemColors listItemColors42 = listItemColorsM2338colorsJ08w3E;
                                            final Function2<? super Composer, ? super Integer, Unit> function2142 = function27;
                                            if (function25 != null) {
                                            }
                                            modifier3 = modifier2;
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function210 = function28;
                                            function211 = function25;
                                            listItemColors3 = listItemColors2;
                                            function212 = function26;
                                            modifier4 = modifier3;
                                            f5 = f4;
                                            f6 = fM2339getElevationD9Ej5fM;
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i9 = i8;
                            i10 = i2 & 256;
                            if (i10 == 0) {
                            }
                            i11 = i10;
                            f3 = f2;
                            if ((i3 & 191739611) == 38347922) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        function27 = function24;
                        if ((i & 3670016) == 0) {
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 == 0) {
                        }
                        i11 = i10;
                        f3 = f2;
                        if ((i3 & 191739611) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function27 = function24;
                    if ((i & 3670016) == 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    f3 = f2;
                    if ((i3 & 191739611) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function26 = function22;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function27 = function24;
                if ((i & 3670016) == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                f3 = f2;
                if ((i3 & 191739611) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function25 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function26 = function22;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function27 = function24;
            if ((i & 3670016) == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            f3 = f2;
            if ((i3 & 191739611) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function25 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function26 = function22;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function27 = function24;
        if ((i & 3670016) == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        f3 = f2;
        if ((i3 & 191739611) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0211 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    @ExperimentalMaterial3Api
    /* renamed from: ListItem-xOgov6c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2341ListItemxOgov6c(Modifier modifier, Shape shape, long j, long j2, float f, float f2, final float f3, final PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        final int i3;
        Shape shape2;
        long containerColor;
        long contentColor;
        float f4;
        int i4;
        float fM2339getElevationD9Ej5fM;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape3;
        final long j3;
        final long j4;
        final float f5;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(1069030861);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ListItem)P(4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.unit.Dp,6:c#ui.unit.Dp,3:c#ui.unit.Dp,5)282@11449L5,283@11501L14,284@11560L12,291@11788L388:ListItem.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                int i9 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            i3 |= i9;
        } else {
            shape2 = shape;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                containerColor = j;
                int i10 = composerStartRestartGroup.changed(containerColor) ? 256 : 128;
                i3 |= i10;
            } else {
                containerColor = j;
            }
            i3 |= i10;
        } else {
            containerColor = j;
        }
        if ((i & 7168) == 0) {
            contentColor = j2;
            i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(contentColor)) ? 2048 : 1024;
        } else {
            contentColor = j2;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        int i12 = i2 & 32;
        if (i12 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if ((i2 & 64) == 0) {
            i7 = (i & 3670016) == 0 ? composerStartRestartGroup.changed(f3) ? 1048576 : 524288 : 1572864;
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
            }
            if ((i2 & 256) != 0) {
                i6 = (234881024 & i) == 0 ? composerStartRestartGroup.changed(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                if ((191739611 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            shape2 = ListItemDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        }
                        if ((i2 & 4) != 0) {
                            containerColor = ListItemDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            contentColor = ListItemDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        float fM2339getElevationD9Ej5fM2 = i11 == 0 ? ListItemDefaults.INSTANCE.m2339getElevationD9Ej5fM() : f;
                        if (i12 == 0) {
                            f4 = fM2339getElevationD9Ej5fM2;
                            i4 = 12582912;
                            fM2339getElevationD9Ej5fM = ListItemDefaults.INSTANCE.m2339getElevationD9Ej5fM();
                        } else {
                            f4 = fM2339getElevationD9Ej5fM2;
                            i4 = 12582912;
                            fM2339getElevationD9Ej5fM = f2;
                        }
                        i5 = 458752;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        fM2339getElevationD9Ej5fM = f2;
                        i5 = 458752;
                        i4 = 12582912;
                        f4 = f;
                    }
                    long j5 = contentColor;
                    Modifier modifier4 = modifier2;
                    Shape shape4 = shape2;
                    long j6 = containerColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1069030861, i3, -1, "androidx.compose.material3.ListItem (ListItem.kt:280)");
                    }
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m2457SurfaceT9BRK9s(modifier4, shape4, j6, j5, f4, fM2339getElevationD9Ej5fM, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1393735016, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$6
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

                        public final void invoke(Composer composer3, int i13) {
                            ComposerKt.sourceInformation(composer3, "C299@12018L152:ListItem.kt#uh7d8r");
                            if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1393735016, i13, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:298)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.m1053heightInVpY3zN4$default(Modifier.INSTANCE, f3, 0.0f, 2, null), paddingValues);
                                Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                int i14 = (i3 >> 15) & 7168;
                                composer3.startReplaceableGroup(693286680);
                                ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) objConsume;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume2 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume3 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-678309503);
                                ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                function32.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i14 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, i4 | (i3 & 14) | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i5 & i3), 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    shape3 = shape4;
                    j3 = j6;
                    j4 = j5;
                    f5 = f4;
                    f6 = fM2339getElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f6 = f2;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j3 = containerColor;
                    j4 = contentColor;
                    f5 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$7
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

                    public final void invoke(Composer composer3, int i13) {
                        ListItemKt.m2341ListItemxOgov6c(modifier3, shape3, j3, j4, f5, f6, f3, paddingValues, function3, composer3, i | 1, i2);
                    }
                });
                return;
            }
            i3 |= i6;
            if ((191739611 & i3) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    i5 = 458752;
                    long j52 = contentColor;
                    Modifier modifier42 = modifier2;
                    Shape shape42 = shape2;
                    long j62 = containerColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m2457SurfaceT9BRK9s(modifier42, shape42, j62, j52, f4, fM2339getElevationD9Ej5fM, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1393735016, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$6
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

                        public final void invoke(Composer composer3, int i13) {
                            ComposerKt.sourceInformation(composer3, "C299@12018L152:ListItem.kt#uh7d8r");
                            if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1393735016, i13, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:298)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.m1053heightInVpY3zN4$default(Modifier.INSTANCE, f3, 0.0f, 2, null), paddingValues);
                                Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                int i14 = (i3 >> 15) & 7168;
                                composer3.startReplaceableGroup(693286680);
                                ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) objConsume;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume2 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume3 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-678309503);
                                ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                function32.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i14 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, i4 | (i3 & 14) | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i5 & i3), 64);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    shape3 = shape42;
                    j3 = j62;
                    j4 = j52;
                    f5 = f4;
                    f6 = fM2339getElevationD9Ej5fM;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i3 |= i7;
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i6;
        if ((191739611 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: leadingContent-iJQMabo, reason: not valid java name */
    public static final Function3<RowScope, Composer, Integer, Unit> m2347leadingContentiJQMabo(final Function2<? super Composer, ? super Integer, Unit> function2, final long j, final boolean z, Composer composer, final int i) {
        composer.startReplaceableGroup(292744125);
        ComposerKt.sourceInformation(composer, "C(leadingContent)P(1,0:c#ui.graphics.Color):ListItem.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(292744125, i, -1, "androidx.compose.material3.leadingContent (ListItem.kt:309)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1755598478, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$leadingContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final RowScope rowScope, Composer composer2, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(rowScope, "$this$null");
                ComposerKt.sourceInformation(composer2, "C315@12372L554:ListItem.kt#uh7d8r");
                if ((i2 & 14) == 0) {
                    i3 = (composer2.changed(rowScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i3 & 91) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1755598478, i2, -1, "androidx.compose.material3.leadingContent.<anonymous> (ListItem.kt:314)");
                    }
                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j))};
                    final boolean z2 = z;
                    final Function2<Composer, Integer, Unit> function22 = function2;
                    final int i4 = i;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1636714958, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$leadingContent$1.1
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

                        public final void invoke(Composer composer3, int i5) {
                            ComposerKt.sourceInformation(composer3, "C:ListItem.kt#uh7d8r");
                            if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1636714958, i5, -1, "androidx.compose.material3.leadingContent.<anonymous>.<anonymous> (ListItem.kt:316)");
                                }
                                if (z2) {
                                    composer3.startReplaceableGroup(377880875);
                                    ComposerKt.sourceInformation(composer3, "318@12497L171");
                                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ListItemKt.LeadingContentEndPadding, 0.0f, 11, null);
                                    Alignment topStart = Alignment.INSTANCE.getTopStart();
                                    Function2<Composer, Integer, Unit> function23 = function22;
                                    int i6 = i4;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) objConsume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume3 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM1024paddingqDBjuR0$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(781903379);
                                    ComposerKt.sourceInformation(composer3, "C321@12650L16:ListItem.kt#uh7d8r");
                                    function23.invoke(composer3, Integer.valueOf(i6 & 14));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(377881084);
                                    ComposerKt.sourceInformation(composer3, "323@12706L196");
                                    Modifier modifierM1024paddingqDBjuR0$default2 = PaddingKt.m1024paddingqDBjuR0$default(rowScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), 0.0f, 0.0f, ListItemKt.LeadingContentEndPadding, 0.0f, 11, null);
                                    Function2<Composer, Integer, Unit> function24 = function22;
                                    int i7 = i4;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume4 = composer3.consume(localDensity2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density2 = (Density) objConsume4;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume5 = composer3.consume(localLayoutDirection2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume6 = composer3.consume(localViewConfiguration2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM1024paddingqDBjuR0$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer3);
                                    Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(-1395522852);
                                    ComposerKt.sourceInformation(composer3, "C327@12884L16:ListItem.kt#uh7d8r");
                                    function24.invoke(composer3, Integer.valueOf(i7 & 14));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: trailingContent-iJQMabo, reason: not valid java name */
    public static final Function3<RowScope, Composer, Integer, Unit> m2348trailingContentiJQMabo(final Function2<? super Composer, ? super Integer, Unit> function2, final long j, final boolean z, Composer composer, final int i) {
        composer.startReplaceableGroup(2067138571);
        ComposerKt.sourceInformation(composer, "C(trailingContent)P(2,0:c#ui.graphics.Color):ListItem.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2067138571, i, -1, "androidx.compose.material3.trailingContent (ListItem.kt:334)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1301939978, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$trailingContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope rowScope, Composer composer2, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(rowScope, "$this$null");
                ComposerKt.sourceInformation(composer2, "C:ListItem.kt#uh7d8r");
                if ((i2 & 14) == 0) {
                    i3 = (composer2.changed(rowScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i3 & 91) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1301939978, i2, -1, "androidx.compose.material3.trailingContent.<anonymous> (ListItem.kt:339)");
                    }
                    if (z) {
                        composer2.startReplaceableGroup(1857837855);
                        ComposerKt.sourceInformation(composer2, "341@13158L348");
                        Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, ListItemKt.TrailingHorizontalPadding, 0.0f, 2, null);
                        Alignment topStart = Alignment.INSTANCE.getTopStart();
                        long j2 = j;
                        Function2<Composer, Integer, Unit> function22 = function2;
                        int i4 = i;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object objConsume = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) objConsume;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object objConsume3 = composer2.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM1022paddingVpY3zN4$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
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
                        function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1890987531);
                        ComposerKt.sourceInformation(composer2, "C345@13323L181:ListItem.kt#uh7d8r");
                        ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(j2, ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), function22, composer2, ((i4 >> 3) & 14) | 48 | ((i4 << 6) & 896));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1857838233);
                        ComposerKt.sourceInformation(composer2, "351@13536L369");
                        Modifier modifierM1022paddingVpY3zN4$default2 = PaddingKt.m1022paddingVpY3zN4$default(rowScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), ListItemKt.TrailingHorizontalPadding, 0.0f, 2, null);
                        long j3 = j;
                        Function2<Composer, Integer, Unit> function23 = function2;
                        int i5 = i;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object objConsume4 = composer2.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density2 = (Density) objConsume4;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object objConsume5 = composer2.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object objConsume6 = composer2.consume(localViewConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM1022paddingVpY3zN4$default2);
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
                        Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-471095028);
                        ComposerKt.sourceInformation(composer2, "C356@13722L181:ListItem.kt#uh7d8r");
                        ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(j3, ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), function23, composer2, ((i5 >> 3) & 14) | 48 | ((i5 << 6) & 896));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m2342ProvideTextStyleFromToken3JVO9M(final long j, final TypographyKeyTokens typographyKeyTokens, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        final int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1133967795);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProvideTextStyleFromToken)P(0:c#ui.graphics.Color,2)494@19374L10,495@19410L111:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i2 |= composerStartRestartGroup.changed(typographyKeyTokens) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:489)");
            }
            final TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), typographyKeyTokens);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -514310925, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposerKt.sourceInformation(composer2, "C496@19479L36:ListItem.kt#uh7d8r");
                    if ((i3 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-514310925, i3, -1, "androidx.compose.material3.ProvideTextStyleFromToken.<anonymous> (ListItem.kt:495)");
                    }
                    TextKt.ProvideTextStyle(textStyleFromToken, function2, composer2, (i2 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                ListItemKt.m2342ProvideTextStyleFromToken3JVO9M(j, typographyKeyTokens, function2, composer2, i | 1);
            }
        });
    }

    static {
        float f = 8;
        ListItemVerticalPadding = Dp.m6117constructorimpl(f);
        float f2 = 16;
        ListItemThreeLineVerticalPadding = Dp.m6117constructorimpl(f2);
        ListItemHorizontalPadding = Dp.m6117constructorimpl(f2);
        LeadingContentEndPadding = Dp.m6117constructorimpl(f2);
        ContentEndPadding = Dp.m6117constructorimpl(f);
        TrailingHorizontalPadding = Dp.m6117constructorimpl(f);
    }
}
