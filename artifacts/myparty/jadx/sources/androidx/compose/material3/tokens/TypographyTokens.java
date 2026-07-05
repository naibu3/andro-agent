package androidx.compose.material3.tokens;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TypographyTokens.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006¨\u0006#"}, d2 = {"Landroidx/compose/material3/tokens/TypographyTokens;", "", "()V", "BodyLarge", "Landroidx/compose/ui/text/TextStyle;", "getBodyLarge", "()Landroidx/compose/ui/text/TextStyle;", "BodyMedium", "getBodyMedium", "BodySmall", "getBodySmall", "DisplayLarge", "getDisplayLarge", "DisplayMedium", "getDisplayMedium", "DisplaySmall", "getDisplaySmall", "HeadlineLarge", "getHeadlineLarge", "HeadlineMedium", "getHeadlineMedium", "HeadlineSmall", "getHeadlineSmall", "LabelLarge", "getLabelLarge", "LabelMedium", "getLabelMedium", "LabelSmall", "getLabelSmall", "TitleLarge", "getTitleLarge", "TitleMedium", "getTitleMedium", "TitleSmall", "getTitleSmall", "material3_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TypographyTokens {
    private static final TextStyle BodyLarge;
    private static final TextStyle BodyMedium;
    private static final TextStyle BodySmall;
    private static final TextStyle DisplayLarge;
    private static final TextStyle DisplayMedium;
    private static final TextStyle DisplaySmall;
    private static final TextStyle HeadlineLarge;
    private static final TextStyle HeadlineMedium;
    private static final TextStyle HeadlineSmall;
    public static final TypographyTokens INSTANCE = new TypographyTokens();
    private static final TextStyle LabelLarge;
    private static final TextStyle LabelMedium;
    private static final TextStyle LabelSmall;
    private static final TextStyle TitleLarge;
    private static final TextStyle TitleMedium;
    private static final TextStyle TitleSmall;

    private TypographyTokens() {
    }

    public final TextStyle getBodyLarge() {
        return BodyLarge;
    }

    static {
        GenericFontFamily bodyLargeFont = TypeScaleTokens.INSTANCE.getBodyLargeFont();
        int i = 196441;
        DefaultConstructorMarker defaultConstructorMarker = null;
        long j = 0;
        FontStyle fontStyle = null;
        FontSynthesis fontSynthesis = null;
        String str = null;
        BaselineShift baselineShift = null;
        TextGeometricTransform textGeometricTransform = null;
        LocaleList localeList = null;
        long j2 = 0;
        TextDecoration textDecoration = null;
        Shadow shadow = null;
        TextAlign textAlign = null;
        TextDirection textDirection = null;
        TextIndent textIndent = null;
        BodyLarge = new TextStyle(j, TypeScaleTokens.INSTANCE.m3069getBodyLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyLargeWeight(), fontStyle, fontSynthesis, bodyLargeFont, str, TypeScaleTokens.INSTANCE.m3070getBodyLargeTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3068getBodyLargeLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily bodyMediumFont = TypeScaleTokens.INSTANCE.getBodyMediumFont();
        BodyMedium = new TextStyle(j, TypeScaleTokens.INSTANCE.m3072getBodyMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyMediumWeight(), fontStyle, fontSynthesis, bodyMediumFont, str, TypeScaleTokens.INSTANCE.m3073getBodyMediumTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3071getBodyMediumLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily bodySmallFont = TypeScaleTokens.INSTANCE.getBodySmallFont();
        BodySmall = new TextStyle(j, TypeScaleTokens.INSTANCE.m3075getBodySmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodySmallWeight(), fontStyle, fontSynthesis, bodySmallFont, str, TypeScaleTokens.INSTANCE.m3076getBodySmallTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3074getBodySmallLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily displayLargeFont = TypeScaleTokens.INSTANCE.getDisplayLargeFont();
        DisplayLarge = new TextStyle(j, TypeScaleTokens.INSTANCE.m3078getDisplayLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayLargeWeight(), fontStyle, fontSynthesis, displayLargeFont, str, TypeScaleTokens.INSTANCE.m3079getDisplayLargeTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3077getDisplayLargeLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily displayMediumFont = TypeScaleTokens.INSTANCE.getDisplayMediumFont();
        DisplayMedium = new TextStyle(j, TypeScaleTokens.INSTANCE.m3081getDisplayMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayMediumWeight(), fontStyle, fontSynthesis, displayMediumFont, str, TypeScaleTokens.INSTANCE.m3082getDisplayMediumTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3080getDisplayMediumLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily displaySmallFont = TypeScaleTokens.INSTANCE.getDisplaySmallFont();
        DisplaySmall = new TextStyle(j, TypeScaleTokens.INSTANCE.m3084getDisplaySmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplaySmallWeight(), fontStyle, fontSynthesis, displaySmallFont, str, TypeScaleTokens.INSTANCE.m3085getDisplaySmallTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3083getDisplaySmallLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily headlineLargeFont = TypeScaleTokens.INSTANCE.getHeadlineLargeFont();
        HeadlineLarge = new TextStyle(j, TypeScaleTokens.INSTANCE.m3087getHeadlineLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineLargeWeight(), fontStyle, fontSynthesis, headlineLargeFont, str, TypeScaleTokens.INSTANCE.m3088getHeadlineLargeTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3086getHeadlineLargeLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily headlineMediumFont = TypeScaleTokens.INSTANCE.getHeadlineMediumFont();
        HeadlineMedium = new TextStyle(j, TypeScaleTokens.INSTANCE.m3090getHeadlineMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineMediumWeight(), fontStyle, fontSynthesis, headlineMediumFont, str, TypeScaleTokens.INSTANCE.m3091getHeadlineMediumTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3089getHeadlineMediumLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily headlineSmallFont = TypeScaleTokens.INSTANCE.getHeadlineSmallFont();
        HeadlineSmall = new TextStyle(j, TypeScaleTokens.INSTANCE.m3093getHeadlineSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineSmallWeight(), fontStyle, fontSynthesis, headlineSmallFont, str, TypeScaleTokens.INSTANCE.m3094getHeadlineSmallTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3092getHeadlineSmallLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily labelLargeFont = TypeScaleTokens.INSTANCE.getLabelLargeFont();
        LabelLarge = new TextStyle(j, TypeScaleTokens.INSTANCE.m3096getLabelLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelLargeWeight(), fontStyle, fontSynthesis, labelLargeFont, str, TypeScaleTokens.INSTANCE.m3097getLabelLargeTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3095getLabelLargeLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily labelMediumFont = TypeScaleTokens.INSTANCE.getLabelMediumFont();
        LabelMedium = new TextStyle(j, TypeScaleTokens.INSTANCE.m3099getLabelMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelMediumWeight(), fontStyle, fontSynthesis, labelMediumFont, str, TypeScaleTokens.INSTANCE.m3100getLabelMediumTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3098getLabelMediumLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily labelSmallFont = TypeScaleTokens.INSTANCE.getLabelSmallFont();
        LabelSmall = new TextStyle(j, TypeScaleTokens.INSTANCE.m3102getLabelSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelSmallWeight(), fontStyle, fontSynthesis, labelSmallFont, str, TypeScaleTokens.INSTANCE.m3103getLabelSmallTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3101getLabelSmallLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily titleLargeFont = TypeScaleTokens.INSTANCE.getTitleLargeFont();
        TitleLarge = new TextStyle(j, TypeScaleTokens.INSTANCE.m3105getTitleLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleLargeWeight(), fontStyle, fontSynthesis, titleLargeFont, str, TypeScaleTokens.INSTANCE.m3106getTitleLargeTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3104getTitleLargeLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily titleMediumFont = TypeScaleTokens.INSTANCE.getTitleMediumFont();
        TitleMedium = new TextStyle(j, TypeScaleTokens.INSTANCE.m3108getTitleMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleMediumWeight(), fontStyle, fontSynthesis, titleMediumFont, str, TypeScaleTokens.INSTANCE.m3109getTitleMediumTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3107getTitleMediumLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
        GenericFontFamily titleSmallFont = TypeScaleTokens.INSTANCE.getTitleSmallFont();
        TitleSmall = new TextStyle(j, TypeScaleTokens.INSTANCE.m3111getTitleSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleSmallWeight(), fontStyle, fontSynthesis, titleSmallFont, str, TypeScaleTokens.INSTANCE.m3112getTitleSmallTrackingXSAIIZE(), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, textAlign, textDirection, TypeScaleTokens.INSTANCE.m3110getTitleSmallLineHeightXSAIIZE(), textIndent, i, defaultConstructorMarker);
    }

    public final TextStyle getBodyMedium() {
        return BodyMedium;
    }

    public final TextStyle getBodySmall() {
        return BodySmall;
    }

    public final TextStyle getDisplayLarge() {
        return DisplayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return DisplayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return DisplaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return HeadlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return HeadlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return HeadlineSmall;
    }

    public final TextStyle getLabelLarge() {
        return LabelLarge;
    }

    public final TextStyle getLabelMedium() {
        return LabelMedium;
    }

    public final TextStyle getLabelSmall() {
        return LabelSmall;
    }

    public final TextStyle getTitleLarge() {
        return TitleLarge;
    }

    public final TextStyle getTitleMedium() {
        return TitleMedium;
    }

    public final TextStyle getTitleSmall() {
        return TitleSmall;
    }
}
