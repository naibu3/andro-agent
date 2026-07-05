package com.google.accompanist.themeadapter.core;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceUtils.kt */
@Deprecated(message = "\n   ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;", "", ViewProps.FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;)V", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "themeadapter-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FontFamilyWithWeight {
    public static final int $stable = 0;
    private final FontFamily fontFamily;
    private final FontWeight weight;

    public static /* synthetic */ FontFamilyWithWeight copy$default(FontFamilyWithWeight fontFamilyWithWeight, FontFamily fontFamily, FontWeight fontWeight, int i, Object obj) {
        if ((i & 1) != 0) {
            fontFamily = fontFamilyWithWeight.fontFamily;
        }
        if ((i & 2) != 0) {
            fontWeight = fontFamilyWithWeight.weight;
        }
        return fontFamilyWithWeight.copy(fontFamily, fontWeight);
    }

    /* renamed from: component1, reason: from getter */
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: component2, reason: from getter */
    public final FontWeight getWeight() {
        return this.weight;
    }

    public final FontFamilyWithWeight copy(FontFamily fontFamily, FontWeight weight) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new FontFamilyWithWeight(fontFamily, weight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FontFamilyWithWeight)) {
            return false;
        }
        FontFamilyWithWeight fontFamilyWithWeight = (FontFamilyWithWeight) other;
        return Intrinsics.areEqual(this.fontFamily, fontFamilyWithWeight.fontFamily) && Intrinsics.areEqual(this.weight, fontFamilyWithWeight.weight);
    }

    public int hashCode() {
        return (this.fontFamily.hashCode() * 31) + this.weight.hashCode();
    }

    public String toString() {
        return "FontFamilyWithWeight(fontFamily=" + this.fontFamily + ", weight=" + this.weight + ')';
    }

    public FontFamilyWithWeight(FontFamily fontFamily, FontWeight weight) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(weight, "weight");
        this.fontFamily = fontFamily;
        this.weight = weight;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public /* synthetic */ FontFamilyWithWeight(FontFamily fontFamily, FontWeight fontWeight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, (i & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight);
    }

    public final FontWeight getWeight() {
        return this.weight;
    }
}
