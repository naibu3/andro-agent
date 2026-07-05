package com.stripe.android.paymentsheet.ui;

import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PrimaryButtonTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;", "", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "borderStrokeWidth", "height", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerRadius-D9Ej5fM", "()F", "F", "getBorderStrokeWidth-D9Ej5fM", "getHeight-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "copy", "copy-2z7ARbQ", "(FFF)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrimaryButtonShape {
    public static final int $stable = 0;
    private final float borderStrokeWidth;
    private final float cornerRadius;
    private final float height;

    public /* synthetic */ PrimaryButtonShape(float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3);
    }

    /* renamed from: copy-2z7ARbQ$default, reason: not valid java name */
    public static /* synthetic */ PrimaryButtonShape m8517copy2z7ARbQ$default(PrimaryButtonShape primaryButtonShape, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = primaryButtonShape.cornerRadius;
        }
        if ((i & 2) != 0) {
            f2 = primaryButtonShape.borderStrokeWidth;
        }
        if ((i & 4) != 0) {
            f3 = primaryButtonShape.height;
        }
        return primaryButtonShape.m8521copy2z7ARbQ(f, f2, f3);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: copy-2z7ARbQ, reason: not valid java name */
    public final PrimaryButtonShape m8521copy2z7ARbQ(float cornerRadius, float borderStrokeWidth, float height) {
        return new PrimaryButtonShape(cornerRadius, borderStrokeWidth, height, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryButtonShape)) {
            return false;
        }
        PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) other;
        return Dp.m6122equalsimpl0(this.cornerRadius, primaryButtonShape.cornerRadius) && Dp.m6122equalsimpl0(this.borderStrokeWidth, primaryButtonShape.borderStrokeWidth) && Dp.m6122equalsimpl0(this.height, primaryButtonShape.height);
    }

    public int hashCode() {
        return (((Dp.m6123hashCodeimpl(this.cornerRadius) * 31) + Dp.m6123hashCodeimpl(this.borderStrokeWidth)) * 31) + Dp.m6123hashCodeimpl(this.height);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + Dp.m6128toStringimpl(this.cornerRadius) + ", borderStrokeWidth=" + Dp.m6128toStringimpl(this.borderStrokeWidth) + ", height=" + Dp.m6128toStringimpl(this.height) + ")";
    }

    private PrimaryButtonShape(float f, float f2, float f3) {
        this.cornerRadius = f;
        this.borderStrokeWidth = f2;
        this.height = f3;
    }

    public /* synthetic */ PrimaryButtonShape(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.INSTANCE.m6137getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.INSTANCE.m6137getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? Dp.INSTANCE.m6137getUnspecifiedD9Ej5fM() : f3, null);
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m8523getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* renamed from: getBorderStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m8522getBorderStrokeWidthD9Ej5fM() {
        return this.borderStrokeWidth;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m8524getHeightD9Ej5fM() {
        return this.height;
    }
}
