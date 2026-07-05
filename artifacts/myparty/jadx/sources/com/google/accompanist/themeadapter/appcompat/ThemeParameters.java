package com.google.accompanist.themeadapter.appcompat;

import androidx.compose.material.Colors;
import androidx.compose.material.Typography;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppCompatTheme.kt */
@Deprecated(message = "\n   AppCompat ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;", "", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;)V", "getColors", "()Landroidx/compose/material/Colors;", "getTypography", "()Landroidx/compose/material/Typography;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "themeadapter-appcompat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ThemeParameters {
    public static final int $stable = 0;
    private final Colors colors;
    private final Typography typography;

    public static /* synthetic */ ThemeParameters copy$default(ThemeParameters themeParameters, Colors colors, Typography typography, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = themeParameters.colors;
        }
        if ((i & 2) != 0) {
            typography = themeParameters.typography;
        }
        return themeParameters.copy(colors, typography);
    }

    /* renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* renamed from: component2, reason: from getter */
    public final Typography getTypography() {
        return this.typography;
    }

    public final ThemeParameters copy(Colors colors, Typography typography) {
        return new ThemeParameters(colors, typography);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeParameters)) {
            return false;
        }
        ThemeParameters themeParameters = (ThemeParameters) other;
        return Intrinsics.areEqual(this.colors, themeParameters.colors) && Intrinsics.areEqual(this.typography, themeParameters.typography);
    }

    public int hashCode() {
        Colors colors = this.colors;
        int iHashCode = (colors == null ? 0 : colors.hashCode()) * 31;
        Typography typography = this.typography;
        return iHashCode + (typography != null ? typography.hashCode() : 0);
    }

    public String toString() {
        return "ThemeParameters(colors=" + this.colors + ", typography=" + this.typography + ')';
    }

    public ThemeParameters(Colors colors, Typography typography) {
        this.colors = colors;
        this.typography = typography;
    }

    public final Colors getColors() {
        return this.colors;
    }

    public final Typography getTypography() {
        return this.typography;
    }
}
