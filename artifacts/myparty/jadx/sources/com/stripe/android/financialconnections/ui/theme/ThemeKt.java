package com.stripe.android.financialconnections.ui.theme;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.Colors;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleDefaults;
import androidx.compose.material.RippleKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.facebook.common.util.UriUtil;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u001cH\u0082\u0010\u001a\u0016\u0010 \u001a\u00020!*\u00020!2\b\b\u0002\u0010\"\u001a\u00020#H\u0002\u001a\u0019\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\t\u001a\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Colors", "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;", "DarkThemeColors", "InstantDebitsColors", "InstantDebitsDarkModeColors", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "Typography", "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;", "TextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getTextSelectionColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "FinancialConnectionsRippleConfiguration", "Landroidx/compose/material/RippleConfiguration;", "getFinancialConnectionsRippleConfiguration", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/RippleConfiguration;", "FinancialConnectionsTheme", "", "theme", "Lcom/stripe/android/financialconnections/ui/theme/Theme;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/stripe/android/financialconnections/ui/theme/Theme;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "findWindow", "Landroid/view/Window;", "(Landroidx/compose/runtime/Composer;I)Landroid/view/Window;", "Landroid/content/Context;", "LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "toCompat", "Landroidx/compose/ui/text/TextStyle;", "useDefaultLineHeight", "", "debugColors", "Landroidx/compose/material/Colors;", "debugColor", "Landroidx/compose/ui/graphics/Color;", "debugColors-8_81llA", "(J)Landroidx/compose/material/Colors;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThemeKt {
    private static final FinancialConnectionsColors Colors = new FinancialConnectionsColors(ColorKt.getNeutral0(), ColorKt.getNeutral25(), ColorKt.getNeutral50(), ColorKt.getNeutral800(), ColorKt.getNeutral600(), ColorKt.getFeedbackCritical600(), ColorKt.getNeutral700(), ColorKt.getNeutral100(), ColorKt.getNeutral200(), ColorKt.getAttention50(), ColorKt.getAttention300(), ColorKt.getBrand500(), ColorKt.getNeutral0(), ColorKt.getBrand600(), ColorKt.getBrand600(), ColorKt.getBrand600(), ColorKt.getBrand500(), ColorKt.getBrand25(), ColorKt.getBrand500(), ColorKt.getBrand600(), null);
    private static final FinancialConnectionsColors DarkThemeColors = new FinancialConnectionsColors(ColorKt.getNeutral0Dark(), ColorKt.getNeutral25Dark(), ColorKt.getNeutral50Dark(), ColorKt.getNeutral25(), ColorKt.getNeutral800Dark(), ColorKt.getFeedbackCritical600(), ColorKt.getNeutral25(), ColorKt.getNeutral100Dark(), ColorKt.getNeutral200(), ColorKt.getAttention100Dark(), ColorKt.getAttention300(), ColorKt.getBrand500(), ColorKt.getNeutral0(), ColorKt.getBrand500(), ColorKt.getBrand600(), ColorKt.getNeutral0(), ColorKt.getBrand500(), ColorKt.getBrand25Dark(), ColorKt.getBrand500(), ColorKt.getBrand600(), null);
    private static final FinancialConnectionsColors InstantDebitsColors = new FinancialConnectionsColors(ColorKt.getNeutral0(), ColorKt.getNeutral25(), ColorKt.getNeutral50(), ColorKt.getNeutral800(), ColorKt.getNeutral600(), ColorKt.getFeedbackCritical600(), ColorKt.getNeutral700(), ColorKt.getNeutral100(), ColorKt.getNeutral200(), ColorKt.getAttention50(), ColorKt.getAttention300(), ColorKt.getLinkGreen200(), ColorKt.getLinkGreen900(), ColorKt.getLinkGreen500(), ColorKt.getLinkGreen200(), ColorKt.getLinkGreen900(), ColorKt.getLinkGreen500(), ColorKt.getLinkGreen50(), ColorKt.getLinkGreen200(), ColorKt.getLinkGreen200(), null);
    private static final FinancialConnectionsColors InstantDebitsDarkModeColors = new FinancialConnectionsColors(ColorKt.getNeutral0Dark(), ColorKt.getNeutral25Dark(), ColorKt.getNeutral50Dark(), ColorKt.getNeutral25(), ColorKt.getNeutral800Dark(), ColorKt.getFeedbackCritical600(), ColorKt.getNeutral25(), ColorKt.getNeutral100Dark(), ColorKt.getNeutral200(), ColorKt.getAttention100Dark(), ColorKt.getAttention300(), ColorKt.getLinkGreen200(), ColorKt.getLinkGreen900(), ColorKt.getLinkGreen200(), ColorKt.getBrand600(), ColorKt.getNeutral0(), ColorKt.getLinkGreen500(), ColorKt.getLinkGreen50Dark(), ColorKt.getLinkGreen200(), ColorKt.getLinkGreen200(), null);
    private static final ProvidableCompositionLocal<FinancialConnectionsColors> LocalColors;
    private static final ProvidableCompositionLocal<FinancialConnectionsTypography> LocalTypography;
    private static final FinancialConnectionsTypography Typography;
    private static final LineHeightStyle lineHeightStyle;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsTheme$lambda$0(Theme theme, Function2 function2, int i, int i2, Composer composer, int i3) {
        FinancialConnectionsTheme(theme, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static {
        LineHeightStyle lineHeightStyle2 = new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m5983getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m5998getNoneEVpEnUU(), null);
        lineHeightStyle = lineHeightStyle2;
        int i = 15597433;
        DefaultConstructorMarker defaultConstructorMarker = null;
        long j = 0;
        TextStyle compat$default = toCompat$default(new TextStyle(j, TextUnitKt.getSp(28), FontWeight.INSTANCE.getW700(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.getSp(0.38d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(36), (TextIndent) null, (PlatformTextStyle) null, lineHeightStyle2, 0, 0, (TextMotion) null, i, defaultConstructorMarker), false, 1, null);
        long j2 = 0;
        FontStyle fontStyle = null;
        FontSynthesis fontSynthesis = null;
        FontFamily fontFamily = null;
        String str = null;
        BaselineShift baselineShift = null;
        TextGeometricTransform textGeometricTransform = null;
        LocaleList localeList = null;
        long j3 = 0;
        TextDecoration textDecoration = null;
        Shadow shadow = null;
        DrawStyle drawStyle = null;
        int i2 = 0;
        int i3 = 0;
        TextIndent textIndent = null;
        PlatformTextStyle platformTextStyle = null;
        int i4 = 0;
        int i5 = 0;
        TextMotion textMotion = null;
        TextStyle compat$default2 = toCompat$default(new TextStyle(j2, TextUnitKt.getSp(28), FontWeight.INSTANCE.getW400(), fontStyle, fontSynthesis, fontFamily, str, TextUnitKt.getSp(0.38d), baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(36), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i, defaultConstructorMarker), false, 1, null);
        TextStyle compat$default3 = toCompat$default(new TextStyle(j2, TextUnitKt.getSp(24), FontWeight.INSTANCE.getW700(), fontStyle, fontSynthesis, fontFamily, str, TextUnitKt.getSp(0.3d), baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(32), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i, defaultConstructorMarker), false, 1, null);
        TextStyle compat$default4 = toCompat$default(new TextStyle(j2, TextUnitKt.getSp(20), FontWeight.INSTANCE.getW700(), fontStyle, fontSynthesis, fontFamily, str, TextUnitKt.getSp(0.3d), baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(28), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i, defaultConstructorMarker), false, 1, null);
        int i6 = 15597561;
        long j4 = 0;
        Typography = new FinancialConnectionsTypography(compat$default, compat$default2, compat$default3, compat$default4, toCompat$default(new TextStyle(j2, TextUnitKt.getSp(16), FontWeight.INSTANCE.getW600(), fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(24), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i6, defaultConstructorMarker), false, 1, null), toCompat$default(new TextStyle(j2, TextUnitKt.getSp(16), FontWeight.INSTANCE.getW400(), fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(24), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i6, defaultConstructorMarker), false, 1, null), toCompat$default(new TextStyle(j2, TextUnitKt.getSp(14), FontWeight.INSTANCE.getW400(), fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(20), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i6, defaultConstructorMarker), false, 1, null), toCompat$default(new TextStyle(j2, TextUnitKt.getSp(16), FontWeight.INSTANCE.getW600(), fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(24), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i6, defaultConstructorMarker), false, 1, null), toCompat$default(new TextStyle(j2, TextUnitKt.getSp(16), FontWeight.INSTANCE.getW400(), fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(24), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i6, defaultConstructorMarker), false, 1, null), toCompat$default(new TextStyle(j2, TextUnitKt.getSp(14), FontWeight.INSTANCE.getW600(), fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(20), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i6, defaultConstructorMarker), false, 1, null), toCompat$default(new TextStyle(j2, TextUnitKt.getSp(14), FontWeight.INSTANCE.getW400(), fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(20), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i6, defaultConstructorMarker), false, 1, null), toCompat$default(new TextStyle(j2, TextUnitKt.getSp(12), FontWeight.INSTANCE.getW400(), fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i2, i3, TextUnitKt.getSp(16), textIndent, platformTextStyle, lineHeightStyle2, i4, i5, textMotion, i6, defaultConstructorMarker), false, 1, null));
        LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.financialconnections.ui.theme.ThemeKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThemeKt.LocalTypography$lambda$1();
            }
        });
        LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.financialconnections.ui.theme.ThemeKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThemeKt.LocalColors$lambda$2();
            }
        });
    }

    public static final TextSelectionColors getTextSelectionColors(Composer composer, int i) {
        composer.startReplaceGroup(-604171497);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-604171497, i, -1, "com.stripe.android.financialconnections.ui.theme.<get-TextSelectionColors> (Theme.kt:233)");
        }
        TextSelectionColors textSelectionColors = new TextSelectionColors(FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU(), Color.m3656copywmQWz5c$default(FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textSelectionColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleConfiguration getFinancialConnectionsRippleConfiguration(Composer composer, int i) {
        composer.startReplaceGroup(-902698838);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-902698838, i, -1, "com.stripe.android.financialconnections.ui.theme.<get-FinancialConnectionsRippleConfiguration> (Theme.kt:240)");
        }
        RippleConfiguration rippleConfiguration = new RippleConfiguration(RippleDefaults.INSTANCE.m1980rippleColor5vOe2sY(FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7643getTextAction0d7_KjU(), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).isLight()), RippleDefaults.INSTANCE.m1979rippleAlphaDxMtmZc(FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7643getTextAction0d7_KjU(), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).isLight()), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rippleConfiguration;
    }

    public static final void FinancialConnectionsTheme(final Theme theme, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1762717984);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(theme) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                theme = Theme.INSTANCE.getDefault();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1762717984, i3, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme (Theme.kt:255)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{FinancialConnectionsSheetNativeActivityKt.getLocalNavHostController().provides(NavHostControllerKt.rememberNavController(new Navigator[0], composerStartRestartGroup, 0)), LocalTypography.provides(Typography), LocalColors.provides(theme.getColors(composerStartRestartGroup, i3 & 14))}, ComposableLambdaKt.rememberComposableLambda(759526304, true, new AnonymousClass1(content), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.FinancialConnectionsTheme$lambda$0(theme, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: Theme.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.theme.ThemeKt$FinancialConnectionsTheme$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2) {
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(759526304, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<anonymous> (Theme.kt:261)");
                }
                ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localView);
                ComposerKt.sourceInformationMarkerEnd(composer);
                final View view = (View) objConsume;
                final Window windowFindWindow = ThemeKt.findWindow(composer, 0);
                final long jM7634getBorderNeutral0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7634getBorderNeutral0d7_KjU();
                composer.startReplaceGroup(253654144);
                if (!view.isInEditMode()) {
                    final boolean z = !DarkThemeKt.isSystemInDarkTheme(composer, 0);
                    composer.startReplaceGroup(253657296);
                    boolean zChangedInstance = composer.changedInstance(windowFindWindow) | composer.changedInstance(view) | composer.changed(jM7634getBorderNeutral0d7_KjU) | composer.changed(z);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function0() { // from class: com.stripe.android.financialconnections.ui.theme.ThemeKt$FinancialConnectionsTheme$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ThemeKt.AnonymousClass1.invoke$lambda$2$lambda$1(windowFindWindow, view, jM7634getBorderNeutral0d7_KjU, z);
                            }
                        };
                        composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    composer.endReplaceGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue, composer, 0);
                }
                composer.endReplaceGroup();
                Colors colorsM7653debugColors8_81llA$default = ThemeKt.m7653debugColors8_81llA$default(0L, 1, null);
                final Function2<Composer, Integer, Unit> function2 = this.$content;
                MaterialThemeKt.MaterialTheme(colorsM7653debugColors8_81llA$default, null, null, ComposableLambdaKt.rememberComposableLambda(1182787700, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.theme.ThemeKt.FinancialConnectionsTheme.1.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1182787700, i2, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<anonymous>.<anonymous> (Theme.kt:278)");
                            }
                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                            ProvidableCompositionLocal<TextStyle> localTextStyle2 = TextKt.getLocalTextStyle();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composer2.consume(localTextStyle2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ProvidedValue[] providedValueArr = {TextSelectionColorsKt.getLocalTextSelectionColors().provides(ThemeKt.getTextSelectionColors(composer2, 0)), localTextStyle.provides(ThemeKt.toCompat((TextStyle) objConsume2, true)), RippleKt.getLocalRippleConfiguration().provides(ThemeKt.getFinancialConnectionsRippleConfiguration(composer2, 0))};
                            final Function2<Composer, Integer, Unit> function22 = function2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-2074616908, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.theme.ThemeKt.FinancialConnectionsTheme.1.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i3) {
                                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2074616908, i3, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<anonymous>.<anonymous>.<anonymous> (Theme.kt:283)");
                                    }
                                    function22.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(Window window, View view, long j, boolean z) {
            if (window != null) {
                WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, view);
                Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
                window.setNavigationBarColor(androidx.compose.ui.graphics.ColorKt.m3711toArgb8_81llA(j));
                insetsController.setAppearanceLightNavigationBars(z);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Window findWindow(Composer composer, int i) {
        composer.startReplaceGroup(-1994167690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994167690, i, -1, "com.stripe.android.financialconnections.ui.theme.findWindow (Theme.kt:292)");
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ViewParent parent = ((View) objConsume).getParent();
        DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
        Window window = dialogWindowProvider != null ? dialogWindowProvider.getWindow() : null;
        if (window == null) {
            ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer.consume(localView2);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Context context = ((View) objConsume2).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            window = findWindow(context);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return window;
    }

    private static final Window findWindow(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        return ((Activity) context).getWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsTypography LocalTypography$lambda$1() {
        throw new IllegalStateException("no Typography provided".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsColors LocalColors$lambda$2() {
        throw new IllegalStateException("no Colors provided".toString());
    }

    static /* synthetic */ TextStyle toCompat$default(TextStyle textStyle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toCompat(textStyle, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle toCompat(TextStyle textStyle, boolean z) {
        long jM5641getLineHeightXSAIIZE;
        if (z) {
            jM5641getLineHeightXSAIIZE = TextStyle.INSTANCE.getDefault().m5641getLineHeightXSAIIZE();
        } else {
            jM5641getLineHeightXSAIIZE = textStyle.m5641getLineHeightXSAIIZE();
        }
        return TextStyle.m5615copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, jM5641getLineHeightXSAIIZE, null, new PlatformTextStyle(true), TextStyle.INSTANCE.getDefault().getLineHeightStyle(), 0, 0, null, 15073279, null);
    }

    /* renamed from: debugColors-8_81llA$default, reason: not valid java name */
    static /* synthetic */ Colors m7653debugColors8_81llA$default(long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Color.INSTANCE.m3690getMagenta0d7_KjU();
        }
        return m7652debugColors8_81llA(j);
    }

    /* renamed from: debugColors-8_81llA, reason: not valid java name */
    private static final Colors m7652debugColors8_81llA(long j) {
        return new Colors(j, j, j, j, j, j, j, j, j, j, j, j, true, null);
    }
}
