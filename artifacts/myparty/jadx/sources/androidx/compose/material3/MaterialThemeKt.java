package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.facebook.common.util.UriUtil;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaterialTheme.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"DefaultRippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "TextSelectionBackgroundOpacity", "", "MaterialTheme", "", "colorScheme", "Landroidx/compose/material3/ColorScheme;", PaymentSheetAppearanceKeys.SHAPES, "Landroidx/compose/material3/Shapes;", "typography", "Landroidx/compose/material3/Typography;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialThemeKt {
    private static final RippleAlpha DefaultRippleAlpha = new RippleAlpha(0.16f, 0.12f, 0.08f, 0.12f);
    public static final float TextSelectionBackgroundOpacity = 0.4f;

    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(ColorScheme colorScheme, Shapes shapes, Typography typography, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final ColorScheme colorScheme2;
        int i3;
        Shapes shapes2;
        Typography typography2;
        Object objRememberedValue;
        final Typography typography3;
        final Shapes shapes3;
        int i4;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2127166334);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MaterialTheme)P(!1,2,3)58@2824L11,59@2872L6,60@2923L10,*63@3007L194,70@3286L16,71@3329L50,72@3384L417:MaterialTheme.kt#uh7d8r");
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                colorScheme2 = colorScheme;
                if (composerStartRestartGroup.changed(colorScheme2)) {
                    i4 = 4;
                }
                i3 = i4 | i;
            } else {
                colorScheme2 = colorScheme;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            colorScheme2 = colorScheme;
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            if ((i2 & 2) == 0) {
                shapes2 = shapes;
                int i5 = composerStartRestartGroup.changed(shapes2) ? 32 : 16;
                i3 |= i5;
            } else {
                shapes2 = shapes;
            }
            i3 |= i5;
        } else {
            shapes2 = shapes;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                typography2 = typography;
                int i6 = composerStartRestartGroup.changed(typography2) ? 256 : 128;
                i3 |= i6;
            } else {
                typography2 = typography;
            }
            i3 |= i6;
        } else {
            typography2 = typography;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(content) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                ColorScheme colorScheme3 = colorScheme2;
                Shapes shapes4 = shapes2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                ColorScheme colorScheme4 = (ColorScheme) objRememberedValue;
                ColorSchemeKt.updateColorSchemeFrom(colorScheme4, colorScheme3);
                final int i7 = i3;
                final Typography typography4 = typography2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ColorSchemeKt.getLocalColorScheme().provides(colorScheme4), IndicationKt.getLocalIndication().provides(RippleKt.m2107rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), RippleThemeKt.getLocalRippleTheme().provides(MaterialRippleTheme.INSTANCE), ShapesKt.getLocalShapes().provides(shapes4), TextSelectionColorsKt.getLocalTextSelectionColors().provides(rememberTextSelectionColors(colorScheme4, composerStartRestartGroup, 0)), TypographyKt.getLocalTypography().provides(typography4)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1066563262, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt.MaterialTheme.1
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

                    public final void invoke(Composer composer2, int i8) {
                        ComposerKt.sourceInformation(composer2, "C80@3730L65:MaterialTheme.kt#uh7d8r");
                        if ((i8 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1066563262, i8, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:79)");
                        }
                        TextKt.ProvideTextStyle(typography4.getBodyLarge(), content, composer2, (i7 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                }
                typography3 = typography4;
                shapes3 = shapes4;
                colorScheme2 = colorScheme3;
            } else {
                if ((i2 & 1) != 0) {
                    colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                ColorScheme colorScheme32 = colorScheme2;
                Shapes shapes42 = shapes2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2127166334, i3, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:57)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = colorScheme32.m2169copyG1PFcw((536870911 & 1) != 0 ? colorScheme32.m2189getPrimary0d7_KjU() : 0L, (536870911 & 2) != 0 ? colorScheme32.m2179getOnPrimary0d7_KjU() : 0L, (536870911 & 4) != 0 ? colorScheme32.m2190getPrimaryContainer0d7_KjU() : 0L, (536870911 & 8) != 0 ? colorScheme32.m2180getOnPrimaryContainer0d7_KjU() : 0L, (536870911 & 16) != 0 ? colorScheme32.m2174getInversePrimary0d7_KjU() : 0L, (536870911 & 32) != 0 ? colorScheme32.m2192getSecondary0d7_KjU() : 0L, (536870911 & 64) != 0 ? colorScheme32.m2181getOnSecondary0d7_KjU() : 0L, (536870911 & 128) != 0 ? colorScheme32.m2193getSecondaryContainer0d7_KjU() : 0L, (536870911 & 256) != 0 ? colorScheme32.m2182getOnSecondaryContainer0d7_KjU() : 0L, (536870911 & 512) != 0 ? colorScheme32.m2197getTertiary0d7_KjU() : 0L, (536870911 & 1024) != 0 ? colorScheme32.m2185getOnTertiary0d7_KjU() : 0L, (536870911 & 2048) != 0 ? colorScheme32.m2198getTertiaryContainer0d7_KjU() : 0L, (536870911 & 4096) != 0 ? colorScheme32.m2186getOnTertiaryContainer0d7_KjU() : 0L, (536870911 & 8192) != 0 ? colorScheme32.m2170getBackground0d7_KjU() : 0L, (536870911 & 16384) != 0 ? colorScheme32.m2176getOnBackground0d7_KjU() : 0L, (536870911 & 32768) != 0 ? colorScheme32.m2194getSurface0d7_KjU() : 0L, (536870911 & 65536) != 0 ? colorScheme32.m2183getOnSurface0d7_KjU() : 0L, (536870911 & 131072) != 0 ? colorScheme32.m2196getSurfaceVariant0d7_KjU() : 0L, (536870911 & 262144) != 0 ? colorScheme32.m2184getOnSurfaceVariant0d7_KjU() : 0L, (536870911 & 524288) != 0 ? colorScheme32.m2195getSurfaceTint0d7_KjU() : 0L, (536870911 & 1048576) != 0 ? colorScheme32.m2175getInverseSurface0d7_KjU() : 0L, (536870911 & 2097152) != 0 ? colorScheme32.m2173getInverseOnSurface0d7_KjU() : 0L, (536870911 & 4194304) != 0 ? colorScheme32.m2171getError0d7_KjU() : 0L, (536870911 & 8388608) != 0 ? colorScheme32.m2177getOnError0d7_KjU() : 0L, (536870911 & 16777216) != 0 ? colorScheme32.m2172getErrorContainer0d7_KjU() : 0L, (536870911 & 33554432) != 0 ? colorScheme32.m2178getOnErrorContainer0d7_KjU() : 0L, (536870911 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? colorScheme32.m2187getOutline0d7_KjU() : 0L, (536870911 & 134217728) != 0 ? colorScheme32.m2188getOutlineVariant0d7_KjU() : 0L, (536870911 & 268435456) != 0 ? colorScheme32.m2191getScrim0d7_KjU() : 0L);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ColorScheme colorScheme42 = (ColorScheme) objRememberedValue;
                ColorSchemeKt.updateColorSchemeFrom(colorScheme42, colorScheme32);
                final int i72 = i3;
                final Typography typography42 = typography2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ColorSchemeKt.getLocalColorScheme().provides(colorScheme42), IndicationKt.getLocalIndication().provides(RippleKt.m2107rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), RippleThemeKt.getLocalRippleTheme().provides(MaterialRippleTheme.INSTANCE), ShapesKt.getLocalShapes().provides(shapes42), TextSelectionColorsKt.getLocalTextSelectionColors().provides(rememberTextSelectionColors(colorScheme42, composerStartRestartGroup, 0)), TypographyKt.getLocalTypography().provides(typography42)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1066563262, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt.MaterialTheme.1
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

                    public final void invoke(Composer composer2, int i8) {
                        ComposerKt.sourceInformation(composer2, "C80@3730L65:MaterialTheme.kt#uh7d8r");
                        if ((i8 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1066563262, i8, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:79)");
                        }
                        TextKt.ProvideTextStyle(typography42.getBodyLarge(), content, composer2, (i72 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                typography3 = typography42;
                shapes3 = shapes42;
                colorScheme2 = colorScheme32;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            shapes3 = shapes2;
            typography3 = typography2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt.MaterialTheme.2
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

            public final void invoke(Composer composer2, int i8) {
                MaterialThemeKt.MaterialTheme(colorScheme2, shapes3, typography3, content, composer2, i | 1, i2);
            }
        });
    }

    public static final TextSelectionColors rememberTextSelectionColors(ColorScheme colorScheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        composer.startReplaceableGroup(1866455512);
        ComposerKt.sourceInformation(composer, "C(rememberTextSelectionColors)134@5274L198:MaterialTheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1866455512, i, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:132)");
        }
        long jM2189getPrimary0d7_KjU = colorScheme.m2189getPrimary0d7_KjU();
        Color colorM3647boximpl = Color.m3647boximpl(jM2189getPrimary0d7_KjU);
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composer.changed(colorM3647boximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            TextSelectionColors textSelectionColors = new TextSelectionColors(jM2189getPrimary0d7_KjU, Color.m3656copywmQWz5c$default(jM2189getPrimary0d7_KjU, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            composer.updateRememberedValue(textSelectionColors);
            objRememberedValue = textSelectionColors;
        }
        composer.endReplaceableGroup();
        TextSelectionColors textSelectionColors2 = (TextSelectionColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors2;
    }
}
