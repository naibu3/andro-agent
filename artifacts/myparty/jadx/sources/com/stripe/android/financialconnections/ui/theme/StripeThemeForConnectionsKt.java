package com.stripe.android.financialconnections.ui.theme;

import androidx.compose.material.Colors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.facebook.common.util.UriUtil;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeShapes;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeTypography;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeThemeForConnections.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"StripeThemeForConnections", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeThemeForConnectionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StripeThemeForConnections$lambda$0(Function2 function2, int i, Composer composer, int i2) {
        StripeThemeForConnections(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void StripeThemeForConnections(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1479751569);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1479751569, i2, -1, "com.stripe.android.financialconnections.ui.theme.StripeThemeForConnections (StripeThemeForConnections.kt:10)");
            }
            StripeColors stripeColorsColors = StripeThemeDefaults.INSTANCE.colors(false);
            long jM7630getBackground0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7630getBackground0d7_KjU();
            long jM7645getTextDefault0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU();
            long jM7634getBorderNeutral0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7634getBorderNeutral0d7_KjU();
            long jM7647getTextSubdued0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7647getTextSubdued0d7_KjU();
            long jM7645getTextDefault0d7_KjU2 = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU();
            Colors materialColors = stripeColorsColors.getMaterialColors();
            StripeThemeKt.StripeTheme(stripeColorsColors.m8723copyKvvhxLA((32 & 1) != 0 ? stripeColorsColors.component : jM7630getBackground0d7_KjU, (32 & 2) != 0 ? stripeColorsColors.componentBorder : jM7634getBorderNeutral0d7_KjU, (32 & 4) != 0 ? stripeColorsColors.componentDivider : 0L, (32 & 8) != 0 ? stripeColorsColors.onComponent : jM7645getTextDefault0d7_KjU, (32 & 16) != 0 ? stripeColorsColors.subtitle : 0L, (32 & 32) != 0 ? stripeColorsColors.textCursor : jM7645getTextDefault0d7_KjU2, (32 & 64) != 0 ? stripeColorsColors.placeholderText : jM7647getTextSubdued0d7_KjU, (32 & 128) != 0 ? stripeColorsColors.appBarIcon : 0L, (32 & 256) != 0 ? stripeColorsColors.materialColors : materialColors.m1825copypvPzIIM((8126 & 1) != 0 ? materialColors.m1833getPrimary0d7_KjU() : FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7633getBorder0d7_KjU(), (8126 & 2) != 0 ? materialColors.m1834getPrimaryVariant0d7_KjU() : 0L, (8126 & 4) != 0 ? materialColors.m1835getSecondary0d7_KjU() : 0L, (8126 & 8) != 0 ? materialColors.m1836getSecondaryVariant0d7_KjU() : 0L, (8126 & 16) != 0 ? materialColors.m1826getBackground0d7_KjU() : 0L, (8126 & 32) != 0 ? materialColors.m1837getSurface0d7_KjU() : 0L, (8126 & 64) != 0 ? materialColors.m1827getError0d7_KjU() : FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7644getTextCritical0d7_KjU(), (8126 & 128) != 0 ? materialColors.m1830getOnPrimary0d7_KjU() : 0L, (8126 & 256) != 0 ? materialColors.m1831getOnSecondary0d7_KjU() : 0L, (8126 & 512) != 0 ? materialColors.m1828getOnBackground0d7_KjU() : 0L, (8126 & 1024) != 0 ? materialColors.m1832getOnSurface0d7_KjU() : 0L, (8126 & 2048) != 0 ? materialColors.m1829getOnError0d7_KjU() : 0L, (8126 & 4096) != 0 ? materialColors.isLight() : false)), StripeShapes.copy$default(StripeThemeDefaults.INSTANCE.getShapes(), 12.0f, 0.0f, 0.0f, 6, null), StripeThemeDefaults.INSTANCE.getTypography(), StripeThemeDefaults.INSTANCE.getSectionSpacing(), StripeThemeDefaults.INSTANCE.getSectionStyle(), StripeThemeDefaults.INSTANCE.getTextFieldInsets(), StripeThemeDefaults.INSTANCE.getIconStyle(), ComposableLambdaKt.rememberComposableLambda(50863641, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.theme.StripeThemeForConnectionsKt.StripeThemeForConnections.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(50863641, i3, -1, "com.stripe.android.financialconnections.ui.theme.StripeThemeForConnections.<anonymous> (StripeThemeForConnections.kt:34)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (FormInsets.$stable << 15) | (StripeTypography.$stable << 6) | 12582912 | StripeColors.$stable | (StripeShapes.$stable << 3), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.theme.StripeThemeForConnectionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StripeThemeForConnectionsKt.StripeThemeForConnections$lambda$0(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
