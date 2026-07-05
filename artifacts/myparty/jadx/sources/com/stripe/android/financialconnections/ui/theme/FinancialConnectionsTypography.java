package com.stripe.android.financialconnections.ui.theme;

import androidx.compose.ui.text.TextStyle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Type.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00062"}, d2 = {"Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;", "", "headingXLarge", "Landroidx/compose/ui/text/TextStyle;", "headingXLargeSubdued", "headingLarge", "headingMedium", "bodyMediumEmphasized", "bodyMedium", "bodySmall", "labelLargeEmphasized", "labelLarge", "labelMediumEmphasized", "labelMedium", "labelSmall", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getHeadingXLarge", "()Landroidx/compose/ui/text/TextStyle;", "getHeadingXLargeSubdued", "getHeadingLarge", "getHeadingMedium", "getBodyMediumEmphasized", "getBodyMedium", "getBodySmall", "getLabelLargeEmphasized", "getLabelLarge", "getLabelMediumEmphasized", "getLabelMedium", "getLabelSmall", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsTypography {
    public static final int $stable = 0;
    private final TextStyle bodyMedium;
    private final TextStyle bodyMediumEmphasized;
    private final TextStyle bodySmall;
    private final TextStyle headingLarge;
    private final TextStyle headingMedium;
    private final TextStyle headingXLarge;
    private final TextStyle headingXLargeSubdued;
    private final TextStyle labelLarge;
    private final TextStyle labelLargeEmphasized;
    private final TextStyle labelMedium;
    private final TextStyle labelMediumEmphasized;
    private final TextStyle labelSmall;

    public static /* synthetic */ FinancialConnectionsTypography copy$default(FinancialConnectionsTypography financialConnectionsTypography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle = financialConnectionsTypography.headingXLarge;
        }
        if ((i & 2) != 0) {
            textStyle2 = financialConnectionsTypography.headingXLargeSubdued;
        }
        if ((i & 4) != 0) {
            textStyle3 = financialConnectionsTypography.headingLarge;
        }
        if ((i & 8) != 0) {
            textStyle4 = financialConnectionsTypography.headingMedium;
        }
        if ((i & 16) != 0) {
            textStyle5 = financialConnectionsTypography.bodyMediumEmphasized;
        }
        if ((i & 32) != 0) {
            textStyle6 = financialConnectionsTypography.bodyMedium;
        }
        if ((i & 64) != 0) {
            textStyle7 = financialConnectionsTypography.bodySmall;
        }
        if ((i & 128) != 0) {
            textStyle8 = financialConnectionsTypography.labelLargeEmphasized;
        }
        if ((i & 256) != 0) {
            textStyle9 = financialConnectionsTypography.labelLarge;
        }
        if ((i & 512) != 0) {
            textStyle10 = financialConnectionsTypography.labelMediumEmphasized;
        }
        if ((i & 1024) != 0) {
            textStyle11 = financialConnectionsTypography.labelMedium;
        }
        if ((i & 2048) != 0) {
            textStyle12 = financialConnectionsTypography.labelSmall;
        }
        TextStyle textStyle13 = textStyle11;
        TextStyle textStyle14 = textStyle12;
        TextStyle textStyle15 = textStyle9;
        TextStyle textStyle16 = textStyle10;
        TextStyle textStyle17 = textStyle7;
        TextStyle textStyle18 = textStyle8;
        TextStyle textStyle19 = textStyle5;
        TextStyle textStyle20 = textStyle6;
        return financialConnectionsTypography.copy(textStyle, textStyle2, textStyle3, textStyle4, textStyle19, textStyle20, textStyle17, textStyle18, textStyle15, textStyle16, textStyle13, textStyle14);
    }

    /* renamed from: component1, reason: from getter */
    public final TextStyle getHeadingXLarge() {
        return this.headingXLarge;
    }

    /* renamed from: component10, reason: from getter */
    public final TextStyle getLabelMediumEmphasized() {
        return this.labelMediumEmphasized;
    }

    /* renamed from: component11, reason: from getter */
    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    /* renamed from: component12, reason: from getter */
    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    /* renamed from: component2, reason: from getter */
    public final TextStyle getHeadingXLargeSubdued() {
        return this.headingXLargeSubdued;
    }

    /* renamed from: component3, reason: from getter */
    public final TextStyle getHeadingLarge() {
        return this.headingLarge;
    }

    /* renamed from: component4, reason: from getter */
    public final TextStyle getHeadingMedium() {
        return this.headingMedium;
    }

    /* renamed from: component5, reason: from getter */
    public final TextStyle getBodyMediumEmphasized() {
        return this.bodyMediumEmphasized;
    }

    /* renamed from: component6, reason: from getter */
    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    /* renamed from: component7, reason: from getter */
    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    /* renamed from: component8, reason: from getter */
    public final TextStyle getLabelLargeEmphasized() {
        return this.labelLargeEmphasized;
    }

    /* renamed from: component9, reason: from getter */
    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    public final FinancialConnectionsTypography copy(TextStyle headingXLarge, TextStyle headingXLargeSubdued, TextStyle headingLarge, TextStyle headingMedium, TextStyle bodyMediumEmphasized, TextStyle bodyMedium, TextStyle bodySmall, TextStyle labelLargeEmphasized, TextStyle labelLarge, TextStyle labelMediumEmphasized, TextStyle labelMedium, TextStyle labelSmall) {
        Intrinsics.checkNotNullParameter(headingXLarge, "headingXLarge");
        Intrinsics.checkNotNullParameter(headingXLargeSubdued, "headingXLargeSubdued");
        Intrinsics.checkNotNullParameter(headingLarge, "headingLarge");
        Intrinsics.checkNotNullParameter(headingMedium, "headingMedium");
        Intrinsics.checkNotNullParameter(bodyMediumEmphasized, "bodyMediumEmphasized");
        Intrinsics.checkNotNullParameter(bodyMedium, "bodyMedium");
        Intrinsics.checkNotNullParameter(bodySmall, "bodySmall");
        Intrinsics.checkNotNullParameter(labelLargeEmphasized, "labelLargeEmphasized");
        Intrinsics.checkNotNullParameter(labelLarge, "labelLarge");
        Intrinsics.checkNotNullParameter(labelMediumEmphasized, "labelMediumEmphasized");
        Intrinsics.checkNotNullParameter(labelMedium, "labelMedium");
        Intrinsics.checkNotNullParameter(labelSmall, "labelSmall");
        return new FinancialConnectionsTypography(headingXLarge, headingXLargeSubdued, headingLarge, headingMedium, bodyMediumEmphasized, bodyMedium, bodySmall, labelLargeEmphasized, labelLarge, labelMediumEmphasized, labelMedium, labelSmall);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsTypography)) {
            return false;
        }
        FinancialConnectionsTypography financialConnectionsTypography = (FinancialConnectionsTypography) other;
        return Intrinsics.areEqual(this.headingXLarge, financialConnectionsTypography.headingXLarge) && Intrinsics.areEqual(this.headingXLargeSubdued, financialConnectionsTypography.headingXLargeSubdued) && Intrinsics.areEqual(this.headingLarge, financialConnectionsTypography.headingLarge) && Intrinsics.areEqual(this.headingMedium, financialConnectionsTypography.headingMedium) && Intrinsics.areEqual(this.bodyMediumEmphasized, financialConnectionsTypography.bodyMediumEmphasized) && Intrinsics.areEqual(this.bodyMedium, financialConnectionsTypography.bodyMedium) && Intrinsics.areEqual(this.bodySmall, financialConnectionsTypography.bodySmall) && Intrinsics.areEqual(this.labelLargeEmphasized, financialConnectionsTypography.labelLargeEmphasized) && Intrinsics.areEqual(this.labelLarge, financialConnectionsTypography.labelLarge) && Intrinsics.areEqual(this.labelMediumEmphasized, financialConnectionsTypography.labelMediumEmphasized) && Intrinsics.areEqual(this.labelMedium, financialConnectionsTypography.labelMedium) && Intrinsics.areEqual(this.labelSmall, financialConnectionsTypography.labelSmall);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.headingXLarge.hashCode() * 31) + this.headingXLargeSubdued.hashCode()) * 31) + this.headingLarge.hashCode()) * 31) + this.headingMedium.hashCode()) * 31) + this.bodyMediumEmphasized.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLargeEmphasized.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMediumEmphasized.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode();
    }

    public String toString() {
        return "FinancialConnectionsTypography(headingXLarge=" + this.headingXLarge + ", headingXLargeSubdued=" + this.headingXLargeSubdued + ", headingLarge=" + this.headingLarge + ", headingMedium=" + this.headingMedium + ", bodyMediumEmphasized=" + this.bodyMediumEmphasized + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLargeEmphasized=" + this.labelLargeEmphasized + ", labelLarge=" + this.labelLarge + ", labelMediumEmphasized=" + this.labelMediumEmphasized + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ")";
    }

    public FinancialConnectionsTypography(TextStyle headingXLarge, TextStyle headingXLargeSubdued, TextStyle headingLarge, TextStyle headingMedium, TextStyle bodyMediumEmphasized, TextStyle bodyMedium, TextStyle bodySmall, TextStyle labelLargeEmphasized, TextStyle labelLarge, TextStyle labelMediumEmphasized, TextStyle labelMedium, TextStyle labelSmall) {
        Intrinsics.checkNotNullParameter(headingXLarge, "headingXLarge");
        Intrinsics.checkNotNullParameter(headingXLargeSubdued, "headingXLargeSubdued");
        Intrinsics.checkNotNullParameter(headingLarge, "headingLarge");
        Intrinsics.checkNotNullParameter(headingMedium, "headingMedium");
        Intrinsics.checkNotNullParameter(bodyMediumEmphasized, "bodyMediumEmphasized");
        Intrinsics.checkNotNullParameter(bodyMedium, "bodyMedium");
        Intrinsics.checkNotNullParameter(bodySmall, "bodySmall");
        Intrinsics.checkNotNullParameter(labelLargeEmphasized, "labelLargeEmphasized");
        Intrinsics.checkNotNullParameter(labelLarge, "labelLarge");
        Intrinsics.checkNotNullParameter(labelMediumEmphasized, "labelMediumEmphasized");
        Intrinsics.checkNotNullParameter(labelMedium, "labelMedium");
        Intrinsics.checkNotNullParameter(labelSmall, "labelSmall");
        this.headingXLarge = headingXLarge;
        this.headingXLargeSubdued = headingXLargeSubdued;
        this.headingLarge = headingLarge;
        this.headingMedium = headingMedium;
        this.bodyMediumEmphasized = bodyMediumEmphasized;
        this.bodyMedium = bodyMedium;
        this.bodySmall = bodySmall;
        this.labelLargeEmphasized = labelLargeEmphasized;
        this.labelLarge = labelLarge;
        this.labelMediumEmphasized = labelMediumEmphasized;
        this.labelMedium = labelMedium;
        this.labelSmall = labelSmall;
    }

    public final TextStyle getHeadingXLarge() {
        return this.headingXLarge;
    }

    public final TextStyle getHeadingXLargeSubdued() {
        return this.headingXLargeSubdued;
    }

    public final TextStyle getHeadingLarge() {
        return this.headingLarge;
    }

    public final TextStyle getHeadingMedium() {
        return this.headingMedium;
    }

    public final TextStyle getBodyMediumEmphasized() {
        return this.bodyMediumEmphasized;
    }

    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public final TextStyle getLabelLargeEmphasized() {
        return this.labelLargeEmphasized;
    }

    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    public final TextStyle getLabelMediumEmphasized() {
        return this.labelMediumEmphasized;
    }

    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }
}
