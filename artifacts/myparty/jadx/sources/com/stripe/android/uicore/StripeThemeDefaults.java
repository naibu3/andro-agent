package com.stripe.android.uicore;

import androidx.compose.material.ColorsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.common.analytics.AnalyticsKtxKt;
import kotlin.Metadata;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010/\u001a\u000200¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u000204¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u00107\u001a\u000208¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0015\u0010;\u001a\u0004\u0018\u00010<¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0011\u0010@\u001a\u000208¢\u0006\b\n\u0000\u001a\u0004\bA\u0010:R\u0011\u0010B\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010F\u001a\u00020G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010J\u001a\u00020<¢\u0006\b\n\u0000\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lcom/stripe/android/uicore/StripeThemeDefaults;", "", "<init>", "()V", PaymentSheetAppearanceKeys.COLORS, "Lcom/stripe/android/uicore/StripeColors;", "isDark", "", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "getColorsLight", "()Lcom/stripe/android/uicore/StripeColors;", AnalyticsKtxKt.FIELD_COLORS_DARK, "getColorsDark", PaymentSheetAppearanceKeys.SHAPES, "Lcom/stripe/android/uicore/StripeShapes;", "getShapes", "()Lcom/stripe/android/uicore/StripeShapes;", "typography", "Lcom/stripe/android/uicore/StripeTypography;", "getTypography", "()Lcom/stripe/android/uicore/StripeTypography;", "primaryButtonStyle", "Lcom/stripe/android/uicore/PrimaryButtonStyle;", "getPrimaryButtonStyle", "()Lcom/stripe/android/uicore/PrimaryButtonStyle;", PaymentSheetAppearanceKeys.FLAT, "Lcom/stripe/android/uicore/EmbeddedFlatStyle;", "getFlat", "()Lcom/stripe/android/uicore/EmbeddedFlatStyle;", "checkmarkColorsLight", "Lcom/stripe/android/uicore/EmbeddedCheckmarkColors;", "getCheckmarkColorsLight", "()Lcom/stripe/android/uicore/EmbeddedCheckmarkColors;", "checkmarkColorsDark", "getCheckmarkColorsDark", "radioColorsLight", "Lcom/stripe/android/uicore/EmbeddedRadioColors;", "getRadioColorsLight", "()Lcom/stripe/android/uicore/EmbeddedRadioColors;", "radioColorsDark", "getRadioColorsDark", "disclosureColorsLight", "Lcom/stripe/android/uicore/EmbeddedDisclosureColors;", "getDisclosureColorsLight", "()Lcom/stripe/android/uicore/EmbeddedDisclosureColors;", "disclosureColorsDark", "getDisclosureColorsDark", "embeddedCommon", "Lcom/stripe/android/uicore/EmbeddedInsets;", "getEmbeddedCommon", "()Lcom/stripe/android/uicore/EmbeddedInsets;", PaymentSheetAppearanceKeys.FLOATING, "Lcom/stripe/android/uicore/EmbeddedFloatingStyle;", "getFloating", "()Lcom/stripe/android/uicore/EmbeddedFloatingStyle;", "formInsets", "Lcom/stripe/android/uicore/FormInsets;", "getFormInsets", "()Lcom/stripe/android/uicore/FormInsets;", "sectionSpacing", "", "getSectionSpacing", "()Ljava/lang/Float;", "Ljava/lang/Float;", "textFieldInsets", "getTextFieldInsets", "sectionStyle", "Lcom/stripe/android/uicore/SectionStyle;", "getSectionStyle", "()Lcom/stripe/android/uicore/SectionStyle;", "iconStyle", "Lcom/stripe/android/uicore/IconStyle;", "getIconStyle", "()Lcom/stripe/android/uicore/IconStyle;", "verticalModeRowPadding", "getVerticalModeRowPadding", "()F", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeThemeDefaults {
    public static final int $stable = 0;
    public static final StripeThemeDefaults INSTANCE;
    private static final EmbeddedCheckmarkColors checkmarkColorsDark;
    private static final EmbeddedCheckmarkColors checkmarkColorsLight;
    private static final StripeColors colorsDark;
    private static final StripeColors colorsLight;
    private static final EmbeddedDisclosureColors disclosureColorsDark;
    private static final EmbeddedDisclosureColors disclosureColorsLight;
    private static final EmbeddedInsets embeddedCommon;
    private static final EmbeddedFlatStyle flat;
    private static final EmbeddedFloatingStyle floating;
    private static final FormInsets formInsets;
    private static final IconStyle iconStyle;
    private static final PrimaryButtonStyle primaryButtonStyle;
    private static final EmbeddedRadioColors radioColorsDark;
    private static final EmbeddedRadioColors radioColorsLight;
    private static final Float sectionSpacing = null;
    private static final SectionStyle sectionStyle;
    private static final StripeShapes shapes;
    private static final FormInsets textFieldInsets;
    private static final StripeTypography typography;
    private static final float verticalModeRowPadding;

    private StripeThemeDefaults() {
    }

    public final StripeColors colors(boolean isDark) {
        return isDark ? colorsDark : colorsLight;
    }

    static {
        StripeThemeDefaults stripeThemeDefaults = new StripeThemeDefaults();
        INSTANCE = stripeThemeDefaults;
        StripeColors stripeColors = new StripeColors(Color.INSTANCE.m3694getWhite0d7_KjU(), ColorKt.Color(863533184), ColorKt.Color(863533184), Color.INSTANCE.m3683getBlack0d7_KjU(), ColorKt.Color(2566914048L), Color.INSTANCE.m3683getBlack0d7_KjU(), ColorKt.Color(2570861635L), ColorKt.Color(2566914048L), ColorsKt.m1855lightColors2qZNXz8$default(ColorKt.Color(4278221567L), 0L, 0L, 0L, 0L, Color.INSTANCE.m3694getWhite0d7_KjU(), Color.INSTANCE.m3691getRed0d7_KjU(), 0L, 0L, 0L, Color.INSTANCE.m3683getBlack0d7_KjU(), 0L, 2974, null), null);
        colorsLight = stripeColors;
        StripeColors stripeColors2 = new StripeColors(Color.INSTANCE.m3686getDarkGray0d7_KjU(), ColorKt.Color(4286085248L), ColorKt.Color(4286085248L), Color.INSTANCE.m3694getWhite0d7_KjU(), ColorKt.Color(2583691263L), Color.INSTANCE.m3694getWhite0d7_KjU(), ColorKt.Color(1644167167), Color.INSTANCE.m3694getWhite0d7_KjU(), ColorsKt.m1853darkColors2qZNXz8$default(ColorKt.Color(4278219988L), 0L, 0L, 0L, 0L, ColorKt.Color(4281216558L), Color.INSTANCE.m3691getRed0d7_KjU(), 0L, 0L, 0L, Color.INSTANCE.m3694getWhite0d7_KjU(), 0L, 2974, null), null);
        colorsDark = stripeColors2;
        StripeShapes stripeShapes = new StripeShapes(6.0f, 6.0f, 1.0f);
        shapes = stripeShapes;
        StripeTypography stripeTypography = new StripeTypography(FontWeight.INSTANCE.getNormal().getWeight(), FontWeight.INSTANCE.getMedium().getWeight(), FontWeight.INSTANCE.getBold().getWeight(), 1.0f, TextUnitKt.getSp(9), TextUnitKt.getSp(12), TextUnitKt.getSp(13), TextUnitKt.getSp(14), TextUnitKt.getSp(16), TextUnitKt.getSp(20), null, null, null, null, null, null, null, null, 260096, null);
        typography = stripeTypography;
        primaryButtonStyle = new PrimaryButtonStyle(new PrimaryButtonColors(stripeThemeDefaults.colors(false).getMaterialColors().m1833getPrimary0d7_KjU(), Color.INSTANCE.m3694getWhite0d7_KjU(), Color.INSTANCE.m3692getTransparent0d7_KjU(), StripeThemeKt.getPRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR(), Color.INSTANCE.m3694getWhite0d7_KjU(), null), new PrimaryButtonColors(stripeThemeDefaults.colors(true).getMaterialColors().m1833getPrimary0d7_KjU(), Color.INSTANCE.m3694getWhite0d7_KjU(), Color.INSTANCE.m3692getTransparent0d7_KjU(), StripeThemeKt.getPRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR(), Color.INSTANCE.m3694getWhite0d7_KjU(), null), new PrimaryButtonShape(stripeShapes.getCornerRadius(), 0.0f, 48.0f), new PrimaryButtonTypography(stripeTypography.getFontFamily(), stripeTypography.m8754getLargeFontSizeXSAIIZE(), null));
        flat = new EmbeddedFlatStyle(1.0f, 0.0f, true, true);
        checkmarkColorsLight = new EmbeddedCheckmarkColors(stripeColors.m8726getComponentBorder0d7_KjU(), stripeColors.getMaterialColors().m1833getPrimary0d7_KjU(), null);
        checkmarkColorsDark = new EmbeddedCheckmarkColors(StripeThemeKt.EMBEDDED_SEPARATOR_COLOR_DARK, stripeColors2.getMaterialColors().m1833getPrimary0d7_KjU(), null);
        radioColorsLight = new EmbeddedRadioColors(stripeColors.m8726getComponentBorder0d7_KjU(), stripeColors.getMaterialColors().m1833getPrimary0d7_KjU(), stripeColors.m8726getComponentBorder0d7_KjU(), null);
        radioColorsDark = new EmbeddedRadioColors(StripeThemeKt.EMBEDDED_SEPARATOR_COLOR_DARK, stripeColors2.getMaterialColors().m1833getPrimary0d7_KjU(), StripeThemeKt.EMBEDDED_SEPARATOR_COLOR_DARK, null);
        disclosureColorsLight = new EmbeddedDisclosureColors(stripeColors.m8726getComponentBorder0d7_KjU(), Color.INSTANCE.m3686getDarkGray0d7_KjU(), null);
        disclosureColorsDark = new EmbeddedDisclosureColors(StripeThemeKt.EMBEDDED_SEPARATOR_COLOR_DARK, Color.INSTANCE.m3689getLightGray0d7_KjU(), null);
        EmbeddedInsets embeddedInsets = new EmbeddedInsets(0.0f, 0.0f, 0.0f);
        embeddedCommon = embeddedInsets;
        floating = new EmbeddedFloatingStyle(12.0f);
        formInsets = new FormInsets(20.0f, 0.0f, 20.0f, 40.0f);
        textFieldInsets = new FormInsets(16.0f, 20.0f, 12.0f, 10.0f);
        sectionStyle = SectionStyle.Bordered;
        iconStyle = IconStyle.Filled;
        verticalModeRowPadding = embeddedInsets.getAdditionalVerticalInsetsDp();
    }

    public final StripeColors getColorsLight() {
        return colorsLight;
    }

    public final StripeColors getColorsDark() {
        return colorsDark;
    }

    public final StripeShapes getShapes() {
        return shapes;
    }

    public final StripeTypography getTypography() {
        return typography;
    }

    public final PrimaryButtonStyle getPrimaryButtonStyle() {
        return primaryButtonStyle;
    }

    public final EmbeddedFlatStyle getFlat() {
        return flat;
    }

    public final EmbeddedCheckmarkColors getCheckmarkColorsLight() {
        return checkmarkColorsLight;
    }

    public final EmbeddedCheckmarkColors getCheckmarkColorsDark() {
        return checkmarkColorsDark;
    }

    public final EmbeddedRadioColors getRadioColorsLight() {
        return radioColorsLight;
    }

    public final EmbeddedRadioColors getRadioColorsDark() {
        return radioColorsDark;
    }

    public final EmbeddedDisclosureColors getDisclosureColorsLight() {
        return disclosureColorsLight;
    }

    public final EmbeddedDisclosureColors getDisclosureColorsDark() {
        return disclosureColorsDark;
    }

    public final EmbeddedInsets getEmbeddedCommon() {
        return embeddedCommon;
    }

    public final EmbeddedFloatingStyle getFloating() {
        return floating;
    }

    public final FormInsets getFormInsets() {
        return formInsets;
    }

    public final Float getSectionSpacing() {
        return sectionSpacing;
    }

    public final FormInsets getTextFieldInsets() {
        return textFieldInsets;
    }

    public final SectionStyle getSectionStyle() {
        return sectionStyle;
    }

    public final IconStyle getIconStyle() {
        return iconStyle;
    }

    public final float getVerticalModeRowPadding() {
        return verticalModeRowPadding;
    }
}
