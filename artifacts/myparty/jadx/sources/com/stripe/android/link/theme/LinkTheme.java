package com.stripe.android.link.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;

/* compiled from: LinkTheme.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/link/theme/LinkTheme;", "", "<init>", "()V", "typography", "Lcom/stripe/android/link/theme/LinkTypography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkTypography;", PaymentSheetAppearanceKeys.COLORS, "Lcom/stripe/android/link/theme/LinkColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;", PaymentSheetAppearanceKeys.SHAPES, "Lcom/stripe/android/link/theme/LinkShapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkShapes;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkTheme {
    public static final int $stable = 0;
    public static final LinkTheme INSTANCE = new LinkTheme();

    private LinkTheme() {
    }

    public final LinkTypography getTypography(Composer composer, int i) {
        composer.startReplaceGroup(-1418551394);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1418551394, i, -1, "com.stripe.android.link.theme.LinkTheme.<get-typography> (LinkTheme.kt:8)");
        }
        ProvidableCompositionLocal<LinkTypography> localLinkTypography = ThemeKt.getLocalLinkTypography();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localLinkTypography);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LinkTypography linkTypography = (LinkTypography) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return linkTypography;
    }

    public final LinkColors getColors(Composer composer, int i) {
        composer.startReplaceGroup(-443512897);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-443512897, i, -1, "com.stripe.android.link.theme.LinkTheme.<get-colors> (LinkTheme.kt:12)");
        }
        ProvidableCompositionLocal<LinkColors> localLinkColors = ThemeKt.getLocalLinkColors();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localLinkColors);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LinkColors linkColors = (LinkColors) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return linkColors;
    }

    public final LinkShapes getShapes(Composer composer, int i) {
        composer.startReplaceGroup(-1165442303);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165442303, i, -1, "com.stripe.android.link.theme.LinkTheme.<get-shapes> (LinkTheme.kt:16)");
        }
        ProvidableCompositionLocal<LinkShapes> localLinkShapes = ThemeKt.getLocalLinkShapes();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localLinkShapes);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LinkShapes linkShapes = (LinkShapes) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return linkShapes;
    }
}
