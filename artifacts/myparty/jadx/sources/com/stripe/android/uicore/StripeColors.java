package com.stripe.android.uicore;

import androidx.compose.material.Colors;
import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0010J\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u0010J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u0010J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u0010J\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u0010J\u0010\u0010'\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010\u0010J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010\u0010J\t\u0010+\u001a\u00020\fHÆ\u0003Jj\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\t\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\n\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00066"}, d2 = {"Lcom/stripe/android/uicore/StripeColors;", "", "component", "Landroidx/compose/ui/graphics/Color;", PaymentSheetAppearanceKeys.COMPONENT_BORDER, PaymentSheetAppearanceKeys.COMPONENT_DIVIDER, "onComponent", "subtitle", "textCursor", PaymentSheetAppearanceKeys.PLACEHOLDER_TEXT, "appBarIcon", "materialColors", "Landroidx/compose/material/Colors;", "<init>", "(JJJJJJJJLandroidx/compose/material/Colors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getComponent-0d7_KjU", "()J", "J", "getComponentBorder-0d7_KjU", "getComponentDivider-0d7_KjU", "getOnComponent-0d7_KjU", "getSubtitle-0d7_KjU", "getTextCursor-0d7_KjU", "getPlaceholderText-0d7_KjU", "getAppBarIcon-0d7_KjU", "getMaterialColors", "()Landroidx/compose/material/Colors;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component6-0d7_KjU", "component7", "component7-0d7_KjU", "component8", "component8-0d7_KjU", "component9", "copy", "copy-KvvhxLA", "(JJJJJJJJLandroidx/compose/material/Colors;)Lcom/stripe/android/uicore/StripeColors;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StripeColors {
    public static final int $stable = 0;
    private final long appBarIcon;
    private final long component;
    private final long componentBorder;
    private final long componentDivider;
    private final Colors materialColors;
    private final long onComponent;
    private final long placeholderText;
    private final long subtitle;
    private final long textCursor;

    public /* synthetic */ StripeColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Colors colors, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, colors);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getComponent() {
        return this.component;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getComponentBorder() {
        return this.componentBorder;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getComponentDivider() {
        return this.componentDivider;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnComponent() {
        return this.onComponent;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextCursor() {
        return this.textCursor;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getPlaceholderText() {
        return this.placeholderText;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getAppBarIcon() {
        return this.appBarIcon;
    }

    /* renamed from: component9, reason: from getter */
    public final Colors getMaterialColors() {
        return this.materialColors;
    }

    /* renamed from: copy-KvvhxLA, reason: not valid java name */
    public final StripeColors m8723copyKvvhxLA(long component, long componentBorder, long componentDivider, long onComponent, long subtitle, long textCursor, long placeholderText, long appBarIcon, Colors materialColors) {
        Intrinsics.checkNotNullParameter(materialColors, "materialColors");
        return new StripeColors(component, componentBorder, componentDivider, onComponent, subtitle, textCursor, placeholderText, appBarIcon, materialColors, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeColors)) {
            return false;
        }
        StripeColors stripeColors = (StripeColors) other;
        return Color.m3658equalsimpl0(this.component, stripeColors.component) && Color.m3658equalsimpl0(this.componentBorder, stripeColors.componentBorder) && Color.m3658equalsimpl0(this.componentDivider, stripeColors.componentDivider) && Color.m3658equalsimpl0(this.onComponent, stripeColors.onComponent) && Color.m3658equalsimpl0(this.subtitle, stripeColors.subtitle) && Color.m3658equalsimpl0(this.textCursor, stripeColors.textCursor) && Color.m3658equalsimpl0(this.placeholderText, stripeColors.placeholderText) && Color.m3658equalsimpl0(this.appBarIcon, stripeColors.appBarIcon) && Intrinsics.areEqual(this.materialColors, stripeColors.materialColors);
    }

    public int hashCode() {
        return (((((((((((((((Color.m3664hashCodeimpl(this.component) * 31) + Color.m3664hashCodeimpl(this.componentBorder)) * 31) + Color.m3664hashCodeimpl(this.componentDivider)) * 31) + Color.m3664hashCodeimpl(this.onComponent)) * 31) + Color.m3664hashCodeimpl(this.subtitle)) * 31) + Color.m3664hashCodeimpl(this.textCursor)) * 31) + Color.m3664hashCodeimpl(this.placeholderText)) * 31) + Color.m3664hashCodeimpl(this.appBarIcon)) * 31) + this.materialColors.hashCode();
    }

    public String toString() {
        return "StripeColors(component=" + Color.m3665toStringimpl(this.component) + ", componentBorder=" + Color.m3665toStringimpl(this.componentBorder) + ", componentDivider=" + Color.m3665toStringimpl(this.componentDivider) + ", onComponent=" + Color.m3665toStringimpl(this.onComponent) + ", subtitle=" + Color.m3665toStringimpl(this.subtitle) + ", textCursor=" + Color.m3665toStringimpl(this.textCursor) + ", placeholderText=" + Color.m3665toStringimpl(this.placeholderText) + ", appBarIcon=" + Color.m3665toStringimpl(this.appBarIcon) + ", materialColors=" + this.materialColors + ")";
    }

    private StripeColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Colors materialColors) {
        Intrinsics.checkNotNullParameter(materialColors, "materialColors");
        this.component = j;
        this.componentBorder = j2;
        this.componentDivider = j3;
        this.onComponent = j4;
        this.subtitle = j5;
        this.textCursor = j6;
        this.placeholderText = j7;
        this.appBarIcon = j8;
        this.materialColors = materialColors;
    }

    /* renamed from: getComponent-0d7_KjU, reason: not valid java name */
    public final long m8725getComponent0d7_KjU() {
        return this.component;
    }

    /* renamed from: getComponentBorder-0d7_KjU, reason: not valid java name */
    public final long m8726getComponentBorder0d7_KjU() {
        return this.componentBorder;
    }

    /* renamed from: getComponentDivider-0d7_KjU, reason: not valid java name */
    public final long m8727getComponentDivider0d7_KjU() {
        return this.componentDivider;
    }

    /* renamed from: getOnComponent-0d7_KjU, reason: not valid java name */
    public final long m8728getOnComponent0d7_KjU() {
        return this.onComponent;
    }

    /* renamed from: getSubtitle-0d7_KjU, reason: not valid java name */
    public final long m8730getSubtitle0d7_KjU() {
        return this.subtitle;
    }

    /* renamed from: getTextCursor-0d7_KjU, reason: not valid java name */
    public final long m8731getTextCursor0d7_KjU() {
        return this.textCursor;
    }

    /* renamed from: getPlaceholderText-0d7_KjU, reason: not valid java name */
    public final long m8729getPlaceholderText0d7_KjU() {
        return this.placeholderText;
    }

    /* renamed from: getAppBarIcon-0d7_KjU, reason: not valid java name */
    public final long m8724getAppBarIcon0d7_KjU() {
        return this.appBarIcon;
    }

    public final Colors getMaterialColors() {
        return this.materialColors;
    }
}
