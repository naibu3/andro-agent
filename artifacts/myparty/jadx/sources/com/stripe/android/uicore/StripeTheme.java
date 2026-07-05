package com.stripe.android.uicore;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020DR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001a\u00101\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/stripe/android/uicore/StripeTheme;", "", "<init>", "()V", "minContrastForWhite", "", "colorsDarkMutable", "Lcom/stripe/android/uicore/StripeColors;", "getColorsDarkMutable", "()Lcom/stripe/android/uicore/StripeColors;", "setColorsDarkMutable", "(Lcom/stripe/android/uicore/StripeColors;)V", "colorsLightMutable", "getColorsLightMutable", "setColorsLightMutable", "shapesMutable", "Lcom/stripe/android/uicore/StripeShapes;", "getShapesMutable", "()Lcom/stripe/android/uicore/StripeShapes;", "setShapesMutable", "(Lcom/stripe/android/uicore/StripeShapes;)V", "typographyMutable", "Lcom/stripe/android/uicore/StripeTypography;", "getTypographyMutable", "()Lcom/stripe/android/uicore/StripeTypography;", "setTypographyMutable", "(Lcom/stripe/android/uicore/StripeTypography;)V", "primaryButtonStyle", "Lcom/stripe/android/uicore/PrimaryButtonStyle;", "getPrimaryButtonStyle", "()Lcom/stripe/android/uicore/PrimaryButtonStyle;", "setPrimaryButtonStyle", "(Lcom/stripe/android/uicore/PrimaryButtonStyle;)V", "formInsets", "Lcom/stripe/android/uicore/FormInsets;", "getFormInsets", "()Lcom/stripe/android/uicore/FormInsets;", "setFormInsets", "(Lcom/stripe/android/uicore/FormInsets;)V", "customSectionSpacing", "", "getCustomSectionSpacing", "()Ljava/lang/Float;", "setCustomSectionSpacing", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "textFieldInsets", "getTextFieldInsets", "setTextFieldInsets", "sectionStyle", "Lcom/stripe/android/uicore/SectionStyle;", "getSectionStyle", "()Lcom/stripe/android/uicore/SectionStyle;", "setSectionStyle", "(Lcom/stripe/android/uicore/SectionStyle;)V", "iconStyle", "Lcom/stripe/android/uicore/IconStyle;", "getIconStyle", "()Lcom/stripe/android/uicore/IconStyle;", "setIconStyle", "(Lcom/stripe/android/uicore/IconStyle;)V", "verticalModeRowPadding", "getVerticalModeRowPadding", "()F", "setVerticalModeRowPadding", "(F)V", "getColors", "isDark", "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeTheme {
    public static final double minContrastForWhite = 2.2d;
    public static final StripeTheme INSTANCE = new StripeTheme();
    private static StripeColors colorsDarkMutable = StripeThemeDefaults.INSTANCE.getColorsDark();
    private static StripeColors colorsLightMutable = StripeThemeDefaults.INSTANCE.getColorsLight();
    private static StripeShapes shapesMutable = StripeThemeDefaults.INSTANCE.getShapes();
    private static StripeTypography typographyMutable = StripeThemeDefaults.INSTANCE.getTypography();
    private static PrimaryButtonStyle primaryButtonStyle = StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle();
    private static FormInsets formInsets = StripeThemeDefaults.INSTANCE.getFormInsets();
    private static Float customSectionSpacing = StripeThemeDefaults.INSTANCE.getSectionSpacing();
    private static FormInsets textFieldInsets = StripeThemeDefaults.INSTANCE.getTextFieldInsets();
    private static SectionStyle sectionStyle = StripeThemeDefaults.INSTANCE.getSectionStyle();
    private static IconStyle iconStyle = StripeThemeDefaults.INSTANCE.getIconStyle();
    private static float verticalModeRowPadding = StripeThemeDefaults.INSTANCE.getVerticalModeRowPadding();
    public static final int $stable = 8;

    private StripeTheme() {
    }

    public final StripeColors getColorsDarkMutable() {
        return colorsDarkMutable;
    }

    public final void setColorsDarkMutable(StripeColors stripeColors) {
        Intrinsics.checkNotNullParameter(stripeColors, "<set-?>");
        colorsDarkMutable = stripeColors;
    }

    public final StripeColors getColorsLightMutable() {
        return colorsLightMutable;
    }

    public final void setColorsLightMutable(StripeColors stripeColors) {
        Intrinsics.checkNotNullParameter(stripeColors, "<set-?>");
        colorsLightMutable = stripeColors;
    }

    public final StripeShapes getShapesMutable() {
        return shapesMutable;
    }

    public final void setShapesMutable(StripeShapes stripeShapes) {
        Intrinsics.checkNotNullParameter(stripeShapes, "<set-?>");
        shapesMutable = stripeShapes;
    }

    public final StripeTypography getTypographyMutable() {
        return typographyMutable;
    }

    public final void setTypographyMutable(StripeTypography stripeTypography) {
        Intrinsics.checkNotNullParameter(stripeTypography, "<set-?>");
        typographyMutable = stripeTypography;
    }

    public final PrimaryButtonStyle getPrimaryButtonStyle() {
        return primaryButtonStyle;
    }

    public final void setPrimaryButtonStyle(PrimaryButtonStyle primaryButtonStyle2) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle2, "<set-?>");
        primaryButtonStyle = primaryButtonStyle2;
    }

    public final FormInsets getFormInsets() {
        return formInsets;
    }

    public final void setFormInsets(FormInsets formInsets2) {
        Intrinsics.checkNotNullParameter(formInsets2, "<set-?>");
        formInsets = formInsets2;
    }

    public final Float getCustomSectionSpacing() {
        return customSectionSpacing;
    }

    public final void setCustomSectionSpacing(Float f) {
        customSectionSpacing = f;
    }

    public final FormInsets getTextFieldInsets() {
        return textFieldInsets;
    }

    public final void setTextFieldInsets(FormInsets formInsets2) {
        Intrinsics.checkNotNullParameter(formInsets2, "<set-?>");
        textFieldInsets = formInsets2;
    }

    public final SectionStyle getSectionStyle() {
        return sectionStyle;
    }

    public final void setSectionStyle(SectionStyle sectionStyle2) {
        Intrinsics.checkNotNullParameter(sectionStyle2, "<set-?>");
        sectionStyle = sectionStyle2;
    }

    public final IconStyle getIconStyle() {
        return iconStyle;
    }

    public final void setIconStyle(IconStyle iconStyle2) {
        Intrinsics.checkNotNullParameter(iconStyle2, "<set-?>");
        iconStyle = iconStyle2;
    }

    public final float getVerticalModeRowPadding() {
        return verticalModeRowPadding;
    }

    public final void setVerticalModeRowPadding(float f) {
        verticalModeRowPadding = f;
    }

    public final StripeColors getColors(boolean isDark) {
        return isDark ? colorsDarkMutable : colorsLightMutable;
    }
}
