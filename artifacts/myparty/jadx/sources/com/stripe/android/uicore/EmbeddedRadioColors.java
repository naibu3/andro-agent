package com.stripe.android.uicore;

import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/uicore/EmbeddedRadioColors;", "", PaymentSheetAppearanceKeys.SEPARATOR_COLOR, "Landroidx/compose/ui/graphics/Color;", PaymentSheetAppearanceKeys.SELECTED_COLOR, PaymentSheetAppearanceKeys.UNSELECTED_COLOR, "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSeparatorColor-0d7_KjU", "()J", "J", "getSelectedColor-0d7_KjU", "getUnselectedColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/stripe/android/uicore/EmbeddedRadioColors;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EmbeddedRadioColors {
    public static final int $stable = 0;
    private final long selectedColor;
    private final long separatorColor;
    private final long unselectedColor;

    public /* synthetic */ EmbeddedRadioColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ EmbeddedRadioColors m8689copyysEtTa8$default(EmbeddedRadioColors embeddedRadioColors, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = embeddedRadioColors.separatorColor;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = embeddedRadioColors.selectedColor;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = embeddedRadioColors.unselectedColor;
        }
        return embeddedRadioColors.m8693copyysEtTa8(j4, j5, j3);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getSeparatorColor() {
        return this.separatorColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedColor() {
        return this.selectedColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedColor() {
        return this.unselectedColor;
    }

    /* renamed from: copy-ysEtTa8, reason: not valid java name */
    public final EmbeddedRadioColors m8693copyysEtTa8(long separatorColor, long selectedColor, long unselectedColor) {
        return new EmbeddedRadioColors(separatorColor, selectedColor, unselectedColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedRadioColors)) {
            return false;
        }
        EmbeddedRadioColors embeddedRadioColors = (EmbeddedRadioColors) other;
        return Color.m3658equalsimpl0(this.separatorColor, embeddedRadioColors.separatorColor) && Color.m3658equalsimpl0(this.selectedColor, embeddedRadioColors.selectedColor) && Color.m3658equalsimpl0(this.unselectedColor, embeddedRadioColors.unselectedColor);
    }

    public int hashCode() {
        return (((Color.m3664hashCodeimpl(this.separatorColor) * 31) + Color.m3664hashCodeimpl(this.selectedColor)) * 31) + Color.m3664hashCodeimpl(this.unselectedColor);
    }

    public String toString() {
        return "EmbeddedRadioColors(separatorColor=" + Color.m3665toStringimpl(this.separatorColor) + ", selectedColor=" + Color.m3665toStringimpl(this.selectedColor) + ", unselectedColor=" + Color.m3665toStringimpl(this.unselectedColor) + ")";
    }

    private EmbeddedRadioColors(long j, long j2, long j3) {
        this.separatorColor = j;
        this.selectedColor = j2;
        this.unselectedColor = j3;
    }

    /* renamed from: getSeparatorColor-0d7_KjU, reason: not valid java name */
    public final long m8695getSeparatorColor0d7_KjU() {
        return this.separatorColor;
    }

    /* renamed from: getSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m8694getSelectedColor0d7_KjU() {
        return this.selectedColor;
    }

    /* renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m8696getUnselectedColor0d7_KjU() {
        return this.unselectedColor;
    }
}
