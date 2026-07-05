package com.stripe.android.link.theme;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Type.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\b\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"linkTypography", "Lcom/stripe/android/link/theme/LinkTypography;", "getLinkTypography", "()Lcom/stripe/android/link/theme/LinkTypography;", "appBarTitle", "Landroidx/compose/ui/text/TextStyle;", "getAppBarTitle", "(Lcom/stripe/android/link/theme/LinkTypography;)Landroidx/compose/ui/text/TextStyle;", "toCompat", "useDefaultLineHeight", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypeKt {
    private static final LinkTypography linkTypography;

    static {
        SystemFontFamily systemFontFamily = FontFamily.INSTANCE.getDefault();
        TextStyle compat$default = toCompat$default(new TextStyle(0L, TextUnitKt.getSp(24), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, systemFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(32), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), false, 1, null);
        SystemFontFamily systemFontFamily2 = FontFamily.INSTANCE.getDefault();
        TextStyle compat$default2 = toCompat$default(new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, systemFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), false, 1, null);
        SystemFontFamily systemFontFamily3 = FontFamily.INSTANCE.getDefault();
        TextStyle compat$default3 = toCompat$default(new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, systemFontFamily3, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), false, 1, null);
        SystemFontFamily systemFontFamily4 = FontFamily.INSTANCE.getDefault();
        TextStyle compat$default4 = toCompat$default(new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, systemFontFamily4, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), false, 1, null);
        SystemFontFamily systemFontFamily5 = FontFamily.INSTANCE.getDefault();
        TextStyle compat$default5 = toCompat$default(new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, systemFontFamily5, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), false, 1, null);
        SystemFontFamily systemFontFamily6 = FontFamily.INSTANCE.getDefault();
        TextStyle compat$default6 = toCompat$default(new TextStyle(0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, systemFontFamily6, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), false, 1, null);
        SystemFontFamily systemFontFamily7 = FontFamily.INSTANCE.getDefault();
        linkTypography = new LinkTypography(compat$default, compat$default2, compat$default3, compat$default4, compat$default5, compat$default6, toCompat$default(new TextStyle(0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, systemFontFamily7, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), false, 1, null));
    }

    public static final LinkTypography getLinkTypography() {
        return linkTypography;
    }

    public static final TextStyle getAppBarTitle(LinkTypography linkTypography2) {
        Intrinsics.checkNotNullParameter(linkTypography2, "<this>");
        SystemFontFamily systemFontFamily = FontFamily.INSTANCE.getDefault();
        return toCompat$default(new TextStyle(0L, TextUnitKt.getSp(18), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, systemFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), false, 1, null);
    }

    static /* synthetic */ TextStyle toCompat$default(TextStyle textStyle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toCompat(textStyle, z);
    }

    private static final TextStyle toCompat(TextStyle textStyle, boolean z) {
        long jM5641getLineHeightXSAIIZE;
        if (z) {
            jM5641getLineHeightXSAIIZE = TextStyle.INSTANCE.getDefault().m5641getLineHeightXSAIIZE();
        } else {
            jM5641getLineHeightXSAIIZE = textStyle.m5641getLineHeightXSAIIZE();
        }
        return TextStyle.m5615copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, jM5641getLineHeightXSAIIZE, null, new PlatformTextStyle(true), TextStyle.INSTANCE.getDefault().getLineHeightStyle(), 0, 0, null, 15073279, null);
    }
}
