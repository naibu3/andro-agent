package com.stripe.android.link.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material.Colors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.facebook.common.util.UriUtil;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.SectionStyle;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeShapes;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeTypography;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0002\u0010\u0018\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0019"}, d2 = {"Neutral900", "Landroidx/compose/ui/graphics/Color;", "J", "Neutral800", "Neutral700", "Neutral500", "Neutral400", "Neutral300", "Neutral200", "Neutral100", "Neutral0", "Brand600", "Brand400", "Brand200", "Critical600", "Critical500", "Critical400", "StripeThemeForLink", "", "sectionStyle", "Lcom/stripe/android/uicore/SectionStyle;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/stripe/android/uicore/SectionStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ColorKt {
    private static final long Neutral900 = androidx.compose.ui.graphics.ColorKt.Color(4279703319L);
    private static final long Neutral800 = androidx.compose.ui.graphics.ColorKt.Color(4280690214L);
    private static final long Neutral700 = androidx.compose.ui.graphics.ColorKt.Color(4282400832L);
    private static final long Neutral500 = androidx.compose.ui.graphics.ColorKt.Color(4285558896L);
    private static final long Neutral400 = androidx.compose.ui.graphics.ColorKt.Color(4288914339L);
    private static final long Neutral300 = androidx.compose.ui.graphics.ColorKt.Color(4292138196L);
    private static final long Neutral200 = androidx.compose.ui.graphics.ColorKt.Color(4293256677L);
    private static final long Neutral100 = androidx.compose.ui.graphics.ColorKt.Color(4294309365L);
    private static final long Neutral0 = androidx.compose.ui.graphics.ColorKt.Color(4294967295L);
    private static final long Brand600 = androidx.compose.ui.graphics.ColorKt.Color(4278216245L);
    private static final long Brand400 = androidx.compose.ui.graphics.ColorKt.Color(4278231893L);
    private static final long Brand200 = androidx.compose.ui.graphics.ColorKt.Color(4278244975L);
    private static final long Critical600 = androidx.compose.ui.graphics.ColorKt.Color(4290777660L);
    private static final long Critical500 = androidx.compose.ui.graphics.ColorKt.Color(4293269831L);
    private static final long Critical400 = androidx.compose.ui.graphics.ColorKt.Color(4294593127L);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StripeThemeForLink$lambda$0(SectionStyle sectionStyle, Function2 function2, int i, int i2, Composer composer, int i3) {
        StripeThemeForLink(sectionStyle, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void StripeThemeForLink(SectionStyle sectionStyle, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final SectionStyle sectionStyle2;
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-896902563);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            sectionStyle2 = sectionStyle;
        } else if ((i & 6) == 0) {
            sectionStyle2 = sectionStyle;
            i3 = (composerStartRestartGroup.changed(sectionStyle2) ? 4 : 2) | i;
        } else {
            sectionStyle2 = sectionStyle;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            SectionStyle sectionStyle3 = i4 != 0 ? SectionStyle.Borderless : sectionStyle2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-896902563, i3, -1, "com.stripe.android.link.theme.StripeThemeForLink (Color.kt:146)");
            }
            StripeColors stripeColorsColors = StripeThemeDefaults.INSTANCE.colors(DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0));
            long jM7806getSurfaceSecondary0d7_KjU = LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7806getSurfaceSecondary0d7_KjU();
            long jM7810getTextPrimary0d7_KjU = LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7810getTextPrimary0d7_KjU();
            long jM7812getTextTertiary0d7_KjU = LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7812getTextTertiary0d7_KjU();
            long jM7792getBorderDefault0d7_KjU = LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7792getBorderDefault0d7_KjU();
            long jM7806getSurfaceSecondary0d7_KjU2 = LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7806getSurfaceSecondary0d7_KjU();
            Colors materialColors = stripeColorsColors.getMaterialColors();
            StripeThemeKt.StripeTheme(stripeColorsColors.m8723copyKvvhxLA((32 & 1) != 0 ? stripeColorsColors.component : jM7806getSurfaceSecondary0d7_KjU, (32 & 2) != 0 ? stripeColorsColors.componentBorder : jM7806getSurfaceSecondary0d7_KjU2, (32 & 4) != 0 ? stripeColorsColors.componentDivider : jM7792getBorderDefault0d7_KjU, (32 & 8) != 0 ? stripeColorsColors.onComponent : jM7810getTextPrimary0d7_KjU, (32 & 16) != 0 ? stripeColorsColors.subtitle : 0L, (32 & 32) != 0 ? stripeColorsColors.textCursor : 0L, (32 & 64) != 0 ? stripeColorsColors.placeholderText : jM7812getTextTertiary0d7_KjU, (32 & 128) != 0 ? stripeColorsColors.appBarIcon : 0L, (32 & 256) != 0 ? stripeColorsColors.materialColors : materialColors.m1825copypvPzIIM((8126 & 1) != 0 ? materialColors.m1833getPrimary0d7_KjU() : LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7793getBorderSelected0d7_KjU(), (8126 & 2) != 0 ? materialColors.m1834getPrimaryVariant0d7_KjU() : 0L, (8126 & 4) != 0 ? materialColors.m1835getSecondary0d7_KjU() : 0L, (8126 & 8) != 0 ? materialColors.m1836getSecondaryVariant0d7_KjU() : 0L, (8126 & 16) != 0 ? materialColors.m1826getBackground0d7_KjU() : 0L, (8126 & 32) != 0 ? materialColors.m1837getSurface0d7_KjU() : 0L, (8126 & 64) != 0 ? materialColors.m1827getError0d7_KjU() : LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7809getTextCritical0d7_KjU(), (8126 & 128) != 0 ? materialColors.m1830getOnPrimary0d7_KjU() : 0L, (8126 & 256) != 0 ? materialColors.m1831getOnSecondary0d7_KjU() : 0L, (8126 & 512) != 0 ? materialColors.m1828getOnBackground0d7_KjU() : 0L, (8126 & 1024) != 0 ? materialColors.m1832getOnSurface0d7_KjU() : 0L, (8126 & 2048) != 0 ? materialColors.m1829getOnError0d7_KjU() : 0L, (8126 & 4096) != 0 ? materialColors.isLight() : false)), StripeShapes.copy$default(StripeThemeDefaults.INSTANCE.getShapes(), 12.0f, 24.0f, 0.0f, 4, null), StripeThemeDefaults.INSTANCE.getTypography(), StripeThemeDefaults.INSTANCE.getSectionSpacing(), sectionStyle3, StripeThemeDefaults.INSTANCE.getTextFieldInsets(), StripeThemeDefaults.INSTANCE.getIconStyle(), ComposableLambdaKt.rememberComposableLambda(-1570603149, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.theme.ColorKt.StripeThemeForLink.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1570603149, i5, -1, "com.stripe.android.link.theme.StripeThemeForLink.<anonymous> (Color.kt:171)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (FormInsets.$stable << 15) | ((i3 << 12) & 57344) | 12582912 | StripeColors.$stable | (StripeShapes.$stable << 3) | (StripeTypography.$stable << 6), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            sectionStyle2 = sectionStyle3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.theme.ColorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ColorKt.StripeThemeForLink$lambda$0(sectionStyle2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
