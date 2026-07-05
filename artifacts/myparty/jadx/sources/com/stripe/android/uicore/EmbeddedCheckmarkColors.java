package com.stripe.android.uicore;

import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/uicore/EmbeddedCheckmarkColors;", "", PaymentSheetAppearanceKeys.SEPARATOR_COLOR, "Landroidx/compose/ui/graphics/Color;", "checkmarkColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSeparatorColor-0d7_KjU", "()J", "J", "getCheckmarkColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/stripe/android/uicore/EmbeddedCheckmarkColors;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EmbeddedCheckmarkColors {
    public static final int $stable = 0;
    private final long checkmarkColor;
    private final long separatorColor;

    public /* synthetic */ EmbeddedCheckmarkColors(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ EmbeddedCheckmarkColors m8677copyOWjLjI$default(EmbeddedCheckmarkColors embeddedCheckmarkColors, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = embeddedCheckmarkColors.separatorColor;
        }
        if ((i & 2) != 0) {
            j2 = embeddedCheckmarkColors.checkmarkColor;
        }
        return embeddedCheckmarkColors.m8680copyOWjLjI(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getSeparatorColor() {
        return this.separatorColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckmarkColor() {
        return this.checkmarkColor;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final EmbeddedCheckmarkColors m8680copyOWjLjI(long separatorColor, long checkmarkColor) {
        return new EmbeddedCheckmarkColors(separatorColor, checkmarkColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedCheckmarkColors)) {
            return false;
        }
        EmbeddedCheckmarkColors embeddedCheckmarkColors = (EmbeddedCheckmarkColors) other;
        return Color.m3658equalsimpl0(this.separatorColor, embeddedCheckmarkColors.separatorColor) && Color.m3658equalsimpl0(this.checkmarkColor, embeddedCheckmarkColors.checkmarkColor);
    }

    public int hashCode() {
        return (Color.m3664hashCodeimpl(this.separatorColor) * 31) + Color.m3664hashCodeimpl(this.checkmarkColor);
    }

    public String toString() {
        return "EmbeddedCheckmarkColors(separatorColor=" + Color.m3665toStringimpl(this.separatorColor) + ", checkmarkColor=" + Color.m3665toStringimpl(this.checkmarkColor) + ")";
    }

    private EmbeddedCheckmarkColors(long j, long j2) {
        this.separatorColor = j;
        this.checkmarkColor = j2;
    }

    /* renamed from: getSeparatorColor-0d7_KjU, reason: not valid java name */
    public final long m8682getSeparatorColor0d7_KjU() {
        return this.separatorColor;
    }

    /* renamed from: getCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m8681getCheckmarkColor0d7_KjU() {
        return this.checkmarkColor;
    }
}
