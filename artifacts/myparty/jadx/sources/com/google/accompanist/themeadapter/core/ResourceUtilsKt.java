package com.google.accompanist.themeadapter.core;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.CutCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.TypedArrayKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ResourceUtils.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002\u001a*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0007\u001a4\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007\u001a(\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0016\u0010!\u001a\u0004\u0018\u00010\"*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007\u001a\u0016\u0010#\u001a\u0004\u0018\u00010$*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007\u001a0\u0010%\u001a\u00020&*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010'\u001a\u00020&H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0016\u0010*\u001a\u0004\u0018\u00010\u0019*\u00020+2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0003\u001a\u00020\u0004*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"tempTypedValue", "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "complexUnitCompat", "", "getComplexUnitCompat", "(Landroid/util/TypedValue;)I", "fontWeightOf", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "parseShapeAppearance", "Landroidx/compose/foundation/shape/CornerBasedShape;", "context", "Landroid/content/Context;", "id", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "fallbackShape", "parseTextAppearance", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "setTextColors", "", "defaultFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "parseColor", "Landroidx/compose/ui/graphics/Color;", "Landroid/content/res/TypedArray;", "index", "fallbackColor", "parseColor-mxwnekA", "(Landroid/content/res/TypedArray;IJ)J", "parseCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "parseFontFamily", "Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;", "parseTextUnit", "Landroidx/compose/ui/unit/TextUnit;", "fallbackTextUnit", "parseTextUnit-lGoEivg", "(Landroid/content/res/TypedArray;ILandroidx/compose/ui/unit/Density;J)J", "parseXmlFontFamily", "Landroid/content/res/Resources;", "themeadapter-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ResourceUtilsKt {
    private static final ThreadLocal<TypedValue> tempTypedValue = new ThreadLocal<>();

    /* renamed from: parseColor-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ long m7003parseColormxwnekA$default(TypedArray typedArray, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = Color.INSTANCE.m3693getUnspecified0d7_KjU();
        }
        return m7002parseColormxwnekA(typedArray, i, j);
    }

    @Deprecated(message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
    /* renamed from: parseColor-mxwnekA, reason: not valid java name */
    public static final long m7002parseColormxwnekA(TypedArray parseColor, int i, long j) {
        Intrinsics.checkNotNullParameter(parseColor, "$this$parseColor");
        return parseColor.hasValue(i) ? ColorKt.Color(TypedArrayKt.getColorOrThrow(parseColor, i)) : j;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    @Deprecated(message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TextStyle parseTextAppearance(Context context, int i, Density density, boolean z, FontFamily fontFamily) throws Resources.NotFoundException {
        TypedArray typedArray;
        long jM3693getUnspecified0d7_KjU;
        FontFamily fontFamily2;
        int iM5719getNormal_LCdwA;
        FontWeight fontWeight;
        FontWeight weight;
        long jM7003parseColormxwnekA$default;
        Shadow shadow;
        long em;
        GenericFontFamily monospace;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(density, "density");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.ThemeAdapterTextAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.ThemeAdapterTextAppearance_android_textStyle, -1);
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.ThemeAdapterTextAppearance_android_textFontWeight, -1);
        int i4 = typedArrayObtainStyledAttributes.getInt(R.styleable.ThemeAdapterTextAppearance_android_typeface, -1);
        FontFamilyWithWeight fontFamily3 = parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_fontFamily);
        if (fontFamily3 == null) {
            fontFamily3 = parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterTextAppearance_android_fontFamily);
        }
        FontFamilyWithWeight fontFamilyWithWeight = fontFamily3;
        if (z) {
            typedArray = typedArrayObtainStyledAttributes;
            jM3693getUnspecified0d7_KjU = m7003parseColormxwnekA$default(typedArray, R.styleable.ThemeAdapterTextAppearance_android_textColor, 0L, 2, null);
        } else {
            typedArray = typedArrayObtainStyledAttributes;
            jM3693getUnspecified0d7_KjU = Color.INSTANCE.m3693getUnspecified0d7_KjU();
        }
        long j = jM3693getUnspecified0d7_KjU;
        TypedArray typedArray2 = typedArray;
        long jM7005parseTextUnitlGoEivg$default = m7005parseTextUnitlGoEivg$default(typedArray2, R.styleable.ThemeAdapterTextAppearance_android_textSize, density, 0L, 4, null);
        long jM7004parseTextUnitlGoEivg = m7004parseTextUnitlGoEivg(typedArray2, R.styleable.ThemeAdapterTextAppearance_lineHeight, density, m7005parseTextUnitlGoEivg$default(typedArray2, R.styleable.ThemeAdapterTextAppearance_android_lineHeight, density, 0L, 4, null));
        if (fontFamily == null) {
            if (fontFamilyWithWeight != null) {
                monospace = fontFamilyWithWeight.getFontFamily();
            } else if (i4 == 1) {
                monospace = FontFamily.INSTANCE.getSansSerif();
            } else if (i4 == 2) {
                monospace = FontFamily.INSTANCE.getSerif();
            } else if (i4 == 3) {
                monospace = FontFamily.INSTANCE.getMonospace();
            } else {
                fontFamily2 = null;
            }
            fontFamily2 = monospace;
        } else {
            fontFamily2 = fontFamily;
        }
        if ((i2 & 2) != 0) {
            iM5719getNormal_LCdwA = FontStyle.INSTANCE.m5718getItalic_LCdwA();
        } else {
            iM5719getNormal_LCdwA = FontStyle.INSTANCE.m5719getNormal_LCdwA();
        }
        int i5 = iM5719getNormal_LCdwA;
        if (i3 >= 0 && i3 < 150) {
            weight = FontWeight.INSTANCE.getW100();
        } else if (150 <= i3 && i3 < 250) {
            weight = FontWeight.INSTANCE.getW200();
        } else if (250 <= i3 && i3 < 350) {
            weight = FontWeight.INSTANCE.getW300();
        } else if (350 <= i3 && i3 < 450) {
            weight = FontWeight.INSTANCE.getW400();
        } else if (450 <= i3 && i3 < 550) {
            weight = FontWeight.INSTANCE.getW500();
        } else if (550 <= i3 && i3 < 650) {
            weight = FontWeight.INSTANCE.getW600();
        } else if (650 <= i3 && i3 < 750) {
            weight = FontWeight.INSTANCE.getW700();
        } else if (750 <= i3 && i3 < 850) {
            weight = FontWeight.INSTANCE.getW800();
        } else if (850 <= i3 && i3 < 1000) {
            weight = FontWeight.INSTANCE.getW900();
        } else if ((1 & i2) != 0) {
            weight = FontWeight.INSTANCE.getBold();
        } else if (fontFamilyWithWeight != null) {
            weight = fontFamilyWithWeight.getWeight();
        } else {
            fontWeight = null;
            String string = typedArray2.getString(R.styleable.ThemeAdapterTextAppearance_android_fontFeatureSettings);
            jM7003parseColormxwnekA$default = m7003parseColormxwnekA$default(typedArray2, R.styleable.ThemeAdapterTextAppearance_android_shadowColor, 0L, 2, null);
            if (Color.m3658equalsimpl0(jM7003parseColormxwnekA$default, Color.INSTANCE.m3693getUnspecified0d7_KjU())) {
                shadow = new Shadow(jM7003parseColormxwnekA$default, OffsetKt.Offset(typedArray2.getFloat(R.styleable.ThemeAdapterTextAppearance_android_shadowDx, 0.0f), typedArray2.getFloat(R.styleable.ThemeAdapterTextAppearance_android_shadowDy, 0.0f)), typedArray2.getFloat(R.styleable.ThemeAdapterTextAppearance_android_shadowRadius, 0.0f), null);
            } else {
                shadow = null;
            }
            if (!typedArray2.hasValue(R.styleable.ThemeAdapterTextAppearance_android_letterSpacing)) {
                em = TextUnitKt.getEm(typedArray2.getFloat(R.styleable.ThemeAdapterTextAppearance_android_letterSpacing, 0.0f));
            } else {
                em = TextUnitKt.getEm(0);
            }
            TextStyle textStyle = new TextStyle(j, jM7005parseTextUnitlGoEivg$default, fontWeight, FontStyle.m5709boximpl(i5), (FontSynthesis) null, fontFamily2, string, em, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, shadow, (DrawStyle) null, 0, 0, jM7004parseTextUnitlGoEivg, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16637712, (DefaultConstructorMarker) null);
            typedArray2.recycle();
            return textStyle;
        }
        fontWeight = weight;
        String string2 = typedArray2.getString(R.styleable.ThemeAdapterTextAppearance_android_fontFeatureSettings);
        jM7003parseColormxwnekA$default = m7003parseColormxwnekA$default(typedArray2, R.styleable.ThemeAdapterTextAppearance_android_shadowColor, 0L, 2, null);
        if (Color.m3658equalsimpl0(jM7003parseColormxwnekA$default, Color.INSTANCE.m3693getUnspecified0d7_KjU())) {
        }
        if (!typedArray2.hasValue(R.styleable.ThemeAdapterTextAppearance_android_letterSpacing)) {
        }
        TextStyle textStyle2 = new TextStyle(j, jM7005parseTextUnitlGoEivg$default, fontWeight, FontStyle.m5709boximpl(i5), (FontSynthesis) null, fontFamily2, string2, em, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, shadow, (DrawStyle) null, 0, 0, jM7004parseTextUnitlGoEivg, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16637712, (DefaultConstructorMarker) null);
        typedArray2.recycle();
        return textStyle2;
    }

    @Deprecated(message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
    public static final FontFamilyWithWeight parseFontFamily(TypedArray typedArray, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        ThreadLocal<TypedValue> threadLocal = tempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (typedArray.getValue(i, typedValue2) && typedValue2.type == 3) {
            CharSequence charSequence = typedValue2.string;
            if (Intrinsics.areEqual(charSequence, "sans-serif")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), null, 2, null);
            }
            if (Intrinsics.areEqual(charSequence, "sans-serif-thin")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), FontWeight.INSTANCE.getThin());
            }
            if (Intrinsics.areEqual(charSequence, "sans-serif-light")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), FontWeight.INSTANCE.getLight());
            }
            if (Intrinsics.areEqual(charSequence, "sans-serif-medium")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), FontWeight.INSTANCE.getMedium());
            }
            if (Intrinsics.areEqual(charSequence, "sans-serif-black")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSansSerif(), FontWeight.INSTANCE.getBlack());
            }
            if (Intrinsics.areEqual(charSequence, "serif")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getSerif(), null, 2, null);
            }
            if (Intrinsics.areEqual(charSequence, "cursive")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getCursive(), null, 2, null);
            }
            if (Intrinsics.areEqual(charSequence, "monospace")) {
                return new FontFamilyWithWeight(FontFamily.INSTANCE.getMonospace(), null, 2, null);
            }
            if (typedValue2.resourceId != 0) {
                CharSequence string = typedValue2.string;
                Intrinsics.checkNotNullExpressionValue(string, "string");
                if (StringsKt.startsWith$default(string, (CharSequence) "res/", false, 2, (Object) null)) {
                    CharSequence string2 = typedValue2.string;
                    Intrinsics.checkNotNullExpressionValue(string2, "string");
                    if (StringsKt.endsWith$default(string2, (CharSequence) ".xml", false, 2, (Object) null)) {
                        Resources resources = typedArray.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        FontFamily xmlFontFamily = parseXmlFontFamily(resources, typedValue2.resourceId);
                        if (xmlFontFamily != null) {
                            return new FontFamilyWithWeight(xmlFontFamily, null, 2, null);
                        }
                        return null;
                    }
                    return new FontFamilyWithWeight(FontKt.toFontFamily(FontKt.m5695FontYpTlLL0$default(typedValue2.resourceId, null, 0, 0, 14, null)), null, 2, null);
                }
            }
        }
        return null;
    }

    @Deprecated(message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
    public static final FontFamily parseXmlFontFamily(Resources resources, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        XmlResourceParser xml = resources.getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "getXml(...)");
        try {
            FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry = FontResourcesParserCompat.parse(xml, resources);
            if (!(familyResourceEntry instanceof FontResourcesParserCompat.FontFamilyFilesResourceEntry)) {
                xml.close();
                return null;
            }
            FontResourcesParserCompat.FontFileResourceEntry[] entries = ((FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry).getEntries();
            Intrinsics.checkNotNullExpressionValue(entries, "getEntries(...)");
            FontResourcesParserCompat.FontFileResourceEntry[] fontFileResourceEntryArr = entries;
            ArrayList arrayList = new ArrayList(fontFileResourceEntryArr.length);
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFileResourceEntryArr) {
                arrayList.add(FontKt.m5695FontYpTlLL0$default(fontFileResourceEntry.getResourceId(), fontWeightOf(fontFileResourceEntry.getWeight()), fontFileResourceEntry.isItalic() ? FontStyle.INSTANCE.m5718getItalic_LCdwA() : FontStyle.INSTANCE.m5719getNormal_LCdwA(), 0, 8, null));
            }
            return FontFamilyKt.FontFamily(arrayList);
        } finally {
            xml.close();
        }
    }

    private static final FontWeight fontWeightOf(int i) {
        if (i >= 0 && i < 150) {
            return FontWeight.INSTANCE.getW100();
        }
        if (150 <= i && i < 250) {
            return FontWeight.INSTANCE.getW200();
        }
        if (250 <= i && i < 350) {
            return FontWeight.INSTANCE.getW300();
        }
        if (350 <= i && i < 450) {
            return FontWeight.INSTANCE.getW400();
        }
        if (450 <= i && i < 550) {
            return FontWeight.INSTANCE.getW500();
        }
        if (550 <= i && i < 650) {
            return FontWeight.INSTANCE.getW600();
        }
        if (650 <= i && i < 750) {
            return FontWeight.INSTANCE.getW700();
        }
        if (750 <= i && i < 850) {
            return FontWeight.INSTANCE.getW800();
        }
        if (850 <= i && i < 1000) {
            return FontWeight.INSTANCE.getW900();
        }
        return FontWeight.INSTANCE.getW400();
    }

    /* renamed from: parseTextUnit-lGoEivg$default, reason: not valid java name */
    public static /* synthetic */ long m7005parseTextUnitlGoEivg$default(TypedArray typedArray, int i, Density density, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE();
        }
        return m7004parseTextUnitlGoEivg(typedArray, i, density, j);
    }

    @Deprecated(message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
    /* renamed from: parseTextUnit-lGoEivg, reason: not valid java name */
    public static final long m7004parseTextUnitlGoEivg(TypedArray parseTextUnit, int i, Density density, long j) {
        Intrinsics.checkNotNullParameter(parseTextUnit, "$this$parseTextUnit");
        Intrinsics.checkNotNullParameter(density, "density");
        ThreadLocal<TypedValue> threadLocal = tempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!parseTextUnit.getValue(i, typedValue2) || typedValue2.type != 5) {
            return j;
        }
        int complexUnit = typedValue2.getComplexUnit();
        if (complexUnit == 1) {
            return TextUnitKt.getEm(TypedValue.complexToFloat(typedValue2.data));
        }
        if (complexUnit == 2) {
            return TextUnitKt.getSp(TypedValue.complexToFloat(typedValue2.data));
        }
        return density.mo715toSpkPz2Gy4(parseTextUnit.getDimension(i, 0.0f));
    }

    @Deprecated(message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
    public static final CornerBasedShape parseShapeAppearance(Context context, int i, LayoutDirection layoutDirection, CornerBasedShape fallbackShape) throws Resources.NotFoundException {
        RoundedCornerShape roundedCornerShape;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(fallbackShape, "fallbackShape");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.ThemeAdapterShapeAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        CornerSize cornerSize = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSize);
        CornerSize cornerSize2 = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSizeTopLeft);
        CornerSize cornerSize3 = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSizeTopRight);
        CornerSize cornerSize4 = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSizeBottomLeft);
        CornerSize cornerSize5 = parseCornerSize(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterShapeAppearance_cornerSizeBottomRight);
        boolean z = layoutDirection == LayoutDirection.Rtl;
        CornerSize topStart = z ? cornerSize3 : cornerSize2;
        if (!z) {
            cornerSize2 = cornerSize3;
        }
        CornerSize cornerSize6 = z ? cornerSize5 : cornerSize4;
        if (!z) {
            cornerSize4 = cornerSize5;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.ThemeAdapterShapeAppearance_cornerFamily, 0);
        if (i2 == 0) {
            if (topStart == null) {
                topStart = cornerSize == null ? fallbackShape.getTopStart() : cornerSize;
            }
            if (cornerSize2 == null) {
                cornerSize2 = cornerSize == null ? fallbackShape.getTopEnd() : cornerSize;
            }
            if (cornerSize4 == null) {
                cornerSize4 = cornerSize == null ? fallbackShape.getBottomEnd() : cornerSize;
            }
            if (cornerSize6 != null) {
                cornerSize = cornerSize6;
            } else if (cornerSize == null) {
                cornerSize = fallbackShape.getBottomStart();
            }
            roundedCornerShape = new RoundedCornerShape(topStart, cornerSize2, cornerSize4, cornerSize);
        } else if (i2 == 1) {
            if (topStart == null) {
                topStart = cornerSize == null ? fallbackShape.getTopStart() : cornerSize;
            }
            if (cornerSize2 == null) {
                cornerSize2 = cornerSize == null ? fallbackShape.getTopEnd() : cornerSize;
            }
            if (cornerSize4 == null) {
                cornerSize4 = cornerSize == null ? fallbackShape.getBottomEnd() : cornerSize;
            }
            if (cornerSize6 != null) {
                cornerSize = cornerSize6;
            } else if (cornerSize == null) {
                cornerSize = fallbackShape.getBottomStart();
            }
            roundedCornerShape = new CutCornerShape(topStart, cornerSize2, cornerSize4, cornerSize);
        } else {
            throw new IllegalArgumentException("Unknown cornerFamily set in ShapeAppearance");
        }
        typedArrayObtainStyledAttributes.recycle();
        return roundedCornerShape;
    }

    @Deprecated(message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
    public static final CornerSize parseCornerSize(TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        ThreadLocal<TypedValue> threadLocal = tempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!typedArray.getValue(i, typedValue2)) {
            return null;
        }
        int i2 = typedValue2.type;
        if (i2 != 5) {
            if (i2 != 6) {
                return null;
            }
            return CornerSizeKt.CornerSize(typedValue2.getFraction(1.0f, 1.0f));
        }
        int complexUnit = typedValue2.getComplexUnit();
        if (complexUnit == 0) {
            return CornerSizeKt.CornerSize(TypedValue.complexToFloat(typedValue2.data));
        }
        if (complexUnit == 1) {
            return CornerSizeKt.m1295CornerSize0680j_4(Dp.m6117constructorimpl(TypedValue.complexToFloat(typedValue2.data)));
        }
        return CornerSizeKt.CornerSize(typedArray.getDimensionPixelSize(i, 0));
    }

    private static final int getComplexUnitCompat(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }
}
