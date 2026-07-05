package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;

/* compiled from: PrimaryButtonTheme.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0007J\r\u0010\u0011\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000bJ\r\u0010\u0012\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;", "", "<init>", "()V", PaymentSheetAppearanceKeys.COLORS, "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;", "shape", "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;", "typography", "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;", "getPrimaryButtonColors", "getPrimaryButtonShape", "getPrimaryButtonTypography", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrimaryButtonTheme {
    public static final int $stable = 0;
    public static final PrimaryButtonTheme INSTANCE = new PrimaryButtonTheme();

    private PrimaryButtonTheme() {
    }

    public final PrimaryButtonColors getColors(Composer composer, int i) {
        composer.startReplaceGroup(-214126613);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-214126613, i, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-colors> (PrimaryButtonTheme.kt:57)");
        }
        PrimaryButtonColors primaryButtonColors = getPrimaryButtonColors(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return primaryButtonColors;
    }

    public final PrimaryButtonShape getShape(Composer composer, int i) {
        composer.startReplaceGroup(-1656996728);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1656996728, i, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-shape> (PrimaryButtonTheme.kt:61)");
        }
        PrimaryButtonShape primaryButtonShape = getPrimaryButtonShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return primaryButtonShape;
    }

    public final PrimaryButtonTypography getTypography(Composer composer, int i) {
        composer.startReplaceGroup(1153600138);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1153600138, i, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-typography> (PrimaryButtonTheme.kt:65)");
        }
        PrimaryButtonTypography primaryButtonTypography = getPrimaryButtonTypography(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return primaryButtonTypography;
    }

    private final PrimaryButtonColors getPrimaryButtonColors(Composer composer, int i) {
        long jM3694getWhite0d7_KjU;
        composer.startReplaceGroup(-1604949716);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1604949716, i, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonColors (PrimaryButtonTheme.kt:68)");
        }
        PrimaryButtonStyle primaryButtonStyle = StripeTheme.INSTANCE.getPrimaryButtonStyle();
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        ProvidableCompositionLocal<PrimaryButtonColors> localPrimaryButtonColors = PrimaryButtonThemeKt.getLocalPrimaryButtonColors();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localPrimaryButtonColors);
        ComposerKt.sourceInformationMarkerEnd(composer);
        PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) objConsume2;
        boolean zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composer, 0);
        composer.startReplaceGroup(197436429);
        boolean zChanged = composer.changed(primaryButtonStyle) | composer.changed(context) | composer.changed(primaryButtonColors) | composer.changed(zIsSystemInDarkTheme);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            long jM8503getBackground0d7_KjU = primaryButtonColors.m8503getBackground0d7_KjU();
            if (jM8503getBackground0d7_KjU == 16) {
                jM8503getBackground0d7_KjU = ColorKt.Color(StripeThemeKt.getBackgroundColor(primaryButtonStyle, context));
            }
            long j = jM8503getBackground0d7_KjU;
            long jM8505getOnBackground0d7_KjU = primaryButtonColors.m8505getOnBackground0d7_KjU();
            if (jM8505getOnBackground0d7_KjU == 16) {
                jM8505getOnBackground0d7_KjU = ColorKt.Color(StripeThemeKt.getOnBackgroundColor(primaryButtonStyle, context));
            }
            long j2 = jM8505getOnBackground0d7_KjU;
            long jM8507getSuccessBackground0d7_KjU = primaryButtonColors.m8507getSuccessBackground0d7_KjU();
            if (jM8507getSuccessBackground0d7_KjU == 16) {
                jM8507getSuccessBackground0d7_KjU = ColorKt.Color(ContextCompat.getColor(context, R.color.stripe_paymentsheet_primary_button_success_background));
            }
            long j3 = jM8507getSuccessBackground0d7_KjU;
            long jM8506getOnSuccessBackground0d7_KjU = primaryButtonColors.m8506getOnSuccessBackground0d7_KjU();
            if (jM8506getOnSuccessBackground0d7_KjU == 16) {
                if (zIsSystemInDarkTheme) {
                    jM3694getWhite0d7_KjU = Color.INSTANCE.m3683getBlack0d7_KjU();
                } else {
                    jM3694getWhite0d7_KjU = Color.INSTANCE.m3694getWhite0d7_KjU();
                }
                jM8506getOnSuccessBackground0d7_KjU = jM3694getWhite0d7_KjU;
            }
            long j4 = jM8506getOnSuccessBackground0d7_KjU;
            long jM8504getBorder0d7_KjU = primaryButtonColors.m8504getBorder0d7_KjU();
            if (jM8504getBorder0d7_KjU == 16) {
                jM8504getBorder0d7_KjU = ColorKt.Color(StripeThemeKt.getBorderStrokeColor(primaryButtonStyle, context));
            }
            Object primaryButtonColors2 = new PrimaryButtonColors(j, j2, j3, j4, jM8504getBorder0d7_KjU, null);
            composer.updateRememberedValue(primaryButtonColors2);
            objRememberedValue = primaryButtonColors2;
        }
        PrimaryButtonColors primaryButtonColors3 = (PrimaryButtonColors) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return primaryButtonColors3;
    }

    private final PrimaryButtonShape getPrimaryButtonShape(Composer composer, int i) {
        composer.startReplaceGroup(-1749410128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749410128, i, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonShape (PrimaryButtonTheme.kt:110)");
        }
        PrimaryButtonStyle primaryButtonStyle = StripeTheme.INSTANCE.getPrimaryButtonStyle();
        ProvidableCompositionLocal<PrimaryButtonShape> localPrimaryButtonShape = PrimaryButtonThemeKt.getLocalPrimaryButtonShape();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localPrimaryButtonShape);
        ComposerKt.sourceInformationMarkerEnd(composer);
        PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) objConsume;
        composer.startReplaceGroup(-1244204280);
        boolean zChanged = composer.changed(primaryButtonStyle) | composer.changed(primaryButtonShape);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            float fM8523getCornerRadiusD9Ej5fM = primaryButtonShape.m8523getCornerRadiusD9Ej5fM();
            if (Float.isNaN(fM8523getCornerRadiusD9Ej5fM)) {
                fM8523getCornerRadiusD9Ej5fM = Dp.m6117constructorimpl(primaryButtonStyle.getShape().getCornerRadius());
            }
            float fM8522getBorderStrokeWidthD9Ej5fM = primaryButtonShape.m8522getBorderStrokeWidthD9Ej5fM();
            if (Float.isNaN(fM8522getBorderStrokeWidthD9Ej5fM)) {
                fM8522getBorderStrokeWidthD9Ej5fM = Dp.m6117constructorimpl(primaryButtonStyle.getShape().getBorderStrokeWidth());
            }
            float fM8524getHeightD9Ej5fM = primaryButtonShape.m8524getHeightD9Ej5fM();
            if (Float.isNaN(fM8524getHeightD9Ej5fM)) {
                fM8524getHeightD9Ej5fM = Dp.m6117constructorimpl(primaryButtonStyle.getShape().getHeight());
            }
            Object primaryButtonShape2 = new PrimaryButtonShape(fM8523getCornerRadiusD9Ej5fM, fM8522getBorderStrokeWidthD9Ej5fM, fM8524getHeightD9Ej5fM, null);
            composer.updateRememberedValue(primaryButtonShape2);
            objRememberedValue = primaryButtonShape2;
        }
        PrimaryButtonShape primaryButtonShape3 = (PrimaryButtonShape) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return primaryButtonShape3;
    }

    private final PrimaryButtonTypography getPrimaryButtonTypography(Composer composer, int i) {
        composer.startReplaceGroup(-1210649140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210649140, i, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonTypography (PrimaryButtonTheme.kt:130)");
        }
        PrimaryButtonStyle primaryButtonStyle = StripeTheme.INSTANCE.getPrimaryButtonStyle();
        ProvidableCompositionLocal<PrimaryButtonTypography> localPrimaryButtonTypography = PrimaryButtonThemeKt.getLocalPrimaryButtonTypography();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localPrimaryButtonTypography);
        ComposerKt.sourceInformationMarkerEnd(composer);
        PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) objConsume;
        composer.startReplaceGroup(1018218746);
        boolean zChanged = composer.changed(primaryButtonStyle) | composer.changed(primaryButtonTypography);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            FontFamily fontFamily = primaryButtonTypography.getFontFamily();
            if (fontFamily == null) {
                Integer fontFamily2 = primaryButtonStyle.getTypography().getFontFamily();
                fontFamily = fontFamily2 != null ? FontFamilyKt.FontFamily(FontKt.m5695FontYpTlLL0$default(fontFamily2.intValue(), null, 0, 0, 14, null)) : null;
            }
            long jM8528getFontSizeXSAIIZE = primaryButtonTypography.m8528getFontSizeXSAIIZE();
            if (TextUnitKt.m6328isUnspecifiedR2X_6o(jM8528getFontSizeXSAIIZE)) {
                jM8528getFontSizeXSAIIZE = primaryButtonStyle.getTypography().m8713getFontSizeXSAIIZE();
            }
            Object primaryButtonTypography2 = new PrimaryButtonTypography(fontFamily, jM8528getFontSizeXSAIIZE, null);
            composer.updateRememberedValue(primaryButtonTypography2);
            objRememberedValue = primaryButtonTypography2;
        }
        PrimaryButtonTypography primaryButtonTypography3 = (PrimaryButtonTypography) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return primaryButtonTypography3;
    }
}
