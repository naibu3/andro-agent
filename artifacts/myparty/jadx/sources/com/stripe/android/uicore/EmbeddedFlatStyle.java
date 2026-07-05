package com.stripe.android.uicore;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/uicore/EmbeddedFlatStyle;", "", PaymentSheetAppearanceKeys.SEPARATOR_THICKNESS, "", PaymentSheetAppearanceKeys.SEPARATOR_INSETS, PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, "", PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, "<init>", "(FFZZ)V", "getSeparatorThickness", "()F", "getSeparatorInsets", "getTopSeparatorEnabled", "()Z", "getBottomSeparatorEnabled", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EmbeddedFlatStyle {
    public static final int $stable = 0;
    private final boolean bottomSeparatorEnabled;
    private final float separatorInsets;
    private final float separatorThickness;
    private final boolean topSeparatorEnabled;

    public static /* synthetic */ EmbeddedFlatStyle copy$default(EmbeddedFlatStyle embeddedFlatStyle, float f, float f2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = embeddedFlatStyle.separatorThickness;
        }
        if ((i & 2) != 0) {
            f2 = embeddedFlatStyle.separatorInsets;
        }
        if ((i & 4) != 0) {
            z = embeddedFlatStyle.topSeparatorEnabled;
        }
        if ((i & 8) != 0) {
            z2 = embeddedFlatStyle.bottomSeparatorEnabled;
        }
        return embeddedFlatStyle.copy(f, f2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSeparatorThickness() {
        return this.separatorThickness;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSeparatorInsets() {
        return this.separatorInsets;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getTopSeparatorEnabled() {
        return this.topSeparatorEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBottomSeparatorEnabled() {
        return this.bottomSeparatorEnabled;
    }

    public final EmbeddedFlatStyle copy(float separatorThickness, float separatorInsets, boolean topSeparatorEnabled, boolean bottomSeparatorEnabled) {
        return new EmbeddedFlatStyle(separatorThickness, separatorInsets, topSeparatorEnabled, bottomSeparatorEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedFlatStyle)) {
            return false;
        }
        EmbeddedFlatStyle embeddedFlatStyle = (EmbeddedFlatStyle) other;
        return Float.compare(this.separatorThickness, embeddedFlatStyle.separatorThickness) == 0 && Float.compare(this.separatorInsets, embeddedFlatStyle.separatorInsets) == 0 && this.topSeparatorEnabled == embeddedFlatStyle.topSeparatorEnabled && this.bottomSeparatorEnabled == embeddedFlatStyle.bottomSeparatorEnabled;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.separatorThickness) * 31) + Float.hashCode(this.separatorInsets)) * 31) + Boolean.hashCode(this.topSeparatorEnabled)) * 31) + Boolean.hashCode(this.bottomSeparatorEnabled);
    }

    public String toString() {
        return "EmbeddedFlatStyle(separatorThickness=" + this.separatorThickness + ", separatorInsets=" + this.separatorInsets + ", topSeparatorEnabled=" + this.topSeparatorEnabled + ", bottomSeparatorEnabled=" + this.bottomSeparatorEnabled + ")";
    }

    public EmbeddedFlatStyle(float f, float f2, boolean z, boolean z2) {
        this.separatorThickness = f;
        this.separatorInsets = f2;
        this.topSeparatorEnabled = z;
        this.bottomSeparatorEnabled = z2;
    }

    public final float getSeparatorThickness() {
        return this.separatorThickness;
    }

    public final float getSeparatorInsets() {
        return this.separatorInsets;
    }

    public final boolean getTopSeparatorEnabled() {
        return this.topSeparatorEnabled;
    }

    public final boolean getBottomSeparatorEnabled() {
        return this.bottomSeparatorEnabled;
    }
}
