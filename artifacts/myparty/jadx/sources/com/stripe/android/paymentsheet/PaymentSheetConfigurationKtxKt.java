package com.stripe.android.paymentsheet;

import androidx.compose.material.ColorsKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
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
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.stripe.android.lpmfoundations.paymentmethod.WalletType;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.IconStyle;
import com.stripe.android.uicore.PrimaryButtonColors;
import com.stripe.android.uicore.PrimaryButtonShape;
import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.PrimaryButtonTypography;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeTypography;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetConfigurationKtx.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0000\"\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"parseAppearance", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "allowedWalletTypes", "", "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;", "Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;", "getAllowedWalletTypes", "(Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;)Ljava/util/List;", "toTextStyle", "Landroidx/compose/ui/text/TextStyle;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetConfigurationKtxKt {

    /* compiled from: PaymentSheetConfigurationKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.IconStyle.values().length];
            try {
                iArr[PaymentSheet.IconStyle.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.IconStyle.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void parseAppearance(PaymentSheet.Appearance appearance) {
        long jPack;
        IconStyle iconStyle;
        Intrinsics.checkNotNullParameter(appearance, "<this>");
        StripeTheme stripeTheme = StripeTheme.INSTANCE;
        StripeColors colorsLight = StripeThemeDefaults.INSTANCE.getColorsLight();
        stripeTheme.setColorsLightMutable(colorsLight.m8723copyKvvhxLA((32 & 1) != 0 ? colorsLight.component : ColorKt.Color(appearance.getColorsLight().getComponent()), (32 & 2) != 0 ? colorsLight.componentBorder : ColorKt.Color(appearance.getColorsLight().getComponentBorder()), (32 & 4) != 0 ? colorsLight.componentDivider : ColorKt.Color(appearance.getColorsLight().getComponentDivider()), (32 & 8) != 0 ? colorsLight.onComponent : ColorKt.Color(appearance.getColorsLight().getOnComponent()), (32 & 16) != 0 ? colorsLight.subtitle : ColorKt.Color(appearance.getColorsLight().getSubtitle()), (32 & 32) != 0 ? colorsLight.textCursor : 0L, (32 & 64) != 0 ? colorsLight.placeholderText : ColorKt.Color(appearance.getColorsLight().getPlaceholderText()), (32 & 128) != 0 ? colorsLight.appBarIcon : ColorKt.Color(appearance.getColorsLight().getAppBarIcon()), (32 & 256) != 0 ? colorsLight.materialColors : ColorsKt.m1855lightColors2qZNXz8$default(ColorKt.Color(appearance.getColorsLight().getPrimary()), 0L, 0L, 0L, 0L, ColorKt.Color(appearance.getColorsLight().getSurface()), ColorKt.Color(appearance.getColorsLight().getError()), 0L, 0L, 0L, ColorKt.Color(appearance.getColorsLight().getOnSurface()), 0L, 2974, null)));
        StripeTheme stripeTheme2 = StripeTheme.INSTANCE;
        StripeColors colorsDark = StripeThemeDefaults.INSTANCE.getColorsDark();
        stripeTheme2.setColorsDarkMutable(colorsDark.m8723copyKvvhxLA((32 & 1) != 0 ? colorsDark.component : ColorKt.Color(appearance.getColorsDark().getComponent()), (32 & 2) != 0 ? colorsDark.componentBorder : ColorKt.Color(appearance.getColorsDark().getComponentBorder()), (32 & 4) != 0 ? colorsDark.componentDivider : ColorKt.Color(appearance.getColorsDark().getComponentDivider()), (32 & 8) != 0 ? colorsDark.onComponent : ColorKt.Color(appearance.getColorsDark().getOnComponent()), (32 & 16) != 0 ? colorsDark.subtitle : ColorKt.Color(appearance.getColorsDark().getSubtitle()), (32 & 32) != 0 ? colorsDark.textCursor : 0L, (32 & 64) != 0 ? colorsDark.placeholderText : ColorKt.Color(appearance.getColorsDark().getPlaceholderText()), (32 & 128) != 0 ? colorsDark.appBarIcon : ColorKt.Color(appearance.getColorsDark().getAppBarIcon()), (32 & 256) != 0 ? colorsDark.materialColors : ColorsKt.m1853darkColors2qZNXz8$default(ColorKt.Color(appearance.getColorsDark().getPrimary()), 0L, 0L, 0L, 0L, ColorKt.Color(appearance.getColorsDark().getSurface()), ColorKt.Color(appearance.getColorsDark().getError()), 0L, 0L, 0L, ColorKt.Color(appearance.getColorsDark().getOnSurface()), 0L, 2974, null)));
        StripeTheme.INSTANCE.setShapesMutable(StripeThemeDefaults.INSTANCE.getShapes().copy(appearance.getShapes().getCornerRadiusDp(), appearance.getShapes().getBottomSheetCornerRadiusDp(), appearance.getShapes().getBorderStrokeWidthDp()));
        StripeTheme stripeTheme3 = StripeTheme.INSTANCE;
        StripeTypography typography = StripeThemeDefaults.INSTANCE.getTypography();
        Integer fontResId = appearance.getTypography().getFontResId();
        float sizeScaleFactor = appearance.getTypography().getSizeScaleFactor();
        PaymentSheet.Typography.Font h1 = appearance.getTypography().getCustom().getH1();
        stripeTheme3.setTypographyMutable(StripeTypography.m8746copyBZCqYng$default(typography, 0, 0, 0, sizeScaleFactor, 0L, 0L, 0L, 0L, 0L, 0L, fontResId, h1 != null ? toTextStyle(h1) : null, null, null, null, null, null, null, 259063, null));
        StripeTheme stripeTheme4 = StripeTheme.INSTANCE;
        PrimaryButtonStyle primaryButtonStyle = StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle();
        Integer background = appearance.getPrimaryButton().getColorsLight().getBackground();
        PrimaryButtonColors primaryButtonColors = new PrimaryButtonColors(ColorKt.Color(background != null ? background.intValue() : appearance.getColorsLight().getPrimary()), ColorKt.Color(appearance.getPrimaryButton().getColorsLight().getOnBackground()), ColorKt.Color(appearance.getPrimaryButton().getColorsLight().getBorder()), ColorKt.Color(appearance.getPrimaryButton().getColorsLight().getSuccessBackgroundColor()), ColorKt.Color(appearance.getPrimaryButton().getColorsLight().getOnSuccessBackgroundColor()), null);
        Integer background2 = appearance.getPrimaryButton().getColorsDark().getBackground();
        PrimaryButtonColors primaryButtonColors2 = new PrimaryButtonColors(ColorKt.Color(background2 != null ? background2.intValue() : appearance.getColorsDark().getPrimary()), ColorKt.Color(appearance.getPrimaryButton().getColorsDark().getOnBackground()), ColorKt.Color(appearance.getPrimaryButton().getColorsDark().getBorder()), ColorKt.Color(appearance.getPrimaryButton().getColorsDark().getSuccessBackgroundColor()), ColorKt.Color(appearance.getPrimaryButton().getColorsDark().getOnSuccessBackgroundColor()), null);
        Float cornerRadiusDp = appearance.getPrimaryButton().getShape().getCornerRadiusDp();
        float fFloatValue = cornerRadiusDp != null ? cornerRadiusDp.floatValue() : appearance.getShapes().getCornerRadiusDp();
        Float borderStrokeWidthDp = appearance.getPrimaryButton().getShape().getBorderStrokeWidthDp();
        float fFloatValue2 = borderStrokeWidthDp != null ? borderStrokeWidthDp.floatValue() : appearance.getShapes().getBorderStrokeWidthDp();
        Float heightDp = appearance.getPrimaryButton().getShape().getHeightDp();
        PrimaryButtonShape primaryButtonShape = new PrimaryButtonShape(fFloatValue, fFloatValue2, heightDp != null ? heightDp.floatValue() : StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getShape().getHeight());
        Integer fontResId2 = appearance.getPrimaryButton().getTypography().getFontResId();
        if (fontResId2 == null) {
            fontResId2 = appearance.getTypography().getFontResId();
        }
        Float fontSizeSp = appearance.getPrimaryButton().getTypography().getFontSizeSp();
        if (fontSizeSp != null) {
            jPack = TextUnitKt.getSp(fontSizeSp.floatValue());
        } else {
            long jM8754getLargeFontSizeXSAIIZE = StripeThemeDefaults.INSTANCE.getTypography().m8754getLargeFontSizeXSAIIZE();
            float sizeScaleFactor2 = appearance.getTypography().getSizeScaleFactor();
            TextUnitKt.m6323checkArithmeticR2X_6o(jM8754getLargeFontSizeXSAIIZE);
            jPack = TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM8754getLargeFontSizeXSAIIZE), TextUnit.m6310getValueimpl(jM8754getLargeFontSizeXSAIIZE) * sizeScaleFactor2);
        }
        stripeTheme4.setPrimaryButtonStyle(primaryButtonStyle.copy(primaryButtonColors, primaryButtonColors2, primaryButtonShape, new PrimaryButtonTypography(fontResId2, jPack, null)));
        StripeTheme.INSTANCE.setFormInsets(StripeThemeDefaults.INSTANCE.getFormInsets().copy(appearance.getFormInsetValues$paymentsheet_release().getStartDp(), appearance.getFormInsetValues$paymentsheet_release().getTopDp(), appearance.getFormInsetValues$paymentsheet_release().getEndDp(), appearance.getFormInsetValues$paymentsheet_release().getBottomDp()));
        StripeTheme.INSTANCE.setCustomSectionSpacing(appearance.getSectionSpacing$paymentsheet_release().getSpacingDp() >= 0.0f ? Float.valueOf(appearance.getSectionSpacing$paymentsheet_release().getSpacingDp()) : null);
        StripeTheme.INSTANCE.setVerticalModeRowPadding(appearance.getVerticalModeRowPadding$paymentsheet_release());
        StripeTheme.INSTANCE.setTextFieldInsets(new FormInsets(appearance.getTextFieldInsets$paymentsheet_release().getStartDp(), appearance.getTextFieldInsets$paymentsheet_release().getTopDp(), appearance.getTextFieldInsets$paymentsheet_release().getEndDp(), appearance.getTextFieldInsets$paymentsheet_release().getBottomDp()));
        StripeTheme stripeTheme5 = StripeTheme.INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[appearance.getIconStyle$paymentsheet_release().ordinal()];
        if (i == 1) {
            iconStyle = IconStyle.Filled;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iconStyle = IconStyle.Outlined;
        }
        stripeTheme5.setIconStyle(iconStyle);
    }

    public static final List<WalletType> getAllowedWalletTypes(PaymentSheet.WalletButtonsConfiguration walletButtonsConfiguration) {
        Intrinsics.checkNotNullParameter(walletButtonsConfiguration, "<this>");
        if (walletButtonsConfiguration.getWalletsToShow().isEmpty()) {
            return WalletType.getEntries();
        }
        EnumEntries<WalletType> entries = WalletType.getEntries();
        ArrayList arrayList = new ArrayList();
        for (WalletType walletType : entries) {
            if (walletButtonsConfiguration.getWalletsToShow().contains(walletType.getCode())) {
                arrayList.add(walletType);
            }
        }
        return arrayList;
    }

    public static final TextStyle toTextStyle(PaymentSheet.Typography.Font font) {
        Intrinsics.checkNotNullParameter(font, "<this>");
        Float fontSizeSp = font.getFontSizeSp();
        long sp = fontSizeSp != null ? TextUnitKt.getSp(fontSizeSp.floatValue()) : TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE();
        Integer fontWeight = font.getFontWeight();
        FontWeight fontWeight2 = fontWeight != null ? new FontWeight(fontWeight.intValue()) : null;
        Integer fontFamily = font.getFontFamily();
        FontFamily FontFamily = fontFamily != null ? FontFamilyKt.FontFamily(FontKt.m5695FontYpTlLL0$default(fontFamily.intValue(), null, 0, 0, 14, null)) : null;
        Float letterSpacingSp = font.getLetterSpacingSp();
        return new TextStyle(0L, sp, fontWeight2, (FontStyle) null, (FontSynthesis) null, FontFamily, (String) null, letterSpacingSp != null ? TextUnitKt.getSp(letterSpacingSp.floatValue()) : TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777049, (DefaultConstructorMarker) null);
    }
}
