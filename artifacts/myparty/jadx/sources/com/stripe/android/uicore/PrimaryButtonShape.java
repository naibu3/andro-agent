package com.stripe.android.uicore;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/uicore/PrimaryButtonShape;", "", "cornerRadius", "", "borderStrokeWidth", "height", "<init>", "(FFF)V", "getCornerRadius", "()F", "getBorderStrokeWidth", "getHeight", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrimaryButtonShape {
    public static final int $stable = 0;
    private final float borderStrokeWidth;
    private final float cornerRadius;
    private final float height;

    public static /* synthetic */ PrimaryButtonShape copy$default(PrimaryButtonShape primaryButtonShape, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = primaryButtonShape.cornerRadius;
        }
        if ((i & 2) != 0) {
            f2 = primaryButtonShape.borderStrokeWidth;
        }
        if ((i & 4) != 0) {
            f3 = primaryButtonShape.height;
        }
        return primaryButtonShape.copy(f, f2, f3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component2, reason: from getter */
    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public final PrimaryButtonShape copy(float cornerRadius, float borderStrokeWidth, float height) {
        return new PrimaryButtonShape(cornerRadius, borderStrokeWidth, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryButtonShape)) {
            return false;
        }
        PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) other;
        return Float.compare(this.cornerRadius, primaryButtonShape.cornerRadius) == 0 && Float.compare(this.borderStrokeWidth, primaryButtonShape.borderStrokeWidth) == 0 && Float.compare(this.height, primaryButtonShape.height) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.cornerRadius) * 31) + Float.hashCode(this.borderStrokeWidth)) * 31) + Float.hashCode(this.height);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + this.cornerRadius + ", borderStrokeWidth=" + this.borderStrokeWidth + ", height=" + this.height + ")";
    }

    public PrimaryButtonShape(float f, float f2, float f3) {
        this.cornerRadius = f;
        this.borderStrokeWidth = f2;
        this.height = f3;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    public final float getHeight() {
        return this.height;
    }
}
