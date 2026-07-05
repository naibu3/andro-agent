package com.stripe.android.uicore;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/uicore/StripeShapes;", "", "cornerRadius", "", "bottomSheetCornerRadius", "borderStrokeWidth", "<init>", "(FFF)V", "getCornerRadius", "()F", "getBottomSheetCornerRadius", "getBorderStrokeWidth", "roundedCornerShape", "Landroidx/compose/ui/graphics/Shape;", "getRoundedCornerShape", "()Landroidx/compose/ui/graphics/Shape;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StripeShapes {
    public static final int $stable = 0;
    private final float borderStrokeWidth;
    private final float bottomSheetCornerRadius;
    private final float cornerRadius;

    public static /* synthetic */ StripeShapes copy$default(StripeShapes stripeShapes, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = stripeShapes.cornerRadius;
        }
        if ((i & 2) != 0) {
            f2 = stripeShapes.bottomSheetCornerRadius;
        }
        if ((i & 4) != 0) {
            f3 = stripeShapes.borderStrokeWidth;
        }
        return stripeShapes.copy(f, f2, f3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component2, reason: from getter */
    public final float getBottomSheetCornerRadius() {
        return this.bottomSheetCornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    public final StripeShapes copy(float cornerRadius, float bottomSheetCornerRadius, float borderStrokeWidth) {
        return new StripeShapes(cornerRadius, bottomSheetCornerRadius, borderStrokeWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeShapes)) {
            return false;
        }
        StripeShapes stripeShapes = (StripeShapes) other;
        return Float.compare(this.cornerRadius, stripeShapes.cornerRadius) == 0 && Float.compare(this.bottomSheetCornerRadius, stripeShapes.bottomSheetCornerRadius) == 0 && Float.compare(this.borderStrokeWidth, stripeShapes.borderStrokeWidth) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.cornerRadius) * 31) + Float.hashCode(this.bottomSheetCornerRadius)) * 31) + Float.hashCode(this.borderStrokeWidth);
    }

    public String toString() {
        return "StripeShapes(cornerRadius=" + this.cornerRadius + ", bottomSheetCornerRadius=" + this.bottomSheetCornerRadius + ", borderStrokeWidth=" + this.borderStrokeWidth + ")";
    }

    public StripeShapes(float f, float f2, float f3) {
        this.cornerRadius = f;
        this.bottomSheetCornerRadius = f2;
        this.borderStrokeWidth = f3;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getBottomSheetCornerRadius() {
        return this.bottomSheetCornerRadius;
    }

    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    public final Shape getRoundedCornerShape() {
        return RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(this.cornerRadius));
    }
}
