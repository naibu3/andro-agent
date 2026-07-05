package com.stripe.android.uicore.elements.bottomsheet;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeBottomSheetLayoutInfo.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "scrimColor", "<init>", "(Landroidx/compose/ui/graphics/Shape;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSheetShape", "()Landroidx/compose/ui/graphics/Shape;", "getSheetBackgroundColor-0d7_KjU", "()J", "J", "getScrimColor-0d7_KjU", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-WkMS-hQ", "(Landroidx/compose/ui/graphics/Shape;JJ)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StripeBottomSheetLayoutInfo {
    public static final int $stable = 0;
    private final long scrimColor;
    private final long sheetBackgroundColor;
    private final Shape sheetShape;

    public /* synthetic */ StripeBottomSheetLayoutInfo(Shape shape, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, j, j2);
    }

    /* renamed from: copy-WkMS-hQ$default, reason: not valid java name */
    public static /* synthetic */ StripeBottomSheetLayoutInfo m8851copyWkMShQ$default(StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo, Shape shape, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = stripeBottomSheetLayoutInfo.sheetShape;
        }
        if ((i & 2) != 0) {
            j = stripeBottomSheetLayoutInfo.sheetBackgroundColor;
        }
        if ((i & 4) != 0) {
            j2 = stripeBottomSheetLayoutInfo.scrimColor;
        }
        return stripeBottomSheetLayoutInfo.m8854copyWkMShQ(shape, j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final Shape getSheetShape() {
        return this.sheetShape;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getSheetBackgroundColor() {
        return this.sheetBackgroundColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrimColor() {
        return this.scrimColor;
    }

    /* renamed from: copy-WkMS-hQ, reason: not valid java name */
    public final StripeBottomSheetLayoutInfo m8854copyWkMShQ(Shape sheetShape, long sheetBackgroundColor, long scrimColor) {
        Intrinsics.checkNotNullParameter(sheetShape, "sheetShape");
        return new StripeBottomSheetLayoutInfo(sheetShape, sheetBackgroundColor, scrimColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeBottomSheetLayoutInfo)) {
            return false;
        }
        StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo = (StripeBottomSheetLayoutInfo) other;
        return Intrinsics.areEqual(this.sheetShape, stripeBottomSheetLayoutInfo.sheetShape) && Color.m3658equalsimpl0(this.sheetBackgroundColor, stripeBottomSheetLayoutInfo.sheetBackgroundColor) && Color.m3658equalsimpl0(this.scrimColor, stripeBottomSheetLayoutInfo.scrimColor);
    }

    public int hashCode() {
        return (((this.sheetShape.hashCode() * 31) + Color.m3664hashCodeimpl(this.sheetBackgroundColor)) * 31) + Color.m3664hashCodeimpl(this.scrimColor);
    }

    public String toString() {
        return "StripeBottomSheetLayoutInfo(sheetShape=" + this.sheetShape + ", sheetBackgroundColor=" + Color.m3665toStringimpl(this.sheetBackgroundColor) + ", scrimColor=" + Color.m3665toStringimpl(this.scrimColor) + ")";
    }

    private StripeBottomSheetLayoutInfo(Shape sheetShape, long j, long j2) {
        Intrinsics.checkNotNullParameter(sheetShape, "sheetShape");
        this.sheetShape = sheetShape;
        this.sheetBackgroundColor = j;
        this.scrimColor = j2;
    }

    public final Shape getSheetShape() {
        return this.sheetShape;
    }

    /* renamed from: getSheetBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m8856getSheetBackgroundColor0d7_KjU() {
        return this.sheetBackgroundColor;
    }

    /* renamed from: getScrimColor-0d7_KjU, reason: not valid java name */
    public final long m8855getScrimColor0d7_KjU() {
        return this.scrimColor;
    }
}
