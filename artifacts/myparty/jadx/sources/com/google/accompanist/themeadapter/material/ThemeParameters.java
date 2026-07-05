package com.google.accompanist.themeadapter.material;

import androidx.compose.material.Colors;
import androidx.compose.material.Shapes;
import androidx.compose.material.Typography;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MdcTheme.kt */
@Deprecated(message = "\n   Material ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-material/\n")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/google/accompanist/themeadapter/material/ThemeParameters;", "", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", PaymentSheetAppearanceKeys.SHAPES, "Landroidx/compose/material/Shapes;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;)V", "getColors", "()Landroidx/compose/material/Colors;", "getShapes", "()Landroidx/compose/material/Shapes;", "getTypography", "()Landroidx/compose/material/Typography;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "themeadapter-material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ThemeParameters {
    public static final int $stable = 0;
    private final Colors colors;
    private final Shapes shapes;
    private final Typography typography;

    public static /* synthetic */ ThemeParameters copy$default(ThemeParameters themeParameters, Colors colors, Typography typography, Shapes shapes, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = themeParameters.colors;
        }
        if ((i & 2) != 0) {
            typography = themeParameters.typography;
        }
        if ((i & 4) != 0) {
            shapes = themeParameters.shapes;
        }
        return themeParameters.copy(colors, typography, shapes);
    }

    /* renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* renamed from: component2, reason: from getter */
    public final Typography getTypography() {
        return this.typography;
    }

    /* renamed from: component3, reason: from getter */
    public final Shapes getShapes() {
        return this.shapes;
    }

    public final ThemeParameters copy(Colors colors, Typography typography, Shapes shapes) {
        return new ThemeParameters(colors, typography, shapes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeParameters)) {
            return false;
        }
        ThemeParameters themeParameters = (ThemeParameters) other;
        return Intrinsics.areEqual(this.colors, themeParameters.colors) && Intrinsics.areEqual(this.typography, themeParameters.typography) && Intrinsics.areEqual(this.shapes, themeParameters.shapes);
    }

    public int hashCode() {
        Colors colors = this.colors;
        int iHashCode = (colors == null ? 0 : colors.hashCode()) * 31;
        Typography typography = this.typography;
        int iHashCode2 = (iHashCode + (typography == null ? 0 : typography.hashCode())) * 31;
        Shapes shapes = this.shapes;
        return iHashCode2 + (shapes != null ? shapes.hashCode() : 0);
    }

    public String toString() {
        return "ThemeParameters(colors=" + this.colors + ", typography=" + this.typography + ", shapes=" + this.shapes + ')';
    }

    public ThemeParameters(Colors colors, Typography typography, Shapes shapes) {
        this.colors = colors;
        this.typography = typography;
        this.shapes = shapes;
    }

    public final Colors getColors() {
        return this.colors;
    }

    public final Typography getTypography() {
        return this.typography;
    }

    public final Shapes getShapes() {
        return this.shapes;
    }
}
