package com.stripe.android.uicore;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.analytics.AnalyticsKtxKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/uicore/PrimaryButtonStyle;", "", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/uicore/PrimaryButtonColors;", AnalyticsKtxKt.FIELD_COLORS_DARK, "shape", "Lcom/stripe/android/uicore/PrimaryButtonShape;", "typography", "Lcom/stripe/android/uicore/PrimaryButtonTypography;", "<init>", "(Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonColors;Lcom/stripe/android/uicore/PrimaryButtonShape;Lcom/stripe/android/uicore/PrimaryButtonTypography;)V", "getColorsLight", "()Lcom/stripe/android/uicore/PrimaryButtonColors;", "getColorsDark", "getShape", "()Lcom/stripe/android/uicore/PrimaryButtonShape;", "getTypography", "()Lcom/stripe/android/uicore/PrimaryButtonTypography;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrimaryButtonStyle {
    public static final int $stable = 0;
    private final PrimaryButtonColors colorsDark;
    private final PrimaryButtonColors colorsLight;
    private final PrimaryButtonShape shape;
    private final PrimaryButtonTypography typography;

    public static /* synthetic */ PrimaryButtonStyle copy$default(PrimaryButtonStyle primaryButtonStyle, PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i, Object obj) {
        if ((i & 1) != 0) {
            primaryButtonColors = primaryButtonStyle.colorsLight;
        }
        if ((i & 2) != 0) {
            primaryButtonColors2 = primaryButtonStyle.colorsDark;
        }
        if ((i & 4) != 0) {
            primaryButtonShape = primaryButtonStyle.shape;
        }
        if ((i & 8) != 0) {
            primaryButtonTypography = primaryButtonStyle.typography;
        }
        return primaryButtonStyle.copy(primaryButtonColors, primaryButtonColors2, primaryButtonShape, primaryButtonTypography);
    }

    /* renamed from: component1, reason: from getter */
    public final PrimaryButtonColors getColorsLight() {
        return this.colorsLight;
    }

    /* renamed from: component2, reason: from getter */
    public final PrimaryButtonColors getColorsDark() {
        return this.colorsDark;
    }

    /* renamed from: component3, reason: from getter */
    public final PrimaryButtonShape getShape() {
        return this.shape;
    }

    /* renamed from: component4, reason: from getter */
    public final PrimaryButtonTypography getTypography() {
        return this.typography;
    }

    public final PrimaryButtonStyle copy(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(typography, "typography");
        return new PrimaryButtonStyle(colorsLight, colorsDark, shape, typography);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryButtonStyle)) {
            return false;
        }
        PrimaryButtonStyle primaryButtonStyle = (PrimaryButtonStyle) other;
        return Intrinsics.areEqual(this.colorsLight, primaryButtonStyle.colorsLight) && Intrinsics.areEqual(this.colorsDark, primaryButtonStyle.colorsDark) && Intrinsics.areEqual(this.shape, primaryButtonStyle.shape) && Intrinsics.areEqual(this.typography, primaryButtonStyle.typography);
    }

    public int hashCode() {
        return (((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.typography.hashCode();
    }

    public String toString() {
        return "PrimaryButtonStyle(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", shape=" + this.shape + ", typography=" + this.typography + ")";
    }

    public PrimaryButtonStyle(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(typography, "typography");
        this.colorsLight = colorsLight;
        this.colorsDark = colorsDark;
        this.shape = shape;
        this.typography = typography;
    }

    public final PrimaryButtonColors getColorsLight() {
        return this.colorsLight;
    }

    public final PrimaryButtonColors getColorsDark() {
        return this.colorsDark;
    }

    public final PrimaryButtonShape getShape() {
        return this.shape;
    }

    public final PrimaryButtonTypography getTypography() {
        return this.typography;
    }
}
