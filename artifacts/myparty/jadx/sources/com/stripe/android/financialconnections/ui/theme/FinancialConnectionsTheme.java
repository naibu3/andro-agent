package com.stripe.android.financialconnections.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;", "", "<init>", "()V", "typography", "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;", PaymentSheetAppearanceKeys.COLORS, "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsTheme {
    public static final int $stable = 0;
    public static final FinancialConnectionsTheme INSTANCE = new FinancialConnectionsTheme();

    private FinancialConnectionsTheme() {
    }

    public final FinancialConnectionsTypography getTypography(Composer composer, int i) {
        composer.startReplaceGroup(1649734758);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1649734758, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<get-typography> (Theme.kt:315)");
        }
        ProvidableCompositionLocal providableCompositionLocal = ThemeKt.LocalTypography;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        FinancialConnectionsTypography financialConnectionsTypography = (FinancialConnectionsTypography) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return financialConnectionsTypography;
    }

    public final FinancialConnectionsColors getColors(Composer composer, int i) {
        composer.startReplaceGroup(-2124194779);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124194779, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<get-colors> (Theme.kt:318)");
        }
        ProvidableCompositionLocal providableCompositionLocal = ThemeKt.LocalColors;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        FinancialConnectionsColors financialConnectionsColors = (FinancialConnectionsColors) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return financialConnectionsColors;
    }
}
