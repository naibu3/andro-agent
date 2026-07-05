package com.stripe.android.link.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material.RadioButtonColors;
import androidx.compose.material.RadioButtonDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.common.analytics.AnalyticsKtxKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00020\u000b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/link/theme/LinkThemeConfig;", "", "<init>", "()V", PaymentSheetAppearanceKeys.COLORS, "Lcom/stripe/android/link/theme/LinkColors;", "isDark", "", AnalyticsKtxKt.FIELD_COLORS_LIGHT, AnalyticsKtxKt.FIELD_COLORS_DARK, "contentOnPrimaryButton", "Landroidx/compose/ui/graphics/Color;", "getContentOnPrimaryButton-vNxB06k$paymentsheet_release", "(Lcom/stripe/android/link/theme/LinkColors;)J", "separatorOnPrimaryButton", "getSeparatorOnPrimaryButton-vNxB06k$paymentsheet_release", "radioButtonColors", "Landroidx/compose/material/RadioButtonColors;", "getRadioButtonColors", "(Lcom/stripe/android/link/theme/LinkColors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/RadioButtonColors;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkThemeConfig {
    public static final int $stable = 0;
    public static final LinkThemeConfig INSTANCE = new LinkThemeConfig();
    private static final LinkColors colorsLight = new LinkColors(ColorKt.Neutral0, ColorKt.Neutral100, ColorKt.Neutral200, ColorKt.Neutral900, ColorKt.Neutral300, ColorKt.Neutral900, ColorKt.Critical500, ColorKt.Neutral900, ColorKt.Neutral0, ColorKt.Brand200, ColorKt.Critical500, ColorKt.Neutral900, ColorKt.Neutral700, ColorKt.Neutral500, ColorKt.Neutral0, ColorKt.Brand600, ColorKt.Critical600, ColorKt.Neutral900, ColorKt.Neutral700, ColorKt.Neutral500, ColorKt.Neutral0, ColorKt.Brand200, ColorKt.Critical500, null);
    private static final LinkColors colorsDark = new LinkColors(ColorKt.Neutral900, ColorKt.Neutral800, ColorKt.Neutral700, ColorKt.Neutral900, ColorKt.Neutral900, ColorKt.Brand200, ColorKt.Critical500, ColorKt.Neutral200, ColorKt.Neutral800, ColorKt.Brand200, ColorKt.Critical600, ColorKt.Neutral0, ColorKt.Neutral300, ColorKt.Neutral400, ColorKt.Neutral0, ColorKt.Brand200, ColorKt.Critical400, ColorKt.Neutral100, ColorKt.Neutral500, ColorKt.Neutral500, ColorKt.Neutral0, ColorKt.Brand200, ColorKt.Critical500, null);

    private LinkThemeConfig() {
    }

    public final LinkColors colors(boolean isDark) {
        return isDark ? colorsDark : colorsLight;
    }

    /* renamed from: getContentOnPrimaryButton-vNxB06k$paymentsheet_release, reason: not valid java name */
    public final long m7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release(LinkColors contentOnPrimaryButton) {
        Intrinsics.checkNotNullParameter(contentOnPrimaryButton, "$this$contentOnPrimaryButton");
        return ColorKt.Neutral900;
    }

    /* renamed from: getSeparatorOnPrimaryButton-vNxB06k$paymentsheet_release, reason: not valid java name */
    public final long m7815getSeparatorOnPrimaryButtonvNxB06k$paymentsheet_release(LinkColors separatorOnPrimaryButton) {
        Intrinsics.checkNotNullParameter(separatorOnPrimaryButton, "$this$separatorOnPrimaryButton");
        return ColorKt.Brand400;
    }

    public final RadioButtonColors getRadioButtonColors(LinkColors linkColors, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(linkColors, "<this>");
        composer.startReplaceGroup(968482484);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(968482484, i, -1, "com.stripe.android.link.theme.LinkThemeConfig.<get-radioButtonColors> (Color.kt:136)");
        }
        RadioButtonDefaults radioButtonDefaults = RadioButtonDefaults.INSTANCE;
        long jM7794getButtonBrand0d7_KjU = LinkTheme.INSTANCE.getColors(composer, 6).m7794getButtonBrand0d7_KjU();
        composer.startReplaceGroup(-36536838);
        long jM7792getBorderDefault0d7_KjU = DarkThemeKt.isSystemInDarkTheme(composer, 0) ? ColorKt.Neutral700 : LinkTheme.INSTANCE.getColors(composer, 6).m7792getBorderDefault0d7_KjU();
        composer.endReplaceGroup();
        RadioButtonColors radioButtonColorsM1977colorsRGew2ao = radioButtonDefaults.m1977colorsRGew2ao(jM7794getButtonBrand0d7_KjU, jM7792getBorderDefault0d7_KjU, 0L, composer, RadioButtonDefaults.$stable << 9, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return radioButtonColorsM1977colorsRGew2ao;
    }
}
