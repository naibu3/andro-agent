package com.stripe.android.uicore;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\u0010\u00109\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b:\u0010\"J\u0010\u0010;\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b<\u0010\"J\u0010\u0010=\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b>\u0010\"J\u0010\u0010?\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b@\u0010\"J\u0010\u0010A\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bB\u0010\"J\u0010\u0010C\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bD\u0010\"J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010F\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0013HÆ\u0003JÔ\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\t\u0010T\u001a\u00020UHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u00020\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0013\u0010\u000b\u001a\u00020\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b%\u0010\"R\u0013\u0010\f\u001a\u00020\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0013\u0010\r\u001a\u00020\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u0013\u0010\u000e\u001a\u00020\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b(\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/¨\u0006V"}, d2 = {"Lcom/stripe/android/uicore/StripeTypography;", "", "fontWeightNormal", "", "fontWeightMedium", "fontWeightBold", "fontSizeMultiplier", "", "xxSmallFontSize", "Landroidx/compose/ui/unit/TextUnit;", "xSmallFontSize", "smallFontSize", "mediumFontSize", "largeFontSize", "xLargeFontSize", ViewProps.FONT_FAMILY, "h4", "Landroidx/compose/ui/text/TextStyle;", "body1FontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "body2FontFamily", "h5FontFamily", "h6FontFamily", "subtitle1FontFamily", "captionFontFamily", "<init>", "(IIIFJJJJJJLjava/lang/Integer;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFontWeightNormal", "()I", "getFontWeightMedium", "getFontWeightBold", "getFontSizeMultiplier", "()F", "getXxSmallFontSize-XSAIIZE", "()J", "J", "getXSmallFontSize-XSAIIZE", "getSmallFontSize-XSAIIZE", "getMediumFontSize-XSAIIZE", "getLargeFontSize-XSAIIZE", "getXLargeFontSize-XSAIIZE", "getFontFamily", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getH4", "()Landroidx/compose/ui/text/TextStyle;", "getBody1FontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getBody2FontFamily", "getH5FontFamily", "getH6FontFamily", "getSubtitle1FontFamily", "getCaptionFontFamily", "component1", "component2", "component3", "component4", "component5", "component5-XSAIIZE", "component6", "component6-XSAIIZE", "component7", "component7-XSAIIZE", "component8", "component8-XSAIIZE", "component9", "component9-XSAIIZE", "component10", "component10-XSAIIZE", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "copy-BZCqYng", "(IIIFJJJJJJLjava/lang/Integer;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;)Lcom/stripe/android/uicore/StripeTypography;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StripeTypography {
    public static final int $stable = 0;
    private final FontFamily body1FontFamily;
    private final FontFamily body2FontFamily;
    private final FontFamily captionFontFamily;
    private final Integer fontFamily;
    private final float fontSizeMultiplier;
    private final int fontWeightBold;
    private final int fontWeightMedium;
    private final int fontWeightNormal;
    private final TextStyle h4;
    private final FontFamily h5FontFamily;
    private final FontFamily h6FontFamily;
    private final long largeFontSize;
    private final long mediumFontSize;
    private final long smallFontSize;
    private final FontFamily subtitle1FontFamily;
    private final long xLargeFontSize;
    private final long xSmallFontSize;
    private final long xxSmallFontSize;

    public /* synthetic */ StripeTypography(int i, int i2, int i3, float f, long j, long j2, long j3, long j4, long j5, long j6, Integer num, TextStyle textStyle, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, f, j, j2, j3, j4, j5, j6, num, textStyle, fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6);
    }

    /* renamed from: copy-BZCqYng$default, reason: not valid java name */
    public static /* synthetic */ StripeTypography m8746copyBZCqYng$default(StripeTypography stripeTypography, int i, int i2, int i3, float f, long j, long j2, long j3, long j4, long j5, long j6, Integer num, TextStyle textStyle, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, int i4, Object obj) {
        FontFamily fontFamily7;
        FontFamily fontFamily8;
        int i5 = (i4 & 1) != 0 ? stripeTypography.fontWeightNormal : i;
        int i6 = (i4 & 2) != 0 ? stripeTypography.fontWeightMedium : i2;
        int i7 = (i4 & 4) != 0 ? stripeTypography.fontWeightBold : i3;
        float f2 = (i4 & 8) != 0 ? stripeTypography.fontSizeMultiplier : f;
        long j7 = (i4 & 16) != 0 ? stripeTypography.xxSmallFontSize : j;
        long j8 = (i4 & 32) != 0 ? stripeTypography.xSmallFontSize : j2;
        long j9 = (i4 & 64) != 0 ? stripeTypography.smallFontSize : j3;
        long j10 = (i4 & 128) != 0 ? stripeTypography.mediumFontSize : j4;
        long j11 = (i4 & 256) != 0 ? stripeTypography.largeFontSize : j5;
        int i8 = i5;
        int i9 = i6;
        long j12 = (i4 & 512) != 0 ? stripeTypography.xLargeFontSize : j6;
        Integer num2 = (i4 & 1024) != 0 ? stripeTypography.fontFamily : num;
        TextStyle textStyle2 = (i4 & 2048) != 0 ? stripeTypography.h4 : textStyle;
        Integer num3 = num2;
        FontFamily fontFamily9 = (i4 & 4096) != 0 ? stripeTypography.body1FontFamily : fontFamily;
        FontFamily fontFamily10 = (i4 & 8192) != 0 ? stripeTypography.body2FontFamily : fontFamily2;
        FontFamily fontFamily11 = (i4 & 16384) != 0 ? stripeTypography.h5FontFamily : fontFamily3;
        FontFamily fontFamily12 = (i4 & 32768) != 0 ? stripeTypography.h6FontFamily : fontFamily4;
        FontFamily fontFamily13 = (i4 & 65536) != 0 ? stripeTypography.subtitle1FontFamily : fontFamily5;
        if ((i4 & 131072) != 0) {
            fontFamily8 = fontFamily13;
            fontFamily7 = stripeTypography.captionFontFamily;
        } else {
            fontFamily7 = fontFamily6;
            fontFamily8 = fontFamily13;
        }
        return stripeTypography.m8753copyBZCqYng(i8, i9, i7, f2, j7, j8, j9, j10, j11, j12, num3, textStyle2, fontFamily9, fontFamily10, fontFamily11, fontFamily12, fontFamily8, fontFamily7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFontWeightNormal() {
        return this.fontWeightNormal;
    }

    /* renamed from: component10-XSAIIZE, reason: not valid java name and from getter */
    public final long getXLargeFontSize() {
        return this.xLargeFontSize;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: component12, reason: from getter */
    public final TextStyle getH4() {
        return this.h4;
    }

    /* renamed from: component13, reason: from getter */
    public final FontFamily getBody1FontFamily() {
        return this.body1FontFamily;
    }

    /* renamed from: component14, reason: from getter */
    public final FontFamily getBody2FontFamily() {
        return this.body2FontFamily;
    }

    /* renamed from: component15, reason: from getter */
    public final FontFamily getH5FontFamily() {
        return this.h5FontFamily;
    }

    /* renamed from: component16, reason: from getter */
    public final FontFamily getH6FontFamily() {
        return this.h6FontFamily;
    }

    /* renamed from: component17, reason: from getter */
    public final FontFamily getSubtitle1FontFamily() {
        return this.subtitle1FontFamily;
    }

    /* renamed from: component18, reason: from getter */
    public final FontFamily getCaptionFontFamily() {
        return this.captionFontFamily;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFontWeightMedium() {
        return this.fontWeightMedium;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFontWeightBold() {
        return this.fontWeightBold;
    }

    /* renamed from: component4, reason: from getter */
    public final float getFontSizeMultiplier() {
        return this.fontSizeMultiplier;
    }

    /* renamed from: component5-XSAIIZE, reason: not valid java name and from getter */
    public final long getXxSmallFontSize() {
        return this.xxSmallFontSize;
    }

    /* renamed from: component6-XSAIIZE, reason: not valid java name and from getter */
    public final long getXSmallFontSize() {
        return this.xSmallFontSize;
    }

    /* renamed from: component7-XSAIIZE, reason: not valid java name and from getter */
    public final long getSmallFontSize() {
        return this.smallFontSize;
    }

    /* renamed from: component8-XSAIIZE, reason: not valid java name and from getter */
    public final long getMediumFontSize() {
        return this.mediumFontSize;
    }

    /* renamed from: component9-XSAIIZE, reason: not valid java name and from getter */
    public final long getLargeFontSize() {
        return this.largeFontSize;
    }

    /* renamed from: copy-BZCqYng, reason: not valid java name */
    public final StripeTypography m8753copyBZCqYng(int fontWeightNormal, int fontWeightMedium, int fontWeightBold, float fontSizeMultiplier, long xxSmallFontSize, long xSmallFontSize, long smallFontSize, long mediumFontSize, long largeFontSize, long xLargeFontSize, Integer fontFamily, TextStyle h4, FontFamily body1FontFamily, FontFamily body2FontFamily, FontFamily h5FontFamily, FontFamily h6FontFamily, FontFamily subtitle1FontFamily, FontFamily captionFontFamily) {
        return new StripeTypography(fontWeightNormal, fontWeightMedium, fontWeightBold, fontSizeMultiplier, xxSmallFontSize, xSmallFontSize, smallFontSize, mediumFontSize, largeFontSize, xLargeFontSize, fontFamily, h4, body1FontFamily, body2FontFamily, h5FontFamily, h6FontFamily, subtitle1FontFamily, captionFontFamily, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeTypography)) {
            return false;
        }
        StripeTypography stripeTypography = (StripeTypography) other;
        return this.fontWeightNormal == stripeTypography.fontWeightNormal && this.fontWeightMedium == stripeTypography.fontWeightMedium && this.fontWeightBold == stripeTypography.fontWeightBold && Float.compare(this.fontSizeMultiplier, stripeTypography.fontSizeMultiplier) == 0 && TextUnit.m6307equalsimpl0(this.xxSmallFontSize, stripeTypography.xxSmallFontSize) && TextUnit.m6307equalsimpl0(this.xSmallFontSize, stripeTypography.xSmallFontSize) && TextUnit.m6307equalsimpl0(this.smallFontSize, stripeTypography.smallFontSize) && TextUnit.m6307equalsimpl0(this.mediumFontSize, stripeTypography.mediumFontSize) && TextUnit.m6307equalsimpl0(this.largeFontSize, stripeTypography.largeFontSize) && TextUnit.m6307equalsimpl0(this.xLargeFontSize, stripeTypography.xLargeFontSize) && Intrinsics.areEqual(this.fontFamily, stripeTypography.fontFamily) && Intrinsics.areEqual(this.h4, stripeTypography.h4) && Intrinsics.areEqual(this.body1FontFamily, stripeTypography.body1FontFamily) && Intrinsics.areEqual(this.body2FontFamily, stripeTypography.body2FontFamily) && Intrinsics.areEqual(this.h5FontFamily, stripeTypography.h5FontFamily) && Intrinsics.areEqual(this.h6FontFamily, stripeTypography.h6FontFamily) && Intrinsics.areEqual(this.subtitle1FontFamily, stripeTypography.subtitle1FontFamily) && Intrinsics.areEqual(this.captionFontFamily, stripeTypography.captionFontFamily);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((Integer.hashCode(this.fontWeightNormal) * 31) + Integer.hashCode(this.fontWeightMedium)) * 31) + Integer.hashCode(this.fontWeightBold)) * 31) + Float.hashCode(this.fontSizeMultiplier)) * 31) + TextUnit.m6311hashCodeimpl(this.xxSmallFontSize)) * 31) + TextUnit.m6311hashCodeimpl(this.xSmallFontSize)) * 31) + TextUnit.m6311hashCodeimpl(this.smallFontSize)) * 31) + TextUnit.m6311hashCodeimpl(this.mediumFontSize)) * 31) + TextUnit.m6311hashCodeimpl(this.largeFontSize)) * 31) + TextUnit.m6311hashCodeimpl(this.xLargeFontSize)) * 31;
        Integer num = this.fontFamily;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        TextStyle textStyle = this.h4;
        int iHashCode3 = (iHashCode2 + (textStyle == null ? 0 : textStyle.hashCode())) * 31;
        FontFamily fontFamily = this.body1FontFamily;
        int iHashCode4 = (iHashCode3 + (fontFamily == null ? 0 : fontFamily.hashCode())) * 31;
        FontFamily fontFamily2 = this.body2FontFamily;
        int iHashCode5 = (iHashCode4 + (fontFamily2 == null ? 0 : fontFamily2.hashCode())) * 31;
        FontFamily fontFamily3 = this.h5FontFamily;
        int iHashCode6 = (iHashCode5 + (fontFamily3 == null ? 0 : fontFamily3.hashCode())) * 31;
        FontFamily fontFamily4 = this.h6FontFamily;
        int iHashCode7 = (iHashCode6 + (fontFamily4 == null ? 0 : fontFamily4.hashCode())) * 31;
        FontFamily fontFamily5 = this.subtitle1FontFamily;
        int iHashCode8 = (iHashCode7 + (fontFamily5 == null ? 0 : fontFamily5.hashCode())) * 31;
        FontFamily fontFamily6 = this.captionFontFamily;
        return iHashCode8 + (fontFamily6 != null ? fontFamily6.hashCode() : 0);
    }

    public String toString() {
        return "StripeTypography(fontWeightNormal=" + this.fontWeightNormal + ", fontWeightMedium=" + this.fontWeightMedium + ", fontWeightBold=" + this.fontWeightBold + ", fontSizeMultiplier=" + this.fontSizeMultiplier + ", xxSmallFontSize=" + TextUnit.m6317toStringimpl(this.xxSmallFontSize) + ", xSmallFontSize=" + TextUnit.m6317toStringimpl(this.xSmallFontSize) + ", smallFontSize=" + TextUnit.m6317toStringimpl(this.smallFontSize) + ", mediumFontSize=" + TextUnit.m6317toStringimpl(this.mediumFontSize) + ", largeFontSize=" + TextUnit.m6317toStringimpl(this.largeFontSize) + ", xLargeFontSize=" + TextUnit.m6317toStringimpl(this.xLargeFontSize) + ", fontFamily=" + this.fontFamily + ", h4=" + this.h4 + ", body1FontFamily=" + this.body1FontFamily + ", body2FontFamily=" + this.body2FontFamily + ", h5FontFamily=" + this.h5FontFamily + ", h6FontFamily=" + this.h6FontFamily + ", subtitle1FontFamily=" + this.subtitle1FontFamily + ", captionFontFamily=" + this.captionFontFamily + ")";
    }

    private StripeTypography(int i, int i2, int i3, float f, long j, long j2, long j3, long j4, long j5, long j6, Integer num, TextStyle textStyle, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6) {
        this.fontWeightNormal = i;
        this.fontWeightMedium = i2;
        this.fontWeightBold = i3;
        this.fontSizeMultiplier = f;
        this.xxSmallFontSize = j;
        this.xSmallFontSize = j2;
        this.smallFontSize = j3;
        this.mediumFontSize = j4;
        this.largeFontSize = j5;
        this.xLargeFontSize = j6;
        this.fontFamily = num;
        this.h4 = textStyle;
        this.body1FontFamily = fontFamily;
        this.body2FontFamily = fontFamily2;
        this.h5FontFamily = fontFamily3;
        this.h6FontFamily = fontFamily4;
        this.subtitle1FontFamily = fontFamily5;
        this.captionFontFamily = fontFamily6;
    }

    public /* synthetic */ StripeTypography(int i, int i2, int i3, float f, long j, long j2, long j3, long j4, long j5, long j6, Integer num, TextStyle textStyle, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, f, j, j2, j3, j4, j5, j6, num, (i4 & 2048) != 0 ? null : textStyle, (i4 & 4096) != 0 ? null : fontFamily, (i4 & 8192) != 0 ? null : fontFamily2, (i4 & 16384) != 0 ? null : fontFamily3, (32768 & i4) != 0 ? null : fontFamily4, (65536 & i4) != 0 ? null : fontFamily5, (i4 & 131072) != 0 ? null : fontFamily6, null);
    }

    public final int getFontWeightNormal() {
        return this.fontWeightNormal;
    }

    public final int getFontWeightMedium() {
        return this.fontWeightMedium;
    }

    public final int getFontWeightBold() {
        return this.fontWeightBold;
    }

    public final float getFontSizeMultiplier() {
        return this.fontSizeMultiplier;
    }

    /* renamed from: getXxSmallFontSize-XSAIIZE, reason: not valid java name */
    public final long m8759getXxSmallFontSizeXSAIIZE() {
        return this.xxSmallFontSize;
    }

    /* renamed from: getXSmallFontSize-XSAIIZE, reason: not valid java name */
    public final long m8758getXSmallFontSizeXSAIIZE() {
        return this.xSmallFontSize;
    }

    /* renamed from: getSmallFontSize-XSAIIZE, reason: not valid java name */
    public final long m8756getSmallFontSizeXSAIIZE() {
        return this.smallFontSize;
    }

    /* renamed from: getMediumFontSize-XSAIIZE, reason: not valid java name */
    public final long m8755getMediumFontSizeXSAIIZE() {
        return this.mediumFontSize;
    }

    /* renamed from: getLargeFontSize-XSAIIZE, reason: not valid java name */
    public final long m8754getLargeFontSizeXSAIIZE() {
        return this.largeFontSize;
    }

    /* renamed from: getXLargeFontSize-XSAIIZE, reason: not valid java name */
    public final long m8757getXLargeFontSizeXSAIIZE() {
        return this.xLargeFontSize;
    }

    public final Integer getFontFamily() {
        return this.fontFamily;
    }

    public final TextStyle getH4() {
        return this.h4;
    }

    public final FontFamily getBody1FontFamily() {
        return this.body1FontFamily;
    }

    public final FontFamily getBody2FontFamily() {
        return this.body2FontFamily;
    }

    public final FontFamily getH5FontFamily() {
        return this.h5FontFamily;
    }

    public final FontFamily getH6FontFamily() {
        return this.h6FontFamily;
    }

    public final FontFamily getSubtitle1FontFamily() {
        return this.subtitle1FontFamily;
    }

    public final FontFamily getCaptionFontFamily() {
        return this.captionFontFamily;
    }
}
